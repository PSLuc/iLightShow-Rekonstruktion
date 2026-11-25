package p114v1;

import D4.e;
import S1.V;
import p084p4.x;
import p089q4.z;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f13213n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(e eVar, d dVar) {
        super(2, dVar);
        this.f13213n = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        g gVar = new g(this.f13213n, dVar);
        gVar.f13212m = obj;
        return gVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((g) b((b) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13211l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f13212m;
            V.O(obj);
            return bVar;
        }
        V.O(obj);
        b bVar2 = new b(z.Y(((b) this.f13212m).a()), false);
        this.f13212m = bVar2;
        this.f13211l = 1;
        return this.f13213n.d(bVar2, this) == aVar ? aVar : bVar2;
    }
}
