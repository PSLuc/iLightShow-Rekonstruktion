package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LightPointClustering extends WrapperObject {
    public LightPointClustering() {
        create();
    }

    public final List<LightPointCluster> cluster(List<LightPoint> list) {
        return clusterNative((LightPoint[]) list.toArray(new LightPoint[list.size()]));
    }

    public native List<LightPointCluster> clusterNative(LightPoint[] lightPointArr);

    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public LightPointClustering(WrapperObject.Scope scope) {
    }
}
