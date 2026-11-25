package F;

import B.EnumC0009e0;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0009e0 f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1079d;

    public A(EnumC0009e0 enumC0009e0, long j4, int i, boolean z5) {
        this.f1076a = enumC0009e0;
        this.f1077b = j4;
        this.f1078c = i;
        this.f1079d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        return this.f1076a == a6.f1076a && p030f0.c.b(this.f1077b, a6.f1077b) && this.f1078c == a6.f1078c && this.f1079d == a6.f1079d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1079d) + ((AbstractC0916i.d(this.f1078c) + p012c.k.l(this.f1076a.hashCode() * 31, 31, this.f1077b)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f1076a);
        sb.append(", position=");
        sb.append((Object) p030f0.c.j(this.f1077b));
        sb.append(", anchor=");
        int i = this.f1078c;
        if (i == 1) {
            str = "Left";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb.append(str);
        sb.append(", visible=");
        sb.append(this.f1079d);
        sb.append(')');
        return sb.toString();
    }
}
