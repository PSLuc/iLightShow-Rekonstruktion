package G0;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: G0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115k extends AbstractC0116l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f1508b;

    public C0115k(String str, H h6, int i) {
        h6 = (i & 2) != 0 ? null : h6;
        this.f1507a = str;
        this.f1508b = h6;
    }

    @Override // G0.AbstractC0116l
    public final H a() {
        return this.f1508b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115k)) {
            return false;
        }
        C0115k c0115k = (C0115k) obj;
        if (!E4.k.a(this.f1507a, c0115k.f1507a)) {
            return false;
        }
        if (!E4.k.a(this.f1508b, c0115k.f1508b)) {
            return false;
        }
        c0115k.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f1507a.hashCode() * 31;
        H h6 = this.f1508b;
        return (iHashCode + (h6 != null ? h6.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("LinkAnnotation.Url(url="), this.f1507a, ')');
    }
}
