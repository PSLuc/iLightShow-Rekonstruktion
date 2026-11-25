package N3;

import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X0 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4138h;
    public final /* synthetic */ Palette i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F1.I f4139j;

    public /* synthetic */ X0(F1.I i, Palette palette) {
        this.f4138h = 2;
        this.f4139j = i;
        this.i = palette;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4138h) {
            case 0:
                Palette palette = this.i;
                E4.k.f("$palette", palette);
                AbstractC0665d0.c().remove(palette);
                F1.I i = this.f4139j;
                if (i != null) {
                    i.l();
                }
                break;
            case 1:
                Palette palette2 = this.i;
                E4.k.f("$palette", palette2);
                com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                UMPreset uMPresetG = m6.g();
                if (uMPresetG != null) {
                    uMPresetG.setPaletteId(palette2.getId());
                }
                UMPreset uMPresetG2 = m6.g();
                if (uMPresetG2 != null) {
                    uMPresetG2.setUseArtworkColors(false);
                }
                m6.A();
                F1.I i3 = this.f4139j;
                if (i3 != null) {
                    i3.l();
                }
                break;
            default:
                Palette palette3 = this.i;
                E4.k.f("$palette", palette3);
                F1.I i6 = this.f4139j;
                if (i6 != null) {
                    F1.I.k(i6, new PaletteEditorRoute(palette3.getId()));
                }
                break;
        }
        return p084p4.x.f10867a;
    }

    public /* synthetic */ X0(Palette palette, F1.I i, int i3) {
        this.f4138h = i3;
        this.i = palette;
        this.f4139j = i;
    }
}
