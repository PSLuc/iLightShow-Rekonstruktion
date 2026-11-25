package p107u;

import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12637a;

    public j(long j4) {
        this.f12637a = j4;
        if (!c.s0(j4)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return p030f0.c.b(this.f12637a, ((j) obj).f12637a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f12637a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) p030f0.c.j(this.f12637a)) + ')';
    }
}
