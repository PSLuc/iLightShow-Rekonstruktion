package R0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f4753c = new o(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4755b;

    public o(float f6, float f7) {
        this.f4754a = f6;
        this.f4755b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4754a == oVar.f4754a && this.f4755b == oVar.f4755b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4755b) + (Float.hashCode(this.f4754a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f4754a);
        sb.append(", skewX=");
        return p012c.k.t(sb, this.f4755b, ')');
    }
}
