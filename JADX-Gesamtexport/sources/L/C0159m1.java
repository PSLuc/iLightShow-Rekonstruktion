package L;

import B.C0031p0;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: L.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0159m1 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f2843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A0 f2844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0031p0 f2845p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159m1(p091r0.A a6, A0 a7, C0031p0 c0031p0, p111u4.d dVar) {
        super(2, dVar);
        this.f2843n = a6;
        this.f2844o = a7;
        this.f2845p = c0031p0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0159m1 c0159m1 = new C0159m1(this.f2843n, this.f2844o, this.f2845p, dVar);
        c0159m1.f2842m = obj;
        return c0159m1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0159m1) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2841l;
        if (i == 0) {
            S1.V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f2842m;
            C0156l1 c0156l1 = new C0156l1(this.f2844o, this.f2845p, interfaceC0335w, null);
            this.f2841l = 1;
            if (p006b.a.n(this.f2843n, c0156l1, this) == aVar) {
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
