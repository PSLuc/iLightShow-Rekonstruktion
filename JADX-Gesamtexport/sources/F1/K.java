package F1;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1301g;

    public K(boolean z5, boolean z6, int i, boolean z7, boolean z8, int i3, int i6) {
        this.f1295a = z5;
        this.f1296b = z6;
        this.f1297c = i;
        this.f1298d = z7;
        this.f1299e = z8;
        this.f1300f = i3;
        this.f1301g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return this.f1295a == k3.f1295a && this.f1296b == k3.f1296b && this.f1297c == k3.f1297c && this.f1298d == k3.f1298d && this.f1299e == k3.f1299e && this.f1300f == k3.f1300f && this.f1301g == k3.f1301g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f1295a ? 1 : 0) * 31) + (this.f1296b ? 1 : 0)) * 31) + this.f1297c) * 923521) + (this.f1298d ? 1 : 0)) * 31) + (this.f1299e ? 1 : 0)) * 31) + this.f1300f) * 31) + this.f1301g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K.class.getSimpleName());
        sb.append("(");
        if (this.f1295a) {
            sb.append("launchSingleTop ");
        }
        if (this.f1296b) {
            sb.append("restoreState ");
        }
        int i = this.f1301g;
        int i3 = this.f1300f;
        if (i3 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}
