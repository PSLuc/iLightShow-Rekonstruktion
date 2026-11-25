package p113v0;

import S0.a;
import S0.j;
import S1.h0;
import p015c2.AbstractC0473d;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13137h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f13138j = AbstractC0473d.b(0, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13139k = P.f13143a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13140l = 0;

    public abstract int e0(C1029l c1029l);

    public final int f0() {
        return (int) (this.f13138j >> 32);
    }

    public final void g0() {
        this.f13137h = c.O((int) (this.f13138j >> 32), a.j(this.f13139k), a.h(this.f13139k));
        int iO = c.O((int) (this.f13138j & 4294967295L), a.i(this.f13139k), a.g(this.f13139k));
        this.i = iO;
        int i = this.f13137h;
        long j4 = this.f13138j;
        this.f13140l = h0.c((i - ((int) (j4 >> 32))) / 2, (iO - ((int) (j4 & 4294967295L))) / 2);
    }

    public abstract void h0(long j4, float f6, D4.c cVar);

    public Object i() {
        return null;
    }

    public final void n0(long j4) {
        if (j.a(this.f13138j, j4)) {
            return;
        }
        this.f13138j = j4;
        g0();
    }

    public final void o0(long j4) {
        if (a.b(this.f13139k, j4)) {
            return;
        }
        this.f13139k = j4;
        g0();
    }
}
