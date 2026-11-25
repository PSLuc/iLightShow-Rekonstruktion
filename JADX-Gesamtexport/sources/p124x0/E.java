package p124x0;

import E4.k;
import java.util.HashMap;
import java.util.Map;
import p035g0.J;
import p081p0.c;
import p089q4.z;
import p090r.v;
import p113v0.AbstractC1020c;
import p113v0.C1029l;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f13853a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1093a f13860h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13861j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13854b = true;
    public final HashMap i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public E(InterfaceC1093a interfaceC1093a, int i) {
        this.f13861j = i;
        this.f13853a = (N) interfaceC1093a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [D4.e, E4.i] */
    /* JADX WARN: Type inference failed for: r8v4, types: [v0.N, x0.a] */
    public static final void a(E e6, C1029l c1029l, int i, Y y2) {
        e6.getClass();
        float f6 = i;
        long jY = c.y(f6, f6);
        while (true) {
            switch (e6.f13861j) {
                case 0:
                    J j4 = Y.f13977L;
                    jY = y2.e1(jY);
                    break;
                default:
                    N nK0 = y2.K0();
                    k.c(nK0);
                    long j6 = nK0.f13940t;
                    jY = p030f0.c.h(c.y((int) (j6 >> 32), (int) (j6 & 4294967295L)), jY);
                    break;
            }
            y2 = y2.f13991u;
            k.c(y2);
            if (y2.equals(e6.f13853a.l())) {
                int iRound = Math.round(c1029l instanceof C1029l ? p030f0.c.e(jY) : p030f0.c.d(jY));
                HashMap map = e6.i;
                if (map.containsKey(c1029l)) {
                    int iIntValue = ((Number) z.R(c1029l, map)).intValue();
                    C1029l c1029l2 = AbstractC1020c.f13160a;
                    iRound = ((Number) c1029l.f13173a.d(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                }
                map.put(c1029l, Integer.valueOf(iRound));
                return;
            }
            if (e6.b(y2).containsKey(c1029l)) {
                float fC = e6.c(y2, c1029l);
                jY = c.y(fC, fC);
            }
        }
    }

    public final Map b(Y y2) {
        switch (this.f13861j) {
            case 0:
                return y2.v0().b();
            default:
                N nK0 = y2.K0();
                k.c(nK0);
                return nK0.v0().b();
        }
    }

    public final int c(Y y2, C1029l c1029l) {
        switch (this.f13861j) {
            case 0:
                return y2.e0(c1029l);
            default:
                N nK0 = y2.K0();
                k.c(nK0);
                return nK0.e0(c1029l);
        }
    }

    public final boolean d() {
        return this.f13855c || this.f13857e || this.f13858f || this.f13859g;
    }

    public final boolean e() {
        h();
        return this.f13860h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v0.N, x0.a] */
    public final void f() {
        this.f13854b = true;
        ?? r6 = this.f13853a;
        InterfaceC1093a interfaceC1093aR = r6.r();
        if (interfaceC1093aR == null) {
            return;
        }
        if (this.f13855c) {
            interfaceC1093aR.X();
        } else if (this.f13857e || this.f13856d) {
            interfaceC1093aR.requestLayout();
        }
        if (this.f13858f) {
            r6.X();
        }
        if (this.f13859g) {
            r6.requestLayout();
        }
        interfaceC1093aR.b().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [v0.N, x0.a] */
    public final void g() {
        HashMap map = this.i;
        map.clear();
        v vVar = new v(11, this);
        ?? r6 = this.f13853a;
        r6.d0(vVar);
        map.putAll(b(r6.l()));
        this.f13854b = false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [v0.N, x0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x0.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        InterfaceC1093a interfaceC1093a;
        E eB;
        E eB2;
        boolean zD = d();
        ?? r6 = this.f13853a;
        ?? r7 = r6;
        if (!zD) {
            InterfaceC1093a interfaceC1093aR = r6.r();
            if (interfaceC1093aR == null) {
                return;
            }
            InterfaceC1093a interfaceC1093a2 = interfaceC1093aR.b().f13860h;
            if (interfaceC1093a2 == null) {
                interfaceC1093a = this.f13860h;
                if (interfaceC1093a != null) {
                    return;
                } else {
                    return;
                }
            }
            boolean zD2 = interfaceC1093a2.b().d();
            r7 = interfaceC1093a2;
            if (!zD2) {
                interfaceC1093a = this.f13860h;
                if (interfaceC1093a != null || interfaceC1093a.b().d()) {
                    return;
                }
                InterfaceC1093a interfaceC1093aR2 = interfaceC1093a.r();
                if (interfaceC1093aR2 != null && (eB2 = interfaceC1093aR2.b()) != null) {
                    eB2.h();
                }
                InterfaceC1093a interfaceC1093aR3 = interfaceC1093a.r();
                r7 = (interfaceC1093aR3 == null || (eB = interfaceC1093aR3.b()) == null) ? 0 : eB.f13860h;
            }
        }
        this.f13860h = r7;
    }
}
