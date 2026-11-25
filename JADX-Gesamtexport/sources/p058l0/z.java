package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class z extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10367c;

    public z(float f6) {
        super(3);
        this.f10367c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f10367c, ((z) obj).f10367c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10367c);
    }

    public final String toString() {
        return k.t(new StringBuilder("RelativeVerticalTo(dy="), this.f10367c, ')');
    }
}
