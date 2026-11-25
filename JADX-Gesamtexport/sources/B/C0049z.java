package B;

import N.InterfaceC0203a0;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: B.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049z extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M0.x f477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F.P f478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M0.m f479q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049z(C0036s0 c0036s0, InterfaceC0203a0 interfaceC0203a0, M0.x xVar, F.P p6, M0.m mVar, p111u4.d dVar) {
        super(2, dVar);
        this.f475m = c0036s0;
        this.f476n = interfaceC0203a0;
        this.f477o = xVar;
        this.f478p = p6;
        this.f479q = mVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0049z(this.f475m, this.f476n, this.f477o, this.f478p, this.f479q, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0049z) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f474l;
        C0036s0 c0036s0 = this.f475m;
        try {
            if (i == 0) {
                S1.V.O(obj);
                S4.A a6 = new S4.A(new N.T0(new C0039u(1, this.f476n), null));
                C0047y c0047y = new C0047y(c0036s0, this.f477o, this.f478p, this.f479q, 0);
                this.f474l = 1;
                if (a6.a(c0047y, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S1.V.O(obj);
            }
            AbstractC0029o0.i(c0036s0);
            return p084p4.x.f10867a;
        } catch (Throwable th) {
            AbstractC0029o0.i(c0036s0);
            throw th;
        }
    }
}
