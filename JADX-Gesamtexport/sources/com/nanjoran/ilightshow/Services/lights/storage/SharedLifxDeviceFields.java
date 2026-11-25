package com.nanjoran.ilightshow.Services.lights.storage;

import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class SharedLifxDeviceFields {
    public static final int $stable = 8;
    private Integer servicePort;
    private String target;

    public SharedLifxDeviceFields() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SharedLifxDeviceFields copy$default(SharedLifxDeviceFields sharedLifxDeviceFields, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedLifxDeviceFields.target;
        }
        if ((i & 2) != 0) {
            num = sharedLifxDeviceFields.servicePort;
        }
        return sharedLifxDeviceFields.copy(str, num);
    }

    public final String component1() {
        return this.target;
    }

    public final Integer component2() {
        return this.servicePort;
    }

    public final SharedLifxDeviceFields copy(String str, Integer num) {
        return new SharedLifxDeviceFields(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedLifxDeviceFields)) {
            return false;
        }
        SharedLifxDeviceFields sharedLifxDeviceFields = (SharedLifxDeviceFields) obj;
        return k.a(this.target, sharedLifxDeviceFields.target) && k.a(this.servicePort, sharedLifxDeviceFields.servicePort);
    }

    public final Integer getServicePort() {
        return this.servicePort;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        String str = this.target;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.servicePort;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setServicePort(Integer num) {
        this.servicePort = num;
    }

    public final void setTarget(String str) {
        this.target = str;
    }

    public String toString() {
        return "SharedLifxDeviceFields(target=" + this.target + ", servicePort=" + this.servicePort + ")";
    }

    public SharedLifxDeviceFields(String str, Integer num) {
        this.target = str;
        this.servicePort = num;
    }

    public /* synthetic */ SharedLifxDeviceFields(String str, Integer num, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
