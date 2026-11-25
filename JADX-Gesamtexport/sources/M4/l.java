package M4;

import B.AbstractC0013g0;
import B.C0003b0;
import S1.V;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends s {
    public static String A0(int i, String str) {
        E4.k.f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static CharSequence B0(String str) {
        E4.k.f("<this>", str);
        int length = str.length() - 1;
        int i = 0;
        boolean z5 = false;
        while (i <= length) {
            boolean zF = V.F(str.charAt(!z5 ? i : length));
            if (z5) {
                if (!zF) {
                    break;
                }
                length--;
            } else if (zF) {
                i++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean Z(CharSequence charSequence, char c6) {
        E4.k.f("<this>", charSequence);
        return f0(charSequence, c6, 0, 2) >= 0;
    }

    public static boolean a0(CharSequence charSequence, String str) {
        E4.k.f("<this>", charSequence);
        return g0(charSequence, str, 0, 2) >= 0;
    }

    public static String b0(int i, String str) {
        E4.k.f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static boolean c0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? s.P((String) charSequence, str, false) : o0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int d0(CharSequence charSequence) {
        E4.k.f("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int e0(CharSequence charSequence, String str, int i, boolean z5) {
        E4.k.f("<this>", charSequence);
        E4.k.f("string", str);
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        J4.d dVar = new J4.d(i, length, 1);
        boolean z6 = charSequence instanceof String;
        int i3 = dVar.f1942j;
        int i6 = dVar.i;
        int i7 = dVar.f1941h;
        if (!z6 || str == null) {
            boolean z7 = z5;
            if ((i3 <= 0 || i7 > i6) && (i3 >= 0 || i6 > i7)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z8 = z7;
                z7 = z8;
                if (o0(str, 0, charSequence2, i7, str.length(), z8)) {
                    return i7;
                }
                if (i7 == i6) {
                    return -1;
                }
                i7 += i3;
                charSequence = charSequence2;
            }
        } else {
            if ((i3 <= 0 || i7 > i6) && (i3 >= 0 || i6 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (true) {
                String str2 = str;
                boolean z9 = z5;
                if (s.S(0, i8, str.length(), str2, (String) charSequence, z9)) {
                    return i8;
                }
                if (i8 == i6) {
                    return -1;
                }
                i8 += i3;
                str = str2;
                z5 = z9;
            }
        }
    }

    public static int f0(CharSequence charSequence, char c6, int i, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        E4.k.f("<this>", charSequence);
        return !(charSequence instanceof String) ? h0(charSequence, new char[]{c6}, i, false) : ((String) charSequence).indexOf(c6, i);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        return e0(charSequence, str, i, false);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i, boolean z5) {
        E4.k.f("<this>", charSequence);
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iD0 = d0(charSequence);
        if (i > iD0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c6 : cArr) {
                if (V.x(c6, cCharAt, z5)) {
                    return i;
                }
            }
            if (i == iD0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean i0(CharSequence charSequence) {
        E4.k.f("<this>", charSequence);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!V.F(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char j0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(d0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int k0(int i, String str, String str2) {
        int iD0 = (i & 2) != 0 ? d0(str) : 0;
        E4.k.f("<this>", str);
        E4.k.f("string", str2);
        return str.lastIndexOf(str2, iD0);
    }

    public static int l0(String str, char c6, int i, int i3) {
        if ((i3 & 2) != 0) {
            i = d0(str);
        }
        E4.k.f("<this>", str);
        return str.lastIndexOf(c6, i);
    }

    public static final List m0(String str) {
        E4.k.f("<this>", str);
        return L4.l.R(new L4.i(n0(str, new String[]{"\r\n", "\n", "\r"}, false, 0), new E0.j(str, 6), 2));
    }

    public static c n0(String str, String[] strArr, boolean z5, int i) {
        r0(i);
        return new c(str, i, new t(p089q4.k.a0(strArr), z5));
    }

    public static final boolean o0(CharSequence charSequence, int i, CharSequence charSequence2, int i3, int i6, boolean z5) {
        E4.k.f("<this>", charSequence);
        E4.k.f("other", charSequence2);
        if (i3 < 0 || i < 0 || i > charSequence.length() - i6 || i3 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!V.x(charSequence.charAt(i + i7), charSequence2.charAt(i3 + i7), z5)) {
                return false;
            }
        }
        return true;
    }

    public static String p0(String str, String str2) {
        if (!s.W(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String q0(String str, String str2) {
        if (!c0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static final void r0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.r(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List s0(String str, String[] strArr, boolean z5, int i) {
        E4.k.f("<this>", str);
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return t0(i, str, str2, z5);
            }
        }
        L4.o oVar = new L4.o(0, n0(str, strArr, z5, i));
        ArrayList arrayList = new ArrayList(p089q4.n.P(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(w0(str, (J4.d) bVar.next()));
        }
    }

    public static final List t0(int i, String str, String str2, boolean z5) {
        r0(i);
        int length = 0;
        int iE0 = e0(str, str2, 0, z5);
        if (iE0 == -1 || i == 1) {
            return d0.v(str.toString());
        }
        boolean z6 = i > 0;
        int i3 = 10;
        if (z6 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(str.subSequence(length, iE0).toString());
            length = str2.length() + iE0;
            if (z6 && arrayList.size() == i - 1) {
                break;
            }
            iE0 = e0(str, str2, length, z5);
        } while (iE0 != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static List u0(String str, char[] cArr) {
        E4.k.f("<this>", str);
        if (cArr.length == 1) {
            return t0(0, str, String.valueOf(cArr[0]), false);
        }
        r0(0);
        L4.o oVar = new L4.o(0, new c(str, 0, new C0003b0(9, cArr)));
        ArrayList arrayList = new ArrayList(p089q4.n.P(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(w0(str, (J4.d) bVar.next()));
        }
    }

    public static boolean v0(String str, char c6) {
        E4.k.f("<this>", str);
        return str.length() > 0 && V.x(str.charAt(0), c6, false);
    }

    public static final String w0(String str, J4.d dVar) {
        E4.k.f("<this>", str);
        E4.k.f("range", dVar);
        return str.subSequence(dVar.f1941h, dVar.i + 1).toString();
    }

    public static String x0(String str, char c6, String str2) {
        int iF0 = f0(str, c6, 0, 6);
        if (iF0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iF0 + 1, str.length());
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String y0(String str, String str2) {
        E4.k.f("delimiter", str2);
        int iG0 = g0(str, str2, 0, 6);
        if (iG0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iG0, str.length());
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String z0(String str, String str2) {
        E4.k.f("<this>", str);
        E4.k.f("missingDelimiterValue", str2);
        int iL0 = l0(str, '.', 0, 6);
        if (iL0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iL0 + 1, str.length());
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }
}
