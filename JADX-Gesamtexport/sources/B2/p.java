package B2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f529h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i) {
        super(0);
        this.f529h = i;
        this.i = rVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f529h) {
            case 0:
                return this.i.C().i;
            case 1:
                return this.i.f539d.u().f();
            default:
                return this.i.C().f14127h;
        }
    }
}
