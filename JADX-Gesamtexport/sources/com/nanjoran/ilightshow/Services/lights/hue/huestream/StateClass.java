package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.g;
import E4.k;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StateClass {
    public static final int $stable = 8;
    private final Long bri;
    private final Long ct;
    private final String effect;
    private final Long hue;
    private final Boolean on;
    private final Boolean reachable;
    private final Long sat;
    private final List<Double> xy;

    public StateClass() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StateClass copy$default(StateClass stateClass, Boolean bool, Long l6, Long l7, Long l8, String str, List list, Long l9, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = stateClass.on;
        }
        if ((i & 2) != 0) {
            l6 = stateClass.bri;
        }
        if ((i & 4) != 0) {
            l7 = stateClass.hue;
        }
        if ((i & 8) != 0) {
            l8 = stateClass.sat;
        }
        if ((i & 16) != 0) {
            str = stateClass.effect;
        }
        if ((i & 32) != 0) {
            list = stateClass.xy;
        }
        if ((i & 64) != 0) {
            l9 = stateClass.ct;
        }
        if ((i & 128) != 0) {
            bool2 = stateClass.reachable;
        }
        Long l10 = l9;
        Boolean bool3 = bool2;
        String str2 = str;
        List list2 = list;
        return stateClass.copy(bool, l6, l7, l8, str2, list2, l10, bool3);
    }

    public final Boolean component1() {
        return this.on;
    }

    public final Long component2() {
        return this.bri;
    }

    public final Long component3() {
        return this.hue;
    }

    public final Long component4() {
        return this.sat;
    }

    public final String component5() {
        return this.effect;
    }

    public final List<Double> component6() {
        return this.xy;
    }

    public final Long component7() {
        return this.ct;
    }

    public final Boolean component8() {
        return this.reachable;
    }

    public final StateClass copy(Boolean bool, Long l6, Long l7, Long l8, String str, List<Double> list, Long l9, Boolean bool2) {
        return new StateClass(bool, l6, l7, l8, str, list, l9, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateClass)) {
            return false;
        }
        StateClass stateClass = (StateClass) obj;
        return k.a(this.on, stateClass.on) && k.a(this.bri, stateClass.bri) && k.a(this.hue, stateClass.hue) && k.a(this.sat, stateClass.sat) && k.a(this.effect, stateClass.effect) && k.a(this.xy, stateClass.xy) && k.a(this.ct, stateClass.ct) && k.a(this.reachable, stateClass.reachable);
    }

    public final Long getBri() {
        return this.bri;
    }

    public final Long getCt() {
        return this.ct;
    }

    public final String getEffect() {
        return this.effect;
    }

    public final Long getHue() {
        return this.hue;
    }

    public final Boolean getOn() {
        return this.on;
    }

    public final Boolean getReachable() {
        return this.reachable;
    }

    public final Long getSat() {
        return this.sat;
    }

    public final List<Double> getXy() {
        return this.xy;
    }

    public int hashCode() {
        Boolean bool = this.on;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l6 = this.bri;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.hue;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.sat;
        int iHashCode4 = (iHashCode3 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.effect;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<Double> list = this.xy;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l9 = this.ct;
        int iHashCode7 = (iHashCode6 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Boolean bool2 = this.reachable;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "StateClass(on=" + this.on + ", bri=" + this.bri + ", hue=" + this.hue + ", sat=" + this.sat + ", effect=" + this.effect + ", xy=" + this.xy + ", ct=" + this.ct + ", reachable=" + this.reachable + ")";
    }

    public StateClass(Boolean bool, Long l6, Long l7, Long l8, String str, List<Double> list, Long l9, Boolean bool2) {
        this.on = bool;
        this.bri = l6;
        this.hue = l7;
        this.sat = l8;
        this.effect = str;
        this.xy = list;
        this.ct = l9;
        this.reachable = bool2;
    }

    public /* synthetic */ StateClass(Boolean bool, Long l6, Long l7, Long l8, String str, List list, Long l9, Boolean bool2, int i, g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l6, (i & 4) != 0 ? null : l7, (i & 8) != 0 ? null : l8, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : l9, (i & 128) != 0 ? null : bool2);
    }
}
