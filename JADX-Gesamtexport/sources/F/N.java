package F;

import B.C0036s0;
import B.D0;
import B.EnumC0009e0;
import B.EnumC0011f0;
import B.a1;
import N.C0217h0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f1117b;

    public /* synthetic */ N(P p6, int i) {
        this.f1116a = i;
        this.f1117b = p6;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void i() {
    }

    @Override // B.D0
    public final void a() {
        switch (this.f1116a) {
            case 0:
                P p6 = this.f1117b;
                p6.f1133o.setValue(null);
                p6.f1134p.setValue(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r14v12, types: [D4.c, E4.l] */
    @Override // B.D0
    public final void b(long j4) {
        a1 a1VarD;
        long j6;
        a1 a1VarD2;
        a1 a1VarD3;
        switch (this.f1116a) {
            case 0:
                P p6 = this.f1117b;
                long jI = p6.i(true);
                float f6 = B.f1080a;
                long jY = p081p0.c.y(p030f0.c.d(jI), p030f0.c.e(jI) - 1.0f);
                C0036s0 c0036s0 = p6.f1123d;
                if (c0036s0 != null && (a1VarD = c0036s0.d()) != null) {
                    long jE = a1VarD.e(jY);
                    p6.f1130l = jE;
                    p6.f1134p.setValue(new p030f0.c(jE));
                    p6.f1132n = 0L;
                    p6.f1133o.setValue(EnumC0009e0.f307h);
                    p6.p(false);
                    break;
                }
                break;
            default:
                P p7 = this.f1117b;
                if (p7.h()) {
                    C0217h0 c0217h0 = p7.f1133o;
                    if (((EnumC0009e0) c0217h0.getValue()) == null) {
                        c0217h0.setValue(EnumC0009e0.f308j);
                        p7.f1135q = -1;
                        p7.k();
                        C0036s0 c0036s1 = p7.f1123d;
                        if (c0036s1 == null || (a1VarD3 = c0036s1.d()) == null || !a1VarD3.c(j4)) {
                            j6 = j4;
                            C0036s0 c0036s2 = p7.f1123d;
                            if (c0036s2 != null && (a1VarD2 = c0036s2.d()) != null) {
                                int iA = p7.f1121b.a(a1VarD2.b(j6, true));
                                M0.w wVarC = P.c(p7.j().f3453a, AbstractC0599v0.d(iA, iA));
                                p7.f(false);
                                p069n0.a aVar = p7.f1127h;
                                if (aVar != null) {
                                    ((p069n0.b) aVar).a();
                                }
                                p7.f1122c.invoke(wVarC);
                            }
                        } else if (p7.j().f3453a.f1494h.length() != 0) {
                            p7.f(false);
                            j6 = j4;
                            p7.f1131m = Integer.valueOf((int) (P.a(p7, M0.w.a(p7.j(), null, G0.I.f1468b, 5), j6, true, false, C0075q.f1203e, true) >> 32));
                        }
                        p7.n(EnumC0011f0.f312h);
                        p7.f1130l = j6;
                        p7.f1134p.setValue(new p030f0.c(j6));
                        p7.f1132n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // B.D0
    public final void c() {
        int i = this.f1116a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Type inference failed for: r0v7, types: [D4.c, E4.l] */
    @Override // B.D0
    public final void d(long j4) {
        a1 a1VarD;
        p069n0.a aVar;
        a1 a1VarD2;
        Integer num;
        int iB;
        switch (this.f1116a) {
            case 0:
                P p6 = this.f1117b;
                p6.f1132n = p030f0.c.h(p6.f1132n, j4);
                C0036s0 c0036s0 = p6.f1123d;
                if (c0036s0 != null && (a1VarD = c0036s0.d()) != null) {
                    p6.f1134p.setValue(new p030f0.c(p030f0.c.h(p6.f1130l, p6.f1132n)));
                    M0.q qVar = p6.f1121b;
                    p030f0.c cVarG = p6.g();
                    E4.k.c(cVarG);
                    int iA = qVar.a(a1VarD.b(cVarG.f8837a, true));
                    long jD = AbstractC0599v0.d(iA, iA);
                    if (!G0.I.a(jD, p6.j().f3454b)) {
                        C0036s0 c0036s1 = p6.f1123d;
                        if ((c0036s1 == null || ((Boolean) c0036s1.f431q.getValue()).booleanValue()) && (aVar = p6.f1127h) != null) {
                            ((p069n0.b) aVar).a();
                        }
                        p6.f1122c.invoke(P.c(p6.j().f3453a, jD));
                        break;
                    }
                }
                break;
            default:
                P p7 = this.f1117b;
                if (p7.h() && p7.j().f3453a.f1494h.length() != 0) {
                    p7.f1132n = p030f0.c.h(p7.f1132n, j4);
                    C0036s0 c0036s2 = p7.f1123d;
                    if (c0036s2 != null && (a1VarD2 = c0036s2.d()) != null) {
                        p7.f1134p.setValue(new p030f0.c(p030f0.c.h(p7.f1130l, p7.f1132n)));
                        Integer num2 = p7.f1131m;
                        C0074p c0074p = C0075q.f1203e;
                        if (num2 == null) {
                            p030f0.c cVarG2 = p7.g();
                            E4.k.c(cVarG2);
                            if (a1VarD2.c(cVarG2.f8837a)) {
                                num = p7.f1131m;
                                if (num != null) {
                                    iB = num.intValue();
                                } else {
                                    iB = a1VarD2.b(p7.f1130l, false);
                                }
                                p030f0.c cVarG3 = p7.g();
                                E4.k.c(cVarG3);
                                int iB2 = a1VarD2.b(cVarG3.f8837a, false);
                                if (p7.f1131m == null || iB != iB2) {
                                    M0.w wVarJ = p7.j();
                                    p030f0.c cVarG4 = p7.g();
                                    E4.k.c(cVarG4);
                                    P.a(p7, wVarJ, cVarG4.f8837a, false, false, c0074p, true);
                                }
                            } else {
                                int iA2 = p7.f1121b.a(a1VarD2.b(p7.f1130l, true));
                                M0.q qVar2 = p7.f1121b;
                                p030f0.c cVarG5 = p7.g();
                                E4.k.c(cVarG5);
                                if (iA2 == qVar2.a(a1VarD2.b(cVarG5.f8837a, true))) {
                                    c0074p = C0075q.f1202d;
                                }
                                M0.w wVarJ2 = p7.j();
                                p030f0.c cVarG6 = p7.g();
                                E4.k.c(cVarG6);
                                P.a(p7, wVarJ2, cVarG6.f8837a, false, false, c0074p, true);
                            }
                        } else {
                            num = p7.f1131m;
                            if (num != null) {
                                iB = num.intValue();
                            } else {
                                iB = a1VarD2.b(p7.f1130l, false);
                            }
                            p030f0.c cVarG7 = p7.g();
                            E4.k.c(cVarG7);
                            int iB3 = a1VarD2.b(cVarG7.f8837a, false);
                            if (p7.f1131m == null) {
                            }
                            M0.w wVarJ3 = p7.j();
                            p030f0.c cVarG8 = p7.g();
                            E4.k.c(cVarG8);
                            P.a(p7, wVarJ3, cVarG8.f8837a, false, false, c0074p, true);
                        }
                        int i = G0.I.f1469c;
                    }
                    p7.p(false);
                    break;
                }
                break;
        }
    }

    public void h() {
        P p6 = this.f1117b;
        p6.f1133o.setValue(null);
        p6.f1134p.setValue(null);
        p6.p(true);
        p6.f1131m = null;
        boolean zB = G0.I.b(p6.j().f3454b);
        p6.n(zB ? EnumC0011f0.f313j : EnumC0011f0.i);
        C0036s0 c0036s0 = p6.f1123d;
        if (c0036s0 != null) {
            c0036s0.f427m.setValue(Boolean.valueOf(!zB && p027e3.a.l0(p6, true)));
        }
        C0036s0 c0036s1 = p6.f1123d;
        if (c0036s1 != null) {
            c0036s1.f428n.setValue(Boolean.valueOf(!zB && p027e3.a.l0(p6, false)));
        }
        C0036s0 c0036s2 = p6.f1123d;
        if (c0036s2 == null) {
            return;
        }
        c0036s2.f429o.setValue(Boolean.valueOf(zB && p027e3.a.l0(p6, true)));
    }

    @Override // B.D0
    public final void onCancel() {
        switch (this.f1116a) {
            case 0:
                break;
            default:
                h();
                break;
        }
    }

    @Override // B.D0
    public final void onStop() {
        switch (this.f1116a) {
            case 0:
                P p6 = this.f1117b;
                p6.f1133o.setValue(null);
                p6.f1134p.setValue(null);
                break;
            default:
                h();
                break;
        }
    }
}
