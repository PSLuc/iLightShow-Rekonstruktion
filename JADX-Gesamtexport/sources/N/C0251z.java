package N;

import P4.InterfaceC0335w;
import android.view.Choreographer;

/* JADX INFO: renamed from: N.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251z extends p122w4.i implements D4.e {
    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0251z(2, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0251z) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        return Choreographer.getInstance();
    }
}
