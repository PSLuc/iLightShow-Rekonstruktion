package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class OperationImpl extends WrapperObject implements Operation {
    public OperationImpl(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public final native void cancel();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public final native boolean isCancelable();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public final native void waitFinished();
}
