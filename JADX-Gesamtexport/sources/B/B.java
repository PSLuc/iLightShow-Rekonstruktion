package B;

/* JADX INFO: loaded from: classes.dex */
public final class B extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f52h;
    public final /* synthetic */ F.P i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(F.P p6, int i) {
        super(1);
        this.f52h = i;
        this.i = p6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f52h) {
            case 0:
                return new A(0, this.i);
            default:
                long j4 = ((p030f0.c) obj).f8837a;
                this.i.o();
                return p084p4.x.f10867a;
        }
    }
}
