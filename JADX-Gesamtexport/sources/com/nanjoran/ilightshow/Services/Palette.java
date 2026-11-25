package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.AbstractC0476a0;
import c5.C0479c;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorPalette;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class Palette {
    public static final int $stable = 8;
    private final List<PaletteColor> colors;
    private final int displayOrder;
    private final String id;
    private final String name;
    public static final W Companion = new W();
    private static final Y4.a[] $childSerializers = {null, null, null, new C0479c(X.f8375a, 0)};

    public /* synthetic */ Palette(int i, String str, String str2, int i3, List list, c5.k0 k0Var) {
        if (8 != (i & 8)) {
            AbstractC0476a0.j(i, 8, V.f8374a.getDescriptor());
            throw null;
        }
        this.id = (i & 1) == 0 ? UUID.randomUUID().toString() : str;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.displayOrder = 0;
        } else {
            this.displayOrder = i3;
        }
        this.colors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Palette copy$default(Palette palette, String str, String str2, int i, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = palette.id;
        }
        if ((i3 & 2) != 0) {
            str2 = palette.name;
        }
        if ((i3 & 4) != 0) {
            i = palette.displayOrder;
        }
        if ((i3 & 8) != 0) {
            list = palette.colors;
        }
        return palette.copy(str, str2, i, list);
    }

    public static final /* synthetic */ void write$Self$app_release(Palette palette, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || !E4.k.a(palette.id, UUID.randomUUID().toString())) {
            ((p081p0.c) bVar).g0(gVar, 0, palette.id);
        }
        if (bVar.p(gVar) || !E4.k.a(palette.name, "")) {
            ((p081p0.c) bVar).g0(gVar, 1, palette.name);
        }
        if (bVar.p(gVar) || palette.displayOrder != 0) {
            ((p081p0.c) bVar).d0(2, palette.displayOrder, gVar);
        }
        ((p081p0.c) bVar).f0(gVar, 3, aVarArr[3], palette.colors);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.displayOrder;
    }

    public final List<PaletteColor> component4() {
        return this.colors;
    }

    public final Palette copy(String str, String str2, int i, List<PaletteColor> list) {
        E4.k.f(AuthorizationClient.PlayStoreParams.ID, str);
        E4.k.f("name", str2);
        E4.k.f("colors", list);
        return new Palette(str, str2, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Palette)) {
            return false;
        }
        Palette palette = (Palette) obj;
        return E4.k.a(this.id, palette.id) && E4.k.a(this.name, palette.name) && this.displayOrder == palette.displayOrder && E4.k.a(this.colors, palette.colors);
    }

    public final List<PaletteColor> getColors() {
        return this.colors;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.colors.hashCode() + AbstractC0916i.c(this.displayOrder, AbstractC0013g0.c(this.id.hashCode() * 31, this.name, 31), 31);
    }

    public final ColorPalette toOldColorPalette() {
        ColorPalette colorPalette = new ColorPalette();
        List<PaletteColor> list = this.colors;
        ArrayList arrayList = new ArrayList(p089q4.n.P(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaletteColor) it.next()).toColorDef());
        }
        colorPalette.setColors(new ArrayList<>(arrayList));
        return colorPalette;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        int i = this.displayOrder;
        List<PaletteColor> list = this.colors;
        StringBuilder sbO = AbstractC0013g0.o("Palette(id=", str, ", name=", str2, ", displayOrder=");
        sbO.append(i);
        sbO.append(", colors=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    public Palette(String str, String str2, int i, List<PaletteColor> list) {
        E4.k.f(AuthorizationClient.PlayStoreParams.ID, str);
        E4.k.f("name", str2);
        E4.k.f("colors", list);
        this.id = str;
        this.name = str2;
        this.displayOrder = i;
        this.colors = list;
    }

    public /* synthetic */ Palette(String str, String str2, int i, List list, int i3, E4.g gVar) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, list);
    }
}
