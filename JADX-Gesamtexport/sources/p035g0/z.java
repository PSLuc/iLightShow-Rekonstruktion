package p035g0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import p012c.k;
import p030f0.c;
import p030f0.f;

/* JADX INFO: loaded from: classes.dex */
public final class z extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9096e;

    public z(List list, long j4, long j6) {
        this.f9094c = list;
        this.f9095d = j4;
        this.f9096e = j6;
    }

    @Override // p035g0.K
    public final Shader b(long j4) {
        long j6 = this.f9095d;
        float fD = c.d(j6) == Float.POSITIVE_INFINITY ? f.d(j4) : c.d(j6);
        float fB = c.e(j6) == Float.POSITIVE_INFINITY ? f.b(j4) : c.e(j6);
        long j7 = this.f9096e;
        float fD2 = c.d(j7) == Float.POSITIVE_INFINITY ? f.d(j4) : c.d(j7);
        float fB2 = c.e(j7) == Float.POSITIVE_INFINITY ? f.b(j4) : c.e(j7);
        long jY = p081p0.c.y(fD, fB);
        long jY2 = p081p0.c.y(fD2, fB2);
        List list = this.f9094c;
        H.y(list);
        float fD3 = c.d(jY);
        float fE = c.e(jY);
        float fD4 = c.d(jY2);
        float fE2 = c.e(jY2);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = H.v(((r) list.get(i)).f9087a);
        }
        return new LinearGradient(fD3, fE, fD4, fE2, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f9094c.equals(zVar.f9094c) && c.b(this.f9095d, zVar.f9095d) && c.b(this.f9096e, zVar.f9096e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + k.l(k.l(this.f9094c.hashCode() * 961, 31, this.f9095d), 31, this.f9096e);
    }

    public final String toString() {
        String str;
        long j4 = this.f9095d;
        String str2 = "";
        if (p081p0.c.p0(j4)) {
            str = "start=" + ((Object) c.j(j4)) + ", ";
        } else {
            str = "";
        }
        long j6 = this.f9096e;
        if (p081p0.c.p0(j6)) {
            str2 = "end=" + ((Object) c.j(j6)) + ", ";
        }
        return "LinearGradient(colors=" + this.f9094c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
