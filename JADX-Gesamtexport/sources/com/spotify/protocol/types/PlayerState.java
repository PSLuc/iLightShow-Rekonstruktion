package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlayerState implements Item {

    @c("is_paused")
    @I("is_paused")
    public final boolean isPaused;

    @c("playback_options")
    @I("playback_options")
    public final PlayerOptions playbackOptions;

    @c("playback_position")
    @I("playback_position")
    public final long playbackPosition;

    @c("playback_restrictions")
    @I("playback_restrictions")
    public final PlayerRestrictions playbackRestrictions;

    @c("playback_speed")
    @I("playback_speed")
    public final float playbackSpeed;

    @c("track")
    @I("track")
    public final Track track;

    private PlayerState() {
        this(null, false, 0.0f, 0L, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) obj;
        if (this.isPaused != playerState.isPaused || Float.compare(playerState.playbackSpeed, this.playbackSpeed) != 0 || this.playbackPosition != playerState.playbackPosition) {
            return false;
        }
        Track track = this.track;
        if (track == null ? playerState.track != null : !track.equals(playerState.track)) {
            return false;
        }
        PlayerOptions playerOptions = this.playbackOptions;
        if (playerOptions == null ? playerState.playbackOptions != null : !playerOptions.equals(playerState.playbackOptions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        if (playerRestrictions != null) {
            return playerRestrictions.equals(playerState.playbackRestrictions);
        }
        return playerState.playbackRestrictions == null;
    }

    public int hashCode() {
        Track track = this.track;
        int iHashCode = (((track != null ? track.hashCode() : 0) * 31) + (this.isPaused ? 1 : 0)) * 31;
        float f6 = this.playbackSpeed;
        int iFloatToIntBits = (iHashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        long j4 = this.playbackPosition;
        int i = (iFloatToIntBits + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        PlayerOptions playerOptions = this.playbackOptions;
        int iHashCode2 = (i + (playerOptions != null ? playerOptions.hashCode() : 0)) * 31;
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        return iHashCode2 + (playerRestrictions != null ? playerRestrictions.hashCode() : 0);
    }

    public String toString() {
        return "PlayerState{track=" + this.track + ", isPaused=" + this.isPaused + ", playbackSpeed=" + this.playbackSpeed + ", playbackPosition=" + this.playbackPosition + ", playbackOptions=" + this.playbackOptions + ", playbackRestrictions=" + this.playbackRestrictions + '}';
    }

    public PlayerState(Track track, boolean z5, float f6, long j4, PlayerOptions playerOptions, PlayerRestrictions playerRestrictions) {
        this.track = track;
        this.isPaused = z5;
        this.playbackSpeed = f6;
        this.playbackPosition = j4;
        this.playbackOptions = playerOptions == null ? PlayerOptions.DEFAULT : playerOptions;
        this.playbackRestrictions = playerRestrictions == null ? PlayerRestrictions.DEFAULT : playerRestrictions;
    }
}
