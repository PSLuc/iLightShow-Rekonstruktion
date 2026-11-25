package B;

import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: B.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f275h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f276j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0000a(int i, long j4, Object obj) {
        super(2);
        this.f275h = i;
        this.i = j4;
        this.f276j = obj;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        switch (this.f275h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    long j4 = this.i;
                    if (j4 != 9205357640488583168L) {
                        c0230o.V(1828881000);
                        Z.o oVarG = androidx.compose.foundation.layout.c.g((Z.o) this.f276j, S0.g.b(j4), S0.g.a(j4), 0.0f, 0.0f, 12);
                        p113v0.F fE = AbstractC1084q.e(Z.b.i, false);
                        int i = c0230o.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                        Z.o oVarC = Z.a.c(c0230o, oVarG);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n = C1101i.f14038b;
                        c0230o.Z();
                        if (c0230o.f3743O) {
                            c0230o.l(c1106n);
                        } else {
                            c0230o.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o, fE);
                        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                        C1100h c1100h = C1101i.f14042f;
                        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                            p012c.k.y(i, c0230o, i, c1100h);
                        }
                        C0208d.R(C1101i.f14039c, c0230o, oVarC);
                        AbstractC0012g.b(null, c0230o, 0, 1);
                        c0230o.p(true);
                        c0230o.p(false);
                    } else {
                        c0230o.V(1829217412);
                        AbstractC0012g.b((Z.o) this.f276j, c0230o, 0, 0);
                        c0230o.p(false);
                    }
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    C0208d.a(L.K.f2350a.a(new p035g0.r(this.i)), (D4.e) this.f276j, c0230o2, 8);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
