package com.philips.lighting.hue.sdk.wrapper.utilities;

/* JADX INFO: loaded from: classes.dex */
class InitSdkBase {
    public static void registerAnalyticsEventListener(AnalyticsEventNotifier.AnalyticsEventListener analyticsEventListener) {
        new AnalyticsEventNotifierImpl().registerListener(analyticsEventListener);
    }
}
