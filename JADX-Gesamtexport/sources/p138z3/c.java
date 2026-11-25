package p138z3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p105t3.i;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f14645s = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f14646t = new String[128];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f14647u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Writer f14648h;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f14650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14657r;

    static {
        for (int i = 0; i <= 31; i++) {
            f14646t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f14646t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f14647u = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.i = iArr;
        this.f14649j = 0;
        if (iArr.length == 0) {
            this.i = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.i;
        int i = this.f14649j;
        this.f14649j = i + 1;
        iArr2[i] = 6;
        this.f14654o = 2;
        this.f14657r = true;
        Objects.requireNonNull(writer, "out == null");
        this.f14648h = writer;
        L(i.f12560d);
    }

    public void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f14656q != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iJ = J();
        if (iJ != 3 && iJ != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f14656q = str;
    }

    public final void D() throws IOException {
        if (this.f14653n) {
            return;
        }
        String str = this.f14650k.f12561a;
        Writer writer = this.f14648h;
        writer.write(str);
        int i = this.f14649j;
        for (int i3 = 1; i3 < i; i3++) {
            writer.write(this.f14650k.f12562b);
        }
    }

    public c G() throws IOException {
        if (this.f14656q != null) {
            if (!this.f14657r) {
                this.f14656q = null;
                return this;
            }
            b0();
        }
        b();
        this.f14648h.write("null");
        return this;
    }

    public final int J() {
        int i = this.f14649j;
        if (i != 0) {
            return this.i[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void L(i iVar) {
        Objects.requireNonNull(iVar);
        this.f14650k = iVar;
        this.f14652m = ",";
        if (iVar.f12563c) {
            this.f14651l = ": ";
            if (iVar.f12561a.isEmpty()) {
                this.f14652m = ", ";
            }
        } else {
            this.f14651l = ":";
        }
        this.f14653n = this.f14650k.f12561a.isEmpty() && this.f14650k.f12562b.isEmpty();
    }

    public final void M(int i) {
        if (i == 0) {
            throw null;
        }
        this.f14654o = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void Q(String str) throws IOException {
        String str2;
        String[] strArr = this.f14655p ? f14647u : f14646t;
        Writer writer = this.f14648h;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i3) {
                        writer.write(str, i, i3 - i);
                    }
                    writer.write(str2);
                    i = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i3) {
                    writer.write(str, i, i3 - i);
                }
                writer.write(str2);
                i = i3 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void T(double d6) throws IOException {
        b0();
        if (this.f14654o == 1 || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            b();
            this.f14648h.append((CharSequence) Double.toString(d6));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
        }
    }

    public void V(long j4) throws IOException {
        b0();
        b();
        this.f14648h.write(Long.toString(j4));
    }

    public void X(Boolean bool) throws IOException {
        if (bool == null) {
            G();
            return;
        }
        b0();
        b();
        this.f14648h.write(bool.booleanValue() ? "true" : "false");
    }

    public void Y(Number number) throws IOException {
        if (number == null) {
            G();
            return;
        }
        b0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f14645s.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f14654o != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        b();
        this.f14648h.append((CharSequence) string);
    }

    public void Z(String str) throws IOException {
        if (str == null) {
            G();
            return;
        }
        b0();
        b();
        Q(str);
    }

    public void a0(boolean z5) throws IOException {
        b0();
        b();
        this.f14648h.write(z5 ? "true" : "false");
    }

    public final void b() throws IOException {
        int iJ = J();
        if (iJ == 1) {
            this.i[this.f14649j - 1] = 2;
            D();
            return;
        }
        Writer writer = this.f14648h;
        if (iJ == 2) {
            writer.append((CharSequence) this.f14652m);
            D();
        } else {
            if (iJ == 4) {
                writer.append((CharSequence) this.f14651l);
                this.i[this.f14649j - 1] = 5;
                return;
            }
            if (iJ != 6) {
                if (iJ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f14654o != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.i[this.f14649j - 1] = 7;
        }
    }

    public final void b0() throws IOException {
        if (this.f14656q != null) {
            int iJ = J();
            if (iJ == 5) {
                this.f14648h.write(this.f14652m);
            } else if (iJ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            D();
            this.i[this.f14649j - 1] = 4;
            Q(this.f14656q);
            this.f14656q = null;
        }
    }

    public void c() throws IOException {
        b0();
        b();
        int i = this.f14649j;
        int[] iArr = this.i;
        if (i == iArr.length) {
            this.i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.i;
        int i3 = this.f14649j;
        this.f14649j = i3 + 1;
        iArr2[i3] = 1;
        this.f14648h.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14648h.close();
        int i = this.f14649j;
        if (i > 1 || (i == 1 && this.i[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f14649j = 0;
    }

    public void flush() throws IOException {
        if (this.f14649j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f14648h.flush();
    }

    public void k() throws IOException {
        b0();
        b();
        int i = this.f14649j;
        int[] iArr = this.i;
        if (i == iArr.length) {
            this.i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.i;
        int i3 = this.f14649j;
        this.f14649j = i3 + 1;
        iArr2[i3] = 3;
        this.f14648h.write(123);
    }

    public final void o(int i, int i3, char c6) throws IOException {
        int iJ = J();
        if (iJ != i3 && iJ != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f14656q != null) {
            throw new IllegalStateException("Dangling name: " + this.f14656q);
        }
        this.f14649j--;
        if (iJ == i3) {
            D();
        }
        this.f14648h.write(c6);
    }

    public void s() throws IOException {
        o(1, 2, ']');
    }

    public void v() throws IOException {
        o(3, 5, '}');
    }
}
