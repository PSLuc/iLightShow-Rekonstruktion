package V0;

/* JADX INFO: renamed from: V0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382a extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5404h;
    public final /* synthetic */ v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0382a(v vVar, int i) {
        super(1);
        this.f5404h = i;
        this.i = vVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f5404h) {
            case 0:
                v vVar = this.i;
                vVar.show();
                return new B.A(3, vVar);
            default:
                v vVar2 = this.i;
                if (vVar2.f5456l.f5447a) {
                    vVar2.f5455k.invoke();
                }
                return p084p4.x.f10867a;
        }
    }
}
