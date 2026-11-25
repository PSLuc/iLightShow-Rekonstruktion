package com.spotify.sdk.android.auth.webview;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/* JADX INFO: loaded from: classes.dex */
class WebViewUtils {
    public static void clearCookiesForDomain(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : cookie.split(";")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length > 0) {
                cookieManager.setCookie(str, strArrSplit[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static void clearFacebookCookies(Context context) {
        clearCookiesForDomain(context, "facebook.com");
        clearCookiesForDomain(context, ".facebook.com");
        clearCookiesForDomain(context, "https://facebook.com");
        clearCookiesForDomain(context, "https://.facebook.com");
    }
}
