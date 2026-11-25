package p130y0;

import E0.l;
import E4.k;
import G0.G;
import G0.n;
import R0.h;
import p037g2.y;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1123c extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1123c f14359e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f14360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f14361d;

    @Override // p037g2.y
    public final int[] b(int i) {
        int iC;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        try {
            l lVar = this.f14361d;
            if (lVar == null) {
                k.m("node");
                throw null;
            }
            int iRound = Math.round(lVar.e().b());
            if (i <= 0) {
                i = 0;
            }
            G g6 = this.f14360c;
            if (g6 == null) {
                k.m("layoutResult");
                throw null;
            }
            int iE = g6.e(i);
            G g7 = this.f14360c;
            if (g7 == null) {
                k.m("layoutResult");
                throw null;
            }
            float fD = g7.f1459b.d(iE) + iRound;
            G g8 = this.f14360c;
            if (g8 == null) {
                k.m("layoutResult");
                throw null;
            }
            if (g8 == null) {
                k.m("layoutResult");
                throw null;
            }
            n nVar = g8.f1459b;
            if (fD < nVar.d(nVar.f1518f - 1)) {
                G g9 = this.f14360c;
                if (g9 == null) {
                    k.m("layoutResult");
                    throw null;
                }
                iC = g9.f1459b.c(fD);
            } else {
                G g10 = this.f14360c;
                if (g10 == null) {
                    k.m("layoutResult");
                    throw null;
                }
                iC = g10.f1459b.f1518f;
            }
            return c(i, f(iC - 1, h.f4743h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p037g2.y
    public final int[] e(int i) {
        int iC;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            l lVar = this.f14361d;
            if (lVar == null) {
                k.m("node");
                throw null;
            }
            int iRound = Math.round(lVar.e().b());
            int length = d().length();
            if (length <= i) {
                i = length;
            }
            G g6 = this.f14360c;
            if (g6 == null) {
                k.m("layoutResult");
                throw null;
            }
            int iE = g6.e(i);
            G g7 = this.f14360c;
            if (g7 == null) {
                k.m("layoutResult");
                throw null;
            }
            float fD = g7.f1459b.d(iE) - iRound;
            if (fD > 0.0f) {
                G g8 = this.f14360c;
                if (g8 == null) {
                    k.m("layoutResult");
                    throw null;
                }
                iC = g8.f1459b.c(fD);
            } else {
                iC = 0;
            }
            if (i == d().length() && iC < iE) {
                iC++;
            }
            return c(f(iC, h.i), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int f(int i, h hVar) {
        G g6 = this.f14360c;
        if (g6 == null) {
            k.m("layoutResult");
            throw null;
        }
        int iH = g6.h(i);
        G g7 = this.f14360c;
        if (g7 == null) {
            k.m("layoutResult");
            throw null;
        }
        if (hVar != g7.i(iH)) {
            G g8 = this.f14360c;
            if (g8 != null) {
                return g8.h(i);
            }
            k.m("layoutResult");
            throw null;
        }
        G g9 = this.f14360c;
        if (g9 != null) {
            return g9.d(i, false) - 1;
        }
        k.m("layoutResult");
        throw null;
    }
}
