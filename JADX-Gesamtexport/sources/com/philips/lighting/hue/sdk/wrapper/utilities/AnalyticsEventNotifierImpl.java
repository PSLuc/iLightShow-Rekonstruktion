package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsEventNotifierImpl extends WrapperObject implements AnalyticsEventNotifier {
    public AnalyticsEventNotifierImpl() {
        create();
    }

    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.AnalyticsEventNotifier
    public final native void registerListener(AnalyticsEventNotifier.AnalyticsEventListener analyticsEventListener);

    public AnalyticsEventNotifierImpl(WrapperObject.Scope scope) {
    }
}
