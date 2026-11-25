package p087q2;

import T1.e;
import T1.k;
import V1.f;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f11218h;

    public i(float f6) {
        this.f11218h = f6;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        eVar.Y(this.f11218h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            if (Float.compare(this.f11218h, ((i) obj).f11218h) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11218h);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        String str = f.f5498a;
        return Float.toString(this.f11218h);
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_NUMBER_FLOAT;
    }

    @Override // p087q2.q
    public final int q() {
        return (int) this.f11218h;
    }
}
