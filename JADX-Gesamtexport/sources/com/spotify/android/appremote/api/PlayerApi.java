package com.spotify.android.appremote.api;

import S1.I;
import com.spotify.protocol.client.CallResult;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.CrossfadeState;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.PlaybackSpeed;
import com.spotify.protocol.types.PlayerContext;
import com.spotify.protocol.types.PlayerState;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
public interface PlayerApi {

    public enum StreamType {
        ALARM("alarm");


        @c("type")
        @I("type")
        public final String name;

        StreamType(String str) {
            this.name = str;
        }
    }

    CallResult<CrossfadeState> getCrossfadeState();

    CallResult<PlayerState> getPlayerState();

    CallResult<Empty> pause();

    CallResult<Empty> play(String str);

    CallResult<Empty> play(String str, StreamType streamType);

    CallResult<Empty> queue(String str);

    CallResult<Empty> resume();

    CallResult<Empty> seekTo(long j4);

    CallResult<Empty> seekToRelativePosition(long j4);

    CallResult<Empty> setPodcastPlaybackSpeed(PlaybackSpeed.PodcastPlaybackSpeed podcastPlaybackSpeed);

    CallResult<Empty> setRepeat(int i);

    CallResult<Empty> setShuffle(boolean z5);

    CallResult<Empty> skipNext();

    CallResult<Empty> skipPrevious();

    CallResult<Empty> skipToIndex(String str, int i);

    Subscription<PlayerContext> subscribeToPlayerContext();

    Subscription<PlayerState> subscribeToPlayerState();

    CallResult<Empty> toggleRepeat();

    CallResult<Empty> toggleShuffle();
}
