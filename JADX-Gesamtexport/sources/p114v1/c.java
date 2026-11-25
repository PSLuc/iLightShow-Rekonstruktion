package p114v1;

import D4.e;
import E4.k;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f13208n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, d dVar) {
        super(2, dVar);
        this.f13208n = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        c cVar = new c(this.f13208n, dVar);
        cVar.f13207m = obj;
        return cVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((c) b((b) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f13206l;
        if (i == 0) {
            V.O(obj);
            b bVar = (b) this.f13207m;
            this.f13206l = 1;
            obj = this.f13208n.d(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        b bVar2 = (b) obj;
        k.d("null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences", bVar2);
        bVar2.f13205b.f12444a.set(true);
        return bVar2;
    }
}
