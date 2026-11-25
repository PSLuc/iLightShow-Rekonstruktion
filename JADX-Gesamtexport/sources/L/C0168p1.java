package L;

/* JADX INFO: renamed from: L.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0168p1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2877h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0168p1(int i, Object obj, boolean z5) {
        super(1);
        this.f2877h = i;
        this.i = z5;
        this.f2878j = obj;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f2877h) {
            case 0:
                E0.h hVar = (E0.h) obj;
                if (!this.i) {
                    E0.q.c(hVar);
                }
                E0.q.f(hVar, new C0165o1((C0188w1) this.f2878j, 0));
                break;
            default:
                ((p035g0.J) obj).d(!this.i && ((Boolean) ((D4.a) this.f2878j).invoke()).booleanValue());
                break;
        }
        return p084p4.x.f10867a;
    }
}
