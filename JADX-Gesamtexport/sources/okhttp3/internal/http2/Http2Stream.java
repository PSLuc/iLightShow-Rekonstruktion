package okhttp3.internal.http2;

import E4.g;
import E4.k;
import h5.C0728f;
import h5.C0732j;
import h5.InterfaceC0734l;
import h5.K;
import h5.M;
import h5.P;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class FramingSource implements M {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final C0732j readBuffer;
        private final C0732j receiveBuffer;
        final /* synthetic */ Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j4, boolean z5) {
            k.f("this$0", http2Stream);
            this.this$0 = http2Stream;
            this.maxByteCount = j4;
            this.finished = z5;
            this.receiveBuffer = new C0732j();
            this.readBuffer = new C0732j();
        }

        private final void updateConnectionFlowControl(long j4) {
            Http2Stream http2Stream = this.this$0;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.this$0.getConnection().updateConnectionFlowControl$okhttp(j4);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j4;
            Http2Stream http2Stream = this.this$0;
            synchronized (http2Stream) {
                setClosed$okhttp(true);
                j4 = getReadBuffer().i;
                getReadBuffer().b();
                http2Stream.notifyAll();
            }
            if (j4 > 0) {
                updateConnectionFlowControl(j4);
            }
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final C0732j getReadBuffer() {
            return this.readBuffer;
        }

        public final C0732j getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            IOException errorException$okhttp;
            boolean z5;
            long j6;
            k.f("sink", c0732j);
            long j7 = 0;
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
            while (true) {
                Http2Stream http2Stream = this.this$0;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout$okhttp().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || getFinished$okhttp()) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = http2Stream.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                k.c(errorCode$okhttp);
                                errorException$okhttp = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (getClosed$okhttp()) {
                            throw new IOException("stream closed");
                        }
                        z5 = false;
                        if (getReadBuffer().i > j7) {
                            j6 = getReadBuffer().read(c0732j, Math.min(j4, getReadBuffer().i));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j6);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException$okhttp == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!getFinished$okhttp() && errorException$okhttp == null) {
                                http2Stream.waitForIo$okhttp();
                                z5 = true;
                            }
                            j6 = -1;
                        }
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    } catch (Throwable th) {
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                if (!z5) {
                    if (j6 != -1) {
                        updateConnectionFlowControl(j6);
                        return j6;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j7 = 0;
            }
        }

        public final void receive$okhttp(InterfaceC0734l interfaceC0734l, long j4) throws EOFException {
            boolean finished$okhttp;
            boolean z5;
            long j6;
            k.f("source", interfaceC0734l);
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            while (j4 > 0) {
                synchronized (this.this$0) {
                    finished$okhttp = getFinished$okhttp();
                    z5 = getReadBuffer().i + j4 > this.maxByteCount;
                }
                if (z5) {
                    interfaceC0734l.l(j4);
                    this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (finished$okhttp) {
                    interfaceC0734l.l(j4);
                    return;
                }
                long j7 = interfaceC0734l.read(this.receiveBuffer, j4);
                if (j7 == -1) {
                    throw new EOFException();
                }
                j4 -= j7;
                Http2Stream http2Stream2 = this.this$0;
                synchronized (http2Stream2) {
                    try {
                        if (getClosed$okhttp()) {
                            j6 = getReceiveBuffer().i;
                            getReceiveBuffer().b();
                        } else {
                            boolean z6 = getReadBuffer().i == 0;
                            getReadBuffer().r(getReceiveBuffer());
                            if (z6) {
                                http2Stream2.notifyAll();
                            }
                            j6 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (j6 > 0) {
                    updateConnectionFlowControl(j6);
                }
            }
        }

        public final void setClosed$okhttp(boolean z5) {
            this.closed = z5;
        }

        public final void setFinished$okhttp(boolean z5) {
            this.finished = z5;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // h5.M
        public P timeout() {
            return this.this$0.getReadTimeout$okhttp();
        }
    }

    public final class StreamTimeout extends C0728f {
        final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
            k.f("this$0", http2Stream);
            this.this$0 = http2Stream;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // h5.C0728f
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // h5.C0728f
        public void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z5, boolean z6, Headers headers) {
        k.f("connection", http2Connection);
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(this, http2Connection.getOkHttpSettings().getInitialWindowSize(), z6);
        this.sink = new FramingSink(this, z5);
        this.readTimeout = new StreamTimeout(this);
        this.writeTimeout = new StreamTimeout(this);
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            if (getSource$okhttp().getFinished$okhttp() && getSink$okhttp().getFinished()) {
                return false;
            }
            setErrorCode$okhttp(errorCode);
            setErrorException$okhttp(iOException);
            notifyAll();
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j4) {
        this.writeBytesMaximum += j4;
        if (j4 > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z5;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z5 = !getSource$okhttp().getFinished$okhttp() && getSource$okhttp().getClosed$okhttp() && (getSink$okhttp().getFinished() || getSink$okhttp().getClosed());
                zIsOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            k.c(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(ErrorCode errorCode, IOException iOException) {
        k.f("rstStatusCode", errorCode);
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        k.f("errorCode", errorCode);
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        k.f("trailers", headers);
        synchronized (this) {
            if (getSink$okhttp().getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (headers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            getSink$okhttp().setTrailers(headers);
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final K getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final M getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) {
                if ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final P readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(InterfaceC0734l interfaceC0734l, int i) {
        k.f("source", interfaceC0734l);
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(interfaceC0734l, i);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final void receiveHeaders(Headers headers, boolean z5) {
        boolean zIsOpen;
        k.f("headers", headers);
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && z5) {
                    getSource$okhttp().setTrailers(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (z5) {
                    getSource$okhttp().setFinished$okhttp(true);
                }
                zIsOpen = isOpen();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        k.f("errorCode", errorCode);
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j4) {
        this.readBytesAcknowledged = j4;
    }

    public final void setReadBytesTotal$okhttp(long j4) {
        this.readBytesTotal = j4;
    }

    public final void setWriteBytesMaximum$okhttp(long j4) {
        this.writeBytesMaximum = j4;
    }

    public final void setWriteBytesTotal$okhttp(long j4) {
        this.writeBytesTotal = j4;
    }

    public final synchronized Headers takeHeaders() {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            k.c(errorCode);
            throw new StreamResetException(errorCode);
        }
        headersRemoveFirst = this.headersQueue.removeFirst();
        k.e("headersQueue.removeFirst()", headersRemoveFirst);
        return headersRemoveFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().z() || !this.source.getReadBuffer().z()) {
            if (this.errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            k.c(errorCode);
            throw new StreamResetException(errorCode);
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z5, boolean z6) {
        boolean z7;
        k.f("responseHeaders", list);
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z5) {
                getSink$okhttp().setFinished(true);
            }
        }
        if (!z6) {
            synchronized (this.connection) {
                z7 = getConnection().getWriteBytesTotal() >= getConnection().getWriteBytesMaximum();
            }
            z6 = z7;
        }
        this.connection.writeHeaders$okhttp(this.id, z5, list);
        if (z6) {
            this.connection.flush();
        }
    }

    public final P writeTimeout() {
        return this.writeTimeout;
    }

    public final class FramingSink implements K {
        private boolean closed;
        private boolean finished;
        private final C0732j sendBuffer;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z5) {
            k.f("this$0", http2Stream);
            Http2Stream.this = http2Stream;
            this.finished = z5;
            this.sendBuffer = new C0732j();
        }

        private final void emitFrame(boolean z5) throws IOException {
            long jMin;
            boolean z6;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !getFinished() && !getClosed() && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.i);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z6 = z5 && jMin == this.sendBuffer.i;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z6, this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (getClosed()) {
                    return;
                }
                boolean z5 = http2Stream2.getErrorCode$okhttp() == null;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z6 = this.sendBuffer.i > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.i > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        k.c(headers);
                        connection.writeHeaders$okhttp(id, z5, Util.toHeaderList(headers));
                    } else if (z6) {
                        while (this.sendBuffer.i > 0) {
                            emitFrame(true);
                        }
                    } else if (z5) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    setClosed(true);
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // h5.K, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.i > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z5) {
            this.closed = z5;
        }

        public final void setFinished(boolean z5) {
            this.finished = z5;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // h5.K
        public P timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // h5.K
        public void write(C0732j c0732j, long j4) throws IOException {
            k.f("source", c0732j);
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(c0732j, j4);
                while (this.sendBuffer.i >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + http2Stream);
            }
        }

        public /* synthetic */ FramingSink(boolean z5, int i, g gVar) {
            this(Http2Stream.this, (i & 1) != 0 ? false : z5);
        }
    }
}
