package R0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f4759c = new q(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f4760d = new q(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4762b;

    public q(int i, boolean z5) {
        this.f4761a = i;
        this.f4762b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f4761a == qVar.f4761a && this.f4762b == qVar.f4762b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4762b) + (Integer.hashCode(this.f4761a) * 31);
    }

    public final String toString() {
        if (equals(f4759c)) {
            return "TextMotion.Static";
        }
        return equals(f4760d) ? "TextMotion.Animated" : "Invalid";
    }
}
