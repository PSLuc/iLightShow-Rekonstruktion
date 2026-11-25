package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionImpl extends WrapperObject implements Subscription {
    public SubscriptionImpl(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Subscription
    public final native void disable();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Subscription
    public final native void enable();
}
