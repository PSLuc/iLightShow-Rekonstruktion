package A;

import p030f0.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2a;

    public c(float f6) {
        this.f2a = f6;
        if (f6 < 0.0f || f6 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // A.a
    public final float a(long j4, S0.b bVar) {
        return (this.f2a / 100.0f) * f.c(j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f2a, ((c) obj).f2a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f2a + "%)";
    }
}
