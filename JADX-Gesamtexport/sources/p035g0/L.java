package p035g0;

import p012c.k;
import p030f0.c;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L f9034d = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9037c;

    public L(long j4, long j6, float f6) {
        this.f9035a = j4;
        this.f9036b = j6;
        this.f9037c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l6 = (L) obj;
        return r.c(this.f9035a, l6.f9035a) && c.b(this.f9036b, l6.f9036b) && this.f9037c == l6.f9037c;
    }

    public final int hashCode() {
        int i = r.f9086m;
        return Float.hashCode(this.f9037c) + k.l(Long.hashCode(this.f9035a) * 31, 31, this.f9036b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        k.z(this.f9035a, sb, ", offset=");
        sb.append((Object) c.j(this.f9036b));
        sb.append(", blurRadius=");
        return k.t(sb, this.f9037c, ')');
    }

    public /* synthetic */ L() {
        this(H.d(4278190080L), 0L, 0.0f);
    }
}
