package S2;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4988f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4993e;

    public a(long j4, int i, int i3, long j6, int i6) {
        this.f4989a = j4;
        this.f4990b = i;
        this.f4991c = i3;
        this.f4992d = j6;
        this.f4993e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4989a == aVar.f4989a && this.f4990b == aVar.f4990b && this.f4991c == aVar.f4991c && this.f4992d == aVar.f4992d && this.f4993e == aVar.f4993e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f4989a;
        int i = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f4990b) * 1000003) ^ this.f4991c) * 1000003;
        long j6 = this.f4992d;
        return this.f4993e ^ ((i ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f4989a);
        sb.append(", loadBatchSize=");
        sb.append(this.f4990b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f4991c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f4992d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0013g0.l(sb, this.f4993e, "}");
    }
}
