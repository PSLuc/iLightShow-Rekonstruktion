package U1;

import H1.d;
import T1.f;
import T1.g;
import T1.h;
import T1.j;
import T1.k;
import V1.e;
import W4.i;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p009b2.m;
import p009b2.o;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final i f5308T = T1.i.i;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5309A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f5310B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Y1.b f5311C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public k f5312D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final m f5313E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public char[] f5314F;
    public boolean G;
    public p009b2.c H;
    public byte[] I;
    public int J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f5315K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f5316L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f5317M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public double f5318N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public BigInteger f5319O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public BigDecimal f5320P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f5321Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f5322R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f5323S;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final I1.b f5324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5331z;

    public b(I1.b bVar, int i) {
        this.f5214h = i;
        this.f5329x = 1;
        this.f5309A = 1;
        this.J = 0;
        this.f5324s = bVar;
        this.f5313E = new m((p009b2.a) bVar.f1817e);
        this.f5311C = new Y1.b(null, g.STRICT_DUPLICATE_DETECTION.a(i) ? new d(this) : null, 0, 1, 0);
    }

    public static IllegalArgumentException f1(T1.a aVar, int i, int i3, String str) {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i3 + 1));
        } else if (i == aVar.f5153l) {
            str2 = "Unexpected padding character ('" + aVar.f5153l + "') as character #" + (i3 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    @Override // T1.i
    public final BigInteger C() throws JsonParseException, InputCoercionException {
        int i = this.J;
        if ((i & 4) == 0) {
            if (i == 0) {
                Z0(4);
            }
            int i3 = this.J;
            if ((i3 & 4) == 0) {
                if ((i3 & 16) != 0) {
                    this.f5319O = X0().toBigInteger();
                } else if ((i3 & 2) != 0) {
                    this.f5319O = BigInteger.valueOf(this.f5316L);
                } else if ((i3 & 1) != 0) {
                    this.f5319O = BigInteger.valueOf(this.f5315K);
                } else {
                    if ((i3 & 8) == 0) {
                        o.a();
                        throw null;
                    }
                    this.f5319O = BigDecimal.valueOf(this.f5318N).toBigInteger();
                }
                this.J |= 4;
            }
        }
        return Y0();
    }

    @Override // T1.i
    public final void E0(Object obj) {
        this.f5311C.f5823g = obj;
    }

    @Override // U1.c
    public final void H0() {
        if (this.f5311C.f()) {
            return;
        }
        String str = this.f5311C.d() ? "Array" : "Object";
        Y1.b bVar = this.f5311C;
        V1.c cVarU0 = U0();
        bVar.getClass();
        L0(": expected close marker for " + str + " (start marker at " + new f(cVarU0, -1L, -1L, bVar.f5824h, bVar.i) + ")");
        throw null;
    }

    @Override // U1.c, T1.i
    public final String Q() {
        Y1.b bVar;
        k kVar = this.f5340j;
        return ((kVar == k.START_OBJECT || kVar == k.START_ARRAY) && (bVar = this.f5311C.f5819c) != null) ? bVar.f5822f : this.f5311C.f5822f;
    }

    @Override // T1.i
    public final BigDecimal T() throws JsonParseException, InputCoercionException {
        int i = this.J;
        if ((i & 16) == 0) {
            if (i == 0) {
                Z0(16);
            }
            int i3 = this.J;
            if ((i3 & 16) == 0) {
                if ((i3 & 8) != 0) {
                    String strI0 = i0();
                    String str = e.f5496a;
                    this.f5320P = AbstractC0473d.L(strI0);
                } else if ((i3 & 4) != 0) {
                    this.f5320P = new BigDecimal(Y0());
                } else if ((i3 & 2) != 0) {
                    this.f5320P = BigDecimal.valueOf(this.f5316L);
                } else {
                    if ((i3 & 1) == 0) {
                        o.a();
                        throw null;
                    }
                    this.f5320P = BigDecimal.valueOf(this.f5315K);
                }
                this.J |= 16;
            }
        }
        return X0();
    }

    public abstract void T0();

    public final V1.c U0() {
        return g.INCLUDE_SOURCE_IN_LOCATION.a(this.f5214h) ? (V1.c) this.f5324s.f1815c : V1.c.f5492j;
    }

    @Override // T1.i
    public final double V() throws JsonParseException, InputCoercionException {
        int i = this.J;
        if ((i & 8) == 0) {
            if (i == 0) {
                Z0(8);
            }
            int i3 = this.J;
            if ((i3 & 8) == 0) {
                if ((i3 & 16) != 0) {
                    this.f5318N = X0().doubleValue();
                } else if ((i3 & 4) != 0) {
                    this.f5318N = Y0().doubleValue();
                } else if ((i3 & 2) != 0) {
                    this.f5318N = this.f5316L;
                } else if ((i3 & 1) != 0) {
                    this.f5318N = this.f5315K;
                } else {
                    if ((i3 & 32) == 0) {
                        o.a();
                        throw null;
                    }
                    this.f5318N = this.f5317M;
                }
                this.J |= 8;
            }
        }
        return this.f5318N;
    }

    public final int V0(T1.a aVar, char c6, int i) {
        if (c6 != '\\') {
            throw f1(aVar, c6, i, null);
        }
        char cW0 = W0();
        if (cW0 <= ' ' && i == 0) {
            return -1;
        }
        int iC = aVar.c(cW0);
        if (iC >= 0 || (iC == -2 && i >= 2)) {
            return iC;
        }
        throw f1(aVar, cW0, i, null);
    }

    public abstract char W0();

    public final BigDecimal X0() {
        BigDecimal bigDecimal = this.f5320P;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.f5321Q;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        String str2 = e.f5496a;
        BigDecimal bigDecimalL = AbstractC0473d.L(str);
        this.f5320P = bigDecimalL;
        this.f5321Q = null;
        return bigDecimalL;
    }

    @Override // T1.i
    public final float Y() throws JsonParseException, InputCoercionException {
        int i = this.J;
        if ((i & 32) == 0) {
            if (i == 0) {
                Z0(32);
            }
            int i3 = this.J;
            if ((i3 & 32) == 0) {
                if ((i3 & 16) != 0) {
                    this.f5317M = X0().floatValue();
                } else if ((i3 & 4) != 0) {
                    this.f5317M = Y0().floatValue();
                } else if ((i3 & 2) != 0) {
                    this.f5317M = this.f5316L;
                } else if ((i3 & 1) != 0) {
                    this.f5317M = this.f5315K;
                } else {
                    if ((i3 & 8) == 0) {
                        o.a();
                        throw null;
                    }
                    this.f5317M = (float) this.f5318N;
                }
                this.J |= 32;
            }
        }
        return this.f5317M;
    }

    public final BigInteger Y0() {
        BigInteger bigInteger = this.f5319O;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.f5321Q;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        BigInteger bigIntegerB = e.b(str);
        this.f5319O = bigIntegerB;
        this.f5321Q = null;
        return bigIntegerB;
    }

    @Override // T1.i
    public final int Z() throws JsonParseException, InputCoercionException {
        int i = this.J;
        int i3 = i & 1;
        if (i3 == 0) {
            if (i == 0) {
                if (this.f5325t) {
                    K0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                }
                if (this.f5340j != k.VALUE_NUMBER_INT || this.f5323S > 9) {
                    Z0(1);
                    if ((this.J & 1) == 0) {
                        e1();
                    }
                    return this.f5315K;
                }
                int iF = this.f5313E.f(this.f5322R);
                this.f5315K = iF;
                this.J = 1;
                return iF;
            }
            if (i3 == 0) {
                e1();
            }
        }
        return this.f5315K;
    }

    public final void Z0(int i) throws JsonParseException, InputCoercionException {
        long jH;
        long jH2;
        char[] cArr;
        if (this.f5325t) {
            K0("Internal error: _parseNumericValue called when parser instance closed");
            throw null;
        }
        k kVar = this.f5340j;
        k kVar2 = k.VALUE_NUMBER_INT;
        m mVar = this.f5313E;
        if (kVar != kVar2) {
            if (kVar != k.VALUE_NUMBER_FLOAT) {
                throw new JsonParseException(this, "Current token (" + kVar + ") not numeric, can not use numeric value accessors");
            }
            try {
                if (i == 16) {
                    this.f5320P = null;
                    this.f5321Q = mVar.g();
                    this.J = 16;
                    return;
                } else if (i == 32) {
                    this.f5317M = e.d(mVar.g(), g.USE_FAST_DOUBLE_PARSER.a(this.f5214h));
                    this.J = 32;
                    return;
                } else {
                    this.f5318N = e.c(mVar.g(), g.USE_FAST_DOUBLE_PARSER.a(this.f5214h));
                    this.J = 8;
                    return;
                }
            } catch (NumberFormatException e6) {
                JsonParseException jsonParseException = new JsonParseException("Malformed numeric value (" + c.J0(mVar.g()) + ")", M(), e6);
                jsonParseException.i = this;
                throw jsonParseException;
            }
        }
        int i3 = this.f5323S;
        if (i3 <= 9) {
            this.f5315K = mVar.f(this.f5322R);
            this.J = 1;
            return;
        }
        int i6 = 0;
        if (i3 <= 18) {
            boolean z5 = this.f5322R;
            int i7 = mVar.f7085c;
            if (i7 < 0 || (cArr = mVar.f7084b) == null) {
                if (z5) {
                    jH2 = e.h(mVar.f7090h, 1, mVar.i - 1);
                    jH = -jH2;
                } else {
                    jH = e.h(mVar.f7090h, 0, mVar.i);
                }
            } else if (z5) {
                jH2 = e.h(cArr, i7 + 1, mVar.f7086d - 1);
                jH = -jH2;
            } else {
                jH = e.h(cArr, i7, mVar.f7086d);
            }
            if (i3 == 10) {
                if (this.f5322R) {
                    if (jH >= -2147483648L) {
                        this.f5315K = (int) jH;
                        this.J = 1;
                        return;
                    }
                } else if (jH <= 2147483647L) {
                    this.f5315K = (int) jH;
                    this.J = 1;
                    return;
                }
            }
            this.f5316L = jH;
            this.J = 2;
            return;
        }
        String strG = mVar.g();
        try {
            int i8 = this.f5323S;
            char[] cArrL = mVar.l();
            int i9 = mVar.f7085c;
            if (i9 < 0) {
                i9 = 0;
            }
            boolean z6 = this.f5322R;
            if (z6) {
                i9++;
            }
            String str = z6 ? e.f5496a : e.f5497b;
            int length = str.length();
            if (i8 >= length) {
                if (i8 <= length) {
                    while (true) {
                        if (i6 < length) {
                            int iCharAt = cArrL[i9 + i6] - str.charAt(i6);
                            if (iCharAt == 0) {
                                i6++;
                            } else if (iCharAt >= 0) {
                                break;
                            }
                        }
                    }
                }
                if (i != 1 && i != 2) {
                    if (i != 8 && i != 32) {
                        this.f5319O = null;
                        this.f5321Q = strG;
                        this.J = 4;
                        return;
                    }
                    this.f5318N = e.c(strG, g.USE_FAST_DOUBLE_PARSER.a(this.f5214h));
                    this.J = 8;
                    return;
                }
                if (i == 1) {
                    throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", c.I0(strG), Integer.MIN_VALUE, Integer.MAX_VALUE));
                }
                S0(strG);
                throw null;
            }
            this.f5316L = Long.parseLong(strG);
            this.J = 2;
        } catch (NumberFormatException e7) {
            JsonParseException jsonParseException2 = new JsonParseException("Malformed numeric value (" + c.J0(strG) + ")", M(), e7);
            jsonParseException2.i = this;
            throw jsonParseException2;
        }
    }

    @Override // T1.i
    public final long a0() throws JsonParseException, InputCoercionException {
        int i = this.J;
        if ((i & 2) == 0) {
            if (i == 0) {
                Z0(2);
            }
            int i3 = this.J;
            if ((i3 & 2) == 0) {
                if ((i3 & 1) != 0) {
                    this.f5316L = this.f5315K;
                } else if ((i3 & 4) != 0) {
                    BigInteger bigIntegerY0 = Y0();
                    if (c.f5334m.compareTo(bigIntegerY0) > 0 || c.f5335n.compareTo(bigIntegerY0) < 0) {
                        R0();
                        throw null;
                    }
                    this.f5316L = bigIntegerY0.longValue();
                } else if ((i3 & 8) != 0) {
                    double d6 = this.f5318N;
                    if (d6 < -9.223372036854776E18d || d6 > 9.223372036854776E18d) {
                        R0();
                        throw null;
                    }
                    this.f5316L = (long) d6;
                } else {
                    if ((i3 & 16) == 0) {
                        o.a();
                        throw null;
                    }
                    BigDecimal bigDecimalX0 = X0();
                    if (c.f5336o.compareTo(bigDecimalX0) > 0 || c.f5337p.compareTo(bigDecimalX0) < 0) {
                        R0();
                        throw null;
                    }
                    this.f5316L = bigDecimalX0.longValue();
                }
                this.J |= 2;
            }
        }
        return this.f5316L;
    }

    public abstract void a1();

    @Override // T1.i
    public final h b0() throws JsonParseException, InputCoercionException {
        if (this.J == 0) {
            Z0(0);
        }
        if (this.f5340j == k.VALUE_NUMBER_INT) {
            int i = this.J;
            if ((i & 1) != 0) {
                return h.f5208h;
            }
            return (i & 2) != 0 ? h.i : h.f5209j;
        }
        int i3 = this.J;
        if ((i3 & 16) != 0) {
            return h.f5212m;
        }
        return (i3 & 32) != 0 ? h.f5210k : h.f5211l;
    }

    public final void b1(char c6, int i) {
        Y1.b bVar = this.f5311C;
        K0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c6), bVar.h(), new f(U0(), -1L, -1L, bVar.f5824h, bVar.i)));
        throw null;
    }

    @Override // T1.i
    public final Number c0() throws JsonParseException, InputCoercionException {
        if (this.J == 0) {
            Z0(0);
        }
        if (this.f5340j == k.VALUE_NUMBER_INT) {
            int i = this.J;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.f5315K);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.f5316L);
            }
            if ((i & 4) != 0) {
                return Y0();
            }
            o.a();
            throw null;
        }
        int i3 = this.J;
        if ((i3 & 16) != 0) {
            return X0();
        }
        if ((i3 & 32) != 0) {
            return Float.valueOf(this.f5317M);
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.f5318N);
        }
        o.a();
        throw null;
    }

    public final void c1(int i, String str) {
        if (!g.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.f5214h) || i > 32) {
            K0("Illegal unquoted character (" + c.G0((char) i) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5325t) {
            return;
        }
        this.f5326u = Math.max(this.f5326u, this.f5327v);
        this.f5325t = true;
        try {
            T0();
        } finally {
            a1();
        }
    }

    @Override // T1.i
    public final Number d0() throws JsonParseException, InputCoercionException {
        if (this.f5340j == k.VALUE_NUMBER_INT) {
            if (this.J == 0) {
                Z0(0);
            }
            int i = this.J;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.f5315K);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.f5316L);
            }
            if ((i & 4) != 0) {
                return Y0();
            }
            o.a();
            throw null;
        }
        if (this.J == 0) {
            Z0(16);
        }
        int i3 = this.J;
        if ((i3 & 16) != 0) {
            return X0();
        }
        if ((i3 & 32) != 0) {
            return Float.valueOf(this.f5317M);
        }
        if ((i3 & 8) != 0) {
            return Double.valueOf(this.f5318N);
        }
        o.a();
        throw null;
    }

    public final String d1() {
        return g.ALLOW_NON_NUMERIC_NUMBERS.a(this.f5214h) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void e1() throws InputCoercionException {
        int i = this.J;
        if ((i & 2) != 0) {
            long j4 = this.f5316L;
            int i3 = (int) j4;
            if (i3 != j4) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", c.I0(i0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.f5315K = i3;
        } else if ((i & 4) != 0) {
            BigInteger bigIntegerY0 = Y0();
            if (c.f5332k.compareTo(bigIntegerY0) > 0 || c.f5333l.compareTo(bigIntegerY0) < 0) {
                Q0();
                throw null;
            }
            this.f5315K = bigIntegerY0.intValue();
        } else if ((i & 8) != 0) {
            double d6 = this.f5318N;
            if (d6 < -2.147483648E9d || d6 > 2.147483647E9d) {
                Q0();
                throw null;
            }
            this.f5315K = (int) d6;
        } else {
            if ((i & 16) == 0) {
                o.a();
                throw null;
            }
            BigDecimal bigDecimalX0 = X0();
            if (c.f5338q.compareTo(bigDecimalX0) > 0 || c.f5339r.compareTo(bigDecimalX0) < 0) {
                Q0();
                throw null;
            }
            this.f5315K = bigDecimalX0.intValue();
        }
        this.J |= 1;
    }

    @Override // T1.i
    public final j f0() {
        return this.f5311C;
    }

    public final k g1(String str, double d6) {
        m mVar = this.f5313E;
        mVar.f7084b = null;
        mVar.f7085c = -1;
        mVar.f7086d = 0;
        mVar.f7091j = str;
        mVar.f7092k = null;
        if (mVar.f7088f) {
            mVar.d();
        }
        mVar.i = 0;
        this.f5318N = d6;
        this.J = 8;
        return k.VALUE_NUMBER_FLOAT;
    }

    @Override // T1.i
    public final boolean r0() {
        k kVar = this.f5340j;
        if (kVar == k.VALUE_STRING) {
            return true;
        }
        if (kVar == k.FIELD_NAME) {
            return this.G;
        }
        return false;
    }

    @Override // T1.i
    public final boolean y0() {
        if (this.f5340j != k.VALUE_NUMBER_FLOAT || (this.J & 8) == 0) {
            return false;
        }
        double d6 = this.f5318N;
        return Double.isNaN(d6) || Double.isInfinite(d6);
    }
}
