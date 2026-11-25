package p113v0;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B f13153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f13154b = new W(this, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f13155c = new W(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f13156d = new W(this, 1);

    public final B a() {
        B b6 = this.f13153a;
        if (b6 != null) {
            return b6;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
