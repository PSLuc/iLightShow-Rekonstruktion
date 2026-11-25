package E2;

import B.D;
import E4.k;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterInputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1008h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D f1009j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream, D d6) {
        super(inputStream);
        k.f("stream", inputStream);
        this.f1009j = d6;
        this.i = -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.i = this.f1008h;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        int i6 = super.read(bArr, i, i3);
        long jMax = this.f1008h + ((long) Math.max(i6, 0));
        this.f1008h = jMax;
        this.f1009j.invoke(Long.valueOf(jMax));
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        this.f1008h = this.i;
    }
}
