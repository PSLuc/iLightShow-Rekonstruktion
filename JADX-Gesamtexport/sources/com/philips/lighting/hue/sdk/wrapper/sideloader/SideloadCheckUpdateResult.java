package com.philips.lighting.hue.sdk.wrapper.sideloader;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class SideloadCheckUpdateResult {

    @Nonnull
    public SideloadResult result;

    @Nonnull
    public List<SideloadSoftwareUpdateInfo> updateList;

    public SideloadCheckUpdateResult() {
        this.result = SideloadResult.SUCCESS;
        this.updateList = new ArrayList();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SideloadCheckUpdateResult.class == obj.getClass()) {
            SideloadCheckUpdateResult sideloadCheckUpdateResult = (SideloadCheckUpdateResult) obj;
            if (Objects.equals(this.result, sideloadCheckUpdateResult.result) && Objects.equals(this.updateList, sideloadCheckUpdateResult.updateList)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.result, this.updateList);
    }

    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            SideloadResult sideloadResult = this.result;
            if (sideloadResult != null) {
                try {
                    rVarK.t("result", JsonLoader.fromString(sideloadResult.toString()));
                } catch (IOException unused) {
                    rVarK.q("result", sideloadResult.toString());
                }
            } else {
                rVarK.s("result");
            }
            List<SideloadSoftwareUpdateInfo> list = this.updateList;
            if (list != null) {
                try {
                    rVarK.t("updateList", JsonLoader.fromString(list.toString()));
                } catch (IOException unused2) {
                    rVarK.q("updateList", list.toString());
                }
            } else {
                rVarK.s("updateList");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public SideloadCheckUpdateResult(@Nonnull SideloadResult sideloadResult, @Nonnull List<SideloadSoftwareUpdateInfo> list) {
        this.result = sideloadResult;
        this.updateList = list;
    }
}
