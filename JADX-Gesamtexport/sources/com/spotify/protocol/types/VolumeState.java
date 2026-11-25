package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import javax.annotation.Nullable;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class VolumeState implements Item {

    @c("volume")
    @I("volume")
    public final float mVolume;

    public VolumeState(float f6) {
        this.mVolume = f6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VolumeState) && Float.compare(((VolumeState) obj).mVolume, this.mVolume) == 0;
    }

    public int hashCode() {
        float f6 = this.mVolume;
        if (f6 != 0.0f) {
            return Float.floatToIntBits(f6);
        }
        return 0;
    }
}
