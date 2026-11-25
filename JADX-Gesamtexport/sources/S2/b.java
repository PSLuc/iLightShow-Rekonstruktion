package S2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L2.i f4995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L2.h f4996c;

    public b(long j4, L2.i iVar, L2.h hVar) {
        this.f4994a = j4;
        this.f4995b = iVar;
        this.f4996c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4994a == bVar.f4994a && this.f4995b.equals(bVar.f4995b) && this.f4996c.equals(bVar.f4996c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f4994a;
        return this.f4996c.hashCode() ^ ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f4995b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4994a + ", transportContext=" + this.f4995b + ", event=" + this.f4996c + "}";
    }
}
