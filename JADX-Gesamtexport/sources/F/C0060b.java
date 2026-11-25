package F;

import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.InterfaceC0225l0;
import p123x.AbstractC1070c;
import p123x.C1069b;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: F.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060b extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1157h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.o f1158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0070l f1159k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060b(long j4, boolean z5, Z.o oVar, InterfaceC0070l interfaceC0070l) {
        super(2);
        this.f1157h = j4;
        this.i = z5;
        this.f1158j = oVar;
        this.f1159k = interfaceC0070l;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            long j4 = this.f1157h;
            N.U u6 = C0222k.f3714a;
            InterfaceC0070l interfaceC0070l = this.f1159k;
            boolean z5 = this.i;
            if (j4 != 9205357640488583168L) {
                c0230o.V(-837727128);
                C1069b c1069b = z5 ? AbstractC1070c.f13757b : AbstractC1070c.f13756a;
                Z.o oVarG = androidx.compose.foundation.layout.c.g(this.f1158j, S0.g.b(j4), S0.g.a(j4), 0.0f, 0.0f, 12);
                p123x.U uA = p123x.T.a(c1069b, Z.b.f5941q, c0230o, 0);
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
                C0208d.R(C1101i.f14041e, c0230o, uA);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                C1100h c1100h = C1101i.f14042f;
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i))) {
                    p012c.k.y(i, c0230o, i, c1100h);
                }
                C0208d.R(C1101i.f14039c, c0230o, oVarC);
                Z.l lVar = Z.l.f5957a;
                boolean zH = c0230o.h(interfaceC0070l);
                Object objK = c0230o.K();
                if (zH || objK == u6) {
                    objK = new C0059a(interfaceC0070l, 0);
                    c0230o.f0(objK);
                }
                S1.V.n(lVar, (D4.a) objK, z5, c0230o, 6);
                c0230o.p(true);
                c0230o.p(false);
            } else {
                c0230o.V(-836867312);
                boolean zH2 = c0230o.h(interfaceC0070l);
                Object objK2 = c0230o.K();
                if (zH2 || objK2 == u6) {
                    objK2 = new C0059a(interfaceC0070l, 1);
                    c0230o.f0(objK2);
                }
                S1.V.n(this.f1158j, (D4.a) objK2, z5, c0230o, 0);
                c0230o.p(false);
            }
        }
        return p084p4.x.f10867a;
    }
}
