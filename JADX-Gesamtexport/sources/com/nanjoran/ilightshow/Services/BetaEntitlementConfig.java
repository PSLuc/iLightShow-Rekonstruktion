package com.nanjoran.ilightshow.Services;

import c5.C0479c;
import c5.C0485f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class BetaEntitlementConfig {
    private static final Y4.a[] $childSerializers;
    public static final int $stable = 8;
    public static final C0695v Companion = new C0695v();
    private final List<String> buildChannels;
    private final String diagnosticLabel;
    private final Boolean enabled;
    private final String grant;
    private final List<String> platforms;
    private final String reason;

    static {
        c5.p0 p0Var = c5.p0.f7477a;
        $childSerializers = new Y4.a[]{null, null, new C0479c(p0Var, 0), new C0479c(p0Var, 0), null, null};
    }

    public BetaEntitlementConfig() {
        this((Boolean) null, (String) null, (List) null, (List) null, (String) null, (String) null, 63, (E4.g) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetaEntitlementConfig copy$default(BetaEntitlementConfig betaEntitlementConfig, Boolean bool, String str, List list, List list2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = betaEntitlementConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = betaEntitlementConfig.grant;
        }
        if ((i & 4) != 0) {
            list = betaEntitlementConfig.platforms;
        }
        if ((i & 8) != 0) {
            list2 = betaEntitlementConfig.buildChannels;
        }
        if ((i & 16) != 0) {
            str2 = betaEntitlementConfig.diagnosticLabel;
        }
        if ((i & 32) != 0) {
            str3 = betaEntitlementConfig.reason;
        }
        String str4 = str2;
        String str5 = str3;
        return betaEntitlementConfig.copy(bool, str, list, list2, str4, str5);
    }

    public static final /* synthetic */ void write$Self$app_release(BetaEntitlementConfig betaEntitlementConfig, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || betaEntitlementConfig.enabled != null) {
            bVar.n(gVar, 0, C0485f.f7447a, betaEntitlementConfig.enabled);
        }
        if (bVar.p(gVar) || betaEntitlementConfig.grant != null) {
            bVar.n(gVar, 1, c5.p0.f7477a, betaEntitlementConfig.grant);
        }
        if (bVar.p(gVar) || betaEntitlementConfig.platforms != null) {
            bVar.n(gVar, 2, aVarArr[2], betaEntitlementConfig.platforms);
        }
        if (bVar.p(gVar) || betaEntitlementConfig.buildChannels != null) {
            bVar.n(gVar, 3, aVarArr[3], betaEntitlementConfig.buildChannels);
        }
        if (bVar.p(gVar) || betaEntitlementConfig.diagnosticLabel != null) {
            bVar.n(gVar, 4, c5.p0.f7477a, betaEntitlementConfig.diagnosticLabel);
        }
        if (!bVar.p(gVar) && betaEntitlementConfig.reason == null) {
            return;
        }
        bVar.n(gVar, 5, c5.p0.f7477a, betaEntitlementConfig.reason);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.grant;
    }

    public final List<String> component3() {
        return this.platforms;
    }

    public final List<String> component4() {
        return this.buildChannels;
    }

    public final String component5() {
        return this.diagnosticLabel;
    }

    public final String component6() {
        return this.reason;
    }

    public final BetaEntitlementConfig copy(Boolean bool, String str, List<String> list, List<String> list2, String str2, String str3) {
        return new BetaEntitlementConfig(bool, str, list, list2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BetaEntitlementConfig)) {
            return false;
        }
        BetaEntitlementConfig betaEntitlementConfig = (BetaEntitlementConfig) obj;
        return E4.k.a(this.enabled, betaEntitlementConfig.enabled) && E4.k.a(this.grant, betaEntitlementConfig.grant) && E4.k.a(this.platforms, betaEntitlementConfig.platforms) && E4.k.a(this.buildChannels, betaEntitlementConfig.buildChannels) && E4.k.a(this.diagnosticLabel, betaEntitlementConfig.diagnosticLabel) && E4.k.a(this.reason, betaEntitlementConfig.reason);
    }

    public final List<String> getBuildChannels() {
        return this.buildChannels;
    }

    public final String getDiagnosticLabel() {
        return this.diagnosticLabel;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getGrant() {
        return this.grant;
    }

    public final List<String> getPlatforms() {
        return this.platforms;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean grantsFxPlus(String str) {
        E4.k.f("platform", str);
        if (!E4.k.a(this.enabled, Boolean.TRUE) || !E4.k.a(this.grant, "fxPlus")) {
            return false;
        }
        List<String> list = this.platforms;
        return list == null || list.isEmpty() || list.contains(str);
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.grant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.platforms;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.buildChannels;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.diagnosticLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BetaEntitlementConfig(enabled=" + this.enabled + ", grant=" + this.grant + ", platforms=" + this.platforms + ", buildChannels=" + this.buildChannels + ", diagnosticLabel=" + this.diagnosticLabel + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ BetaEntitlementConfig(int i, Boolean bool, String str, List list, List list2, String str2, String str3, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
        if ((i & 2) == 0) {
            this.grant = null;
        } else {
            this.grant = str;
        }
        if ((i & 4) == 0) {
            this.platforms = null;
        } else {
            this.platforms = list;
        }
        if ((i & 8) == 0) {
            this.buildChannels = null;
        } else {
            this.buildChannels = list2;
        }
        if ((i & 16) == 0) {
            this.diagnosticLabel = null;
        } else {
            this.diagnosticLabel = str2;
        }
        if ((i & 32) == 0) {
            this.reason = null;
        } else {
            this.reason = str3;
        }
    }

    public BetaEntitlementConfig(Boolean bool, String str, List<String> list, List<String> list2, String str2, String str3) {
        this.enabled = bool;
        this.grant = str;
        this.platforms = list;
        this.buildChannels = list2;
        this.diagnosticLabel = str2;
        this.reason = str3;
    }

    public /* synthetic */ BetaEntitlementConfig(Boolean bool, String str, List list, List list2, String str2, String str3, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
