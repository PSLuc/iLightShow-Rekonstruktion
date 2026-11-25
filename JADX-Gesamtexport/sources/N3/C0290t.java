package N3;

import N.InterfaceC0203a0;

/* JADX INFO: renamed from: N3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0290t extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.a f4267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4268m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0290t(D4.a aVar, InterfaceC0203a0 interfaceC0203a0, p111u4.d dVar) {
        super(3, dVar);
        this.f4267l = aVar;
        this.f4268m = interfaceC0203a0;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4 = ((p030f0.c) obj2).f8837a;
        C0290t c0290t = new C0290t(this.f4267l, this.f4268m, (p111u4.d) obj3);
        p084p4.x xVar = p084p4.x.f10867a;
        c0290t.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        this.f4267l.invoke();
        this.f4268m.setValue(Boolean.TRUE);
        return p084p4.x.f10867a;
    }
}
