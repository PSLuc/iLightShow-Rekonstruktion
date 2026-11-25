package D0;

import S1.V;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ float f735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f736n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, p111u4.d dVar) {
        super(2, dVar);
        this.f736n = gVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        f fVar = new f(this.f736n, dVar);
        fVar.f735m = ((Number) obj).floatValue();
        return fVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((f) b(Float.valueOf(((Number) obj).floatValue()), (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f734l;
        if (i == 0) {
            V.O(obj);
            float f6 = this.f735m;
            g gVar = this.f736n;
            Object obj2 = gVar.f737a.f947d.f939h.get(E0.g.f918e);
            if (obj2 == null) {
                obj2 = null;
            }
            D4.e eVar = (D4.e) obj2;
            if (eVar == null) {
                p027e3.a.z0("Required value was null.");
                throw null;
            }
            p030f0.c cVar = new p030f0.c(p081p0.c.y(0.0f, f6));
            this.f734l = 1;
            obj = eVar.d(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return new Float(p030f0.c.e(((p030f0.c) obj).f8837a));
    }
}
