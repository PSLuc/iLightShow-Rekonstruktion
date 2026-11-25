package R2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f4768c;

    public c(long j4, long j6, Set set) {
        this.f4766a = j4;
        this.f4767b = j6;
        this.f4768c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f4766a == cVar.f4766a && this.f4767b == cVar.f4767b && this.f4768c.equals(cVar.f4768c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f4766a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f4767b;
        return this.f4768c.hashCode() ^ ((i ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4766a + ", maxAllowedDelay=" + this.f4767b + ", flags=" + this.f4768c + "}";
    }
}
