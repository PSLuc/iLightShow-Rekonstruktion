package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class EntitlementsConfig {
    public static final int $stable = 8;
    public static final C Companion = new C();
    private final BetaEntitlementConfig beta;
    private final Integer modelVersion;
    private final EntitlementQuotaConfig quota;

    public EntitlementsConfig() {
        this((Integer) null, (EntitlementQuotaConfig) null, (BetaEntitlementConfig) null, 7, (E4.g) null);
    }

    public static /* synthetic */ EntitlementsConfig copy$default(EntitlementsConfig entitlementsConfig, Integer num, EntitlementQuotaConfig entitlementQuotaConfig, BetaEntitlementConfig betaEntitlementConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            num = entitlementsConfig.modelVersion;
        }
        if ((i & 2) != 0) {
            entitlementQuotaConfig = entitlementsConfig.quota;
        }
        if ((i & 4) != 0) {
            betaEntitlementConfig = entitlementsConfig.beta;
        }
        return entitlementsConfig.copy(num, entitlementQuotaConfig, betaEntitlementConfig);
    }

    public static final /* synthetic */ void write$Self$app_release(EntitlementsConfig entitlementsConfig, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || entitlementsConfig.modelVersion != null) {
            bVar.n(gVar, 0, c5.J.f7400a, entitlementsConfig.modelVersion);
        }
        if (bVar.p(gVar) || entitlementsConfig.quota != null) {
            bVar.n(gVar, 1, C0699z.f8504a, entitlementsConfig.quota);
        }
        if (!bVar.p(gVar) && entitlementsConfig.beta == null) {
            return;
        }
        bVar.n(gVar, 2, C0694u.f8489a, entitlementsConfig.beta);
    }

    public final Integer component1() {
        return this.modelVersion;
    }

    public final EntitlementQuotaConfig component2() {
        return this.quota;
    }

    public final BetaEntitlementConfig component3() {
        return this.beta;
    }

    public final EntitlementsConfig copy(Integer num, EntitlementQuotaConfig entitlementQuotaConfig, BetaEntitlementConfig betaEntitlementConfig) {
        return new EntitlementsConfig(num, entitlementQuotaConfig, betaEntitlementConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntitlementsConfig)) {
            return false;
        }
        EntitlementsConfig entitlementsConfig = (EntitlementsConfig) obj;
        return E4.k.a(this.modelVersion, entitlementsConfig.modelVersion) && E4.k.a(this.quota, entitlementsConfig.quota) && E4.k.a(this.beta, entitlementsConfig.beta);
    }

    public final BetaEntitlementConfig getBeta() {
        return this.beta;
    }

    public final Integer getModelVersion() {
        return this.modelVersion;
    }

    public final EntitlementQuotaConfig getQuota() {
        return this.quota;
    }

    public int hashCode() {
        Integer num = this.modelVersion;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        EntitlementQuotaConfig entitlementQuotaConfig = this.quota;
        int iHashCode2 = (iHashCode + (entitlementQuotaConfig == null ? 0 : entitlementQuotaConfig.hashCode())) * 31;
        BetaEntitlementConfig betaEntitlementConfig = this.beta;
        return iHashCode2 + (betaEntitlementConfig != null ? betaEntitlementConfig.hashCode() : 0);
    }

    public String toString() {
        return "EntitlementsConfig(modelVersion=" + this.modelVersion + ", quota=" + this.quota + ", beta=" + this.beta + ")";
    }

    public /* synthetic */ EntitlementsConfig(int i, Integer num, EntitlementQuotaConfig entitlementQuotaConfig, BetaEntitlementConfig betaEntitlementConfig, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.modelVersion = null;
        } else {
            this.modelVersion = num;
        }
        if ((i & 2) == 0) {
            this.quota = null;
        } else {
            this.quota = entitlementQuotaConfig;
        }
        if ((i & 4) == 0) {
            this.beta = null;
        } else {
            this.beta = betaEntitlementConfig;
        }
    }

    public EntitlementsConfig(Integer num, EntitlementQuotaConfig entitlementQuotaConfig, BetaEntitlementConfig betaEntitlementConfig) {
        this.modelVersion = num;
        this.quota = entitlementQuotaConfig;
        this.beta = betaEntitlementConfig;
    }

    public /* synthetic */ EntitlementsConfig(Integer num, EntitlementQuotaConfig entitlementQuotaConfig, BetaEntitlementConfig betaEntitlementConfig, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : entitlementQuotaConfig, (i & 4) != 0 ? null : betaEntitlementConfig);
    }
}
