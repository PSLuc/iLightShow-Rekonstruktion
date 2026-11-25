package R4;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4846a;

    public g(Throwable th) {
        this.f4846a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return E4.k.a(this.f4846a, ((g) obj).f4846a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4846a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // R4.h
    public final String toString() {
        return "Closed(" + this.f4846a + ')';
    }
}
