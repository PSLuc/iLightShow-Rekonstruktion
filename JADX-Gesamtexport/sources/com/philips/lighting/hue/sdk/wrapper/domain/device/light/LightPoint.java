package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceSoftwareUpdate;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.LightInfo;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface LightPoint extends Device {
    @Nonnull
    LightPoint clone();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    void fetch(@Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    void fetch(@Nonnull BridgeResponseCallback bridgeResponseCallback);

    Bridge getBridge();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    DeviceConfiguration getConfiguration();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    DeviceSoftwareUpdate getDeviceSoftwareUpdate();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    @Deprecated
    int getDomainType();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    String getIdentifier();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    DeviceInfo getInfo();

    LightConfiguration getLightConfiguration();

    @Nullable
    LightInfo getLightInfo();

    LightState getLightState();

    LightType getLightType();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    String getName();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    DeviceState getState();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    DomainType getType();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    @Deprecated
    boolean isOfType(int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    boolean isOfType(@Nonnull DomainType domainType);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    void setBridge(Bridge bridge);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    void setIdentifier(String str);

    void setLightConfiguration(LightConfiguration lightConfiguration);

    void setLightState(LightState lightState);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateConfiguration(DeviceConfiguration deviceConfiguration, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    void updateState(DeviceState deviceState, boolean z5);
}
