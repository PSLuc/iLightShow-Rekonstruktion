package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class AggregatedPresenceSensorState {
    public Date lastUpdated;
    public Boolean presence;
    public Boolean presenceAll;

    public AggregatedPresenceSensorState() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AggregatedPresenceSensorState.class == obj.getClass()) {
            AggregatedPresenceSensorState aggregatedPresenceSensorState = (AggregatedPresenceSensorState) obj;
            if (Objects.equals(this.lastUpdated, aggregatedPresenceSensorState.lastUpdated) && Objects.equals(this.presence, aggregatedPresenceSensorState.presence) && Objects.equals(this.presenceAll, aggregatedPresenceSensorState.presenceAll)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.lastUpdated, this.presence, this.presenceAll);
    }

    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Date date = this.lastUpdated;
            if (date != null) {
                try {
                    rVarK.t("lastUpdated", JsonLoader.fromString(date.toString()));
                } catch (IOException unused) {
                    rVarK.q("lastUpdated", date.toString());
                }
            } else {
                rVarK.s("lastUpdated");
            }
            Boolean bool = this.presence;
            if (bool != null) {
                try {
                    rVarK.t("presence", JsonLoader.fromString(bool.toString()));
                } catch (IOException unused2) {
                    rVarK.q("presence", bool.toString());
                }
            } else {
                rVarK.s("presence");
            }
            Boolean bool2 = this.presenceAll;
            if (bool2 != null) {
                try {
                    rVarK.t("presenceAll", JsonLoader.fromString(bool2.toString()));
                } catch (IOException unused3) {
                    rVarK.q("presenceAll", bool2.toString());
                }
            } else {
                rVarK.s("presenceAll");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public AggregatedPresenceSensorState(Date date, Boolean bool, Boolean bool2) {
        this.lastUpdated = date;
        this.presence = bool;
        this.presenceAll = bool2;
    }
}
