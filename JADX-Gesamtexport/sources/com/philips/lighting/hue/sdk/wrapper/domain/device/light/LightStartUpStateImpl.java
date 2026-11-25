package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class LightStartUpStateImpl extends WrapperObject implements LightStartUpState {
    public LightStartUpStateImpl() {
        create();
    }

    public native void create();

    public native void create(CustomStartUpSettings customStartUpSettings, Boolean bool);

    public native void create(StartUpMode startUpMode, Boolean bool);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LightStartUpStateImpl.class == obj.getClass()) {
            LightStartUpState lightStartUpState = (LightStartUpState) obj;
            if (Objects.equals(isConfigured(), lightStartUpState.isConfigured()) && Objects.equals(getMode(), lightStartUpState.getMode()) && Objects.equals(getCustomSettings(), lightStartUpState.getCustomSettings())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightStartUpState
    public final native CustomStartUpSettings getCustomSettings();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightStartUpState
    public final native StartUpMode getMode();

    public int hashCode() {
        return Objects.hash(isConfigured(), getMode(), getCustomSettings());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightStartUpState
    public final native Boolean isConfigured();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightStartUpState
    public final native void setCustomSettings(CustomStartUpSettings customStartUpSettings);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightStartUpState
    public final native void setMode(StartUpMode startUpMode);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Boolean boolIsConfigured = isConfigured();
            if (boolIsConfigured != null) {
                try {
                    rVarK.t("configured", JsonLoader.fromString(boolIsConfigured.toString()));
                } catch (IOException unused) {
                    rVarK.q("configured", boolIsConfigured.toString());
                }
            } else {
                rVarK.s("configured");
            }
            StartUpMode mode = getMode();
            if (mode != null) {
                try {
                    rVarK.t("mode", JsonLoader.fromString(mode.toString()));
                } catch (IOException unused2) {
                    rVarK.q("mode", mode.toString());
                }
            } else {
                rVarK.s("mode");
            }
            CustomStartUpSettings customSettings = getCustomSettings();
            if (customSettings != null) {
                try {
                    rVarK.t("customSettings", JsonLoader.fromString(customSettings.toString()));
                } catch (IOException unused3) {
                    rVarK.q("customSettings", customSettings.toString());
                }
            } else {
                rVarK.s("customSettings");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public LightStartUpStateImpl(StartUpMode startUpMode, Boolean bool) {
        create(startUpMode, bool);
    }

    public LightStartUpStateImpl(CustomStartUpSettings customStartUpSettings, Boolean bool) {
        create(customStartUpSettings, bool);
    }

    public LightStartUpStateImpl(WrapperObject.Scope scope) {
    }
}
