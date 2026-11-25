package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class A extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10192c;

    public A(float f6) {
        super(3);
        this.f10192c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.f10192c, ((A) obj).f10192c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10192c);
    }

    public final String toString() {
        return k.t(new StringBuilder("VerticalTo(y="), this.f10192c, ')');
    }
}
