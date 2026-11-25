package p092r1;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0894o extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f11682m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0894o(U u6, d dVar) {
        super(2, dVar);
        this.f11682m = u6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0894o c0894o = new C0894o(this.f11682m, dVar);
        c0894o.f11681l = obj;
        return c0894o;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0894o) b((U) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        U u6 = (U) this.f11681l;
        return Boolean.valueOf((u6 instanceof C0881b) && u6.f11632a <= this.f11682m.f11632a);
    }
}
