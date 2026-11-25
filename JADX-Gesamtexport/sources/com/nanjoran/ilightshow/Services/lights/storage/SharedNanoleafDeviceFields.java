package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class SharedNanoleafDeviceFields {
    public static final int $stable = 8;
    private String authToken;
    private String model;
    private String serialNo;
    private Integer streamControlPort;

    public SharedNanoleafDeviceFields() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SharedNanoleafDeviceFields copy$default(SharedNanoleafDeviceFields sharedNanoleafDeviceFields, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedNanoleafDeviceFields.model;
        }
        if ((i & 2) != 0) {
            str2 = sharedNanoleafDeviceFields.serialNo;
        }
        if ((i & 4) != 0) {
            num = sharedNanoleafDeviceFields.streamControlPort;
        }
        if ((i & 8) != 0) {
            str3 = sharedNanoleafDeviceFields.authToken;
        }
        return sharedNanoleafDeviceFields.copy(str, str2, num, str3);
    }

    public final String component1() {
        return this.model;
    }

    public final String component2() {
        return this.serialNo;
    }

    public final Integer component3() {
        return this.streamControlPort;
    }

    public final String component4() {
        return this.authToken;
    }

    public final SharedNanoleafDeviceFields copy(String str, String str2, Integer num, String str3) {
        return new SharedNanoleafDeviceFields(str, str2, num, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedNanoleafDeviceFields)) {
            return false;
        }
        SharedNanoleafDeviceFields sharedNanoleafDeviceFields = (SharedNanoleafDeviceFields) obj;
        return k.a(this.model, sharedNanoleafDeviceFields.model) && k.a(this.serialNo, sharedNanoleafDeviceFields.serialNo) && k.a(this.streamControlPort, sharedNanoleafDeviceFields.streamControlPort) && k.a(this.authToken, sharedNanoleafDeviceFields.authToken);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getSerialNo() {
        return this.serialNo;
    }

    public final Integer getStreamControlPort() {
        return this.streamControlPort;
    }

    public int hashCode() {
        String str = this.model;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serialNo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.streamControlPort;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.authToken;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAuthToken(String str) {
        this.authToken = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setSerialNo(String str) {
        this.serialNo = str;
    }

    public final void setStreamControlPort(Integer num) {
        this.streamControlPort = num;
    }

    public String toString() {
        String str = this.model;
        String str2 = this.serialNo;
        Integer num = this.streamControlPort;
        String str3 = this.authToken;
        StringBuilder sbO = AbstractC0013g0.o("SharedNanoleafDeviceFields(model=", str, ", serialNo=", str2, ", streamControlPort=");
        sbO.append(num);
        sbO.append(", authToken=");
        sbO.append(str3);
        sbO.append(")");
        return sbO.toString();
    }

    public SharedNanoleafDeviceFields(String str, String str2, Integer num, String str3) {
        this.model = str;
        this.serialNo = str2;
        this.streamControlPort = num;
        this.authToken = str3;
    }

    public /* synthetic */ SharedNanoleafDeviceFields(String str, String str2, Integer num, String str3, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
