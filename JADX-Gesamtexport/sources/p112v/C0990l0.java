package p112v;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990l0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f13023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990l0(long j4, d dVar) {
        super(2, dVar);
        this.f13023m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0990l0 c0990l0 = new C0990l0(this.f13023m, dVar);
        c0990l0.f13022l = obj;
        return c0990l0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0990l0 c0990l0 = (C0990l0) b((C1011w0) obj, (d) obj2);
        x xVar = x.f10867a;
        c0990l0.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        C1017z0 c1017z0 = ((C1011w0) this.f13022l).f13086a;
        C1017z0.a(c1017z0, c1017z0.f13111h, this.f13023m, 1);
        return x.f10867a;
    }
}
