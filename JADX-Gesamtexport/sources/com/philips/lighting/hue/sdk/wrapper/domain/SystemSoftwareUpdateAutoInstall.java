package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TruncatedTimePattern;

/* JADX INFO: loaded from: classes.dex */
public class SystemSoftwareUpdateAutoInstall {
    private Boolean isOn;
    private Boolean isSupported;
    private TruncatedTimePattern updateTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SystemSoftwareUpdateAutoInstall systemSoftwareUpdateAutoInstall = (SystemSoftwareUpdateAutoInstall) obj;
            Boolean bool = this.isOn;
            if (bool == null ? systemSoftwareUpdateAutoInstall.isOn != null : !bool.equals(systemSoftwareUpdateAutoInstall.isOn)) {
                return false;
            }
            TruncatedTimePattern truncatedTimePattern = this.updateTime;
            if (truncatedTimePattern == null ? systemSoftwareUpdateAutoInstall.updateTime != null : !truncatedTimePattern.equals(systemSoftwareUpdateAutoInstall.updateTime)) {
                return false;
            }
            Boolean bool2 = this.isSupported;
            if (bool2 != null) {
                return bool2.equals(systemSoftwareUpdateAutoInstall.isSupported);
            }
            if (systemSoftwareUpdateAutoInstall.isSupported == null) {
                return true;
            }
        }
        return false;
    }

    public Boolean getOn() {
        return this.isOn;
    }

    public Boolean getSupported() {
        return this.isSupported;
    }

    public TruncatedTimePattern getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        Boolean bool = this.isOn;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        TruncatedTimePattern truncatedTimePattern = this.updateTime;
        int iHashCode2 = (iHashCode + (truncatedTimePattern != null ? truncatedTimePattern.hashCode() : 0)) * 31;
        Boolean bool2 = this.isSupported;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public void setOn(Boolean bool) {
        this.isOn = bool;
    }

    public void setUpdateTime(TruncatedTimePattern truncatedTimePattern) {
        this.updateTime = truncatedTimePattern;
    }
}
