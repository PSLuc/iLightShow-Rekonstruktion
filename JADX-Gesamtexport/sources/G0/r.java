package G0;

import B.AbstractC0013g0;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.d f1534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1536c;

    public r(O0.d dVar, int i, int i3) {
        this.f1534a = dVar;
        this.f1535b = i;
        this.f1536c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1534a.equals(rVar.f1534a) && this.f1535b == rVar.f1535b && this.f1536c == rVar.f1536c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1536c) + AbstractC0916i.c(this.f1535b, this.f1534a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f1534a);
        sb.append(", startIndex=");
        sb.append(this.f1535b);
        sb.append(", endIndex=");
        return AbstractC0013g0.k(sb, this.f1536c, ')');
    }
}
