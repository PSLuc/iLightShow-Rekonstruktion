package N;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0230o f3562a;

    public /* synthetic */ C0(C0230o c0230o) {
        this.f3562a = c0230o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0) {
            return E4.k.a(this.f3562a, ((C0) obj).f3562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3562a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f3562a + ')';
    }
}
