package L;

/* JADX INFO: renamed from: L.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173r1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0188w1 f2902n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173r1(C0188w1 c0188w1, p111u4.d dVar) {
        super(2, dVar);
        this.f2902n = c0188w1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0173r1 c0173r1 = new C0173r1(this.f2902n, dVar);
        c0173r1.f2901m = obj;
        return c0173r1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0173r1) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2900l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f2901m;
            C0188w1 c0188w1 = this.f2902n;
            C0171q1 c0171q1 = new C0171q1(c0188w1, null);
            C0165o1 c0165o1 = new C0165o1(c0188w1, 1);
            this.f2900l = 1;
            if (p112v.Y0.d(a6, c0171q1, c0165o1, this, 3) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
