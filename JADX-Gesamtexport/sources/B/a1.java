package B;

import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0.G f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1033p f282b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1033p f283c;

    public a1(G0.G g6, InterfaceC1033p interfaceC1033p) {
        this.f281a = g6;
        this.f283c = interfaceC1033p;
    }

    public final long a(long j4) {
        p030f0.d dVarO;
        InterfaceC1033p interfaceC1033p = this.f282b;
        p030f0.d dVar = p030f0.d.f8838e;
        if (interfaceC1033p != null) {
            if (interfaceC1033p.K()) {
                InterfaceC1033p interfaceC1033p2 = this.f283c;
                dVarO = interfaceC1033p2 != null ? interfaceC1033p2.o(interfaceC1033p, true) : null;
            } else {
                dVarO = dVar;
            }
            if (dVarO != null) {
                dVar = dVarO;
            }
        }
        float fD = p030f0.c.d(j4);
        float fD2 = dVar.f8839a;
        if (fD >= fD2) {
            float fD3 = p030f0.c.d(j4);
            fD2 = dVar.f8841c;
            if (fD3 <= fD2) {
                fD2 = p030f0.c.d(j4);
            }
        }
        float fE = p030f0.c.e(j4);
        float fE2 = dVar.f8840b;
        if (fE >= fE2) {
            float fE3 = p030f0.c.e(j4);
            fE2 = dVar.f8842d;
            if (fE3 <= fE2) {
                fE2 = p030f0.c.e(j4);
            }
        }
        return p081p0.c.y(fD2, fE2);
    }

    public final int b(long j4, boolean z5) {
        if (z5) {
            j4 = a(j4);
        }
        return this.f281a.f1459b.e(d(j4));
    }

    public final boolean c(long j4) {
        long jD = d(a(j4));
        float fE = p030f0.c.e(jD);
        G0.G g6 = this.f281a;
        int iC = g6.f1459b.c(fE);
        return p030f0.c.d(jD) >= g6.f(iC) && p030f0.c.d(jD) <= g6.g(iC);
    }

    public final long d(long j4) {
        InterfaceC1033p interfaceC1033p;
        InterfaceC1033p interfaceC1033p2 = this.f282b;
        if (interfaceC1033p2 != null) {
            if (!interfaceC1033p2.K()) {
                interfaceC1033p2 = null;
            }
            if (interfaceC1033p2 != null && (interfaceC1033p = this.f283c) != null) {
                InterfaceC1033p interfaceC1033p3 = interfaceC1033p.K() ? interfaceC1033p : null;
                if (interfaceC1033p3 != null) {
                    return interfaceC1033p2.k(interfaceC1033p3, j4);
                }
            }
        }
        return j4;
    }

    public final long e(long j4) {
        InterfaceC1033p interfaceC1033p;
        InterfaceC1033p interfaceC1033p2 = this.f282b;
        if (interfaceC1033p2 != null) {
            if (!interfaceC1033p2.K()) {
                interfaceC1033p2 = null;
            }
            if (interfaceC1033p2 != null && (interfaceC1033p = this.f283c) != null) {
                InterfaceC1033p interfaceC1033p3 = interfaceC1033p.K() ? interfaceC1033p : null;
                if (interfaceC1033p3 != null) {
                    return interfaceC1033p3.k(interfaceC1033p2, j4);
                }
            }
        }
        return j4;
    }
}
