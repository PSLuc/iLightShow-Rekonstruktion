package com.nanjoran.ilightshow.Model.Presets;

import E4.k;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorPalette;
import java.util.ArrayList;
import p081p0.c;
import p089q4.l;
import p089q4.m;
import p128x4.a;

/* JADX INFO: loaded from: classes.dex */
public final class ColorOption {
    public static final int $stable = 8;
    private int currentPaletteId;
    private boolean darkArtworkColors;
    private boolean useArtworkColors;
    private ArrayList<ColorPalette> palettes = m.J(ColorPalette.Companion.getPrimary());
    private Frequency paletteFrequency = Frequency.TRACK;
    private Order paletteOrder = Order.RANDOM;

    public enum Frequency {
        TRACK,
        SECTION;

        private static final /* synthetic */ a $ENTRIES = c.i0(values());

        public static a getEntries() {
            return $ENTRIES;
        }
    }

    public enum Order {
        RANDOM,
        ORDERED;

        private static final /* synthetic */ a $ENTRIES = c.i0(values());

        public static a getEntries() {
            return $ENTRIES;
        }
    }

    public final ColorPalette getCurrentPalette() {
        int i = this.currentPaletteId;
        ArrayList<ColorPalette> arrayList = this.palettes;
        if (i >= arrayList.size()) {
            return ColorPalette.Companion.getPrimary();
        }
        ColorPalette colorPalette = arrayList.get(i);
        k.e("get(...)", colorPalette);
        return colorPalette;
    }

    public final boolean getDarkArtworkColors() {
        return this.darkArtworkColors;
    }

    public final ColorPalette getPalette() {
        return (ColorPalette) l.X(this.palettes);
    }

    public final Frequency getPaletteFrequency() {
        return this.paletteFrequency;
    }

    public final Order getPaletteOrder() {
        return this.paletteOrder;
    }

    public final ArrayList<ColorPalette> getPalettes() {
        return this.palettes;
    }

    public final boolean getUseArtworkColors() {
        return this.useArtworkColors;
    }

    public final void setDarkArtworkColors(boolean z5) {
        this.darkArtworkColors = z5;
    }

    public final void setPaletteFrequency(Frequency frequency) {
        k.f("<set-?>", frequency);
        this.paletteFrequency = frequency;
    }

    public final void setPaletteOrder(Order order) {
        k.f("<set-?>", order);
        this.paletteOrder = order;
    }

    public final void setPalettes(ArrayList<ColorPalette> arrayList) {
        k.f("<set-?>", arrayList);
        this.palettes = arrayList;
    }

    public final void setUseArtworkColors(boolean z5) {
        this.useArtworkColors = z5;
    }
}
