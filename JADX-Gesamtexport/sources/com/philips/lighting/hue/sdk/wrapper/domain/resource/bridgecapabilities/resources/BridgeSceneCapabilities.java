package com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public class BridgeSceneCapabilities extends BridgeResourceCapabilities {
    private Integer availableLightStates;

    public BridgeSceneCapabilities(long j4) {
        super(j4);
        this.availableLightStates = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeSceneCapabilities bridgeSceneCapabilities = (BridgeSceneCapabilities) obj;
        Integer num = this.availableLightStates;
        if (num == null) {
            if (bridgeSceneCapabilities.availableLightStates != null) {
                return false;
            }
        } else if (!num.equals(bridgeSceneCapabilities.availableLightStates)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    public Integer getAvailableLightStates() {
        return this.availableLightStates;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.SCENE_CAPABILITIES;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.availableLightStates;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        if (domainType == DomainType.SCENE_CAPABILITIES) {
            return true;
        }
        return super.isOfType(domainType);
    }

    public void setAvailableLightStates(Integer num) {
        this.availableLightStates = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }
}
