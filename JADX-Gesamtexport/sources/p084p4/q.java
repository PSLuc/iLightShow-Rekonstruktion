package p084p4;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10860h;

    public /* synthetic */ q(int i) {
        this.f10860h = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k.h(this.f10860h ^ Integer.MIN_VALUE, ((q) obj).f10860h ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f10860h == ((q) obj).f10860h;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10860h);
    }

    public final String toString() {
        return String.valueOf(((long) this.f10860h) & 4294967295L);
    }
}
