package L;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2893d;

    public r(long j4, long j6, long j7, long j8) {
        this.f2890a = j4;
        this.f2891b = j6;
        this.f2892c = j7;
        this.f2893d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p035g0.r.c(this.f2890a, rVar.f2890a) && p035g0.r.c(this.f2891b, rVar.f2891b) && p035g0.r.c(this.f2892c, rVar.f2892c) && p035g0.r.c(this.f2893d, rVar.f2893d);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2893d) + p012c.k.l(p012c.k.l(Long.hashCode(this.f2890a) * 31, 31, this.f2891b), 31, this.f2892c);
    }
}
