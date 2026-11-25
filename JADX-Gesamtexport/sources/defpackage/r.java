package defpackage;

import D4.e;
import E4.k;
import S1.V;
import p084p4.x;
import p111u4.d;
import p114v1.b;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f11348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f11349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Object obj, d dVar) {
        super(2, dVar);
        this.f11348m = tVar;
        this.f11349n = obj;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        r rVar = new r(this.f11348m, this.f11349n, dVar);
        rVar.f11347l = obj;
        return rVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        r rVar = (r) b((b) obj, (d) obj2);
        x xVar = x.f10867a;
        rVar.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        b bVar = (b) this.f11347l;
        p114v1.e eVar = this.f11348m.f12218b;
        Object obj2 = this.f11349n;
        bVar.getClass();
        k.f("key", eVar);
        bVar.d(eVar, obj2);
        return x.f10867a;
    }
}
