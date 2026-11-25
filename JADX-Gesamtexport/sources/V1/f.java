package V1;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5498a = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5499b = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5500c = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f5502e;

    static {
        int i = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i6 = 0; i6 < 10; i6++) {
                int i7 = 0;
                while (i7 < 10) {
                    f5500c[i] = ((i3 + 48) << 16) | ((i6 + 48) << 8) | (i7 + 48);
                    i7++;
                    i++;
                }
            }
        }
        f5501d = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        f5502e = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int a(char[] cArr, int i, int i3) {
        int i6 = f5500c[i];
        cArr[i3] = (char) (i6 >> 16);
        int i7 = i3 + 2;
        cArr[i3 + 1] = (char) ((i6 >> 8) & 127);
        int i8 = i3 + 3;
        cArr[i7] = (char) (i6 & 127);
        return i8;
    }

    public static int b(char[] cArr, int i, int i3) {
        int i6 = f5500c[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i3] = (char) (i6 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i6 >> 8) & 127);
            i3++;
        }
        int i7 = i3 + 1;
        cArr[i3] = (char) (i6 & 127);
        return i7;
    }

    public static int c(char[] cArr, int i, int i3) {
        int i6 = i / 1000;
        int i7 = i - (i6 * 1000);
        int i8 = i6 / 1000;
        int[] iArr = f5500c;
        int i9 = iArr[i8];
        cArr[i3] = (char) (i9 >> 16);
        cArr[i3 + 1] = (char) ((i9 >> 8) & 127);
        cArr[i3 + 2] = (char) (i9 & 127);
        int i10 = iArr[i6 - (i8 * 1000)];
        cArr[i3 + 3] = (char) (i10 >> 16);
        cArr[i3 + 4] = (char) ((i10 >> 8) & 127);
        cArr[i3 + 5] = (char) (i10 & 127);
        int i11 = iArr[i7];
        cArr[i3 + 6] = (char) (i11 >> 16);
        int i12 = i3 + 8;
        cArr[i3 + 7] = (char) ((i11 >> 8) & 127);
        int i13 = i3 + 9;
        cArr[i12] = (char) (i11 & 127);
        return i13;
    }

    public static int d(char[] cArr, int i, int i3) {
        int i6;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = f5498a;
                int length = str.length();
                str.getChars(0, length, cArr, i3);
                return length + i3;
            }
            cArr[i3] = '-';
            i = -i;
            i3++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i7 = i / 1000;
                return a(cArr, i - (i7 * 1000), b(cArr, i7, i3));
            }
            if (i >= 10) {
                return b(cArr, i, i3);
            }
            cArr[i3] = (char) (i + 48);
            return i3 + 1;
        }
        if (i < 1000000000) {
            int i8 = i / 1000;
            int i9 = i8 / 1000;
            return a(cArr, i - (i8 * 1000), a(cArr, i8 - (i9 * 1000), b(cArr, i9, i3)));
        }
        int i10 = i - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        if (i10 >= 1000000000) {
            i10 = i - 2000000000;
            i6 = i3 + 1;
            cArr[i3] = '2';
        } else {
            i6 = i3 + 1;
            cArr[i3] = '1';
        }
        return c(cArr, i10, i6);
    }

    public static int e(long j4, char[] cArr, int i) {
        int iC;
        if (j4 < 0) {
            if (j4 > -2147483648L) {
                return d(cArr, (int) j4, i);
            }
            if (j4 == Long.MIN_VALUE) {
                String str = f5499b;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j4 = -j4;
            i++;
        } else if (j4 <= 2147483647L) {
            return d(cArr, (int) j4, i);
        }
        long j6 = j4 / 1000000000;
        long j7 = j4 - (j6 * 1000000000);
        if (j6 < 1000000000) {
            int i3 = (int) j6;
            int[] iArr = f5500c;
            if (i3 >= 1000000) {
                int i6 = i3 / 1000;
                int i7 = i3 - (i6 * 1000);
                int i8 = i6 / 1000;
                int iB = b(cArr, i8, i);
                int i9 = iArr[i6 - (i8 * 1000)];
                cArr[iB] = (char) (i9 >> 16);
                cArr[iB + 1] = (char) ((i9 >> 8) & 127);
                cArr[iB + 2] = (char) (i9 & 127);
                int i10 = iArr[i7];
                cArr[iB + 3] = (char) (i10 >> 16);
                int i11 = iB + 5;
                cArr[iB + 4] = (char) ((i10 >> 8) & 127);
                iC = iB + 6;
                cArr[i11] = (char) (i10 & 127);
            } else if (i3 < 1000) {
                iC = b(cArr, i3, i);
            } else {
                int i12 = i3 / 1000;
                int i13 = i3 - (i12 * 1000);
                int i14 = iArr[i12];
                if (i12 > 9) {
                    if (i12 > 99) {
                        cArr[i] = (char) (i14 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i14 >> 8) & 127);
                    i++;
                }
                cArr[i] = (char) (i14 & 127);
                int i15 = iArr[i13];
                cArr[i + 1] = (char) (i15 >> 16);
                int i16 = i + 3;
                cArr[i + 2] = (char) ((i15 >> 8) & 127);
                iC = i + 4;
                cArr[i16] = (char) (i15 & 127);
            }
        } else {
            long j8 = j6 / 1000000000;
            int iB2 = b(cArr, (int) j8, i);
            iC = c(cArr, (int) (j6 - (1000000000 * j8)), iB2);
        }
        return c(cArr, (int) j7, iC);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public static String f(double d6, boolean z5) {
        char c6;
        if (!z5) {
            return Double.toString(d6);
        }
        X1.a aVar = new X1.a(0);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d6);
        long j4 = 4503599627370495L & jDoubleToRawLongBits;
        int i = ((int) (jDoubleToRawLongBits >>> 52)) & HueLog.LogComponent.ALL;
        if (i < 2047) {
            aVar.f5762c = -1;
            if (jDoubleToRawLongBits < 0) {
                aVar.a(45);
            }
            if (i != 0) {
                int i3 = 1075 - i;
                long j6 = j4 | 4503599627370496L;
                if ((i3 > 0) && (i3 < 53)) {
                    long j7 = j6 >> i3;
                    if ((j7 << i3) == j6) {
                        aVar.i(0, j7);
                    } else {
                        aVar.k(-i3, 0, j6);
                    }
                } else {
                    aVar.k(-i3, 0, j6);
                }
            } else if (j4 == 0) {
                c6 = jDoubleToRawLongBits == 0 ? (char) 1 : (char) 2;
            } else if (j4 < 3) {
                aVar.k(-1074, -1, j4 * 10);
            } else {
                aVar.k(-1074, 0, j4);
            }
            c6 = 0;
        } else if (j4 != 0) {
            c6 = 5;
        } else {
            c6 = jDoubleToRawLongBits > 0 ? (char) 3 : (char) 4;
        }
        if (c6 == 0) {
            return new String(aVar.f5761b, 0, 0, aVar.f5762c + 1);
        }
        if (c6 == 1) {
            return "0.0";
        }
        if (c6 == 2) {
            return "-0.0";
        }
        if (c6 != 3) {
            return c6 != 4 ? "NaN" : "-Infinity";
        }
        return "Infinity";
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    public static String g(float f6, boolean z5) {
        char c6;
        if (!z5) {
            return Float.toString(f6);
        }
        X1.a aVar = new X1.a(1);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f6);
        int i = 8388607 & iFloatToRawIntBits;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        if (i3 < 255) {
            aVar.f5762c = -1;
            if (iFloatToRawIntBits < 0) {
                aVar.a(45);
            }
            if (i3 != 0) {
                int i6 = 150 - i3;
                int i7 = i | 8388608;
                if ((i6 > 0) && (i6 < 24)) {
                    int i8 = i7 >> i6;
                    if ((i8 << i6) == i7) {
                        aVar.h(i8, 0);
                    } else {
                        aVar.j(-i6, i7, 0);
                    }
                } else {
                    aVar.j(-i6, i7, 0);
                }
            } else if (i == 0) {
                c6 = iFloatToRawIntBits == 0 ? (char) 1 : (char) 2;
            } else if (i < 8) {
                aVar.j(-149, i * 10, -1);
            } else {
                aVar.j(-149, i, 0);
            }
            c6 = 0;
        } else if (i != 0) {
            c6 = 5;
        } else {
            c6 = iFloatToRawIntBits > 0 ? (char) 3 : (char) 4;
        }
        if (c6 == 0) {
            return new String(aVar.f5761b, 0, 0, aVar.f5762c + 1);
        }
        if (c6 == 1) {
            return "0.0";
        }
        if (c6 == 2) {
            return "-0.0";
        }
        if (c6 != 3) {
            return c6 != 4 ? "NaN" : "-Infinity";
        }
        return "Infinity";
    }
}
