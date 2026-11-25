package p096s;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f11810h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11811j;

    public B0(z0 z0Var, long j4) {
        this.f11810h = z0Var;
        this.i = ((long) (z0Var.j() + z0Var.g())) * 1000000;
        this.f11811j = j4 * 1000000;
    }

    @Override // p096s.y0
    public final boolean a() {
        return true;
    }

    @Override // p096s.y0
    public final long b(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j4) {
        long j6 = j4 + this.f11811j;
        if (j6 <= 0) {
            return 0L;
        }
        long j7 = this.i;
        return j6 - ((j6 / j7) * j7);
    }

    public final AbstractC0924q d(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        long j6 = this.f11811j;
        long j7 = j4 + j6;
        long j8 = this.i;
        return j7 > j8 ? this.f11810h.k(j8 - j6, abstractC0924q, abstractC0924q3, abstractC0924q2) : abstractC0924q2;
    }

    @Override // p096s.y0
    public final AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return this.f11810h.f(c(j4), abstractC0924q, abstractC0924q2, d(j4, abstractC0924q, abstractC0924q3, abstractC0924q2));
    }

    @Override // p096s.y0
    public final AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return this.f11810h.k(c(j4), abstractC0924q, abstractC0924q2, d(j4, abstractC0924q, abstractC0924q3, abstractC0924q2));
    }
}
