package p096s;

import B.h1;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements InterfaceC0929w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0930x f12135c;

    public v0(int i, InterfaceC0930x interfaceC0930x, int i3) {
        this(i, 0, (i3 & 4) != 0 ? AbstractC0931y.f12146a : interfaceC0930x);
    }

    @Override // p096s.InterfaceC0918k
    public final y0 a(w0 w0Var) {
        return new h1(this.f12133a, this.f12134b, this.f12135c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (v0Var.f12133a == this.f12133a && v0Var.f12134b == this.f12134b && k.a(v0Var.f12135c, this.f12135c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12135c.hashCode() + (this.f12133a * 31)) * 31) + this.f12134b;
    }

    @Override // p096s.InterfaceC0929w, p096s.InterfaceC0918k
    public final z0 a(w0 w0Var) {
        return new h1(this.f12133a, this.f12134b, this.f12135c);
    }

    public v0(int i, int i3, InterfaceC0930x interfaceC0930x) {
        this.f12133a = i;
        this.f12134b = i3;
        this.f12135c = interfaceC0930x;
    }
}
