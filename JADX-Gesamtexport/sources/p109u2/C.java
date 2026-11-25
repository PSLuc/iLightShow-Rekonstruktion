package p109u2;

import p015c2.h;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f12673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f12674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12675d;

    public C(Class cls, boolean z5) {
        this.f12673b = cls;
        this.f12674c = null;
        this.f12675d = z5;
        this.f12672a = z5 ? cls.getName().hashCode() + 1 : cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C.class) {
            return false;
        }
        C c6 = (C) obj;
        if (c6.f12675d != this.f12675d) {
            return false;
        }
        Class cls = this.f12673b;
        if (cls != null) {
            return c6.f12673b == cls;
        }
        return this.f12674c.equals(c6.f12674c);
    }

    public final int hashCode() {
        return this.f12672a;
    }

    public final String toString() {
        boolean z5 = this.f12675d;
        Class cls = this.f12673b;
        if (cls != null) {
            return "{class: " + cls.getName() + ", typed? " + z5 + "}";
        }
        return "{type: " + this.f12674c + ", typed? " + z5 + "}";
    }

    public C(h hVar, boolean z5) {
        int i;
        this.f12674c = hVar;
        this.f12673b = null;
        this.f12675d = z5;
        if (z5) {
            i = hVar.f7282l - 2;
        } else {
            i = hVar.f7282l - 1;
        }
        this.f12672a = i;
    }
}
