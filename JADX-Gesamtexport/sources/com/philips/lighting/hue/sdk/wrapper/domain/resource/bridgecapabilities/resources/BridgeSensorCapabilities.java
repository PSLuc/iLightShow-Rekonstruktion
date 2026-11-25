package com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BridgeSensorCapabilities extends BridgeResourceCapabilities {
    private Integer[] availableSensorsPerSubType;

    public BridgeSensorCapabilities(long j4) {
        super(j4);
        this.availableSensorsPerSubType = new Integer[SensorSubType.values().length];
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeSensorCapabilities bridgeSensorCapabilities = (BridgeSensorCapabilities) obj;
        Integer[] numArr = this.availableSensorsPerSubType;
        if (numArr == null) {
            if (bridgeSensorCapabilities.availableSensorsPerSubType != null) {
                return false;
            }
        } else if (!Arrays.equals(numArr, bridgeSensorCapabilities.availableSensorsPerSubType)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
    }

    public Integer getAvailableSensorsForSubType(SensorSubType sensorSubType) {
        int value = sensorSubType.getValue();
        Integer[] numArr = this.availableSensorsPerSubType;
        if (value <= numArr.length) {
            return numArr[sensorSubType.getValue()];
        }
        return null;
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
        Integer[] numArr = this.availableSensorsPerSubType;
        return iHashCode + (numArr == null ? 0 : Arrays.hashCode(numArr));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.resources.BridgeResourceCapabilities, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        if (domainType == DomainType.RULE_CAPABILITIES) {
            return true;
        }
        return super.isOfType(domainType);
    }

    public void setAvailableSensorsPerSubType(Integer[] numArr) {
        this.availableSensorsPerSubType = numArr;
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
