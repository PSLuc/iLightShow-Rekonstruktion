package N3;

import N.InterfaceC0203a0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: N3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0276l0 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4209h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4212l;

    public /* synthetic */ C0276l0(Object obj, Object obj2, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, int i) {
        this.f4209h = i;
        this.i = obj;
        this.f4210j = obj2;
        this.f4211k = interfaceC0203a0;
        this.f4212l = interfaceC0203a1;
    }

    @Override // D4.a
    public final Object invoke() {
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.f4212l;
        InterfaceC0203a0 interfaceC0203a1 = this.f4211k;
        Object obj = this.f4210j;
        Object obj2 = this.i;
        switch (this.f4209h) {
            case 0:
                E4.w wVar = (E4.w) obj;
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                if (m6.l().b() <= 0) {
                    F1.I i = (F1.I) obj2;
                    if (i != null) {
                        F1.I.k(i, new PaywallViewRoute(false, false, 3, (E4.g) null));
                    }
                } else if (!m6.o()) {
                    UMPreset uMPreset = (UMPreset) wVar.f1074h;
                    FXOpt fXOpt = FXOpt.INSTANCE;
                    uMPreset.withEngineMode(fXOpt.getEngineAdvanced());
                    interfaceC0203a0.setValue(fXOpt.getEngineAdvanced());
                } else {
                    interfaceC0203a1.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                E4.w wVar2 = (E4.w) obj;
                com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
                if (m7.l().b() <= 0) {
                    F1.I i3 = (F1.I) obj2;
                    if (i3 != null) {
                        F1.I.k(i3, new PaywallViewRoute(false, false, 3, (E4.g) null));
                    }
                } else if (!m7.o()) {
                    UMPreset uMPreset2 = (UMPreset) wVar2.f1074h;
                    FXOpt fXOpt2 = FXOpt.INSTANCE;
                    uMPreset2.withEngineMode(fXOpt2.getEngineAdvanced());
                    interfaceC0203a0.setValue(fXOpt2.getEngineAdvanced());
                } else {
                    interfaceC0203a1.setValue(Boolean.TRUE);
                }
                break;
            default:
                MusicServiceType musicServiceType = (MusicServiceType) obj2;
                E4.k.f("$service", musicServiceType);
                Context context = (Context) obj;
                E4.k.f("$ctx", context);
                E4.k.f("$showSpotifyInstallDialog$delegate", interfaceC0203a1);
                E4.k.f("$showNotificationAccessDialog$delegate", interfaceC0203a0);
                if (musicServiceType != MusicServiceType.Spotify) {
                    int i6 = H3.b.i;
                    if (!AbstractC0473d.B(context)) {
                        interfaceC0203a0.setValue(Boolean.TRUE);
                    } else {
                        H3.f.f1787d.d(musicServiceType);
                    }
                } else if (!SpotifyAppRemote.isSpotifyInstalled(context)) {
                    interfaceC0203a1.setValue(Boolean.TRUE);
                } else if (((String) com.nanjoran.ilightshow.Services.C0.i.f8242e.getValue()) == null) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.nanjoran.ilightshow.Services.C0.f8237m)));
                } else {
                    H3.f.f1787d.d(musicServiceType);
                }
                break;
        }
        return xVar;
    }
}
