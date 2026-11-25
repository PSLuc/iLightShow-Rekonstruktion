package F;

import B.AbstractC0029o0;
import B.a1;
import G0.C0110f;
import M0.C0198a;
import S1.h0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.List;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f1108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0.G f1110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M0.q f1111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f1112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0110f f1114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M0.w f1115h;
    public final a1 i;

    public M(M0.w wVar, M0.q qVar, a1 a1Var, X x6) {
        C0110f c0110f = wVar.f3453a;
        G0.G g6 = a1Var != null ? a1Var.f281a : null;
        long j4 = wVar.f3454b;
        this.f1108a = c0110f;
        this.f1109b = j4;
        this.f1110c = g6;
        this.f1111d = qVar;
        this.f1112e = x6;
        this.f1113f = j4;
        this.f1114g = c0110f;
        this.f1115h = wVar;
        this.i = a1Var;
    }

    public final List a(D4.c cVar) {
        if (!G0.I.b(this.f1113f)) {
            return p089q4.m.M(new C0198a("", 0), new M0.v(G0.I.e(this.f1113f), G0.I.e(this.f1113f)));
        }
        M0.i iVar = (M0.i) cVar.invoke(this);
        if (iVar != null) {
            return d0.v(iVar);
        }
        return null;
    }

    public final Integer b() {
        G0.G g6 = this.f1110c;
        if (g6 == null) {
            return null;
        }
        int iD = G0.I.d(this.f1113f);
        M0.q qVar = this.f1111d;
        return Integer.valueOf(qVar.a(g6.d(g6.e(qVar.b(iD)), true)));
    }

    public final Integer c() {
        int length;
        G0.G g6 = this.f1110c;
        if (g6 == null) {
            return null;
        }
        int iP = p();
        while (true) {
            C0110f c0110f = this.f1108a;
            if (iP < c0110f.f1494h.length()) {
                int length2 = this.f1114g.f1494h.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jK = g6.k(length2);
                int i = G0.I.f1469c;
                int i3 = (int) (jK & 4294967295L);
                if (i3 > iP) {
                    length = this.f1111d.a(i3);
                    break;
                }
                iP++;
            } else {
                length = c0110f.f1494h.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        G0.G g6 = this.f1110c;
        if (g6 == null) {
            return null;
        }
        for (int iP = p(); iP > 0; iP--) {
            int length = this.f1114g.f1494h.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jK = g6.k(length);
            int i = G0.I.f1469c;
            int i3 = (int) (jK >> 32);
            if (i3 < iP) {
                iA = this.f1111d.a(i3);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        G0.G g6 = this.f1110c;
        return (g6 != null ? g6.i(p()) : null) != R0.h.i;
    }

    public final int f(G0.G g6, int i) {
        int iP = p();
        X x6 = this.f1112e;
        if (x6.f1151a == null) {
            x6.f1151a = Float.valueOf(g6.c(iP).f8839a);
        }
        int iE = g6.e(iP) + i;
        if (iE < 0) {
            return 0;
        }
        G0.n nVar = g6.f1459b;
        if (iE >= nVar.f1518f) {
            return this.f1114g.f1494h.length();
        }
        float fB = nVar.b(iE) - 1;
        Float f6 = x6.f1151a;
        E4.k.c(f6);
        float fFloatValue = f6.floatValue();
        if ((e() && fFloatValue >= g6.g(iE)) || (!e() && fFloatValue <= g6.f(iE))) {
            return g6.d(iE, true);
        }
        return this.f1111d.a(nVar.e(p081p0.c.y(f6.floatValue(), fB)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final int g(a1 a1Var, int i) {
        p030f0.d dVarO;
        InterfaceC1033p interfaceC1033p = a1Var.f282b;
        if (interfaceC1033p == null) {
            dVarO = p030f0.d.f8838e;
        } else {
            InterfaceC1033p interfaceC1033p2 = a1Var.f283c;
            dVarO = interfaceC1033p2 != null ? interfaceC1033p2.o(interfaceC1033p, true) : null;
            if (dVarO == null) {
                dVarO = p030f0.d.f8838e;
            }
        }
        long j4 = this.f1115h.f3454b;
        int i3 = G0.I.f1469c;
        M0.q qVar = this.f1111d;
        int iB = qVar.b((int) (j4 & 4294967295L));
        G0.G g6 = a1Var.f281a;
        p030f0.d dVarC = g6.c(iB);
        return qVar.a(g6.f1459b.e(p081p0.c.y(dVarC.f8839a, (p030f0.f.b(h0.f(dVarO.c(), dVarO.b())) * i) + dVarC.f8840b)));
    }

    public final void h() {
        C0110f c0110f = this.f1114g;
        X x6 = this.f1112e;
        x6.f1151a = null;
        if (c0110f.f1494h.length() > 0) {
            if (e()) {
                x6.f1151a = null;
                if (c0110f.f1494h.length() > 0) {
                    String str = c0110f.f1494h;
                    long j4 = this.f1113f;
                    int i = G0.I.f1469c;
                    int iS = AbstractC0029o0.s((int) (j4 & 4294967295L), str);
                    if (iS != -1) {
                        o(iS, iS);
                        return;
                    }
                    return;
                }
                return;
            }
            x6.f1151a = null;
            if (c0110f.f1494h.length() > 0) {
                String str2 = c0110f.f1494h;
                long j6 = this.f1113f;
                int i3 = G0.I.f1469c;
                int iP = AbstractC0029o0.p((int) (j6 & 4294967295L), str2);
                if (iP != -1) {
                    o(iP, iP);
                }
            }
        }
    }

    public final void i() {
        this.f1112e.f1151a = null;
        C0110f c0110f = this.f1114g;
        if (c0110f.f1494h.length() > 0) {
            int iD = G0.I.d(this.f1113f);
            String str = c0110f.f1494h;
            int iQ = AbstractC0029o0.q(str, iD);
            if (iQ == G0.I.d(this.f1113f) && iQ != str.length()) {
                iQ = AbstractC0029o0.q(str, iQ + 1);
            }
            o(iQ, iQ);
        }
    }

    public final void j() {
        this.f1112e.f1151a = null;
        C0110f c0110f = this.f1114g;
        if (c0110f.f1494h.length() > 0) {
            int iE = G0.I.e(this.f1113f);
            String str = c0110f.f1494h;
            int iR = AbstractC0029o0.r(str, iE);
            if (iR == G0.I.e(this.f1113f) && iR != 0) {
                iR = AbstractC0029o0.r(str, iR - 1);
            }
            o(iR, iR);
        }
    }

    public final void k() {
        C0110f c0110f = this.f1114g;
        X x6 = this.f1112e;
        x6.f1151a = null;
        if (c0110f.f1494h.length() > 0) {
            if (e()) {
                x6.f1151a = null;
                if (c0110f.f1494h.length() > 0) {
                    String str = c0110f.f1494h;
                    long j4 = this.f1113f;
                    int i = G0.I.f1469c;
                    int iP = AbstractC0029o0.p((int) (j4 & 4294967295L), str);
                    if (iP != -1) {
                        o(iP, iP);
                        return;
                    }
                    return;
                }
                return;
            }
            x6.f1151a = null;
            if (c0110f.f1494h.length() > 0) {
                String str2 = c0110f.f1494h;
                long j6 = this.f1113f;
                int i3 = G0.I.f1469c;
                int iS = AbstractC0029o0.s((int) (j6 & 4294967295L), str2);
                if (iS != -1) {
                    o(iS, iS);
                }
            }
        }
    }

    public final void l() {
        Integer numB;
        this.f1112e.f1151a = null;
        if (this.f1114g.f1494h.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numValueOf = null;
        this.f1112e.f1151a = null;
        if (this.f1114g.f1494h.length() > 0) {
            G0.G g6 = this.f1110c;
            if (g6 != null) {
                int iE = G0.I.e(this.f1113f);
                M0.q qVar = this.f1111d;
                numValueOf = Integer.valueOf(qVar.a(g6.h(g6.e(qVar.b(iE)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                o(iIntValue, iIntValue);
            }
        }
    }

    public final void n() {
        if (this.f1114g.f1494h.length() > 0) {
            int i = G0.I.f1469c;
            this.f1113f = AbstractC0599v0.d((int) (this.f1109b >> 32), (int) (this.f1113f & 4294967295L));
        }
    }

    public final void o(int i, int i3) {
        this.f1113f = AbstractC0599v0.d(i, i3);
    }

    public final int p() {
        long j4 = this.f1113f;
        int i = G0.I.f1469c;
        return this.f1111d.b((int) (j4 & 4294967295L));
    }
}
