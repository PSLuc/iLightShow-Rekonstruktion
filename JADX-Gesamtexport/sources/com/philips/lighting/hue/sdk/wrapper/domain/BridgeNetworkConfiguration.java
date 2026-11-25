package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class BridgeNetworkConfiguration {
    private Integer zigbeeChannel = null;
    private byte[] mac = null;
    private Boolean dhcp = null;
    private byte[] ipAddress = null;
    private byte[] netmask = null;
    private byte[] gateway = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeNetworkConfiguration bridgeNetworkConfiguration = (BridgeNetworkConfiguration) obj;
        Boolean bool = this.dhcp;
        if (bool == null) {
            if (bridgeNetworkConfiguration.dhcp != null) {
                return false;
            }
        } else if (!bool.equals(bridgeNetworkConfiguration.dhcp)) {
            return false;
        }
        if (!Arrays.equals(this.gateway, bridgeNetworkConfiguration.gateway) || !Arrays.equals(this.ipAddress, bridgeNetworkConfiguration.ipAddress) || !Arrays.equals(this.mac, bridgeNetworkConfiguration.mac) || !Arrays.equals(this.netmask, bridgeNetworkConfiguration.netmask)) {
            return false;
        }
        Integer num = this.zigbeeChannel;
        if (num == null) {
            if (bridgeNetworkConfiguration.zigbeeChannel != null) {
                return false;
            }
        } else if (!num.equals(bridgeNetworkConfiguration.zigbeeChannel)) {
            return false;
        }
        return true;
    }

    public Boolean getDhcp() {
        return this.dhcp;
    }

    public String getGateway() {
        return NativeTools.BytesToString(this.gateway);
    }

    public String getIpAddress() {
        return NativeTools.BytesToString(this.ipAddress);
    }

    public String getMac() {
        return NativeTools.BytesToString(this.mac);
    }

    public String getNetmask() {
        return NativeTools.BytesToString(this.netmask);
    }

    public Integer getZigbeeChannel() {
        return this.zigbeeChannel;
    }

    public int hashCode() {
        Boolean bool = this.dhcp;
        int iN = k.n(this.netmask, k.n(this.mac, k.n(this.ipAddress, k.n(this.gateway, ((bool == null ? 0 : bool.hashCode()) + 31) * 31, 31), 31), 31), 31);
        Integer num = this.zigbeeChannel;
        return iN + (num != null ? num.hashCode() : 0);
    }

    public void setDhcp(Boolean bool) {
        this.dhcp = bool;
    }

    public void setGateway(String str) {
        this.gateway = NativeTools.StringToBytes(str);
    }

    public void setIpAddress(String str) {
        this.ipAddress = NativeTools.StringToBytes(str);
    }

    public void setNetmask(String str) {
        this.netmask = NativeTools.StringToBytes(str);
    }

    public void setZigbeeChannel(Integer num) {
        this.zigbeeChannel = num;
    }

    public void setDhcp(boolean z5) {
        this.dhcp = new Boolean(z5);
    }

    public void setZigbeeChannel(int i) {
        this.zigbeeChannel = new Integer(i);
    }
}
