package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class t extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10352c;

    public t(float f6) {
        super(3);
        this.f10352c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f10352c, ((t) obj).f10352c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10352c);
    }

    public final String toString() {
        return k.t(new StringBuilder("RelativeHorizontalTo(dx="), this.f10352c, ')');
    }
}
