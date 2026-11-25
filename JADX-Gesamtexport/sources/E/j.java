package E;

import E4.l;
import G0.C0110f;
import G0.F;
import G0.G;
import G0.J;
import G0.n;
import G0.p;
import java.util.List;
import p015c2.AbstractC0473d;
import p035g0.r;
import p089q4.u;
import p124x0.AbstractC1098f;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f890h;
    public final /* synthetic */ k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i) {
        super(1);
        this.f890h = i;
        this.i = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00cc  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        S0.b bVar;
        G g6;
        switch (this.f890h) {
            case 0:
                List list = (List) obj;
                k kVar = this.i;
                e eVarY0 = kVar.y0();
                J jE = J.e(kVar.f897v, r.f9085l, 0L, null, 0L, 0, 0L, 16777214);
                S0.k kVar2 = eVarY0.f865o;
                G g7 = null;
                if (kVar2 == null || (bVar = eVarY0.i) == null) {
                    g6 = null;
                } else {
                    C0110f c0110f = new C0110f(eVarY0.f852a, null, 6);
                    if (eVarY0.f860j == null || eVarY0.f864n == null) {
                        g6 = null;
                    } else {
                        long jA = S0.a.a(eVarY0.f866p, 0, 0, 0, 0, 10);
                        u uVar = u.f11237h;
                        int i = eVarY0.f857f;
                        boolean z5 = eVarY0.f856e;
                        int i3 = eVarY0.f855d;
                        L0.d dVar = eVarY0.f854c;
                        g6 = new G(new F(c0110f, jE, uVar, i, z5, i3, bVar, kVar2, dVar, jA), new n(new p(c0110f, jE, uVar, bVar, dVar), jA, eVarY0.f857f, eVarY0.f855d == 2), eVarY0.f862l);
                    }
                }
                if (g6 != null) {
                    list.add(g6);
                    g7 = g6;
                }
                return Boolean.valueOf(g7 != null);
            case 1:
                String str = ((C0110f) obj).f1494h;
                k kVar3 = this.i;
                i iVar = kVar3.f895E;
                if (iVar == null) {
                    i iVar2 = new i(kVar3.f896u, str);
                    e eVar = new e(str, kVar3.f897v, kVar3.f898w, kVar3.f899x, kVar3.f900y, kVar3.f901z, kVar3.f891A);
                    eVar.c(kVar3.y0().i);
                    iVar2.f889d = eVar;
                    kVar3.f895E = iVar2;
                } else if (!E4.k.a(str, iVar.f887b)) {
                    iVar.f887b = str;
                    e eVar2 = iVar.f889d;
                    if (eVar2 != null) {
                        J j4 = kVar3.f897v;
                        L0.d dVar2 = kVar3.f898w;
                        int i6 = kVar3.f899x;
                        boolean z6 = kVar3.f900y;
                        int i7 = kVar3.f901z;
                        int i8 = kVar3.f891A;
                        eVar2.f852a = str;
                        eVar2.f853b = j4;
                        eVar2.f854c = dVar2;
                        eVar2.f855d = i6;
                        eVar2.f856e = z6;
                        eVar2.f857f = i7;
                        eVar2.f858g = i8;
                        eVar2.f860j = null;
                        eVar2.f864n = null;
                        eVar2.f865o = null;
                        eVar2.f867q = -1;
                        eVar2.f868r = -1;
                        eVar2.f866p = p081p0.c.W(0, 0, 0, 0);
                        eVar2.f862l = AbstractC0473d.b(0, 0);
                        eVar2.f861k = false;
                    }
                }
                AbstractC1098f.n(kVar3);
                AbstractC1098f.m(kVar3);
                AbstractC1098f.l(kVar3);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                k kVar4 = this.i;
                i iVar3 = kVar4.f895E;
                if (iVar3 == null) {
                    return Boolean.FALSE;
                }
                iVar3.f888c = zBooleanValue;
                AbstractC1098f.n(kVar4);
                AbstractC1098f.m(kVar4);
                AbstractC1098f.l(kVar4);
                return Boolean.TRUE;
        }
    }
}
