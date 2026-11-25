package com.nanjoran.ilightshow.Model.Presets;

import B.AbstractC0013g0;
import B3.f;
import E4.g;
import E4.k;
import H4.e;
import L4.l;
import N3.C0303z0;
import Y4.a;
import Y4.d;
import android.graphics.Bitmap;
import b5.b;
import c5.k0;
import c5.p0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorPalette;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.C0659a0;
import com.nanjoran.ilightshow.Services.C0689p;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColor;
import com.nanjoran.ilightshow.Services.PaletteColorSource;
import com.nanjoran.ilightshow.Services.PaletteSaturationRange;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.http2.Http2;
import p081p0.c;
import p089q4.u;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@d
public final class UMPreset {
    private int ambientBrightness;
    private Palette autoPalette;
    private int brightnessMax;
    private int brightnessMin;
    private boolean colorFades;
    private boolean enablePulses;
    private String engineMode;
    private String flashMode;
    private String fxSize;
    private String intensityMode;
    private String name;
    private String paletteId;
    private int saturationMax;
    private int saturationMin;
    private final boolean smartMode;
    private boolean standardHighFlash;
    private boolean standardStrobe;
    private boolean strobeDrops;
    private boolean strobeDropsWhite;
    private boolean useArtworkColors;
    private final boolean whiteFlash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final UMPreset defaultPreset() {
            return new UMPreset(null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null);
        }

        public final String normalizedFxSize(String str, String str2) {
            k.f("engineMode", str);
            k.f("fxSize", str2);
            FXOpt fXOpt = FXOpt.INSTANCE;
            if (str.equals(fXOpt.getEngineAdvanced())) {
                if (str2.equals(fXOpt.getSizeAuto()) || str2.equals(fXOpt.getSize100())) {
                    return fXOpt.getSize25();
                }
            } else if (!str2.equals(fXOpt.getSize100())) {
                return fXOpt.getSizeAuto();
            }
            return str2;
        }

        public final a serializer() {
            return UMPreset$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UMPreset() {
        this(null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null);
    }

    public static /* synthetic */ UMPreset copy$default(UMPreset uMPreset, String str, int i, int i3, int i6, int i7, int i8, String str2, boolean z5, Palette palette, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, String str6, int i9, Object obj) {
        String str7;
        boolean z12;
        String str8 = (i9 & 1) != 0 ? uMPreset.name : str;
        int i10 = (i9 & 2) != 0 ? uMPreset.brightnessMin : i;
        int i11 = (i9 & 4) != 0 ? uMPreset.brightnessMax : i3;
        int i12 = (i9 & 8) != 0 ? uMPreset.saturationMin : i6;
        int i13 = (i9 & 16) != 0 ? uMPreset.saturationMax : i7;
        int i14 = (i9 & 32) != 0 ? uMPreset.ambientBrightness : i8;
        String str9 = (i9 & 64) != 0 ? uMPreset.paletteId : str2;
        boolean z13 = (i9 & 128) != 0 ? uMPreset.useArtworkColors : z5;
        Palette palette2 = (i9 & HueLog.LogComponent.STREAMDTLS) != 0 ? uMPreset.autoPalette : palette;
        boolean z14 = (i9 & HueLog.LogComponent.APPCORE) != 0 ? uMPreset.strobeDrops : z6;
        boolean z15 = (i9 & 1024) != 0 ? uMPreset.strobeDropsWhite : z7;
        String str10 = (i9 & 2048) != 0 ? uMPreset.flashMode : str3;
        String str11 = (i9 & 4096) != 0 ? uMPreset.fxSize : str4;
        String str12 = (i9 & 8192) != 0 ? uMPreset.engineMode : str5;
        String str13 = str8;
        boolean z16 = (i9 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? uMPreset.standardStrobe : z8;
        boolean z17 = (i9 & 32768) != 0 ? uMPreset.standardHighFlash : z9;
        boolean z18 = (i9 & 65536) != 0 ? uMPreset.enablePulses : z10;
        boolean z19 = (i9 & 131072) != 0 ? uMPreset.colorFades : z11;
        if ((i9 & 262144) != 0) {
            z12 = z19;
            str7 = uMPreset.intensityMode;
        } else {
            str7 = str6;
            z12 = z19;
        }
        return uMPreset.copy(str13, i10, i11, i12, i13, i14, str9, z13, palette2, z14, z15, str10, str11, str12, z16, z17, z18, z12, str7);
    }

    public static /* synthetic */ void getAutoPalette$annotations() {
    }

    public static /* synthetic */ int getShiftedBrightness$default(UMPreset uMPreset, int i, int i3, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i3 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = 255;
        }
        return uMPreset.getShiftedBrightness(i, i3, i6);
    }

    public static final /* synthetic */ void write$Self$app_release(UMPreset uMPreset, b bVar, a5.g gVar) {
        if (bVar.p(gVar) || !k.a(uMPreset.name, "Default")) {
            ((c) bVar).g0(gVar, 0, uMPreset.name);
        }
        if (bVar.p(gVar) || uMPreset.brightnessMin != 50) {
            ((c) bVar).d0(1, uMPreset.brightnessMin, gVar);
        }
        if (bVar.p(gVar) || uMPreset.brightnessMax != 255) {
            ((c) bVar).d0(2, uMPreset.brightnessMax, gVar);
        }
        if (bVar.p(gVar) || uMPreset.saturationMin != 0) {
            ((c) bVar).d0(3, uMPreset.saturationMin, gVar);
        }
        if (bVar.p(gVar) || uMPreset.saturationMax != 255) {
            ((c) bVar).d0(4, uMPreset.saturationMax, gVar);
        }
        if (bVar.p(gVar) || uMPreset.ambientBrightness != 127) {
            ((c) bVar).d0(5, uMPreset.ambientBrightness, gVar);
        }
        if (bVar.p(gVar) || uMPreset.paletteId != null) {
            bVar.n(gVar, 6, p0.f7477a, uMPreset.paletteId);
        }
        if (bVar.p(gVar) || uMPreset.useArtworkColors) {
            ((c) bVar).Y(gVar, 7, uMPreset.useArtworkColors);
        }
        if (bVar.p(gVar) || !uMPreset.strobeDrops) {
            ((c) bVar).Y(gVar, 8, uMPreset.strobeDrops);
        }
        if (bVar.p(gVar) || !uMPreset.strobeDropsWhite) {
            ((c) bVar).Y(gVar, 9, uMPreset.strobeDropsWhite);
        }
        if (bVar.p(gVar) || !k.a(uMPreset.flashMode, FXOpt.INSTANCE.getEffectPulse())) {
            ((c) bVar).g0(gVar, 10, uMPreset.flashMode);
        }
        if (bVar.p(gVar) || !k.a(uMPreset.fxSize, FXOpt.INSTANCE.getSize25())) {
            ((c) bVar).g0(gVar, 11, uMPreset.fxSize);
        }
        if (bVar.p(gVar) || !k.a(uMPreset.engineMode, FXOpt.INSTANCE.getEngineAdvanced())) {
            ((c) bVar).g0(gVar, 12, uMPreset.engineMode);
        }
        if (bVar.p(gVar) || uMPreset.standardStrobe) {
            ((c) bVar).Y(gVar, 13, uMPreset.standardStrobe);
        }
        if (bVar.p(gVar) || uMPreset.standardHighFlash) {
            ((c) bVar).Y(gVar, 14, uMPreset.standardHighFlash);
        }
        if (bVar.p(gVar) || !uMPreset.enablePulses) {
            ((c) bVar).Y(gVar, 15, uMPreset.enablePulses);
        }
        if (bVar.p(gVar) || !uMPreset.colorFades) {
            ((c) bVar).Y(gVar, 16, uMPreset.colorFades);
        }
        if (bVar.p(gVar) || !k.a(uMPreset.intensityMode, FXOpt.INSTANCE.getIntensityNormal())) {
            ((c) bVar).g0(gVar, 17, uMPreset.intensityMode);
        }
        if (bVar.p(gVar) || !uMPreset.smartMode) {
            ((c) bVar).Y(gVar, 18, uMPreset.smartMode);
        }
        if (bVar.p(gVar) || uMPreset.whiteFlash) {
            ((c) bVar).Y(gVar, 19, uMPreset.whiteFlash);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.strobeDrops;
    }

    public final boolean component11() {
        return this.strobeDropsWhite;
    }

    public final String component12() {
        return this.flashMode;
    }

    public final String component13() {
        return this.fxSize;
    }

    public final String component14() {
        return this.engineMode;
    }

    public final boolean component15() {
        return this.standardStrobe;
    }

    public final boolean component16() {
        return this.standardHighFlash;
    }

    public final boolean component17() {
        return this.enablePulses;
    }

    public final boolean component18() {
        return this.colorFades;
    }

    public final String component19() {
        return this.intensityMode;
    }

    public final int component2() {
        return this.brightnessMin;
    }

    public final int component3() {
        return this.brightnessMax;
    }

    public final int component4() {
        return this.saturationMin;
    }

    public final int component5() {
        return this.saturationMax;
    }

    public final int component6() {
        return this.ambientBrightness;
    }

    public final String component7() {
        return this.paletteId;
    }

    public final boolean component8() {
        return this.useArtworkColors;
    }

    public final Palette component9() {
        return this.autoPalette;
    }

    public final UMPreset copy(String str, int i, int i3, int i6, int i7, int i8, String str2, boolean z5, Palette palette, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, String str6) {
        k.f("name", str);
        k.f("flashMode", str3);
        k.f("fxSize", str4);
        k.f("engineMode", str5);
        k.f("intensityMode", str6);
        return new UMPreset(str, i, i3, i6, i7, i8, str2, z5, palette, z6, z7, str3, str4, str5, z8, z9, z10, z11, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UMPreset)) {
            return false;
        }
        UMPreset uMPreset = (UMPreset) obj;
        return k.a(this.name, uMPreset.name) && this.brightnessMin == uMPreset.brightnessMin && this.brightnessMax == uMPreset.brightnessMax && this.saturationMin == uMPreset.saturationMin && this.saturationMax == uMPreset.saturationMax && this.ambientBrightness == uMPreset.ambientBrightness && k.a(this.paletteId, uMPreset.paletteId) && this.useArtworkColors == uMPreset.useArtworkColors && k.a(this.autoPalette, uMPreset.autoPalette) && this.strobeDrops == uMPreset.strobeDrops && this.strobeDropsWhite == uMPreset.strobeDropsWhite && k.a(this.flashMode, uMPreset.flashMode) && k.a(this.fxSize, uMPreset.fxSize) && k.a(this.engineMode, uMPreset.engineMode) && this.standardStrobe == uMPreset.standardStrobe && this.standardHighFlash == uMPreset.standardHighFlash && this.enablePulses == uMPreset.enablePulses && this.colorFades == uMPreset.colorFades && k.a(this.intensityMode, uMPreset.intensityMode);
    }

    public final boolean getAllAtOnce() {
        return k.a(this.fxSize, FXOpt.INSTANCE.getSize100());
    }

    public final int getAmbientBrightness() {
        return this.ambientBrightness;
    }

    public final Palette getAutoPalette() {
        return this.autoPalette;
    }

    public final int getBrightnessMax() {
        return this.brightnessMax;
    }

    public final int getBrightnessMin() {
        return this.brightnessMin;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    public final ColorPalette getColorDefs() {
        ColorPalette oldColorPalette;
        ColorPalette colorPaletteWithSaturationRange;
        Palette paletteB;
        f fVarA;
        Bitmap bitmap;
        Palette palette;
        List listV;
        float fAbs;
        if (this.useArtworkColors) {
            H3.d dVarA = H3.f.f1787d.a();
            ColorPalette oldColorPalette2 = null;
            if (dVarA != null && (fVarA = dVarA.a()) != null && (bitmap = (Bitmap) fVarA.f566l.getValue()) != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width <= 0 || height <= 0) {
                    palette = null;
                } else {
                    int iMin = Math.min(width, 64);
                    int iMin2 = Math.min(height, 64);
                    int i = iMin * iMin2;
                    int[] iArr = new int[i];
                    float f6 = width / iMin;
                    float f7 = height / iMin2;
                    for (int i3 = 0; i3 < iMin2; i3++) {
                        for (int i6 = 0; i6 < iMin; i6++) {
                            iArr[(i3 * iMin) + i6] = bitmap.getPixel((int) (i6 * f6), (int) (i3 * f7));
                        }
                    }
                    L4.b bVar = new L4.b(new L4.g(l.Q(i == 0 ? L4.f.f3104a : new B4.b(3, iArr), new defpackage.d(23))), new defpackage.d(24));
                    if (bVar.hasNext()) {
                        Object next = bVar.next();
                        if (bVar.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(next);
                            while (bVar.hasNext()) {
                                arrayList.add(bVar.next());
                            }
                            listV = arrayList;
                        } else {
                            listV = d0.v(next);
                        }
                    } else {
                        listV = u.f11237h;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listV) {
                        if (((PaletteColor) obj).getSaturation() >= 0.18f) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        listV = arrayList2;
                    }
                    List<PaletteColor> listN0 = p089q4.l.n0(listV, new C0303z0(new C0689p(1), 3));
                    ArrayList arrayList3 = new ArrayList();
                    for (PaletteColor paletteColor : listN0) {
                        if (arrayList3.size() < 4) {
                            if (!arrayList3.isEmpty()) {
                                int size = arrayList3.size();
                                int i7 = 0;
                                do {
                                    if (i7 < size) {
                                        Object obj2 = arrayList3.get(i7);
                                        i7++;
                                        fAbs = Math.abs(AbstractC0698y.a(((PaletteColor) obj2).getHue()) - AbstractC0698y.a(paletteColor.getHue()));
                                    }
                                } while (Math.min(fAbs, 360.0f - fAbs) >= 10.0f);
                            }
                            arrayList3.add(paletteColor);
                            break;
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        palette = null;
                    } else {
                        palette = new Palette(PaletteColorSource.TYPE_ARTWORK, "Artwork", 0, p089q4.l.u0(arrayList3), 4, (g) null);
                    }
                }
                if (palette != null) {
                    oldColorPalette2 = palette.toOldColorPalette();
                }
            }
            if (oldColorPalette2 != null && !oldColorPalette2.getColors().isEmpty()) {
                return oldColorPalette2;
            }
        }
        String str = this.paletteId;
        if (str != null && !this.useArtworkColors && (paletteB = AbstractC0665d0.b(str)) != null) {
            return paletteB.toOldColorPalette();
        }
        if (this.autoPalette == null) {
            nextAutoPalette();
        }
        Palette palette2 = this.autoPalette;
        return (palette2 == null || (oldColorPalette = palette2.toOldColorPalette()) == null || (colorPaletteWithSaturationRange = oldColorPalette.withSaturationRange(this.saturationMin, this.saturationMax)) == null) ? new ColorPalette() : colorPaletteWithSaturationRange;
    }

    public final boolean getColorFades() {
        return this.colorFades;
    }

    public final boolean getEnablePulses() {
        return this.enablePulses;
    }

    public final String getEngineMode() {
        return this.engineMode;
    }

    public final String getFlashMode() {
        return this.flashMode;
    }

    public final String getFxSize() {
        return this.fxSize;
    }

    public final String getIntensityMode() {
        return this.intensityMode;
    }

    public final int getIntensityShift() {
        String str = this.engineMode;
        FXOpt fXOpt = FXOpt.INSTANCE;
        if (k.a(str, fXOpt.getEngineAdvanced())) {
            return 0;
        }
        String str2 = this.intensityMode;
        if (k.a(str2, fXOpt.getIntensityMax())) {
            return 80;
        }
        return k.a(str2, fXOpt.getIntensityChill()) ? -80 : 0;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaletteId() {
        return this.paletteId;
    }

    public final int getSaturationMax() {
        return this.saturationMax;
    }

    public final int getSaturationMin() {
        return this.saturationMin;
    }

    public final int getShiftedBrightness(int i, int i3, int i6) {
        double d6 = ((double) i) / 255.0d;
        int iMin = Math.min(this.brightnessMax, i6);
        int iMax = Math.max(this.brightnessMin, i3);
        return (int) ((((double) (iMin - iMax)) * d6) + ((double) iMax));
    }

    public final boolean getSmartMode() {
        return this.smartMode;
    }

    public final boolean getStandardHighFlash() {
        return this.standardHighFlash;
    }

    public final boolean getStandardStrobe() {
        return this.standardStrobe;
    }

    public final boolean getStrobeDrops() {
        return this.strobeDrops;
    }

    public final boolean getStrobeDropsWhite() {
        return this.strobeDropsWhite;
    }

    public final boolean getUseArtworkColors() {
        return this.useArtworkColors;
    }

    public final boolean getWhiteFlash() {
        return this.whiteFlash;
    }

    public int hashCode() {
        int iC = AbstractC0916i.c(this.ambientBrightness, AbstractC0916i.c(this.saturationMax, AbstractC0916i.c(this.saturationMin, AbstractC0916i.c(this.brightnessMax, AbstractC0916i.c(this.brightnessMin, this.name.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.paletteId;
        int iM = p012c.k.m(this.useArtworkColors, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        Palette palette = this.autoPalette;
        return this.intensityMode.hashCode() + p012c.k.m(this.colorFades, p012c.k.m(this.enablePulses, p012c.k.m(this.standardHighFlash, p012c.k.m(this.standardStrobe, AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(p012c.k.m(this.strobeDropsWhite, p012c.k.m(this.strobeDrops, (iM + (palette != null ? palette.hashCode() : 0)) * 31, 31), 31), this.flashMode, 31), this.fxSize, 31), this.engineMode, 31), 31), 31), 31), 31);
    }

    public final void nextAutoPalette() {
        File file = AbstractC0665d0.f8380a;
        Palette palette = new Palette((String) null, (String) null, 0, new ArrayList(), 7, (g) null);
        J4.d dVarD0 = c.D0(0, 360);
        H4.a aVar = e.f1802h;
        k.f("<this>", dVarD0);
        try {
            float fW = d0.w(dVarD0);
            try {
                if (d0.w(new J4.d(0, 1, 1)) == 0) {
                    float f6 = 360;
                    palette.getColors().add(new PaletteColor(fW % f6, 1.0f));
                    palette.getColors().add(new PaletteColor((120 + fW) % f6, 1.0f));
                    palette.getColors().add(new PaletteColor((fW + 240) % f6, 1.0f));
                } else {
                    float f7 = 360;
                    palette.getColors().add(new PaletteColor(fW % f7, 1.0f));
                    palette.getColors().add(new PaletteColor((fW + 180) % f7, 1.0f));
                }
                this.autoPalette = palette;
            } catch (IllegalArgumentException e6) {
                throw new NoSuchElementException(e6.getMessage());
            }
        } catch (IllegalArgumentException e7) {
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    public final UMPreset normalizeEngineAndFxSize() {
        this.fxSize = Companion.normalizedFxSize(this.engineMode, this.fxSize);
        return this;
    }

    public final void setAmbientBrightness(int i) {
        this.ambientBrightness = i;
    }

    public final void setAutoPalette(Palette palette) {
        this.autoPalette = palette;
    }

    public final void setBrightnessMax(int i) {
        this.brightnessMax = i;
    }

    public final void setBrightnessMin(int i) {
        this.brightnessMin = i;
    }

    public final void setColorFades(boolean z5) {
        this.colorFades = z5;
    }

    public final void setEnablePulses(boolean z5) {
        this.enablePulses = z5;
    }

    public final void setEngineMode(String str) {
        k.f("<set-?>", str);
        this.engineMode = str;
    }

    public final void setFlashMode(String str) {
        k.f("<set-?>", str);
        this.flashMode = str;
    }

    public final void setFxSize(String str) {
        k.f("<set-?>", str);
        this.fxSize = str;
    }

    public final void setIntensityMode(String str) {
        k.f("<set-?>", str);
        this.intensityMode = str;
    }

    public final void setName(String str) {
        k.f("<set-?>", str);
        this.name = str;
    }

    public final void setPaletteId(String str) {
        this.paletteId = str;
    }

    public final void setSaturationMax(int i) {
        this.saturationMax = i;
    }

    public final void setSaturationMin(int i) {
        this.saturationMin = i;
    }

    public final void setStandardHighFlash(boolean z5) {
        this.standardHighFlash = z5;
    }

    public final void setStandardStrobe(boolean z5) {
        this.standardStrobe = z5;
    }

    public final void setStrobeDrops(boolean z5) {
        this.strobeDrops = z5;
    }

    public final void setStrobeDropsWhite(boolean z5) {
        this.strobeDropsWhite = z5;
    }

    public final void setUseArtworkColors(boolean z5) {
        this.useArtworkColors = z5;
    }

    public final PaletteColorSource toSharedColorSource() {
        String str = this.paletteId;
        if (this.useArtworkColors) {
            PaletteColorSource.Companion.getClass();
            return new PaletteColorSource(PaletteColorSource.TYPE_ARTWORK, (String) null, (PaletteSaturationRange) null, (String) null, PaletteColorSource.DISPLAY_PALETTE, 14, (g) null);
        }
        if (str != null) {
            PaletteColorSource.Companion.getClass();
            return new PaletteColorSource(PaletteColorSource.TYPE_CUSTOM_PALETTE, str, (PaletteSaturationRange) null, (String) null, PaletteColorSource.DISPLAY_PALETTE, 12, (g) null);
        }
        C0659a0 c0659a0 = PaletteColorSource.Companion;
        int i = this.saturationMin;
        int i3 = this.saturationMax;
        c0659a0.getClass();
        return new PaletteColorSource(PaletteColorSource.TYPE_AUTO, (String) null, new PaletteSaturationRange(i, i3), "random", "random", 2, (g) null);
    }

    public String toString() {
        String str = this.name;
        int i = this.brightnessMin;
        int i3 = this.brightnessMax;
        int i6 = this.saturationMin;
        int i7 = this.saturationMax;
        int i8 = this.ambientBrightness;
        String str2 = this.paletteId;
        boolean z5 = this.useArtworkColors;
        Palette palette = this.autoPalette;
        boolean z6 = this.strobeDrops;
        boolean z7 = this.strobeDropsWhite;
        String str3 = this.flashMode;
        String str4 = this.fxSize;
        String str5 = this.engineMode;
        boolean z8 = this.standardStrobe;
        boolean z9 = this.standardHighFlash;
        boolean z10 = this.enablePulses;
        boolean z11 = this.colorFades;
        String str6 = this.intensityMode;
        StringBuilder sb = new StringBuilder("UMPreset(name=");
        sb.append(str);
        sb.append(", brightnessMin=");
        sb.append(i);
        sb.append(", brightnessMax=");
        sb.append(i3);
        sb.append(", saturationMin=");
        sb.append(i6);
        sb.append(", saturationMax=");
        sb.append(i7);
        sb.append(", ambientBrightness=");
        sb.append(i8);
        sb.append(", paletteId=");
        sb.append(str2);
        sb.append(", useArtworkColors=");
        sb.append(z5);
        sb.append(", autoPalette=");
        sb.append(palette);
        sb.append(", strobeDrops=");
        sb.append(z6);
        sb.append(", strobeDropsWhite=");
        sb.append(z7);
        sb.append(", flashMode=");
        sb.append(str3);
        sb.append(", fxSize=");
        AbstractC0013g0.t(sb, str4, ", engineMode=", str5, ", standardStrobe=");
        sb.append(z8);
        sb.append(", standardHighFlash=");
        sb.append(z9);
        sb.append(", enablePulses=");
        sb.append(z10);
        sb.append(", colorFades=");
        sb.append(z11);
        sb.append(", intensityMode=");
        return p012c.k.u(sb, str6, ")");
    }

    public final UMPreset withEngineMode(String str) {
        k.f("newEngineMode", str);
        this.engineMode = str;
        return normalizeEngineAndFxSize();
    }

    public final UMPreset withFxSize(String str) {
        k.f("newFxSize", str);
        this.fxSize = str;
        return normalizeEngineAndFxSize();
    }

    public /* synthetic */ UMPreset(int i, String str, int i3, int i6, int i7, int i8, int i9, String str2, boolean z5, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, String str6, boolean z12, boolean z13, k0 k0Var) {
        this.name = (i & 1) == 0 ? "Default" : str;
        if ((i & 2) == 0) {
            this.brightnessMin = 50;
        } else {
            this.brightnessMin = i3;
        }
        if ((i & 4) == 0) {
            this.brightnessMax = 255;
        } else {
            this.brightnessMax = i6;
        }
        if ((i & 8) == 0) {
            this.saturationMin = 0;
        } else {
            this.saturationMin = i7;
        }
        if ((i & 16) == 0) {
            this.saturationMax = 255;
        } else {
            this.saturationMax = i8;
        }
        if ((i & 32) == 0) {
            this.ambientBrightness = 127;
        } else {
            this.ambientBrightness = i9;
        }
        if ((i & 64) == 0) {
            this.paletteId = null;
        } else {
            this.paletteId = str2;
        }
        if ((i & 128) == 0) {
            this.useArtworkColors = false;
        } else {
            this.useArtworkColors = z5;
        }
        this.autoPalette = null;
        if ((i & HueLog.LogComponent.STREAMDTLS) == 0) {
            this.strobeDrops = true;
        } else {
            this.strobeDrops = z6;
        }
        if ((i & HueLog.LogComponent.APPCORE) == 0) {
            this.strobeDropsWhite = true;
        } else {
            this.strobeDropsWhite = z7;
        }
        if ((i & 1024) == 0) {
            this.flashMode = FXOpt.INSTANCE.getEffectPulse();
        } else {
            this.flashMode = str3;
        }
        if ((i & 2048) == 0) {
            this.fxSize = FXOpt.INSTANCE.getSize25();
        } else {
            this.fxSize = str4;
        }
        if ((i & 4096) == 0) {
            this.engineMode = FXOpt.INSTANCE.getEngineAdvanced();
        } else {
            this.engineMode = str5;
        }
        if ((i & 8192) == 0) {
            this.standardStrobe = false;
        } else {
            this.standardStrobe = z8;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.standardHighFlash = false;
        } else {
            this.standardHighFlash = z9;
        }
        if ((32768 & i) == 0) {
            this.enablePulses = true;
        } else {
            this.enablePulses = z10;
        }
        if ((65536 & i) == 0) {
            this.colorFades = true;
        } else {
            this.colorFades = z11;
        }
        this.intensityMode = (131072 & i) == 0 ? FXOpt.INSTANCE.getIntensityNormal() : str6;
        normalizeEngineAndFxSize();
        if ((262144 & i) == 0) {
            this.smartMode = true;
        } else {
            this.smartMode = z12;
        }
        if ((i & 524288) == 0) {
            this.whiteFlash = false;
        } else {
            this.whiteFlash = z13;
        }
    }

    public UMPreset(String str, int i, int i3, int i6, int i7, int i8, String str2, boolean z5, Palette palette, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, String str6) {
        k.f("name", str);
        k.f("flashMode", str3);
        k.f("fxSize", str4);
        k.f("engineMode", str5);
        k.f("intensityMode", str6);
        this.name = str;
        this.brightnessMin = i;
        this.brightnessMax = i3;
        this.saturationMin = i6;
        this.saturationMax = i7;
        this.ambientBrightness = i8;
        this.paletteId = str2;
        this.useArtworkColors = z5;
        this.autoPalette = palette;
        this.strobeDrops = z6;
        this.strobeDropsWhite = z7;
        this.flashMode = str3;
        this.fxSize = str4;
        this.engineMode = str5;
        this.standardStrobe = z8;
        this.standardHighFlash = z9;
        this.enablePulses = z10;
        this.colorFades = z11;
        this.intensityMode = str6;
        normalizeEngineAndFxSize();
        this.smartMode = true;
    }

    public /* synthetic */ UMPreset(String str, int i, int i3, int i6, int i7, int i8, String str2, boolean z5, Palette palette, boolean z6, boolean z7, String str3, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, String str6, int i9, g gVar) {
        this((i9 & 1) != 0 ? "Default" : str, (i9 & 2) != 0 ? 50 : i, (i9 & 4) != 0 ? 255 : i3, (i9 & 8) != 0 ? 0 : i6, (i9 & 16) == 0 ? i7 : 255, (i9 & 32) != 0 ? 127 : i8, (i9 & 64) != 0 ? null : str2, (i9 & 128) != 0 ? false : z5, (i9 & HueLog.LogComponent.STREAMDTLS) == 0 ? palette : null, (i9 & HueLog.LogComponent.APPCORE) != 0 ? true : z6, (i9 & 1024) != 0 ? true : z7, (i9 & 2048) != 0 ? FXOpt.INSTANCE.getEffectPulse() : str3, (i9 & 4096) != 0 ? FXOpt.INSTANCE.getSize25() : str4, (i9 & 8192) != 0 ? FXOpt.INSTANCE.getEngineAdvanced() : str5, (i9 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z8, (i9 & 32768) != 0 ? false : z9, (i9 & 65536) != 0 ? true : z10, (i9 & 131072) != 0 ? true : z11, (i9 & 262144) != 0 ? FXOpt.INSTANCE.getIntensityNormal() : str6);
    }
}
