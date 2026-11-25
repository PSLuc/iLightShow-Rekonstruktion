package p109u2;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: u2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966e extends InputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ByteBuffer f12686h;

    public C0966e(ByteBuffer byteBuffer) {
        this.f12686h = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f12686h.remaining();
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f12686h;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) {
        ByteBuffer byteBuffer = this.f12686h;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i3, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
