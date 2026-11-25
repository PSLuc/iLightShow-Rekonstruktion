package L;

/* JADX INFO: renamed from: L.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0184v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2940d;

    public C0184v0(long j4, long j6, long j7, long j8) {
        this.f2937a = j4;
        this.f2938b = j6;
        this.f2939c = j7;
        this.f2940d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0184v0)) {
            return false;
        }
        C0184v0 c0184v0 = (C0184v0) obj;
        return p035g0.r.c(this.f2937a, c0184v0.f2937a) && p035g0.r.c(this.f2938b, c0184v0.f2938b) && p035g0.r.c(this.f2939c, c0184v0.f2939c) && p035g0.r.c(this.f2940d, c0184v0.f2940d);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2940d) + p012c.k.l(p012c.k.l(Long.hashCode(this.f2937a) * 31, 31, this.f2938b), 31, this.f2939c);
    }
}
