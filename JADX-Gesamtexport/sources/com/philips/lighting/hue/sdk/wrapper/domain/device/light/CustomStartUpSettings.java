package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.philips.lighting.hue.sdk.wrapper.utilities.Color;

/* JADX INFO: loaded from: classes.dex */
public interface CustomStartUpSettings {
    Integer getBri();

    Integer getCt();

    Color.XY getXy();

    void setBri(Integer num);

    void setCt(Integer num);

    void setXy(Color.XY xy);
}
