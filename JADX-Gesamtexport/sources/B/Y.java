package B;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F.P f268n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(p091r0.A a6, F.P p6, p111u4.d dVar) {
        super(2, dVar);
        this.f267m = a6;
        this.f268n = p6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new Y(this.f267m, this.f268n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((Y) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f266l;
        if (i == 0) {
            S1.V.O(obj);
            B b6 = new B(this.f268n, 1);
            this.f266l = 1;
            if (p112v.Y0.d(this.f267m, null, b6, this, 7) == aVar) {
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
