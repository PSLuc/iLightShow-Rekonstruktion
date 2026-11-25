package F;

/* JADX INFO: renamed from: F.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076s extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0071m f1211h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076s(C0071m c0071m, int i) {
        super(0);
        this.f1211h = c0071m;
        this.i = i;
    }

    @Override // D4.a
    public final Object invoke() {
        return Integer.valueOf(((G0.G) this.f1211h.f1192e).e(this.i));
    }
}
