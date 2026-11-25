package com.nanjoran.ilightshow.Model.Presets.Palettes;

import E4.g;
import E4.k;
import G4.a;
import java.util.ArrayList;
import p089q4.l;
import p089q4.m;
import p089q4.n;

/* JADX INFO: loaded from: classes.dex */
public final class ColorPalette {
    private ArrayList<ColorDef> colors = new ArrayList<>();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ColorPalette getPrimary() {
            ColorPalette colorPalette = new ColorPalette();
            ColorDef colorDef = new ColorDef();
            colorDef.setHue(0);
            colorDef.setSat(255);
            ColorDef colorDef2 = new ColorDef();
            colorDef2.setHue(21845);
            colorDef2.setSat(255);
            ColorDef colorDef3 = new ColorDef();
            colorDef3.setHue(43690);
            colorDef3.setSat(255);
            colorPalette.setColors(m.J(colorDef, colorDef2, colorDef3));
            return colorPalette;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ ColorDef getRandomFromPalette$default(ColorPalette colorPalette, ColorDef colorDef, int i, Object obj) {
        if ((i & 1) != 0) {
            colorDef = null;
        }
        return colorPalette.getRandomFromPalette(colorDef);
    }

    public final ArrayList<ColorDef> getColors() {
        return this.colors;
    }

    public final ColorDef getRandomFromPalette(ColorDef colorDef) {
        ColorDef colorDef2;
        ArrayList<ColorDef> arrayList = this.colors;
        if (arrayList.size() == 1) {
            colorDef2 = (ColorDef) l.Z(arrayList);
        } else {
            ColorDef colorDef3 = colorDef;
            while (!arrayList.isEmpty() && k.a(colorDef3, colorDef)) {
                colorDef3 = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
            }
            colorDef2 = colorDef3;
        }
        return colorDef2 == null ? new ColorDef() : colorDef2;
    }

    public final void setColors(ArrayList<ColorDef> arrayList) {
        k.f("<set-?>", arrayList);
        this.colors = arrayList;
    }

    public final ColorPalette withSaturationRange(int i, int i3) {
        ColorPalette colorPalette = new ColorPalette();
        ArrayList<ColorDef> arrayList = this.colors;
        ArrayList arrayList2 = new ArrayList(n.P(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            ColorDef colorDef = arrayList.get(i6);
            i6++;
            ColorDef colorDef2 = colorDef;
            ColorDef colorDef3 = new ColorDef();
            colorDef3.setHue(colorDef2.getHue());
            colorDef3.setSat(a.D(((colorDef2.getSat() / 255.0f) * (i3 - i)) + i));
            arrayList2.add(colorDef3);
        }
        colorPalette.colors = new ArrayList<>(arrayList2);
        return colorPalette;
    }
}
