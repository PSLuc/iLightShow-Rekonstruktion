package com.philips.lighting.hue.sdk.wrapper.sideloader;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface Sideloader {

    public interface Callback {
        void handleCallback(@Nonnull SideloadProgress sideloadProgress);
    }

    @Nonnull
    SideloadCheckUpdateResult checkNewFirmwareAvailable(Bridge bridge);

    @Nonnull
    SideloadResult downloadAndUpdateFirmware(Bridge bridge, Callback callback);

    @Nonnull
    SideloadResult downloadAndUpdateFirmware(Bridge bridge, Callback callback, @Nonnull List<SideloadSoftwareUpdateInfo> list);

    @Nonnull
    String getCheckUpdateEndpoint();

    boolean isMandatoryUpdateAvailable(Bridge bridge);

    void setCheckUpdateEndpoint(@Nonnull String str);
}
