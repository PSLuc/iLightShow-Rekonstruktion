package p084p4;

import E4.k;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10862h;

    public /* synthetic */ s(long j4) {
        this.f10862h = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = ((s) obj).f10862h;
        long j6 = this.f10862h ^ Long.MIN_VALUE;
        long j7 = j4 ^ Long.MIN_VALUE;
        if (j6 < j7) {
            return -1;
        }
        return j6 == j7 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f10862h == ((s) obj).f10862h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10862h);
    }

    public final String toString() {
        long j4 = this.f10862h;
        if (j4 >= 0) {
            V.t(10);
            String string = Long.toString(j4, 10);
            k.e("toString(...)", string);
            return string;
        }
        long j6 = 10;
        long j7 = ((j4 >>> 1) / j6) << 1;
        long j8 = j4 - (j7 * j6);
        if (j8 >= j6) {
            j8 -= j6;
            j7++;
        }
        V.t(10);
        String string2 = Long.toString(j7, 10);
        k.e("toString(...)", string2);
        V.t(10);
        String string3 = Long.toString(j8, 10);
        k.e("toString(...)", string3);
        return string2.concat(string3);
    }
}
