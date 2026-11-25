package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceSoftwareUpdate;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;

/* JADX INFO: loaded from: classes.dex */
public class Sensor extends SessionObject implements Device {
    protected DeviceInfo deviceInfo;
    protected DeviceSoftwareUpdate deviceSoftwareUpdate;
    protected byte[] identifier;
    protected SensorConfiguration sensorConfiguration;
    protected DomainType sensorDomainType;
    protected SensorState sensorState;
    protected SensorSubType sensorSubType;
    protected byte[] sensorType;

    public Sensor() {
        this.identifier = null;
        this.sensorDomainType = null;
        this.sensorType = null;
        this.sensorSubType = null;
        this.sensorState = null;
        this.sensorConfiguration = null;
        this.deviceSoftwareUpdate = null;
        this.deviceInfo = null;
        this.sensorDomainType = DomainType.SENSOR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private void setSensorSubTypeFromInt(int i) {
        this.sensorSubType = SensorSubType.fromValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int updateConfigurationNative(DeviceConfiguration deviceConfiguration, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public native int updateStateNative(DeviceState deviceState, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        Sensor sensor = (Sensor) obj;
        byte[] bArr = this.identifier;
        if (bArr == null) {
            if (sensor.identifier != null) {
                return false;
            }
        } else if (!bArr.equals(sensor.identifier)) {
            return false;
        }
        SensorConfiguration sensorConfiguration = this.sensorConfiguration;
        if (sensorConfiguration == null) {
            if (sensor.sensorConfiguration != null) {
                return false;
            }
        } else if (!sensorConfiguration.equals(sensor.sensorConfiguration)) {
            return false;
        }
        if (this.sensorDomainType != sensor.sensorDomainType) {
            return false;
        }
        SensorState sensorState = this.sensorState;
        if (sensorState == null) {
            if (sensor.sensorState != null) {
                return false;
            }
        } else if (!sensorState.equals(sensor.sensorState)) {
            return false;
        }
        return this.sensorSubType == sensor.sensorSubType;
    }

    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceConfiguration getConfiguration() {
        return this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceSoftwareUpdate getDeviceSoftwareUpdate() {
        return this.deviceSoftwareUpdate;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getTypeAsInt();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceInfo getInfo() {
        return this.deviceInfo;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public String getName() {
        SensorConfiguration sensorConfiguration = this.sensorConfiguration;
        if (sensorConfiguration != null) {
            return sensorConfiguration.getName();
        }
        return null;
    }

    public SensorConfiguration getSensorConfiguration() {
        return this.sensorConfiguration;
    }

    public SensorState getSensorState() {
        return this.sensorState;
    }

    public SensorSubType getSensorSubType() {
        return this.sensorSubType;
    }

    public String getSensorType() {
        return NativeTools.BytesToString(this.sensorType);
    }

    public DeviceState getState() {
        return this.sensorState;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return this.sensorDomainType;
    }

    public int getTypeAsInt() {
        DomainType domainType = this.sensorDomainType;
        return domainType != null ? domainType.getValue() : DomainType.UNKNOWN.getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        byte[] bArr = this.identifier;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : bArr.hashCode())) * 31;
        SensorConfiguration sensorConfiguration = this.sensorConfiguration;
        int iHashCode3 = (iHashCode2 + (sensorConfiguration == null ? 0 : sensorConfiguration.hashCode())) * 31;
        DomainType domainType = this.sensorDomainType;
        int iHashCode4 = (iHashCode3 + (domainType == null ? 0 : domainType.hashCode())) * 31;
        SensorState sensorState = this.sensorState;
        int iHashCode5 = (iHashCode4 + (sensorState == null ? 0 : sensorState.hashCode())) * 31;
        SensorSubType sensorSubType = this.sensorSubType;
        return iHashCode5 + (sensorSubType != null ? sensorSubType.hashCode() : 0);
    }

    public boolean isOfType(DomainType domainType) {
        return domainType == getType() || domainType == DomainType.SENSOR || domainType == DomainType.DEVICE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
        setSessionKey(((SessionObject) bridge).getSessionKey());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        HueLog.w("Sensor", "Warning! Changing the identifier on a sensor can have strange effects!");
        this.identifier = NativeTools.StringToBytes(str);
    }

    public void setSensorConfiguration(SensorConfiguration sensorConfiguration) {
        if (sensorConfiguration == null || isOfType(sensorConfiguration.getType())) {
            this.sensorConfiguration = sensorConfiguration;
        }
    }

    public void setSensorState(SensorState sensorState) {
        if (sensorState == null || isOfType(sensorState.getType())) {
            this.sensorState = sensorState;
        }
    }

    public void setSensorSubType(SensorSubType sensorSubType) {
        this.sensorSubType = sensorSubType;
    }

    public void setSensorType(String str) {
        this.sensorType = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateConfiguration(deviceConfiguration, bridgeConnectionType, bridgeResponseCallback, true);
    }

    public void updateState(DeviceState deviceState, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateState(deviceState, bridgeConnectionType, bridgeResponseCallback, true);
    }

    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor.3
                @Override // java.lang.Runnable
                public void run() {
                    Sensor.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(final DeviceConfiguration deviceConfiguration, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
            return;
        }
        if (deviceConfiguration == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NULL_PARAMETER);
        } else if (SensorConfiguration.class.isAssignableFrom(deviceConfiguration.getClass())) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor.2
                @Override // java.lang.Runnable
                public void run() {
                    Sensor.this.updateConfigurationNative(deviceConfiguration, bridgeConnectionType.getValue(), bridgeResponseCallback, z5);
                }
            });
        } else {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.WRONG_PARAMETER);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(final DeviceState deviceState, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
            return;
        }
        if (deviceState == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NULL_PARAMETER);
        } else if (SensorState.class.isAssignableFrom(deviceState.getClass())) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor.1
                @Override // java.lang.Runnable
                public void run() {
                    ReturnCode.fromValue(Sensor.this.updateStateNative(deviceState, bridgeConnectionType.getValue(), bridgeResponseCallback, z5));
                }
            });
        } else {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.WRONG_PARAMETER);
        }
    }

    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeResponseCallback bridgeResponseCallback) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public void updateState(DeviceState deviceState, BridgeResponseCallback bridgeResponseCallback) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeResponseCallback bridgeResponseCallback, boolean z5) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback, z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeResponseCallback bridgeResponseCallback, boolean z5) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback, z5);
    }

    public void updateConfiguration(DeviceConfiguration deviceConfiguration) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    public void updateState(DeviceState deviceState) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, boolean z5) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, null, z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, boolean z5) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, null, z5);
    }

    public Sensor(long j4) {
        super(j4);
        this.identifier = null;
        this.sensorDomainType = null;
        this.sensorType = null;
        this.sensorSubType = null;
        this.sensorState = null;
        this.sensorConfiguration = null;
        this.deviceSoftwareUpdate = null;
        this.deviceInfo = null;
        this.sensorDomainType = DomainType.SENSOR;
        this.sensorSubType = SensorSubType.UNKNOWN;
    }

    public Sensor(DomainType domainType) {
        this.identifier = null;
        this.sensorType = null;
        this.sensorSubType = null;
        this.sensorState = null;
        this.sensorConfiguration = null;
        this.deviceSoftwareUpdate = null;
        this.deviceInfo = null;
        this.sensorDomainType = domainType;
    }

    public Sensor(DomainType domainType, long j4) {
        super(j4);
        this.identifier = null;
        this.sensorType = null;
        this.sensorSubType = null;
        this.sensorState = null;
        this.sensorConfiguration = null;
        this.deviceSoftwareUpdate = null;
        this.deviceInfo = null;
        this.sensorDomainType = domainType;
    }
}
