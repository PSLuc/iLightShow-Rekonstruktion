package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LightPointCluster extends WrapperObject {
    private HueColor hueColor;
    private LightPoint[] lightPoints;

    public LightPointCluster(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public HueColor getCentroid() {
        return this.hueColor;
    }

    public List<LightPoint> getLightPoints() {
        return new ArrayList(Arrays.asList(this.lightPoints));
    }
}
