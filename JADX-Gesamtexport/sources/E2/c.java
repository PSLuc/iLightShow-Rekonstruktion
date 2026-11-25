package E2;

import B.D;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1010h;
    public final D i;

    public c(OutputStream outputStream, D d6) {
        super(outputStream);
        this.i = d6;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i3);
        long j4 = this.f1010h + ((long) i3);
        this.f1010h = j4;
        this.i.invoke(Long.valueOf(j4));
    }
}
