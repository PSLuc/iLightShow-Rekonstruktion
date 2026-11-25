package p096s;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0924q f11817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0930x f11818b;

    public C0(AbstractC0924q abstractC0924q, InterfaceC0930x interfaceC0930x) {
        this.f11817a = abstractC0924q;
        this.f11818b = interfaceC0930x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c6 = (C0) obj;
        return k.a(this.f11817a, c6.f11817a) && k.a(this.f11818b, c6.f11818b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f11818b.hashCode() + (this.f11817a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f11817a + ", easing=" + this.f11818b + ", arcMode=ArcMode(value=0))";
    }
}
