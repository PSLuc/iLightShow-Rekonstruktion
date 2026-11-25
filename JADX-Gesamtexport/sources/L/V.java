package L;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0125b0 f2526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p117w.l f2527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0125b0 c0125b0, p117w.l lVar, p111u4.d dVar) {
        super(2, dVar);
        this.f2526m = c0125b0;
        this.f2527n = lVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new V(this.f2526m, this.f2527n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((V) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2525l;
        if (i == 0) {
            S1.V.O(obj);
            this.f2525l = 1;
            if (this.f2526m.a(this.f2527n, this) == aVar) {
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
