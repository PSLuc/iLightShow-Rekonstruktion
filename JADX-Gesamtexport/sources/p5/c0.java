package p5;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f11035j = new c0(254, 253);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11036h;
    public final int i;

    public c0(int i, int i3) {
        this.f11036h = i3;
        this.i = i;
    }

    public static c0 a(int i, int i3) {
        return (i == 254 && i3 == 253) ? f11035j : new c0(i, i3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c0 c0Var = (c0) obj;
        if (this == c0Var) {
            return 0;
        }
        int i = c0Var.i;
        int i3 = this.i;
        if (i3 != i) {
            return i3 < i ? 1 : -1;
        }
        int i6 = this.f11036h;
        int i7 = c0Var.f11036h;
        if (i6 < i7) {
            return 1;
        }
        return i6 > i7 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.i == c0Var.i && this.f11036h == c0Var.f11036h;
    }

    public final int hashCode() {
        return ((this.i + 31) * 31) + this.f11036h;
    }

    public final String toString() {
        return Integer.toString(255 - this.i) + "." + Integer.toString(255 - this.f11036h);
    }
}
