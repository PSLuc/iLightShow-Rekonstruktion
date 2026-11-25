package L2;

import B.C0031p0;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I2.c f3067c;

    public i(String str, byte[] bArr, I2.c cVar) {
        this.f3065a = str;
        this.f3066b = bArr;
        this.f3067c = cVar;
    }

    public static C0031p0 a() {
        C0031p0 c0031p0 = new C0031p0(8, false);
        c0031p0.f395k = I2.c.f1854h;
        return c0031p0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f3065a.equals(iVar.f3065a) && Arrays.equals(this.f3066b, iVar.f3066b) && this.f3067c.equals(iVar.f3067c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3067c.hashCode() ^ ((((this.f3065a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3066b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f3066b;
        return "TransportContext(" + this.f3065a + ", " + this.f3067c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
