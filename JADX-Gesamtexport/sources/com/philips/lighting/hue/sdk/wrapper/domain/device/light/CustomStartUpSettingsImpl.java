package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import com.philips.lighting.hue.sdk.wrapper.utilities.Color;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class CustomStartUpSettingsImpl extends WrapperObject implements CustomStartUpSettings {
    public CustomStartUpSettingsImpl() {
        create();
    }

    public native void create();

    public native void create(Integer num);

    public native void create(Integer num, Color.XY xy);

    public native void create(Integer num, Integer num2);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CustomStartUpSettingsImpl.class == obj.getClass()) {
            CustomStartUpSettings customStartUpSettings = (CustomStartUpSettings) obj;
            if (Objects.equals(getBri(), customStartUpSettings.getBri()) && Objects.equals(getCt(), customStartUpSettings.getCt()) && Objects.equals(getXy(), customStartUpSettings.getXy())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native Integer getBri();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native Integer getCt();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native Color.XY getXy();

    public int hashCode() {
        return Objects.hash(getBri(), getCt(), getXy());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native void setBri(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native void setCt(Integer num);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.CustomStartUpSettings
    public final native void setXy(Color.XY xy);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Integer bri = getBri();
            if (bri != null) {
                try {
                    rVarK.t(ClipAttribute.Light.State.Brightness, JsonLoader.fromString(bri.toString()));
                } catch (IOException unused) {
                    rVarK.q(ClipAttribute.Light.State.Brightness, bri.toString());
                }
            } else {
                rVarK.s(ClipAttribute.Light.State.Brightness);
            }
            Integer ct = getCt();
            if (ct != null) {
                try {
                    rVarK.t(ClipAttribute.Light.State.CT, JsonLoader.fromString(ct.toString()));
                } catch (IOException unused2) {
                    rVarK.q(ClipAttribute.Light.State.CT, ct.toString());
                }
            } else {
                rVarK.s(ClipAttribute.Light.State.CT);
            }
            Color.XY xy = getXy();
            if (xy != null) {
                try {
                    rVarK.t("xy", JsonLoader.fromString(xy.toString()));
                } catch (IOException unused3) {
                    rVarK.q("xy", xy.toString());
                }
            } else {
                rVarK.s("xy");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public CustomStartUpSettingsImpl(Integer num) {
        create(num);
    }

    public CustomStartUpSettingsImpl(Integer num, Integer num2) {
        create(num, num2);
    }

    public CustomStartUpSettingsImpl(Integer num, Color.XY xy) {
        create(num, xy);
    }

    public CustomStartUpSettingsImpl(WrapperObject.Scope scope) {
    }
}
