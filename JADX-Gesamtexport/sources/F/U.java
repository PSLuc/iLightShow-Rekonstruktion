package F;

/* JADX INFO: loaded from: classes.dex */
public final class U extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1146h;
    public final /* synthetic */ p107u.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f1147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(p107u.l lVar, P p6, int i) {
        super(0);
        this.f1146h = i;
        this.i = lVar;
        this.f1147j = p6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f1146h) {
            case 0:
                this.f1147j.d();
                this.i.f12638a.setValue(p107u.i.f12636a);
                break;
            case 1:
                this.f1147j.b(false);
                this.i.f12638a.setValue(p107u.i.f12636a);
                break;
            case 2:
                this.f1147j.l();
                this.i.f12638a.setValue(p107u.i.f12636a);
                break;
            default:
                this.f1147j.m();
                this.i.f12638a.setValue(p107u.i.f12636a);
                break;
        }
        return p084p4.x.f10867a;
    }
}
