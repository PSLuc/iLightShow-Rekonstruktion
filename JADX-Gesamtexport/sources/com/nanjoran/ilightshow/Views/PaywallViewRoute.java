package com.nanjoran.ilightshow.Views;

import E4.g;
import N3.f1;
import Y4.d;
import b5.b;
import c5.k0;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
@d
public final class PaywallViewRoute {
    public static final int $stable = 0;
    public static final f1 Companion = new f1();
    private final boolean showQuotasReached;
    private final boolean welcomeMode;

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallViewRoute() {
        boolean z5 = false;
        this(z5, z5, 3, (g) null);
    }

    public static /* synthetic */ PaywallViewRoute copy$default(PaywallViewRoute paywallViewRoute, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = paywallViewRoute.welcomeMode;
        }
        if ((i & 2) != 0) {
            z6 = paywallViewRoute.showQuotasReached;
        }
        return paywallViewRoute.copy(z5, z6);
    }

    public static final /* synthetic */ void write$Self$app_release(PaywallViewRoute paywallViewRoute, b bVar, a5.g gVar) {
        if (bVar.p(gVar) || paywallViewRoute.welcomeMode) {
            ((c) bVar).Y(gVar, 0, paywallViewRoute.welcomeMode);
        }
        if (bVar.p(gVar) || paywallViewRoute.showQuotasReached) {
            ((c) bVar).Y(gVar, 1, paywallViewRoute.showQuotasReached);
        }
    }

    public final boolean component1() {
        return this.welcomeMode;
    }

    public final boolean component2() {
        return this.showQuotasReached;
    }

    public final PaywallViewRoute copy(boolean z5, boolean z6) {
        return new PaywallViewRoute(z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallViewRoute)) {
            return false;
        }
        PaywallViewRoute paywallViewRoute = (PaywallViewRoute) obj;
        return this.welcomeMode == paywallViewRoute.welcomeMode && this.showQuotasReached == paywallViewRoute.showQuotasReached;
    }

    public final boolean getShowQuotasReached() {
        return this.showQuotasReached;
    }

    public final boolean getWelcomeMode() {
        return this.welcomeMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showQuotasReached) + (Boolean.hashCode(this.welcomeMode) * 31);
    }

    public String toString() {
        return "PaywallViewRoute(welcomeMode=" + this.welcomeMode + ", showQuotasReached=" + this.showQuotasReached + ")";
    }

    public /* synthetic */ PaywallViewRoute(int i, boolean z5, boolean z6, k0 k0Var) {
        if ((i & 1) == 0) {
            this.welcomeMode = false;
        } else {
            this.welcomeMode = z5;
        }
        if ((i & 2) == 0) {
            this.showQuotasReached = false;
        } else {
            this.showQuotasReached = z6;
        }
    }

    public PaywallViewRoute(boolean z5, boolean z6) {
        this.welcomeMode = z5;
        this.showQuotasReached = z6;
    }

    public /* synthetic */ PaywallViewRoute(boolean z5, boolean z6, int i, g gVar) {
        this((i & 1) != 0 ? false : z5, (i & 2) != 0 ? false : z6);
    }
}
