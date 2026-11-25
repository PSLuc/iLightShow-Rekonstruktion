package F;

import B.C0036s0;
import B.D0;
import B.EnumC0009e0;
import B.a1;

/* JADX INFO: loaded from: classes.dex */
public final class O implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1119b;

    public O(P p6, boolean z5) {
        this.f1118a = p6;
        this.f1119b = z5;
    }

    @Override // B.D0
    public final void a() {
        P p6 = this.f1118a;
        p6.f1133o.setValue(null);
        p6.f1134p.setValue(null);
        p6.p(true);
    }

    @Override // B.D0
    public final void b(long j4) {
    }

    @Override // B.D0
    public final void c() {
        a1 a1VarD;
        boolean z5 = this.f1119b;
        EnumC0009e0 enumC0009e0 = z5 ? EnumC0009e0.i : EnumC0009e0.f308j;
        P p6 = this.f1118a;
        p6.f1133o.setValue(enumC0009e0);
        long jI = p6.i(z5);
        float f6 = B.f1080a;
        long jY = p081p0.c.y(p030f0.c.d(jI), p030f0.c.e(jI) - 1.0f);
        C0036s0 c0036s0 = p6.f1123d;
        if (c0036s0 == null || (a1VarD = c0036s0.d()) == null) {
            return;
        }
        long jE = a1VarD.e(jY);
        p6.f1130l = jE;
        p6.f1134p.setValue(new p030f0.c(jE));
        p6.f1132n = 0L;
        p6.f1135q = -1;
        C0036s0 c0036s1 = p6.f1123d;
        if (c0036s1 != null) {
            c0036s1.f431q.setValue(Boolean.TRUE);
        }
        p6.p(false);
    }

    @Override // B.D0
    public final void d(long j4) {
        P p6 = this.f1118a;
        long jH = p030f0.c.h(p6.f1132n, j4);
        p6.f1132n = jH;
        p6.f1134p.setValue(new p030f0.c(p030f0.c.h(p6.f1130l, jH)));
        M0.w wVarJ = p6.j();
        p030f0.c cVarG = p6.g();
        E4.k.c(cVarG);
        C0074p c0074p = C0075q.f1205g;
        P.a(p6, wVarJ, cVarG.f8837a, false, this.f1119b, c0074p, true);
        p6.p(false);
    }

    @Override // B.D0
    public final void onCancel() {
    }

    @Override // B.D0
    public final void onStop() {
        P p6 = this.f1118a;
        p6.f1133o.setValue(null);
        p6.f1134p.setValue(null);
        p6.p(true);
    }
}
