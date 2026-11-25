package p096s;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0918k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0929w f11819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11820b;

    public D(InterfaceC0929w interfaceC0929w, long j4) {
        this.f11819a = interfaceC0929w;
        this.f11820b = j4;
    }

    @Override // p096s.InterfaceC0918k
    public final y0 a(w0 w0Var) {
        return new B0(this.f11819a.a(w0Var), this.f11820b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        if (d6.f11819a.equals(this.f11819a)) {
            return d6.f11820b == this.f11820b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11820b) + ((AbstractC0916i.d(1) + (this.f11819a.hashCode() * 31)) * 31);
    }
}
