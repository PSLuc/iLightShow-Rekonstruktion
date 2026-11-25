package com.philips.lighting.hue.sdk.wrapper.domain.device;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceConfiguration {
    String getManufacturerName();

    String getModelIdentifier();

    String getName();

    String getSwVersion();

    DomainType getType();

    String getUniqueIdentifier();

    void setName(String str);
}
