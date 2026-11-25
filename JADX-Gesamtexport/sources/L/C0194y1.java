package L;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import p101t.C0952u;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: L.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0194y1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z.o f2989h;
    public final /* synthetic */ p035g0.M i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f2991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0952u f2992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V.a f2994n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194y1(Z.o oVar, p035g0.M m6, long j4, float f6, C0952u c0952u, float f7, V.a aVar) {
        super(2);
        this.f2989h = oVar;
        this.i = m6;
        this.f2990j = j4;
        this.f2991k = f6;
        this.f2992l = c0952u;
        this.f2993m = f7;
        this.f2994n = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        p084p4.x xVar = p084p4.x.f10867a;
        if (iIntValue == 2 && c0230o.B()) {
            c0230o.P();
            return xVar;
        }
        long jD = A1.d(this.f2990j, this.f2991k, c0230o);
        float fY = ((S0.b) c0230o.k(AbstractC1124c0.f14367f)).y(this.f2993m);
        Z.o oVarA = p091r0.u.a(E0.i.a(A1.c(this.f2989h, this.i, jD, this.f2992l, fY), false, C0189x.f2969l), xVar, new C0191x1(2, null));
        c0230o.W(733328855);
        C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, true, c0230o, 48);
        c0230o.W(-1323940314);
        int i = c0230o.f3744P;
        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
        InterfaceC1102j.f14043g.getClass();
        C1106n c1106n = C1101i.f14038b;
        V.a aVarH = p113v0.U.h(oVarA);
        c0230o.Z();
        if (c0230o.f3743O) {
            c0230o.l(c1106n);
        } else {
            c0230o.i0();
        }
        C0208d.R(C1101i.f14041e, c0230o, c1086tF);
        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
        C1100h c1100h = C1101i.f14042f;
        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
            p012c.k.y(i, c0230o, i, c1100h);
        }
        AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
        this.f2994n.d(c0230o, 0);
        c0230o.p(false);
        c0230o.p(true);
        c0230o.p(false);
        c0230o.p(false);
        return xVar;
    }
}
