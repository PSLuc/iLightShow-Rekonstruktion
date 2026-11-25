package J4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f1946k = new d(1, 0, 1);

    @Override // J4.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        if (this.f1941h == dVar.f1941h) {
            return this.i == dVar.i;
        }
        return false;
    }

    @Override // J4.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1941h * 31) + this.i;
    }

    @Override // J4.b
    public final boolean isEmpty() {
        return this.f1941h > this.i;
    }

    @Override // J4.b
    public final String toString() {
        return this.f1941h + ".." + this.i;
    }
}
