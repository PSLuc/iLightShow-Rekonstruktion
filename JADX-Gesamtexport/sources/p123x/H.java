package p123x;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13691d;

    public H(int i, int i3, int i6, int i7) {
        this.f13688a = i;
        this.f13689b = i3;
        this.f13690c = i6;
        this.f13691d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h6 = (H) obj;
        return this.f13688a == h6.f13688a && this.f13689b == h6.f13689b && this.f13690c == h6.f13690c && this.f13691d == h6.f13691d;
    }

    public final int hashCode() {
        return (((((this.f13688a * 31) + this.f13689b) * 31) + this.f13690c) * 31) + this.f13691d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f13688a);
        sb.append(", top=");
        sb.append(this.f13689b);
        sb.append(", right=");
        sb.append(this.f13690c);
        sb.append(", bottom=");
        return AbstractC0013g0.k(sb, this.f13691d, ')');
    }
}
