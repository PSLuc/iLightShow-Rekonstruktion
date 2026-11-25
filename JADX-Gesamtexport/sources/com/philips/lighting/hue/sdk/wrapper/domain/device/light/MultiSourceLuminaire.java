package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Group;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface MultiSourceLuminaire extends LightPoint, CompoundDevice {
    @Nonnull
    Group getGroup();

    @Nonnull
    CompoundLightUpdateMode getUpdateMode();

    void setUpdateMode(@Nonnull CompoundLightUpdateMode compoundLightUpdateMode);
}
