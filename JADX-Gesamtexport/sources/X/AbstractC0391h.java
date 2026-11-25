package X;

import B.C0031p0;

/* JADX INFO: renamed from: X.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0391h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f5685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5688d;

    public AbstractC0391h(int i, m mVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f5685a = mVar;
        this.f5686b = i;
        if (i != 0) {
            m mVarE = e();
            C0031p0 c0031p0 = o.f5708a;
            int[] iArr = mVarE.f5705k;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j4 = mVarE.i;
                int i3 = mVarE.f5704j;
                if (j4 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                } else {
                    long j6 = mVarE.f5703h;
                    if (j6 != 0) {
                        i3 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                    }
                }
                i = iNumberOfTrailingZeros + i3;
            }
            synchronized (o.f5709b) {
                iA = o.f5712e.a(i);
            }
        } else {
            iA = -1;
        }
        this.f5688d = iA;
    }

    public static void p(AbstractC0391h abstractC0391h) {
        o.f5708a.s(abstractC0391h);
    }

    public final void a() {
        synchronized (o.f5709b) {
            b();
            o();
        }
    }

    public void b() {
        o.f5710c = o.f5710c.g(d());
    }

    public abstract void c();

    public int d() {
        return this.f5686b;
    }

    public m e() {
        return this.f5685a;
    }

    public abstract D4.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract D4.c i();

    public final AbstractC0391h j() {
        C0031p0 c0031p0 = o.f5708a;
        AbstractC0391h abstractC0391h = (AbstractC0391h) c0031p0.get();
        c0031p0.s(this);
        return abstractC0391h;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(B b6);

    public void o() {
        int i = this.f5688d;
        if (i >= 0) {
            o.u(i);
            this.f5688d = -1;
        }
    }

    public void q(int i) {
        this.f5686b = i;
    }

    public void r(m mVar) {
        this.f5685a = mVar;
    }

    public void s(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC0391h t(D4.c cVar);
}
