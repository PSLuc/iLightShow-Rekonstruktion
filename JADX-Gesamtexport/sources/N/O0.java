package N;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.e f3644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f3645o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(D4.e eVar, InterfaceC0203a0 interfaceC0203a0, p111u4.d dVar) {
        super(2, dVar);
        this.f3644n = eVar;
        this.f3645o = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        O0 o6 = new O0(this.f3644n, this.f3645o, dVar);
        o6.f3643m = obj;
        return o6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((O0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f3642l;
        if (i == 0) {
            S1.V.O(obj);
            C0229n0 c0229n0 = new C0229n0(this.f3645o, ((InterfaceC0335w) this.f3643m).d());
            this.f3642l = 1;
            if (this.f3644n.d(c0229n0, this) == aVar) {
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
