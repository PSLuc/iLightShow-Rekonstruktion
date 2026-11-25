package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlayerRestrictions implements Item {
    public static final PlayerRestrictions DEFAULT = new PlayerRestrictions();

    @c("can_repeat_context")
    @I("can_repeat_context")
    public final boolean canRepeatContext;

    @c("can_repeat_track")
    @I("can_repeat_track")
    public final boolean canRepeatTrack;

    @c("can_seek")
    @I("can_seek")
    public final boolean canSeek;

    @c("can_skip_next")
    @I("can_skip_next")
    public final boolean canSkipNext;

    @c("can_skip_prev")
    @I("can_skip_prev")
    public final boolean canSkipPrev;

    @c("can_toggle_shuffle")
    @I("can_toggle_shuffle")
    public final boolean canToggleShuffle;

    private PlayerRestrictions() {
        this(false, false, false, false, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerRestrictions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = (PlayerRestrictions) obj;
        return this.canSkipNext == playerRestrictions.canSkipNext && this.canSkipPrev == playerRestrictions.canSkipPrev && this.canRepeatTrack == playerRestrictions.canRepeatTrack && this.canRepeatContext == playerRestrictions.canRepeatContext && this.canToggleShuffle == playerRestrictions.canToggleShuffle;
    }

    public int hashCode() {
        return ((((((((this.canSkipNext ? 1 : 0) * 31) + (this.canSkipPrev ? 1 : 0)) * 31) + (this.canRepeatTrack ? 1 : 0)) * 31) + (this.canRepeatContext ? 1 : 0)) * 31) + (this.canToggleShuffle ? 1 : 0);
    }

    public String toString() {
        return "PlayerRestrictions{canSkipNext=" + this.canSkipNext + ", canSkipPrev=" + this.canSkipPrev + ", canRepeatTrack=" + this.canRepeatTrack + ", canRepeatContext=" + this.canRepeatContext + ", canToggleShuffle=" + this.canToggleShuffle + '}';
    }

    public PlayerRestrictions(boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.canSkipNext = z5;
        this.canSkipPrev = z6;
        this.canRepeatTrack = z7;
        this.canRepeatContext = z8;
        this.canToggleShuffle = z9;
        this.canSeek = z10;
    }
}
