package com.nanjoran.ilightshow.Services;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class AppConfigWrapper {
    public static final int $stable = 8;
    public static final C0664d Companion = new C0664d();
    private final AppConfig config;
    private final News news;

    public AppConfigWrapper() {
        this((News) null, (AppConfig) (0 == true ? 1 : 0), 3, (E4.g) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AppConfigWrapper copy$default(AppConfigWrapper appConfigWrapper, News news, AppConfig appConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            news = appConfigWrapper.news;
        }
        if ((i & 2) != 0) {
            appConfig = appConfigWrapper.config;
        }
        return appConfigWrapper.copy(news, appConfig);
    }

    public static final /* synthetic */ void write$Self$app_release(AppConfigWrapper appConfigWrapper, b5.b bVar, a5.g gVar) {
        if (bVar.p(gVar) || appConfigWrapper.news != null) {
            bVar.n(gVar, 0, P.f8356a, appConfigWrapper.news);
        }
        if (!bVar.p(gVar) && appConfigWrapper.config == null) {
            return;
        }
        bVar.n(gVar, 1, C0658a.f8377a, appConfigWrapper.config);
    }

    public final News component1() {
        return this.news;
    }

    public final AppConfig component2() {
        return this.config;
    }

    public final AppConfigWrapper copy(News news, AppConfig appConfig) {
        return new AppConfigWrapper(news, appConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfigWrapper)) {
            return false;
        }
        AppConfigWrapper appConfigWrapper = (AppConfigWrapper) obj;
        return E4.k.a(this.news, appConfigWrapper.news) && E4.k.a(this.config, appConfigWrapper.config);
    }

    public final AppConfig getConfig() {
        return this.config;
    }

    public final News getNews() {
        return this.news;
    }

    public int hashCode() {
        News news = this.news;
        int iHashCode = (news == null ? 0 : news.hashCode()) * 31;
        AppConfig appConfig = this.config;
        return iHashCode + (appConfig != null ? appConfig.hashCode() : 0);
    }

    public String toString() {
        return "AppConfigWrapper(news=" + this.news + ", config=" + this.config + ")";
    }

    public /* synthetic */ AppConfigWrapper(int i, News news, AppConfig appConfig, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.news = null;
        } else {
            this.news = news;
        }
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = appConfig;
        }
    }

    public AppConfigWrapper(News news, AppConfig appConfig) {
        this.news = news;
        this.config = appConfig;
    }

    public /* synthetic */ AppConfigWrapper(News news, AppConfig appConfig, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : news, (i & 2) != 0 ? null : appConfig);
    }
}
