package p080p;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f10714a = {-9187201950435737345L, -1};

    static {
        new x(0);
    }

    public static final void a(long[] jArr, int i) {
        k.f("metadata", jArr);
        int i3 = (i + 7) >> 3;
        for (int i6 = 0; i6 < i3; i6++) {
            long j4 = jArr[i6] & (-9187201950435737472L);
            jArr[i6] = (-72340172838076674L) & ((~j4) + (j4 >>> 7));
        }
        int length = jArr.length;
        int i7 = length - 1;
        int i8 = length - 2;
        jArr[i8] = (jArr[i8] & 72057594037927935L) | (-72057594037927936L);
        jArr[i7] = jArr[0];
    }

    public static final int b(long[] jArr, int i, int i3) {
        k.f("metadata", jArr);
        while (i < i3) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int c(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int d(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int e(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int f(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
