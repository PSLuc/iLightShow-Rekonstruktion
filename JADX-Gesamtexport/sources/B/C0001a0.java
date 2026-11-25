package B;

import P4.AbstractC0336x;

/* JADX INFO: renamed from: B.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F.P f280o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001a0(D0 d1, F.P p6, p111u4.d dVar) {
        super(2, dVar);
        this.f279n = d1;
        this.f280o = p6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0001a0 c0001a0 = new C0001a0(this.f279n, this.f280o, dVar);
        c0001a0.f278m = obj;
        return c0001a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0001a0) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f277l;
        if (i == 0) {
            S1.V.O(obj);
            Z z5 = new Z((p091r0.A) this.f278m, this.f279n, this.f280o, null);
            this.f277l = 1;
            if (AbstractC0336x.d(z5, this) == aVar) {
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
