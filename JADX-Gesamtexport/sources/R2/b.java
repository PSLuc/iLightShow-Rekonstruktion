package R2;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U2.a f4764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4765b;

    public b(U2.a aVar, HashMap map) {
        this.f4764a = aVar;
        this.f4765b = map;
    }

    public final long a(I2.c cVar, long j4, int i) {
        long jD = j4 - this.f4764a.d();
        c cVar2 = (c) this.f4765b.get(cVar);
        long j6 = cVar2.f4766a;
        int i3 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * ((long) i3)))), jD), cVar2.f4767b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4764a.equals(bVar.f4764a) && this.f4765b.equals(bVar.f4765b);
    }

    public final int hashCode() {
        return this.f4765b.hashCode() ^ ((this.f4764a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4764a + ", values=" + this.f4765b + "}";
    }
}
