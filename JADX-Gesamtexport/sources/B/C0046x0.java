package B;

/* JADX INFO: renamed from: B.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046x0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f468h;
    public final /* synthetic */ D0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046x0(D0 d1, int i) {
        super(1);
        this.f468h = i;
        this.i = d1;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f468h) {
            case 0:
                this.i.b(((p030f0.c) obj).f8837a);
                break;
            default:
                p091r0.q qVar = (p091r0.q) obj;
                this.i.d(p091r0.o.g(qVar, false));
                qVar.a();
                break;
        }
        return p084p4.x.f10867a;
    }
}
