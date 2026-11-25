package L;

import B.AbstractC0013g0;
import B.C0003b0;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1086t;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: L.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127c extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D4.e f2637h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V.a f2641m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127c(D4.e eVar, V.a aVar, long j4, long j6, long j7, long j8, V.a aVar2) {
        super(2);
        this.f2637h = eVar;
        this.i = aVar;
        this.f2638j = j6;
        this.f2639k = j7;
        this.f2640l = j8;
        this.f2641m = aVar2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        byte b6 = 0;
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            Z.o oVarF = androidx.compose.foundation.layout.a.f(Z.l.f5957a, AbstractC0136f.f2716c);
            c0230o.W(-483455358);
            C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o, 0);
            c0230o.W(-1323940314);
            int i = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            V.a aVarH = p113v0.U.h(oVarF);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o, c1090xA);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                p012c.k.y(i, c0230o, i, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH, new N.C0(c0230o), c0230o, 2058660585);
            c0230o.W(76440827);
            c0230o.p(false);
            c0230o.W(76441222);
            D4.e eVar = this.f2637h;
            if (eVar != null) {
                L.f(this.f2638j, h2.a((g2) c0230o.k(h2.f2777a), M.d.f3187d), V.b.b(c0230o, 434448772, new C0003b0(5, eVar)), c0230o, 384);
            }
            c0230o.p(false);
            c0230o.W(76442054);
            V.a aVar = this.i;
            if (aVar != null) {
                L.f(this.f2639k, h2.a((g2) c0230o.k(h2.f2777a), M.d.f3189f), V.b.b(c0230o, -796843771, new C0124b(aVar, b6, b6)), c0230o, 384);
            }
            c0230o.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Z.b.f5945u);
            c0230o.W(733328855);
            C1086t c1086tF = AbstractC1084q.f(Z.b.f5933h, false, c0230o, 0);
            c0230o.W(-1323940314);
            int i3 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
            V.a aVarH2 = p113v0.U.h(horizontalAlignElement);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h, c0230o, c1086tF);
            C0208d.R(c1100h2, c0230o, interfaceC0225l0M2);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i3))) {
                p012c.k.y(i3, c0230o, i3, c1100h3);
            }
            AbstractC0013g0.p(0, aVarH2, new N.C0(c0230o), c0230o, 2058660585);
            g2 g2Var = (g2) c0230o.k(h2.f2777a);
            float f6 = M.d.f3184a;
            L.f(this.f2640l, h2.a(g2Var, 10), this.f2641m, c0230o, 0);
            AbstractC0013g0.q(c0230o, false, true, false, false);
            AbstractC0013g0.q(c0230o, false, true, false, false);
        }
        return p084p4.x.f10867a;
    }
}
