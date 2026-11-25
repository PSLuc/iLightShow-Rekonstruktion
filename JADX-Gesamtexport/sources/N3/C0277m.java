package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;

/* JADX INFO: renamed from: N3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0277m implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4220h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4221j;

    public /* synthetic */ C0277m(InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, int i) {
        this.f4220h = i;
        this.i = interfaceC0203a0;
        this.f4221j = interfaceC0203a1;
    }

    @Override // D4.a
    public final Object invoke() {
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.f4221j;
        InterfaceC0203a0 interfaceC0203a1 = this.i;
        switch (this.f4220h) {
            case 0:
                interfaceC0203a1.setValue(Integer.valueOf(((U0) interfaceC0203a0.getValue()).f4127a));
                break;
            case 1:
                E4.k.f("$presetCreationError$delegate", interfaceC0203a1);
                E4.k.f("$showPresetCreationAlert$delegate", interfaceC0203a0);
                interfaceC0203a1.setValue("");
                interfaceC0203a0.setValue(Boolean.FALSE);
                break;
            case 2:
                E4.k.f("$presetCreationError$delegate", interfaceC0203a1);
                int i = m1.f4225b;
                interfaceC0203a1.setValue("");
                interfaceC0203a0.setValue(Boolean.FALSE);
                break;
            case 3:
                E4.k.f("$useLegacy$delegate", interfaceC0203a0);
                int i3 = m1.f4225b;
                interfaceC0203a1.setValue(Boolean.FALSE);
                interfaceC0203a0.setValue(Boolean.TRUE);
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                m6.G(((Boolean) interfaceC0203a0.getValue()).booleanValue());
                UMPreset uMPresetG = m6.g();
                if (uMPresetG != null) {
                    uMPresetG.withEngineMode(FXOpt.INSTANCE.getEngineStandard());
                }
                break;
            default:
                E4.k.f("$useLegacy$delegate", interfaceC0203a1);
                int i6 = m1.f4225b;
                if (!((Boolean) interfaceC0203a1.getValue()).booleanValue()) {
                    interfaceC0203a0.setValue(Boolean.TRUE);
                } else {
                    interfaceC0203a1.setValue(Boolean.FALSE);
                    com.nanjoran.ilightshow.Services.M.f8305O.G(false);
                }
                break;
        }
        return xVar;
    }
}
