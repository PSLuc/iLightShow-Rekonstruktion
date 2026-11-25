package com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BridgeCapabilities extends SessionObject implements BridgeResource {
    private Map<DomainType, BridgeResourceCapabilities> resourceCapabilities;

    public BridgeCapabilities(long j4) {
        super(j4);
        this.resourceCapabilities = null;
        this.resourceCapabilities = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    public void addResourceCapabilities(int i, BridgeResourceCapabilities bridgeResourceCapabilities) {
        this.resourceCapabilities.put(DomainType.fromValue(i), bridgeResourceCapabilities);
    }

    public void clearResourceCapabilities() {
        this.resourceCapabilities.clear();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeCapabilities bridgeCapabilities = (BridgeCapabilities) obj;
        Map<DomainType, BridgeResourceCapabilities> map = this.resourceCapabilities;
        if (map == null) {
            if (bridgeCapabilities.resourceCapabilities != null) {
                return false;
            }
        } else if (!map.equals(bridgeCapabilities.resourceCapabilities)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return new String("0");
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return null;
    }

    public Map<DomainType, BridgeResourceCapabilities> getResourceCapabilities() {
        return this.resourceCapabilities;
    }

    public BridgeResourceCapabilities getResourceCapabilitiesForDomainType(DomainType domainType) {
        return this.resourceCapabilities.get(domainType);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.CAPABILITIES;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Map<DomainType, BridgeResourceCapabilities> map = this.resourceCapabilities;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.BridgeCapabilities.1
                @Override // java.lang.Runnable
                public void run() {
                    BridgeCapabilities.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }
}
