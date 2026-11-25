package T4;

import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f5265n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5265n = fVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        e eVar = new e(this.f5265n, dVar);
        eVar.f5264m = obj;
        return eVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((e) b((R4.m) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5263l;
        if (i == 0) {
            V.O(obj);
            R4.m mVar = (R4.m) this.f5264m;
            this.f5263l = 1;
            if (this.f5265n.d(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
