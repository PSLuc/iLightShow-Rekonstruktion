package Z;

import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5951b;

    public g(float f6, float f7) {
        this.f5950a = f6;
        this.f5951b = f7;
    }

    @Override // Z.c
    public final long a(long j4, long j6, S0.k kVar) {
        float f6 = (((int) (j6 >> 32)) - ((int) (j4 >> 32))) / 2.0f;
        float f7 = (((int) (j6 & 4294967295L)) - ((int) (j4 & 4294967295L))) / 2.0f;
        S0.k kVar2 = S0.k.f4897h;
        float f8 = this.f5950a;
        if (kVar != kVar2) {
            f8 *= -1;
        }
        float f9 = 1;
        return h0.c(Math.round((f8 + f9) * f6), Math.round((f9 + this.f5951b) * f7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f5950a, gVar.f5950a) == 0 && Float.compare(this.f5951b, gVar.f5951b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5951b) + (Float.hashCode(this.f5950a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f5950a);
        sb.append(", verticalBias=");
        return p012c.k.t(sb, this.f5951b, ')');
    }
}
