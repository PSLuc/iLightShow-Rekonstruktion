package B;

import N.C0208d;
import N.C0209d0;
import N.C0217h0;

/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D.x f251f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0209d0 f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0209d0 f253b = C0208d.I(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p030f0.d f254c = p030f0.d.f8838e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f255d = G0.I.f1468b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f256e;

    static {
        int i = 2;
        C0022l c0022l = C0022l.f362s;
        W.d dVar = new W.d(i, i);
        E4.z.d(1, c0022l);
        D.x xVar = W.m.f5538a;
        f251f = new D.x(dVar, 19, c0022l);
    }

    public W0(p112v.W w6, float f6) {
        this.f252a = C0208d.I(f6);
        this.f256e = C0208d.K(w6, N.U.f3673m);
    }

    public final void a(p112v.W w6, p030f0.d dVar, int i, int i3) {
        float f6;
        float f7 = i3 - i;
        this.f253b.j(f7);
        p030f0.d dVar2 = this.f254c;
        float f8 = dVar2.f8839a;
        float f9 = dVar.f8839a;
        C0209d0 c0209d0 = this.f252a;
        float f10 = dVar.f8840b;
        if (f9 != f8 || f10 != dVar2.f8840b) {
            boolean z5 = w6 == p112v.W.f12920h;
            if (z5) {
                f9 = f10;
            }
            float f11 = z5 ? dVar.f8842d : dVar.f8841c;
            float fH = c0209d0.h();
            float f12 = i;
            float f13 = fH + f12;
            if (f11 <= f13 && (f9 >= fH || f11 - f9 <= f12)) {
                f6 = (f9 >= fH || f11 - f9 > f12) ? 0.0f : f9 - fH;
            } else {
                f6 = f11 - f13;
            }
            c0209d0.j(c0209d0.h() + f6);
            this.f254c = dVar;
        }
        c0209d0.j(p081p0.c.N(c0209d0.h(), 0.0f, f7));
    }
}
