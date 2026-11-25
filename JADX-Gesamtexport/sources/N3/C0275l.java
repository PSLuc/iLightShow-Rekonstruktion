package N3;

import N.InterfaceC0203a0;

/* JADX INFO: renamed from: N3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0275l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4208h;
    public final /* synthetic */ InterfaceC0203a0 i;

    public /* synthetic */ C0275l(int i, InterfaceC0203a0 interfaceC0203a0) {
        this.f4208h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.a
    public final Object invoke() {
        D3.h hVar;
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.i;
        switch (this.f4208h) {
            case 0:
                E4.k.f("$parentSize$delegate", interfaceC0203a0);
                return new S0.j(((S0.j) interfaceC0203a0.getValue()).f4896a);
            case 1:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 2:
                E4.k.f("$deviceInPairingProcess$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(null);
                return xVar;
            case 3:
                E4.k.f("$showManualBridgePairingDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 4:
                E4.k.f("$showDeleteDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.TRUE);
                return xVar;
            case 5:
                E4.k.f("$showDeleteDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 6:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 7:
                E4.k.f("$deviceInPairingProcess$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(null);
                return xVar;
            case 8:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 9:
                interfaceC0203a0.setValue(Boolean.TRUE);
                return xVar;
            case 10:
                E4.k.f("$showLegacyAlert$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 11:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 12:
                E4.k.f("$lightToAddAsAmbientAfterLimit$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(null);
                return xVar;
            case 13:
                E4.k.f("$showPurchaseDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 14:
                D3.j jVar = (D3.j) interfaceC0203a0.getValue();
                if (jVar != null && (hVar = jVar.f806h) != null) {
                    hVar.f788c = true;
                }
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                D3.j jVar2 = (D3.j) interfaceC0203a0.getValue();
                E4.k.c(jVar2);
                m6.c(p089q4.m.J(jVar2));
                interfaceC0203a0.setValue(null);
                return xVar;
            case 15:
                E4.k.f("$lightToAddAsAmbientAfterLimit$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(null);
                return xVar;
            case 16:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                E4.k.f("$useLegacy$delegate", interfaceC0203a0);
                com.nanjoran.ilightshow.Services.M.f8305O.G(false);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                E4.k.f("$micEnabled$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.valueOf(!((Boolean) interfaceC0203a0.getValue()).booleanValue()));
                return xVar;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                E4.k.f("$showSpotifyInstallDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 20:
                E4.k.f("$showNotificationAccessDialog$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 21:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 22:
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 23:
                E4.k.f("$showLegacyAlert$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            case 24:
                int i = m1.f4225b;
                interfaceC0203a0.setValue(Boolean.FALSE);
                return xVar;
            default:
                E4.k.f("$backgroundModeEnabled$delegate", interfaceC0203a0);
                int i3 = m1.f4225b;
                interfaceC0203a0.setValue(Boolean.valueOf(!((Boolean) interfaceC0203a0.getValue()).booleanValue()));
                com.nanjoran.ilightshow.Services.M.f8305O.C(((Boolean) interfaceC0203a0.getValue()).booleanValue());
                return xVar;
        }
    }
}
