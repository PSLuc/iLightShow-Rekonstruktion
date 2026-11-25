package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlaybackSpeed implements Item {

    @c("playback_speed")
    @I("playback_speed")
    public final int playbackSpeed;

    public enum PodcastPlaybackSpeed {
        PLAYBACK_SPEED_50(50),
        PLAYBACK_SPEED_80(80),
        PLAYBACK_SPEED_100(100),
        PLAYBACK_SPEED_120(120),
        PLAYBACK_SPEED_150(150),
        PLAYBACK_SPEED_200(200),
        PLAYBACK_SPEED_300(300);

        private final int mValue;

        PodcastPlaybackSpeed(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public PlaybackSpeed() {
        this(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaybackSpeed) && this.playbackSpeed == ((PlaybackSpeed) obj).playbackSpeed;
    }

    public int hashCode() {
        return this.playbackSpeed;
    }

    public String toString() {
        return AbstractC0013g0.k(new StringBuilder("PlaybackSpeed{playbackSpeed="), this.playbackSpeed, '}');
    }

    public PlaybackSpeed(int i) {
        this.playbackSpeed = i;
    }
}
