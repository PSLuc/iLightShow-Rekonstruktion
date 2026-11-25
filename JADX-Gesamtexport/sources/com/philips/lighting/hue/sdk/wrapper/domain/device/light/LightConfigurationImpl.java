package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.LightArchetype;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.LightDirection;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.LightFunction;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class LightConfigurationImpl extends WrapperObject implements LightConfiguration {
    public LightConfigurationImpl() {
        create();
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

    public native void create();

    public native void create(String str);

    public native void create(String str, String str2, String str3, String str4, String str5, String str6, LightArchetype lightArchetype, LightDirection lightDirection, LightFunction lightFunction, LightStartUpState lightStartUpState);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LightConfigurationImpl.class != obj.getClass()) {
            return false;
        }
        LightConfiguration lightConfiguration = (LightConfiguration) obj;
        return Objects.equals(getLuminaireUniqueId(), lightConfiguration.getLuminaireUniqueId()) && Objects.equals(getManufacturerName(), lightConfiguration.getManufacturerName()) && Objects.equals(getModelId(), lightConfiguration.getModelId()) && Objects.equals(getName(), lightConfiguration.getName()) && Objects.equals(getSwVersion(), lightConfiguration.getSwVersion()) && Objects.equals(getUniqueId(), lightConfiguration.getUniqueId()) && Objects.equals(getArchetype(), lightConfiguration.getArchetype()) && Objects.equals(getDirection(), lightConfiguration.getDirection()) && Objects.equals(getFunction(), lightConfiguration.getFunction()) && Objects.equals(getLightStartUpState(), lightConfiguration.getLightStartUpState());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native LightArchetype getArchetype();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native LightDirection getDirection();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native LightFunction getFunction();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native LightStartUpState getLightStartUpState();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native String getLuminaireUniqueId();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration, com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public final native String getManufacturerName();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native String getModelId();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    @Deprecated
    public String getModelIdentifier() {
        return getModelId();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration, com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public final native String getName();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration, com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public final native String getSwVersion();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    @Nonnull
    public DomainType getType() {
        return DomainType.LIGHT_CONFIGURATION;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native String getUniqueId();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    @Deprecated
    public String getUniqueIdentifier() {
        return getUniqueId();
    }

    public int hashCode() {
        return Objects.hash(getLuminaireUniqueId(), getManufacturerName(), getModelId(), getName(), getSwVersion(), getUniqueId(), getArchetype(), getDirection(), getFunction(), getLightStartUpState());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native void setArchetype(LightArchetype lightArchetype);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native void setDirection(LightDirection lightDirection);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native void setFunction(LightFunction lightFunction);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native void setLightStartUpState(LightStartUpState lightStartUpState);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration
    public final native void setLuminaireUniqueId(String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration, com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public final native void setName(String str);

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
            serializeValue(rVarK, "luminaireUniqueId", getLuminaireUniqueId());
            serializeValue(rVarK, "archetype", getArchetype());
            serializeValue(rVarK, "direction", getDirection());
            serializeValue(rVarK, "function", getFunction());
            serializeValue(rVarK, "name", getName());
            serializeValue(rVarK, "modelId", getModelId());
            serializeValue(rVarK, "swVersion", getSwVersion());
            serializeValue(rVarK, "uniqueId", getUniqueId());
            serializeValue(rVarK, "manufacturerName", getManufacturerName());
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public LightConfigurationImpl(String str, String str2, String str3, String str4, String str5, String str6, LightArchetype lightArchetype, LightDirection lightDirection, LightFunction lightFunction, LightStartUpState lightStartUpState) {
        create(str, str2, str3, str4, str5, str6, lightArchetype, lightDirection, lightFunction, lightStartUpState);
    }

    public LightConfigurationImpl(String str) {
        create(str);
    }

    public LightConfigurationImpl(WrapperObject.Scope scope) {
    }
}
