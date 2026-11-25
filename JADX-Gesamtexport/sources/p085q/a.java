package p085q;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f11185a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f11186b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f11187c = new Object[0];

    public static final int a(int i, int i3, int[] iArr) {
        k.f("array", iArr);
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final int b(long[] jArr, int i, long j4) {
        k.f("array", jArr);
        int i3 = i - 1;
        int i6 = 0;
        while (i6 <= i3) {
            int i7 = (i6 + i3) >>> 1;
            long j6 = jArr[i7];
            if (j6 < j4) {
                i6 = i7 + 1;
            } else {
                if (j6 <= j4) {
                    return i7;
                }
                i3 = i7 - 1;
            }
        }
        return ~i6;
    }

    public static final void c(String str) {
        k.f("message", str);
        throw new IllegalArgumentException(str);
    }
}
