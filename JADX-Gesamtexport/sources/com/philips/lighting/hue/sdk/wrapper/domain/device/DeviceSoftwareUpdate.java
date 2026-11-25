package com.philips.lighting.hue.sdk.wrapper.domain.device;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DeviceSoftwareUpdate extends SDKSerializable {
    protected DeviceSoftwareUpdateState updateState = null;
    protected Date lastInstall = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceSoftwareUpdate deviceSoftwareUpdate = (DeviceSoftwareUpdate) obj;
            if (this.updateState != deviceSoftwareUpdate.updateState) {
                return false;
            }
            Date date = this.lastInstall;
            if (date != null) {
                return date.equals(deviceSoftwareUpdate.lastInstall);
            }
            if (deviceSoftwareUpdate.lastInstall == null) {
                return true;
            }
        }
        return false;
    }

    public Date getLastInstall() {
        return this.lastInstall;
    }

    public DeviceSoftwareUpdateState getUpdateState() {
        return this.updateState;
    }

    public int hashCode() {
        DeviceSoftwareUpdateState deviceSoftwareUpdateState = this.updateState;
        int iHashCode = (deviceSoftwareUpdateState != null ? deviceSoftwareUpdateState.hashCode() : 0) * 31;
        Date date = this.lastInstall;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }
}
