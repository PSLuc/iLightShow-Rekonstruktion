package B;

/* JADX INFO: renamed from: B.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0048y0 extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473h;
    public final /* synthetic */ D0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0048y0(D0 d1, int i) {
        super(0);
        this.f473h = i;
        this.i = d1;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f473h) {
            case 0:
                this.i.onStop();
                break;
            default:
                this.i.onCancel();
                break;
        }
        return p084p4.x.f10867a;
    }
}
