package U;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5302a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5302a == ((a) obj).f5302a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5302a);
    }

    public final String toString() {
        return AbstractC0013g0.k(new StringBuilder("DeltaCounter(count="), this.f5302a, ')');
    }
}
