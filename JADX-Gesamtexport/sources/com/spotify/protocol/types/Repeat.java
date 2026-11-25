package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Repeat implements Item {
    public static final int ALL = 2;
    public static final int OFF = 0;
    public static final int ONE = 1;

    @c("repeat")
    @I("repeat")
    public final int repeat;

    private Repeat() {
        this(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Repeat) && this.repeat == ((Repeat) obj).repeat;
    }

    public int hashCode() {
        return this.repeat;
    }

    public String toString() {
        return AbstractC0013g0.k(new StringBuilder("Repeat{repeat="), this.repeat, '}');
    }

    public Repeat(int i) {
        this.repeat = i;
    }
}
