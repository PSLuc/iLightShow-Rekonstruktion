package L;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2483h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2487m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(Object obj, long j4, long j6, long j7, long j8, int i) {
        super(1);
        this.f2483h = i;
        this.f2487m = obj;
        this.i = j4;
        this.f2484j = j6;
        this.f2485k = j7;
        this.f2486l = j8;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f2483h) {
            case 0:
                p044i0.d dVar = (p044i0.d) obj;
                C0188w1 c0188w1 = (C0188w1) this.f2487m;
                U0.e(dVar, c0188w1.f2958f, 0.0f, c0188w1.b(), this.i, this.f2484j, this.f2485k, this.f2486l);
                break;
            default:
                p044i0.d dVar2 = (p044i0.d) obj;
                A0 a6 = (A0) this.f2487m;
                U0.e(dVar2, a6.f2150g, a6.b(), a6.a(), this.i, this.f2484j, this.f2485k, this.f2486l);
                break;
        }
        return p084p4.x.f10867a;
    }
}
