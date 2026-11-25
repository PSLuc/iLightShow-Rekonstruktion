package okhttp3.internal.ws;

import E4.k;
import h5.C0730h;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0733k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable, AutoCloseable {
    private final boolean isClient;
    private final C0730h maskCursor;
    private final byte[] maskKey;
    private final C0732j messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC0733k sink;
    private final C0732j sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z5, InterfaceC0733k interfaceC0733k, Random random, boolean z6, boolean z7, long j4) {
        k.f("sink", interfaceC0733k);
        k.f("random", random);
        this.isClient = z5;
        this.sink = interfaceC0733k;
        this.random = random;
        this.perMessageDeflate = z6;
        this.noContextTakeover = z7;
        this.minimumDeflateSize = j4;
        this.messageBuffer = new C0732j();
        this.sinkBuffer = interfaceC0733k.a();
        this.maskKey = z5 ? new byte[4] : null;
        this.maskCursor = z5 ? new C0730h() : null;
    }

    private final void writeControlFrame(int i, C0735m c0735m) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iD = c0735m.d();
        if (iD > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.Z(i | 128);
        if (this.isClient) {
            this.sinkBuffer.Z(iD | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            k.c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.X(this.maskKey);
            if (iD > 0) {
                C0732j c0732j = this.sinkBuffer;
                long j4 = c0732j.i;
                c0732j.V(c0735m);
                C0732j c0732j2 = this.sinkBuffer;
                C0730h c0730h = this.maskCursor;
                k.c(c0730h);
                c0732j2.D(c0730h);
                this.maskCursor.c(j4);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.Z(iD);
            this.sinkBuffer.V(c0735m);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC0733k getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C0735m c0735m) throws EOFException {
        C0735m c0735mJ = C0735m.f9352k;
        if (i != 0 || c0735m != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C0732j c0732j = new C0732j();
            c0732j.e0(i);
            if (c0735m != null) {
                c0732j.V(c0735m);
            }
            c0735mJ = c0732j.j(c0732j.i);
        }
        try {
            writeControlFrame(8, c0735mJ);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C0735m c0735m) throws IllegalAccessException, IOException, InvocationTargetException {
        k.f("data", c0735m);
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.V(c0735m);
        int i3 = i | 128;
        if (this.perMessageDeflate && c0735m.d() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i3 = i | 192;
        }
        long j4 = this.messageBuffer.i;
        this.sinkBuffer.Z(i3);
        int i6 = this.isClient ? 128 : 0;
        if (j4 <= 125) {
            this.sinkBuffer.Z(i6 | ((int) j4));
        } else if (j4 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.Z(i6 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.e0((int) j4);
        } else {
            this.sinkBuffer.Z(i6 | 127);
            this.sinkBuffer.d0(j4);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            k.c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.X(this.maskKey);
            if (j4 > 0) {
                C0732j c0732j = this.messageBuffer;
                C0730h c0730h = this.maskCursor;
                k.c(c0730h);
                c0732j.D(c0730h);
                this.maskCursor.c(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j4);
        this.sink.m();
    }

    public final void writePing(C0735m c0735m) throws IOException {
        k.f("payload", c0735m);
        writeControlFrame(9, c0735m);
    }

    public final void writePong(C0735m c0735m) throws IOException {
        k.f("payload", c0735m);
        writeControlFrame(10, c0735m);
    }
}
