package okhttp3.internal.ws;

import E4.k;
import h5.C0730h;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0734l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketReader implements Closeable, AutoCloseable {
    private boolean closed;
    private final C0732j controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C0730h maskCursor;
    private final byte[] maskKey;
    private final C0732j messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final InterfaceC0734l source;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(C0735m c0735m);

        void onReadMessage(String str);

        void onReadPing(C0735m c0735m);

        void onReadPong(C0735m c0735m);
    }

    public WebSocketReader(boolean z5, InterfaceC0734l interfaceC0734l, FrameCallback frameCallback, boolean z6, boolean z7) {
        k.f("source", interfaceC0734l);
        k.f("frameCallback", frameCallback);
        this.isClient = z5;
        this.source = interfaceC0734l;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z6;
        this.noContextTakeover = z7;
        this.controlFrameBuffer = new C0732j();
        this.messageFrameBuffer = new C0732j();
        this.maskKey = z5 ? null : new byte[4];
        this.maskCursor = z5 ? null : new C0730h();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        short sI;
        String strM;
        long j4 = this.frameLength;
        if (j4 > 0) {
            this.source.y(this.controlFrameBuffer, j4);
            if (!this.isClient) {
                C0732j c0732j = this.controlFrameBuffer;
                C0730h c0730h = this.maskCursor;
                k.c(c0730h);
                c0732j.D(c0730h);
                this.maskCursor.c(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                C0730h c0730h2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                k.c(bArr);
                webSocketProtocol.toggleMask(c0730h2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                C0732j c0732j2 = this.controlFrameBuffer;
                long j6 = c0732j2.i;
                if (j6 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j6 != 0) {
                    sI = c0732j2.I();
                    strM = this.controlFrameBuffer.M();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(sI);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    sI = 1005;
                    strM = "";
                }
                this.frameCallback.onReadClose(sI, strM);
                this.closed = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                C0732j c0732j3 = this.controlFrameBuffer;
                frameCallback.onReadPing(c0732j3.j(c0732j3.i));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                C0732j c0732j4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(c0732j4.j(c0732j4.i));
                return;
            default:
                throw new ProtocolException(k.l("Unknown control opcode: ", Util.toHexString(this.opcode)));
        }
    }

    private final void readHeader() throws IOException {
        boolean z5;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.W(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i = iAnd & 15;
            this.opcode = i;
            boolean z6 = (iAnd & 128) != 0;
            this.isFinalFrame = z6;
            boolean z7 = (iAnd & 8) != 0;
            this.isControlFrame = z7;
            if (z7 && !z6) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z8 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z8) {
                    z5 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z5 = true;
                }
                this.readingCompressedMessage = z5;
            } else if (z8) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.W(), 255);
            boolean z9 = (iAnd2 & 128) != 0;
            if (z9 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j4 = iAnd2 & 127;
            this.frameLength = j4;
            if (j4 == 126) {
                this.frameLength = Util.and(this.source.I(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j4 == 127) {
                long jU = this.source.u();
                this.frameLength = jU;
                if (jU < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z9) {
                InterfaceC0734l interfaceC0734l = this.source;
                byte[] bArr = this.maskKey;
                k.c(bArr);
                interfaceC0734l.g(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j4 = this.frameLength;
            if (j4 > 0) {
                this.source.y(this.messageFrameBuffer, j4);
                if (!this.isClient) {
                    C0732j c0732j = this.messageFrameBuffer;
                    C0730h c0730h = this.maskCursor;
                    k.c(c0730h);
                    c0732j.D(c0730h);
                    this.maskCursor.c(this.messageFrameBuffer.i - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    C0730h c0730h2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    k.c(bArr);
                    webSocketProtocol.toggleMask(c0730h2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException(k.l("Expected continuation opcode. Got: ", Util.toHexString(this.opcode)));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException(k.l("Unknown opcode: ", Util.toHexString(i)));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.M());
            return;
        }
        FrameCallback frameCallback = this.frameCallback;
        C0732j c0732j = this.messageFrameBuffer;
        frameCallback.onReadMessage(c0732j.j(c0732j.i));
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater == null) {
            return;
        }
        messageInflater.close();
    }

    public final InterfaceC0734l getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
