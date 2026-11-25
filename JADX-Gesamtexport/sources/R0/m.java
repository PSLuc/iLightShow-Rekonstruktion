package R0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4752h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i) {
        super(0);
        this.f4752h = i;
        this.i = nVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4752h) {
            case 0:
                return Float.valueOf(this.i.c());
            default:
                return this.i;
        }
    }
}
