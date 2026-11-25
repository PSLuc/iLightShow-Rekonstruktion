package p099s3;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12197h;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f12197h++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f12197h += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) {
        int i6;
        if (i >= 0 && i <= bArr.length && i3 >= 0 && (i6 = i + i3) <= bArr.length && i6 >= 0) {
            this.f12197h += (long) i3;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
