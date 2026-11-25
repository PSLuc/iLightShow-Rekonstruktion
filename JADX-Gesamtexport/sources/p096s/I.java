package p096s;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f11852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0930x f11853b;

    public I(Float f6, InterfaceC0930x interfaceC0930x) {
        this.f11852a = f6;
        this.f11853b = interfaceC0930x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return i.f11852a.equals(this.f11852a) && k.a(i.f11853b, this.f11853b);
    }

    public final int hashCode() {
        return this.f11853b.hashCode() + AbstractC0916i.c(0, this.f11852a.hashCode() * 31, 31);
    }
}
