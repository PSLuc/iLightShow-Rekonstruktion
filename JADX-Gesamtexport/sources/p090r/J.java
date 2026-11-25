package p090r;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11382c;

    public J(float f6, float f7, long j4) {
        this.f11380a = f6;
        this.f11381b = f7;
        this.f11382c = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        return Float.compare(this.f11380a, j4.f11380a) == 0 && Float.compare(this.f11381b, j4.f11381b) == 0 && this.f11382c == j4.f11382c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11382c) + k.i(this.f11381b, Float.hashCode(this.f11380a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f11380a + ", distance=" + this.f11381b + ", duration=" + this.f11382c + ')';
    }
}
