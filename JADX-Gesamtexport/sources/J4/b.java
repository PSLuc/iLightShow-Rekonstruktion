package J4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1941h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1942j;

    public b(int i, int i3, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1941h = i;
        this.i = p133y4.b.b(i, i3, i6);
        this.f1942j = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f1941h == bVar.f1941h && this.i == bVar.i && this.f1942j == bVar.f1942j;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1941h * 31) + this.i) * 31) + this.f1942j;
    }

    public boolean isEmpty() {
        int i = this.f1942j;
        int i3 = this.i;
        int i6 = this.f1941h;
        if (i > 0) {
            return i6 > i3;
        }
        return i6 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f1941h, this.i, this.f1942j);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.i;
        int i3 = this.f1941h;
        int i6 = this.f1942j;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            i6 = -i6;
        }
        sb.append(i6);
        return sb.toString();
    }
}
