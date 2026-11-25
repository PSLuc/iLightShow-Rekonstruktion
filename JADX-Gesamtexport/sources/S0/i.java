package S0;

import B.AbstractC0013g0;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4891e = new i(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4895d;

    public i(int i, int i3, int i6, int i7) {
        this.f4892a = i;
        this.f4893b = i3;
        this.f4894c = i6;
        this.f4895d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4892a == iVar.f4892a && this.f4893b == iVar.f4893b && this.f4894c == iVar.f4894c && this.f4895d == iVar.f4895d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4895d) + AbstractC0916i.c(this.f4894c, AbstractC0916i.c(this.f4893b, Integer.hashCode(this.f4892a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f4892a);
        sb.append(", ");
        sb.append(this.f4893b);
        sb.append(", ");
        sb.append(this.f4894c);
        sb.append(", ");
        return AbstractC0013g0.k(sb, this.f4895d, ')');
    }
}
