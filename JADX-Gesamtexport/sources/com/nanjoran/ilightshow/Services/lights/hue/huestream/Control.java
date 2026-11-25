package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.g;
import E4.k;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Control {
    public static final int $stable = 8;
    private final List<List<Double>> colorgamut;
    private final Colorgamuttype colorgamuttype;
    private final CT ct;
    private final Long maxlumen;
    private final Long mindimlevel;

    public Control() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Control copy$default(Control control, Long l6, Long l7, Colorgamuttype colorgamuttype, List list, CT ct, int i, Object obj) {
        if ((i & 1) != 0) {
            l6 = control.mindimlevel;
        }
        if ((i & 2) != 0) {
            l7 = control.maxlumen;
        }
        if ((i & 4) != 0) {
            colorgamuttype = control.colorgamuttype;
        }
        if ((i & 8) != 0) {
            list = control.colorgamut;
        }
        if ((i & 16) != 0) {
            ct = control.ct;
        }
        CT ct2 = ct;
        Colorgamuttype colorgamuttype2 = colorgamuttype;
        return control.copy(l6, l7, colorgamuttype2, list, ct2);
    }

    public final Long component1() {
        return this.mindimlevel;
    }

    public final Long component2() {
        return this.maxlumen;
    }

    public final Colorgamuttype component3() {
        return this.colorgamuttype;
    }

    public final List<List<Double>> component4() {
        return this.colorgamut;
    }

    public final CT component5() {
        return this.ct;
    }

    public final Control copy(Long l6, Long l7, Colorgamuttype colorgamuttype, List<? extends List<Double>> list, CT ct) {
        return new Control(l6, l7, colorgamuttype, list, ct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Control)) {
            return false;
        }
        Control control = (Control) obj;
        return k.a(this.mindimlevel, control.mindimlevel) && k.a(this.maxlumen, control.maxlumen) && this.colorgamuttype == control.colorgamuttype && k.a(this.colorgamut, control.colorgamut) && k.a(this.ct, control.ct);
    }

    public final List<List<Double>> getColorgamut() {
        return this.colorgamut;
    }

    public final Colorgamuttype getColorgamuttype() {
        return this.colorgamuttype;
    }

    public final CT getCt() {
        return this.ct;
    }

    public final Long getMaxlumen() {
        return this.maxlumen;
    }

    public final Long getMindimlevel() {
        return this.mindimlevel;
    }

    public int hashCode() {
        Long l6 = this.mindimlevel;
        int iHashCode = (l6 == null ? 0 : l6.hashCode()) * 31;
        Long l7 = this.maxlumen;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Colorgamuttype colorgamuttype = this.colorgamuttype;
        int iHashCode3 = (iHashCode2 + (colorgamuttype == null ? 0 : colorgamuttype.hashCode())) * 31;
        List<List<Double>> list = this.colorgamut;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CT ct = this.ct;
        return iHashCode4 + (ct != null ? ct.hashCode() : 0);
    }

    public String toString() {
        return "Control(mindimlevel=" + this.mindimlevel + ", maxlumen=" + this.maxlumen + ", colorgamuttype=" + this.colorgamuttype + ", colorgamut=" + this.colorgamut + ", ct=" + this.ct + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Control(Long l6, Long l7, Colorgamuttype colorgamuttype, List<? extends List<Double>> list, CT ct) {
        this.mindimlevel = l6;
        this.maxlumen = l7;
        this.colorgamuttype = colorgamuttype;
        this.colorgamut = list;
        this.ct = ct;
    }

    public /* synthetic */ Control(Long l6, Long l7, Colorgamuttype colorgamuttype, List list, CT ct, int i, g gVar) {
        this((i & 1) != 0 ? null : l6, (i & 2) != 0 ? null : l7, (i & 4) != 0 ? null : colorgamuttype, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : ct);
    }
}
