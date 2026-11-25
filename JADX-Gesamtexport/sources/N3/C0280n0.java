package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;

/* JADX INFO: renamed from: N3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0280n0 implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4228h;
    public final /* synthetic */ E4.w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4229j;

    public /* synthetic */ C0280n0(E4.w wVar, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f4228h = i;
        this.i = wVar;
        this.f4229j = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f4228h) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                E4.w wVar = this.i;
                E4.k.f("$currentPreset", wVar);
                InterfaceC0203a0 interfaceC0203a0 = this.f4229j;
                E4.k.f("$strobeDrops$delegate", interfaceC0203a0);
                ((UMPreset) wVar.f1074h).setStrobeDrops(zBooleanValue);
                interfaceC0203a0.setValue(bool);
                break;
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                E4.w wVar2 = this.i;
                E4.k.f("$currentPreset", wVar2);
                InterfaceC0203a0 interfaceC0203a1 = this.f4229j;
                E4.k.f("$strobeDropsWhite$delegate", interfaceC0203a1);
                ((UMPreset) wVar2.f1074h).setStrobeDropsWhite(zBooleanValue2);
                interfaceC0203a1.setValue(bool);
                break;
            case 2:
                boolean zBooleanValue3 = bool.booleanValue();
                E4.w wVar3 = this.i;
                E4.k.f("$currentPreset", wVar3);
                InterfaceC0203a0 interfaceC0203a2 = this.f4229j;
                E4.k.f("$colorFades$delegate", interfaceC0203a2);
                ((UMPreset) wVar3.f1074h).setColorFades(zBooleanValue3);
                interfaceC0203a2.setValue(bool);
                break;
            case 3:
                boolean zBooleanValue4 = bool.booleanValue();
                E4.w wVar4 = this.i;
                E4.k.f("$currentPreset", wVar4);
                InterfaceC0203a0 interfaceC0203a3 = this.f4229j;
                E4.k.f("$enablePulses$delegate", interfaceC0203a3);
                ((UMPreset) wVar4.f1074h).setEnablePulses(zBooleanValue4);
                interfaceC0203a3.setValue(bool);
                break;
            case 4:
                boolean zBooleanValue5 = bool.booleanValue();
                E4.w wVar5 = this.i;
                E4.k.f("$currentPreset", wVar5);
                InterfaceC0203a0 interfaceC0203a4 = this.f4229j;
                E4.k.f("$standardHighFlash$delegate", interfaceC0203a4);
                ((UMPreset) wVar5.f1074h).setStandardHighFlash(zBooleanValue5);
                interfaceC0203a4.setValue(bool);
                break;
            default:
                boolean zBooleanValue6 = bool.booleanValue();
                E4.w wVar6 = this.i;
                E4.k.f("$currentPreset", wVar6);
                InterfaceC0203a0 interfaceC0203a5 = this.f4229j;
                E4.k.f("$standardStrobe$delegate", interfaceC0203a5);
                ((UMPreset) wVar6.f1074h).setStandardStrobe(zBooleanValue6);
                interfaceC0203a5.setValue(bool);
                break;
        }
        return p084p4.x.f10867a;
    }
}
