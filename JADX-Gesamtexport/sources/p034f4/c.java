package p034f4;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f8952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8953c;

    public c(int i, n nVar) {
        this.f8951a = i;
        this.f8952b = new d[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f8952b[i3] = new d(nVar);
        }
    }

    public final d a() {
        int i = this.f8951a;
        if (i == 0) {
            return e.f8957f;
        }
        long j4 = this.f8953c;
        this.f8953c = 1 + j4;
        return this.f8952b[(int) (j4 % ((long) i))];
    }
}
