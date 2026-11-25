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
public final class SideloadProgress {
    public int currentUpdate;
    public int numberUpdates;

    @Nonnull
    public String softwareVersion;

    @Nonnull
    public SideloadStage stage;
    public long stageProgress;
    public long stageTotal;

    public SideloadProgress() {
        this.softwareVersion = "";
        this.stage = SideloadStage.CHECKING_SERVICE;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SideloadProgress.class == obj.getClass()) {
            SideloadProgress sideloadProgress = (SideloadProgress) obj;
            if (Integer.valueOf(this.numberUpdates).equals(Integer.valueOf(sideloadProgress.numberUpdates)) && Integer.valueOf(this.currentUpdate).equals(Integer.valueOf(sideloadProgress.currentUpdate)) && Objects.equals(this.softwareVersion, sideloadProgress.softwareVersion) && Objects.equals(this.stage, sideloadProgress.stage) && Long.valueOf(this.stageProgress).equals(Long.valueOf(sideloadProgress.stageProgress)) && Long.valueOf(this.stageTotal).equals(Long.valueOf(sideloadProgress.stageTotal))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.numberUpdates), Integer.valueOf(this.currentUpdate), this.softwareVersion, this.stage, Long.valueOf(this.stageProgress), Long.valueOf(this.stageTotal));
    }

    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Integer numValueOf = Integer.valueOf(this.numberUpdates);
            try {
                rVarK.t("numberUpdates", JsonLoader.fromString(numValueOf.toString()));
            } catch (IOException unused) {
                rVarK.q("numberUpdates", numValueOf.toString());
            }
            Integer numValueOf2 = Integer.valueOf(this.currentUpdate);
            try {
                rVarK.t("currentUpdate", JsonLoader.fromString(numValueOf2.toString()));
            } catch (IOException unused2) {
                rVarK.q("currentUpdate", numValueOf2.toString());
            }
            String str = this.softwareVersion;
            if (str != null) {
                try {
                    rVarK.t("softwareVersion", JsonLoader.fromString(str.toString()));
                } catch (IOException unused3) {
                    rVarK.q("softwareVersion", str.toString());
                }
            } else {
                rVarK.s("softwareVersion");
            }
            SideloadStage sideloadStage = this.stage;
            if (sideloadStage != null) {
                try {
                    rVarK.t("stage", JsonLoader.fromString(sideloadStage.toString()));
                } catch (IOException unused4) {
                    rVarK.q("stage", sideloadStage.toString());
                }
            } else {
                rVarK.s("stage");
            }
            Long lValueOf = Long.valueOf(this.stageProgress);
            try {
                rVarK.t("stageProgress", JsonLoader.fromString(lValueOf.toString()));
            } catch (IOException unused5) {
                rVarK.q("stageProgress", lValueOf.toString());
            }
            Long lValueOf2 = Long.valueOf(this.stageTotal);
            try {
                rVarK.t("stageTotal", JsonLoader.fromString(lValueOf2.toString()));
            } catch (IOException unused6) {
                rVarK.q("stageTotal", lValueOf2.toString());
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public SideloadProgress(int i, int i3, @Nonnull String str, @Nonnull SideloadStage sideloadStage, long j4, long j6) {
        this.numberUpdates = i;
        this.currentUpdate = i3;
        this.softwareVersion = str;
        this.stage = sideloadStage;
        this.stageProgress = j4;
        this.stageTotal = j6;
    }
}
