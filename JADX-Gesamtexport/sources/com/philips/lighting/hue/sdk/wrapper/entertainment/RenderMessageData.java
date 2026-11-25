package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RenderMessageData extends WrapperObject implements MessageData {
    public RenderMessageData(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native List<Light> getLights();
}
