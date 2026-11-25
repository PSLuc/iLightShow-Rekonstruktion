package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeviceSearchStatus {
    private List<DeviceInfo> foundDeviceInfo;
    private Boolean active = null;
    private Date lastScan = null;

    public class DeviceInfo {
        private DomainType domainType;
        private byte[] identifier = null;
        private byte[] name = null;

        private DeviceInfo(int i) {
            this.domainType = null;
            this.domainType = DomainType.fromValue(i);
        }

        private void setDomainTypeFromInt(int i) {
            this.domainType = DomainType.fromValue(i);
        }

        public DomainType getDomainType() {
            return this.domainType;
        }

        public String getIdentifier() {
            return NativeTools.BytesToString(this.identifier);
        }

        public String getName() {
            return NativeTools.BytesToString(this.name);
        }
    }

    private DeviceSearchStatus() {
        this.foundDeviceInfo = null;
        this.foundDeviceInfo = new ArrayList();
    }

    private void addFoundDeviceInfo(DeviceInfo deviceInfo) {
        if (this.foundDeviceInfo == null) {
            this.foundDeviceInfo = new ArrayList();
        }
        this.foundDeviceInfo.add(deviceInfo);
    }

    public Boolean getActive() {
        return this.active;
    }

    public List<DeviceInfo> getFoundDeviceInfo() {
        return this.foundDeviceInfo;
    }

    public Date getLastScan() {
        return this.lastScan;
    }
}
