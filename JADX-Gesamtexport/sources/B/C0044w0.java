package B;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;

/* JADX INFO: renamed from: B.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044w0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p091r0.A f465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044w0(p091r0.A a6, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f465m = a6;
        this.f466n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0044w0 c0044w0 = new C0044w0(this.f465m, this.f466n, dVar);
        c0044w0.f464l = obj;
        return c0044w0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0044w0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f464l;
        p091r0.A a6 = this.f465m;
        D0 d1 = this.f466n;
        AbstractC0336x.o(interfaceC0335w, null, new C0040u0(a6, d1, null), 1);
        return AbstractC0336x.o(interfaceC0335w, null, new C0042v0(a6, d1, null), 1);
    }
}
