package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceSoftwareUpdate;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.LightInfo;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class LightPointImpl extends WrapperObject implements LightPoint {
    public LightPointImpl(String str, LightState lightState) {
        create(str, lightState);
    }

    private void serializeValue(r rVar, String str, Object obj) {
        if (obj == null) {
            rVar.s(str);
            return;
        }
        try {
            rVar.t(str, JsonLoader.fromString(obj.toString()));
        } catch (IOException unused) {
            rVar.q(str, obj.toString());
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    @Nonnull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final native LightPoint m3clone();

    public native void create(String str, LightState lightState);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LightPointImpl.class != obj.getClass()) {
            return false;
        }
        LightPoint lightPoint = (LightPoint) obj;
        return Objects.equals(getIdentifier(), lightPoint.getIdentifier()) && Objects.equals(getLightType(), lightPoint.getLightType()) && Objects.equals(getState(), lightPoint.getState()) && Objects.equals(getConfiguration(), lightPoint.getConfiguration());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native void fetch(@Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native void fetch(@Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native Bridge getBridge();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native DeviceConfiguration getConfiguration();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native DeviceSoftwareUpdate getDeviceSoftwareUpdate();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    @Deprecated
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native String getIdentifier();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native DeviceInfo getInfo();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native LightConfiguration getLightConfiguration();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    @Nullable
    public LightInfo getLightInfo() {
        return (LightInfo) getInfo();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native LightState getLightState();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native LightType getLightType();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native String getName();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native DeviceState getState();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    @Nonnull
    public DomainType getType() {
        return DomainType.LIGHT_POINT;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        return Objects.hash(getIdentifier(), getLightType(), getState(), getConfiguration());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    @Deprecated
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native boolean isOfType(@Nonnull DomainType domainType);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native void setBridge(Bridge bridge);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public final native void setIdentifier(String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native void setLightConfiguration(LightConfiguration lightConfiguration);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint
    public final native void setLightState(LightState lightState);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            serializeValue(rVarK, "type", getType());
            serializeValue(rVarK, "identifier", getIdentifier());
            serializeValue(rVarK, "info", getInfo());
            serializeValue(rVarK, AccountsQueryParameters.STATE, getState());
            serializeValue(rVarK, "deviceSoftwareUpdate", getDeviceSoftwareUpdate());
            serializeValue(rVarK, "configuration", getConfiguration());
            serializeValue(rVarK, "lightState", getLightState());
            serializeValue(rVarK, "lightConfiguration", getLightConfiguration());
            serializeValue(rVarK, "lightType", getLightType());
            serializeValue(rVarK, "bridge", getBridge());
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateConfiguration(DeviceConfiguration deviceConfiguration, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState, @Nonnull BridgeConnectionType bridgeConnectionType, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState, @Nonnull BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState, @Nonnull BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public final native void updateState(DeviceState deviceState, boolean z5);

    public LightPointImpl(WrapperObject.Scope scope) {
    }
}
