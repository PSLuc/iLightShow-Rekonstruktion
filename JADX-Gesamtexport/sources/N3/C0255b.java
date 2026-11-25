package N3;

import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Views.BrightnessRoute;
import com.nanjoran.ilightshow.Views.DevicesViewRoute;
import com.nanjoran.ilightshow.Views.FXModeSelectionRoute;
import com.nanjoran.ilightshow.Views.FXSizeSelectionRoute;
import com.nanjoran.ilightshow.Views.IntensitySelectionRoute;
import com.nanjoran.ilightshow.Views.LightsScreenRoute;
import com.nanjoran.ilightshow.Views.ManualDelayRoute;
import com.nanjoran.ilightshow.Views.MusicServicesRoute;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;
import com.nanjoran.ilightshow.Views.PalettesListRoute;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;
import com.nanjoran.ilightshow.Views.SettingsScreenRoute;

/* JADX INFO: renamed from: N3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0255b implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4152h;
    public final /* synthetic */ F1.I i;

    public /* synthetic */ C0255b(F1.I i, int i3) {
        this.f4152h = i3;
        this.i = i;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4152h) {
            case 0:
                F1.I i = this.i;
                if (i != null) {
                    i.l();
                }
                break;
            case 1:
                F1.I i3 = this.i;
                if (i3 != null) {
                    i3.l();
                }
                break;
            case 2:
                F1.I i6 = this.i;
                if (i6 != null) {
                    i6.l();
                }
                break;
            case 3:
                F1.I i7 = this.i;
                if (i7 != null) {
                    i7.l();
                }
                break;
            case 4:
                F1.I i8 = this.i;
                if (i8 != null) {
                    i8.l();
                }
                break;
            case 5:
                F1.I i9 = this.i;
                if (i9 != null) {
                    i9.l();
                }
                break;
            case 6:
                F1.I i10 = this.i;
                if (i10 != null) {
                    i10.l();
                }
                break;
            case 7:
                F1.I i11 = this.i;
                if (i11 != null) {
                    i11.l();
                }
                break;
            case 8:
                F1.I i12 = this.i;
                if (i12 != null) {
                    F1.I.k(i12, DevicesViewRoute.INSTANCE);
                }
                break;
            case 9:
                F1.I i13 = this.i;
                if (i13 != null) {
                    F1.I.k(i13, DevicesViewRoute.INSTANCE);
                }
                break;
            case 10:
                F1.I i14 = this.i;
                if (i14 != null) {
                    F1.I.k(i14, PalettesListRoute.INSTANCE);
                }
                break;
            case 11:
                F1.I i15 = this.i;
                if (i15 != null) {
                    F1.I.k(i15, IntensitySelectionRoute.INSTANCE);
                }
                break;
            case 12:
                F1.I i16 = this.i;
                if (i16 != null) {
                    F1.I.k(i16, FXSizeSelectionRoute.INSTANCE);
                }
                break;
            case 13:
                F1.I i17 = this.i;
                if (i17 != null) {
                    F1.I.k(i17, ManualDelayRoute.INSTANCE);
                }
                break;
            case 14:
                F1.I i18 = this.i;
                if (i18 != null) {
                    boolean z5 = false;
                    F1.I.k(i18, new PaywallViewRoute(z5, z5, 3, (E4.g) null));
                }
                break;
            case 15:
                F1.I i19 = this.i;
                if (i19 != null) {
                    F1.I.k(i19, SettingsScreenRoute.INSTANCE);
                }
                break;
            case 16:
                F1.I i20 = this.i;
                if (i20 != null) {
                    F1.I.k(i20, MusicServicesRoute.INSTANCE);
                }
                break;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                F1.I i21 = this.i;
                if (i21 != null) {
                    F1.I.k(i21, BrightnessRoute.INSTANCE);
                }
                break;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                F1.I i22 = this.i;
                if (i22 != null) {
                    F1.I.k(i22, LightsScreenRoute.INSTANCE);
                }
                break;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                F1.I i23 = this.i;
                if (i23 != null) {
                    F1.I.k(i23, FXModeSelectionRoute.INSTANCE);
                }
                break;
            case 20:
                F1.I i24 = this.i;
                if (i24 != null) {
                    i24.l();
                }
                break;
            case 21:
                F1.I i25 = this.i;
                if (i25 != null) {
                    i25.l();
                }
                break;
            case 22:
                F1.I i26 = this.i;
                if (i26 != null) {
                    i26.l();
                }
                break;
            case 23:
                F1.I i27 = this.i;
                if (i27 != null) {
                    i27.l();
                }
                break;
            case 24:
                F1.I i28 = this.i;
                if (i28 != null) {
                    F1.I.k(i28, new PaletteEditorRoute(null));
                }
                break;
            case 25:
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                UMPreset uMPresetG = m6.g();
                if (uMPresetG != null) {
                    uMPresetG.setPaletteId(null);
                }
                UMPreset uMPresetG2 = m6.g();
                if (uMPresetG2 != null) {
                    uMPresetG2.setUseArtworkColors(false);
                }
                m6.A();
                F1.I i29 = this.i;
                if (i29 != null) {
                    i29.l();
                }
                break;
            case 26:
                com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
                UMPreset uMPresetG3 = m7.g();
                if (uMPresetG3 != null) {
                    uMPresetG3.setPaletteId(null);
                }
                UMPreset uMPresetG4 = m7.g();
                if (uMPresetG4 != null) {
                    uMPresetG4.setUseArtworkColors(true);
                }
                m7.A();
                F1.I i30 = this.i;
                if (i30 != null) {
                    i30.l();
                }
                break;
            case 27:
                com.nanjoran.ilightshow.Services.F0 f0A = com.nanjoran.ilightshow.Services.E0.f8249o.a();
                com.nanjoran.ilightshow.Services.F0.i.getClass();
                if (f0A != C0691q.c()) {
                    com.nanjoran.ilightshow.Services.M m8 = com.nanjoran.ilightshow.Services.M.f8305O;
                    if (m8.l().a()) {
                        m8.z();
                    }
                }
                F1.I i31 = this.i;
                if (i31 != null) {
                    i31.l();
                }
                break;
            case 28:
                F1.I i32 = this.i;
                if (i32 != null) {
                    i32.l();
                }
                break;
            default:
                UMPreset uMPresetG5 = com.nanjoran.ilightshow.Services.M.f8305O.g();
                if (uMPresetG5 != null) {
                    uMPresetG5.withEngineMode(FXOpt.INSTANCE.getEngineAdvanced());
                }
                F1.I i33 = this.i;
                if (i33 != null) {
                    i33.l();
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
