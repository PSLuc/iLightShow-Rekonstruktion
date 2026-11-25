package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompoundSensor extends Sensor implements CompoundDevice {
    private boolean complete;
    private List<Sensor> sensors;

    public CompoundSensor(int i, long j4) {
        super(DomainType.fromValue(i), j4);
        this.sensors = null;
        this.complete = true;
    }

    public void addSensor(Sensor sensor) {
        initSensors();
        this.sensors.add(sensor);
    }

    public void clearSensors() {
        List<Sensor> list = this.sensors;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        CompoundSensor compoundSensor = (CompoundSensor) obj;
        if (this.complete != compoundSensor.complete) {
            return false;
        }
        List<Sensor> list = this.sensors;
        if (list == null) {
            if (compoundSensor.sensors != null) {
                return false;
            }
        } else if (!list.equals(compoundSensor.sensors)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_SUPPORTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public Device getDevice(DomainType domainType, String str) {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOfType(domainType) && sensor.getIdentifier() != null && sensor.getIdentifier().equals(str)) {
                return sensor;
            }
        }
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public List<Device> getDevices() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.sensors);
        return arrayList;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor
    public SensorState getSensorState() {
        return null;
    }

    public Sensor[] getSensorsArray() {
        Sensor[] sensorArr = new Sensor[this.sensors.size()];
        for (int i = 0; i < this.sensors.size(); i++) {
            sensorArr[i] = this.sensors.get(i);
        }
        return sensorArr;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceState getState() {
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.complete ? 1231 : 1237)) * 31;
        List<Sensor> list = this.sensors;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public void initSensors() {
        if (this.sensors == null) {
            this.sensors = new ArrayList();
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public boolean isComplete() {
        return this.complete;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return super.isOfType(domainType) || domainType == DomainType.COMPOUND_DEVICE || domainType == DomainType.COMPOUND_SENSOR;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_SUPPORTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_IMPLEMENTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_IMPLEMENTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.CompoundDevice
    public List<Device> getDevices(DomainType domainType) {
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : this.sensors) {
            if (sensor.isOfType(domainType)) {
                arrayList.add(sensor);
            }
        }
        return arrayList;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_IMPLEMENTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_IMPLEMENTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }
}
