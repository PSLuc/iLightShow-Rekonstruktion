package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceSoftwareUpdate;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class SystemSoftwareUpdate {
    private SystemSoftwareUpdateAutoInstall autoInstall;
    private DeviceSoftwareUpdate bridgeSoftwareUpdate;
    private Boolean checkForUpdate;
    private Boolean install;
    private Date lastChange;
    private SystemSoftwareUpdateState updateState;
    private SystemSoftwareUpdateVersion version;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SystemSoftwareUpdate systemSoftwareUpdate = (SystemSoftwareUpdate) obj;
            DeviceSoftwareUpdate deviceSoftwareUpdate = this.bridgeSoftwareUpdate;
            if (deviceSoftwareUpdate == null ? systemSoftwareUpdate.bridgeSoftwareUpdate != null : !deviceSoftwareUpdate.equals(systemSoftwareUpdate.bridgeSoftwareUpdate)) {
                return false;
            }
            if (this.updateState != systemSoftwareUpdate.updateState) {
                return false;
            }
            Boolean bool = this.install;
            if (bool == null ? systemSoftwareUpdate.install != null : !bool.equals(systemSoftwareUpdate.install)) {
                return false;
            }
            Boolean bool2 = this.checkForUpdate;
            if (bool2 == null ? systemSoftwareUpdate.checkForUpdate != null : !bool2.equals(systemSoftwareUpdate.checkForUpdate)) {
                return false;
            }
            Date date = this.lastChange;
            if (date == null ? systemSoftwareUpdate.lastChange != null : !date.equals(systemSoftwareUpdate.lastChange)) {
                return false;
            }
            if (this.version != systemSoftwareUpdate.version) {
                return false;
            }
            SystemSoftwareUpdateAutoInstall systemSoftwareUpdateAutoInstall = this.autoInstall;
            if (systemSoftwareUpdateAutoInstall != null) {
                return systemSoftwareUpdateAutoInstall.equals(systemSoftwareUpdate.autoInstall);
            }
            if (systemSoftwareUpdate.autoInstall == null) {
                return true;
            }
        }
        return false;
    }

    public SystemSoftwareUpdateAutoInstall getAutoInstall() {
        return this.autoInstall;
    }

    public DeviceSoftwareUpdate getBridgeSoftwareUpdate() {
        return this.bridgeSoftwareUpdate;
    }

    public Boolean getCheckForUpdate() {
        return this.checkForUpdate;
    }

    public Date getLastChange() {
        return this.lastChange;
    }

    public SystemSoftwareUpdateState getUpdateState() {
        return this.updateState;
    }

    public SystemSoftwareUpdateVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        DeviceSoftwareUpdate deviceSoftwareUpdate = this.bridgeSoftwareUpdate;
        int iHashCode = (deviceSoftwareUpdate != null ? deviceSoftwareUpdate.hashCode() : 0) * 31;
        SystemSoftwareUpdateState systemSoftwareUpdateState = this.updateState;
        int iHashCode2 = (iHashCode + (systemSoftwareUpdateState != null ? systemSoftwareUpdateState.hashCode() : 0)) * 31;
        Boolean bool = this.install;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.checkForUpdate;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Date date = this.lastChange;
        int iHashCode5 = (iHashCode4 + (date != null ? date.hashCode() : 0)) * 31;
        SystemSoftwareUpdateVersion systemSoftwareUpdateVersion = this.version;
        int iHashCode6 = (iHashCode5 + (systemSoftwareUpdateVersion != null ? systemSoftwareUpdateVersion.hashCode() : 0)) * 31;
        SystemSoftwareUpdateAutoInstall systemSoftwareUpdateAutoInstall = this.autoInstall;
        return iHashCode6 + (systemSoftwareUpdateAutoInstall != null ? systemSoftwareUpdateAutoInstall.hashCode() : 0);
    }

    public void setAutoInstall(SystemSoftwareUpdateAutoInstall systemSoftwareUpdateAutoInstall) {
        this.autoInstall = systemSoftwareUpdateAutoInstall;
    }

    public void setCheckForUpdate(Boolean bool) {
        this.checkForUpdate = bool;
    }

    public void setInstall(Boolean bool) {
        this.install = bool;
    }
}
