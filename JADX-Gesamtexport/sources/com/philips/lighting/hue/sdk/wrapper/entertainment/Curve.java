package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Curve extends WrapperObject {
    public Curve() {
        create(new ArrayList());
    }

    public final native void appendPoints(List<Point> list);

    public native void create(List<Point> list);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native double getBegin();

    public final native double getClipMax();

    public final native double getClipMin();

    public final native double getEnd();

    public final native Point getInterpolated(double d6);

    public final native double getLength();

    public final native double getMultiplyFactor();

    public final native List<Point> getPoints();

    public final native boolean hasClipMax();

    public final native boolean hasClipMin();

    public final native boolean hasPoints();

    public final native void resetClipMax();

    public final native void resetClipMin();

    public final native void setClipMax(double d6);

    public final native void setClipMin(double d6);

    public final native void setMultiplyFactor(double d6);

    public final native void setPoints(List<Point> list);

    public Curve(List<Point> list) {
        create(list);
    }

    public Curve(WrapperObject.Scope scope) {
    }
}
