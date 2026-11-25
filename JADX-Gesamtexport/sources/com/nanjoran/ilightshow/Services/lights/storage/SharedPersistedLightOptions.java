package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import M4.l;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.List;
import p084p4.h;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPersistedLightOptions {
    private Boolean alwaysChangeHue;
    private Boolean ambientOnly;
    private Integer brightnessMax;
    private Integer brightnessMin;
    private String deviceLocalId;
    private String legacyHashId;
    private String lightId;
    private String masterLightId;
    private Float maxNanoleafPercentage;
    private String roomName;
    private Integer segmentCount;
    private String strobeMode;
    private String strobeOffBehavior;
    private String updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final h splitHashId(String str) {
            if (l.i0(str)) {
                return new h(null, null);
            }
            List listS0 = l.s0(str, new String[]{"#"}, false, 2);
            return listS0.size() == 2 ? new h(listS0.get(0), listS0.get(1)) : new h(str, str);
        }

        public final SharedPersistedLightOptions fromLightOptions(String str, D3.h hVar) {
            String str2;
            k.f("hashId", str);
            k.f("options", hVar);
            h hVarSplitHashId = splitHashId(str);
            String str3 = (String) hVarSplitHashId.f10849h;
            if (str3 == null || (str2 = (String) hVarSplitHashId.i) == null) {
                return null;
            }
            return new SharedPersistedLightOptions(str3, str2, str, Integer.valueOf(hVar.f786a), Integer.valueOf(hVar.f787b), Boolean.valueOf(hVar.f788c), hVar.f789d, hVar.f790e, hVar.f793h, hVar.i, Float.valueOf(hVar.f791f), Boolean.valueOf(hVar.f792g), Integer.valueOf(hVar.f794j), null, 8192, null);
        }

        private Companion() {
        }
    }

    public SharedPersistedLightOptions(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Float f6, Boolean bool2, Integer num3, String str8) {
        k.f("lightId", str);
        k.f("deviceLocalId", str2);
        this.lightId = str;
        this.deviceLocalId = str2;
        this.legacyHashId = str3;
        this.brightnessMin = num;
        this.brightnessMax = num2;
        this.ambientOnly = bool;
        this.strobeMode = str4;
        this.strobeOffBehavior = str5;
        this.roomName = str6;
        this.masterLightId = str7;
        this.maxNanoleafPercentage = f6;
        this.alwaysChangeHue = bool2;
        this.segmentCount = num3;
        this.updatedAt = str8;
    }

    public static /* synthetic */ D3.h toLightOptions$default(SharedPersistedLightOptions sharedPersistedLightOptions, String str, int i, Object obj) {
        if ((i & 1) != 0 && (str = sharedPersistedLightOptions.legacyHashId) == null) {
            str = sharedPersistedLightOptions.lightId + "#" + sharedPersistedLightOptions.deviceLocalId;
        }
        return sharedPersistedLightOptions.toLightOptions(str);
    }

    public final String component1() {
        return this.lightId;
    }

    public final String component10() {
        return this.masterLightId;
    }

    public final Float component11() {
        return this.maxNanoleafPercentage;
    }

    public final Boolean component12() {
        return this.alwaysChangeHue;
    }

    public final Integer component13() {
        return this.segmentCount;
    }

    public final String component14() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.deviceLocalId;
    }

    public final String component3() {
        return this.legacyHashId;
    }

    public final Integer component4() {
        return this.brightnessMin;
    }

    public final Integer component5() {
        return this.brightnessMax;
    }

    public final Boolean component6() {
        return this.ambientOnly;
    }

    public final String component7() {
        return this.strobeMode;
    }

    public final String component8() {
        return this.strobeOffBehavior;
    }

    public final String component9() {
        return this.roomName;
    }

    public final SharedPersistedLightOptions copy(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Float f6, Boolean bool2, Integer num3, String str8) {
        k.f("lightId", str);
        k.f("deviceLocalId", str2);
        return new SharedPersistedLightOptions(str, str2, str3, num, num2, bool, str4, str5, str6, str7, f6, bool2, num3, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPersistedLightOptions)) {
            return false;
        }
        SharedPersistedLightOptions sharedPersistedLightOptions = (SharedPersistedLightOptions) obj;
        return k.a(this.lightId, sharedPersistedLightOptions.lightId) && k.a(this.deviceLocalId, sharedPersistedLightOptions.deviceLocalId) && k.a(this.legacyHashId, sharedPersistedLightOptions.legacyHashId) && k.a(this.brightnessMin, sharedPersistedLightOptions.brightnessMin) && k.a(this.brightnessMax, sharedPersistedLightOptions.brightnessMax) && k.a(this.ambientOnly, sharedPersistedLightOptions.ambientOnly) && k.a(this.strobeMode, sharedPersistedLightOptions.strobeMode) && k.a(this.strobeOffBehavior, sharedPersistedLightOptions.strobeOffBehavior) && k.a(this.roomName, sharedPersistedLightOptions.roomName) && k.a(this.masterLightId, sharedPersistedLightOptions.masterLightId) && k.a(this.maxNanoleafPercentage, sharedPersistedLightOptions.maxNanoleafPercentage) && k.a(this.alwaysChangeHue, sharedPersistedLightOptions.alwaysChangeHue) && k.a(this.segmentCount, sharedPersistedLightOptions.segmentCount) && k.a(this.updatedAt, sharedPersistedLightOptions.updatedAt);
    }

    public final Boolean getAlwaysChangeHue() {
        return this.alwaysChangeHue;
    }

    public final Boolean getAmbientOnly() {
        return this.ambientOnly;
    }

    public final Integer getBrightnessMax() {
        return this.brightnessMax;
    }

    public final Integer getBrightnessMin() {
        return this.brightnessMin;
    }

    public final String getDeviceLocalId() {
        return this.deviceLocalId;
    }

    public final String getLegacyHashId() {
        return this.legacyHashId;
    }

    public final String getLightId() {
        return this.lightId;
    }

    public final String getMasterLightId() {
        return this.masterLightId;
    }

    public final Float getMaxNanoleafPercentage() {
        return this.maxNanoleafPercentage;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final Integer getSegmentCount() {
        return this.segmentCount;
    }

    public final String getStrobeMode() {
        return this.strobeMode;
    }

    public final String getStrobeOffBehavior() {
        return this.strobeOffBehavior;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iC = AbstractC0013g0.c(this.lightId.hashCode() * 31, this.deviceLocalId, 31);
        String str = this.legacyHashId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.brightnessMin;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.brightnessMax;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.ambientOnly;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.strobeMode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.strobeOffBehavior;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.roomName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.masterLightId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f6 = this.maxNanoleafPercentage;
        int iHashCode9 = (iHashCode8 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Boolean bool2 = this.alwaysChangeHue;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.segmentCount;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.updatedAt;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAlwaysChangeHue(Boolean bool) {
        this.alwaysChangeHue = bool;
    }

    public final void setAmbientOnly(Boolean bool) {
        this.ambientOnly = bool;
    }

    public final void setBrightnessMax(Integer num) {
        this.brightnessMax = num;
    }

    public final void setBrightnessMin(Integer num) {
        this.brightnessMin = num;
    }

    public final void setDeviceLocalId(String str) {
        k.f("<set-?>", str);
        this.deviceLocalId = str;
    }

    public final void setLegacyHashId(String str) {
        this.legacyHashId = str;
    }

    public final void setLightId(String str) {
        k.f("<set-?>", str);
        this.lightId = str;
    }

    public final void setMasterLightId(String str) {
        this.masterLightId = str;
    }

    public final void setMaxNanoleafPercentage(Float f6) {
        this.maxNanoleafPercentage = f6;
    }

    public final void setRoomName(String str) {
        this.roomName = str;
    }

    public final void setSegmentCount(Integer num) {
        this.segmentCount = num;
    }

    public final void setStrobeMode(String str) {
        this.strobeMode = str;
    }

    public final void setStrobeOffBehavior(String str) {
        this.strobeOffBehavior = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final D3.h toLightOptions(String str) {
        k.f("hashId", str);
        D3.h hVar = new D3.h(str);
        Integer num = this.brightnessMin;
        if (num != null) {
            hVar.f786a = num.intValue();
        }
        Integer num2 = this.brightnessMax;
        if (num2 != null) {
            hVar.f787b = num2.intValue();
        }
        Boolean bool = this.ambientOnly;
        if (bool != null) {
            hVar.f788c = bool.booleanValue();
        }
        String str2 = this.strobeMode;
        if (str2 != null) {
            hVar.f789d = str2;
        }
        String str3 = this.strobeOffBehavior;
        if (str3 != null) {
            hVar.f790e = str3;
        }
        Float f6 = this.maxNanoleafPercentage;
        if (f6 != null) {
            hVar.f791f = f6.floatValue();
        }
        Boolean bool2 = this.alwaysChangeHue;
        if (bool2 != null) {
            hVar.f792g = bool2.booleanValue();
        }
        hVar.f793h = this.roomName;
        hVar.i = this.masterLightId;
        Integer num3 = this.segmentCount;
        if (num3 != null) {
            hVar.f794j = num3.intValue();
        }
        return hVar;
    }

    public String toString() {
        String str = this.lightId;
        String str2 = this.deviceLocalId;
        String str3 = this.legacyHashId;
        Integer num = this.brightnessMin;
        Integer num2 = this.brightnessMax;
        Boolean bool = this.ambientOnly;
        String str4 = this.strobeMode;
        String str5 = this.strobeOffBehavior;
        String str6 = this.roomName;
        String str7 = this.masterLightId;
        Float f6 = this.maxNanoleafPercentage;
        Boolean bool2 = this.alwaysChangeHue;
        Integer num3 = this.segmentCount;
        String str8 = this.updatedAt;
        StringBuilder sbO = AbstractC0013g0.o("SharedPersistedLightOptions(lightId=", str, ", deviceLocalId=", str2, ", legacyHashId=");
        sbO.append(str3);
        sbO.append(", brightnessMin=");
        sbO.append(num);
        sbO.append(", brightnessMax=");
        sbO.append(num2);
        sbO.append(", ambientOnly=");
        sbO.append(bool);
        sbO.append(", strobeMode=");
        AbstractC0013g0.t(sbO, str4, ", strobeOffBehavior=", str5, ", roomName=");
        AbstractC0013g0.t(sbO, str6, ", masterLightId=", str7, ", maxNanoleafPercentage=");
        sbO.append(f6);
        sbO.append(", alwaysChangeHue=");
        sbO.append(bool2);
        sbO.append(", segmentCount=");
        sbO.append(num3);
        sbO.append(", updatedAt=");
        sbO.append(str8);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ SharedPersistedLightOptions(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Float f6, Boolean bool2, Integer num3, String str8, int i, g gVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? null : str6, (i & HueLog.LogComponent.APPCORE) != 0 ? null : str7, (i & 1024) != 0 ? null : f6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : str8);
    }
}
