package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.Alert;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ColorMode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.DoublePair;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.Effect;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.LightMode;
import com.philips.lighting.hue.sdk.wrapper.utilities.Color;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class LightStateImpl extends WrapperObject implements LightState {
    public LightStateImpl() {
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

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Nonnull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final native LightState m5clone();

    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LightStateImpl.class != obj.getClass()) {
            return false;
        }
        LightState lightState = (LightState) obj;
        return Objects.equals(getAlert(), lightState.getAlert()) && Objects.equals(getBrightness(), lightState.getBrightness()) && Objects.equals(getBrightnessIncrement(), lightState.getBrightnessIncrement()) && Objects.equals(getColormode(), lightState.getColormode()) && Objects.equals(getCt(), lightState.getCt()) && Objects.equals(getCtIncrement(), lightState.getCtIncrement()) && Objects.equals(getEffect(), lightState.getEffect()) && Objects.equals(getHue(), lightState.getHue()) && Objects.equals(getHueIncrement(), lightState.getHueIncrement()) && Objects.equals(isOn(), lightState.isOn()) && Objects.equals(isReachable(), lightState.isReachable()) && Objects.equals(getSaturation(), lightState.getSaturation()) && Objects.equals(getSaturationIncrement(), lightState.getSaturationIncrement()) && Objects.equals(getTransitionTime(), lightState.getTransitionTime()) && Objects.equals(getXy(), lightState.getXy()) && Objects.equals(getXyIncrement(), lightState.getXyIncrement());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Alert getAlert();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getBrightness();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getBrightnessIncrement();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public Integer getCT() {
        return getCt();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public Integer getCTIncrement() {
        return getCtIncrement();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Nonnull
    public final native Color getColor();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Nonnull
    public final native ColorMode getColormode();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getCt();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getCtIncrement();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Nonnull
    public final native Effect getEffect();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getHue();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getHueIncrement();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Nonnull
    public final native LightMode getLightMode();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getSaturation();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getSaturationIncrement();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Integer getTransitionTime();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState
    public DomainType getType() {
        return DomainType.LIGHT_STATE;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public DoublePair getXY() {
        return getXy();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public DoublePair getXYIncrement() {
        return new DoublePair();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native DoublePair getXy();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native DoublePair getXyIncrement();

    public int hashCode() {
        return Objects.hash(getAlert(), getBrightness(), getBrightnessIncrement(), getColormode(), getCt(), getCtIncrement(), getEffect(), getHue(), getHueIncrement(), isOn(), isReachable(), getSaturation(), getSaturationIncrement(), getTransitionTime(), getXy(), getXyIncrement());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Boolean isOn();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native Boolean isReachable();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setAlert(Alert alert);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setBrightness(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setBrightnessIncrement(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setCT(Integer num) {
        setCt(num);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setCTIncrement(Integer num) {
        setCtIncrement(num);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setCt(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setCtIncrement(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setEffect(@Nonnull Effect effect);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setHue(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setHueIncrement(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setLightMode(@Nonnull LightMode lightMode);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setOn(Boolean bool);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setSaturation(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setSaturationIncrement(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setTransitionTime(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXY(DoublePair doublePair) {
        setXy(doublePair);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXYBWithColor(Color color) {
        setXybWithColor(color);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXYIncrement(DoublePair doublePair) {
        setXyIncrement(doublePair);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXYWithColor(Color color) {
        setXyWithColor(color);
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setXy(DoublePair doublePair);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setXyIncrement(DoublePair doublePair);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setXyWithColor(@Nonnull Color color);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    public final native void setXybWithColor(@Nonnull Color color);

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
            serializeValue(rVarK, "reachable", isReachable());
            serializeValue(rVarK, "on", isOn());
            serializeValue(rVarK, "transitionTime", getTransitionTime());
            serializeValue(rVarK, ClipAttribute.Sensor.Configuration.Alert, getAlert());
            serializeValue(rVarK, "brightness", getBrightness());
            serializeValue(rVarK, "brightnessIncrement", getBrightnessIncrement());
            serializeValue(rVarK, "effect", getEffect());
            serializeValue(rVarK, "type", getHue());
            serializeValue(rVarK, "hueIncrement", getHueIncrement());
            serializeValue(rVarK, "saturation", getSaturation());
            serializeValue(rVarK, "saturationIncrement", getSaturationIncrement());
            serializeValue(rVarK, ClipAttribute.Light.State.CT, getCt());
            serializeValue(rVarK, "ctIncrement", getCtIncrement());
            serializeValue(rVarK, "xy", getXy());
            serializeValue(rVarK, "xyIncrement", getXyIncrement());
            serializeValue(rVarK, "lightMode", getLightMode());
            serializeValue(rVarK, "colormode", getColormode());
            serializeValue(rVarK, "color", getColor());
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXY(double d6, double d7) {
        setXy(new DoublePair(d6, d7));
        return this;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState
    @Deprecated
    public LightState setXYIncrement(double d6, double d7) {
        setXYIncrement(d6, d7);
        return this;
    }

    public LightStateImpl(WrapperObject.Scope scope) {
    }
}
