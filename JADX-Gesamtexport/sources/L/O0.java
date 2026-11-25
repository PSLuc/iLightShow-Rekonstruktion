package L;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2438h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f2439j;

    public O0(long j4, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f2431a = j4;
        this.f2432b = j6;
        this.f2433c = j7;
        this.f2434d = j8;
        this.f2435e = j9;
        this.f2436f = j10;
        this.f2437g = j11;
        this.f2438h = j12;
        this.i = j13;
        this.f2439j = j14;
    }

    public final long a(boolean z5, boolean z6) {
        if (z5) {
            return z6 ? this.f2433c : this.f2435e;
        }
        return z6 ? this.f2438h : this.f2439j;
    }

    public final long b(boolean z5, boolean z6) {
        if (z5) {
            return z6 ? this.f2432b : this.f2434d;
        }
        return z6 ? this.f2437g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O0)) {
            return false;
        }
        O0 o6 = (O0) obj;
        return p035g0.r.c(this.f2431a, o6.f2431a) && p035g0.r.c(this.f2432b, o6.f2432b) && p035g0.r.c(this.f2433c, o6.f2433c) && p035g0.r.c(this.f2434d, o6.f2434d) && p035g0.r.c(this.f2435e, o6.f2435e) && p035g0.r.c(this.f2436f, o6.f2436f) && p035g0.r.c(this.f2437g, o6.f2437g) && p035g0.r.c(this.f2438h, o6.f2438h) && p035g0.r.c(this.i, o6.i) && p035g0.r.c(this.f2439j, o6.f2439j);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f2439j) + p012c.k.l(p012c.k.l(p012c.k.l(p012c.k.l(p012c.k.l(p012c.k.l(p012c.k.l(p012c.k.l(Long.hashCode(this.f2431a) * 31, 31, this.f2432b), 31, this.f2433c), 31, this.f2434d), 31, this.f2435e), 31, this.f2436f), 31, this.f2437g), 31, this.f2438h), 31, this.i);
    }
}
