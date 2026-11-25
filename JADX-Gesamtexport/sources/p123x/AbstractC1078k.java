package p123x;

/* JADX INFO: renamed from: x.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1069b f13777a = new C1069b(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1069b f13778b = new C1069b(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1071d f13779c = new C1071d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1071d f13780d = new C1071d(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1072e f13781e = new C1072e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1072e f13782f;

    static {
        new C1072e(3);
        new C1072e(2);
        f13782f = new C1072e(1);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i3 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float f6 = (i - i6) / 2;
        if (!z5) {
            int length = iArr.length;
            int i8 = 0;
            while (i3 < length) {
                int i9 = iArr[i3];
                iArr2[i8] = Math.round(f6);
                f6 += i9;
                i3++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = iArr[length2];
            iArr2[length2] = Math.round(f6);
            f6 += i10;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z5) {
        int i = 0;
        if (!z5) {
            int length = iArr.length;
            int i3 = 0;
            int i6 = 0;
            while (i < length) {
                int i7 = iArr[i];
                iArr2[i3] = i6;
                i6 += i7;
                i++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i;
            i += i8;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i3 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        int i8 = i - i6;
        if (!z5) {
            int length = iArr.length;
            int i9 = 0;
            while (i3 < length) {
                int i10 = iArr[i3];
                iArr2[i9] = i8;
                i8 += i10;
                i3++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = iArr[length2];
            iArr2[length2] = i8;
            i8 += i11;
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i3 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i6) / iArr.length;
        float f6 = length / 2;
        if (!z5) {
            int length2 = iArr.length;
            int i8 = 0;
            while (i3 < length2) {
                int i9 = iArr[i3];
                iArr2[i8] = Math.round(f6);
                f6 += i9 + length;
                i3++;
                i8++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i10 = iArr[length3];
            iArr2[length3] = Math.round(f6);
            f6 += i10 + length;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z5) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float fMax = (i - i6) / Math.max(iArr.length - 1, 1);
        float f6 = (z5 && iArr.length == 1) ? fMax : 0.0f;
        if (z5) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i8 = iArr[length];
                iArr2[length] = Math.round(f6);
                f6 += i8 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i9 = 0;
        while (i3 < length2) {
            int i10 = iArr[i3];
            iArr2[i9] = Math.round(f6);
            f6 += i10 + fMax;
            i3++;
            i9++;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z5) {
        int i3 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float length = (i - i6) / (iArr.length + 1);
        if (z5) {
            float f6 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f6);
                f6 += i8 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f7 = length;
        int i9 = 0;
        while (i3 < length3) {
            int i10 = iArr[i3];
            iArr2[i9] = Math.round(f7);
            f7 += i10 + length;
            i3++;
            i9++;
        }
    }

    public static C1075h g(float f6) {
        return new C1075h(f6);
    }
}
