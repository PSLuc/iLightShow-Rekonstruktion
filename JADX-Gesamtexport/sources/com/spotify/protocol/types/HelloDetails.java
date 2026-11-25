package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import java.util.Arrays;
import java.util.Map;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class HelloDetails implements Item {

    @c("authid")
    @I("authid")
    public final String authid;

    @c("authmethods")
    @I("authmethods")
    public final String[] authmethods;

    @c("extras")
    @I("extras")
    public final Map<String, String> extras;

    @c("info")
    @I("info")
    public final Info info;

    @c("roles")
    @I("roles")
    public final Roles roles;

    private HelloDetails() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelloDetails)) {
            return false;
        }
        HelloDetails helloDetails = (HelloDetails) obj;
        Roles roles = this.roles;
        if (roles == null ? helloDetails.roles != null : !roles.equals(helloDetails.roles)) {
            return false;
        }
        Info info = this.info;
        if (info == null ? helloDetails.info != null : !info.equals(helloDetails.info)) {
            return false;
        }
        if (!Arrays.equals(this.authmethods, helloDetails.authmethods)) {
            return false;
        }
        String str = this.authid;
        if (str == null ? helloDetails.authid != null : !str.equals(helloDetails.authid)) {
            return false;
        }
        Map<String, String> map = this.extras;
        if (map != null) {
            return map.equals(helloDetails.extras);
        }
        return helloDetails.extras == null;
    }

    public int hashCode() {
        Roles roles = this.roles;
        int iHashCode = (roles != null ? roles.hashCode() : 0) * 31;
        Info info = this.info;
        int iHashCode2 = (((iHashCode + (info != null ? info.hashCode() : 0)) * 31) + Arrays.hashCode(this.authmethods)) * 31;
        String str = this.authid;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.extras;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "HelloDetails{roles=" + this.roles + ", info=" + this.info + ", authmethods=" + Arrays.toString(this.authmethods) + ", authid='" + this.authid + "', extras=" + this.extras + '}';
    }

    public HelloDetails(Roles roles, Info info, String[] strArr, String str, Map<String, String> map) {
        this.roles = roles;
        this.info = info;
        this.authmethods = strArr;
        this.authid = str;
        this.extras = map;
    }
}
