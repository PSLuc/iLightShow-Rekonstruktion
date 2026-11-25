package L;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0125b0 f2510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f2511n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C0125b0 c0125b0, Y y2, p111u4.d dVar) {
        super(2, dVar);
        this.f2510m = c0125b0;
        this.f2511n = y2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new U(this.f2510m, this.f2511n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((U) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2509l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return xVar;
        }
        S1.V.O(obj);
        Y y2 = this.f2511n;
        this.f2509l = 1;
        C0125b0 c0125b0 = this.f2510m;
        c0125b0.f2621a = y2.f2578a;
        c0125b0.f2622b = y2.f2579b;
        c0125b0.f2623c = y2.f2581d;
        c0125b0.f2624d = y2.f2580c;
        Object objB = c0125b0.b(this);
        if (objB != aVar) {
            objB = xVar;
        }
        return objB == aVar ? aVar : xVar;
    }
}
