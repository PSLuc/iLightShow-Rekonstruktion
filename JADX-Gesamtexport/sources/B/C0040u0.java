package B;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: B.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0040u0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f446n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040u0(p091r0.A a6, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f445m = a6;
        this.f446n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0040u0(this.f445m, this.f446n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0040u0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f444l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return xVar;
        }
        S1.V.O(obj);
        this.f444l = 1;
        Object objN = p006b.a.n(this.f445m, new C0050z0(this.f446n, null), this);
        if (objN != aVar) {
            objN = xVar;
        }
        return objN == aVar ? aVar : xVar;
    }
}
