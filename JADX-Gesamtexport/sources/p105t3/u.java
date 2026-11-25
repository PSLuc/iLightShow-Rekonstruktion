package p105t3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p116v3.d;
import p116v3.h;

/* JADX INFO: loaded from: classes.dex */
public final class u extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Serializable f12593h;

    public u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f12593h = bool;
    }

    public static boolean p(u uVar) {
        Serializable serializable = uVar.f12593h;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // p105t3.r
    public final int c() {
        return this.f12593h instanceof Number ? o().intValue() : Integer.parseInt(k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        Serializable serializable = this.f12593h;
        Serializable serializable2 = uVar.f12593h;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (p(this) && p(uVar)) {
            if ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) {
                return l().equals(uVar.l());
            }
            return o().longValue() == uVar.o().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : d.j(k())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : d.j(uVar.k())) == 0;
        }
        double dN = n();
        double dN2 = uVar.n();
        if (dN != dN2) {
            return Double.isNaN(dN) && Double.isNaN(dN2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f12593h;
        if (serializable == null) {
            return 31;
        }
        if (p(this)) {
            jDoubleToLongBits = o().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // p105t3.r
    public final long j() {
        return this.f12593h instanceof Number ? o().longValue() : Long.parseLong(k());
    }

    @Override // p105t3.r
    public final String k() {
        Serializable serializable = this.f12593h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return o().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger l() {
        Serializable serializable = this.f12593h;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (p(this)) {
            return BigInteger.valueOf(o().longValue());
        }
        String strK = k();
        d.d(strK);
        return new BigInteger(strK);
    }

    public final boolean m() {
        Serializable serializable = this.f12593h;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(k());
    }

    public final double n() {
        return this.f12593h instanceof Number ? o().doubleValue() : Double.parseDouble(k());
    }

    public final Number o() {
        Serializable serializable = this.f12593h;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public u(Number number) {
        Objects.requireNonNull(number);
        this.f12593h = number;
    }

    public u(String str) {
        Objects.requireNonNull(str);
        this.f12593h = str;
    }
}
