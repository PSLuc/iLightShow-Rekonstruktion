package L;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: L.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180u extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X.s f2923n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180u(p117w.m mVar, X.s sVar, p111u4.d dVar) {
        super(2, dVar);
        this.f2922m = mVar;
        this.f2923n = sVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0180u(this.f2922m, this.f2923n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0180u) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2921l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return p084p4.x.f10867a;
        }
        S1.V.O(obj);
        S4.E e6 = this.f2922m.f13392a;
        C0177t c0177t = new C0177t(this.f2923n, 0);
        this.f2921l = 1;
        e6.getClass();
        S4.E.j(e6, c0177t, this);
        return aVar;
    }
}
