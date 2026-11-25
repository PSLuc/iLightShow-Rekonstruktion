package com.philips.lighting.hue.sdk.wrapper.utilities;

import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsEventNotifier {

    public interface AnalyticsEventListener {
        void onEvent(@Nonnull String str, @Nonnull Map<String, String> map);
    }

    void registerListener(AnalyticsEventListener analyticsEventListener);
}
