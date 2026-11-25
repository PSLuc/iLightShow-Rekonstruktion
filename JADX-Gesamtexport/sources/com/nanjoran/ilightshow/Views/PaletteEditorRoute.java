package com.nanjoran.ilightshow.Views;

import B.AbstractC0013g0;
import E4.k;
import N3.V0;
import N3.W0;
import Y4.d;
import c5.AbstractC0476a0;
import c5.k0;

/* JADX INFO: loaded from: classes.dex */
@d
public final class PaletteEditorRoute {
    public static final int $stable = 0;
    public static final W0 Companion = new W0();
    private final String paletteId;

    public /* synthetic */ PaletteEditorRoute(int i, String str, k0 k0Var) {
        if (1 == (i & 1)) {
            this.paletteId = str;
        } else {
            AbstractC0476a0.j(i, 1, V0.f4132a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ PaletteEditorRoute copy$default(PaletteEditorRoute paletteEditorRoute, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paletteEditorRoute.paletteId;
        }
        return paletteEditorRoute.copy(str);
    }

    public final String component1() {
        return this.paletteId;
    }

    public final PaletteEditorRoute copy(String str) {
        return new PaletteEditorRoute(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaletteEditorRoute) && k.a(this.paletteId, ((PaletteEditorRoute) obj).paletteId);
    }

    public final String getPaletteId() {
        return this.paletteId;
    }

    public int hashCode() {
        String str = this.paletteId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC0013g0.i("PaletteEditorRoute(paletteId=", this.paletteId, ")");
    }

    public PaletteEditorRoute(String str) {
        this.paletteId = str;
    }
}
