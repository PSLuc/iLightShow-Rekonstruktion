package E;

import E4.l;
import G0.C0110f;
import G0.F;
import G0.G;
import G0.J;
import java.util.List;
import p035g0.r;
import p124x0.AbstractC1098f;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f873h;
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i) {
        super(1);
        this.f873h = i;
        this.i = hVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        G g6;
        switch (this.f873h) {
            case 0:
                List list = (List) obj;
                h hVar = this.i;
                G g7 = hVar.y0().f849n;
                if (g7 != null) {
                    F f6 = g7.f1458a;
                    g6 = new G(new F(f6.f1449a, J.e(hVar.f881v, r.f9085l, 0L, null, 0L, 0, 0L, 16777214), f6.f1451c, f6.f1452d, f6.f1453e, f6.f1454f, f6.f1455g, f6.f1456h, f6.i, f6.f1457j), g7.f1459b, g7.f1460c);
                    list.add(g6);
                } else {
                    g6 = null;
                }
                return Boolean.valueOf(g6 != null);
            case 1:
                C0110f c0110f = (C0110f) obj;
                h hVar2 = this.i;
                f fVar = hVar2.I;
                if (fVar == null) {
                    f fVar2 = new f(hVar2.f880u, c0110f);
                    d dVar = new d(c0110f, hVar2.f881v, hVar2.f882w, hVar2.f884y, hVar2.f885z, hVar2.f874A, hVar2.f875B, hVar2.f876C);
                    dVar.c(hVar2.y0().f846k);
                    fVar2.f872d = dVar;
                    hVar2.I = fVar2;
                } else if (!E4.k.a(c0110f, fVar.f870b)) {
                    fVar.f870b = c0110f;
                    d dVar2 = fVar.f872d;
                    if (dVar2 != null) {
                        J j4 = hVar2.f881v;
                        L0.d dVar3 = hVar2.f882w;
                        int i = hVar2.f884y;
                        boolean z5 = hVar2.f885z;
                        int i3 = hVar2.f874A;
                        int i6 = hVar2.f875B;
                        List list2 = hVar2.f876C;
                        dVar2.f837a = c0110f;
                        dVar2.f838b = j4;
                        dVar2.f839c = dVar3;
                        dVar2.f840d = i;
                        dVar2.f841e = z5;
                        dVar2.f842f = i3;
                        dVar2.f843g = i6;
                        dVar2.f844h = list2;
                        dVar2.f847l = null;
                        dVar2.f849n = null;
                        dVar2.f851p = -1;
                        dVar2.f850o = -1;
                    }
                }
                AbstractC1098f.n(hVar2);
                AbstractC1098f.m(hVar2);
                AbstractC1098f.l(hVar2);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                h hVar3 = this.i;
                f fVar3 = hVar3.I;
                if (fVar3 == null) {
                    return Boolean.FALSE;
                }
                D4.c cVar = hVar3.f878E;
                if (cVar != null) {
                    cVar.invoke(fVar3);
                }
                f fVar4 = hVar3.I;
                if (fVar4 != null) {
                    fVar4.f871c = zBooleanValue;
                }
                AbstractC1098f.n(hVar3);
                AbstractC1098f.m(hVar3);
                AbstractC1098f.l(hVar3);
                return Boolean.TRUE;
        }
    }
}
