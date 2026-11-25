package E;

import B.AbstractC0029o0;
import G0.C0105a;
import G0.J;
import G0.s;
import p015c2.AbstractC0473d;
import p020d2.n;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L0.d f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f858g;
    public S0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0105a f860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f861k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S0.k f865o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f859h = a.f825a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f862l = AbstractC0473d.b(0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f866p = p081p0.c.W(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f867q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f868r = -1;

    public e(String str, J j4, L0.d dVar, int i, boolean z5, int i3, int i6) {
        this.f852a = str;
        this.f853b = j4;
        this.f854c = dVar;
        this.f855d = i;
        this.f856e = z5;
        this.f857f = i3;
        this.f858g = i6;
    }

    public final int a(int i, S0.k kVar) {
        int i3 = this.f867q;
        int i6 = this.f868r;
        if (i == i3 && i3 != -1) {
            return i6;
        }
        int iN = AbstractC0029o0.n(b(p081p0.c.t(0, i, 0, Integer.MAX_VALUE), kVar).b());
        this.f867q = i;
        this.f868r = iN;
        return iN;
    }

    public final C0105a b(long j4, S0.k kVar) {
        s sVarD = d(kVar);
        long jT = p006b.a.t(j4, this.f856e, this.f855d, sVarD.c());
        boolean z5 = this.f856e;
        int i = this.f855d;
        int i3 = this.f857f;
        return new C0105a((O0.d) sVarD, ((z5 || i != 2) && i3 >= 1) ? i3 : 1, i == 2, jT);
    }

    public final void c(S0.b bVar) {
        long jA;
        S0.b bVar2 = this.i;
        if (bVar != null) {
            int i = a.f826b;
            jA = a.a(bVar.a(), bVar.n());
        } else {
            jA = a.f825a;
        }
        if (bVar2 == null) {
            this.i = bVar;
            this.f859h = jA;
            return;
        }
        if (bVar == null || this.f859h != jA) {
            this.i = bVar;
            this.f859h = jA;
            this.f860j = null;
            this.f864n = null;
            this.f865o = null;
            this.f867q = -1;
            this.f868r = -1;
            this.f866p = p081p0.c.W(0, 0, 0, 0);
            this.f862l = AbstractC0473d.b(0, 0);
            this.f861k = false;
        }
    }

    public final s d(S0.k kVar) {
        s dVar = this.f864n;
        if (dVar == null || kVar != this.f865o || dVar.b()) {
            this.f865o = kVar;
            String str = this.f852a;
            J jI = n.I(this.f853b, kVar);
            S0.b bVar = this.i;
            E4.k.c(bVar);
            L0.d dVar2 = this.f854c;
            u uVar = u.f11237h;
            dVar = new O0.d(str, jI, uVar, uVar, dVar2, bVar);
        }
        this.f864n = dVar;
        return dVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f860j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j4 = this.f859h;
        int i = a.f826b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j4 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j4 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
