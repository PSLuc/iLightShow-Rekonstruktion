package L;

/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2734e;

    public f2(long j4, long j6, long j7, long j8, long j9) {
        this.f2730a = j4;
        this.f2731b = j6;
        this.f2732c = j7;
        this.f2733d = j8;
        this.f2734e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return p035g0.r.c(this.f2730a, f2Var.f2730a) && p035g0.r.c(this.f2731b, f2Var.f2731b) && p035g0.r.c(this.f2732c, f2Var.f2732c) && p035g0.r.c(this.f2733d, f2Var.f2733d) && p035g0.r.c(this.f2734e, f2Var.f2734e);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2734e) + p012c.k.l(p012c.k.l(p012c.k.l(Long.hashCode(this.f2730a) * 31, 31, this.f2731b), 31, this.f2732c), 31, this.f2733d);
    }
}
