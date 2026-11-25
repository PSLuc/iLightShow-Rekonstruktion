package F;

/* JADX INFO: loaded from: classes.dex */
public final class V extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1148h;
    public final /* synthetic */ D4.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(D4.a aVar, int i) {
        super(1);
        this.f1148h = i;
        this.i = aVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1148h) {
            case 0:
                return new p030f0.c(((p030f0.c) this.i.invoke()).f8837a);
            default:
                this.i.invoke();
                return p084p4.x.f10867a;
        }
    }
}
