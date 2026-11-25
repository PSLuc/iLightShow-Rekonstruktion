package B2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f515h;
    public final /* synthetic */ l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i) {
        super(0);
        this.f515h = i;
        this.i = lVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f515h) {
            case 0:
                return this.i.b().i;
            case 1:
                return this.i.f518k.f();
            default:
                return this.i.b().f14127h;
        }
    }
}
