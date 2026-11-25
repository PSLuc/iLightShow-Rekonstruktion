package p138z3;

import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p012c.k;
import p085q.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Reader f14631h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f14640r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f14642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f14643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14644v = 2;
    public final char[] i = new char[1024];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14632j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14633k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14634l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14635m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14636n = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14641s = 1;

    static {
        b.f11188j = new b(15);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f14640r = iArr;
        iArr[0] = 6;
        this.f14642t = new String[32];
        this.f14643u = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f14631h = reader;
    }

    public final boolean C(int i) throws IOException {
        int i3;
        int i6;
        int i7 = this.f14635m;
        int i8 = this.f14632j;
        this.f14635m = i7 - i8;
        int i9 = this.f14633k;
        char[] cArr = this.i;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f14633k = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f14633k = 0;
        }
        this.f14632j = 0;
        do {
            int i11 = this.f14633k;
            int i12 = this.f14631h.read(cArr, i11, cArr.length - i11);
            if (i12 == -1) {
                return false;
            }
            i3 = this.f14633k + i12;
            this.f14633k = i3;
            if (this.f14634l == 0 && (i6 = this.f14635m) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f14632j++;
                this.f14635m = i6 + 1;
                i++;
            }
        } while (i3 < i);
        return true;
    }

    public String D() {
        return G(false);
    }

    public final String G(boolean z5) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i3 = this.f14641s;
            if (i >= i3) {
                return sb.toString();
            }
            int i6 = this.f14640r[i];
            switch (i6) {
                case 1:
                case 2:
                    int i7 = this.f14643u[i];
                    if (z5 && i7 > 0 && i == i3 - 1) {
                        i7--;
                    }
                    sb.append('[');
                    sb.append(i7);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f14642t[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(k.r(i6, "Unknown scope value: "));
            }
            i++;
        }
    }

    public String J() {
        return G(true);
    }

    public boolean L() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        return (iO == 2 || iO == 4 || iO == 17) ? false : true;
    }

    public final boolean M(char c6) throws MalformedJsonException {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        return false;
    }

    final String Q() {
        return " at line " + (this.f14634l + 1) + " column " + ((this.f14632j - this.f14635m) + 1) + " path " + D();
    }

    public boolean T() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 5) {
            this.f14636n = 0;
            int[] iArr = this.f14643u;
            int i = this.f14641s - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iO != 6) {
            throw o0("a boolean");
        }
        this.f14636n = 0;
        int[] iArr2 = this.f14643u;
        int i3 = this.f14641s - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double V() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f14636n = 0;
            int[] iArr = this.f14643u;
            int i = this.f14641s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f14637o;
        }
        if (iO == 16) {
            this.f14639q = new String(this.i, this.f14632j, this.f14638p);
            this.f14632j += this.f14638p;
        } else if (iO == 8 || iO == 9) {
            this.f14639q = c0(iO == 8 ? '\'' : '\"');
        } else if (iO == 10) {
            this.f14639q = e0();
        } else if (iO != 11) {
            throw o0("a double");
        }
        this.f14636n = 11;
        double d6 = Double.parseDouble(this.f14639q);
        if (this.f14644v != 1 && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            n0("JSON forbids NaN and infinities: " + d6);
            throw null;
        }
        this.f14639q = null;
        this.f14636n = 0;
        int[] iArr2 = this.f14643u;
        int i3 = this.f14641s - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d6;
    }

    public int X() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            long j4 = this.f14637o;
            int i = (int) j4;
            if (j4 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f14637o + Q());
            }
            this.f14636n = 0;
            int[] iArr = this.f14643u;
            int i3 = this.f14641s - 1;
            iArr[i3] = iArr[i3] + 1;
            return i;
        }
        if (iO == 16) {
            this.f14639q = new String(this.i, this.f14632j, this.f14638p);
            this.f14632j += this.f14638p;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw o0("an int");
            }
            if (iO == 10) {
                this.f14639q = e0();
            } else {
                this.f14639q = c0(iO == 8 ? '\'' : '\"');
            }
            try {
                int i6 = Integer.parseInt(this.f14639q);
                this.f14636n = 0;
                int[] iArr2 = this.f14643u;
                int i7 = this.f14641s - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14636n = 11;
        double d6 = Double.parseDouble(this.f14639q);
        int i8 = (int) d6;
        if (i8 != d6) {
            throw new NumberFormatException("Expected an int but was " + this.f14639q + Q());
        }
        this.f14639q = null;
        this.f14636n = 0;
        int[] iArr3 = this.f14643u;
        int i9 = this.f14641s - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }

    public long Y() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f14636n = 0;
            int[] iArr = this.f14643u;
            int i = this.f14641s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f14637o;
        }
        if (iO == 16) {
            this.f14639q = new String(this.i, this.f14632j, this.f14638p);
            this.f14632j += this.f14638p;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw o0("a long");
            }
            if (iO == 10) {
                this.f14639q = e0();
            } else {
                this.f14639q = c0(iO == 8 ? '\'' : '\"');
            }
            try {
                long j4 = Long.parseLong(this.f14639q);
                this.f14636n = 0;
                int[] iArr2 = this.f14643u;
                int i3 = this.f14641s - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f14636n = 11;
        double d6 = Double.parseDouble(this.f14639q);
        long j6 = (long) d6;
        if (j6 != d6) {
            throw new NumberFormatException("Expected a long but was " + this.f14639q + Q());
        }
        this.f14639q = null;
        this.f14636n = 0;
        int[] iArr3 = this.f14643u;
        int i6 = this.f14641s - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j6;
    }

    public String Z() throws IOException {
        String strC0;
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 14) {
            strC0 = e0();
        } else if (iO == 12) {
            strC0 = c0('\'');
        } else {
            if (iO != 13) {
                throw o0("a name");
            }
            strC0 = c0('\"');
        }
        this.f14636n = 0;
        this.f14642t[this.f14641s - 1] = strC0;
        return strC0;
    }

    public final int a0(boolean z5) throws IOException {
        int i = this.f14632j;
        int i3 = this.f14633k;
        while (true) {
            if (i == i3) {
                this.f14632j = i;
                if (!C(1)) {
                    if (!z5) {
                        return -1;
                    }
                    throw new EOFException("End of input" + Q());
                }
                i = this.f14632j;
                i3 = this.f14633k;
            }
            int i6 = i + 1;
            char[] cArr = this.i;
            char c6 = cArr[i];
            if (c6 == '\n') {
                this.f14634l++;
                this.f14635m = i6;
            } else if (c6 != ' ' && c6 != '\r' && c6 != '\t') {
                if (c6 == '/') {
                    this.f14632j = i6;
                    if (i6 == i3) {
                        this.f14632j = i;
                        boolean zC = C(2);
                        this.f14632j++;
                        if (!zC) {
                        }
                        return c6;
                    }
                    k();
                    int i7 = this.f14632j;
                    char c7 = cArr[i7];
                    if (c7 == '*') {
                        this.f14632j = i7 + 1;
                        while (true) {
                            if (this.f14632j + 2 > this.f14633k && !C(2)) {
                                n0("Unterminated comment");
                                throw null;
                            }
                            int i8 = this.f14632j;
                            if (cArr[i8] != '\n') {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= 2) {
                                        i = this.f14632j + 2;
                                        i3 = this.f14633k;
                                        break;
                                    }
                                    if (cArr[this.f14632j + i9] != "*/".charAt(i9)) {
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                this.f14634l++;
                                this.f14635m = i8 + 1;
                            }
                            this.f14632j++;
                        }
                    } else {
                        if (c7 != '/') {
                            return c6;
                        }
                        this.f14632j = i7 + 1;
                        k0();
                        i = this.f14632j;
                        i3 = this.f14633k;
                    }
                } else {
                    if (c6 != '#') {
                        this.f14632j = i6;
                        return c6;
                    }
                    this.f14632j = i6;
                    k();
                    k0();
                    i = this.f14632j;
                    i3 = this.f14633k;
                }
            }
            i = i6;
        }
    }

    public void b() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 3) {
            throw o0("BEGIN_ARRAY");
        }
        g0(1);
        this.f14643u[this.f14641s - 1] = 0;
        this.f14636n = 0;
    }

    public void b0() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 7) {
            throw o0("null");
        }
        this.f14636n = 0;
        int[] iArr = this.f14643u;
        int i = this.f14641s - 1;
        iArr[i] = iArr[i] + 1;
    }

    public void c() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 1) {
            throw o0("BEGIN_OBJECT");
        }
        g0(3);
        this.f14636n = 0;
    }

    public final String c0(char c6) throws MalformedJsonException {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i3 = this.f14632j;
            int i6 = this.f14633k;
            while (true) {
                int i7 = i6;
                i = i3;
                while (true) {
                    cArr = this.i;
                    if (i3 < i7) {
                        int i8 = i3 + 1;
                        char c7 = cArr[i3];
                        if (this.f14644v == 3 && c7 < ' ') {
                            n0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c7 == c6) {
                            this.f14632j = i8;
                            int i9 = (i8 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i9);
                            }
                            sb.append(cArr, i, i9);
                            return sb.toString();
                        }
                        if (c7 == '\\') {
                            this.f14632j = i8;
                            int i10 = i8 - i;
                            int i11 = i10 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i10 * 2, 16));
                            }
                            sb.append(cArr, i, i11);
                            sb.append(h0());
                            i3 = this.f14632j;
                            i6 = this.f14633k;
                        } else {
                            if (c7 == '\n') {
                                this.f14634l++;
                                this.f14635m = i8;
                            }
                            i3 = i8;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
            }
            sb.append(cArr, i, i3 - i);
            this.f14632j = i3;
        } while (C(1));
        n0("Unterminated string");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14636n = 0;
        this.f14640r[0] = 8;
        this.f14641s = 1;
        this.f14631h.close();
    }

    public String d0() throws IOException {
        String str;
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 10) {
            str = e0();
        } else if (iO == 8) {
            str = c0('\'');
        } else if (iO == 9) {
            str = c0('\"');
        } else if (iO == 11) {
            str = this.f14639q;
            this.f14639q = null;
        } else if (iO == 15) {
            str = Long.toString(this.f14637o);
        } else {
            if (iO != 16) {
                throw o0("a string");
            }
            str = new String(this.i, this.f14632j, this.f14638p);
            this.f14632j += this.f14638p;
        }
        this.f14636n = 0;
        int[] iArr = this.f14643u;
        int i = this.f14641s - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String e0() throws MalformedJsonException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i3 = 0;
            while (true) {
                int i6 = this.f14632j;
                int i7 = i6 + i3;
                int i8 = this.f14633k;
                char[] cArr = this.i;
                if (i7 < i8) {
                    char c6 = cArr[i6 + i3];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        k();
                    }
                    i = i3;
                } else if (i3 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(cArr, this.f14632j, i3);
                    this.f14632j += i3;
                    if (!C(1)) {
                    }
                } else if (!C(i3 + 1)) {
                    i = i3;
                }
                if (sb == null) {
                    string = new String(cArr, this.f14632j, i);
                } else {
                    sb.append(cArr, this.f14632j, i);
                    string = sb.toString();
                }
                this.f14632j += i;
                return string;
            }
        }
    }

    public int f0() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        switch (iO) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void g0(int i) {
        int i3 = this.f14641s;
        int[] iArr = this.f14640r;
        if (i3 == iArr.length) {
            int i6 = i3 * 2;
            this.f14640r = Arrays.copyOf(iArr, i6);
            this.f14643u = Arrays.copyOf(this.f14643u, i6);
            this.f14642t = (String[]) Arrays.copyOf(this.f14642t, i6);
        }
        int[] iArr2 = this.f14640r;
        int i7 = this.f14641s;
        this.f14641s = i7 + 1;
        iArr2[i7] = i;
    }

    public final char h0() throws MalformedJsonException {
        int i;
        if (this.f14632j == this.f14633k && !C(1)) {
            n0("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f14632j;
        int i6 = i3 + 1;
        this.f14632j = i6;
        char[] cArr = this.i;
        char c6 = cArr[i3];
        if (c6 != '\n') {
            if (c6 != '\"') {
                if (c6 != '\'') {
                    if (c6 != '/' && c6 != '\\') {
                        if (c6 == 'b') {
                            return '\b';
                        }
                        if (c6 == 'f') {
                            return '\f';
                        }
                        if (c6 == 'n') {
                            return '\n';
                        }
                        if (c6 == 'r') {
                            return '\r';
                        }
                        if (c6 == 't') {
                            return '\t';
                        }
                        if (c6 != 'u') {
                            n0("Invalid escape sequence");
                            throw null;
                        }
                        if (i3 + 5 > this.f14633k && !C(4)) {
                            n0("Unterminated escape sequence");
                            throw null;
                        }
                        int i7 = this.f14632j;
                        int i8 = i7 + 4;
                        int i9 = 0;
                        while (i7 < i8) {
                            char c7 = cArr[i7];
                            int i10 = i9 << 4;
                            if (c7 >= '0' && c7 <= '9') {
                                i = c7 - '0';
                            } else if (c7 >= 'a' && c7 <= 'f') {
                                i = c7 - 'W';
                            } else {
                                if (c7 < 'A' || c7 > 'F') {
                                    n0("Malformed Unicode escape \\u".concat(new String(cArr, this.f14632j, 4)));
                                    throw null;
                                }
                                i = c7 - '7';
                            }
                            i9 = i + i10;
                            i7++;
                        }
                        this.f14632j += 4;
                        return (char) i9;
                    }
                }
            }
            return c6;
        }
        if (this.f14644v == 3) {
            n0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f14634l++;
        this.f14635m = i6;
        if (this.f14644v == 3) {
            n0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c6;
    }

    public final void i0(int i) {
        if (i == 0) {
            throw null;
        }
        this.f14644v = i;
    }

    public final void j0(char c6) throws MalformedJsonException {
        do {
            int i = this.f14632j;
            int i3 = this.f14633k;
            while (i < i3) {
                int i6 = i + 1;
                char c7 = this.i[i];
                if (c7 == c6) {
                    this.f14632j = i6;
                    return;
                }
                if (c7 == '\\') {
                    this.f14632j = i6;
                    h0();
                    i = this.f14632j;
                    i3 = this.f14633k;
                } else {
                    if (c7 == '\n') {
                        this.f14634l++;
                        this.f14635m = i6;
                    }
                    i = i6;
                }
            }
            this.f14632j = i;
        } while (C(1));
        n0("Unterminated string");
        throw null;
    }

    public final void k() throws MalformedJsonException {
        if (this.f14644v == 1) {
            return;
        }
        n0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void k0() {
        char c6;
        do {
            if (this.f14632j >= this.f14633k && !C(1)) {
                return;
            }
            int i = this.f14632j;
            int i3 = i + 1;
            this.f14632j = i3;
            c6 = this.i[i];
            if (c6 == '\n') {
                this.f14634l++;
                this.f14635m = i3;
                return;
            }
        } while (c6 != '\r');
    }

    public final void l0() throws MalformedJsonException {
        do {
            int i = 0;
            while (true) {
                int i3 = this.f14632j;
                if (i3 + i < this.f14633k) {
                    char c6 = this.i[i3 + i];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        k();
                    }
                    this.f14632j += i;
                    return;
                }
                this.f14632j = i3 + i;
            }
        } while (C(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void m0() throws IOException {
        int i = 0;
        do {
            int iO = this.f14636n;
            if (iO == 0) {
                iO = o();
            }
            switch (iO) {
                case 1:
                    g0(3);
                    i++;
                    this.f14636n = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f14642t[this.f14641s - 1] = null;
                    }
                    this.f14641s--;
                    i--;
                    this.f14636n = 0;
                    break;
                case 3:
                    g0(1);
                    i++;
                    this.f14636n = 0;
                    break;
                case 4:
                    this.f14641s--;
                    i--;
                    this.f14636n = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f14636n = 0;
                    break;
                case 8:
                    j0('\'');
                    this.f14636n = 0;
                    break;
                case 9:
                    j0('\"');
                    this.f14636n = 0;
                    break;
                case 10:
                    l0();
                    this.f14636n = 0;
                    break;
                case 12:
                    j0('\'');
                    if (i == 0) {
                        this.f14642t[this.f14641s - 1] = "<skipped>";
                    }
                    this.f14636n = 0;
                    break;
                case 13:
                    j0('\"');
                    if (i == 0) {
                        this.f14642t[this.f14641s - 1] = "<skipped>";
                    }
                    this.f14636n = 0;
                    break;
                case 14:
                    l0();
                    if (i == 0) {
                        this.f14642t[this.f14641s - 1] = "<skipped>";
                    }
                    this.f14636n = 0;
                    break;
                case 16:
                    this.f14632j += this.f14638p;
                    this.f14636n = 0;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f14643u;
        int i3 = this.f14641s - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void n0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + Q() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2 A[PHI: r4 r15
  0x01b2: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be  */
    /* JADX WARN: Code duplicated, block: B:172:0x021d  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240 A[DONT_INVERT, PHI: r8
  0x0240: PHI (r8v22 int) = (r8v21 int), (r8v23 int) binds: [B:171:0x021b, B:177:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0242  */
    /* JADX WARN: Code duplicated, block: B:199:0x025f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0262  */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0271  */
    /* JADX WARN: Code duplicated, block: B:211:0x027b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281  */
    /* JADX WARN: Code duplicated, block: B:215:0x0287  */
    /* JADX WARN: Code duplicated, block: B:217:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x028c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0290  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    public final int o() throws IOException {
        int iA0;
        int i;
        int iA1;
        char c6;
        String str;
        String str2;
        int i3;
        int i6;
        int length;
        int i7;
        char c7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        char c8;
        int i12;
        int i13;
        int[] iArr = this.f14640r;
        int i14 = this.f14641s - 1;
        int i15 = iArr[i14];
        char[] cArr = this.i;
        if (i15 == 1) {
            iArr[i14] = 2;
        } else if (i15 == 2) {
            int iA2 = a0(true);
            if (iA2 != 44) {
                if (iA2 != 59) {
                    if (iA2 == 93) {
                        this.f14636n = 4;
                        return 4;
                    }
                    n0("Unterminated array");
                    throw null;
                }
                k();
            }
        } else {
            if (i15 == 3 || i15 == 5) {
                iArr[i14] = 4;
                if (i15 == 5 && (iA0 = a0(true)) != 44) {
                    if (iA0 != 59) {
                        if (iA0 == 125) {
                            this.f14636n = 2;
                            return 2;
                        }
                        n0("Unterminated object");
                        throw null;
                    }
                    k();
                }
                int iA3 = a0(true);
                if (iA3 == 34) {
                    this.f14636n = 13;
                    return 13;
                }
                if (iA3 == 39) {
                    k();
                    this.f14636n = 12;
                    return 12;
                }
                if (iA3 == 125) {
                    if (i15 != 5) {
                        this.f14636n = 2;
                        return 2;
                    }
                    n0("Expected name");
                    throw null;
                }
                k();
                this.f14632j--;
                if (M((char) iA3)) {
                    this.f14636n = 14;
                    return 14;
                }
                n0("Expected name");
                throw null;
            }
            if (i15 != 4) {
                if (i15 == 6) {
                    if (this.f14644v == 1) {
                        a0(true);
                        int i16 = this.f14632j;
                        this.f14632j = i16 - 1;
                        if (i16 + 4 <= this.f14633k || C(5)) {
                            int i17 = this.f14632j;
                            if (cArr[i17] == ')' && cArr[i17 + 1] == ']' && cArr[i17 + 2] == '}' && cArr[i17 + 3] == '\'' && cArr[i17 + 4] == '\n') {
                                this.f14632j = i17 + 5;
                            }
                        }
                    }
                    this.f14640r[this.f14641s - 1] = 7;
                } else if (i15 == 7) {
                    i = 0;
                    if (a0(false) == -1) {
                        this.f14636n = 17;
                        return 17;
                    }
                    k();
                    this.f14632j--;
                } else {
                    i = 0;
                    if (i15 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iA1 = a0(true);
                if (iA1 != 34) {
                    this.f14636n = 9;
                    return 9;
                }
                if (iA1 != 39) {
                    k();
                    this.f14636n = 8;
                    return 8;
                }
                if (iA1 != 44 && iA1 != 59) {
                    if (iA1 != 91) {
                        this.f14636n = 3;
                        return 3;
                    }
                    if (iA1 != 93) {
                        if (iA1 != 123) {
                            this.f14636n = 1;
                            return 1;
                        }
                        int i18 = this.f14632j - 1;
                        this.f14632j = i18;
                        c6 = cArr[i18];
                        if (c6 != 't' || c6 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i3 = 5;
                        } else {
                            if (c6 != 'f' && c6 != 'F') {
                                if (c6 != 'n' && c6 != 'N') {
                                    i3 = i;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i3 = 7;
                                if (i3 != 0) {
                                    return i3;
                                }
                                int i19 = this.f14632j;
                                i8 = this.f14633k;
                                i9 = i;
                                i10 = i9;
                                int i20 = i10;
                                i11 = i19;
                                z5 = true;
                                long j4 = 0;
                                while (true) {
                                    if (i11 + i10 != i8) {
                                        c8 = cArr[i11 + i10];
                                        if (c8 != '+') {
                                            if (c8 != 'E' || c8 == 'e') {
                                                if (i9 != 2 || i9 == 4) {
                                                    i9 = 5;
                                                    i10++;
                                                }
                                            } else if (c8 == '-') {
                                                if (i9 == 0) {
                                                    i9 = 1;
                                                    i20 = 1;
                                                } else {
                                                    if (i9 != 5) {
                                                    }
                                                    i9 = 6;
                                                }
                                                i10++;
                                            } else if (c8 != '.') {
                                                if (c8 >= '0' && c8 <= '9') {
                                                    if (i9 == 1 || i9 == 0) {
                                                        j4 = -(c8 - '0');
                                                        i9 = 2;
                                                    } else if (i9 == 2) {
                                                        if (j4 != 0) {
                                                            long j6 = (10 * j4) - ((long) (c8 - '0'));
                                                            z5 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j6 < j4);
                                                            j4 = j6;
                                                        }
                                                    } else if (i9 == 3) {
                                                        i9 = 4;
                                                    } else if (i9 == 5 || i9 == 6) {
                                                        i9 = 7;
                                                    }
                                                    i10++;
                                                } else if (!M(c8)) {
                                                    i13 = 2;
                                                    if (i9 != 2) {
                                                        if (i9 != i13 || i9 == 4 || i9 == 7) {
                                                            this.f14638p = i10;
                                                            i12 = 16;
                                                            this.f14636n = 16;
                                                        }
                                                    } else if (z5 || ((j4 == Long.MIN_VALUE && i20 == 0) || (j4 == 0 && i20 != 0))) {
                                                        i13 = 2;
                                                        if (i9 != i13) {
                                                        }
                                                        this.f14638p = i10;
                                                        i12 = 16;
                                                        this.f14636n = 16;
                                                    } else {
                                                        if (i20 == 0) {
                                                            j4 = -j4;
                                                        }
                                                        this.f14637o = j4;
                                                        this.f14632j += i10;
                                                        i12 = 15;
                                                        this.f14636n = 15;
                                                    }
                                                }
                                            } else if (i9 == 2) {
                                                i9 = 3;
                                                i10++;
                                            }
                                            if (i12 != 0) {
                                                return i12;
                                            }
                                            if (M(cArr[this.f14632j])) {
                                                n0("Expected value");
                                                throw null;
                                            }
                                            k();
                                            this.f14636n = 10;
                                            return 10;
                                        }
                                        if (i9 != 5) {
                                        }
                                        i9 = 6;
                                        i10++;
                                    } else if (i10 != cArr.length) {
                                        if (C(i10 + 1)) {
                                            i11 = this.f14632j;
                                            i8 = this.f14633k;
                                            c8 = cArr[i11 + i10];
                                            if (c8 != '+') {
                                                if (c8 != 'E') {
                                                    if (i9 != 2) {
                                                    }
                                                    i9 = 5;
                                                    i10++;
                                                } else {
                                                    if (i9 != 2) {
                                                    }
                                                    i9 = 5;
                                                    i10++;
                                                }
                                                if (i12 != 0) {
                                                    return i12;
                                                }
                                                if (M(cArr[this.f14632j])) {
                                                    n0("Expected value");
                                                    throw null;
                                                }
                                                k();
                                                this.f14636n = 10;
                                                return 10;
                                            }
                                            if (i9 != 5) {
                                            }
                                            i9 = 6;
                                            i10++;
                                        }
                                        i13 = 2;
                                        if (i9 != 2) {
                                            if (i9 != i13) {
                                            }
                                            this.f14638p = i10;
                                            i12 = 16;
                                            this.f14636n = 16;
                                        } else {
                                            if (z5) {
                                            }
                                            i13 = 2;
                                            if (i9 != i13) {
                                            }
                                            this.f14638p = i10;
                                            i12 = 16;
                                            this.f14636n = 16;
                                        }
                                        if (i12 != 0) {
                                            return i12;
                                        }
                                        if (M(cArr[this.f14632j])) {
                                            n0("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.f14636n = 10;
                                        return 10;
                                    }
                                    i12 = 0;
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (M(cArr[this.f14632j])) {
                                        n0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f14636n = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i3 = 6;
                        }
                        if (this.f14644v != 3) {
                            i6 = 1;
                        } else {
                            i6 = i;
                        }
                        length = str.length();
                        i7 = i;
                        while (true) {
                            if (i7 >= length) {
                                if ((this.f14632j + length < this.f14633k && !C(length + 1)) || !M(cArr[this.f14632j + length])) {
                                    this.f14632j += length;
                                    this.f14636n = i3;
                                    break;
                                }
                                break;
                            }
                            if ((this.f14632j + i7 >= this.f14633k || C(i7 + 1)) && ((c7 = cArr[this.f14632j + i7]) == str.charAt(i7) || (i6 != 0 && c7 == str2.charAt(i7)))) {
                            }
                            i3 = i;
                            break;
                        }
                        if (i3 != 0) {
                            return i3;
                        }
                        int i110 = this.f14632j;
                        i8 = this.f14633k;
                        i9 = i;
                        i10 = i9;
                        int i21 = i10;
                        i11 = i110;
                        z5 = true;
                        long j7 = 0;
                        while (true) {
                            if (i11 + i10 != i8) {
                                c8 = cArr[i11 + i10];
                                if (c8 != '+') {
                                    if (c8 != 'E') {
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                    } else {
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                    }
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (M(cArr[this.f14632j])) {
                                        n0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f14636n = 10;
                                    return 10;
                                }
                                if (i9 != 5) {
                                }
                                i9 = 6;
                                i10++;
                            } else if (i10 != cArr.length) {
                                if (C(i10 + 1)) {
                                    i11 = this.f14632j;
                                    i8 = this.f14633k;
                                    c8 = cArr[i11 + i10];
                                    if (c8 != '+') {
                                        if (c8 != 'E') {
                                            if (i9 != 2) {
                                            }
                                            i9 = 5;
                                            i10++;
                                        } else {
                                            if (i9 != 2) {
                                            }
                                            i9 = 5;
                                            i10++;
                                        }
                                        if (i12 != 0) {
                                            return i12;
                                        }
                                        if (M(cArr[this.f14632j])) {
                                            n0("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.f14636n = 10;
                                        return 10;
                                    }
                                    if (i9 != 5) {
                                    }
                                    i9 = 6;
                                    i10++;
                                }
                                i13 = 2;
                                if (i9 != 2) {
                                    if (i9 != i13) {
                                    }
                                    this.f14638p = i10;
                                    i12 = 16;
                                    this.f14636n = 16;
                                } else {
                                    if (z5) {
                                    }
                                    i13 = 2;
                                    if (i9 != i13) {
                                    }
                                    this.f14638p = i10;
                                    i12 = 16;
                                    this.f14636n = 16;
                                }
                                if (i12 != 0) {
                                    return i12;
                                }
                                if (M(cArr[this.f14632j])) {
                                    n0("Expected value");
                                    throw null;
                                }
                                k();
                                this.f14636n = 10;
                                return 10;
                            }
                            i12 = 0;
                            if (i12 != 0) {
                                return i12;
                            }
                            if (M(cArr[this.f14632j])) {
                                n0("Expected value");
                                throw null;
                            }
                            k();
                            this.f14636n = 10;
                            return 10;
                        }
                    }
                    if (i15 == 1) {
                        this.f14636n = 4;
                        return 4;
                    }
                }
                if (i15 == 1 && i15 != 2) {
                    n0("Unexpected value");
                    throw null;
                }
                k();
                this.f14632j--;
                this.f14636n = 7;
                return 7;
            }
            iArr[i14] = 5;
            int iA4 = a0(true);
            if (iA4 != 58) {
                if (iA4 != 61) {
                    n0("Expected ':'");
                    throw null;
                }
                k();
                if (this.f14632j < this.f14633k || C(1)) {
                    int i22 = this.f14632j;
                    if (cArr[i22] == '>') {
                        this.f14632j = i22 + 1;
                    }
                }
            }
        }
        i = 0;
        iA1 = a0(true);
        if (iA1 != 34) {
            this.f14636n = 9;
            return 9;
        }
        if (iA1 != 39) {
            k();
            this.f14636n = 8;
            return 8;
        }
        if (iA1 != 44) {
            if (iA1 != 91) {
                this.f14636n = 3;
                return 3;
            }
            if (iA1 != 93) {
                if (iA1 != 123) {
                    this.f14636n = 1;
                    return 1;
                }
                int i111 = this.f14632j - 1;
                this.f14632j = i111;
                c6 = cArr[i111];
                if (c6 != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i3 = 5;
                    if (this.f14644v != 3) {
                        i6 = 1;
                    } else {
                        i6 = i;
                    }
                    length = str.length();
                    i7 = i;
                    while (true) {
                        if (i7 >= length) {
                            if (this.f14632j + length < this.f14633k) {
                            }
                            this.f14632j += length;
                            this.f14636n = i3;
                            break;
                        }
                        i7 = this.f14632j + i7 >= this.f14633k ? i7 + 1 : i7 + 1;
                    }
                    if (i3 != 0) {
                        return i3;
                    }
                    int i112 = this.f14632j;
                    i8 = this.f14633k;
                    i9 = i;
                    i10 = i9;
                    int i23 = i10;
                    i11 = i112;
                    z5 = true;
                    long j8 = 0;
                    while (true) {
                        if (i11 + i10 != i8) {
                            c8 = cArr[i11 + i10];
                            if (c8 != '+') {
                                if (c8 != 'E') {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                } else {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                }
                                if (i12 != 0) {
                                    return i12;
                                }
                                if (M(cArr[this.f14632j])) {
                                    n0("Expected value");
                                    throw null;
                                }
                                k();
                                this.f14636n = 10;
                                return 10;
                            }
                            if (i9 != 5) {
                            }
                            i9 = 6;
                            i10++;
                        } else if (i10 != cArr.length) {
                            if (C(i10 + 1)) {
                                i11 = this.f14632j;
                                i8 = this.f14633k;
                                c8 = cArr[i11 + i10];
                                if (c8 != '+') {
                                    if (c8 != 'E') {
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                    } else {
                                        if (i9 != 2) {
                                        }
                                        i9 = 5;
                                        i10++;
                                    }
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (M(cArr[this.f14632j])) {
                                        n0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f14636n = 10;
                                    return 10;
                                }
                                if (i9 != 5) {
                                }
                                i9 = 6;
                                i10++;
                            }
                            i13 = 2;
                            if (i9 != 2) {
                                if (i9 != i13) {
                                }
                                this.f14638p = i10;
                                i12 = 16;
                                this.f14636n = 16;
                            } else {
                                if (z5) {
                                }
                                i13 = 2;
                                if (i9 != i13) {
                                }
                                this.f14638p = i10;
                                i12 = 16;
                                this.f14636n = 16;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (M(cArr[this.f14632j])) {
                                n0("Expected value");
                                throw null;
                            }
                            k();
                            this.f14636n = 10;
                            return 10;
                        }
                        i12 = 0;
                        if (i12 != 0) {
                            return i12;
                        }
                        if (M(cArr[this.f14632j])) {
                            n0("Expected value");
                            throw null;
                        }
                        k();
                        this.f14636n = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i3 = 5;
                if (this.f14644v != 3) {
                    i6 = 1;
                } else {
                    i6 = i;
                }
                length = str.length();
                i7 = i;
                while (true) {
                    if (i7 >= length) {
                        if (this.f14632j + length < this.f14633k) {
                        }
                        this.f14632j += length;
                        this.f14636n = i3;
                        break;
                    }
                    if (this.f14632j + i7 >= this.f14633k) {
                    }
                }
                if (i3 != 0) {
                    return i3;
                }
                int i113 = this.f14632j;
                i8 = this.f14633k;
                i9 = i;
                i10 = i9;
                int i24 = i10;
                i11 = i113;
                z5 = true;
                long j9 = 0;
                while (true) {
                    if (i11 + i10 != i8) {
                        c8 = cArr[i11 + i10];
                        if (c8 != '+') {
                            if (c8 != 'E') {
                                if (i9 != 2) {
                                }
                                i9 = 5;
                                i10++;
                            } else {
                                if (i9 != 2) {
                                }
                                i9 = 5;
                                i10++;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (M(cArr[this.f14632j])) {
                                n0("Expected value");
                                throw null;
                            }
                            k();
                            this.f14636n = 10;
                            return 10;
                        }
                        if (i9 != 5) {
                        }
                        i9 = 6;
                        i10++;
                    } else if (i10 != cArr.length) {
                        if (C(i10 + 1)) {
                            i11 = this.f14632j;
                            i8 = this.f14633k;
                            c8 = cArr[i11 + i10];
                            if (c8 != '+') {
                                if (c8 != 'E') {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                } else {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                }
                                if (i12 != 0) {
                                    return i12;
                                }
                                if (M(cArr[this.f14632j])) {
                                    n0("Expected value");
                                    throw null;
                                }
                                k();
                                this.f14636n = 10;
                                return 10;
                            }
                            if (i9 != 5) {
                            }
                            i9 = 6;
                            i10++;
                        }
                        i13 = 2;
                        if (i9 != 2) {
                            if (i9 != i13) {
                            }
                            this.f14638p = i10;
                            i12 = 16;
                            this.f14636n = 16;
                        } else {
                            if (z5) {
                            }
                            i13 = 2;
                            if (i9 != i13) {
                            }
                            this.f14638p = i10;
                            i12 = 16;
                            this.f14636n = 16;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        if (M(cArr[this.f14632j])) {
                            n0("Expected value");
                            throw null;
                        }
                        k();
                        this.f14636n = 10;
                        return 10;
                    }
                    i12 = 0;
                    if (i12 != 0) {
                        return i12;
                    }
                    if (M(cArr[this.f14632j])) {
                        n0("Expected value");
                        throw null;
                    }
                    k();
                    this.f14636n = 10;
                    return 10;
                }
                i3 = i;
                if (i3 != 0) {
                    return i3;
                }
                int i114 = this.f14632j;
                i8 = this.f14633k;
                i9 = i;
                i10 = i9;
                int i25 = i10;
                i11 = i114;
                z5 = true;
                long j10 = 0;
                while (true) {
                    if (i11 + i10 != i8) {
                        c8 = cArr[i11 + i10];
                        if (c8 != '+') {
                            if (c8 != 'E') {
                                if (i9 != 2) {
                                }
                                i9 = 5;
                                i10++;
                            } else {
                                if (i9 != 2) {
                                }
                                i9 = 5;
                                i10++;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (M(cArr[this.f14632j])) {
                                n0("Expected value");
                                throw null;
                            }
                            k();
                            this.f14636n = 10;
                            return 10;
                        }
                        if (i9 != 5) {
                        }
                        i9 = 6;
                        i10++;
                    } else if (i10 != cArr.length) {
                        if (C(i10 + 1)) {
                            i11 = this.f14632j;
                            i8 = this.f14633k;
                            c8 = cArr[i11 + i10];
                            if (c8 != '+') {
                                if (c8 != 'E') {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                } else {
                                    if (i9 != 2) {
                                    }
                                    i9 = 5;
                                    i10++;
                                }
                                if (i12 != 0) {
                                    return i12;
                                }
                                if (M(cArr[this.f14632j])) {
                                    n0("Expected value");
                                    throw null;
                                }
                                k();
                                this.f14636n = 10;
                                return 10;
                            }
                            if (i9 != 5) {
                            }
                            i9 = 6;
                            i10++;
                        }
                        i13 = 2;
                        if (i9 != 2) {
                            if (i9 != i13) {
                            }
                            this.f14638p = i10;
                            i12 = 16;
                            this.f14636n = 16;
                        } else {
                            if (z5) {
                            }
                            i13 = 2;
                            if (i9 != i13) {
                            }
                            this.f14638p = i10;
                            i12 = 16;
                            this.f14636n = 16;
                        }
                        if (i12 != 0) {
                            return i12;
                        }
                        if (M(cArr[this.f14632j])) {
                            n0("Expected value");
                            throw null;
                        }
                        k();
                        this.f14636n = 10;
                        return 10;
                    }
                    i12 = 0;
                    if (i12 != 0) {
                        return i12;
                    }
                    if (M(cArr[this.f14632j])) {
                        n0("Expected value");
                        throw null;
                    }
                    k();
                    this.f14636n = 10;
                    return 10;
                }
            }
            if (i15 == 1) {
                this.f14636n = 4;
                return 4;
            }
        }
        if (i15 == 1) {
        }
        k();
        this.f14632j--;
        this.f14636n = 7;
        return 7;
    }

    public final IllegalStateException o0(String str) {
        String str2 = f0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbW = k.w("Expected ", str, " but was ");
        sbW.append(b.b(f0()));
        sbW.append(Q());
        sbW.append("\nSee ");
        sbW.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbW.toString());
    }

    public void s() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 4) {
            throw o0("END_ARRAY");
        }
        int i = this.f14641s;
        this.f14641s = i - 1;
        int[] iArr = this.f14643u;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f14636n = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + Q();
    }

    public void v() throws IOException {
        int iO = this.f14636n;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 2) {
            throw o0("END_OBJECT");
        }
        int i = this.f14641s;
        int i3 = i - 1;
        this.f14641s = i3;
        this.f14642t[i3] = null;
        int[] iArr = this.f14643u;
        int i6 = i - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f14636n = 0;
    }
}
