package com.nanjoran.ilightshow.Services;

import c5.C0485f;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class AppConfig {
    public static final int $stable = 8;
    public static final C0660b Companion = new C0660b();
    private final EntitlementsConfig entitlements;
    private final Boolean freeBeta;

    public AppConfig() {
        this((Boolean) null, (EntitlementsConfig) (0 == true ? 1 : 0), 3, (E4.g) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, Boolean bool, EntitlementsConfig entitlementsConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = appConfig.freeBeta;
        }
        if ((i & 2) != 0) {
            entitlementsConfig = appConfig.entitlements;
        }
        return appConfig.copy(bool, entitlementsConfig);
    }

    public static final /* synthetic */ void write$Self$app_release(AppConfig appConfig, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || appConfig.freeBeta != null) {
            bVar.n(gVar, 0, C0485f.f7447a, appConfig.freeBeta);
        }
        if (!bVar.p(gVar) && appConfig.entitlements == null) {
            return;
        }
        bVar.n(gVar, 1, B.f8232a, appConfig.entitlements);
    }

    public final Boolean component1() {
        return this.freeBeta;
    }

    public final EntitlementsConfig component2() {
        return this.entitlements;
    }

    public final AppConfig copy(Boolean bool, EntitlementsConfig entitlementsConfig) {
        return new AppConfig(bool, entitlementsConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return E4.k.a(this.freeBeta, appConfig.freeBeta) && E4.k.a(this.entitlements, appConfig.entitlements);
    }

    public final EntitlementsConfig getEntitlements() {
        return this.entitlements;
    }

    public final Boolean getFreeBeta() {
        return this.freeBeta;
    }

    public int hashCode() {
        Boolean bool = this.freeBeta;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        EntitlementsConfig entitlementsConfig = this.entitlements;
        return iHashCode + (entitlementsConfig != null ? entitlementsConfig.hashCode() : 0);
    }

    public String toString() {
        return "AppConfig(freeBeta=" + this.freeBeta + ", entitlements=" + this.entitlements + ")";
    }

    public /* synthetic */ AppConfig(int i, Boolean bool, EntitlementsConfig entitlementsConfig, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.freeBeta = null;
        } else {
            this.freeBeta = bool;
        }
        if ((i & 2) == 0) {
            this.entitlements = null;
        } else {
            this.entitlements = entitlementsConfig;
        }
    }

    public AppConfig(Boolean bool, EntitlementsConfig entitlementsConfig) {
        this.freeBeta = bool;
        this.entitlements = entitlementsConfig;
    }

    public /* synthetic */ AppConfig(Boolean bool, EntitlementsConfig entitlementsConfig, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : entitlementsConfig);
    }
}
