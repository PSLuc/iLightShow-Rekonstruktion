package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class Capabilities {
    public static final int $stable = 8;
    private final Boolean certified;
    private final Control control;
    private final Streaming streaming;

    public Capabilities() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Capabilities copy$default(Capabilities capabilities, Boolean bool, Control control, Streaming streaming, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = capabilities.certified;
        }
        if ((i & 2) != 0) {
            control = capabilities.control;
        }
        if ((i & 4) != 0) {
            streaming = capabilities.streaming;
        }
        return capabilities.copy(bool, control, streaming);
    }

    public final Boolean component1() {
        return this.certified;
    }

    public final Control component2() {
        return this.control;
    }

    public final Streaming component3() {
        return this.streaming;
    }

    public final Capabilities copy(Boolean bool, Control control, Streaming streaming) {
        return new Capabilities(bool, control, streaming);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capabilities)) {
            return false;
        }
        Capabilities capabilities = (Capabilities) obj;
        return k.a(this.certified, capabilities.certified) && k.a(this.control, capabilities.control) && k.a(this.streaming, capabilities.streaming);
    }

    public final Boolean getCertified() {
        return this.certified;
    }

    public final Control getControl() {
        return this.control;
    }

    public final Streaming getStreaming() {
        return this.streaming;
    }

    public int hashCode() {
        Boolean bool = this.certified;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Control control = this.control;
        int iHashCode2 = (iHashCode + (control == null ? 0 : control.hashCode())) * 31;
        Streaming streaming = this.streaming;
        return iHashCode2 + (streaming != null ? streaming.hashCode() : 0);
    }

    public String toString() {
        return "Capabilities(certified=" + this.certified + ", control=" + this.control + ", streaming=" + this.streaming + ")";
    }

    public Capabilities(Boolean bool, Control control, Streaming streaming) {
        this.certified = bool;
        this.control = control;
        this.streaming = streaming;
    }

    public /* synthetic */ Capabilities(Boolean bool, Control control, Streaming streaming, int i, g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : control, (i & 4) != 0 ? null : streaming);
    }
}
