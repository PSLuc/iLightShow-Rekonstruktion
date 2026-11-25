package okhttp3.internal.http2;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import J4.b;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0734l;
import h5.M;
import h5.P;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Reader implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final InterfaceC0734l source;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i3, int i6) throws IOException {
            if ((i3 & 8) != 0) {
                i--;
            }
            if (i6 <= i) {
                return i - i6;
            }
            throw new IOException(AbstractC0013g0.g("PROTOCOL_ERROR padding ", i6, i, " > remaining length "));
        }

        private Companion() {
        }
    }

    public static final class ContinuationSource implements M {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final InterfaceC0734l source;
        private int streamId;

        public ContinuationSource(InterfaceC0734l interfaceC0734l) {
            k.f("source", interfaceC0734l);
            this.source = interfaceC0734l;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.W(), 255);
            this.flags = Util.and(this.source.W(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int iP = this.source.p() & Integer.MAX_VALUE;
            this.streamId = iP;
            if (iAnd == 9) {
                if (iP != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            k.f("sink", c0732j);
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long j6 = this.source.read(c0732j, Math.min(j4, i));
                    if (j6 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j6;
                    return j6;
                }
                this.source.l(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // h5.M
        public P timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, C0735m c0735m, String str2, int i3, long j4);

        void data(boolean z5, int i, InterfaceC0734l interfaceC0734l, int i3);

        void goAway(int i, ErrorCode errorCode, C0735m c0735m);

        void headers(boolean z5, int i, int i3, List<Header> list);

        void ping(boolean z5, int i, int i3);

        void priority(int i, int i3, int i6, boolean z5);

        void pushPromise(int i, int i3, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z5, Settings settings);

        void windowUpdate(int i, long j4);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        k.e("getLogger(Http2::class.java.name)", logger2);
        logger = logger2;
    }

    public Http2Reader(InterfaceC0734l interfaceC0734l, boolean z5) {
        k.f("source", interfaceC0734l);
        this.source = interfaceC0734l;
        this.client = z5;
        ContinuationSource continuationSource = new ContinuationSource(interfaceC0734l);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i, int i3, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z5 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.W(), 255) : 0;
        handler.data(z5, i6, this.source, Companion.lengthWithoutPadding(i, i3, iAnd));
        this.source.l(iAnd);
    }

    private final void readGoAway(Handler handler, int i, int i3, int i6) throws IOException {
        if (i < 8) {
            throw new IOException(k.l("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        }
        if (i6 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iP = this.source.p();
        int iP2 = this.source.p();
        int i7 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(iP2);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(k.l("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(iP2)));
        }
        C0735m c0735mJ = C0735m.f9352k;
        if (i7 > 0) {
            c0735mJ = this.source.j(i7);
        }
        handler.goAway(iP, errorCodeFromHttp2, c0735mJ);
    }

    private final List<Header> readHeaderBlock(int i, int i3, int i6, int i7) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i3);
        this.continuation.setFlags(i6);
        this.continuation.setStreamId(i7);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i, int i3, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z5 = (i3 & 1) != 0;
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.W(), 255) : 0;
        if ((i3 & 32) != 0) {
            readPriority(handler, i6);
            i -= 5;
        }
        handler.headers(z5, i6, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i3, iAnd), iAnd, i3, i6));
    }

    private final void readPing(Handler handler, int i, int i3, int i6) throws IOException {
        if (i != 8) {
            throw new IOException(k.l("TYPE_PING length != 8: ", Integer.valueOf(i)));
        }
        if (i6 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i3 & 1) != 0, this.source.p(), this.source.p());
    }

    private final void readPriority(Handler handler, int i, int i3, int i6) throws IOException {
        if (i != 5) {
            throw new IOException(AbstractC0013g0.f(i, "TYPE_PRIORITY length: ", " != 5"));
        }
        if (i6 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, i6);
    }

    private final void readPushPromise(Handler handler, int i, int i3, int i6) throws IOException {
        if (i6 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.W(), 255) : 0;
        handler.pushPromise(i6, this.source.p() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i3, iAnd), iAnd, i3, i6));
    }

    private final void readRstStream(Handler handler, int i, int i3, int i6) throws IOException {
        if (i != 4) {
            throw new IOException(AbstractC0013g0.f(i, "TYPE_RST_STREAM length: ", " != 4"));
        }
        if (i6 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iP = this.source.p();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(iP);
        if (errorCodeFromHttp2 == null) {
            throw new IOException(k.l("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(iP)));
        }
        handler.rstStream(i6, errorCodeFromHttp2);
    }

    private final void readSettings(Handler handler, int i, int i3, int i6) throws IOException {
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(k.l("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
        Settings settings = new Settings();
        b bVarC0 = c.C0(c.D0(0, i), 6);
        int i7 = bVarC0.f1941h;
        int i8 = bVarC0.i;
        int i9 = bVarC0.f1942j;
        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
            while (true) {
                int i10 = i7 + i9;
                int iAnd = Util.and(this.source.I(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int iP = this.source.p();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (iP < 16384 || iP > 16777215)) {
                            throw new IOException(k.l("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(iP)));
                        }
                    } else {
                        if (iP < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (iP != 0 && iP != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, iP);
                if (i7 != i8) {
                    i7 = i10;
                }
            }
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i, int i3, int i6) throws IOException {
        if (i != 4) {
            throw new IOException(k.l("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
        }
        long jAnd = Util.and(this.source.p(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i6, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z5, Handler handler) throws IOException {
        k.f("handler", handler);
        try {
            this.source.N(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(k.l("FRAME_SIZE_ERROR: ", Integer.valueOf(medium)));
            }
            int iAnd = Util.and(this.source.W(), 255);
            int iAnd2 = Util.and(this.source.W(), 255);
            int iP = this.source.p() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, iP, medium, iAnd, iAnd2));
            }
            if (z5 && iAnd != 4) {
                throw new IOException(k.l("Expected a SETTINGS frame but was ", Http2.INSTANCE.formattedType$okhttp(iAnd)));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, iP);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, iP);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, iP);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, iP);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, iP);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, iP);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, iP);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, iP);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, iP);
                    return true;
                default:
                    this.source.l(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        k.f("handler", handler);
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC0734l interfaceC0734l = this.source;
        C0735m c0735m = Http2.CONNECTION_PREFACE;
        C0735m c0735mJ = interfaceC0734l.j(c0735m.d());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format(k.l("<< CONNECTION ", c0735mJ.e()), new Object[0]));
        }
        if (!c0735m.equals(c0735mJ)) {
            throw new IOException(k.l("Expected a connection header but was ", c0735mJ.q()));
        }
    }

    private final void readPriority(Handler handler, int i) {
        int iP = this.source.p();
        handler.priority(i, iP & Integer.MAX_VALUE, Util.and(this.source.W(), 255) + 1, (Integer.MIN_VALUE & iP) != 0);
    }
}
