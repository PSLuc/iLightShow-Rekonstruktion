package p5;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11061c;

    public g0(int i, int i3) {
        this.f11059a = i;
        this.f11060b = i3;
        this.f11061c = i + i3;
    }

    public final String toString() {
        return String.format("range[%d:%d)", Integer.valueOf(this.f11059a), Integer.valueOf(this.f11061c));
    }
}
