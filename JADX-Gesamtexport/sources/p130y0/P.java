package p130y0;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import android.view.Choreographer;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class P extends i implements e {
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new P(2, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((P) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        return Choreographer.getInstance();
    }
}
