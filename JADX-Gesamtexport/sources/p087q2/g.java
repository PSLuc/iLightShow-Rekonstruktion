package p087q2;

import T1.e;
import T1.k;
import java.math.BigDecimal;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q {
    public static final g i = new g(BigDecimal.ZERO);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f11216h;

    static {
        BigDecimal.valueOf(-2147483648L);
        BigDecimal.valueOf(2147483647L);
        BigDecimal.valueOf(Long.MIN_VALUE);
        BigDecimal.valueOf(Long.MAX_VALUE);
    }

    public g(BigDecimal bigDecimal) {
        this.f11216h = bigDecimal;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.c0(this.f11216h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof g) && ((g) obj).f11216h.compareTo(this.f11216h) == 0;
    }

    public final int hashCode() {
        return Double.valueOf(this.f11216h.doubleValue()).hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        return this.f11216h.toString();
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_FLOAT;
    }

    @Override // p087q2.q
    public final int q() {
        return this.f11216h.intValue();
    }
}
