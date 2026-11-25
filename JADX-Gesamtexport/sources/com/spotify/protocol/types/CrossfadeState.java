package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.B;
import S1.EnumC0363z;
import S1.I;
import S1.InterfaceC0361x;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
@B(EnumC0363z.i)
public class CrossfadeState implements Item {

    @I("duration")
    public int duration;

    @I("isEnabled")
    public boolean isEnabled;

    public CrossfadeState(boolean z5, int i) {
        this.isEnabled = z5;
        this.duration = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossfadeState)) {
            return false;
        }
        CrossfadeState crossfadeState = (CrossfadeState) obj;
        return this.isEnabled == crossfadeState.isEnabled && this.duration == crossfadeState.duration;
    }

    public int hashCode() {
        return ((this.isEnabled ? 1 : 0) * 31) + this.duration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CrossfadeState{isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", duration=");
        return AbstractC0013g0.k(sb, this.duration, '}');
    }
}
