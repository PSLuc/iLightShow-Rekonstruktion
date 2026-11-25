package B;

/* JADX INFO: loaded from: classes.dex */
public final class O extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f195h;
    public final /* synthetic */ F.P i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(F.P p6, int i) {
        super(0);
        this.f195h = i;
        this.i = p6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f195h) {
            case 0:
                this.i.l();
                return Boolean.TRUE;
            case 1:
                this.i.f(true);
                return Boolean.TRUE;
            case 2:
                this.i.b(true);
                return Boolean.TRUE;
            case 3:
                this.i.d();
                return Boolean.TRUE;
            case 4:
                F.P p6 = this.i;
                p6.b(true);
                p6.k();
                return p084p4.x.f10867a;
            case 5:
                F.P p7 = this.i;
                p7.d();
                p7.k();
                return p084p4.x.f10867a;
            case 6:
                F.P p8 = this.i;
                p8.l();
                p8.k();
                return p084p4.x.f10867a;
            default:
                this.i.m();
                return p084p4.x.f10867a;
        }
    }
}
