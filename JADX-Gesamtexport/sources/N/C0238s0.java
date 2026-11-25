package N;

/* JADX INFO: renamed from: N.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238s0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3799l;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0238s0 c0238s0 = new C0238s0(2, dVar);
        c0238s0.f3799l = obj;
        return c0238s0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0238s0) b((EnumC0236r0) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        return Boolean.valueOf(((EnumC0236r0) this.f3799l) == EnumC0236r0.f3785h);
    }
}
