package R0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4730a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f4730a, ((a) obj).f4730a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4730a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f4730a + ')';
    }
}
