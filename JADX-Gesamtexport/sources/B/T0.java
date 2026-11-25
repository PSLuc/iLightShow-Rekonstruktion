package B;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f238h;
    public final /* synthetic */ W0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T0(W0 w6, int i) {
        super(0);
        this.f238h = i;
        this.i = w6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f238h) {
            case 0:
                return Boolean.valueOf(this.i.f252a.h() > 0.0f);
            default:
                W0 w6 = this.i;
                return Boolean.valueOf(w6.f252a.h() < w6.f253b.h());
        }
    }
}
