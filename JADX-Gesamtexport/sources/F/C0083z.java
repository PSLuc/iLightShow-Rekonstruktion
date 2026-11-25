package F;

/* JADX INFO: renamed from: F.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083z extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.c f1238n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083z(D4.c cVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1238n = cVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0083z c0083z = new C0083z(this.f1238n, dVar);
        c0083z.f1237m = obj;
        return c0083z;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0083z) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f1236l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f1237m;
            C0082y c0082y = new C0082y(this.f1238n, null);
            this.f1236l = 1;
            if (a6.y0(c0082y, this) == aVar) {
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
