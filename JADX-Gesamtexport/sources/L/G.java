package L;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import p123x.AbstractC1084q;
import p123x.C1086t;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class G extends E4.l implements D4.e {
    public static final G i = new G(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final G f2282j = new G(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final G f2283k = new G(2, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G f2284l = new G(2, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final G f2285m = new G(2, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final G f2286n = new G(2, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G f2287o = new G(2, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G f2288p = new G(2, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G f2289q = new G(2, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i3, int i6) {
        super(i3);
        this.f2290h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2290h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                }
                return p084p4.x.f10867a;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                }
                return p084p4.x.f10867a;
            case 2:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o3.B()) {
                    c0230o3.P();
                }
                return p084p4.x.f10867a;
            case 3:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o4.B()) {
                    c0230o4.P();
                }
                return p084p4.x.f10867a;
            case 4:
                C0230o c0230o5 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o5.B()) {
                    c0230o5.P();
                }
                return p084p4.x.f10867a;
            case 5:
                return Integer.valueOf(((p113v0.E) obj).d(((Number) obj2).intValue()));
            case 6:
                return Integer.valueOf(((p113v0.E) obj).Y(((Number) obj2).intValue()));
            case 7:
                return Integer.valueOf(((p113v0.E) obj).Z(((Number) obj2).intValue()));
            case 8:
                return Integer.valueOf(((p113v0.E) obj).U(((Number) obj2).intValue()));
            default:
                C0230o c0230o6 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    Z.o oVarA = androidx.compose.foundation.layout.c.a(Z.l.f5957a, M.i.f3202d, M.i.f3200b);
                    Z.g gVar = Z.b.f5936l;
                    c0230o6.W(733328855);
                    C1086t c1086tF = AbstractC1084q.f(gVar, false, c0230o6, 6);
                    c0230o6.W(-1323940314);
                    int i3 = c0230o6.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o6.m();
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    V.a aVarH = p113v0.U.h(oVarA);
                    c0230o6.Z();
                    if (c0230o6.f3743O) {
                        c0230o6.l(c1106n);
                    } else {
                        c0230o6.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o6, c1086tF);
                    C0208d.R(C1101i.f14040d, c0230o6, interfaceC0225l0M);
                    C1100h c1100h = C1101i.f14042f;
                    if (c0230o6.f3743O || !E4.k.a(c0230o6.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o6, i3, c1100h);
                    }
                    AbstractC0013g0.p(0, aVarH, new N.C0(c0230o6), c0230o6, 2058660585);
                    N3.Q.f4086c.d(c0230o6, 0);
                    c0230o6.p(false);
                    c0230o6.p(true);
                    c0230o6.p(false);
                    c0230o6.p(false);
                }
                return p084p4.x.f10867a;
        }
    }
}
