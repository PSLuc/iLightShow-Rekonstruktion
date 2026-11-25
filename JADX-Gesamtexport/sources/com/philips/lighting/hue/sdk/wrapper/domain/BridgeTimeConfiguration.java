package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.AbsoluteTimePattern;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class BridgeTimeConfiguration {
    private TimePattern utc = null;
    private TimePattern localTime = null;
    private byte[] timeZone = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeTimeConfiguration bridgeTimeConfiguration = (BridgeTimeConfiguration) obj;
        TimePattern timePattern = this.localTime;
        if (timePattern == null) {
            if (bridgeTimeConfiguration.localTime != null) {
                return false;
            }
        } else if (!timePattern.equals(bridgeTimeConfiguration.localTime)) {
            return false;
        }
        if (!Arrays.equals(this.timeZone, bridgeTimeConfiguration.timeZone)) {
            return false;
        }
        TimePattern timePattern2 = this.utc;
        if (timePattern2 == null) {
            if (bridgeTimeConfiguration.utc != null) {
                return false;
            }
        } else if (!timePattern2.equals(bridgeTimeConfiguration.utc)) {
            return false;
        }
        return true;
    }

    public AbsoluteTimePattern getLocalTime() {
        return (AbsoluteTimePattern) this.localTime;
    }

    public String getTimeZone() {
        return NativeTools.BytesToString(this.timeZone);
    }

    public AbsoluteTimePattern getUtc() {
        return (AbsoluteTimePattern) this.utc;
    }

    public int hashCode() {
        TimePattern timePattern = this.localTime;
        int iN = k.n(this.timeZone, ((timePattern == null ? 0 : timePattern.hashCode()) + 31) * 31, 31);
        TimePattern timePattern2 = this.utc;
        return iN + (timePattern2 != null ? timePattern2.hashCode() : 0);
    }

    public void setLocalTime(AbsoluteTimePattern absoluteTimePattern) {
        this.localTime = absoluteTimePattern;
    }

    public void setTimeZone(String str) {
        this.timeZone = NativeTools.StringToBytes(str);
    }

    public void setUtc(AbsoluteTimePattern absoluteTimePattern) {
        this.utc = absoluteTimePattern;
    }
}
