package F;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1153b;

    public Y(long j4, long j6) {
        this.f1152a = j4;
        this.f1153b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y2 = (Y) obj;
        return p035g0.r.c(this.f1152a, y2.f1152a) && p035g0.r.c(this.f1153b, y2.f1153b);
    }

    public final int hashCode() {
        int i = p035g0.r.f9086m;
        return Long.hashCode(this.f1153b) + (Long.hashCode(this.f1152a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        p012c.k.z(this.f1152a, sb, ", selectionBackgroundColor=");
        sb.append((Object) p035g0.r.i(this.f1153b));
        sb.append(')');
        return sb.toString();
    }
}
