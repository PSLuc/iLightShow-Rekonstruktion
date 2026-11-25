package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColor;

/* JADX INFO: renamed from: N3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0279n implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4226h = 1;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4227j;

    public /* synthetic */ C0279n(int i, InterfaceC0203a0 interfaceC0203a0) {
        this.i = i;
        this.f4227j = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f4226h) {
            case 0:
                PaletteColor paletteColor = (PaletteColor) obj;
                Palette palette = (Palette) this.f4227j;
                E4.k.f("$palette", palette);
                E4.k.f("newPaletteColor", paletteColor);
                palette.getColors().set(this.i, paletteColor);
                break;
            default:
                p044i0.d dVar = (p044i0.d) obj;
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) this.f4227j;
                E4.k.f("$this$drawBehind", dVar);
                p044i0.d.c0(dVar, p035g0.r.f9080f, this.i / 2.0f, p081p0.c.y(((int) (((S0.j) interfaceC0203a0.getValue()).f4896a >> 32)) / 2.0f, ((int) (((S0.j) interfaceC0203a0.getValue()).f4896a & 4294967295L)) / 2.0f), null, 120);
                break;
        }
        return p084p4.x.f10867a;
    }

    public /* synthetic */ C0279n(Palette palette, int i) {
        this.f4227j = palette;
        this.i = i;
    }
}
