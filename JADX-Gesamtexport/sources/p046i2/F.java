package p046i2;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f9500b;

    public /* synthetic */ F(H h6, int i) {
        this.f9499a = i;
        this.f9500b = h6;
    }

    public final Object a(AbstractC0771g abstractC0771g) {
        switch (this.f9499a) {
            case 0:
                return this.f9500b.f9504k.b0(abstractC0771g);
            case 1:
                return this.f9500b.f9504k.N(abstractC0771g);
            case 2:
                return this.f9500b.f9504k.n0(abstractC0771g);
            default:
                H h6 = this.f9500b;
                C cY = h6.f9504k.y(abstractC0771g);
                return cY != null ? h6.f9504k.z(abstractC0771g, cY) : cY;
        }
    }
}
