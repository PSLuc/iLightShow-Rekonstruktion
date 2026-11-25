package Z;

import S1.h0;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5947a;

    public d(float f6) {
        this.f5947a = f6;
    }

    @Override // Z.c
    public final long a(long j4, long j6, S0.k kVar) {
        long jB = AbstractC0473d.b(((int) (j6 >> 32)) - ((int) (j4 >> 32)), ((int) (j6 & 4294967295L)) - ((int) (j4 & 4294967295L)));
        float f6 = 1;
        return h0.c(Math.round((this.f5947a + f6) * (((int) (jB >> 32)) / 2.0f)), Math.round((f6 - 1.0f) * (((int) (jB & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Float.compare(this.f5947a, ((d) obj).f5947a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f5947a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f5947a + ", verticalBias=-1.0)";
    }
}
