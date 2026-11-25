package N3;

import N.C0208d;
import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColor;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f4253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X.s f4254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Palette f4255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4258q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(X.s sVar, Palette palette, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, InterfaceC0203a0 interfaceC0203a2, p111u4.d dVar) {
        super(3, dVar);
        this.f4254m = sVar;
        this.f4255n = palette;
        this.f4256o = interfaceC0203a0;
        this.f4257p = interfaceC0203a1;
        this.f4258q = interfaceC0203a2;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4 = ((p030f0.c) obj2).f8837a;
        InterfaceC0203a0 interfaceC0203a0 = this.f4257p;
        InterfaceC0203a0 interfaceC0203a1 = this.f4258q;
        r rVar = new r(this.f4254m, this.f4255n, this.f4256o, interfaceC0203a0, interfaceC0203a1, (p111u4.d) obj3);
        rVar.f4253l = j4;
        p084p4.x xVar = p084p4.x.f10867a;
        rVar.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        long j4 = this.f4253l;
        InterfaceC0203a0 interfaceC0203a0 = this.f4257p;
        long jY = p081p0.c.y(((int) (((S0.j) interfaceC0203a0.getValue()).f4896a >> 32)) / 2.0f, ((int) (((S0.j) interfaceC0203a0.getValue()).f4896a & 4294967295L)) / 2.0f);
        float fMin = Math.min((int) (((S0.j) interfaceC0203a0.getValue()).f4896a >> 32), (int) (4294967295L & ((S0.j) interfaceC0203a0.getValue()).f4896a)) / 2.0f;
        float fC = p030f0.c.c(p030f0.c.g(j4, jY));
        if (fC <= fMin) {
            PaletteColor paletteColor = new PaletteColor((((float) Math.toDegrees(Math.atan2(p030f0.c.e(j4) - p030f0.c.e(jY), p030f0.c.d(j4) - p030f0.c.d(jY)))) + 360.0f) % 360.0f, fC / fMin);
            InterfaceC0203a0 interfaceC0203a1 = this.f4258q;
            this.f4254m.add(C0208d.K(new U0(((Number) interfaceC0203a1.getValue()).intValue(), j4, j4, paletteColor), N.U.f3673m));
            this.f4255n.getColors().add(paletteColor);
            this.f4256o.setValue(new Integer(((Number) interfaceC0203a1.getValue()).intValue()));
            interfaceC0203a1.setValue(Integer.valueOf(((Number) interfaceC0203a1.getValue()).intValue() + 1));
        }
        return p084p4.x.f10867a;
    }
}
