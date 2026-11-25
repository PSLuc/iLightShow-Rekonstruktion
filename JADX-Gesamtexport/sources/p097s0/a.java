package p097s0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12150b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12149a == aVar.f12149a && Float.compare(this.f12150b, aVar.f12150b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12150b) + (Long.hashCode(this.f12149a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f12149a);
        sb.append(", dataPoint=");
        return k.t(sb, this.f12150b, ')');
    }
}
