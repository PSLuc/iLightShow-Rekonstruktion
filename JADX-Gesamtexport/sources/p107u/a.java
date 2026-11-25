package p107u;

import p012c.k;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12611e;

    public a(long j4, long j6, long j7, long j8, long j9) {
        this.f12607a = j4;
        this.f12608b = j6;
        this.f12609c = j7;
        this.f12610d = j8;
        this.f12611e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.c(this.f12607a, aVar.f12607a) && r.c(this.f12608b, aVar.f12608b) && r.c(this.f12609c, aVar.f12609c) && r.c(this.f12610d, aVar.f12610d) && r.c(this.f12611e, aVar.f12611e);
    }

    public final int hashCode() {
        int i = r.f9086m;
        return Long.hashCode(this.f12611e) + k.l(k.l(k.l(Long.hashCode(this.f12607a) * 31, 31, this.f12608b), 31, this.f12609c), 31, this.f12610d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        k.z(this.f12607a, sb, ", textColor=");
        k.z(this.f12608b, sb, ", iconColor=");
        k.z(this.f12609c, sb, ", disabledTextColor=");
        k.z(this.f12610d, sb, ", disabledIconColor=");
        sb.append((Object) r.i(this.f12611e));
        sb.append(')');
        return sb.toString();
    }
}
