package N3;

import N.InterfaceC0203a0;

/* JADX INFO: renamed from: N3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0292u extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.a f4273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4274o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0292u(D4.a aVar, InterfaceC0203a0 interfaceC0203a0, p111u4.d dVar) {
        super(2, dVar);
        this.f4273n = aVar;
        this.f4274o = interfaceC0203a0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0292u c0292u = new C0292u(this.f4273n, this.f4274o, dVar);
        c0292u.f4272m = obj;
        return c0292u;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0292u) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4271l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f4272m;
            D4.a aVar2 = this.f4273n;
            InterfaceC0203a0 interfaceC0203a0 = this.f4274o;
            C0290t c0290t = new C0290t(aVar2, interfaceC0203a0, null);
            C0259d c0259d = new C0259d(2, interfaceC0203a0);
            this.f4271l = 1;
            if (p112v.Y0.d(a6, c0290t, c0259d, this, 3) == aVar) {
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
