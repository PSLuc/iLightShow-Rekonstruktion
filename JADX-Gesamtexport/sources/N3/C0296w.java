package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.PaletteColor;
import p112v.C1014y;
import p112v.C1016z;

/* JADX INFO: renamed from: N3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0296w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.a f4284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D4.a f4287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D4.c f4288r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296w(D4.a aVar, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, D4.a aVar2, D4.c cVar, p111u4.d dVar) {
        super(2, dVar);
        this.f4284n = aVar;
        this.f4285o = interfaceC0203a0;
        this.f4286p = interfaceC0203a1;
        this.f4287q = aVar2;
        this.f4288r = cVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0296w c0296w = new C0296w(this.f4284n, this.f4285o, this.f4286p, this.f4287q, this.f4288r, dVar);
        c0296w.f4283m = obj;
        return c0296w;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0296w) b((p091r0.A) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f4282l;
        p084p4.x xVar = p084p4.x.f10867a;
        if (i == 0) {
            S1.V.O(obj);
            p091r0.A a6 = (p091r0.A) this.f4283m;
            final InterfaceC0203a0 interfaceC0203a0 = this.f4285o;
            final D4.a aVar2 = this.f4284n;
            InterfaceC0203a0 interfaceC0203a1 = this.f4286p;
            C0271j c0271j = new C0271j(aVar2, interfaceC0203a0, interfaceC0203a1);
            C0275l c0275l = new C0275l(1, interfaceC0203a1);
            final D4.c cVar = this.f4288r;
            final D4.a aVar3 = this.f4287q;
            D4.e eVar = new D4.e() { // from class: N3.v
                @Override // D4.e
                public final Object d(Object obj2, Object obj3) {
                    aVar2.invoke();
                    ((p091r0.q) obj2).a();
                    InterfaceC0203a0 interfaceC0203a2 = interfaceC0203a0;
                    U0 u0 = (U0) interfaceC0203a2.getValue();
                    u0.f4128b = p030f0.c.h(u0.f4128b, ((p030f0.c) obj3).f8837a);
                    long j4 = ((S0.j) aVar3.invoke()).f4896a;
                    float f6 = (int) (j4 >> 32);
                    float f7 = (int) (j4 & 4294967295L);
                    long jY = p081p0.c.y(f6 / 2.0f, f7 / 2.0f);
                    float fMin = Math.min(f6, f7) / 2.0f;
                    long jG = p030f0.c.g(((U0) interfaceC0203a2.getValue()).f4128b, jY);
                    float fC = p030f0.c.c(jG);
                    if (fC > fMin) {
                        jG = p030f0.c.i(fMin / fC, jG);
                    }
                    long jG2 = p030f0.c.g(p030f0.c.h(jY, jG), jY);
                    PaletteColor paletteColor = new PaletteColor((((float) Math.toDegrees(Math.atan2(p030f0.c.e(jG2), p030f0.c.d(jG2)))) + 360.0f) % 360.0f, p081p0.c.N(p030f0.c.c(jG2) / fMin, 0.0f, 1.0f));
                    interfaceC0203a2.setValue(U0.a((U0) interfaceC0203a2.getValue(), 0L, 0L, paletteColor, 7));
                    cVar.invoke(paletteColor);
                    return p084p4.x.f10867a;
                }
            };
            this.f4282l = 1;
            float f6 = p112v.D.f12793a;
            C1014y c1014y = C1014y.i;
            Object objN = p006b.a.n(a6, new p112v.A(C1014y.f13097j, new E4.v(), null, new C1016z(c0271j, 0), eVar, c1014y, new F.V(c0275l, 1), null), this);
            if (objN != aVar) {
                objN = xVar;
            }
            if (objN != aVar) {
                objN = xVar;
            }
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S1.V.O(obj);
        }
        return xVar;
    }
}
