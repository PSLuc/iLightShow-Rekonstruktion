package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

import com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Group;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface LightSource extends LightPoint, CompoundDevice {
    @Nonnull
    Group getGroup();

    @Nonnull
    List<LightPoint> getLights();

    @Nonnull
    CompoundLightUpdateMode getUpdateMode();

    void setUpdateMode(@Nonnull CompoundLightUpdateMode compoundLightUpdateMode);
}
