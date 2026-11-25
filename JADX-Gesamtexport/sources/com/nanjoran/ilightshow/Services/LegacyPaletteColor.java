package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
final class LegacyPaletteColor {
    public static final H Companion = new H();
    private final float hue;
    private final float saturation;

    /* JADX WARN: Illegal instructions before constructor call */
    public LegacyPaletteColor() {
        float f6 = 0.0f;
        this(f6, f6, 3, (E4.g) null);
    }

    public static /* synthetic */ LegacyPaletteColor copy$default(LegacyPaletteColor legacyPaletteColor, float f6, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f6 = legacyPaletteColor.hue;
        }
        if ((i & 2) != 0) {
            f7 = legacyPaletteColor.saturation;
        }
        return legacyPaletteColor.copy(f6, f7);
    }

    public static final /* synthetic */ void write$Self$app_release(LegacyPaletteColor legacyPaletteColor, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || Float.compare(legacyPaletteColor.hue, 0.0f) != 0) {
            ((p081p0.c) bVar).b0(gVar, 0, legacyPaletteColor.hue);
        }
        if (!bVar.p(gVar) && Float.compare(legacyPaletteColor.saturation, 1.0f) == 0) {
            return;
        }
        ((p081p0.c) bVar).b0(gVar, 1, legacyPaletteColor.saturation);
    }

    public final float component1() {
        return this.hue;
    }

    public final float component2() {
        return this.saturation;
    }

    public final LegacyPaletteColor copy(float f6, float f7) {
        return new LegacyPaletteColor(f6, f7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyPaletteColor)) {
            return false;
        }
        LegacyPaletteColor legacyPaletteColor = (LegacyPaletteColor) obj;
        return Float.compare(this.hue, legacyPaletteColor.hue) == 0 && Float.compare(this.saturation, legacyPaletteColor.saturation) == 0;
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

    public String toString() {
        return "LegacyPaletteColor(hue=" + this.hue + ", saturation=" + this.saturation + ")";
    }

    public /* synthetic */ LegacyPaletteColor(int i, float f6, float f7, c5.k0 k0Var) {
        this.hue = (i & 1) == 0 ? 0.0f : f6;
        if ((i & 2) == 0) {
            this.saturation = 1.0f;
        } else {
            this.saturation = f7;
        }
    }

    public LegacyPaletteColor(float f6, float f7) {
        this.hue = f6;
        this.saturation = f7;
    }

    public /* synthetic */ LegacyPaletteColor(float f6, float f7, int i, E4.g gVar) {
        this((i & 1) != 0 ? 0.0f : f6, (i & 2) != 0 ? 1.0f : f7);
    }
}
