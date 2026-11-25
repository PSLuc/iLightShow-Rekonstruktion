package com.philips.lighting.hue.sdk.wrapper.sideloader;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class SideloadSoftwareUpdateInfo {

    @Nonnull
    public String blob;
    public long fileSize;
    public long softwareVersion;

    @Nonnull
    public String versionUrl;

    public SideloadSoftwareUpdateInfo() {
        this.versionUrl = "";
        this.blob = "";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SideloadSoftwareUpdateInfo.class == obj.getClass()) {
            SideloadSoftwareUpdateInfo sideloadSoftwareUpdateInfo = (SideloadSoftwareUpdateInfo) obj;
            if (Long.valueOf(this.softwareVersion).equals(Long.valueOf(sideloadSoftwareUpdateInfo.softwareVersion)) && Objects.equals(this.versionUrl, sideloadSoftwareUpdateInfo.versionUrl) && Long.valueOf(this.fileSize).equals(Long.valueOf(sideloadSoftwareUpdateInfo.fileSize)) && Objects.equals(this.blob, sideloadSoftwareUpdateInfo.blob)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.softwareVersion), this.versionUrl, Long.valueOf(this.fileSize), this.blob);
    }

    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Long lValueOf = Long.valueOf(this.softwareVersion);
            try {
                rVarK.t("softwareVersion", JsonLoader.fromString(lValueOf.toString()));
            } catch (IOException unused) {
                rVarK.q("softwareVersion", lValueOf.toString());
            }
            String str = this.versionUrl;
            if (str != null) {
                try {
                    rVarK.t("versionUrl", JsonLoader.fromString(str.toString()));
                } catch (IOException unused2) {
                    rVarK.q("versionUrl", str.toString());
                }
            } else {
                rVarK.s("versionUrl");
            }
            Long lValueOf2 = Long.valueOf(this.fileSize);
            try {
                rVarK.t("fileSize", JsonLoader.fromString(lValueOf2.toString()));
            } catch (IOException unused3) {
                rVarK.q("fileSize", lValueOf2.toString());
            }
            String str2 = this.blob;
            if (str2 != null) {
                try {
                    rVarK.t("blob", JsonLoader.fromString(str2.toString()));
                } catch (IOException unused4) {
                    rVarK.q("blob", str2.toString());
                }
            } else {
                rVarK.s("blob");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public SideloadSoftwareUpdateInfo(long j4, @Nonnull String str, long j6, @Nonnull String str2) {
        this.softwareVersion = j4;
        this.versionUrl = str;
        this.fileSize = j6;
        this.blob = str2;
    }
}
