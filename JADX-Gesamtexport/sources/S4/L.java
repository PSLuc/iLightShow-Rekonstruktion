package S4;

import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5048l;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        L l6 = new L(2, dVar);
        l6.f5048l = obj;
        return l6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((L) b((H) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        return Boolean.valueOf(((H) this.f5048l) != H.f5038h);
    }
}
