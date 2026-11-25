package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class WelcomeDetails implements Item {

    @c("roles")
    @I("roles")
    public final Roles roles;

    private WelcomeDetails() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomeDetails)) {
            return false;
        }
        WelcomeDetails welcomeDetails = (WelcomeDetails) obj;
        Roles roles = this.roles;
        if (roles != null) {
            return roles.equals(welcomeDetails.roles);
        }
        return welcomeDetails.roles == null;
    }

    public int hashCode() {
        Roles roles = this.roles;
        if (roles != null) {
            return roles.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "WelcomeDetails{roles=" + this.roles + '}';
    }

    public WelcomeDetails(Roles roles) {
        this.roles = roles;
    }
}
