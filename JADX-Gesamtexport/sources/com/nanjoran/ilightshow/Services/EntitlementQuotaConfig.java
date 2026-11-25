package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class EntitlementQuotaConfig {
    public static final int $stable = 0;
    public static final A Companion = new A();
    private final Integer advancedSecondsPerPeriod;
    private final Integer periodSeconds;
    private final Integer standardSecondsPerPeriod;
    private final Integer usageSyncDeltaSeconds;

    public EntitlementQuotaConfig() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (E4.g) null);
    }

    public static /* synthetic */ EntitlementQuotaConfig copy$default(EntitlementQuotaConfig entitlementQuotaConfig, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = entitlementQuotaConfig.advancedSecondsPerPeriod;
        }
        if ((i & 2) != 0) {
            num2 = entitlementQuotaConfig.standardSecondsPerPeriod;
        }
        if ((i & 4) != 0) {
            num3 = entitlementQuotaConfig.periodSeconds;
        }
        if ((i & 8) != 0) {
            num4 = entitlementQuotaConfig.usageSyncDeltaSeconds;
        }
        return entitlementQuotaConfig.copy(num, num2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$app_release(EntitlementQuotaConfig entitlementQuotaConfig, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || entitlementQuotaConfig.advancedSecondsPerPeriod != null) {
            bVar.n(gVar, 0, c5.J.f7400a, entitlementQuotaConfig.advancedSecondsPerPeriod);
        }
        if (bVar.p(gVar) || entitlementQuotaConfig.standardSecondsPerPeriod != null) {
            bVar.n(gVar, 1, c5.J.f7400a, entitlementQuotaConfig.standardSecondsPerPeriod);
        }
        if (bVar.p(gVar) || entitlementQuotaConfig.periodSeconds != null) {
            bVar.n(gVar, 2, c5.J.f7400a, entitlementQuotaConfig.periodSeconds);
        }
        if (!bVar.p(gVar) && entitlementQuotaConfig.usageSyncDeltaSeconds == null) {
            return;
        }
        bVar.n(gVar, 3, c5.J.f7400a, entitlementQuotaConfig.usageSyncDeltaSeconds);
    }

    public final Integer component1() {
        return this.advancedSecondsPerPeriod;
    }

    public final Integer component2() {
        return this.standardSecondsPerPeriod;
    }

    public final Integer component3() {
        return this.periodSeconds;
    }

    public final Integer component4() {
        return this.usageSyncDeltaSeconds;
    }

    public final EntitlementQuotaConfig copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new EntitlementQuotaConfig(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntitlementQuotaConfig)) {
            return false;
        }
        EntitlementQuotaConfig entitlementQuotaConfig = (EntitlementQuotaConfig) obj;
        return E4.k.a(this.advancedSecondsPerPeriod, entitlementQuotaConfig.advancedSecondsPerPeriod) && E4.k.a(this.standardSecondsPerPeriod, entitlementQuotaConfig.standardSecondsPerPeriod) && E4.k.a(this.periodSeconds, entitlementQuotaConfig.periodSeconds) && E4.k.a(this.usageSyncDeltaSeconds, entitlementQuotaConfig.usageSyncDeltaSeconds);
    }

    public final Integer getAdvancedSecondsPerPeriod() {
        return this.advancedSecondsPerPeriod;
    }

    public final Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public final Integer getStandardSecondsPerPeriod() {
        return this.standardSecondsPerPeriod;
    }

    public final Integer getUsageSyncDeltaSeconds() {
        return this.usageSyncDeltaSeconds;
    }

    public int hashCode() {
        Integer num = this.advancedSecondsPerPeriod;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.standardSecondsPerPeriod;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.periodSeconds;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.usageSyncDeltaSeconds;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "EntitlementQuotaConfig(advancedSecondsPerPeriod=" + this.advancedSecondsPerPeriod + ", standardSecondsPerPeriod=" + this.standardSecondsPerPeriod + ", periodSeconds=" + this.periodSeconds + ", usageSyncDeltaSeconds=" + this.usageSyncDeltaSeconds + ")";
    }

    public /* synthetic */ EntitlementQuotaConfig(int i, Integer num, Integer num2, Integer num3, Integer num4, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.advancedSecondsPerPeriod = null;
        } else {
            this.advancedSecondsPerPeriod = num;
        }
        if ((i & 2) == 0) {
            this.standardSecondsPerPeriod = null;
        } else {
            this.standardSecondsPerPeriod = num2;
        }
        if ((i & 4) == 0) {
            this.periodSeconds = null;
        } else {
            this.periodSeconds = num3;
        }
        if ((i & 8) == 0) {
            this.usageSyncDeltaSeconds = null;
        } else {
            this.usageSyncDeltaSeconds = num4;
        }
    }

    public EntitlementQuotaConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.advancedSecondsPerPeriod = num;
        this.standardSecondsPerPeriod = num2;
        this.periodSeconds = num3;
        this.usageSyncDeltaSeconds = num4;
    }

    public /* synthetic */ EntitlementQuotaConfig(Integer num, Integer num2, Integer num3, Integer num4, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
