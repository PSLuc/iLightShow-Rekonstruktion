package com.philips.lighting.hue.sdk.wrapper.entertainment.lightscript;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Location;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public class LightScript extends WrapperObject {
    public LightScript() {
        create();
    }

    public static LightScript fromString(String str) {
        LightScript lightScript = new LightScript();
        lightScript.load(str);
        return lightScript;
    }

    public final native void addAction(Action action);

    public final native void bindTimeline(Timeline timeline);

    public native void create();

    public native void create2(String str, long j4);

    public native void create3(String str, long j4, List<Location> list);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native void finish();

    public final native List<Action> getActions();

    public final native List<Location> getIdealSetup();

    public final native long getLength();

    public final native String getName();

    public final native void load(String str);

    public final native void setActions(List<Action> list);

    public final native void setIdealSetup(List<Location> list);

    public final native void setLength(long j4);

    public final native void setName(String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public final native String toString();

    public LightScript(String str, long j4) {
        create2(str, j4);
    }

    public LightScript(String str, long j4, List<Location> list) {
        create3(str, j4, list);
    }

    public LightScript(WrapperObject.Scope scope) {
    }
}
