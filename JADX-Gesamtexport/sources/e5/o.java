package e5;

import B.AbstractC0013g0;
import F.C0068j;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0068j f8793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f8795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8796e;

    public o(String str) {
        E4.k.f("source", str);
        C0068j c0068j = new C0068j(5);
        c0068j.f1183c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        c0068j.f1184d = iArr;
        c0068j.f1182b = -1;
        this.f8793b = c0068j;
        this.f8795d = new StringBuilder();
        this.f8796e = str;
    }

    public static /* synthetic */ void m(o oVar, String str, int i, String str2, int i3) {
        if ((i3 & 2) != 0) {
            i = oVar.f8792a;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        oVar.l(i, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i) {
        int i3 = i + 4;
        if (i3 < charSequence.length()) {
            this.f8795d.append((char) (o(charSequence, i + 3) + (o(charSequence, i) << 12) + (o(charSequence, i + 1) << 8) + (o(charSequence, i + 2) << 4)));
            return i3;
        }
        this.f8792a = i;
        if (i3 < charSequence.length()) {
            return a(charSequence, this.f8792a);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.f8792a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f8796e;
            if (i >= str.length()) {
                this.f8792a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8792a = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        String str2 = this.f8796e;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) != (str2.charAt(i + i3) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f8792a = str.length() + i;
    }

    public final String d() {
        g('\"');
        int i = this.f8792a;
        String str = this.f8796e;
        int iF0 = M4.l.f0(str, '\"', i, 4);
        if (iF0 == -1) {
            j();
            n((byte) 1, false);
            throw null;
        }
        int i3 = i;
        while (i3 < iF0) {
            if (str.charAt(i3) == '\\') {
                int iS = this.f8792a;
                char cCharAt = str.charAt(i3);
                boolean z5 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.f8795d.append((CharSequence) str, iS, i3);
                        int iS2 = s(i3 + 1);
                        if (iS2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iS2 + 1;
                        char cCharAt2 = str.charAt(iS2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c6 = cCharAt2 < 'u' ? c.f8757a[cCharAt2] : (char) 0;
                            if (c6 == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.f8795d.append(c6);
                        }
                        iS = s(iA);
                        if (iS == -1) {
                            m(this, "Unexpected EOF", iS, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            this.f8795d.append((CharSequence) str, iS, i3);
                            iS = s(i3);
                            if (iS == -1) {
                                m(this, "Unexpected EOF", iS, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iS;
                    z5 = true;
                    cCharAt = str.charAt(i3);
                }
                String string = !z5 ? str.subSequence(iS, i3).toString() : k(iS, i3);
                this.f8792a = i3 + 1;
                return string;
            }
            i3++;
        }
        this.f8792a = iF0 + 1;
        String strSubstring = str.substring(i, iF0);
        E4.k.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public byte e() {
        String str;
        int i = this.f8792a;
        while (true) {
            str = this.f8796e;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8792a = i3;
                return h.d(cCharAt);
            }
            i = i3;
        }
        this.f8792a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b6) {
        byte bE = e();
        if (bE == b6) {
            return bE;
        }
        n(b6, true);
        throw null;
    }

    public void g(char c6) {
        int i = this.f8792a;
        if (i == -1) {
            v(c6);
            throw null;
        }
        while (true) {
            String str = this.f8796e;
            if (i >= str.length()) {
                this.f8792a = -1;
                v(c6);
                throw null;
            }
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8792a = i3;
                if (cCharAt == c6) {
                    return;
                }
                v(c6);
                throw null;
            }
            i = i3;
        }
    }

    public final long h() {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        double dPow;
        int iS = s(t());
        String str = this.f8796e;
        if (iS >= str.length() || iS == -1) {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iS) == '\"') {
            iS++;
            if (iS == str.length()) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        int i = iS;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        long j4 = 0;
        long j6 = 0;
        while (true) {
            if (i == str.length()) {
                z6 = z5;
                z7 = z9;
                z8 = z10;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z9) {
                z6 = z5;
                z7 = z9;
                if (cCharAt == '-' && z7) {
                    if (i == iS) {
                        m(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z5 = z6;
                    z9 = z7;
                    z11 = false;
                } else if (cCharAt != '+' || !z7) {
                    z8 = z10;
                    if (cCharAt != '-') {
                        if (h.d(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z7) {
                            j4 = (j4 * ((long) 10)) + ((long) i3);
                        } else {
                            j6 = (j6 * ((long) 10)) - ((long) i3);
                            if (j6 > 0) {
                                m(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z5 = z6;
                        z9 = z7;
                        z10 = z8;
                    } else {
                        if (i != iS) {
                            m(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z5 = z6;
                        z9 = z7;
                        z10 = true;
                    }
                } else {
                    if (i == iS) {
                        m(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z5 = z6;
                    z9 = z7;
                }
            } else {
                if (i == iS) {
                    m(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6);
                    throw null;
                }
                i++;
                z9 = true;
            }
            z11 = true;
        }
        boolean z12 = i != iS;
        if (iS == i || (z8 && iS == i - 1)) {
            m(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z6) {
            if (!z12) {
                m(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.f8792a = i;
        if (z7) {
            double d6 = j6;
            if (!z11) {
                dPow = Math.pow(10.0d, -j4);
            } else {
                if (!z11) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j4);
            }
            double d7 = d6 * dPow;
            if (d7 > 9.223372036854776E18d || d7 < -9.223372036854776E18d) {
                m(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d7) != d7) {
                m(this, "Can't convert " + d7 + " to Long", 0, null, 6);
                throw null;
            }
            j6 = (long) d7;
        }
        if (z8) {
            return j6;
        }
        if (j6 != Long.MIN_VALUE) {
            return -j6;
        }
        m(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String i() {
        String str = this.f8794c;
        if (str == null) {
            return d();
        }
        E4.k.c(str);
        this.f8794c = null;
        return str;
    }

    public final String j() {
        String str = this.f8794c;
        if (str != null) {
            E4.k.c(str);
            this.f8794c = null;
            return str;
        }
        int iT = t();
        String str2 = this.f8796e;
        if (iT >= str2.length() || iT == -1) {
            m(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bD = h.d(str2.charAt(iT));
        if (bD == 1) {
            return i();
        }
        if (bD != 0) {
            m(this, "Expected beginning of the string, but got " + str2.charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (h.d(str2.charAt(iT)) == 0) {
            iT++;
            if (iT >= str2.length()) {
                this.f8795d.append((CharSequence) str2, this.f8792a, iT);
                int iS = s(iT);
                if (iS == -1) {
                    this.f8792a = iT;
                    return k(0, 0);
                }
                iT = iS;
                z5 = true;
            }
        }
        String string = !z5 ? str2.subSequence(this.f8792a, iT).toString() : k(this.f8792a, iT);
        this.f8792a = iT;
        return string;
    }

    public final String k(int i, int i3) {
        this.f8795d.append((CharSequence) this.f8796e, i, i3);
        StringBuilder sb = this.f8795d;
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        sb.setLength(0);
        return string;
    }

    public final void l(int i, String str, String str2) {
        E4.k.f("message", str);
        E4.k.f("hint", str2);
        throw h.b(i, str + " at path: " + this.f8793b.f() + (str2.length() == 0 ? "" : "\n".concat(str2)), this.f8796e);
    }

    public final void n(byte b6, boolean z5) {
        String strL = h.l(b6);
        int i = z5 ? this.f8792a - 1 : this.f8792a;
        int i3 = this.f8792a;
        String str = this.f8796e;
        m(this, AbstractC0013g0.j("Expected ", strL, ", but had '", (i3 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final int o(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String p(String str) {
        E4.k.f("keyToMatch", str);
        int i = this.f8792a;
        try {
            if (e() != 6) {
                return null;
            }
            if (!E4.k.a(r(), str)) {
                return null;
            }
            this.f8794c = null;
            if (e() != 5) {
                return null;
            }
            return r();
        } finally {
            this.f8792a = i;
            this.f8794c = null;
        }
    }

    public byte q() {
        int i = this.f8792a;
        while (true) {
            int iS = s(i);
            if (iS == -1) {
                this.f8792a = iS;
                return (byte) 10;
            }
            char cCharAt = this.f8796e.charAt(iS);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f8792a = iS;
                return h.d(cCharAt);
            }
            i = iS + 1;
        }
    }

    public final String r() {
        if (q() != 1) {
            return null;
        }
        String strI = i();
        this.f8794c = strI;
        return strI;
    }

    public final int s(int i) {
        if (i < this.f8796e.length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char cCharAt;
        int i = this.f8792a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f8796e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f8792a = i;
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.f8796e);
        sb.append("', currentPosition=");
        return AbstractC0013g0.k(sb, this.f8792a, ')');
    }

    public final boolean u() {
        int iT = t();
        String str = this.f8796e;
        if (iT >= str.length() || iT == -1 || str.charAt(iT) != ',') {
            return false;
        }
        this.f8792a++;
        return true;
    }

    public final void v(char c6) {
        int i = this.f8792a;
        if (i > 0 && c6 == '\"') {
            try {
                this.f8792a = i - 1;
                String strJ = j();
                this.f8792a = i;
                if (E4.k.a(strJ, "null")) {
                    l(this.f8792a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f8792a = i;
                throw th;
            }
        }
        n(h.d(c6), true);
        throw null;
    }
}
