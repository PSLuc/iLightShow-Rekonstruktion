package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089q4.n;
import p089q4.u;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class SharedDeviceStorageDocument {
    public static final int $stable = 8;
    private List<SharedPersistedDevice> devices;
    private List<SharedPersistedLightOptions> lightOptions;
    private String localStoreRevision;
    private String schema;
    private int schemaVersion;
    private String updatedAt;

    public SharedDeviceStorageDocument() {
        this(null, 0, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedDeviceStorageDocument copy$default(SharedDeviceStorageDocument sharedDeviceStorageDocument, String str, int i, String str2, String str3, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sharedDeviceStorageDocument.schema;
        }
        if ((i3 & 2) != 0) {
            i = sharedDeviceStorageDocument.schemaVersion;
        }
        if ((i3 & 4) != 0) {
            str2 = sharedDeviceStorageDocument.localStoreRevision;
        }
        if ((i3 & 8) != 0) {
            str3 = sharedDeviceStorageDocument.updatedAt;
        }
        if ((i3 & 16) != 0) {
            list = sharedDeviceStorageDocument.devices;
        }
        if ((i3 & 32) != 0) {
            list2 = sharedDeviceStorageDocument.lightOptions;
        }
        List list3 = list;
        List list4 = list2;
        return sharedDeviceStorageDocument.copy(str, i, str2, str3, list3, list4);
    }

    public final String component1() {
        return this.schema;
    }

    public final int component2() {
        return this.schemaVersion;
    }

    public final String component3() {
        return this.localStoreRevision;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final List<SharedPersistedDevice> component5() {
        return this.devices;
    }

    public final List<SharedPersistedLightOptions> component6() {
        return this.lightOptions;
    }

    public final SharedDeviceStorageDocument copy(String str, int i, String str2, String str3, List<SharedPersistedDevice> list, List<SharedPersistedLightOptions> list2) {
        k.f("schema", str);
        k.f("devices", list);
        k.f("lightOptions", list2);
        return new SharedDeviceStorageDocument(str, i, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDeviceStorageDocument)) {
            return false;
        }
        SharedDeviceStorageDocument sharedDeviceStorageDocument = (SharedDeviceStorageDocument) obj;
        return k.a(this.schema, sharedDeviceStorageDocument.schema) && this.schemaVersion == sharedDeviceStorageDocument.schemaVersion && k.a(this.localStoreRevision, sharedDeviceStorageDocument.localStoreRevision) && k.a(this.updatedAt, sharedDeviceStorageDocument.updatedAt) && k.a(this.devices, sharedDeviceStorageDocument.devices) && k.a(this.lightOptions, sharedDeviceStorageDocument.lightOptions);
    }

    public final List<SharedPersistedDevice> getDevices() {
        return this.devices;
    }

    public final List<SharedPersistedLightOptions> getLightOptions() {
        return this.lightOptions;
    }

    public final String getLocalStoreRevision() {
        return this.localStoreRevision;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iC = AbstractC0916i.c(this.schemaVersion, this.schema.hashCode() * 31, 31);
        String str = this.localStoreRevision;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedAt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        return this.lightOptions.hashCode() + ((this.devices.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public final void setDevices(List<SharedPersistedDevice> list) {
        k.f("<set-?>", list);
        this.devices = list;
    }

    public final void setLightOptions(List<SharedPersistedLightOptions> list) {
        k.f("<set-?>", list);
        this.lightOptions = list;
    }

    public final void setLocalStoreRevision(String str) {
        this.localStoreRevision = str;
    }

    public final void setSchema(String str) {
        k.f("<set-?>", str);
        this.schema = str;
    }

    public final void setSchemaVersion(int i) {
        this.schemaVersion = i;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final SharedDeviceStorageDocument syncSafeCopy() {
        List<SharedPersistedDevice> list = this.devices;
        ArrayList arrayList = new ArrayList(n.P(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SharedPersistedDevice) it.next()).syncSafeCopy());
        }
        List<SharedPersistedLightOptions> list2 = this.lightOptions;
        ArrayList arrayList2 = new ArrayList(n.P(list2, 10));
        for (SharedPersistedLightOptions sharedPersistedLightOptions : list2) {
            arrayList2.add(sharedPersistedLightOptions.copy((16379 & 1) != 0 ? sharedPersistedLightOptions.lightId : null, (16379 & 2) != 0 ? sharedPersistedLightOptions.deviceLocalId : null, (16379 & 4) != 0 ? sharedPersistedLightOptions.legacyHashId : null, (16379 & 8) != 0 ? sharedPersistedLightOptions.brightnessMin : null, (16379 & 16) != 0 ? sharedPersistedLightOptions.brightnessMax : null, (16379 & 32) != 0 ? sharedPersistedLightOptions.ambientOnly : null, (16379 & 64) != 0 ? sharedPersistedLightOptions.strobeMode : null, (16379 & 128) != 0 ? sharedPersistedLightOptions.strobeOffBehavior : null, (16379 & HueLog.LogComponent.STREAMDTLS) != 0 ? sharedPersistedLightOptions.roomName : null, (16379 & HueLog.LogComponent.APPCORE) != 0 ? sharedPersistedLightOptions.masterLightId : null, (16379 & 1024) != 0 ? sharedPersistedLightOptions.maxNanoleafPercentage : null, (16379 & 2048) != 0 ? sharedPersistedLightOptions.alwaysChangeHue : null, (16379 & 4096) != 0 ? sharedPersistedLightOptions.segmentCount : null, (16379 & 8192) != 0 ? sharedPersistedLightOptions.updatedAt : null));
        }
        return copy$default(this, null, 0, null, null, arrayList, arrayList2, 15, null);
    }

    public String toString() {
        String str = this.schema;
        int i = this.schemaVersion;
        String str2 = this.localStoreRevision;
        String str3 = this.updatedAt;
        List<SharedPersistedDevice> list = this.devices;
        List<SharedPersistedLightOptions> list2 = this.lightOptions;
        StringBuilder sb = new StringBuilder("SharedDeviceStorageDocument(schema=");
        sb.append(str);
        sb.append(", schemaVersion=");
        sb.append(i);
        sb.append(", localStoreRevision=");
        AbstractC0013g0.t(sb, str2, ", updatedAt=", str3, ", devices=");
        sb.append(list);
        sb.append(", lightOptions=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public SharedDeviceStorageDocument(String str, int i, String str2, String str3, List<SharedPersistedDevice> list, List<SharedPersistedLightOptions> list2) {
        k.f("schema", str);
        k.f("devices", list);
        k.f("lightOptions", list2);
        this.schema = str;
        this.schemaVersion = i;
        this.localStoreRevision = str2;
        this.updatedAt = str3;
        this.devices = list;
        this.lightOptions = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SharedDeviceStorageDocument(String str, int i, String str2, String str3, List list, List list2, int i3, g gVar) {
        str = (i3 & 1) != 0 ? SharedDeviceStorage.SCHEMA_NAME : str;
        i = (i3 & 2) != 0 ? 1 : i;
        str2 = (i3 & 4) != 0 ? null : str2;
        str3 = (i3 & 8) != 0 ? null : str3;
        int i6 = i3 & 16;
        u uVar = u.f11237h;
        this(str, i, str2, str3, i6 != 0 ? uVar : list, (i3 & 32) != 0 ? uVar : list2);
    }
}
