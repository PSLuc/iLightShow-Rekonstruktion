package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import java.util.Date;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class WhitelistEntry extends SessionObject implements BridgeResource {
    private byte[] appName;
    private Date created;
    private byte[] deviceName;
    private byte[] identifier;
    private Date lastUsed;
    private byte[] name;

    public WhitelistEntry(long j4) {
        super(j4);
        this.identifier = null;
        this.name = null;
        this.appName = null;
        this.deviceName = null;
        this.created = null;
        this.lastUsed = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        WhitelistEntry whitelistEntry = (WhitelistEntry) obj;
        if (!Arrays.equals(this.appName, whitelistEntry.appName)) {
            return false;
        }
        Date date = this.created;
        if (date == null) {
            if (whitelistEntry.created != null) {
                return false;
            }
        } else if (!date.equals(whitelistEntry.created)) {
            return false;
        }
        if (!Arrays.equals(this.deviceName, whitelistEntry.deviceName) || !Arrays.equals(this.identifier, whitelistEntry.identifier)) {
            return false;
        }
        Date date2 = this.lastUsed;
        if (date2 == null) {
            if (whitelistEntry.lastUsed != null) {
                return false;
            }
        } else if (!date2.equals(whitelistEntry.lastUsed)) {
            return false;
        }
        return Arrays.equals(this.name, whitelistEntry.name);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_SUPPORTED);
    }

    public String getAppName() {
        return NativeTools.BytesToString(this.appName);
    }

    public Date getCreated() {
        return this.created;
    }

    public String getDeviceName() {
        return NativeTools.BytesToString(this.deviceName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public Date getLastUsed() {
        return this.lastUsed;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.WHITELIST_ENTRY;
    }

    public String getUserName() {
        return NativeTools.BytesToString(this.identifier);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iN = k.n(this.appName, super.hashCode() * 31, 31);
        Date date = this.created;
        int iN2 = k.n(this.identifier, k.n(this.deviceName, (iN + (date == null ? 0 : date.hashCode())) * 31, 31), 31);
        Date date2 = this.lastUsed;
        return Arrays.hashCode(this.name) + ((iN2 + (date2 != null ? date2.hashCode() : 0)) * 31);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    public void setAppName(String str) {
        this.appName = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
    }

    public void setCreated(Date date) {
        this.created = date;
    }

    public void setDeviceName(String str) {
        this.deviceName = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.identifier = NativeTools.StringToBytes(str);
    }

    public void setLastUsed(Date date) {
        this.lastUsed = date;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_SUPPORTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public WhitelistEntry() {
        this.identifier = null;
        this.name = null;
        this.appName = null;
        this.deviceName = null;
        this.created = null;
        this.lastUsed = null;
    }
}
