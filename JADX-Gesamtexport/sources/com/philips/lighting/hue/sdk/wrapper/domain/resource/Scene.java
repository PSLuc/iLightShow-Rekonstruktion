package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.SceneType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class Scene extends SessionObject implements BridgeResource, Action {
    private SceneAppData appData;
    private byte[] groupId;
    private byte[] id;
    private Boolean isActive;
    private Date lastUpdated;
    private List<LightPoint> lights;
    private Boolean locked;
    private byte[] name;
    private byte[] owner;
    private byte[] picture;
    private Boolean recycle;
    private SceneType sceneType;
    private Boolean storeLightState;
    private Integer transitionTime;
    private Integer version;

    public Scene() {
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
        this.sceneType = SceneType.LIGHT;
    }

    private native LightPoint createLightPoint(long j4, @Nonnull String str, @Nullable LightState lightState);

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private static boolean isMSL(String str) {
        return !str.matches("\\d+");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void recallNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private synchronized void removeLightInternal(String str) {
        int i = -1;
        for (int i3 = 0; i3 < this.lights.size(); i3++) {
            try {
                if (this.lights.get(i3).getIdentifier().equals(str)) {
                    i = i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i != -1) {
            this.lights.remove(i);
        }
    }

    private synchronized void setLightsArrayInternal(LightPoint[] lightPointArr) {
        initLights();
        this.lights.clear();
        for (LightPoint lightPoint : lightPointArr) {
            this.lights.add(lightPoint);
        }
    }

    private native void setSessionKeyOnLightPoint(LightPoint lightPoint, long j4);

    private native void syncLightPointsNative(String str);

    private native void updateLightPointsFromCacheNative(LightPoint[] lightPointArr, String[] strArr);

    public synchronized void addLight(LightPoint lightPoint) {
        if (lightPoint != null) {
            initLights();
            removeLight(lightPoint.getIdentifier());
            this.lights.add(lightPoint);
            if (isMSL(lightPoint.getIdentifier())) {
                syncLightPointsNative(null);
            }
        }
    }

    public synchronized void addLightId(String str) {
        if (str != null) {
            initLights();
            removeLight(str);
            this.lights.add(createLightPoint(getSessionKey(), str, null));
            if (isMSL(str)) {
                syncLightPointsNative(null);
            }
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Scene scene = (Scene) obj;
        SceneAppData sceneAppData = this.appData;
        if (sceneAppData == null) {
            if (scene.appData != null) {
                return false;
            }
        } else if (!sceneAppData.equals(scene.appData)) {
            return false;
        }
        if (!Arrays.equals(this.id, scene.id)) {
            return false;
        }
        Boolean bool = this.isActive;
        if (bool == null) {
            if (scene.isActive != null) {
                return false;
            }
        } else if (!bool.equals(scene.isActive)) {
            return false;
        }
        Date date = this.lastUpdated;
        if (date == null) {
            if (scene.lastUpdated != null) {
                return false;
            }
        } else if (!date.equals(scene.lastUpdated)) {
            return false;
        }
        List<LightPoint> list = this.lights;
        if (list == null) {
            if (scene.lights != null) {
                return false;
            }
        } else if (!list.equals(scene.lights)) {
            return false;
        }
        Boolean bool2 = this.locked;
        if (bool2 == null) {
            if (scene.locked != null) {
                return false;
            }
        } else if (!bool2.equals(scene.locked)) {
            return false;
        }
        if (!Arrays.equals(this.name, scene.name)) {
            return false;
        }
        if (!Arrays.equals(this.owner, scene.owner)) {
            return false;
        }
        if (!Arrays.equals(this.picture, scene.picture)) {
            return false;
        }
        Boolean bool3 = this.recycle;
        if (bool3 == null) {
            if (scene.recycle != null) {
                return false;
            }
        } else if (!bool3.equals(scene.recycle)) {
            return false;
        }
        Boolean bool4 = this.storeLightState;
        if (bool4 == null) {
            if (scene.storeLightState != null) {
                return false;
            }
        } else if (!bool4.equals(scene.storeLightState)) {
            return false;
        }
        Integer num = this.transitionTime;
        if (num == null) {
            if (scene.transitionTime != null) {
                return false;
            }
        } else if (!num.equals(scene.transitionTime)) {
            return false;
        }
        Integer num2 = this.version;
        if (num2 == null) {
            if (scene.version != null) {
                return false;
            }
        } else if (!num2.equals(scene.version)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public SceneAppData getAppData() {
        return this.appData;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    public String getGroupIdentifier() {
        return NativeTools.BytesToString(this.groupId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.id);
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public synchronized List<String> getLightIds() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<LightPoint> list = this.lights;
        if (list != null) {
            Iterator<LightPoint> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getIdentifier());
            }
        }
        return arrayList;
    }

    public synchronized List<LightPoint> getLights() {
        List<LightPoint> list = this.lights;
        if (list == null) {
            return Arrays.asList(new LightPoint[0]);
        }
        LightPoint[] lightPointArr = new LightPoint[list.size()];
        String[] strArr = new String[this.lights.size()];
        for (int i = 0; i < this.lights.size(); i++) {
            strArr[i] = this.lights.get(i).getIdentifier();
        }
        updateLightPointsFromCacheNative(lightPointArr, strArr);
        for (int i3 = 0; i3 < this.lights.size(); i3++) {
            LightPoint lightPoint = lightPointArr[i3];
            if (lightPoint == null) {
                lightPointArr[i3] = this.lights.get(i3);
            } else {
                lightPoint.setLightState(this.lights.get(i3).getLightState());
            }
        }
        return Arrays.asList(lightPointArr);
    }

    public synchronized LightPoint[] getLightsArray() {
        List<LightPoint> list = this.lights;
        if (list == null) {
            return null;
        }
        LightPoint[] lightPointArr = new LightPoint[list.size()];
        Iterator<LightPoint> it = this.lights.iterator();
        int i = 0;
        while (it.hasNext()) {
            lightPointArr[i] = it.next();
            i++;
        }
        return lightPointArr;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public String getOwner() {
        return NativeTools.BytesToString(this.owner);
    }

    public String getPicture() {
        return NativeTools.BytesToString(this.picture);
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    public SceneType getSceneType() {
        return this.sceneType;
    }

    public Boolean getStoreLightState() {
        return this.storeLightState;
    }

    public Integer getTransitionTime() {
        return this.transitionTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.SCENE;
    }

    public Integer getVersion() {
        return this.version;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public synchronized int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = super.hashCode() * 31;
        SceneAppData sceneAppData = this.appData;
        iHashCode = 0;
        int iHashCode4 = (((iHashCode3 + (sceneAppData == null ? 0 : sceneAppData.hashCode())) * 31) + Arrays.hashCode(this.id)) * 31;
        Boolean bool = this.isActive;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.lastUpdated;
        int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        List<LightPoint> list = this.lights;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.locked;
        int iHashCode8 = (((((((iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Arrays.hashCode(this.name)) * 31) + Arrays.hashCode(this.owner)) * 31) + Arrays.hashCode(this.picture)) * 31;
        Boolean bool3 = this.recycle;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.storeLightState;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.transitionTime;
        iHashCode2 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.version;
        if (num2 != null) {
            iHashCode = num2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public synchronized void initLights() {
        if (this.lights == null) {
            this.lights = new ArrayList();
        }
    }

    @Deprecated
    public Boolean isActive() {
        return this.isActive;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    public synchronized void recall() {
        recall(BridgeConnectionType.LOCAL_REMOTE, null);
    }

    public synchronized void removeLight(String str) {
        initLights();
        removeLightInternal(str);
        if (isMSL(str)) {
            syncLightPointsNative(str);
        }
    }

    public void setAppData(SceneAppData sceneAppData) {
        this.appData = sceneAppData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public synchronized void setBridge(Bridge bridge) {
        long sessionKey = ((SessionObject) bridge).getSessionKey();
        setSessionKey(sessionKey);
        List<LightPoint> list = this.lights;
        if (list != null) {
            Iterator<LightPoint> it = list.iterator();
            while (it.hasNext()) {
                setSessionKeyOnLightPoint(it.next(), sessionKey);
            }
        }
    }

    public void setGroupIdentifier(String str) {
        this.sceneType = SceneType.GROUP;
        this.groupId = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.id = NativeTools.StringToBytes(str);
    }

    @Deprecated
    public void setIsActive(Boolean bool) {
        this.isActive = bool;
    }

    public void setLastUpdated(Date date) {
        this.lastUpdated = date;
    }

    public synchronized void setLightIds(List<String> list) {
        if (list != null) {
            try {
                initLights();
                this.lights.clear();
                for (String str : list) {
                    removeLight(str);
                    this.lights.add(createLightPoint(getSessionKey(), str, null));
                }
                syncLightPointsNative(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void setLightIdsAsStrings(List<String> list) {
        if (list != null) {
            try {
                initLights();
                this.lights.clear();
                for (String str : list) {
                    removeLight(new String(str));
                    this.lights.add(createLightPoint(getSessionKey(), new String(str), null));
                }
                syncLightPointsNative(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void setLightStateForLight(String str, LightState lightState) {
        if (str != null && lightState != null) {
            initLights();
            removeLightInternal(str);
            this.lights.add(createLightPoint(getSessionKey(), str, lightState));
            if (isMSL(str)) {
                syncLightPointsNative(null);
            }
        }
    }

    public synchronized void setLights(List<LightPoint> list) {
        this.lights = list;
        syncLightPointsNative(null);
    }

    public synchronized void setLightsArray(LightPoint[] lightPointArr) {
        setLightsArrayInternal(lightPointArr);
        syncLightPointsNative(null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setOwner(String str) {
        this.owner = NativeTools.StringToBytes(str);
    }

    public void setPicture(String str) {
        this.picture = NativeTools.StringToBytes(str);
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setStoreLightState(Boolean bool) {
        this.storeLightState = bool;
    }

    public void setTransitionTime(Integer num) {
        this.transitionTime = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Scene.2
                @Override // java.lang.Runnable
                public void run() {
                    Scene.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public synchronized void recall(BridgeResponseCallback bridgeResponseCallback) {
        recall(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public synchronized void recall(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        try {
            if (bridgeConnectionType == null) {
                BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
            } else {
                Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Scene.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Scene.this.recallNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeLight(LightPoint lightPoint) {
        if (lightPoint != null) {
            removeLight(lightPoint.getIdentifier());
        }
    }

    public synchronized void addLightId(String str, LightState lightState) {
        if (str != null) {
            initLights();
            removeLight(str);
            this.lights.add(createLightPoint(getSessionKey(), str, lightState));
            if (isMSL(str)) {
                syncLightPointsNative(null);
            }
        }
    }

    public Scene(String str) {
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
        this.sceneType = SceneType.LIGHT;
        setIdentifier(str);
    }

    private Scene(long j4) {
        super(j4);
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
    }

    public Scene(String str, String str2, List<String> list, Boolean bool, Integer num, Bridge bridge) {
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
        this.sceneType = SceneType.LIGHT;
        setIdentifier(str);
        setName(str2);
        setBridge(bridge);
        this.isActive = bool;
        this.transitionTime = num;
        setLightIds(list);
    }

    public Scene(String str, String str2, List<LightPoint> list, Boolean bool, Integer num, String str3, Boolean bool2, Boolean bool3, Date date, SceneAppData sceneAppData, String str4, Boolean bool4) {
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
        this.sceneType = SceneType.LIGHT;
        setIdentifier(str);
        setName(str2);
        this.isActive = bool;
        this.transitionTime = num;
        setOwner(str3);
        this.recycle = bool2;
        this.lastUpdated = date;
        this.appData = sceneAppData;
        setPicture(str4);
        this.storeLightState = bool4;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<LightPoint> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getIdentifier());
            }
        }
        setLightIds(arrayList);
    }

    public Scene(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Date date, SceneAppData sceneAppData, String str5, Boolean bool3) {
        this.id = null;
        this.name = null;
        this.sceneType = null;
        this.lights = null;
        this.groupId = null;
        this.isActive = null;
        this.transitionTime = null;
        this.owner = null;
        this.recycle = null;
        this.locked = null;
        this.lastUpdated = null;
        this.picture = null;
        this.appData = null;
        this.storeLightState = null;
        this.version = null;
        this.sceneType = SceneType.GROUP;
        setIdentifier(str);
        setName(str2);
        setGroupIdentifier(str3);
        this.transitionTime = num;
        setOwner(str4);
        this.recycle = bool;
        this.lastUpdated = date;
        this.appData = sceneAppData;
        setPicture(str5);
        this.storeLightState = bool3;
    }
}
