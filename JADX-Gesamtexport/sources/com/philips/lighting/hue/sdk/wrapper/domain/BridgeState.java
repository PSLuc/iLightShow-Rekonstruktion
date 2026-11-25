package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateCacheType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedEvent;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightSource;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.MultiSourceLuminaire;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.CompoundSensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Group;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.ResourceLink;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Scene;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.TimeZones;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Timer;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.WhitelistEntry;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.bridgecapabilities.BridgeCapabilities;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.rule.Rule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BridgeState extends SessionObject implements DeviceState {
    private static final String TAG = "BridgeState";
    private BridgeStateUpdatedCallback bridgeStateUpdatedCallback;
    private BridgeConfiguration config;
    private Map<DomainType, Map<DomainType, Map<String, Device>>> deviceMap;
    private Object deviceMapLock;
    private Map<DomainType, Map<String, BridgeResource>> resourceMap;
    private Object resourceMapLock;
    private List<BridgeStateUpdatedCallback> updatedCallbacks;
    private Object updatedCallbacksLock;

    private BridgeState(long j4) {
        super(j4);
        this.bridgeStateUpdatedCallback = new BridgeStateUpdatedCallback() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeState.1
            @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback
            public void onBridgeStateUpdated(Bridge bridge, BridgeStateUpdatedEvent bridgeStateUpdatedEvent) {
                synchronized (BridgeState.this.updatedCallbacksLock) {
                    try {
                        if (BridgeState.this.updatedCallbacks != null) {
                            Iterator it = BridgeState.this.updatedCallbacks.iterator();
                            while (it.hasNext()) {
                                ((BridgeStateUpdatedCallback) it.next()).onBridgeStateUpdated(bridge, bridgeStateUpdatedEvent);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.config = null;
        this.deviceMap = null;
        this.resourceMap = null;
        this.updatedCallbacks = null;
        this.deviceMapLock = new Object();
        this.resourceMapLock = new Object();
        this.updatedCallbacksLock = new Object();
        this.deviceMap = new HashMap();
        this.resourceMap = new HashMap();
    }

    private native int refreshNative(int i, int i3);

    private native void setUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback);

    public void addBridgeDevices(Device[] deviceArr, int i) {
        DomainType domainTypeFromValue = DomainType.fromValue(i);
        HashMap map = new HashMap();
        for (Device device : deviceArr) {
            if (device != null) {
                DomainType type = device.getType();
                DomainType superType = DomainType.LIGHT_POINT;
                if (type != superType) {
                    superType = type.getSuperType();
                }
                if (superType != domainTypeFromValue) {
                    HueLog.e("HueSDK", "addBridgeDevices: Domain object " + device.getIdentifier() + " of type " + superType + " does not match expected type " + domainTypeFromValue);
                } else {
                    if (!map.containsKey(type)) {
                        map.put(type, new HashMap());
                    }
                    ((Map) map.get(type)).put(device.getIdentifier(), device);
                }
            }
        }
        synchronized (this.deviceMapLock) {
            this.deviceMap.put(domainTypeFromValue, map);
        }
    }

    public void addBridgeResources(BridgeResource[] bridgeResourceArr, int i) {
        DomainType domainTypeFromValue = DomainType.fromValue(i);
        HashMap map = new HashMap();
        for (BridgeResource bridgeResource : bridgeResourceArr) {
            if (bridgeResource != null) {
                DomainType type = bridgeResource.getType();
                if (type != domainTypeFromValue) {
                    HueLog.e("HueSDK", "addBridgeResources: Domain object " + bridgeResource.getIdentifier() + " of type " + type + " does not match expected type " + domainTypeFromValue);
                } else {
                    map.put(bridgeResource.getIdentifier(), bridgeResource);
                }
            }
        }
        synchronized (this.resourceMapLock) {
            this.resourceMap.put(domainTypeFromValue, map);
        }
    }

    public void addUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        if (bridgeStateUpdatedCallback != null) {
            synchronized (this.updatedCallbacksLock) {
                try {
                    if (this.updatedCallbacks == null) {
                        this.updatedCallbacks = new CopyOnWriteArrayList();
                        setUpdatedCallback(this.bridgeStateUpdatedCallback);
                    }
                    this.updatedCallbacks.add(bridgeStateUpdatedCallback);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeState bridgeState = (BridgeState) obj;
        BridgeConfiguration bridgeConfiguration = this.config;
        if (bridgeConfiguration == null) {
            if (bridgeState.config != null) {
                return false;
            }
        } else if (!bridgeConfiguration.equals(bridgeState.config)) {
            return false;
        }
        Map<DomainType, Map<DomainType, Map<String, Device>>> map = this.deviceMap;
        if (map == null) {
            if (bridgeState.deviceMap != null) {
                return false;
            }
        } else if (!map.equals(bridgeState.deviceMap)) {
            return false;
        }
        Map<DomainType, Map<String, BridgeResource>> map2 = this.resourceMap;
        if (map2 == null) {
            if (bridgeState.resourceMap != null) {
                return false;
            }
        } else if (!map2.equals(bridgeState.resourceMap)) {
            return false;
        }
        return true;
    }

    public BridgeConfiguration getBridgeConfiguration() {
        return this.config;
    }

    public BridgeCapabilities getCapabilities() {
        return (BridgeCapabilities) getResource(DomainType.CAPABILITIES, new String("0"));
    }

    public Device getDevice(DomainType domainType, String str) {
        Device device;
        Device device2;
        if (str == null) {
            return null;
        }
        if (domainType == DomainType.LIGHT_SOURCE) {
            Iterator<MultiSourceLuminaire> it = getMultiSourceLuminaires().iterator();
            while (it.hasNext()) {
                Device device3 = it.next().getDevice(domainType, str);
                if (device3 != null) {
                    return device3;
                }
            }
        } else {
            DomainType domainType2 = DomainType.LIGHT_POINT;
            if (domainType == domainType2) {
                Device deviceWithSuperType = getDeviceWithSuperType(domainType2, domainType2, str);
                if (deviceWithSuperType != null) {
                    return deviceWithSuperType;
                }
                for (MultiSourceLuminaire multiSourceLuminaire : getMultiSourceLuminaires()) {
                    if (multiSourceLuminaire != null && str.equals(multiSourceLuminaire.getIdentifier())) {
                        return multiSourceLuminaire;
                    }
                    Iterator<Device> it2 = multiSourceLuminaire.getDevices().iterator();
                    while (it2.hasNext()) {
                        LightSource lightSource = (LightSource) it2.next();
                        if (lightSource != null && str.equals(lightSource.getIdentifier())) {
                            return lightSource;
                        }
                        Device device4 = lightSource.getDevice(domainType, str);
                        if (device4 != null) {
                            return device4;
                        }
                    }
                }
            } else {
                DomainType domainType3 = DomainType.SENSOR;
                if (domainType == domainType3) {
                    for (Sensor sensor : getSensors()) {
                        if (sensor.getIdentifier().equals(str)) {
                            return sensor;
                        }
                    }
                    Iterator<Device> it3 = getDevices(DomainType.COMPOUND_SENSOR).iterator();
                    while (it3.hasNext()) {
                        CompoundSensor compoundSensor = (CompoundSensor) it3.next();
                        if (compoundSensor != null && (device2 = compoundSensor.getDevice(domainType, str)) != null) {
                            return device2;
                        }
                    }
                } else if (domainType.getSuperType() == domainType3) {
                    Device deviceWithSuperType2 = getDeviceWithSuperType(domainType.getSuperType(), domainType, str);
                    if (deviceWithSuperType2 != null) {
                        return deviceWithSuperType2;
                    }
                    Iterator<Device> it4 = getDevices(DomainType.COMPOUND_SENSOR).iterator();
                    while (it4.hasNext()) {
                        CompoundSensor compoundSensor2 = (CompoundSensor) it4.next();
                        if (compoundSensor2 != null && (device = compoundSensor2.getDevice(domainType, str)) != null) {
                            return device;
                        }
                    }
                } else {
                    DomainType superType = domainType.getSuperType();
                    if (superType != DomainType.UNKNOWN) {
                        Device deviceWithSuperType3 = getDeviceWithSuperType(superType, domainType, str);
                        if (deviceWithSuperType3 != null) {
                            return deviceWithSuperType3;
                        }
                    } else {
                        HueLog.e(TAG, "Cannot resolve superType for domain type " + domainType);
                    }
                }
            }
        }
        return getDeviceByUniqueIdentifier(domainType, str);
    }

    public Device getDeviceByUniqueIdentifier(DomainType domainType, String str) {
        if (domainType != DomainType.LIGHT_POINT) {
            if (domainType != DomainType.LIGHT_SOURCE) {
                for (Device device : getDevices(domainType)) {
                    if (device != null && device.getConfiguration() != null && str.equals(device.getConfiguration().getUniqueIdentifier())) {
                        return device;
                    }
                }
                return null;
            }
            for (MultiSourceLuminaire multiSourceLuminaire : getMultiSourceLuminaires()) {
                if (multiSourceLuminaire != null) {
                    if (multiSourceLuminaire.getConfiguration() != null && str.equals(multiSourceLuminaire.getConfiguration().getUniqueIdentifier())) {
                        return multiSourceLuminaire;
                    }
                    for (Device device2 : multiSourceLuminaire.getDevices(DomainType.LIGHT_SOURCE)) {
                        if (device2 != null && device2.getConfiguration() != null && str.equals(device2.getConfiguration().getUniqueIdentifier())) {
                            return device2;
                        }
                    }
                }
            }
            return null;
        }
        for (MultiSourceLuminaire multiSourceLuminaire2 : getMultiSourceLuminaires()) {
            if (multiSourceLuminaire2 != null) {
                if (multiSourceLuminaire2.getConfiguration() != null && str.equals(multiSourceLuminaire2.getConfiguration().getUniqueIdentifier())) {
                    return multiSourceLuminaire2;
                }
                for (Device device3 : multiSourceLuminaire2.getDevices(DomainType.LIGHT_SOURCE)) {
                    if (device3 != null) {
                        if (device3.getConfiguration() != null && str.equals(device3.getConfiguration().getUniqueIdentifier())) {
                            return device3;
                        }
                        for (Device device4 : ((LightSource) device3).getDevices()) {
                            if (device4 != null && device4.getConfiguration() != null && str.equals(device4.getConfiguration().getUniqueIdentifier())) {
                                return device4;
                            }
                        }
                    }
                }
            }
        }
        for (LightPoint lightPoint : getLightPoints()) {
            if (lightPoint != null && lightPoint.getConfiguration() != null && str.equals(lightPoint.getConfiguration().getUniqueIdentifier())) {
                return lightPoint;
            }
        }
        return null;
    }

    public native DeviceSearchStatus getDeviceSearchStatus();

    public Device getDeviceWithSuperType(DomainType domainType, DomainType domainType2, String str) {
        Map<String, Device> map;
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<String, Device>> map2 = this.deviceMap.get(domainType);
                if (map2 == null || (map = map2.get(domainType2)) == null) {
                    return null;
                }
                return map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<Device> getDevices(DomainType domainType) {
        Map<String, Device> map;
        ArrayList arrayList = new ArrayList();
        if (domainType == DomainType.LIGHT_POINT) {
            Iterator<LightPoint> it = getLights().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (domainType == DomainType.SENSOR) {
            Iterator<Sensor> it2 = getSensors().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            if (domainType != DomainType.COMPOUND_SENSOR) {
                DomainType superType = domainType.getSuperType();
                if (superType == DomainType.UNKNOWN) {
                    HueLog.e(TAG, "Cannot resolve superType for domainType " + domainType);
                    return arrayList;
                }
                synchronized (this.deviceMapLock) {
                    try {
                        Map<DomainType, Map<String, Device>> map2 = this.deviceMap.get(superType);
                        if (map2 != null && (map = map2.get(domainType)) != null) {
                            Iterator<Device> it3 = map.values().iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return arrayList;
            }
            for (Sensor sensor : getSensors()) {
                if (sensor.isOfType(domainType)) {
                    arrayList.add(sensor);
                }
            }
        }
        return arrayList;
    }

    public Group getGroup(String str) {
        return (Group) getResource(DomainType.GROUP, str);
    }

    public List<Group> getGroups() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.GROUP).iterator();
        while (it.hasNext()) {
            arrayList.add((Group) it.next());
        }
        return arrayList;
    }

    public LightPoint getLight(String str) {
        LightPoint multiSourceLuminaire = getMultiSourceLuminaire(str);
        if (multiSourceLuminaire == null) {
            multiSourceLuminaire = getLightSource(str);
        }
        return multiSourceLuminaire == null ? getLightPoint(str) : multiSourceLuminaire;
    }

    public LightPoint getLightPoint(String str) {
        return (LightPoint) getDevice(DomainType.LIGHT_POINT, str);
    }

    public List<LightPoint> getLightPoints() {
        Map<String, Device> map;
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<DomainType, Map<String, Device>>> map2 = this.deviceMap;
                DomainType domainType = DomainType.LIGHT_POINT;
                Map<DomainType, Map<String, Device>> map3 = map2.get(domainType);
                if (map3 != null && (map = map3.get(domainType)) != null) {
                    Iterator<Device> it = map.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add((LightPoint) it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public LightSource getLightSource(String str) {
        if (str != null) {
            return (LightSource) getDevice(DomainType.LIGHT_SOURCE, str);
        }
        return null;
    }

    public List<LightPoint> getLights() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<String, Device>> map = this.deviceMap.get(DomainType.LIGHT_POINT);
                if (map != null) {
                    Iterator<Map<String, Device>> it = map.values().iterator();
                    while (it.hasNext()) {
                        Iterator<Device> it2 = it.next().values().iterator();
                        while (it2.hasNext()) {
                            arrayList.add((LightPoint) it2.next());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public MultiSourceLuminaire getMultiSourceLuminaire(String str) {
        if (str != null) {
            return (MultiSourceLuminaire) getDevice(DomainType.MULTI_SOURCE_LUMINAIRE, str);
        }
        return null;
    }

    public List<MultiSourceLuminaire> getMultiSourceLuminaires() {
        Map<String, Device> map;
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<String, Device>> map2 = this.deviceMap.get(DomainType.LIGHT_POINT);
                if (map2 != null && (map = map2.get(DomainType.MULTI_SOURCE_LUMINAIRE)) != null) {
                    for (Device device : map.values()) {
                        if (device.getType() == DomainType.MULTI_SOURCE_LUMINAIRE) {
                            arrayList.add((MultiSourceLuminaire) device);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public BridgeResource getResource(DomainType domainType, String str) {
        return getResourceWithType(domainType, str);
    }

    public ResourceLink getResourceLink(String str) {
        return (ResourceLink) getResource(DomainType.RESOURCE_LINK, str);
    }

    public List<ResourceLink> getResourceLinks() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.RESOURCE_LINK).iterator();
        while (it.hasNext()) {
            arrayList.add((ResourceLink) it.next());
        }
        return arrayList;
    }

    public BridgeResource getResourceWithType(DomainType domainType, String str) {
        synchronized (this.resourceMapLock) {
            try {
                Map<String, BridgeResource> map = this.resourceMap.get(domainType);
                if (map == null) {
                    return null;
                }
                return map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<BridgeResource> getResources(DomainType domainType) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.resourceMapLock) {
            try {
                Map<String, BridgeResource> map = this.resourceMap.get(domainType);
                if (map != null) {
                    Iterator<BridgeResource> it = map.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Rule getRule(String str) {
        return (Rule) getResource(DomainType.RULE, str);
    }

    public List<Rule> getRules() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.RULE).iterator();
        while (it.hasNext()) {
            arrayList.add((Rule) it.next());
        }
        return arrayList;
    }

    public Scene getScene(String str) {
        return (Scene) getResource(DomainType.SCENE, str);
    }

    public List<Scene> getScenes() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.SCENE).iterator();
        while (it.hasNext()) {
            arrayList.add((Scene) it.next());
        }
        return arrayList;
    }

    public Schedule getSchedule(String str) {
        Schedule schedule = (Schedule) getResource(DomainType.SCHEDULE, str);
        return schedule != null ? schedule : (Schedule) getResource(DomainType.TIMER, str);
    }

    public List<Schedule> getSchedules() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.SCHEDULE).iterator();
        while (it.hasNext()) {
            arrayList.add((Schedule) it.next());
        }
        Iterator<BridgeResource> it2 = getResources(DomainType.TIMER).iterator();
        while (it2.hasNext()) {
            arrayList.add((Schedule) it2.next());
        }
        return arrayList;
    }

    public Sensor getSensor(String str) {
        return (Sensor) getDevice(DomainType.SENSOR, str);
    }

    public List<Sensor> getSensors() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<String, Device>> map = this.deviceMap.get(DomainType.SENSOR);
                if (map != null) {
                    Iterator<Map<String, Device>> it = map.values().iterator();
                    while (it.hasNext()) {
                        Iterator<Device> it2 = it.next().values().iterator();
                        while (it2.hasNext()) {
                            arrayList.add((Sensor) it2.next());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public TimeZones getTimeZones() {
        return (TimeZones) getResource(DomainType.TIMEZONES, new String("0"));
    }

    public Timer getTimer(String str) {
        return (Timer) getResource(DomainType.TIMER, str);
    }

    public List<Timer> getTimers() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.TIMER).iterator();
        while (it.hasNext()) {
            arrayList.add((Timer) it.next());
        }
        return arrayList;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState
    public DomainType getType() {
        return DomainType.BRIDGE_STATE;
    }

    public List<WhitelistEntry> getWhitelist() {
        ArrayList arrayList = new ArrayList();
        Iterator<BridgeResource> it = getResources(DomainType.WHITELIST_ENTRY).iterator();
        while (it.hasNext()) {
            arrayList.add((WhitelistEntry) it.next());
        }
        return arrayList;
    }

    public WhitelistEntry getWhitelistEntry(String str) {
        return (WhitelistEntry) getResource(DomainType.WHITELIST_ENTRY, str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        BridgeConfiguration bridgeConfiguration = this.config;
        int iHashCode2 = (iHashCode + (bridgeConfiguration == null ? 0 : bridgeConfiguration.hashCode())) * 31;
        Map<DomainType, Map<DomainType, Map<String, Device>>> map = this.deviceMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<DomainType, Map<String, BridgeResource>> map2 = this.resourceMap;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public ReturnCode refresh(BridgeStateCacheType bridgeStateCacheType, BridgeConnectionType bridgeConnectionType) {
        if (bridgeStateCacheType != null && bridgeConnectionType != null) {
            return ReturnCode.fromValue(refreshNative(bridgeStateCacheType.getValue(), bridgeConnectionType.getValue()));
        }
        return ReturnCode.NOT_ALLOWED;
    }

    public void removeUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        if (bridgeStateUpdatedCallback != null) {
            synchronized (this.updatedCallbacksLock) {
                try {
                    List<BridgeStateUpdatedCallback> list = this.updatedCallbacks;
                    if (list != null) {
                        list.remove(bridgeStateUpdatedCallback);
                        if (this.updatedCallbacks.size() == 0) {
                            setUpdatedCallback(null);
                            this.updatedCallbacks = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    public native String toJSONString();

    public List<BridgeResource> getResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.resourceMapLock) {
            try {
                Iterator<Map<String, BridgeResource>> it = this.resourceMap.values().iterator();
                while (it.hasNext()) {
                    Iterator<BridgeResource> it2 = it.next().values().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List<LightPoint> getLightPoints(int i, LightType lightType) {
        Map<String, Device> map;
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Map<DomainType, Map<DomainType, Map<String, Device>>> map2 = this.deviceMap;
                DomainType domainType = DomainType.LIGHT_POINT;
                Map<DomainType, Map<String, Device>> map3 = map2.get(domainType);
                if (map3 != null && (map = map3.get(domainType)) != null) {
                    for (Device device : map.values()) {
                        if (((LightPoint) device).getLightType() == lightType) {
                            arrayList.add((LightPoint) device);
                            if (arrayList.size() == i) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List<Device> getDevices() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.deviceMapLock) {
            try {
                Iterator<Map<DomainType, Map<String, Device>>> it = this.deviceMap.values().iterator();
                while (it.hasNext()) {
                    Iterator<Map<String, Device>> it2 = it.next().values().iterator();
                    while (it2.hasNext()) {
                        Iterator<Device> it3 = it2.next().values().iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List<Device> getDevices(String str) {
        ArrayList arrayList = new ArrayList();
        for (Device device : getDevices()) {
            if (device.getInfo() != null && device.getInfo().getSupportedFeatures().contains(str)) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }

    public List<Device> getDevices(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Device device : getDevices()) {
            Iterator<String> it = list.iterator();
            boolean z5 = true;
            while (it.hasNext()) {
                z5 &= device.getInfo() != null && device.getInfo().getSupportedFeatures().contains(it.next());
            }
            if (z5) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }
}
