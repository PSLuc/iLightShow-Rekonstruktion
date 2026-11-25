package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class CancelableOperationImpl extends WrapperObject implements CancelableOperation {
    private CancelableOperationImpl(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public native void cancel();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public native boolean isCancelable();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Operation
    public native void waitFinished();
}
