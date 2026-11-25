package O4;

import java.io.Serializable;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f4576j = new a(0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4577h;
    public final long i;

    public a(long j4, long j6) {
        this.f4577h = j4;
        this.i = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4577h == aVar.f4577h && this.i == aVar.i;
    }

    public final int hashCode() {
        long j4 = this.f4577h ^ this.i;
        return ((int) (j4 >> 32)) ^ ((int) j4);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j4 = this.i;
        c.B(24, 6, j4, bArr);
        bArr[23] = 45;
        c.B(19, 2, j4 >>> 48, bArr);
        bArr[18] = 45;
        long j6 = this.f4577h;
        c.B(14, 2, j6, bArr);
        bArr[13] = 45;
        c.B(9, 2, j6 >>> 16, bArr);
        bArr[8] = 45;
        c.B(0, 4, j6 >>> 32, bArr);
        return new String(bArr, M4.a.f3520a);
    }
}
