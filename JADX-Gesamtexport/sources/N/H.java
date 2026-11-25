package N;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0217h0 f3612a;

    public H(C0217h0 c0217h0) {
        this.f3612a = c0217h0;
    }

    @Override // N.Y0
    public final Object a(InterfaceC0225l0 interfaceC0225l0) {
        return this.f3612a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.f3612a.equals(((H) obj).f3612a);
    }

    public final int hashCode() {
        return this.f3612a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f3612a + ')';
    }
}
