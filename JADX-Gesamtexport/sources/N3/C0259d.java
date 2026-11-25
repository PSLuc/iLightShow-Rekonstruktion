package N3;

import N.InterfaceC0203a0;

/* JADX INFO: renamed from: N3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0259d implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4162h;
    public final /* synthetic */ InterfaceC0203a0 i;

    public /* synthetic */ C0259d(int i, InterfaceC0203a0 interfaceC0203a0) {
        this.f4162h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        J4.a aVar;
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.i;
        switch (this.f4162h) {
            case 0:
                J4.a aVar2 = (J4.a) obj;
                E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a0);
                E4.k.f("it", aVar2);
                float fN = p081p0.c.N(aVar2.f1939a, 0.0f, 255.0f);
                float fN2 = p081p0.c.N(aVar2.f1940b, 0.0f, 255.0f);
                if (fN2 - fN < 10.0f) {
                    float f6 = 10.0f + fN;
                    aVar = new J4.a(fN, f6 <= 255.0f ? f6 : 255.0f);
                } else {
                    aVar = new J4.a(fN, fN2);
                }
                interfaceC0203a0.setValue(aVar);
                break;
            case 1:
                E4.k.f("$size$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(new S0.j(((S0.j) obj).f4896a));
                break;
            case 2:
                interfaceC0203a0.setValue(Boolean.FALSE);
                break;
            case 3:
                String str = (String) obj;
                E4.k.f("$text$delegate", interfaceC0203a0);
                E4.k.f("it", str);
                interfaceC0203a0.setValue(str);
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                E4.k.f("$micEnabled$delegate", interfaceC0203a0);
                if (zBooleanValue) {
                    interfaceC0203a0.setValue(Boolean.TRUE);
                    com.nanjoran.ilightshow.Services.M.f8305O.f8325l.c(true);
                }
                break;
            case 5:
                E4.k.f("$wheelRadius$delegate", interfaceC0203a0);
                long j4 = ((S0.j) obj).f4896a;
                interfaceC0203a0.setValue(Float.valueOf(Math.min((int) (j4 >> 32), (int) (j4 & 4294967295L)) / 2.0f));
                break;
            case 6:
                Float f7 = (Float) obj;
                f7.floatValue();
                E4.k.f("$sliderPosition$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(f7);
                break;
            case 7:
                String str2 = (String) obj;
                E4.k.f("$text$delegate", interfaceC0203a0);
                E4.k.f("it", str2);
                int i = m1.f4225b;
                interfaceC0203a0.setValue(str2);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                E4.k.f("$backgroundModeEnabled$delegate", interfaceC0203a0);
                int i3 = m1.f4225b;
                interfaceC0203a0.setValue(bool);
                com.nanjoran.ilightshow.Services.M.f8305O.C(zBooleanValue2);
                break;
        }
        return xVar;
    }
}
