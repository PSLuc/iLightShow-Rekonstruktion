package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.Alert;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SensorConfiguration extends SDKSerializable implements DeviceConfiguration {
    protected Alert alert;
    protected Integer battery;
    protected Boolean ledIndication;
    protected byte[] manufacturerName;
    protected byte[] modelIdentifier;
    protected byte[] name;
    protected Boolean on;
    protected byte[][] pending;
    protected Boolean reachable;
    protected Boolean recycle;
    protected DomainType sensorType;
    protected byte[] swVersion;
    protected byte[] uniqueId;
    protected byte[] url;
    protected Boolean usertest;

    public SensorConfiguration(DomainType domainType) {
        this.alert = null;
        this.pending = null;
        this.sensorType = domainType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensorConfiguration sensorConfiguration = (SensorConfiguration) obj;
        if (this.alert != sensorConfiguration.alert) {
            return false;
        }
        Integer num = this.battery;
        if (num == null) {
            if (sensorConfiguration.battery != null) {
                return false;
            }
        } else if (!num.equals(sensorConfiguration.battery)) {
            return false;
        }
        byte[] bArr = this.manufacturerName;
        if (bArr == null) {
            if (sensorConfiguration.manufacturerName != null) {
                return false;
            }
        } else if (!bArr.equals(sensorConfiguration.manufacturerName)) {
            return false;
        }
        byte[] bArr2 = this.modelIdentifier;
        if (bArr2 == null) {
            if (sensorConfiguration.modelIdentifier != null) {
                return false;
            }
        } else if (!bArr2.equals(sensorConfiguration.modelIdentifier)) {
            return false;
        }
        byte[] bArr3 = this.name;
        if (bArr3 == null) {
            if (sensorConfiguration.name != null) {
                return false;
            }
        } else if (!bArr3.equals(sensorConfiguration.name)) {
            return false;
        }
        Boolean bool = this.on;
        if (bool == null) {
            if (sensorConfiguration.on != null) {
                return false;
            }
        } else if (!bool.equals(sensorConfiguration.on)) {
            return false;
        }
        Boolean bool2 = this.reachable;
        if (bool2 == null) {
            if (sensorConfiguration.reachable != null) {
                return false;
            }
        } else if (!bool2.equals(sensorConfiguration.reachable)) {
            return false;
        }
        Boolean bool3 = this.recycle;
        if (bool3 == null) {
            if (sensorConfiguration.recycle != null) {
                return false;
            }
        } else if (!bool3.equals(sensorConfiguration.recycle)) {
            return false;
        }
        if (this.sensorType != sensorConfiguration.sensorType) {
            return false;
        }
        byte[] bArr4 = this.swVersion;
        if (bArr4 == null) {
            if (sensorConfiguration.swVersion != null) {
                return false;
            }
        } else if (!bArr4.equals(sensorConfiguration.swVersion)) {
            return false;
        }
        byte[] bArr5 = this.uniqueId;
        if (bArr5 == null) {
            if (sensorConfiguration.uniqueId != null) {
                return false;
            }
        } else if (!bArr5.equals(sensorConfiguration.uniqueId)) {
            return false;
        }
        byte[] bArr6 = this.url;
        if (bArr6 == null) {
            if (sensorConfiguration.url != null) {
                return false;
            }
        } else if (!bArr6.equals(sensorConfiguration.url)) {
            return false;
        }
        Boolean bool4 = this.usertest;
        if (bool4 == null) {
            if (sensorConfiguration.usertest != null) {
                return false;
            }
        } else if (!bool4.equals(sensorConfiguration.usertest)) {
            return false;
        }
        byte[][] bArr7 = this.pending;
        if (bArr7 == null) {
            if (sensorConfiguration.pending != null) {
                return false;
            }
        } else if (!bArr7.equals(sensorConfiguration.pending)) {
            return false;
        }
        Boolean bool5 = this.ledIndication;
        if (bool5 == null) {
            if (sensorConfiguration.ledIndication != null) {
                return false;
            }
        } else if (!bool5.equals(sensorConfiguration.ledIndication)) {
            return false;
        }
        return true;
    }

    public Alert getAlert() {
        return this.alert;
    }

    public Integer getBattery() {
        return this.battery;
    }

    public Boolean getLedIndication() {
        return this.ledIndication;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getManufacturerName() {
        return NativeTools.BytesToString(this.manufacturerName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getModelIdentifier() {
        return NativeTools.BytesToString(this.modelIdentifier);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public Boolean getOn() {
        return this.on;
    }

    public List<String> getPending() {
        if (this.pending == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.pending) {
            arrayList.add(NativeTools.BytesToString(bArr));
        }
        return arrayList;
    }

    public Boolean getReachable() {
        return this.reachable;
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getSwVersion() {
        return NativeTools.BytesToString(this.swVersion);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public DomainType getType() {
        return this.sensorType;
    }

    public int getTypeAsInt() {
        DomainType domainType = this.sensorType;
        return domainType != null ? domainType.getValue() : DomainType.UNKNOWN.getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getUniqueIdentifier() {
        return NativeTools.BytesToString(this.uniqueId);
    }

    public String getUrl() {
        return NativeTools.BytesToString(this.url);
    }

    public Boolean getUsertest() {
        return this.usertest;
    }

    public int hashCode() {
        Alert alert = this.alert;
        int iHashCode = ((alert == null ? 0 : alert.hashCode()) + 31) * 31;
        Integer num = this.battery;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        byte[] bArr = this.manufacturerName;
        int iHashCode3 = (iHashCode2 + (bArr == null ? 0 : bArr.hashCode())) * 31;
        byte[] bArr2 = this.modelIdentifier;
        int iHashCode4 = (iHashCode3 + (bArr2 == null ? 0 : bArr2.hashCode())) * 31;
        byte[] bArr3 = this.name;
        int iHashCode5 = (iHashCode4 + (bArr3 == null ? 0 : bArr3.hashCode())) * 31;
        Boolean bool = this.on;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.reachable;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.recycle;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DomainType domainType = this.sensorType;
        int iHashCode9 = (iHashCode8 + (domainType == null ? 0 : domainType.hashCode())) * 31;
        byte[] bArr4 = this.swVersion;
        int iHashCode10 = (iHashCode9 + (bArr4 == null ? 0 : bArr4.hashCode())) * 31;
        byte[] bArr5 = this.uniqueId;
        int iHashCode11 = (iHashCode10 + (bArr5 == null ? 0 : bArr5.hashCode())) * 31;
        byte[] bArr6 = this.url;
        int iHashCode12 = (iHashCode11 + (bArr6 == null ? 0 : bArr6.hashCode())) * 31;
        Boolean bool4 = this.usertest;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        byte[][] bArr7 = this.pending;
        int iHashCode14 = (iHashCode13 + (bArr7 == null ? 0 : bArr7.hashCode())) * 31;
        Boolean bool5 = this.ledIndication;
        return iHashCode14 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public boolean isOfType(DomainType domainType) {
        return domainType == getType() || domainType == DomainType.SENSOR_CONFIGURATION;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public void setBattery(Integer num) {
        this.battery = num;
    }

    public void setLedIndication(Boolean bool) {
        this.ledIndication = bool;
    }

    public void setManufacturerName(String str) {
        this.manufacturerName = NativeTools.StringToBytes(str);
    }

    public void setModelIdentifier(String str) {
        this.modelIdentifier = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setOn(Boolean bool) {
        this.on = bool;
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setSwVersion(String str) {
        this.swVersion = NativeTools.StringToBytes(str);
    }

    public void setUniqueIdentifier(String str) {
        this.uniqueId = NativeTools.StringToBytes(str);
    }

    public void setUrl(String str) {
        this.url = NativeTools.StringToBytes(str);
    }

    public void setUsertest(Boolean bool) {
        this.usertest = bool;
    }

    public SensorConfiguration(DomainType domainType, SensorConfiguration sensorConfiguration) {
        this(domainType);
        this.name = sensorConfiguration.name;
        this.modelIdentifier = sensorConfiguration.modelIdentifier;
        this.swVersion = sensorConfiguration.swVersion;
        this.manufacturerName = sensorConfiguration.manufacturerName;
        this.uniqueId = sensorConfiguration.uniqueId;
        this.recycle = sensorConfiguration.recycle;
        this.on = sensorConfiguration.on;
        this.reachable = sensorConfiguration.reachable;
        this.battery = sensorConfiguration.battery;
        this.alert = sensorConfiguration.alert;
        this.usertest = sensorConfiguration.usertest;
        this.url = sensorConfiguration.url;
        this.pending = sensorConfiguration.pending;
        this.ledIndication = sensorConfiguration.ledIndication;
    }

    public SensorConfiguration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SensorConfiguration(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Alert alert, Boolean bool4, String str6, Boolean bool5) {
        this(DomainType.SENSOR);
        setName(str);
        setModelIdentifier(str2);
        setSwVersion(str3);
        setManufacturerName(str4);
        setUniqueIdentifier(str5);
        this.recycle = bool;
        this.on = bool2;
        this.reachable = bool3;
        this.battery = num;
        this.alert = alert;
        this.usertest = bool4;
        setUrl(str6);
        this.ledIndication = bool5;
    }
}
