package G0;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: G0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0114j extends AbstractC0116l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f1506b;

    public C0114j(String str, H h6) {
        this.f1505a = str;
        this.f1506b = h6;
    }

    @Override // G0.AbstractC0116l
    public final H a() {
        return this.f1506b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0114j)) {
            return false;
        }
        C0114j c0114j = (C0114j) obj;
        if (!E4.k.a(this.f1505a, c0114j.f1505a)) {
            return false;
        }
        if (!E4.k.a(this.f1506b, c0114j.f1506b)) {
            return false;
        }
        c0114j.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f1505a.hashCode() * 31;
        H h6 = this.f1506b;
        return (iHashCode + (h6 != null ? h6.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f1505a, ')');
    }
}
