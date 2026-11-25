package A;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1a;

    public b(float f6) {
        this.f1a = f6;
    }

    @Override // A.a
    public final float a(long j4, S0.b bVar) {
        return bVar.y(this.f1a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && S0.e.a(this.f1a, ((b) obj).f1a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f1a + ".dp)";
    }
}
