package com.nanjoran.ilightshow.Views;

import B.AbstractC0013g0;
import E4.k;
import N3.C0287r0;
import N3.C0289s0;
import Y4.d;
import c5.AbstractC0476a0;
import c5.k0;

/* JADX INFO: loaded from: classes.dex */
@d
public final class LightDetailsRoute {
    public static final int $stable = 0;
    public static final C0289s0 Companion = new C0289s0();
    private final String lightId;

    public /* synthetic */ LightDetailsRoute(int i, String str, k0 k0Var) {
        if (1 == (i & 1)) {
            this.lightId = str;
        } else {
            AbstractC0476a0.j(i, 1, C0287r0.f4259a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ LightDetailsRoute copy$default(LightDetailsRoute lightDetailsRoute, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lightDetailsRoute.lightId;
        }
        return lightDetailsRoute.copy(str);
    }

    public final String component1() {
        return this.lightId;
    }

    public final LightDetailsRoute copy(String str) {
        k.f("lightId", str);
        return new LightDetailsRoute(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LightDetailsRoute) && k.a(this.lightId, ((LightDetailsRoute) obj).lightId);
    }

    public final String getLightId() {
        return this.lightId;
    }

    public int hashCode() {
        return this.lightId.hashCode();
    }

    public String toString() {
        return AbstractC0013g0.i("LightDetailsRoute(lightId=", this.lightId, ")");
    }

    public LightDetailsRoute(String str) {
        k.f("lightId", str);
        this.lightId = str;
    }
}
