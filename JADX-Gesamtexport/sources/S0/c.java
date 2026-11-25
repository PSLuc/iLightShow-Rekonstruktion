package S0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4884h;
    public final float i;

    public c(float f6, float f7) {
        this.f4884h = f6;
        this.i = f7;
    }

    @Override // S0.b
    public final float a() {
        return this.f4884h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f4884h, cVar.f4884h) == 0 && Float.compare(this.i, cVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + (Float.hashCode(this.f4884h) * 31);
    }

    @Override // S0.b
    public final float n() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f4884h);
        sb.append(", fontScale=");
        return p012c.k.t(sb, this.i, ')');
    }
}
