package p104t2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12489h;
    public Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12490j;

    public b(Class cls) {
        this.i = cls;
        String name = cls.getName();
        this.f12489h = name;
        this.f12490j = name.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12489h.compareTo(((b) obj).f12489h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == b.class && ((b) obj).i == this.i;
    }

    public final int hashCode() {
        return this.f12490j;
    }

    public final String toString() {
        return this.f12489h;
    }
}
