package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Capabilities implements Item {

    @c("can_play_on_demand")
    @I("can_play_on_demand")
    public final boolean canPlayOnDemand;

    private Capabilities() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Capabilities) && this.canPlayOnDemand == ((Capabilities) obj).canPlayOnDemand;
    }

    public int hashCode() {
        return this.canPlayOnDemand ? 1 : 0;
    }

    public String toString() {
        return "Capabilities{canPlayOnDemand=" + this.canPlayOnDemand + '}';
    }

    public Capabilities(boolean z5) {
        this.canPlayOnDemand = z5;
    }
}
