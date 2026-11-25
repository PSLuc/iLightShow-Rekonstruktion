package p109u2;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f extends OutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ByteBuffer f12687h;

    public f(ByteBuffer byteBuffer) {
        this.f12687h = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f12687h.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) {
        this.f12687h.put(bArr, i, i3);
    }
}
