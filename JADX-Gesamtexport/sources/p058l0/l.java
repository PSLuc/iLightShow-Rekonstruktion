package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class l extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10325c;

    public l(float f6) {
        super(3);
        this.f10325c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f10325c, ((l) obj).f10325c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10325c);
    }

    public final String toString() {
        return k.t(new StringBuilder("HorizontalTo(x="), this.f10325c, ')');
    }
}
