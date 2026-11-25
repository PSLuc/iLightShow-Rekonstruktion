package L;

import G0.C0113i;
import N.C0230o;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p035g0.AbstractC0712m;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2463h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2466l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(float f6, long j4, V.a aVar, boolean z5, long j6) {
        super(2);
        this.f2463h = f6;
        this.i = j4;
        this.f2464j = aVar;
        this.f2465k = z5;
        this.f2466l = j6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        G0.w wVar;
        G0.v vVar;
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            N.W0 w6 = h2.f2777a;
            G0.J j4 = ((g2) c0230o.k(w6)).f2754j;
            G0.J j6 = ((g2) c0230o.k(w6)).f2756l;
            G0.C c6 = j4.f1472a;
            G0.C c7 = j6.f1472a;
            R0.n nVar = G0.D.f1446d;
            R0.n nVar2 = c6.f1428a;
            R0.n nVar3 = c7.f1428a;
            boolean z5 = nVar2 instanceof R0.b;
            R0.n bVar = R0.l.f4751a;
            float f6 = this.f2463h;
            if (!z5 && !(nVar3 instanceof R0.b)) {
                long jM = p035g0.H.m(nVar2.a(), nVar3.a(), f6);
                if (jM != 16) {
                    bVar = new R0.c(jM);
                }
            } else if (z5 && (nVar3 instanceof R0.b)) {
                AbstractC0712m abstractC0712m = (AbstractC0712m) G0.D.b(((R0.b) nVar2).f4731a, ((R0.b) nVar3).f4731a, f6);
                float fG = S1.V.G(((R0.b) nVar2).f4732b, ((R0.b) nVar3).f4732b, f6);
                if (abstractC0712m != null) {
                    if (abstractC0712m instanceof p035g0.O) {
                        long jI = AbstractC0473d.I(fG, ((p035g0.O) abstractC0712m).f9050a);
                        if (jI != 16) {
                            bVar = new R0.c(jI);
                        }
                    } else {
                        if (!(abstractC0712m instanceof p035g0.K)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new R0.b((p035g0.K) abstractC0712m, fG);
                    }
                }
            } else {
                bVar = (R0.n) G0.D.b(nVar2, nVar3, f6);
            }
            R0.n nVar4 = bVar;
            L0.p pVar = (L0.p) G0.D.b(c6.f1433f, c7.f1433f, f6);
            long jC = G0.D.c(c6.f1429b, c7.f1429b, f6);
            L0.k kVar = c6.f1430c;
            if (kVar == null) {
                kVar = L0.k.f3025j;
            }
            L0.k kVar2 = c7.f1430c;
            if (kVar2 == null) {
                kVar2 = L0.k.f3025j;
            }
            L0.k kVar3 = new L0.k(p081p0.c.O(S1.V.H(f6, kVar.f3028h, kVar2.f3028h), 1, 1000));
            L0.i iVar = (L0.i) G0.D.b(c6.f1431d, c7.f1431d, f6);
            L0.j jVar = (L0.j) G0.D.b(c6.f1432e, c7.f1432e, f6);
            String str = (String) G0.D.b(c6.f1434g, c7.f1434g, f6);
            long jC2 = G0.D.c(c6.f1435h, c7.f1435h, f6);
            R0.a aVar = c6.i;
            float f7 = aVar != null ? aVar.f4730a : 0.0f;
            R0.a aVar2 = c7.i;
            float fG2 = S1.V.G(f7, aVar2 != null ? aVar2.f4730a : 0.0f, f6);
            R0.o oVar = R0.o.f4753c;
            R0.o oVar2 = c6.f1436j;
            if (oVar2 == null) {
                oVar2 = oVar;
            }
            R0.o oVar3 = c7.f1436j;
            if (oVar3 != null) {
                oVar = oVar3;
            }
            R0.o oVar4 = new R0.o(S1.V.G(oVar2.f4754a, oVar.f4754a, f6), S1.V.G(oVar2.f4755b, oVar.f4755b, f6));
            N0.b bVar2 = (N0.b) G0.D.b(c6.f1437k, c7.f1437k, f6);
            long jM2 = p035g0.H.m(c6.f1438l, c7.f1438l, f6);
            R0.j jVar2 = (R0.j) G0.D.b(c6.f1439m, c7.f1439m, f6);
            p035g0.L l6 = c6.f1440n;
            if (l6 == null) {
                l6 = new p035g0.L();
            }
            p035g0.L l7 = c7.f1440n;
            if (l7 == null) {
                l7 = new p035g0.L();
            }
            p035g0.L l8 = new p035g0.L(p035g0.H.m(l6.f9035a, l7.f9035a, f6), p081p0.c.u0(l6.f9036b, l7.f9036b, f6), S1.V.G(l6.f9037c, l7.f9037c, f6));
            G0.w wVar2 = c6.f1441o;
            if (wVar2 == null && c7.f1441o == null) {
                wVar = null;
            } else {
                if (wVar2 == null) {
                    wVar2 = G0.w.f1549a;
                }
                wVar = wVar2;
            }
            G0.C c8 = new G0.C(nVar4, jC, kVar3, iVar, jVar, pVar, str, jC2, new R0.a(fG2), oVar4, bVar2, jM2, jVar2, l8, wVar, (p044i0.e) G0.D.b(c6.f1442p, c7.f1442p, f6));
            int i = G0.u.f1546b;
            G0.t tVar = j4.f1473b;
            R0.i iVar2 = new R0.i(tVar.f1537a);
            G0.t tVar2 = j6.f1473b;
            int i3 = ((R0.i) G0.D.b(iVar2, new R0.i(tVar2.f1537a), f6)).f4745a;
            int i6 = ((R0.k) G0.D.b(new R0.k(tVar.f1538b), new R0.k(tVar2.f1538b), f6)).f4750a;
            long jC3 = G0.D.c(tVar.f1539c, tVar2.f1539c, f6);
            R0.p pVar2 = tVar.f1540d;
            if (pVar2 == null) {
                pVar2 = R0.p.f4756c;
            }
            R0.p pVar3 = tVar2.f1540d;
            if (pVar3 == null) {
                pVar3 = R0.p.f4756c;
            }
            R0.p pVar4 = new R0.p(G0.D.c(pVar2.f4757a, pVar3.f4757a, f6), G0.D.c(pVar2.f4758b, pVar3.f4758b, f6));
            G0.v vVar2 = tVar.f1541e;
            G0.v vVar3 = tVar2.f1541e;
            if (vVar2 == null && vVar3 == null) {
                vVar = null;
            } else {
                G0.v vVar4 = G0.v.f1547b;
                if (vVar2 == null) {
                    vVar2 = vVar4;
                }
                if (vVar3 == null) {
                    vVar3 = vVar4;
                }
                boolean z6 = vVar2.f1548a;
                boolean z7 = vVar3.f1548a;
                if (z6 != z7) {
                    ((C0113i) G0.D.b(new C0113i(), new C0113i(), f6)).getClass();
                    vVar2 = new G0.v(((Boolean) G0.D.b(Boolean.valueOf(z6), Boolean.valueOf(z7), f6)).booleanValue());
                }
                vVar = vVar2;
            }
            G0.J j7 = new G0.J(c8, new G0.t(i3, i6, jC3, pVar4, vVar, (R0.g) G0.D.b(tVar.f1542f, tVar2.f1542f, f6), ((R0.e) G0.D.b(new R0.e(tVar.f1543g), new R0.e(tVar2.f1543g), f6)).f4736a, ((R0.d) G0.D.b(new R0.d(tVar.f1544h), new R0.d(tVar2.f1544h), f6)).f4734a, (R0.q) G0.D.b(tVar.i, tVar2.i, f6)));
            if (this.f2465k) {
                j7 = G0.J.a(j7, this.f2466l, 0L, null, null, 0L, 0L, null, 16777214);
            }
            S1.b(this.i, j7, this.f2464j, c0230o, 0, 0);
        }
        return p084p4.x.f10867a;
    }
}
