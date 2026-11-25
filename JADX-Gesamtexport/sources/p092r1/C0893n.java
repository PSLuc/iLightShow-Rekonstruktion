package p092r1;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893n extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11680l;

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0893n c0893n = new C0893n(2, dVar);
        c0893n.f11680l = obj;
        return c0893n;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0893n) b((U) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        return Boolean.valueOf(!(((U) this.f11680l) instanceof K));
    }
}
