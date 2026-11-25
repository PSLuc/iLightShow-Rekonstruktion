package p070n1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10517h;
    public int i;

    public final float a(long j4) {
        long j6 = this.f10514e;
        if (j4 < j6) {
            return 0.0f;
        }
        long j7 = this.f10516g;
        if (j7 < 0 || j4 < j7) {
            return e.b((j4 - j6) / this.f10510a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f10517h;
        return (e.b((j4 - j7) / this.i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
