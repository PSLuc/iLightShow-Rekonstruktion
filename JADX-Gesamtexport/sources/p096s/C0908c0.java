package p096s;

import E4.k;

/* JADX INFO: renamed from: s.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908c0 implements InterfaceC0918k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0932z f11962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11963b;

    public C0908c0(InterfaceC0932z interfaceC0932z, long j4) {
        this.f11962a = interfaceC0932z;
        this.f11963b = j4;
    }

    @Override // p096s.InterfaceC0918k
    public final y0 a(w0 w0Var) {
        return new C0910d0(this.f11962a.a(w0Var), this.f11963b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0908c0)) {
            return false;
        }
        C0908c0 c0908c0 = (C0908c0) obj;
        return c0908c0.f11963b == this.f11963b && k.a(c0908c0.f11962a, this.f11962a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f11963b) + (this.f11962a.hashCode() * 31);
    }
}
