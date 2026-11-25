package p040h0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9286b;

    public s(float f6, float f7) {
        this.f9285a = f6;
        this.f9286b = f7;
    }

    public final float[] a() {
        float f6 = this.f9285a;
        float f7 = this.f9286b;
        return new float[]{f6 / f7, 1.0f, ((1.0f - f6) - f7) / f7};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f9285a, sVar.f9285a) == 0 && Float.compare(this.f9286b, sVar.f9286b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9286b) + (Float.hashCode(this.f9285a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f9285a);
        sb.append(", y=");
        return k.t(sb, this.f9286b, ')');
    }
}
