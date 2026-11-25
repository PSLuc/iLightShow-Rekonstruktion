package v5;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13318c = new f(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13320b;

    public f(int i, long j4) {
        this.f13319a = j4;
        this.f13320b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13319a == fVar.f13319a && this.f13320b == fVar.f13320b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13320b) + (Long.hashCode(this.f13319a) * 31);
    }

    public final String toString() {
        return "FirmwareVersion(build=" + this.f13319a + ", version=" + this.f13320b + ")";
    }
}
