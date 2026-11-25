package p057l;

/* JADX INFO: renamed from: l.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0796j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10109h;

    public final void a(int i, int i3) {
        this.f10104c = i;
        this.f10105d = i3;
        this.f10109h = true;
        if (this.f10108g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f10102a = i3;
            }
            if (i != Integer.MIN_VALUE) {
                this.f10103b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f10102a = i;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f10103b = i3;
        }
    }
}
