package p058l0;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class q extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10339d;

    public q(float f6, float f7) {
        super(1);
        this.f10338c = f6;
        this.f10339d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f10338c, qVar.f10338c) == 0 && Float.compare(this.f10339d, qVar.f10339d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10339d) + (Float.hashCode(this.f10338c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f10338c);
        sb.append(", y=");
        return k.t(sb, this.f10339d, ')');
    }
}
