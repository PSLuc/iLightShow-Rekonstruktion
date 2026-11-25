package E;

import B.AbstractC0029o0;
import G0.C0110f;
import G0.F;
import G0.G;
import G0.J;
import G0.n;
import G0.p;
import java.util.List;
import p015c2.AbstractC0473d;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0110f f837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L0.d f839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f844h;
    public b i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S0.b f846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S0.k f848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public G f849n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f845j = a.f825a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f850o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f851p = -1;

    public d(C0110f c0110f, J j4, L0.d dVar, int i, boolean z5, int i3, int i6, List list) {
        this.f837a = c0110f;
        this.f838b = j4;
        this.f839c = dVar;
        this.f840d = i;
        this.f841e = z5;
        this.f842f = i3;
        this.f843g = i6;
        this.f844h = list;
    }

    public final int a(int i, S0.k kVar) {
        int i3 = this.f850o;
        int i6 = this.f851p;
        if (i == i3 && i3 != -1) {
            return i6;
        }
        int iN = AbstractC0029o0.n(b(p081p0.c.t(0, i, 0, Integer.MAX_VALUE), kVar).f1517e);
        this.f850o = i;
        this.f851p = iN;
        return iN;
    }

    public final n b(long j4, S0.k kVar) {
        p pVarD = d(kVar);
        long jT = p006b.a.t(j4, this.f841e, this.f840d, pVarD.c());
        boolean z5 = this.f841e;
        int i = this.f840d;
        int i3 = this.f842f;
        if ((!z5 && i == 2) || i3 < 1) {
            i3 = 1;
        }
        return new n(pVarD, jT, i3, i == 2);
    }

    public final void c(S0.b bVar) {
        long jA;
        S0.b bVar2 = this.f846k;
        if (bVar != null) {
            int i = a.f826b;
            jA = a.a(bVar.a(), bVar.n());
        } else {
            jA = a.f825a;
        }
        if (bVar2 == null) {
            this.f846k = bVar;
            this.f845j = jA;
        } else if (bVar == null || this.f845j != jA) {
            this.f846k = bVar;
            this.f845j = jA;
            this.f847l = null;
            this.f849n = null;
            this.f851p = -1;
            this.f850o = -1;
        }
    }

    public final p d(S0.k kVar) {
        p pVar = this.f847l;
        if (pVar == null || kVar != this.f848m || pVar.b()) {
            this.f848m = kVar;
            C0110f c0110f = this.f837a;
            J jI = p020d2.n.I(this.f838b, kVar);
            S0.b bVar = this.f846k;
            E4.k.c(bVar);
            L0.d dVar = this.f839c;
            List list = this.f844h;
            if (list == null) {
                list = u.f11237h;
            }
            pVar = new p(c0110f, jI, list, bVar, dVar);
        }
        this.f847l = pVar;
        return pVar;
    }

    public final G e(S0.k kVar, long j4, n nVar) {
        float fMin = Math.min(nVar.f1513a.c(), nVar.f1516d);
        C0110f c0110f = this.f837a;
        J j6 = this.f838b;
        List list = this.f844h;
        if (list == null) {
            list = u.f11237h;
        }
        int i = this.f842f;
        boolean z5 = this.f841e;
        int i3 = this.f840d;
        S0.b bVar = this.f846k;
        E4.k.c(bVar);
        return new G(new F(c0110f, j6, list, i, z5, i3, bVar, kVar, this.f839c, j4), nVar, p081p0.c.R(j4, AbstractC0473d.b(AbstractC0029o0.n(fMin), AbstractC0029o0.n(nVar.f1517e))));
    }
}
