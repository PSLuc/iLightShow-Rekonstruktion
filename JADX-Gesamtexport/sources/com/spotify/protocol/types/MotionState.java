package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class MotionState implements Item {
    public static final int DETECTED = 2;
    public static final int DETECTING = 1;
    public static final int ERROR = 3;
    public static final int INITIAL = 0;
    public static final int SKIPPED = 4;
    public static final int UNKNOWN = -1;

    @c(AccountsQueryParameters.STATE)
    @I(AccountsQueryParameters.STATE)
    public final int state;

    private MotionState() {
        this(-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MotionState) && this.state == ((MotionState) obj).state;
    }

    public int hashCode() {
        return this.state;
    }

    public String toString() {
        return AbstractC0013g0.k(new StringBuilder("MotionState{state="), this.state, '}');
    }

    public MotionState(int i) {
        this.state = i;
    }
}
