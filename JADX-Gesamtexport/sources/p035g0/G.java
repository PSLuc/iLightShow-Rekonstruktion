package p035g0;

import S1.h0;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import p012c.k;
import p030f0.f;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class G extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9015e;

    public G(List list, long j4, float f6) {
        this.f9013c = list;
        this.f9014d = j4;
        this.f9015e = f6;
    }

    @Override // p035g0.K
    public final Shader b(long j4) {
        float fD;
        float fB;
        long j6 = this.f9014d;
        if (c.t0(j6)) {
            long jN = h0.n(j4);
            fD = p030f0.c.d(jN);
            fB = p030f0.c.e(jN);
        } else {
            fD = p030f0.c.d(j6) == Float.POSITIVE_INFINITY ? f.d(j4) : p030f0.c.d(j6);
            fB = p030f0.c.e(j6) == Float.POSITIVE_INFINITY ? f.b(j4) : p030f0.c.e(j6);
        }
        long jY = c.y(fD, fB);
        float fC = this.f9015e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = f.c(j4) / 2;
        }
        float f6 = fC;
        List list = this.f9013c;
        H.y(list);
        float fD2 = p030f0.c.d(jY);
        float fE = p030f0.c.e(jY);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = H.v(((r) list.get(i)).f9087a);
        }
        return new RadialGradient(fD2, fE, f6, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g6 = (G) obj;
        return this.f9013c.equals(g6.f9013c) && p030f0.c.b(this.f9014d, g6.f9014d) && this.f9015e == g6.f9015e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + k.i(this.f9015e, k.l(this.f9013c.hashCode() * 961, 31, this.f9014d), 31);
    }

    public final String toString() {
        String str;
        long j4 = this.f9014d;
        String str2 = "";
        if (c.s0(j4)) {
            str = "center=" + ((Object) p030f0.c.j(j4)) + ", ";
        } else {
            str = "";
        }
        float f6 = this.f9015e;
        if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
            str2 = "radius=" + f6 + ", ";
        }
        return "RadialGradient(colors=" + this.f9013c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
