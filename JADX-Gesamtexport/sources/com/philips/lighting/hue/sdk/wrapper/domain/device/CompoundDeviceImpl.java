package com.philips.lighting.hue.sdk.wrapper.domain.device;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class CompoundDeviceImpl extends WrapperObject implements CompoundDevice {
    public CompoundDeviceImpl(WrapperObject.Scope scope) {
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

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CompoundDeviceImpl.class != obj.getClass()) {
            return false;
        }
        CompoundDevice compoundDevice = (CompoundDevice) obj;
        return Boolean.valueOf(isComplete()).equals(Boolean.valueOf(compoundDevice.isComplete())) && Objects.equals(getDevices(), compoundDevice.getDevices());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public final native Device getDevice(@Nonnull DomainType domainType, @Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public final native List<Device> getDevices();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public final native List<Device> getDevices(@Nonnull DomainType domainType);

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isComplete()), getDevices());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public final native boolean isComplete();

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            rVarK.r("complete", isComplete());
            serializeValue(rVarK, "devices", getDevices());
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }
}
