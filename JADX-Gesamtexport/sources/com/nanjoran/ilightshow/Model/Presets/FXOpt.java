package com.nanjoran.ilightshow.Model.Presets;

import com.nanjoran.ilightshow.Services.PaletteColorSource;

/* JADX INFO: loaded from: classes.dex */
public final class FXOpt {
    public static final int $stable = 0;
    public static final FXOpt INSTANCE = new FXOpt();
    private static final String engineAdvanced = "advanced";
    private static final String engineStandard = "standard";
    private static final String engineLegacy = "legacy";
    private static final String strobeOff = "off";
    private static final String strobeColor = "color";
    private static final String strobeWhite = "white";
    private static final String effectOff = "off";
    private static final String effectPulse = "pulse";
    private static final String effectFlash = "flash";
    private static final String effectPulseAndFlash = "all";
    private static final String sizeAuto = PaletteColorSource.TYPE_AUTO;
    private static final String size1 = "1";
    private static final String size25 = "25";
    private static final String size50 = "50";
    private static final String size100 = "100";
    private static final String intensityChill = "intensityChill";
    private static final String intensityNormal = "intensityNormal";
    private static final String intensityMax = "intensityMax";

    private FXOpt() {
    }

    public final String getEffectFlash() {
        return effectFlash;
    }

    public final String getEffectOff() {
        return effectOff;
    }

    public final String getEffectPulse() {
        return effectPulse;
    }

    public final String getEffectPulseAndFlash() {
        return effectPulseAndFlash;
    }

    public final String getEngineAdvanced() {
        return engineAdvanced;
    }

    public final String getEngineLegacy() {
        return engineLegacy;
    }

    public final String getEngineStandard() {
        return engineStandard;
    }

    public final String getIntensityChill() {
        return intensityChill;
    }

    public final String getIntensityMax() {
        return intensityMax;
    }

    public final String getIntensityNormal() {
        return intensityNormal;
    }

    public final String getSize1() {
        return size1;
    }

    public final String getSize100() {
        return size100;
    }

    public final String getSize25() {
        return size25;
    }

    public final String getSize50() {
        return size50;
    }

    public final String getSizeAuto() {
        return sizeAuto;
    }

    public final String getStrobeColor() {
        return strobeColor;
    }

    public final String getStrobeOff() {
        return strobeOff;
    }

    public final String getStrobeWhite() {
        return strobeWhite;
    }
}
