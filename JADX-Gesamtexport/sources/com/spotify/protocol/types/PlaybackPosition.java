package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlaybackPosition implements Item {

    @c("position_ms")
    @I("position_ms")
    public final long position;

    private PlaybackPosition() {
        this(0L);
    }

    public PlaybackPosition(long j4) {
        this.position = j4;
    }
}
