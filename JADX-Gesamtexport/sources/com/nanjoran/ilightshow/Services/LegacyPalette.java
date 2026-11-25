package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.C0479c;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
final class LegacyPalette {
    private final List<LegacyPaletteColor> colors;
    private final String id;
    private final String name;
    public static final F Companion = new F();
    private static final Y4.a[] $childSerializers = {null, null, new C0479c(G.f8263a, 0)};

    public LegacyPalette() {
        this((String) null, (String) null, (List) null, 7, (E4.g) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyPalette copy$default(LegacyPalette legacyPalette, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legacyPalette.id;
        }
        if ((i & 2) != 0) {
            str2 = legacyPalette.name;
        }
        if ((i & 4) != 0) {
            list = legacyPalette.colors;
        }
        return legacyPalette.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$app_release(LegacyPalette legacyPalette, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || !E4.k.a(legacyPalette.id, UUID.randomUUID().toString())) {
            ((p081p0.c) bVar).g0(gVar, 0, legacyPalette.id);
        }
        if (bVar.p(gVar) || !E4.k.a(legacyPalette.name, "")) {
            ((p081p0.c) bVar).g0(gVar, 1, legacyPalette.name);
        }
        if (!bVar.p(gVar) && E4.k.a(legacyPalette.colors, new ArrayList())) {
            return;
        }
        ((p081p0.c) bVar).f0(gVar, 2, aVarArr[2], legacyPalette.colors);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<LegacyPaletteColor> component3() {
        return this.colors;
    }

    public final LegacyPalette copy(String str, String str2, List<LegacyPaletteColor> list) {
        E4.k.f(AuthorizationClient.PlayStoreParams.ID, str);
        E4.k.f("name", str2);
        E4.k.f("colors", list);
        return new LegacyPalette(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyPalette)) {
            return false;
        }
        LegacyPalette legacyPalette = (LegacyPalette) obj;
        return E4.k.a(this.id, legacyPalette.id) && E4.k.a(this.name, legacyPalette.name) && E4.k.a(this.colors, legacyPalette.colors);
    }

    public final List<LegacyPaletteColor> getColors() {
        return this.colors;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.colors.hashCode() + AbstractC0013g0.c(this.id.hashCode() * 31, this.name, 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        List<LegacyPaletteColor> list = this.colors;
        StringBuilder sbO = AbstractC0013g0.o("LegacyPalette(id=", str, ", name=", str2, ", colors=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ LegacyPalette(int i, String str, String str2, List list, c5.k0 k0Var) {
        this.id = (i & 1) == 0 ? UUID.randomUUID().toString() : str;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.colors = new ArrayList();
        } else {
            this.colors = list;
        }
    }

    public LegacyPalette(String str, String str2, List<LegacyPaletteColor> list) {
        E4.k.f(AuthorizationClient.PlayStoreParams.ID, str);
        E4.k.f("name", str2);
        E4.k.f("colors", list);
        this.id = str;
        this.name = str2;
        this.colors = list;
    }

    public /* synthetic */ LegacyPalette(String str, String str2, List list, int i, E4.g gVar) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
