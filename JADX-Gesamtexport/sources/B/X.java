package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(p091r0.A a6, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f258m = a6;
        this.f259n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new X(this.f258m, this.f259n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((X) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f257l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i == 0) {
            S1.V.O(obj);
            this.f257l = 1;
            Object objD = AbstractC0336x.d(new C0044w0(this.f258m, this.f259n, null), this);
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return xVar;
    }
}
