package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.lightscript.Timeline;

/* JADX INFO: loaded from: classes.dex */
public class TimelineMessageData extends WrapperObject implements MessageData {
    public TimelineMessageData(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Timeline getTimeline();
}
