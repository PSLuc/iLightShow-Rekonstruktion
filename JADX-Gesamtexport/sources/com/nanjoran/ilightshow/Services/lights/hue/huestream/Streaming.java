package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class Streaming {
    public static final int $stable = 0;
    private final Boolean proxy;
    private final Boolean renderer;

    public Streaming() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Streaming copy$default(Streaming streaming, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = streaming.renderer;
        }
        if ((i & 2) != 0) {
            bool2 = streaming.proxy;
        }
        return streaming.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.renderer;
    }

    public final Boolean component2() {
        return this.proxy;
    }

    public final Streaming copy(Boolean bool, Boolean bool2) {
        return new Streaming(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Streaming)) {
            return false;
        }
        Streaming streaming = (Streaming) obj;
        return k.a(this.renderer, streaming.renderer) && k.a(this.proxy, streaming.proxy);
    }

    public final Boolean getProxy() {
        return this.proxy;
    }

    public final Boolean getRenderer() {
        return this.renderer;
    }

    public int hashCode() {
        Boolean bool = this.renderer;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.proxy;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Streaming(renderer=" + this.renderer + ", proxy=" + this.proxy + ")";
    }

    public Streaming(Boolean bool, Boolean bool2) {
        this.renderer = bool;
        this.proxy = bool2;
    }

    public /* synthetic */ Streaming(Boolean bool, Boolean bool2, int i, g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
