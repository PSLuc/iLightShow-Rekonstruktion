package L;

import N.C0230o;

/* JADX INFO: renamed from: L.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0174s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p123x.O f2903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p123x.O f2904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2906d;

    static {
        float f6 = 24;
        float f7 = 8;
        f2903a = new p123x.O(f6, f7, f6, f7);
        float f8 = 16;
        androidx.compose.foundation.layout.a.a(f8, f7, f6, f7);
        float f9 = 12;
        f2904b = new p123x.O(f9, f7, f9, f7);
        androidx.compose.foundation.layout.a.a(f9, f7, f8, f7);
        f2905c = 58;
        f2906d = 40;
        float f10 = M.j.f3206a;
    }

    public static r a(long j4, C0230o c0230o) {
        c0230o.W(-339300779);
        long j6 = p035g0.r.f9085l;
        r rVarB = b((D) c0230o.k(F.f2265a));
        if (j4 == j6) {
            j4 = rVarB.f2890a;
        }
        long j7 = j4;
        long j8 = j6 != j6 ? j6 : rVarB.f2891b;
        long j9 = j6 != j6 ? j6 : rVarB.f2892c;
        if (j6 == j6) {
            j6 = rVarB.f2893d;
        }
        r rVar = new r(j7, j8, j9, j6);
        c0230o.p(false);
        return rVar;
    }

    public static r b(D d6) {
        r rVar = d6.f2202K;
        if (rVar != null) {
            return rVar;
        }
        float f6 = M.j.f3206a;
        r rVar2 = new r(F.d(d6, 26), F.d(d6, M.j.f3213h), p035g0.r.b(0.12f, F.d(d6, M.j.f3208c)), p035g0.r.b(0.38f, F.d(d6, M.j.f3210e)));
        d6.f2202K = rVar2;
        return rVar2;
    }
}
