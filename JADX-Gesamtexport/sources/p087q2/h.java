package p087q2;

import T1.e;
import T1.k;
import V1.f;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f11217h;

    public h(double d6) {
        this.f11217h = d6;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.X(this.f11217h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            if (Double.compare(this.f11217h, ((h) obj).f11217h) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f11217h);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        String str = f.f5498a;
        return Double.toString(this.f11217h);
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_FLOAT;
    }

    @Override // p087q2.q
    public final int q() {
        return (int) this.f11217h;
    }
}
