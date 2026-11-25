package N3;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4015m;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        K0 k3 = new K0(2, dVar);
        k3.f4015m = obj;
        return k3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((K0) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4014l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f4015m;
            J0 j4 = new J0(3, null, 0);
            this.f4014l = 1;
            if (p112v.Y0.d(a6, j4, null, this, 11) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}
