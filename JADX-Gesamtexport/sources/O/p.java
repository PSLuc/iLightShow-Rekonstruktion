package O;

import F.C0071m;
import N.C0206c;
import N.C0208d;
import N.C0237s;
import N.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f4379c = new p(1, 0, 2);

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) throws Throwable {
        C0206c c0206c;
        int iC;
        int iD = c0071m.d(0);
        Throwable th = null;
        if (!(g6.f3601n == 0)) {
            C0208d.w("Cannot move a group while inserting");
            throw null;
        }
        if (!(iD >= 0)) {
            C0208d.w("Parameter offset is out of bounds");
            throw null;
        }
        if (iD == 0) {
            return;
        }
        int i = g6.f3607t;
        int i3 = g6.f3609v;
        int i6 = g6.f3608u;
        int i7 = i;
        while (iD > 0) {
            i7 += g6.f3590b[(g6.p(i7) * 5) + 3];
            if (i7 > i6) {
                C0208d.w("Parameter offset is out of bounds");
                throw null;
            }
            iD--;
        }
        int i8 = g6.f3590b[(g6.p(i7) * 5) + 3];
        int iF = g6.f(g6.f3590b, g6.p(g6.f3607t));
        int iF2 = g6.f(g6.f3590b, g6.p(i7));
        int i9 = i7 + i8;
        int iF3 = g6.f(g6.f3590b, g6.p(i9));
        int i10 = iF3 - iF2;
        g6.s(i10, Math.max(g6.f3607t - 1, 0));
        g6.r(i8);
        int[] iArr = g6.f3590b;
        int iP = g6.p(i9) * 5;
        p089q4.k.c0(g6.p(i) * 5, iP, (i8 * 5) + iP, iArr, iArr);
        if (i10 > 0) {
            Object[] objArr = g6.f3591c;
            p089q4.k.e0(objArr, objArr, iF, g6.g(iF2 + i10), g6.g(iF3 + i10));
        }
        int i11 = iF2 + i10;
        int i12 = i11 - iF;
        int i13 = g6.f3598k;
        int i14 = g6.f3599l;
        int length = g6.f3591c.length;
        int i15 = g6.f3600m;
        int i16 = i + i8;
        int i17 = i;
        while (i17 < i16) {
            Throwable th2 = th;
            int iP2 = g6.p(i17);
            int i18 = i16;
            int i19 = i17;
            iArr[(iP2 * 5) + 4] = G0.h(G0.h(g6.f(iArr, iP2) - i12, i15 < iP2 ? 0 : i13, i14, length), g6.f3598k, g6.f3599l, g6.f3591c.length);
            i17 = i19 + 1;
            th = th2;
            i16 = i18;
            i12 = i12;
        }
        Throwable th3 = th;
        int i20 = i9 + i8;
        int iN = g6.n();
        int iN2 = C0208d.n(g6.f3592d, i9, iN);
        ArrayList arrayList = new ArrayList();
        if (iN2 >= 0) {
            while (iN2 < g6.f3592d.size() && (iC = g6.c((c0206c = (C0206c) g6.f3592d.get(iN2)))) >= i9 && iC < i20) {
                arrayList.add(c0206c);
                g6.f3592d.remove(iN2);
            }
        }
        int i21 = i - i9;
        int size = arrayList.size();
        for (int i22 = 0; i22 < size; i22++) {
            C0206c c0206c2 = (C0206c) arrayList.get(i22);
            int iC2 = g6.c(c0206c2) + i21;
            if (iC2 >= g6.f3595g) {
                c0206c2.f3685a = -(iN - iC2);
            } else {
                c0206c2.f3685a = iC2;
            }
            g6.f3592d.add(C0208d.n(g6.f3592d, iC2, iN), c0206c2);
        }
        if (g6.B(i9, i8)) {
            C0208d.w("Unexpectedly removed anchors");
            throw th3;
        }
        g6.l(i3, g6.f3608u, i);
        if (i10 > 0) {
            g6.C(i11, i10, i9 - 1);
        }
    }

    @Override // O.C
    public final String b(int i) {
        return i == 0 ? "offset" : super.b(i);
    }
}
