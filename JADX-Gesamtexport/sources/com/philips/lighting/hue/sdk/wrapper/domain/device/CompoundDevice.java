package com.philips.lighting.hue.sdk.wrapper.domain.device;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface CompoundDevice {
    Device getDevice(@Nonnull DomainType domainType, @Nonnull String str);

    List<Device> getDevices();

    List<Device> getDevices(@Nonnull DomainType domainType);

    boolean isComplete();
}
