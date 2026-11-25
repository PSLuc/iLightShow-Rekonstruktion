package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class PaletteSaturationRange {
    public static final int $stable = 0;
    public static final C0663c0 Companion = new C0663c0();
    private final int max;
    private final int min;

    /* JADX WARN: Illegal instructions before constructor call */
    public PaletteSaturationRange() {
        int i = 0;
        this(i, i, 3, (E4.g) null);
    }

    public static /* synthetic */ PaletteSaturationRange copy$default(PaletteSaturationRange paletteSaturationRange, int i, int i3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = paletteSaturationRange.min;
        }
        if ((i6 & 2) != 0) {
            i3 = paletteSaturationRange.max;
        }
        return paletteSaturationRange.copy(i, i3);
    }

    public static final /* synthetic */ void write$Self$app_release(PaletteSaturationRange paletteSaturationRange, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || paletteSaturationRange.min != 0) {
            ((p081p0.c) bVar).d0(0, paletteSaturationRange.min, gVar);
        }
        if (!bVar.p(gVar) && paletteSaturationRange.max == 255) {
            return;
        }
        ((p081p0.c) bVar).d0(1, paletteSaturationRange.max, gVar);
    }

    public final int component1() {
        return this.min;
    }

    public final int component2() {
        return this.max;
    }

    public final PaletteSaturationRange copy(int i, int i3) {
        return new PaletteSaturationRange(i, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaletteSaturationRange)) {
            return false;
        }
        PaletteSaturationRange paletteSaturationRange = (PaletteSaturationRange) obj;
        return this.min == paletteSaturationRange.min && this.max == paletteSaturationRange.max;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + (Integer.hashCode(this.min) * 31);
    }

    public String toString() {
        return "PaletteSaturationRange(min=" + this.min + ", max=" + this.max + ")";
    }

    public /* synthetic */ PaletteSaturationRange(int i, int i3, int i6, c5.k0 k0Var) {
        this.min = (i & 1) == 0 ? 0 : i3;
        if ((i & 2) == 0) {
            this.max = 255;
        } else {
            this.max = i6;
        }
    }

    public PaletteSaturationRange(int i, int i3) {
        this.min = i;
        this.max = i3;
    }

    public /* synthetic */ PaletteSaturationRange(int i, int i3, int i6, E4.g gVar) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 255 : i3);
    }
}
