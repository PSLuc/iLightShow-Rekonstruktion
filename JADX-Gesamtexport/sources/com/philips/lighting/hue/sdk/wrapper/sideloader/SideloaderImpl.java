package com.philips.lighting.hue.sdk.wrapper.sideloader;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class SideloaderImpl extends WrapperObject implements Sideloader {
    public SideloaderImpl() {
        create();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    @Nonnull
    public final native SideloadCheckUpdateResult checkNewFirmwareAvailable(Bridge bridge);

    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    @Nonnull
    public final native SideloadResult downloadAndUpdateFirmware(Bridge bridge, Sideloader.Callback callback);

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    @Nonnull
    public final native SideloadResult downloadAndUpdateFirmware(Bridge bridge, Sideloader.Callback callback, @Nonnull List<SideloadSoftwareUpdateInfo> list);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SideloaderImpl.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(getCheckUpdateEndpoint(), ((Sideloader) obj).getCheckUpdateEndpoint());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    @Nonnull
    public final native String getCheckUpdateEndpoint();

    public int hashCode() {
        return Objects.hash(getCheckUpdateEndpoint());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    public final native boolean isMandatoryUpdateAvailable(Bridge bridge);

    @Override // com.philips.lighting.hue.sdk.wrapper.sideloader.Sideloader
    public final native void setCheckUpdateEndpoint(@Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            String checkUpdateEndpoint = getCheckUpdateEndpoint();
            if (checkUpdateEndpoint != null) {
                try {
                    rVarK.t("checkUpdateEndpoint", JsonLoader.fromString(checkUpdateEndpoint.toString()));
                } catch (IOException unused) {
                    rVarK.q("checkUpdateEndpoint", checkUpdateEndpoint.toString());
                }
            } else {
                rVarK.s("checkUpdateEndpoint");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public SideloaderImpl(WrapperObject.Scope scope) {
    }
}
