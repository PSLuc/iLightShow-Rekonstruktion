package G0;

import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1546b = 0;

    static {
        S0.n[] nVarArr = S0.m.f4900b;
        f1545a = S0.m.f4901c;
    }

    public static final t a(t tVar, int i, int i3, long j4, R0.p pVar, v vVar, R0.g gVar, int i6, int i7, R0.q qVar) {
        long j6;
        R0.p pVar2 = pVar;
        v vVar2 = vVar;
        R0.g gVar2 = gVar;
        int i8 = i6;
        int i9 = i7;
        if (i == Integer.MIN_VALUE || i == tVar.f1537a) {
            if (d0.u(j4)) {
                j6 = j4;
            } else {
                j6 = j4;
                if (S0.m.a(j6, tVar.f1539c)) {
                }
            }
            if ((pVar2 == null || pVar2.equals(tVar.f1540d)) && ((i3 == Integer.MIN_VALUE || i3 == tVar.f1538b) && ((vVar2 == null || vVar2.equals(tVar.f1541e)) && ((gVar2 == null || gVar2.equals(tVar.f1542f)) && ((i8 == 0 || i8 == tVar.f1543g) && ((i9 == Integer.MIN_VALUE || i9 == tVar.f1544h) && (qVar == null || qVar.equals(tVar.i)))))))) {
                return tVar;
            }
        } else {
            j6 = j4;
        }
        long j7 = d0.u(j6) ? tVar.f1539c : j6;
        if (pVar2 == null) {
            pVar2 = tVar.f1540d;
        }
        if (i == Integer.MIN_VALUE) {
            i = tVar.f1537a;
        }
        int i10 = i3 == Integer.MIN_VALUE ? tVar.f1538b : i3;
        v vVar3 = tVar.f1541e;
        if (vVar3 != null && vVar2 == null) {
            vVar2 = vVar3;
        }
        if (gVar2 == null) {
            gVar2 = tVar.f1542f;
        }
        if (i8 == 0) {
            i8 = tVar.f1543g;
        }
        if (i9 == Integer.MIN_VALUE) {
            i9 = tVar.f1544h;
        }
        return new t(i, i10, j7, pVar2, vVar2, gVar2, i8, i9, qVar == null ? tVar.i : qVar);
    }
}
