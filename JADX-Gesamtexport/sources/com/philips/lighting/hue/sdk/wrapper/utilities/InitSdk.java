package com.philips.lighting.hue.sdk.wrapper.utilities;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class InitSdk extends InitSdkBase {
    private static Context activityContext;

    private InitSdk() {
    }

    public static Context getApplicationContext() {
        Context context = activityContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot get context, because it was not set.");
    }

    public static void setApplicationContext(Context context) {
        activityContext = context;
    }
}
