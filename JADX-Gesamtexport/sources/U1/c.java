package U1;

import B.AbstractC0013g0;
import T1.f;
import T1.i;
import T1.k;
import V1.e;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BigInteger f5332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BigInteger f5333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BigInteger f5334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BigInteger f5335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BigDecimal f5336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BigDecimal f5337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigDecimal f5338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BigDecimal f5339r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f5340j;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f5332k = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f5333l = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f5334m = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f5335n = bigIntegerValueOf4;
        f5336o = new BigDecimal(bigIntegerValueOf3);
        f5337p = new BigDecimal(bigIntegerValueOf4);
        f5338q = new BigDecimal(bigIntegerValueOf);
        f5339r = new BigDecimal(bigIntegerValueOf2);
    }

    public static final String G0(int i) {
        char c6 = (char) i;
        if (Character.isISOControl(c6)) {
            return AbstractC0013g0.f(i, "(CTRL-CHAR, code ", ")");
        }
        if (i <= 255) {
            return "'" + c6 + "' (code " + i + ")";
        }
        return "'" + c6 + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    public static String I0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String J0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    @Override // T1.i
    public final i F0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar == k.START_OBJECT || kVar == k.START_ARRAY) {
            int i = 1;
            while (true) {
                k kVarB0 = B0();
                if (kVarB0 == null) {
                    H0();
                    return this;
                }
                if (kVarB0.f5234l) {
                    i++;
                } else if (kVarB0.f5235m) {
                    i--;
                    if (i == 0) {
                    }
                } else if (kVarB0 == k.NOT_AVAILABLE) {
                    throw new JsonParseException(this, AbstractC0013g0.i("Not enough content available for `skipChildren()`: non-blocking parser? (", getClass().getName(), ")"));
                }
            }
        }
        return this;
    }

    public abstract void H0();

    public final void K0(String str) throws JsonParseException {
        throw new JsonParseException(this, str);
    }

    public final void L0(String str) throws JsonEOFException {
        throw new JsonEOFException(this, "Unexpected end-of-input" + str);
    }

    public final void M0(int i, String str) throws JsonParseException {
        if (i < 0) {
            L0(" in " + this.f5340j);
            throw null;
        }
        String strI = AbstractC0013g0.i("Unexpected character (", G0(i), ")");
        if (str != null) {
            strI = strI + ": " + str;
        }
        K0(strI);
        throw null;
    }

    public final void N0(int i, String str) throws JsonParseException {
        K0(AbstractC0013g0.i("Unexpected character (", G0(i), ") in numeric value") + ": " + str);
        throw null;
    }

    public final void O0(int i) throws JsonParseException {
        K0("Illegal character (" + G0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    public String P0() {
        k kVar = this.f5340j;
        if (kVar == k.VALUE_STRING) {
            return i0();
        }
        if (kVar == k.FIELD_NAME) {
            return Q();
        }
        if (kVar == null || kVar == k.VALUE_NULL || !kVar.f5237o) {
            return null;
        }
        return i0();
    }

    @Override // T1.i
    public String Q() {
        return o();
    }

    public final void Q0() throws InputCoercionException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", I0(i0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public final void R0() throws InputCoercionException {
        S0(i0());
        throw null;
    }

    public final void S0(String str) throws InputCoercionException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", I0(str), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    @Override // T1.i
    public final void k() {
        if (this.f5340j != null) {
            this.f5340j = null;
        }
    }

    @Override // T1.i
    public f m0() {
        return M();
    }

    @Override // T1.i
    public final int o0() {
        k kVar;
        k kVar2 = this.f5340j;
        k kVar3 = k.VALUE_NUMBER_INT;
        if (kVar2 == kVar3 || kVar2 == (kVar = k.VALUE_NUMBER_FLOAT)) {
            return Z();
        }
        if (kVar2 == kVar3 || kVar2 == kVar) {
            return Z();
        }
        if (kVar2 == null) {
            return 0;
        }
        int i = kVar2.f5233k;
        if (i == 6) {
            String strI0 = i0();
            if ("null".equals(strI0)) {
                return 0;
            }
            return e.a(strI0);
        }
        if (i == 9) {
            return 1;
        }
        if (i != 12) {
            return 0;
        }
        Object objX = X();
        if (objX instanceof Number) {
            return ((Number) objX).intValue();
        }
        return 0;
    }

    @Override // T1.i
    public final long p0() {
        k kVar;
        String strTrim;
        int length;
        k kVar2 = this.f5340j;
        k kVar3 = k.VALUE_NUMBER_INT;
        if (kVar2 == kVar3 || kVar2 == (kVar = k.VALUE_NUMBER_FLOAT)) {
            return a0();
        }
        if (kVar2 == kVar3 || kVar2 == kVar) {
            return a0();
        }
        if (kVar2 != null) {
            int i = kVar2.f5233k;
            if (i == 6) {
                String strI0 = i0();
                if (!"null".equals(strI0)) {
                    String str = e.f5496a;
                    if (strI0 != null && (length = (strTrim = strI0.trim()).length()) != 0) {
                        int i3 = 0;
                        char cCharAt = strTrim.charAt(0);
                        if (cCharAt == '+') {
                            strTrim = strTrim.substring(1);
                            length = strTrim.length();
                        } else if (cCharAt == '-') {
                            i3 = 1;
                        }
                        while (i3 < length) {
                            try {
                                char cCharAt2 = strTrim.charAt(i3);
                                if (cCharAt2 > '9' || cCharAt2 < '0') {
                                    return (long) e.c(strTrim, true);
                                }
                                i3++;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        return Long.parseLong(strTrim);
                    }
                }
                return 0L;
            }
            switch (i) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object objX = X();
                    if (objX instanceof Number) {
                        return ((Number) objX).longValue();
                    }
                default:
                    return 0L;
            }
        }
        return 0L;
    }

    @Override // T1.i
    public String q0() {
        return P0();
    }

    @Override // T1.i
    public final k s() {
        return this.f5340j;
    }

    @Override // T1.i
    public final boolean s0(k kVar) {
        return this.f5340j == kVar;
    }

    @Override // T1.i
    public final boolean t0() {
        k kVar = this.f5340j;
        return kVar != null && kVar.f5233k == 5;
    }

    @Override // T1.i
    public final int v() {
        k kVar = this.f5340j;
        if (kVar == null) {
            return 0;
        }
        return kVar.f5233k;
    }

    @Override // T1.i
    public final boolean v0() {
        return this.f5340j == k.VALUE_NUMBER_INT;
    }

    @Override // T1.i
    public final boolean w0() {
        return this.f5340j == k.START_ARRAY;
    }

    @Override // T1.i
    public final boolean x0() {
        return this.f5340j == k.START_OBJECT;
    }
}
