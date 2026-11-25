package com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public class BridgeRuleCapabilities extends BridgeResourceCapabilities {
    private Integer availableActions;
    private Integer availableConditions;

    public BridgeRuleCapabilities(long j4) {
        super(j4);
        this.availableConditions = null;
        this.availableActions = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeRuleCapabilities bridgeRuleCapabilities = (BridgeRuleCapabilities) obj;
        Integer num = this.availableConditions;
        if (num == null) {
            if (bridgeRuleCapabilities.availableConditions != null) {
                return false;
            }
        } else if (!num.equals(bridgeRuleCapabilities.availableConditions)) {
            return false;
        }
        Integer num2 = this.availableActions;
        if (num2 == null) {
            if (bridgeRuleCapabilities.availableActions != null) {
                return false;
            }
        } else if (!num2.equals(bridgeRuleCapabilities.availableActions)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    public Integer getAvailableActions() {
        return this.availableActions;
    }

    public Integer getAvailableConditions() {
        return this.availableConditions;
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
        return DomainType.RULE_CAPABILITIES;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.availableConditions;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.availableActions;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        if (domainType == DomainType.RULE_CAPABILITIES) {
            return true;
        }
        return super.isOfType(domainType);
    }

    public void setAvailableActions(Integer num) {
        this.availableActions = num;
    }

    public void setAvailableConditions(Integer num) {
        this.availableConditions = num;
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
