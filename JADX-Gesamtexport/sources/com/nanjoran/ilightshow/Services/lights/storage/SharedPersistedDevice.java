package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import K3.a;
import K3.d;
import M3.c;
import M4.s;
import Z2.f;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPersistedDevice {
    private String cloudId;
    private SharedDeviceConnectionLocal connectionLocal;
    private String createdAt;
    private SharedDeviceCredentialsLocal credentialsLocal;
    private String displayName;
    private SharedHueDeviceFields hue;
    private Map<String, String> identity;
    private SharedLifxDeviceFields lifx;
    private String localId;
    private SharedNanoleafDeviceFields nanoleaf;
    private String revision;
    private String type;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SharedPersistedDevice fromDevice(a aVar) {
            String strSharedStorageTypeId;
            SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal;
            SharedHueDeviceFields sharedHueDeviceFields;
            SharedNanoleafDeviceFields sharedNanoleafDeviceFields;
            k.f(ClipAttribute.Sensor.Configuration.Device, aVar);
            String str = aVar.id;
            if (str == null && (str = aVar.ip) == null) {
                return null;
            }
            String str2 = str;
            d dVar = aVar.type;
            if (dVar == null || (strSharedStorageTypeId = SharedDeviceStorageKt.sharedStorageTypeId(dVar)) == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str3 = aVar.id;
            if (str3 != null) {
                linkedHashMap.put("vendorId", str3);
            }
            String str4 = aVar.ip;
            SharedDeviceConnectionLocal sharedDeviceConnectionLocal = (str4 == null && aVar.port == null) ? null : new SharedDeviceConnectionLocal(str4, aVar.port, null, null, 12, null);
            if (aVar.token != null || ((aVar instanceof DeviceHueBridge) && ((DeviceHueBridge) aVar).getClientKey() != null)) {
                String str5 = aVar.token;
                DeviceHueBridge deviceHueBridge = aVar instanceof DeviceHueBridge ? (DeviceHueBridge) aVar : null;
                String clientKey = deviceHueBridge != null ? deviceHueBridge.getClientKey() : null;
                d dVar2 = aVar.type;
                sharedDeviceCredentialsLocal = new SharedDeviceCredentialsLocal(str5, clientKey, (dVar2 == null || !dVar2.a()) ? null : aVar.token);
            } else {
                sharedDeviceCredentialsLocal = null;
            }
            String str6 = aVar.name;
            LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
            if (aVar.type == d.i) {
                DeviceHueBridge deviceHueBridge2 = aVar instanceof DeviceHueBridge ? (DeviceHueBridge) aVar : null;
                sharedHueDeviceFields = new SharedHueDeviceFields(aVar.id, null, deviceHueBridge2 != null ? deviceHueBridge2.getLegacyOnly() : null, aVar.token, deviceHueBridge2 != null ? deviceHueBridge2.getClientKey() : null, 2, null);
            } else {
                sharedHueDeviceFields = null;
            }
            SharedLifxDeviceFields sharedLifxDeviceFields = aVar.type == d.f2133j ? new SharedLifxDeviceFields(null, aVar.port, 1, null) : null;
            d dVar3 = aVar.type;
            if (dVar3 == null || !dVar3.a()) {
                sharedNanoleafDeviceFields = null;
            } else {
                String str7 = aVar.customInfo.get("model");
                String str8 = aVar.customInfo.get("streamControlPort");
                sharedNanoleafDeviceFields = new SharedNanoleafDeviceFields(str7, null, str8 != null ? s.X(str8) : null, aVar.token, 2, null);
            }
            return new SharedPersistedDevice(str2, null, null, null, null, strSharedStorageTypeId, str6, linkedHashMap2, sharedDeviceConnectionLocal, sharedDeviceCredentialsLocal, sharedHueDeviceFields, sharedLifxDeviceFields, sharedNanoleafDeviceFields, 30, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                f fVar = d.f2132h;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f fVar2 = d.f2132h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f fVar3 = d.f2132h;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f fVar4 = d.f2132h;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedPersistedDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, SharedDeviceConnectionLocal sharedDeviceConnectionLocal, SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal, SharedHueDeviceFields sharedHueDeviceFields, SharedLifxDeviceFields sharedLifxDeviceFields, SharedNanoleafDeviceFields sharedNanoleafDeviceFields) {
        k.f("localId", str);
        k.f("type", str6);
        this.localId = str;
        this.cloudId = str2;
        this.revision = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.type = str6;
        this.displayName = str7;
        this.identity = map;
        this.connectionLocal = sharedDeviceConnectionLocal;
        this.credentialsLocal = sharedDeviceCredentialsLocal;
        this.hue = sharedHueDeviceFields;
        this.lifx = sharedLifxDeviceFields;
        this.nanoleaf = sharedNanoleafDeviceFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedPersistedDevice copy$default(SharedPersistedDevice sharedPersistedDevice, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, SharedDeviceConnectionLocal sharedDeviceConnectionLocal, SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal, SharedHueDeviceFields sharedHueDeviceFields, SharedLifxDeviceFields sharedLifxDeviceFields, SharedNanoleafDeviceFields sharedNanoleafDeviceFields, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedPersistedDevice.localId;
        }
        return sharedPersistedDevice.copy(str, (i & 2) != 0 ? sharedPersistedDevice.cloudId : str2, (i & 4) != 0 ? sharedPersistedDevice.revision : str3, (i & 8) != 0 ? sharedPersistedDevice.createdAt : str4, (i & 16) != 0 ? sharedPersistedDevice.updatedAt : str5, (i & 32) != 0 ? sharedPersistedDevice.type : str6, (i & 64) != 0 ? sharedPersistedDevice.displayName : str7, (i & 128) != 0 ? sharedPersistedDevice.identity : map, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? sharedPersistedDevice.connectionLocal : sharedDeviceConnectionLocal, (i & HueLog.LogComponent.APPCORE) != 0 ? sharedPersistedDevice.credentialsLocal : sharedDeviceCredentialsLocal, (i & 1024) != 0 ? sharedPersistedDevice.hue : sharedHueDeviceFields, (i & 2048) != 0 ? sharedPersistedDevice.lifx : sharedLifxDeviceFields, (i & 4096) != 0 ? sharedPersistedDevice.nanoleaf : sharedNanoleafDeviceFields);
    }

    public final String component1() {
        return this.localId;
    }

    public final SharedDeviceCredentialsLocal component10() {
        return this.credentialsLocal;
    }

    public final SharedHueDeviceFields component11() {
        return this.hue;
    }

    public final SharedLifxDeviceFields component12() {
        return this.lifx;
    }

    public final SharedNanoleafDeviceFields component13() {
        return this.nanoleaf;
    }

    public final String component2() {
        return this.cloudId;
    }

    public final String component3() {
        return this.revision;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.displayName;
    }

    public final Map<String, String> component8() {
        return this.identity;
    }

    public final SharedDeviceConnectionLocal component9() {
        return this.connectionLocal;
    }

    public final SharedPersistedDevice copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, SharedDeviceConnectionLocal sharedDeviceConnectionLocal, SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal, SharedHueDeviceFields sharedHueDeviceFields, SharedLifxDeviceFields sharedLifxDeviceFields, SharedNanoleafDeviceFields sharedNanoleafDeviceFields) {
        k.f("localId", str);
        k.f("type", str6);
        return new SharedPersistedDevice(str, str2, str3, str4, str5, str6, str7, map, sharedDeviceConnectionLocal, sharedDeviceCredentialsLocal, sharedHueDeviceFields, sharedLifxDeviceFields, sharedNanoleafDeviceFields);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPersistedDevice)) {
            return false;
        }
        SharedPersistedDevice sharedPersistedDevice = (SharedPersistedDevice) obj;
        return k.a(this.localId, sharedPersistedDevice.localId) && k.a(this.cloudId, sharedPersistedDevice.cloudId) && k.a(this.revision, sharedPersistedDevice.revision) && k.a(this.createdAt, sharedPersistedDevice.createdAt) && k.a(this.updatedAt, sharedPersistedDevice.updatedAt) && k.a(this.type, sharedPersistedDevice.type) && k.a(this.displayName, sharedPersistedDevice.displayName) && k.a(this.identity, sharedPersistedDevice.identity) && k.a(this.connectionLocal, sharedPersistedDevice.connectionLocal) && k.a(this.credentialsLocal, sharedPersistedDevice.credentialsLocal) && k.a(this.hue, sharedPersistedDevice.hue) && k.a(this.lifx, sharedPersistedDevice.lifx) && k.a(this.nanoleaf, sharedPersistedDevice.nanoleaf);
    }

    public final String getCloudId() {
        return this.cloudId;
    }

    public final SharedDeviceConnectionLocal getConnectionLocal() {
        return this.connectionLocal;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final SharedDeviceCredentialsLocal getCredentialsLocal() {
        return this.credentialsLocal;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final SharedHueDeviceFields getHue() {
        return this.hue;
    }

    public final Map<String, String> getIdentity() {
        return this.identity;
    }

    public final SharedLifxDeviceFields getLifx() {
        return this.lifx;
    }

    public final String getLocalId() {
        return this.localId;
    }

    public final SharedNanoleafDeviceFields getNanoleaf() {
        return this.nanoleaf;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.localId.hashCode() * 31;
        String str = this.cloudId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.revision;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        int iC = AbstractC0013g0.c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, this.type, 31);
        String str5 = this.displayName;
        int iHashCode5 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.identity;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        SharedDeviceConnectionLocal sharedDeviceConnectionLocal = this.connectionLocal;
        int iHashCode7 = (iHashCode6 + (sharedDeviceConnectionLocal == null ? 0 : sharedDeviceConnectionLocal.hashCode())) * 31;
        SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal = this.credentialsLocal;
        int iHashCode8 = (iHashCode7 + (sharedDeviceCredentialsLocal == null ? 0 : sharedDeviceCredentialsLocal.hashCode())) * 31;
        SharedHueDeviceFields sharedHueDeviceFields = this.hue;
        int iHashCode9 = (iHashCode8 + (sharedHueDeviceFields == null ? 0 : sharedHueDeviceFields.hashCode())) * 31;
        SharedLifxDeviceFields sharedLifxDeviceFields = this.lifx;
        int iHashCode10 = (iHashCode9 + (sharedLifxDeviceFields == null ? 0 : sharedLifxDeviceFields.hashCode())) * 31;
        SharedNanoleafDeviceFields sharedNanoleafDeviceFields = this.nanoleaf;
        return iHashCode10 + (sharedNanoleafDeviceFields != null ? sharedNanoleafDeviceFields.hashCode() : 0);
    }

    public final void setCloudId(String str) {
        this.cloudId = str;
    }

    public final void setConnectionLocal(SharedDeviceConnectionLocal sharedDeviceConnectionLocal) {
        this.connectionLocal = sharedDeviceConnectionLocal;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setCredentialsLocal(SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal) {
        this.credentialsLocal = sharedDeviceCredentialsLocal;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setHue(SharedHueDeviceFields sharedHueDeviceFields) {
        this.hue = sharedHueDeviceFields;
    }

    public final void setIdentity(Map<String, String> map) {
        this.identity = map;
    }

    public final void setLifx(SharedLifxDeviceFields sharedLifxDeviceFields) {
        this.lifx = sharedLifxDeviceFields;
    }

    public final void setLocalId(String str) {
        k.f("<set-?>", str);
        this.localId = str;
    }

    public final void setNanoleaf(SharedNanoleafDeviceFields sharedNanoleafDeviceFields) {
        this.nanoleaf = sharedNanoleafDeviceFields;
    }

    public final void setRevision(String str) {
        this.revision = str;
    }

    public final void setType(String str) {
        k.f("<set-?>", str);
        this.type = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final SharedPersistedDevice syncSafeCopy() {
        SharedNanoleafDeviceFields sharedNanoleafDeviceFields = this.nanoleaf;
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, sharedNanoleafDeviceFields != null ? SharedNanoleafDeviceFields.copy$default(sharedNanoleafDeviceFields, null, null, null, null, 11, null) : null, 4095, null);
    }

    public final a toDevice() {
        d dVar;
        a deviceHueBridge;
        String bridgeId;
        String username;
        String clientKey;
        Integer streamControlPort;
        String model;
        f fVar = d.f2132h;
        String str = this.type;
        fVar.getClass();
        k.f("typeId", str);
        switch (str) {
            case "nanoleaf.panel":
                dVar = d.f2134k;
                break;
            case "nanoleaf.essentials":
                dVar = d.f2135l;
                break;
            case "hue.bridge":
                dVar = d.i;
                break;
            case "lifx.light":
                dVar = d.f2133j;
                break;
            default:
                dVar = null;
                break;
        }
        if (dVar == null) {
            return null;
        }
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            deviceHueBridge = new DeviceHueBridge();
        } else if (iOrdinal == 1) {
            deviceHueBridge = new L3.d();
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            deviceHueBridge = new c();
        }
        deviceHueBridge.type = dVar;
        Map<String, String> map = this.identity;
        if (map == null || (bridgeId = map.get("vendorId")) == null) {
            SharedHueDeviceFields sharedHueDeviceFields = this.hue;
            bridgeId = sharedHueDeviceFields != null ? sharedHueDeviceFields.getBridgeId() : null;
            if (bridgeId == null) {
                bridgeId = this.localId;
            }
        }
        deviceHueBridge.id = bridgeId;
        deviceHueBridge.name = this.displayName;
        SharedDeviceConnectionLocal sharedDeviceConnectionLocal = this.connectionLocal;
        deviceHueBridge.ip = sharedDeviceConnectionLocal != null ? sharedDeviceConnectionLocal.getHost() : null;
        SharedDeviceConnectionLocal sharedDeviceConnectionLocal2 = this.connectionLocal;
        deviceHueBridge.port = sharedDeviceConnectionLocal2 != null ? sharedDeviceConnectionLocal2.getPort() : null;
        SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal = this.credentialsLocal;
        if (sharedDeviceCredentialsLocal == null || (username = sharedDeviceCredentialsLocal.getToken()) == null) {
            SharedHueDeviceFields sharedHueDeviceFields2 = this.hue;
            username = sharedHueDeviceFields2 != null ? sharedHueDeviceFields2.getUsername() : null;
            if (username == null) {
                SharedNanoleafDeviceFields sharedNanoleafDeviceFields = this.nanoleaf;
                username = sharedNanoleafDeviceFields != null ? sharedNanoleafDeviceFields.getAuthToken() : null;
            }
        }
        deviceHueBridge.token = username;
        int iOrdinal2 = dVar.ordinal();
        if (iOrdinal2 == 0) {
            DeviceHueBridge deviceHueBridge2 = (DeviceHueBridge) deviceHueBridge;
            SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal2 = this.credentialsLocal;
            if (sharedDeviceCredentialsLocal2 == null || (clientKey = sharedDeviceCredentialsLocal2.getClientKey()) == null) {
                SharedHueDeviceFields sharedHueDeviceFields3 = this.hue;
                clientKey = sharedHueDeviceFields3 != null ? sharedHueDeviceFields3.getClientKey() : null;
            }
            deviceHueBridge2.setClientKey(clientKey);
            SharedHueDeviceFields sharedHueDeviceFields4 = this.hue;
            deviceHueBridge2.setLegacyOnly(sharedHueDeviceFields4 != null ? sharedHueDeviceFields4.getLegacyOnly() : null);
            return deviceHueBridge;
        }
        if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            SharedNanoleafDeviceFields sharedNanoleafDeviceFields2 = this.nanoleaf;
            if (sharedNanoleafDeviceFields2 != null && (model = sharedNanoleafDeviceFields2.getModel()) != null) {
                deviceHueBridge.customInfo.put("model", model);
            }
            SharedNanoleafDeviceFields sharedNanoleafDeviceFields3 = this.nanoleaf;
            if (sharedNanoleafDeviceFields3 != null && (streamControlPort = sharedNanoleafDeviceFields3.getStreamControlPort()) != null) {
                deviceHueBridge.customInfo.put("streamControlPort", String.valueOf(streamControlPort.intValue()));
            }
        }
        return deviceHueBridge;
    }

    public String toString() {
        String str = this.localId;
        String str2 = this.cloudId;
        String str3 = this.revision;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        String str6 = this.type;
        String str7 = this.displayName;
        Map<String, String> map = this.identity;
        SharedDeviceConnectionLocal sharedDeviceConnectionLocal = this.connectionLocal;
        SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal = this.credentialsLocal;
        SharedHueDeviceFields sharedHueDeviceFields = this.hue;
        SharedLifxDeviceFields sharedLifxDeviceFields = this.lifx;
        SharedNanoleafDeviceFields sharedNanoleafDeviceFields = this.nanoleaf;
        StringBuilder sbO = AbstractC0013g0.o("SharedPersistedDevice(localId=", str, ", cloudId=", str2, ", revision=");
        AbstractC0013g0.t(sbO, str3, ", createdAt=", str4, ", updatedAt=");
        AbstractC0013g0.t(sbO, str5, ", type=", str6, ", displayName=");
        sbO.append(str7);
        sbO.append(", identity=");
        sbO.append(map);
        sbO.append(", connectionLocal=");
        sbO.append(sharedDeviceConnectionLocal);
        sbO.append(", credentialsLocal=");
        sbO.append(sharedDeviceCredentialsLocal);
        sbO.append(", hue=");
        sbO.append(sharedHueDeviceFields);
        sbO.append(", lifx=");
        sbO.append(sharedLifxDeviceFields);
        sbO.append(", nanoleaf=");
        sbO.append(sharedNanoleafDeviceFields);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ SharedPersistedDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, SharedDeviceConnectionLocal sharedDeviceConnectionLocal, SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal, SharedHueDeviceFields sharedHueDeviceFields, SharedLifxDeviceFields sharedLifxDeviceFields, SharedNanoleafDeviceFields sharedNanoleafDeviceFields, int i, g gVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : map, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? null : sharedDeviceConnectionLocal, (i & HueLog.LogComponent.APPCORE) != 0 ? null : sharedDeviceCredentialsLocal, (i & 1024) != 0 ? null : sharedHueDeviceFields, (i & 2048) != 0 ? null : sharedLifxDeviceFields, (i & 4096) != 0 ? null : sharedNanoleafDeviceFields);
    }
}
