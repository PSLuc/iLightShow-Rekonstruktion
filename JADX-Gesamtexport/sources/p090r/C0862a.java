package p090r;

import p012c.k;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0862a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11396b;

    public C0862a(float f6, float f7) {
        this.f11395a = f6;
        this.f11396b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0862a)) {
            return false;
        }
        C0862a c0862a = (C0862a) obj;
        return Float.compare(this.f11395a, c0862a.f11395a) == 0 && Float.compare(this.f11396b, c0862a.f11396b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11396b) + (Float.hashCode(this.f11395a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f11395a);
        sb.append(", velocityCoefficient=");
        return k.t(sb, this.f11396b, ')');
    }
}
