package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.AbstractC0476a0;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class News {
    public static final int $stable = 0;
    public static final Q Companion = new Q();
    private final boolean blocking;
    private final int newsID;
    private final boolean temporary;
    private final String url;

    public /* synthetic */ News(int i, int i3, String str, boolean z5, boolean z6, c5.k0 k0Var) {
        if (15 != (i & 15)) {
            AbstractC0476a0.j(i, 15, P.f8356a.getDescriptor());
            throw null;
        }
        this.newsID = i3;
        this.url = str;
        this.blocking = z5;
        this.temporary = z6;
    }

    public static /* synthetic */ News copy$default(News news, int i, String str, boolean z5, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = news.newsID;
        }
        if ((i3 & 2) != 0) {
            str = news.url;
        }
        if ((i3 & 4) != 0) {
            z5 = news.blocking;
        }
        if ((i3 & 8) != 0) {
            z6 = news.temporary;
        }
        return news.copy(i, str, z5, z6);
    }

    public static /* synthetic */ void getNewsID$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(News news, b5.b bVar, a5.g gVar) {
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.d0(0, news.newsID, gVar);
        cVar.g0(gVar, 1, news.url);
        cVar.Y(gVar, 2, news.blocking);
        cVar.Y(gVar, 3, news.temporary);
    }

    public final int component1() {
        return this.newsID;
    }

    public final String component2() {
        return this.url;
    }

    public final boolean component3() {
        return this.blocking;
    }

    public final boolean component4() {
        return this.temporary;
    }

    public final News copy(int i, String str, boolean z5, boolean z6) {
        E4.k.f("url", str);
        return new News(i, str, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof News)) {
            return false;
        }
        News news = (News) obj;
        return this.newsID == news.newsID && E4.k.a(this.url, news.url) && this.blocking == news.blocking && this.temporary == news.temporary;
    }

    public final boolean getBlocking() {
        return this.blocking;
    }

    public final int getNewsID() {
        return this.newsID;
    }

    public final boolean getTemporary() {
        return this.temporary;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.temporary) + p012c.k.m(this.blocking, AbstractC0013g0.c(Integer.hashCode(this.newsID) * 31, this.url, 31), 31);
    }

    public String toString() {
        return "News(newsID=" + this.newsID + ", url=" + this.url + ", blocking=" + this.blocking + ", temporary=" + this.temporary + ")";
    }

    public News(int i, String str, boolean z5, boolean z6) {
        E4.k.f("url", str);
        this.newsID = i;
        this.url = str;
        this.blocking = z5;
        this.temporary = z6;
    }
}
