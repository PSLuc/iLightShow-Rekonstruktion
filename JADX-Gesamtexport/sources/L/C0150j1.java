package L;

/* JADX INFO: renamed from: L.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150j1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2804h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J4.a f2805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A0 f2806k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0150j1(boolean z5, J4.a aVar, A0 a6, int i) {
        super(1);
        this.f2804h = i;
        this.i = z5;
        this.f2805j = aVar;
        this.f2806k = a6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f2804h) {
            case 0:
                E0.h hVar = (E0.h) obj;
                if (!this.i) {
                    E0.q.c(hVar);
                }
                E0.q.f(hVar, new C0147i1(this.f2805j, this.f2806k, 0));
                break;
            default:
                E0.h hVar2 = (E0.h) obj;
                if (!this.i) {
                    E0.q.c(hVar2);
                }
                E0.q.f(hVar2, new C0147i1(this.f2805j, this.f2806k, 1));
                break;
        }
        return p084p4.x.f10867a;
    }
}
