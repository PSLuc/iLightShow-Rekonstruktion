package B;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements M0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f352b;

    public /* synthetic */ k1(int i, int i3) {
        this.f351a = i;
        this.f352b = i3;
    }

    @Override // M0.q
    public int a(int i) {
        if (i >= 0 && i <= this.f352b) {
            AbstractC0029o0.y(i, this.f351a, i);
        }
        return i;
    }

    @Override // M0.q
    public int b(int i) {
        if (i >= 0 && i <= this.f351a) {
            AbstractC0029o0.x(i, this.f352b, i);
        }
        return i;
    }
}
