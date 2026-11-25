package p053k0;

import O1.u;
import S0.k;
import p030f0.f;
import p035g0.C0709j;
import p035g0.C0715p;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f9931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0709j f9932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9933c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f9934d = k.f4897h;

    public abstract void a(float f6);

    public abstract void b(C0709j c0709j);

    public final void c(F f6, long j4, float f7, C0709j c0709j) {
        if (this.f9933c != f7) {
            a(f7);
            this.f9933c = f7;
        }
        if (!E4.k.a(this.f9932b, c0709j)) {
            b(c0709j);
            this.f9932b = c0709j;
        }
        k layoutDirection = f6.getLayoutDirection();
        if (this.f9934d != layoutDirection) {
            this.f9934d = layoutDirection;
        }
        p044i0.b bVar = f6.f13862h;
        float fD = f.d(bVar.f()) - f.d(j4);
        float fB = f.b(bVar.f()) - f.b(j4);
        ((C0715p) bVar.i.i).t(0.0f, 0.0f, fD, fB);
        if (f7 > 0.0f) {
            try {
                if (f.d(j4) > 0.0f && f.b(j4) > 0.0f) {
                    e(f6);
                }
            } finally {
                ((C0715p) bVar.i.i).t(-0.0f, -0.0f, -fD, -fB);
            }
        }
    }

    public abstract long d();

    public abstract void e(F f6);
}
