package L;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2143d;

    public A(long j4, long j6, long j7, long j8) {
        this.f2140a = j4;
        this.f2141b = j6;
        this.f2142c = j7;
        this.f2143d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        return p035g0.r.c(this.f2140a, a6.f2140a) && p035g0.r.c(this.f2141b, a6.f2141b) && p035g0.r.c(this.f2142c, a6.f2142c) && p035g0.r.c(this.f2143d, a6.f2143d);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2143d) + p012c.k.l(p012c.k.l(Long.hashCode(this.f2140a) * 31, 31, this.f2141b), 31, this.f2142c);
    }
}
