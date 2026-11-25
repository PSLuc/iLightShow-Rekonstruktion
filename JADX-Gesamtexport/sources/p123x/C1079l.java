package p123x;

import B.Y0;
import S0.a;
import S0.j;
import S1.V;
import Z.n;
import p015c2.AbstractC0473d;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p124x0.InterfaceC1114w;
import p124x0.M;

/* JADX INFO: renamed from: x.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1079l extends n implements InterfaceC1114w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13783u;

    public final long A0(long j4, boolean z5) {
        int i = a.i(j4);
        int iRound = Math.round(i * this.f13783u);
        if (iRound <= 0) {
            return 0L;
        }
        long jB = AbstractC0473d.b(iRound, i);
        if (!z5 || c.r0(j4, jB)) {
            return jB;
        }
        return 0L;
    }

    public final long B0(long j4, boolean z5) {
        int iJ = a.j(j4);
        int iRound = Math.round(iJ / this.f13783u);
        if (iRound <= 0) {
            return 0L;
        }
        long jB = AbstractC0473d.b(iJ, iRound);
        if (!z5 || c.r0(j4, jB)) {
            return jB;
        }
        return 0L;
    }

    @Override // p124x0.InterfaceC1114w
    public final int c(M m6, E e6, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f13783u) : e6.Z(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int d(M m6, E e6, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f13783u) : e6.U(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final G e(H h6, E e6, long j4) {
        long jZ0 = z0(j4, true);
        if (j.a(jZ0, 0L)) {
            jZ0 = y0(j4, true);
            if (j.a(jZ0, 0L)) {
                jZ0 = B0(j4, true);
                if (j.a(jZ0, 0L)) {
                    jZ0 = A0(j4, true);
                    if (j.a(jZ0, 0L)) {
                        jZ0 = z0(j4, false);
                        if (j.a(jZ0, 0L)) {
                            jZ0 = y0(j4, false);
                            if (j.a(jZ0, 0L)) {
                                jZ0 = B0(j4, false);
                                if (j.a(jZ0, 0L)) {
                                    jZ0 = A0(j4, false);
                                    if (j.a(jZ0, 0L)) {
                                        jZ0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!j.a(jZ0, 0L)) {
            int i = (int) (jZ0 >> 32);
            int i3 = (int) (4294967295L & jZ0);
            if (i < 0 || i3 < 0) {
                V.N("width(" + i + ") and height(" + i3 + ") must be >= 0");
                throw null;
            }
            j4 = c.W(i, i, i3, i3);
        }
        N nC = e6.c(j4);
        return h6.u(nC.f13137h, nC.i, v.f11238h, new Y0(nC, 8));
    }

    @Override // p124x0.InterfaceC1114w
    public final int h(M m6, E e6, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f13783u) : e6.Y(i);
    }

    @Override // p124x0.InterfaceC1114w
    public final int i(M m6, E e6, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f13783u) : e6.d(i);
    }

    public final long y0(long j4, boolean z5) {
        int iRound;
        int iG = a.g(j4);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f13783u)) <= 0) {
            return 0L;
        }
        long jB = AbstractC0473d.b(iRound, iG);
        if (!z5 || c.r0(j4, jB)) {
            return jB;
        }
        return 0L;
    }

    public final long z0(long j4, boolean z5) {
        int iRound;
        int iH = a.h(j4);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f13783u)) <= 0) {
            return 0L;
        }
        long jB = AbstractC0473d.b(iH, iRound);
        if (!z5 || c.r0(j4, jB)) {
            return jB;
        }
        return 0L;
    }
}
