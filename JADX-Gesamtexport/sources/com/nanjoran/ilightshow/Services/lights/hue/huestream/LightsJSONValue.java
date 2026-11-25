package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import B.AbstractC0013g0;
import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class LightsJSONValue {
    public static final int $stable = 8;
    private final Capabilities capabilities;
    private final String manufacturername;
    private final String modelid;
    private final String name;
    private final String productname;
    private final StateClass state;
    private final String type;
    private final String uniqueid;

    public LightsJSONValue() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ LightsJSONValue copy$default(LightsJSONValue lightsJSONValue, StateClass stateClass, String str, String str2, String str3, String str4, String str5, Capabilities capabilities, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            stateClass = lightsJSONValue.state;
        }
        if ((i & 2) != 0) {
            str = lightsJSONValue.type;
        }
        if ((i & 4) != 0) {
            str2 = lightsJSONValue.name;
        }
        if ((i & 8) != 0) {
            str3 = lightsJSONValue.modelid;
        }
        if ((i & 16) != 0) {
            str4 = lightsJSONValue.manufacturername;
        }
        if ((i & 32) != 0) {
            str5 = lightsJSONValue.productname;
        }
        if ((i & 64) != 0) {
            capabilities = lightsJSONValue.capabilities;
        }
        if ((i & 128) != 0) {
            str6 = lightsJSONValue.uniqueid;
        }
        Capabilities capabilities2 = capabilities;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return lightsJSONValue.copy(stateClass, str, str2, str3, str8, str9, capabilities2, str7);
    }

    public final StateClass component1() {
        return this.state;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.modelid;
    }

    public final String component5() {
        return this.manufacturername;
    }

    public final String component6() {
        return this.productname;
    }

    public final Capabilities component7() {
        return this.capabilities;
    }

    public final String component8() {
        return this.uniqueid;
    }

    public final LightsJSONValue copy(StateClass stateClass, String str, String str2, String str3, String str4, String str5, Capabilities capabilities, String str6) {
        return new LightsJSONValue(stateClass, str, str2, str3, str4, str5, capabilities, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightsJSONValue)) {
            return false;
        }
        LightsJSONValue lightsJSONValue = (LightsJSONValue) obj;
        return k.a(this.state, lightsJSONValue.state) && k.a(this.type, lightsJSONValue.type) && k.a(this.name, lightsJSONValue.name) && k.a(this.modelid, lightsJSONValue.modelid) && k.a(this.manufacturername, lightsJSONValue.manufacturername) && k.a(this.productname, lightsJSONValue.productname) && k.a(this.capabilities, lightsJSONValue.capabilities) && k.a(this.uniqueid, lightsJSONValue.uniqueid);
    }

    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final String getManufacturername() {
        return this.manufacturername;
    }

    public final String getModelid() {
        return this.modelid;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductname() {
        return this.productname;
    }

    public final StateClass getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUniqueid() {
        return this.uniqueid;
    }

    public int hashCode() {
        StateClass stateClass = this.state;
        int iHashCode = (stateClass == null ? 0 : stateClass.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manufacturername;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productname;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Capabilities capabilities = this.capabilities;
        int iHashCode7 = (iHashCode6 + (capabilities == null ? 0 : capabilities.hashCode())) * 31;
        String str6 = this.uniqueid;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StateClass stateClass = this.state;
        String str = this.type;
        String str2 = this.name;
        String str3 = this.modelid;
        String str4 = this.manufacturername;
        String str5 = this.productname;
        Capabilities capabilities = this.capabilities;
        String str6 = this.uniqueid;
        StringBuilder sb = new StringBuilder("LightsJSONValue(state=");
        sb.append(stateClass);
        sb.append(", type=");
        sb.append(str);
        sb.append(", name=");
        AbstractC0013g0.t(sb, str2, ", modelid=", str3, ", manufacturername=");
        AbstractC0013g0.t(sb, str4, ", productname=", str5, ", capabilities=");
        sb.append(capabilities);
        sb.append(", uniqueid=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public LightsJSONValue(StateClass stateClass, String str, String str2, String str3, String str4, String str5, Capabilities capabilities, String str6) {
        this.state = stateClass;
        this.type = str;
        this.name = str2;
        this.modelid = str3;
        this.manufacturername = str4;
        this.productname = str5;
        this.capabilities = capabilities;
        this.uniqueid = str6;
    }

    public /* synthetic */ LightsJSONValue(StateClass stateClass, String str, String str2, String str3, String str4, String str5, Capabilities capabilities, String str6, int i, g gVar) {
        this((i & 1) != 0 ? null : stateClass, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : capabilities, (i & 128) != 0 ? null : str6);
    }
}
