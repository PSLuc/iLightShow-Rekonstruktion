package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorDef;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class PaletteColor {
    public static final int $stable = 0;
    public static final Y Companion = new Y();
    private final float hue;
    private final float saturation;

    public /* synthetic */ PaletteColor(int i, float f6, float f7, c5.k0 k0Var) {
        if (3 != (i & 3)) {
            AbstractC0476a0.j(i, 3, X.f8375a.getDescriptor());
            throw null;
        }
        this.hue = f6;
        this.saturation = f7;
    }

    public static /* synthetic */ PaletteColor copy$default(PaletteColor paletteColor, float f6, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f6 = paletteColor.hue;
        }
        if ((i & 2) != 0) {
            f7 = paletteColor.saturation;
        }
        return paletteColor.copy(f6, f7);
    }

    public static /* synthetic */ void getHue$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(PaletteColor paletteColor, b5.b bVar, a5.g gVar) {
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.b0(gVar, 0, paletteColor.hue);
        cVar.b0(gVar, 1, paletteColor.saturation);
    }

    public final float component1() {
        return this.hue;
    }

    public final float component2() {
        return this.saturation;
    }

    public final PaletteColor copy(float f6, float f7) {
        return new PaletteColor(f6, f7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaletteColor)) {
            return false;
        }
        PaletteColor paletteColor = (PaletteColor) obj;
        return Float.compare(this.hue, paletteColor.hue) == 0 && Float.compare(this.saturation, paletteColor.saturation) == 0;
    }

    public final float getHue() {
        return this.hue;
    }

    public final float getSaturation() {
        return this.saturation;
    }

    public int hashCode() {
        return Float.hashCode(this.saturation) + (Float.hashCode(this.hue) * 31);
    }

    /* JADX INFO: renamed from: toAndroidColor-0d7_KjU, reason: not valid java name */
    public final long m2toAndroidColor0d7_KjU() {
        int i = p035g0.r.f9086m;
        return Z2.f.m(AbstractC0698y.a(this.hue), p081p0.c.N(this.saturation, 0.0f, 1.0f), 1.0f);
    }

    public final ColorDef toColorDef() {
        ColorDef colorDef = new ColorDef();
        colorDef.setHue(p081p0.c.O(G4.a.D((AbstractC0698y.a(this.hue) / 360.0f) * 65535.0f), 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE));
        colorDef.setSat(p081p0.c.O(G4.a.D(p081p0.c.N(this.saturation, 0.0f, 1.0f) * 255.0f), 0, 255));
        return colorDef;
    }

    public String toString() {
        return "PaletteColor(hue=" + this.hue + ", saturation=" + this.saturation + ")";
    }

    public PaletteColor(float f6, float f7) {
        this.hue = f6;
        this.saturation = f7;
    }
}
