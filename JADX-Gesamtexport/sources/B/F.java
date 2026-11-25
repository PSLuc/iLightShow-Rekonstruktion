package B;

import L.AbstractC0176s1;
import L.C0188w1;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import p113v0.InterfaceC1033p;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f76h = 0;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f77j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f78k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f79l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f80m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f81n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f82o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f83p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(F.P p6, C0036s0 c0036s0, boolean z5, D4.c cVar, M0.w wVar, M0.q qVar, S0.b bVar, int i) {
        super(2);
        this.f78k = p6;
        this.f79l = c0036s0;
        this.i = z5;
        this.f80m = (E4.l) cVar;
        this.f81n = wVar;
        this.f82o = qVar;
        this.f83p = bVar;
        this.f77j = i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Type inference failed for: r2v1, types: [D4.c, E4.l] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        boolean z5;
        switch (this.f76h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    M0.w wVar = (M0.w) this.f81n;
                    M0.q qVar = (M0.q) this.f82o;
                    C0036s0 c0036s0 = (C0036s0) this.f79l;
                    E e6 = new E(c0036s0, (E4.l) this.f80m, wVar, qVar, (S0.b) this.f83p, this.f77j);
                    Z.l lVar = Z.l.f5957a;
                    int i = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                    Z.o oVarC = Z.a.c(c0230o, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, e6);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o, i, c1100h);
                    }
                    C0208d.R(C1101i.f14039c, c0230o, oVarC);
                    c0230o.p(true);
                    EnumC0011f0 enumC0011f0A = c0036s0.a();
                    EnumC0011f0 enumC0011f0 = EnumC0011f0.f312h;
                    boolean z6 = this.i;
                    if (enumC0011f0A != enumC0011f0 && c0036s0.c() != null) {
                        InterfaceC1033p interfaceC1033pC = c0036s0.c();
                        E4.k.c(interfaceC1033pC);
                        z5 = interfaceC1033pC.K() && z6;
                    }
                    F.P p6 = (F.P) this.f78k;
                    AbstractC0029o0.h(p6, z5, c0230o, 0);
                    if (c0036s0.a() == EnumC0011f0.f313j && z6) {
                        c0230o.V(-2032274);
                        AbstractC0029o0.g(p6, c0230o, 0);
                        c0230o.p(false);
                    } else {
                        c0230o.V(-1955394);
                        c0230o.p(false);
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f77j | 1);
                V.a aVar = (V.a) this.f82o;
                V.a aVar2 = (V.a) this.f83p;
                AbstractC0176s1.g((C0188w1) this.f78k, (Z.o) this.f79l, this.i, (L.O0) this.f80m, (p117w.m) this.f81n, aVar, aVar2, (C0230o) obj, iV);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C0188w1 c0188w1, Z.o oVar, boolean z5, L.O0 o6, p117w.m mVar, V.a aVar, V.a aVar2, int i) {
        super(2);
        this.f78k = c0188w1;
        this.f79l = oVar;
        this.i = z5;
        this.f80m = o6;
        this.f81n = mVar;
        this.f82o = aVar;
        this.f83p = aVar2;
        this.f77j = i;
    }
}
