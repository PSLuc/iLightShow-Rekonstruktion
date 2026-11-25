package M4;

import S1.V;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r {
    public static boolean P(String str, String str2, boolean z5) {
        E4.k.f("<this>", str);
        E4.k.f("suffix", str2);
        return !z5 ? str.endsWith(str2) : S(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean Q(String str, String str2, boolean z5) {
        if (str == null) {
            return str2 == null;
        }
        return !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void R(String str) {
        E4.k.f("input", str);
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean S(int i, int i3, int i6, String str, String str2, boolean z5) {
        E4.k.f("<this>", str);
        E4.k.f("other", str2);
        return !z5 ? str.regionMatches(i, str2, i3, i6) : str.regionMatches(z5, i, str2, i3, i6);
    }

    public static String T(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i3 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i6 = 0; i6 < i; i6++) {
                cArr[i6] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i3 == i) {
                    break;
                }
                i3++;
            }
        }
        String string = sb.toString();
        E4.k.c(string);
        return string;
    }

    public static String U(String str, String str2, String str3) {
        E4.k.f("<this>", str);
        E4.k.f("oldValue", str2);
        int iE0 = l.e0(str, str2, 0, false);
        if (iE0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iE0);
            sb.append(str3);
            i3 = iE0 + length;
            if (iE0 >= str.length()) {
                break;
            }
            iE0 = l.e0(str, str2, iE0 + i, false);
        } while (iE0 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }

    public static boolean V(int i, String str, String str2, boolean z5) {
        E4.k.f("<this>", str);
        return !z5 ? str.startsWith(str2, i) : S(i, 0, str2.length(), str, str2, z5);
    }

    public static boolean W(String str, String str2, boolean z5) {
        E4.k.f("<this>", str);
        E4.k.f("prefix", str2);
        return !z5 ? str.startsWith(str2) : S(0, 0, str2.length(), str, str2, z5);
    }

    public static Integer X(String str) {
        boolean z5;
        int i;
        int i3;
        E4.k.f("<this>", str);
        V.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char cCharAt = str.charAt(0);
        int i7 = -2147483647;
        if (E4.k.h(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i7 = Integer.MIN_VALUE;
                z5 = true;
            }
        } else {
            z5 = false;
            i = 0;
        }
        int i8 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i6 < i8 && (i8 != -59652323 || i6 < (i8 = i7 / 10))) || (i3 = i6 * 10) < i7 + iDigit) {
                return null;
            }
            i6 = i3 - iDigit;
            i++;
        }
        return z5 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
    }

    public static Long Y(String str) {
        boolean z5;
        E4.k.f("<this>", str);
        V.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (E4.k.h(cCharAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j4 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z5 = false;
        }
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 != -256204778801521550L) {
                    return null;
                }
                j7 = j4 / ((long) 10);
                if (j6 < j7) {
                    return null;
                }
            }
            long j8 = j6 * ((long) 10);
            long j9 = iDigit;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i++;
        }
        return z5 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}
