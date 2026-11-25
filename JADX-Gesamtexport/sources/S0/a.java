package S0;

import B.AbstractC0013g0;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4883a;

    public /* synthetic */ a(long j4) {
        this.f4883a = j4;
    }

    public static long a(long j4, int i, int i3, int i6, int i7, int i8) {
        if ((i8 & 1) != 0) {
            i = j(j4);
        }
        if ((i8 & 2) != 0) {
            i3 = h(j4);
        }
        if ((i8 & 4) != 0) {
            i6 = i(j4);
        }
        if ((i8 & 8) != 0) {
            i7 = g(j4);
        }
        if (!(i6 >= 0 && i >= 0)) {
            V.N("minHeight(" + i6 + ") and minWidth(" + i + ") must be >= 0");
            throw null;
        }
        if (!(i3 >= i)) {
            V.N("maxWidth(" + i3 + ") must be >= minWidth(" + i + ')');
            throw null;
        }
        if (i7 >= i6) {
            return p081p0.c.W(i, i3, i6, i7);
        }
        V.N("maxHeight(" + i7 + ") must be >= minHeight(" + i6 + ')');
        throw null;
    }

    public static final boolean b(long j4, long j6) {
        return j4 == j6;
    }

    public static final boolean c(long j4) {
        int i = (int) (3 & j4);
        int i3 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j4 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    public static final boolean d(long j4) {
        int i = (int) (3 & j4);
        return (((int) (j4 >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j4) {
        int i = (int) (3 & j4);
        int i3 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i6 = (1 << (18 - i3)) - 1;
        int i7 = ((int) (j4 >> (i3 + 15))) & i6;
        int i8 = ((int) (j4 >> (i3 + 46))) & i6;
        return i7 == (i8 == 0 ? Integer.MAX_VALUE : i8 - 1);
    }

    public static final boolean f(long j4) {
        int i = (int) (3 & j4);
        int i3 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i6 = ((int) (j4 >> 2)) & i3;
        int i7 = ((int) (j4 >> 33)) & i3;
        return i6 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static final int g(long j4) {
        int i = (int) (3 & j4);
        int i3 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i6 = ((int) (j4 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i6 == 0) {
            return Integer.MAX_VALUE;
        }
        return i6 - 1;
    }

    public static final int h(long j4) {
        int i = (int) (3 & j4);
        int i3 = (int) (j4 >> 33);
        int i6 = i3 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i6 == 0) {
            return Integer.MAX_VALUE;
        }
        return i6 - 1;
    }

    public static final int i(long j4) {
        int i = (int) (3 & j4);
        int i3 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j4 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    public static final int j(long j4) {
        int i = (int) (3 & j4);
        return ((int) (j4 >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j4) {
        int iH = h(j4);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j4);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j4));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j4));
        sb.append(", maxHeight = ");
        return AbstractC0013g0.m(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f4883a == ((a) obj).f4883a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4883a);
    }

    public final String toString() {
        return k(this.f4883a);
    }
}
