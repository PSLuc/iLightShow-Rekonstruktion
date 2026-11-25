package p109u2;

import T1.a;
import T1.f;
import T1.h;
import T1.j;
import T1.k;
import T1.l;
import T1.p;
import U1.c;
import V1.e;
import W4.i;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import p009b2.o;

/* JADX INFO: loaded from: classes.dex */
public final class y extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f12733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f12735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f12736v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public B f12738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient p009b2.c f12740z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public f f12732A = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12737w = -1;

    public y(z zVar, l lVar, boolean z5, boolean z6, j jVar) {
        this.f12736v = zVar;
        this.f12733s = lVar;
        this.f12738x = jVar == null ? new B() : new B(jVar);
        this.f12734t = z5;
        this.f12735u = z6;
    }

    @Override // T1.i
    public final k B0() {
        z zVar;
        B b6;
        if (this.f12739y || (zVar = this.f12736v) == null) {
            return null;
        }
        int i = this.f12737w + 1;
        this.f12737w = i;
        if (i >= 16) {
            this.f12737w = 0;
            z zVar2 = zVar.f12742a;
            this.f12736v = zVar2;
            if (zVar2 == null) {
                return null;
            }
        }
        k kVarC = this.f12736v.c(this.f12737w);
        this.f5340j = kVarC;
        if (kVarC == k.FIELD_NAME) {
            Object objT0 = T0();
            this.f12738x.f12670e = objT0 instanceof String ? (String) objT0 : objT0.toString();
        } else if (kVarC == k.START_OBJECT) {
            B b7 = this.f12738x;
            b7.f5216b++;
            this.f12738x = new B(b7, 2);
        } else if (kVarC == k.START_ARRAY) {
            B b8 = this.f12738x;
            b8.f5216b++;
            this.f12738x = new B(b8, 1);
        } else if (kVarC == k.END_OBJECT || kVarC == k.END_ARRAY) {
            B b9 = this.f12738x;
            j jVar = b9.f12668c;
            if (jVar instanceof B) {
                b6 = (B) jVar;
            } else {
                b6 = jVar == null ? new B() : new B(jVar, b9.f12669d);
            }
            this.f12738x = b6;
        } else {
            this.f12738x.f5216b++;
        }
        return this.f5340j;
    }

    @Override // T1.i
    public final BigInteger C() throws JsonParseException {
        Number numberC0 = c0();
        if (numberC0 instanceof BigInteger) {
            return (BigInteger) numberC0;
        }
        return b0() == h.f5212m ? ((BigDecimal) numberC0).toBigInteger() : BigInteger.valueOf(numberC0.longValue());
    }

    @Override // T1.i
    public final int C0(a aVar, f fVar) throws JsonParseException {
        byte[] bArrD = D(aVar);
        if (bArrD == null) {
            return 0;
        }
        fVar.write(bArrD, 0, bArrD.length);
        return bArrD.length;
    }

    @Override // T1.i
    public final byte[] D(a aVar) throws JsonParseException {
        if (this.f5340j == k.VALUE_EMBEDDED_OBJECT) {
            Object objT0 = T0();
            if (objT0 instanceof byte[]) {
                return (byte[]) objT0;
            }
        }
        if (this.f5340j != k.VALUE_STRING) {
            throw new JsonParseException(this, "Current token (" + this.f5340j + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
        }
        String strI0 = i0();
        if (strI0 == null) {
            return null;
        }
        p009b2.c cVar = this.f12740z;
        if (cVar == null) {
            cVar = new p009b2.c(100);
            this.f12740z = cVar;
        } else {
            cVar.s();
        }
        try {
            aVar.b(strI0, cVar);
            return cVar.v();
        } catch (IllegalArgumentException e6) {
            K0(e6.getMessage());
            throw null;
        }
    }

    @Override // U1.c
    public final void H0() {
        o.a();
        throw null;
    }

    @Override // T1.i
    public final l L() {
        return this.f12733s;
    }

    @Override // T1.i
    public final f M() {
        f fVar = this.f12732A;
        return fVar == null ? f.f5182n : fVar;
    }

    @Override // T1.i
    public final BigDecimal T() throws JsonParseException {
        Number numberC0 = c0();
        if (numberC0 instanceof BigDecimal) {
            return (BigDecimal) numberC0;
        }
        int iOrdinal = b0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return BigDecimal.valueOf(numberC0.longValue());
        }
        return iOrdinal != 2 ? BigDecimal.valueOf(numberC0.doubleValue()) : new BigDecimal((BigInteger) numberC0);
    }

    public final Object T0() {
        z zVar = this.f12736v;
        return zVar.f12744c[this.f12737w];
    }

    @Override // T1.i
    public final double V() {
        return c0().doubleValue();
    }

    @Override // T1.i
    public final Object X() {
        if (this.f5340j == k.VALUE_EMBEDDED_OBJECT) {
            return T0();
        }
        return null;
    }

    @Override // T1.i
    public final float Y() {
        return c0().floatValue();
    }

    @Override // T1.i
    public final int Z() throws InputCoercionException {
        Number numberC0 = this.f5340j == k.VALUE_NUMBER_INT ? (Number) T0() : c0();
        if ((numberC0 instanceof Integer) || (numberC0 instanceof Short) || (numberC0 instanceof Byte)) {
            return numberC0.intValue();
        }
        if (numberC0 instanceof Long) {
            long jLongValue = numberC0.longValue();
            int i = (int) jLongValue;
            if (i == jLongValue) {
                return i;
            }
            Q0();
            throw null;
        }
        if (numberC0 instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) numberC0;
            if (c.f5332k.compareTo(bigInteger) > 0 || c.f5333l.compareTo(bigInteger) < 0) {
                Q0();
                throw null;
            }
        } else {
            if ((numberC0 instanceof Double) || (numberC0 instanceof Float)) {
                double dDoubleValue = numberC0.doubleValue();
                if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                    return (int) dDoubleValue;
                }
                Q0();
                throw null;
            }
            if (!(numberC0 instanceof BigDecimal)) {
                o.a();
                throw null;
            }
            BigDecimal bigDecimal = (BigDecimal) numberC0;
            if (c.f5338q.compareTo(bigDecimal) > 0 || c.f5339r.compareTo(bigDecimal) < 0) {
                Q0();
                throw null;
            }
        }
        return numberC0.intValue();
    }

    @Override // T1.i
    public final long a0() throws InputCoercionException {
        Number numberC0 = this.f5340j == k.VALUE_NUMBER_INT ? (Number) T0() : c0();
        if ((numberC0 instanceof Long) || (numberC0 instanceof Integer) || (numberC0 instanceof Short) || (numberC0 instanceof Byte)) {
            return numberC0.longValue();
        }
        if (numberC0 instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) numberC0;
            if (c.f5334m.compareTo(bigInteger) > 0 || c.f5335n.compareTo(bigInteger) < 0) {
                R0();
                throw null;
            }
        } else {
            if ((numberC0 instanceof Double) || (numberC0 instanceof Float)) {
                double dDoubleValue = numberC0.doubleValue();
                if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
                    return (long) dDoubleValue;
                }
                R0();
                throw null;
            }
            if (!(numberC0 instanceof BigDecimal)) {
                o.a();
                throw null;
            }
            BigDecimal bigDecimal = (BigDecimal) numberC0;
            if (c.f5336o.compareTo(bigDecimal) > 0 || c.f5337p.compareTo(bigDecimal) < 0) {
                R0();
                throw null;
            }
        }
        return numberC0.longValue();
    }

    @Override // T1.i
    public final boolean b() {
        return this.f12735u;
    }

    @Override // T1.i
    public final h b0() throws JsonParseException {
        Number numberC0 = c0();
        boolean z5 = numberC0 instanceof Integer;
        h hVar = h.f5208h;
        if (z5) {
            return hVar;
        }
        if (numberC0 instanceof Long) {
            return h.i;
        }
        if (numberC0 instanceof Double) {
            return h.f5211l;
        }
        if (numberC0 instanceof BigDecimal) {
            return h.f5212m;
        }
        if (numberC0 instanceof BigInteger) {
            return h.f5209j;
        }
        if (numberC0 instanceof Float) {
            return h.f5210k;
        }
        if (numberC0 instanceof Short) {
            return hVar;
        }
        return null;
    }

    @Override // T1.i
    public final boolean c() {
        return this.f12734t;
    }

    @Override // T1.i
    public final Number c0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar == null || !kVar.f5236n) {
            throw new JsonParseException(this, "Current token (" + this.f5340j + ") not numeric, cannot use numeric value accessors");
        }
        Object objT0 = T0();
        if (objT0 instanceof Number) {
            return (Number) objT0;
        }
        if (objT0 instanceof String) {
            String str = (String) objT0;
            return str.indexOf(46) >= 0 ? Double.valueOf(e.c(str, u0(p.USE_FAST_DOUBLE_PARSER))) : Long.valueOf(e.g(str));
        }
        if (objT0 == null) {
            return null;
        }
        throw new IllegalStateException("Internal error: entry should be a Number, but is of type ".concat(objT0.getClass().getName()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12739y) {
            return;
        }
        this.f12739y = true;
    }

    @Override // T1.i
    public final Object e0() {
        z zVar = this.f12736v;
        int i = this.f12737w;
        TreeMap treeMap = zVar.f12745d;
        if (treeMap == null) {
            return null;
        }
        return treeMap.get(Integer.valueOf(i + i + 1));
    }

    @Override // T1.i
    public final j f0() {
        return this.f12738x;
    }

    @Override // T1.i
    public final i g0() {
        return T1.i.i;
    }

    @Override // T1.i
    public final String i0() {
        k kVar = this.f5340j;
        if (kVar == k.VALUE_STRING || kVar == k.FIELD_NAME) {
            Object objT0 = T0();
            if (objT0 instanceof String) {
                return (String) objT0;
            }
            Annotation[] annotationArr = i.f12697a;
            if (objT0 == null) {
                return null;
            }
            return objT0.toString();
        }
        if (kVar == null) {
            return null;
        }
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 8 && iOrdinal != 9) {
            return this.f5340j.f5231h;
        }
        Object objT1 = T0();
        Annotation[] annotationArr2 = i.f12697a;
        if (objT1 == null) {
            return null;
        }
        return objT1.toString();
    }

    @Override // T1.i
    public final char[] j0() {
        String strI0 = i0();
        if (strI0 == null) {
            return null;
        }
        return strI0.toCharArray();
    }

    @Override // T1.i
    public final int k0() {
        String strI0 = i0();
        if (strI0 == null) {
            return 0;
        }
        return strI0.length();
    }

    @Override // T1.i
    public final int l0() {
        return 0;
    }

    @Override // T1.i
    public final Object n0() {
        z zVar = this.f12736v;
        int i = this.f12737w;
        TreeMap treeMap = zVar.f12745d;
        if (treeMap == null) {
            return null;
        }
        return treeMap.get(Integer.valueOf(i + i));
    }

    @Override // T1.i
    public final String o() {
        k kVar = this.f5340j;
        return (kVar == k.START_OBJECT || kVar == k.START_ARRAY) ? this.f12738x.f12668c.a() : this.f12738x.f12670e;
    }

    @Override // T1.i
    public final boolean r0() {
        return false;
    }

    @Override // T1.i
    public final boolean y0() {
        if (this.f5340j == k.VALUE_NUMBER_FLOAT) {
            Object objT0 = T0();
            if (objT0 instanceof Double) {
                Double d6 = (Double) objT0;
                return d6.isNaN() || d6.isInfinite();
            }
            if (objT0 instanceof Float) {
                Float f6 = (Float) objT0;
                return f6.isNaN() || f6.isInfinite();
            }
        }
        return false;
    }

    @Override // T1.i
    public final String z0() {
        z zVar;
        if (this.f12739y || (zVar = this.f12736v) == null) {
            return null;
        }
        int i = this.f12737w + 1;
        if (i < 16) {
            k kVarC = zVar.c(i);
            k kVar = k.FIELD_NAME;
            if (kVarC == kVar) {
                this.f12737w = i;
                this.f5340j = kVar;
                String str = this.f12736v.f12744c[i];
                String string = str instanceof String ? str : str.toString();
                this.f12738x.f12670e = string;
                return string;
            }
        }
        if (B0() == k.FIELD_NAME) {
            return o();
        }
        return null;
    }
}
