package N;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3678a;

    public X0(Object obj) {
        this.f3678a = obj;
    }

    @Override // N.Y0
    public final Object a(InterfaceC0225l0 interfaceC0225l0) {
        return this.f3678a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X0) && E4.k.a(this.f3678a, ((X0) obj).f3678a);
    }

    public final int hashCode() {
        Object obj = this.f3678a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f3678a + ')';
    }
}
