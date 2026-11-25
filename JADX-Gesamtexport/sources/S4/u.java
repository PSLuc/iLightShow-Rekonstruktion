package S4;

import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ int f5128l;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        u uVar = new u(2, dVar);
        uVar.f5128l = ((Number) obj).intValue();
        return uVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((u) b(Integer.valueOf(((Number) obj).intValue()), (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        return Boolean.valueOf(this.f5128l > 0);
    }
}
