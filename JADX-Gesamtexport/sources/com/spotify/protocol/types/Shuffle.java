package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Shuffle implements Item {

    @c("shuffle")
    @I("shuffle")
    public final boolean shuffle;

    private Shuffle() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Shuffle) && this.shuffle == ((Shuffle) obj).shuffle;
    }

    public int hashCode() {
        return this.shuffle ? 1 : 0;
    }

    public String toString() {
        return "Shuffle{shuffle=" + this.shuffle + '}';
    }

    public Shuffle(boolean z5) {
        this.shuffle = z5;
    }
}
