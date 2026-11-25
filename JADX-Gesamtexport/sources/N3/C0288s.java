package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.Palette;

/* JADX INFO: renamed from: N3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288s extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X.s f4262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Palette f4263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288s(X.s sVar, Palette palette, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, InterfaceC0203a0 interfaceC0203a2, p111u4.d dVar) {
        super(2, dVar);
        this.f4262n = sVar;
        this.f4263o = palette;
        this.f4264p = interfaceC0203a0;
        this.f4265q = interfaceC0203a1;
        this.f4266r = interfaceC0203a2;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0288s c0288s = new C0288s(this.f4262n, this.f4263o, this.f4264p, this.f4265q, this.f4266r, dVar);
        c0288s.f4261m = obj;
        return c0288s;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0288s) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4260l;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f4261m;
            r rVar = new r(this.f4262n, this.f4263o, this.f4264p, this.f4265q, this.f4266r, null);
            this.f4260l = 1;
            if (p112v.Y0.d(a6, rVar, null, this, 11) == aVar) {
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
