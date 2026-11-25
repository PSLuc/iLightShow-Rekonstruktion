package com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class BridgeResourceCapabilities extends SessionObject implements BridgeResource {
    private Integer availableResources;
    private Date lastUpdated;

    public BridgeResourceCapabilities(long j4) {
        super(j4);
        this.availableResources = null;
        this.lastUpdated = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeResourceCapabilities bridgeResourceCapabilities = (BridgeResourceCapabilities) obj;
        Integer num = this.availableResources;
        if (num == null) {
            if (bridgeResourceCapabilities.availableResources != null) {
                return false;
            }
        } else if (!num.equals(bridgeResourceCapabilities.availableResources)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    public Integer getAvailableResources() {
        return this.availableResources;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return null;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.RESOURCE_CAPABILITIES;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.availableResources;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    public void setAvailableResources(Integer num) {
        this.availableResources = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
    }

    public void setLastUpdated(Date date) {
        this.lastUpdated = date;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }
}
