package L;

/* JADX INFO: renamed from: L.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0137f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2722d;

    public C0137f0(long j4, long j6, long j7, long j8) {
        this.f2719a = j4;
        this.f2720b = j6;
        this.f2721c = j7;
        this.f2722d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0137f0)) {
            return false;
        }
        C0137f0 c0137f0 = (C0137f0) obj;
        return p035g0.r.c(this.f2719a, c0137f0.f2719a) && p035g0.r.c(this.f2720b, c0137f0.f2720b) && p035g0.r.c(this.f2721c, c0137f0.f2721c) && p035g0.r.c(this.f2722d, c0137f0.f2722d);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2722d) + p012c.k.l(p012c.k.l(Long.hashCode(this.f2719a) * 31, 31, this.f2720b), 31, this.f2721c);
    }
}
