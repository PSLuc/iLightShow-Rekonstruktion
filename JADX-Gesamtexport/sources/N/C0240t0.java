package N;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: N.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0240t0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0246w0 f3819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V f3820o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240t0(C0246w0 c0246w0, V v6, p111u4.d dVar) {
        super(2, dVar);
        this.f3819n = c0246w0;
        this.f3820o = v6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0240t0 c0240t0 = new C0240t0(this.f3819n, this.f3820o, dVar);
        c0240t0.f3818m = obj;
        return c0240t0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0240t0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f3817l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
            return p084p4.x.f10867a;
        }
        S1.V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f3818m;
        this.f3817l = 1;
        this.f3819n.c(interfaceC0335w, this.f3820o, this);
        return aVar;
    }
}
