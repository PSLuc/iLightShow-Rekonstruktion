package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class CT {
    public static final int $stable = 0;
    private final Long max;
    private final Long min;

    public CT() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CT copy$default(CT ct, Long l6, Long l7, int i, Object obj) {
        if ((i & 1) != 0) {
            l6 = ct.min;
        }
        if ((i & 2) != 0) {
            l7 = ct.max;
        }
        return ct.copy(l6, l7);
    }

    public final Long component1() {
        return this.min;
    }

    public final Long component2() {
        return this.max;
    }

    public final CT copy(Long l6, Long l7) {
        return new CT(l6, l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CT)) {
            return false;
        }
        CT ct = (CT) obj;
        return k.a(this.min, ct.min) && k.a(this.max, ct.max);
    }

    public final Long getMax() {
        return this.max;
    }

    public final Long getMin() {
        return this.min;
    }

    public int hashCode() {
        Long l6 = this.min;
        int iHashCode = (l6 == null ? 0 : l6.hashCode()) * 31;
        Long l7 = this.max;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "CT(min=" + this.min + ", max=" + this.max + ")";
    }

    public CT(Long l6, Long l7) {
        this.min = l6;
        this.max = l7;
    }

    public /* synthetic */ CT(Long l6, Long l7, int i, g gVar) {
        this((i & 1) != 0 ? null : l6, (i & 2) != 0 ? null : l7);
    }
}
