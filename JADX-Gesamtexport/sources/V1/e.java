package V1;

import java.math.BigInteger;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5496a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5497b = String.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    public static int a(String str) {
        String strTrim;
        int length;
        int i;
        char cCharAt;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            char cCharAt2 = strTrim.charAt(0);
            if (cCharAt2 != '+') {
                if (cCharAt2 == '-') {
                    i = 1;
                }
                while (i < length) {
                    try {
                        cCharAt = strTrim.charAt(i);
                        if (cCharAt <= '9' || cCharAt < '0') {
                            return (int) c(strTrim, true);
                        }
                        i++;
                    } catch (NumberFormatException unused) {
                    }
                }
                return Integer.parseInt(strTrim);
            }
            strTrim = strTrim.substring(1);
            length = strTrim.length();
            i = 0;
            while (i < length) {
                cCharAt = strTrim.charAt(i);
                if (cCharAt <= '9') {
                }
                return (int) c(strTrim, true);
            }
            return Integer.parseInt(strTrim);
        }
        return 0;
    }

    public static BigInteger b(String str) {
        return str.length() > 1250 ? AbstractC0473d.L(str).toBigInteger() : new BigInteger(str);
    }

    public static double c(String str, boolean z5) {
        if (!z5) {
            return Double.parseDouble(str);
        }
        W1.c cVar = W1.f.f5566a;
        long jD = W1.f.f5566a.d(str.length(), str);
        if (jD != -1) {
            return Double.longBitsToDouble(jD);
        }
        throw new NumberFormatException("Illegal input");
    }

    public static float d(String str, boolean z5) {
        if (!z5) {
            return Float.parseFloat(str);
        }
        W1.c cVar = W1.g.f5567a;
        long jD = W1.g.f5567a.d(str.length(), str);
        if (jD != -1) {
            return Float.intBitsToFloat((int) jD);
        }
        throw new NumberFormatException("Illegal input");
    }

    public static int e(String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i = 1;
        boolean z5 = cCharAt == '-';
        if (z5) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (cCharAt > '9' || cCharAt < '0') {
            return Integer.parseInt(str);
        }
        int i3 = cCharAt - '0';
        if (i < length) {
            int i6 = i + 1;
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return Integer.parseInt(str);
            }
            i3 = (i3 * 10) + (cCharAt2 - '0');
            if (i6 < length) {
                int i7 = i + 2;
                char cCharAt3 = str.charAt(i6);
                if (cCharAt3 > '9' || cCharAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i3 = (i3 * 10) + (cCharAt3 - '0');
                if (i7 < length) {
                    while (true) {
                        int i8 = i7 + 1;
                        char cCharAt4 = str.charAt(i7);
                        if (cCharAt4 > '9' || cCharAt4 < '0') {
                            break;
                        }
                        i3 = (i3 * 10) + (cCharAt4 - '0');
                        if (i8 < length) {
                            i7 = i8;
                        }
                    }
                    return Integer.parseInt(str);
                }
            }
        }
        return z5 ? -i3 : i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(char[] cArr, int i, int i3) {
        if (i3 > 0 && cArr[i] == '+') {
            i++;
            i3--;
        }
        int i6 = cArr[(i + i3) - 1] - '0';
        switch (i3) {
            case 2:
                return ((cArr[i] - '0') * 10) + i6;
            case 3:
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 4:
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 5:
                i6 += (cArr[i] - '0') * 10000;
                i++;
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 6:
                i6 += (cArr[i] - '0') * 100000;
                i++;
                i6 += (cArr[i] - '0') * 10000;
                i++;
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 7:
                i6 += (cArr[i] - '0') * 1000000;
                i++;
                i6 += (cArr[i] - '0') * 100000;
                i++;
                i6 += (cArr[i] - '0') * 10000;
                i++;
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 8:
                i6 += (cArr[i] - '0') * 10000000;
                i++;
                i6 += (cArr[i] - '0') * 1000000;
                i++;
                i6 += (cArr[i] - '0') * 100000;
                i++;
                i6 += (cArr[i] - '0') * 10000;
                i++;
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            case 9:
                i6 += (cArr[i] - '0') * 100000000;
                i++;
                i6 += (cArr[i] - '0') * 10000000;
                i++;
                i6 += (cArr[i] - '0') * 1000000;
                i++;
                i6 += (cArr[i] - '0') * 100000;
                i++;
                i6 += (cArr[i] - '0') * 10000;
                i++;
                i6 += (cArr[i] - '0') * 1000;
                i++;
                i6 += (cArr[i] - '0') * 100;
                i++;
                return ((cArr[i] - '0') * 10) + i6;
            default:
                return i6;
        }
    }

    public static long g(String str) {
        return str.length() <= 9 ? e(str) : Long.parseLong(str);
    }

    public static long h(char[] cArr, int i, int i3) {
        int i6 = i3 - 9;
        return (((long) f(cArr, i, i6)) * 1000000000) + ((long) f(cArr, i + i6, 9));
    }
}
