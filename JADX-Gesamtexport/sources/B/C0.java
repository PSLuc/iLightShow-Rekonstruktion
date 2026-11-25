package B;

import G0.C0110f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f54a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0.J f55b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S0.b f60g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L0.d f61h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public G0.p f62j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S0.k f63k;

    public C0(C0110f c0110f, G0.J j4, boolean z5, S0.b bVar, L0.d dVar, int i) {
        p089q4.u uVar = p089q4.u.f11237h;
        this.f54a = c0110f;
        this.f55b = j4;
        this.f56c = Integer.MAX_VALUE;
        this.f57d = 1;
        this.f58e = z5;
        this.f59f = 1;
        this.f60g = bVar;
        this.f61h = dVar;
        this.i = uVar;
    }

    public final void a(S0.k kVar) {
        G0.p pVar = this.f62j;
        if (pVar == null || kVar != this.f63k || pVar.b()) {
            this.f63k = kVar;
            pVar = new G0.p(this.f54a, p020d2.n.I(this.f55b, kVar), this.i, this.f60g, this.f61h);
        }
        this.f62j = pVar;
    }
}
