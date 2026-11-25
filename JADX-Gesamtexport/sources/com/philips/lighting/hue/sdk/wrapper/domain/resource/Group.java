package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class Group extends SessionObject implements BridgeResource {
    private AggregatedPresenceSensorState aggregatedPresenceSensorState;
    private GroupClass groupClass;
    private GroupState groupState;
    private byte[] identifier;
    private byte[][] lightIds;
    private GroupLightLocation[] lightLocations;
    private byte[] modelId;
    private byte[] name;
    private Boolean recycle;
    private List<Sensor> sensors;
    private GroupStream stream;
    private GroupType type;

    public Group() {
        this.name = null;
        this.identifier = null;
        this.sensors = null;
        this.modelId = null;
        this.recycle = null;
        this.type = GroupType.UNKNOWN;
        this.groupClass = null;
        this.groupState = null;
        this.stream = null;
        this.aggregatedPresenceSensorState = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void applyLightStateNative(Action action, int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native void applySceneNative(Action action, int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private ReturnCode removeLightLocationInternal(String str) {
        if (str == null) {
            return ReturnCode.NULL_PARAMETER;
        }
        GroupLightLocation[] groupLightLocationArr = this.lightLocations;
        if (groupLightLocationArr != null) {
            int length = groupLightLocationArr.length;
            GroupLightLocation[] groupLightLocationArr2 = new GroupLightLocation[length];
            int i = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!str.equals(this.lightLocations[i3].getLightIdentifier())) {
                    groupLightLocationArr2[i] = this.lightLocations[i3];
                    i++;
                }
            }
            if (i < this.lightLocations.length) {
                if (i > 0) {
                    this.lightLocations = new GroupLightLocation[i];
                    for (int i6 = 0; i6 < i; i6++) {
                        this.lightLocations[i6] = groupLightLocationArr2[i6];
                        groupLightLocationArr2[i6] = null;
                    }
                } else {
                    this.lightLocations = null;
                }
                return ReturnCode.SUCCESS;
            }
        }
        return ReturnCode.DOES_NOT_EXIST;
    }

    private native int removeLightLocationNative(String str);

    private void setAggregatedPresenceSensorState(@Nullable AggregatedPresenceSensorState aggregatedPresenceSensorState) {
        this.aggregatedPresenceSensorState = aggregatedPresenceSensorState;
    }

    private void setGroupClassFromInt(int i) {
        this.groupClass = GroupClass.fromValue(i);
    }

    private native void syncLightIdsNative(String str);

    private native void syncLightLocationsNative();

    public void addLight(LightPoint lightPoint) {
        addLightId(lightPoint.getIdentifier());
    }

    public void addLightId(String str) {
        if (str != null) {
            byte[][] bArr = this.lightIds;
            Class cls = Byte.TYPE;
            if (bArr != null) {
                int i = 0;
                while (true) {
                    byte[][] bArr2 = this.lightIds;
                    if (i >= bArr2.length) {
                        this.lightIds = (byte[][]) Array.newInstance((Class<?>) cls, bArr2.length + 1, 0);
                        for (int i3 = 0; i3 < bArr2.length; i3++) {
                            this.lightIds[i3] = bArr2[i3];
                        }
                        this.lightIds[bArr2.length] = NativeTools.StringToBytes(str);
                        break;
                    }
                    if (NativeTools.BytesToString(bArr2[i]).equals(str)) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 1, 0);
                this.lightIds = bArr3;
                bArr3[0] = NativeTools.StringToBytes(str);
            }
            syncLightIdsNative(null);
        }
    }

    public void addLightLocation(GroupLightLocation groupLightLocation) {
        if (groupLightLocation != null) {
            if (this.lightLocations != null) {
                int i = 0;
                while (true) {
                    GroupLightLocation[] groupLightLocationArr = this.lightLocations;
                    if (i >= groupLightLocationArr.length) {
                        this.lightLocations = new GroupLightLocation[groupLightLocationArr.length + 1];
                        for (int i3 = 0; i3 < groupLightLocationArr.length; i3++) {
                            this.lightLocations[i3] = groupLightLocationArr[i3];
                        }
                        this.lightLocations[groupLightLocationArr.length] = groupLightLocation;
                        break;
                    }
                    if (groupLightLocation.getLightIdentifier().equals(this.lightLocations[i].getLightIdentifier())) {
                        this.lightLocations[i] = groupLightLocation;
                        break;
                    }
                    i++;
                }
            } else {
                this.lightLocations = new GroupLightLocation[]{groupLightLocation};
            }
            syncLightLocationsNative();
        }
    }

    public native void addSensor(Sensor sensor);

    public void apply(Action action) {
        apply(action, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        Group group = (Group) obj;
        GroupState groupState = this.groupState;
        if (groupState == null) {
            if (group.groupState != null) {
                return false;
            }
        } else if (!groupState.equals(group.groupState)) {
            return false;
        }
        if (!Arrays.equals(this.identifier, group.identifier) || !Arrays.deepEquals(this.lightIds, group.lightIds) || !Arrays.deepEquals(this.lightLocations, group.lightLocations) || !Arrays.equals(this.modelId, group.modelId) || !Arrays.equals(this.name, group.name)) {
            return false;
        }
        GroupStream groupStream = this.stream;
        if (groupStream == null) {
            if (group.stream != null) {
                return false;
            }
        } else if (!groupStream.equals(group.stream)) {
            return false;
        }
        Boolean bool = this.recycle;
        if (bool == null) {
            if (group.recycle != null) {
                return false;
            }
        } else if (!bool.equals(group.recycle)) {
            return false;
        }
        if (this.groupClass != group.groupClass || this.type != group.type || !Objects.equals(this.aggregatedPresenceSensorState, group.aggregatedPresenceSensorState)) {
            return false;
        }
        List<Sensor> list = this.sensors;
        if ((list == null && group.sensors != null) || (list != null && group.sensors == null)) {
            return false;
        }
        if (list != null) {
            if (list.size() != group.sensors.size()) {
                return false;
            }
            for (int i = 0; i < this.sensors.size(); i++) {
                if (!this.sensors.get(i).getIdentifier().equals(group.sensors.get(i).getIdentifier())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Nullable
    public AggregatedPresenceSensorState getAggregatedPresenceSensorState() {
        return this.aggregatedPresenceSensorState;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    public GroupClass getGroupClass() {
        return this.groupClass;
    }

    public int getGroupClassAsInt() {
        return this.groupClass.getValue();
    }

    public GroupState getGroupState() {
        return this.groupState;
    }

    public GroupType getGroupType() {
        return this.type;
    }

    public int getGroupTypeAsInt() {
        return this.type.getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public List<String> getLightIds() {
        if (this.lightIds == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.lightIds) {
            arrayList.add(NativeTools.BytesToString(bArr));
        }
        return arrayList;
    }

    public List<GroupLightLocation> getLightLocations() {
        return Arrays.asList(this.lightLocations);
    }

    public String getModelId() {
        return NativeTools.BytesToString(this.modelId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    @Nonnull
    public List<Sensor> getSensors() {
        List<Sensor> list = this.sensors;
        return list != null ? list : new ArrayList();
    }

    public GroupStream getStream() {
        return this.stream;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.GROUP;
    }

    public native boolean hasSensor(Sensor sensor);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        GroupState groupState = this.groupState;
        int iN = k.n(this.name, k.n(this.modelId, (Arrays.hashCode(this.lightIds) + k.n(this.identifier, (iHashCode + (groupState == null ? 0 : groupState.hashCode())) * 31, 31)) * 31, 31), 31);
        Boolean bool = this.recycle;
        int iHashCode2 = (iN + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupClass groupClass = this.groupClass;
        int iHashCode3 = (iHashCode2 + (groupClass == null ? 0 : groupClass.hashCode())) * 31;
        GroupType groupType = this.type;
        int iHashCode4 = (iHashCode3 + (groupType == null ? 0 : groupType.hashCode())) * 31;
        AggregatedPresenceSensorState aggregatedPresenceSensorState = this.aggregatedPresenceSensorState;
        return iHashCode4 + (aggregatedPresenceSensorState != null ? aggregatedPresenceSensorState.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    public void removeLight(LightPoint lightPoint) {
        removeLightId(lightPoint.getIdentifier());
    }

    public void removeLightId(String str) {
        if (str != null) {
            syncLightIdsNative(str);
            byte[][] bArr = this.lightIds;
            if (bArr != null) {
                int[] iArr = {bArr.length, 0};
                Class cls = Byte.TYPE;
                byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
                int i = 0;
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    if (!str.equals(NativeTools.BytesToString(this.lightIds[i3]))) {
                        bArr2[i] = this.lightIds[i3];
                        i++;
                    }
                }
                if (i < this.lightIds.length) {
                    if (i > 0) {
                        this.lightIds = (byte[][]) Array.newInstance((Class<?>) cls, i, 0);
                        for (int i6 = 0; i6 < i; i6++) {
                            this.lightIds[i6] = bArr2[i6];
                            bArr2[i6] = null;
                        }
                    } else {
                        this.lightIds = (byte[][]) Array.newInstance((Class<?>) cls, 0, 0);
                    }
                }
            }
            removeLightLocation(str);
        }
    }

    public ReturnCode removeLightLocation(String str) {
        ReturnCode returnCodeFromValue = ReturnCode.fromValue(removeLightLocationNative(str));
        if (returnCodeFromValue == ReturnCode.SUCCESS) {
            return returnCodeFromValue;
        }
        ReturnCode returnCodeRemoveLightLocationInternal = removeLightLocationInternal(str);
        syncLightLocationsNative();
        return returnCodeRemoveLightLocationInternal;
    }

    public native void removeSensor(Sensor sensor);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
        setSessionKey(((SessionObject) bridge).getSessionKey());
        syncLightIdsNative(null);
        syncLightLocationsNative();
    }

    public void setGroupClass(GroupClass groupClass) {
        this.groupClass = groupClass;
    }

    public void setGroupType(GroupType groupType) {
        this.type = groupType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.identifier = NativeTools.StringToBytes(str);
    }

    public void setLightIds(List<String> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            if (this.lightIds != null) {
                int i = 0;
                while (true) {
                    byte[][] bArr = this.lightIds;
                    if (i >= bArr.length) {
                        break;
                    }
                    hashSet.add(NativeTools.BytesToString(bArr[i]));
                    i++;
                }
            }
            this.lightIds = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, list.size(), 0);
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.lightIds[i3] = NativeTools.StringToBytes(list.get(i3));
                hashSet.remove(list.get(i3));
            }
            if (hashSet.size() > 0) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    removeLightLocationInternal((String) it.next());
                }
                syncLightLocationsNative();
            }
        }
        syncLightIdsNative(null);
    }

    public void setLightLocations(List<GroupLightLocation> list) {
        if (list != null) {
            GroupLightLocation[] groupLightLocationArr = new GroupLightLocation[list.size()];
            this.lightLocations = groupLightLocationArr;
            this.lightLocations = (GroupLightLocation[]) list.toArray(groupLightLocationArr);
            syncLightLocationsNative();
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setSensors(List<Sensor> list) {
        this.sensors = list;
        syncSensorsNative();
    }

    public void setStream(GroupStream groupStream) {
        this.stream = groupStream;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    public native void syncSensorsNative();

    private void setGroupType(int i) {
        this.type = GroupType.fromValue(i);
    }

    public void apply(Action action, BridgeResponseCallback bridgeResponseCallback) {
        apply(action, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Group.3
                @Override // java.lang.Runnable
                public void run() {
                    Group.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    public void setRecycle(boolean z5) {
        this.recycle = new Boolean(z5);
    }

    public void apply(final Action action, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (action == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
            return;
        }
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
            return;
        }
        if (Scene.class.isInstance(action)) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Group.1
                @Override // java.lang.Runnable
                public void run() {
                    Group.this.applySceneNative(action, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        } else if (LightState.class.isInstance(action)) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Group.2
                @Override // java.lang.Runnable
                public void run() {
                    Group.this.applyLightStateNative(action, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        } else {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.UNSUPPORTED_PARAMETER_TYPE);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public Group(long j4) {
        super(j4);
        this.name = null;
        this.identifier = null;
        this.sensors = null;
        this.modelId = null;
        this.recycle = null;
        this.type = GroupType.UNKNOWN;
        this.groupClass = null;
        this.groupState = null;
        this.stream = null;
        this.aggregatedPresenceSensorState = null;
    }

    public Group(String str) {
        this.name = null;
        this.identifier = null;
        this.sensors = null;
        this.modelId = null;
        this.recycle = null;
        this.type = GroupType.UNKNOWN;
        this.groupClass = null;
        this.groupState = null;
        this.stream = null;
        this.aggregatedPresenceSensorState = null;
        setIdentifier(str);
    }

    public Group(String str, List<String> list) {
        this.name = null;
        this.identifier = null;
        this.sensors = null;
        this.modelId = null;
        this.recycle = null;
        this.type = GroupType.UNKNOWN;
        this.groupClass = null;
        this.groupState = null;
        this.stream = null;
        this.aggregatedPresenceSensorState = null;
        setName(str);
        setLightIds(list);
    }

    public Group(String str, List<String> list, List<Sensor> list2) {
        this(str, list);
        setSensors(list2);
    }

    public Group(String str, List<String> list, Bridge bridge) {
        this(str, list);
        setBridge(bridge);
    }

    public Group(String str, List<String> list, List<Sensor> list2, Bridge bridge) {
        this(str, list, list2);
        setBridge(bridge);
    }
}
