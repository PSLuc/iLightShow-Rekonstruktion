package B3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f547b;

    public c(float f6, boolean z5) {
        this.f546a = z5;
        this.f547b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f546a == cVar.f546a && Float.compare(this.f547b, cVar.f547b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f547b) + (Boolean.hashCode(this.f546a) * 31);
    }

    public final String toString() {
        return "BeatTimingResult(shouldProcess=" + this.f546a + ", beatDuration=" + this.f547b + ")";
    }
}
