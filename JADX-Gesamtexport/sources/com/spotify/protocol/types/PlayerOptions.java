package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlayerOptions implements Item {
    public static final PlayerOptions DEFAULT = new PlayerOptions();

    @c("shuffle")
    @I("shuffle")
    public final boolean isShuffling;

    @c("repeat")
    @I("repeat")
    public final int repeatMode;

    private PlayerOptions() {
        this(false, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerOptions)) {
            return false;
        }
        PlayerOptions playerOptions = (PlayerOptions) obj;
        return this.isShuffling == playerOptions.isShuffling && this.repeatMode == playerOptions.repeatMode;
    }

    public int hashCode() {
        return ((this.isShuffling ? 1 : 0) * 31) + this.repeatMode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerOptions{isShuffling=");
        sb.append(this.isShuffling);
        sb.append(", repeatMode=");
        return AbstractC0013g0.k(sb, this.repeatMode, '}');
    }

    public PlayerOptions(boolean z5, int i) {
        this.isShuffling = z5;
        this.repeatMode = i;
    }
}
