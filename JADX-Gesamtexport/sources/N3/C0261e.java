package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;

/* JADX INFO: renamed from: N3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0261e implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4167h;
    public final /* synthetic */ UMPreset i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4168j;

    public /* synthetic */ C0261e(UMPreset uMPreset, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f4167h = i;
        this.i = uMPreset;
        this.f4168j = interfaceC0203a0;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4167h) {
            case 0:
                UMPreset uMPreset = this.i;
                InterfaceC0203a0 interfaceC0203a0 = this.f4168j;
                E4.k.f("$rangeSliderPosition$delegate", interfaceC0203a0);
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                m6.D(UMPreset.copy$default(uMPreset, null, (int) ((J4.a) interfaceC0203a0.getValue()).f1939a, (int) ((J4.a) interfaceC0203a0.getValue()).f1940b, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524281, null));
                m6.A();
                break;
            case 1:
                UMPreset uMPreset2 = this.i;
                InterfaceC0203a0 interfaceC0203a1 = this.f4168j;
                E4.k.f("$sliderPosition$delegate", interfaceC0203a1);
                com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
                m7.D(UMPreset.copy$default(uMPreset2, null, 0, 0, 0, 0, (int) ((Number) interfaceC0203a1.getValue()).floatValue(), null, false, null, false, false, null, null, null, false, false, false, false, null, 524255, null));
                m7.A();
                break;
            default:
                UMPreset uMPreset3 = this.i;
                InterfaceC0203a0 interfaceC0203a2 = this.f4168j;
                E4.k.f("$sliderPosition$delegate", interfaceC0203a2);
                com.nanjoran.ilightshow.Services.M m8 = com.nanjoran.ilightshow.Services.M.f8305O;
                m8.D(UMPreset.copy$default(uMPreset3, null, 0, 0, 0, (int) ((Number) interfaceC0203a2.getValue()).floatValue(), 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524271, null));
                m8.A();
                break;
        }
        return p084p4.x.f10867a;
    }
}
