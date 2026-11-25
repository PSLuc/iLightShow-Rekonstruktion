package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class PaletteColorSource {
    public static final int $stable = 0;
    public static final String AUTO_RANDOM = "random";
    public static final C0659a0 Companion = new C0659a0();
    public static final String DISPLAY_PALETTE = "palette";
    public static final String DISPLAY_RANDOM = "random";
    public static final String TYPE_ARTWORK = "artwork";
    public static final String TYPE_AUTO = "auto";
    public static final String TYPE_CUSTOM_PALETTE = "customPalette";
    private final String autoBehavior;
    private final String displayOrder;
    private final String paletteId;
    private final PaletteSaturationRange saturationRange;
    private final String type;

    public PaletteColorSource() {
        this((String) null, (String) null, (PaletteSaturationRange) null, (String) null, (String) null, 31, (E4.g) null);
    }

    public static /* synthetic */ PaletteColorSource copy$default(PaletteColorSource paletteColorSource, String str, String str2, PaletteSaturationRange paletteSaturationRange, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paletteColorSource.type;
        }
        if ((i & 2) != 0) {
            str2 = paletteColorSource.paletteId;
        }
        if ((i & 4) != 0) {
            paletteSaturationRange = paletteColorSource.saturationRange;
        }
        if ((i & 8) != 0) {
            str3 = paletteColorSource.autoBehavior;
        }
        if ((i & 16) != 0) {
            str4 = paletteColorSource.displayOrder;
        }
        String str5 = str4;
        PaletteSaturationRange paletteSaturationRange2 = paletteSaturationRange;
        return paletteColorSource.copy(str, str2, paletteSaturationRange2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$app_release(PaletteColorSource paletteColorSource, b5.b bVar, a5.g gVar) {
        int i = 0;
        if (bVar.p(gVar) || !E4.k.a(paletteColorSource.type, TYPE_AUTO)) {
            ((p081p0.c) bVar).g0(gVar, 0, paletteColorSource.type);
        }
        if (bVar.p(gVar) || paletteColorSource.paletteId != null) {
            bVar.n(gVar, 1, c5.p0.f7477a, paletteColorSource.paletteId);
        }
        int i3 = 3;
        if (bVar.p(gVar) || !E4.k.a(paletteColorSource.saturationRange, new PaletteSaturationRange(i, i, i3, (E4.g) null))) {
            bVar.n(gVar, 2, C0661b0.f8378a, paletteColorSource.saturationRange);
        }
        if (bVar.p(gVar) || !E4.k.a(paletteColorSource.autoBehavior, "random")) {
            bVar.n(gVar, 3, c5.p0.f7477a, paletteColorSource.autoBehavior);
        }
        if (!bVar.p(gVar) && E4.k.a(paletteColorSource.displayOrder, "random")) {
            return;
        }
        bVar.n(gVar, 4, c5.p0.f7477a, paletteColorSource.displayOrder);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.paletteId;
    }

    public final PaletteSaturationRange component3() {
        return this.saturationRange;
    }

    public final String component4() {
        return this.autoBehavior;
    }

    public final String component5() {
        return this.displayOrder;
    }

    public final PaletteColorSource copy(String str, String str2, PaletteSaturationRange paletteSaturationRange, String str3, String str4) {
        E4.k.f("type", str);
        return new PaletteColorSource(str, str2, paletteSaturationRange, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaletteColorSource)) {
            return false;
        }
        PaletteColorSource paletteColorSource = (PaletteColorSource) obj;
        return E4.k.a(this.type, paletteColorSource.type) && E4.k.a(this.paletteId, paletteColorSource.paletteId) && E4.k.a(this.saturationRange, paletteColorSource.saturationRange) && E4.k.a(this.autoBehavior, paletteColorSource.autoBehavior) && E4.k.a(this.displayOrder, paletteColorSource.displayOrder);
    }

    public final String getAutoBehavior() {
        return this.autoBehavior;
    }

    public final String getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getPaletteId() {
        return this.paletteId;
    }

    public final PaletteSaturationRange getSaturationRange() {
        return this.saturationRange;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.paletteId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaletteSaturationRange paletteSaturationRange = this.saturationRange;
        int iHashCode3 = (iHashCode2 + (paletteSaturationRange == null ? 0 : paletteSaturationRange.hashCode())) * 31;
        String str2 = this.autoBehavior;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayOrder;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.paletteId;
        PaletteSaturationRange paletteSaturationRange = this.saturationRange;
        String str3 = this.autoBehavior;
        String str4 = this.displayOrder;
        StringBuilder sbO = AbstractC0013g0.o("PaletteColorSource(type=", str, ", paletteId=", str2, ", saturationRange=");
        sbO.append(paletteSaturationRange);
        sbO.append(", autoBehavior=");
        sbO.append(str3);
        sbO.append(", displayOrder=");
        return p012c.k.u(sbO, str4, ")");
    }

    public /* synthetic */ PaletteColorSource(int i, String str, String str2, PaletteSaturationRange paletteSaturationRange, String str3, String str4, c5.k0 k0Var) {
        this.type = (i & 1) == 0 ? TYPE_AUTO : str;
        E4.g gVar = null;
        if ((i & 2) == 0) {
            this.paletteId = null;
        } else {
            this.paletteId = str2;
        }
        if ((i & 4) == 0) {
            int i3 = 0;
            this.saturationRange = new PaletteSaturationRange(i3, i3, 3, gVar);
        } else {
            this.saturationRange = paletteSaturationRange;
        }
        if ((i & 8) == 0) {
            this.autoBehavior = "random";
        } else {
            this.autoBehavior = str3;
        }
        if ((i & 16) == 0) {
            this.displayOrder = "random";
        } else {
            this.displayOrder = str4;
        }
    }

    public PaletteColorSource(String str, String str2, PaletteSaturationRange paletteSaturationRange, String str3, String str4) {
        E4.k.f("type", str);
        this.type = str;
        this.paletteId = str2;
        this.saturationRange = paletteSaturationRange;
        this.autoBehavior = str3;
        this.displayOrder = str4;
    }

    public /* synthetic */ PaletteColorSource(String str, String str2, PaletteSaturationRange paletteSaturationRange, String str3, String str4, int i, E4.g gVar) {
        str = (i & 1) != 0 ? TYPE_AUTO : str;
        E4.g gVar2 = null;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i3 = 0;
            paletteSaturationRange = new PaletteSaturationRange(i3, i3, 3, gVar2);
        }
        this(str, str2, paletteSaturationRange, (i & 8) != 0 ? "random" : str3, (i & 16) != 0 ? "random" : str4);
    }
}
