package com.nanjoran.ilightshow.Model.Presets.Palettes;

import android.graphics.Color;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class ColorDef {
    public static final int $stable = 8;
    private int hue = (int) (Math.random() * ((double) 65534));
    private int sat = 255;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ColorDef colorDef = (ColorDef) obj;
        return colorDef.hue == this.hue && colorDef.sat == this.sat;
    }

    public final int getAndroidColor() {
        float[] fArr = {0.0f, 1.0f, 1.0f};
        fArr[0] = (this.hue * 360.0f) / Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        fArr[1] = this.sat / 255.0f;
        return Color.HSVToColor(fArr);
    }

    public final int getHue() {
        return this.hue;
    }

    public final int getSat() {
        return this.sat;
    }

    public final void setHue(int i) {
        this.hue = i;
    }

    public final void setSat(int i) {
        this.sat = i;
    }
}
