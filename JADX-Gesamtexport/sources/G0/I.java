package G0;

import B.AbstractC0013g0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1468b = AbstractC0599v0.d(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1469c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1470a;

    public /* synthetic */ I(long j4) {
        this.f1470a = j4;
    }

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public static final boolean b(long j4) {
        return ((int) (j4 >> 32)) == ((int) (j4 & 4294967295L));
    }

    public static final int c(long j4) {
        return d(j4) - e(j4);
    }

    public static final int d(long j4) {
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        return i > i3 ? i : i3;
    }

    public static final int e(long j4) {
        int i = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        return i > i3 ? i3 : i;
    }

    public static final boolean f(long j4) {
        return ((int) (j4 >> 32)) > ((int) (j4 & 4294967295L));
    }

    public static String g(long j4) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return AbstractC0013g0.k(sb, (int) (j4 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            return this.f1470a == ((I) obj).f1470a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1470a);
    }

    public final String toString() {
        return g(this.f1470a);
    }
}
