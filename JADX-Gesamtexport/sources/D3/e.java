package D3;

import N.C0208d;
import N.C0217h0;
import N.U;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0217h0 f776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0217h0 f777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0217h0 f778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0217h0 f779p;

    public e(int i) {
        Integer numValueOf = Integer.valueOf(i);
        U u6 = U.f3673m;
        this.f775l = C0208d.K(numValueOf, u6);
        this.f776m = C0208d.K(255, u6);
        this.f777n = C0208d.K(180, u6);
        this.f778o = C0208d.K(Boolean.TRUE, u6);
        this.f779p = C0208d.K(0, u6);
        this.f804f = true;
        this.f802d = true;
        this.f806h = new h(b());
    }

    @Override // D3.j
    public final void a(d dVar) {
        int i = (int) ((((double) dVar.f768b) / 10.0d) * ((double) 1000));
        if (i < 0) {
            i = 0;
        }
        this.f779p.setValue(Integer.valueOf(i));
        a aVar = dVar.f767a;
        if (aVar != null) {
            this.f775l.setValue(Integer.valueOf(p081p0.c.O(aVar.f761a, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
            this.f776m.setValue(Integer.valueOf(p081p0.c.O(aVar.f762b, 0, 255)));
            this.f777n.setValue(Integer.valueOf(p081p0.c.O(aVar.f763c, 0, 255)));
        }
        this.f778o.setValue(Boolean.valueOf(dVar.f769c));
    }

    @Override // D3.j
    public final void e() {
        this.f778o.setValue(Boolean.TRUE);
    }
}
