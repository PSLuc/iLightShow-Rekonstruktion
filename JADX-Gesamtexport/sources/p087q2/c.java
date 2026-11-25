package p087q2;

import T1.e;
import T1.k;
import java.math.BigInteger;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigInteger f11211h;

    static {
        BigInteger.valueOf(-2147483648L);
        BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(Long.MAX_VALUE);
    }

    public c(BigInteger bigInteger) {
        this.f11211h = bigInteger;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.d0(this.f11211h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return ((c) obj).f11211h.equals(this.f11211h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11211h.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        return this.f11211h.toString();
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_INT;
    }

    @Override // p087q2.q
    public final int q() {
        return this.f11211h.intValue();
    }
}
