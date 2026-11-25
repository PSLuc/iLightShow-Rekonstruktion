package okhttp3.internal.http2;

import E4.g;
import E4.k;
import h5.C0732j;
import h5.InterfaceC0733k;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Writer implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C0732j hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final InterfaceC0733k sink;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(InterfaceC0733k interfaceC0733k, boolean z5) {
        k.f("sink", interfaceC0733k);
        this.sink = interfaceC0733k;
        this.client = z5;
        C0732j c0732j = new C0732j();
        this.hpackBuffer = c0732j;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, c0732j, 3, null);
    }

    private final void writeContinuationFrames(int i, long j4) {
        while (j4 > 0) {
            long jMin = Math.min(this.maxFrameSize, j4);
            j4 -= jMin;
            frameHeader(i, (int) jMin, 9, j4 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        try {
            k.f("peerSettings", settings);
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(k.l(">> CONNECTION ", Http2.CONNECTION_PREFACE.e()), new Object[0]));
                }
                this.sink.t(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z5, int i, C0732j c0732j, int i3) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i, z5 ? 1 : 0, c0732j, i3);
    }

    public final void dataFrame(int i, int i3, C0732j c0732j, int i6) {
        frameHeader(i, i6, 0, i3);
        if (i6 > 0) {
            InterfaceC0733k interfaceC0733k = this.sink;
            k.c(c0732j);
            interfaceC0733k.write(c0732j, i6);
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i, int i3, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i8 = i;
            i9 = i3;
            i10 = i6;
            i11 = i7;
            logger2.fine(Http2.INSTANCE.frameLog(false, i8, i9, i10, i11));
        } else {
            i8 = i;
            i9 = i3;
            i10 = i6;
            i11 = i7;
        }
        if (i9 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i9).toString());
        }
        if ((Integer.MIN_VALUE & i8) != 0) {
            throw new IllegalArgumentException(k.l("reserved bit set: ", Integer.valueOf(i8)).toString());
        }
        Util.writeMedium(this.sink, i9);
        this.sink.A(i10 & 255);
        this.sink.A(i11 & 255);
        this.sink.q(Integer.MAX_VALUE & i8);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        k.f("errorCode", errorCode);
        k.f("debugData", bArr);
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        frameHeader(0, bArr.length + 8, 7, 0);
        this.sink.q(i);
        this.sink.q(errorCode.getHttpCode());
        if (bArr.length != 0) {
            this.sink.B(bArr);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z5, int i, List<Header> list) {
        k.f("headerBlock", list);
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j4 = this.hpackBuffer.i;
        long jMin = Math.min(this.maxFrameSize, j4);
        int i3 = j4 == jMin ? 4 : 0;
        if (z5) {
            i3 |= 1;
        }
        frameHeader(i, (int) jMin, 1, i3);
        this.sink.write(this.hpackBuffer, jMin);
        if (j4 > jMin) {
            writeContinuationFrames(i, j4 - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z5, int i, int i3) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z5 ? 1 : 0);
        this.sink.q(i);
        this.sink.q(i3);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i, int i3, List<Header> list) {
        k.f("requestHeaders", list);
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long j4 = this.hpackBuffer.i;
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, j4);
        long j6 = iMin;
        frameHeader(i, iMin + 4, 5, j4 == j6 ? 4 : 0);
        this.sink.q(i3 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j6);
        if (j4 > j6) {
            writeContinuationFrames(i, j4 - j6);
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) {
        k.f("errorCode", errorCode);
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(i, 4, 3, 0);
        this.sink.q(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) {
        int i;
        try {
            k.f("settings", settings);
            if (this.closed) {
                throw new IOException("closed");
            }
            int i3 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i3 < 10) {
                int i6 = i3 + 1;
                if (settings.isSet(i3)) {
                    if (i3 != 4) {
                        i = i3 != 7 ? i3 : 4;
                    } else {
                        i = 3;
                    }
                    this.sink.n(i);
                    this.sink.q(settings.get(i3));
                }
                i3 = i6;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i, long j4) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(k.l("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j4)).toString());
        }
        frameHeader(i, 4, 8, 0);
        this.sink.q((int) j4);
        this.sink.flush();
    }
}
