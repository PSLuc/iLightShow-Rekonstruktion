package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0994n0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13036m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0994n0(long j4, d dVar) {
        super(2, dVar);
        this.f13036m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0994n0 c0994n0 = new C0994n0(this.f13036m, dVar);
        c0994n0.f13035l = obj;
        return c0994n0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0994n0 c0994n0 = (C0994n0) b((C1011w0) obj, (d) obj2);
        x xVar = x.f10867a;
        c0994n0.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        C1017z0 c1017z0 = ((C1011w0) this.f13035l).f13086a;
        C1017z0.a(c1017z0, c1017z0.f13111h, this.f13036m, 1);
        return x.f10867a;
    }
}
