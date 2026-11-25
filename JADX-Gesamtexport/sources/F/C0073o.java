package F;

/* JADX INFO: renamed from: F.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0072n f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0072n f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1198c;

    public C0073o(C0072n c0072n, C0072n c0072n2, boolean z5) {
        this.f1196a = c0072n;
        this.f1197b = c0072n2;
        this.f1198c = z5;
    }

    public static C0073o a(C0073o c0073o, C0072n c0072n, C0072n c0072n2, boolean z5, int i) {
        if ((i & 1) != 0) {
            c0072n = c0073o.f1196a;
        }
        if ((i & 2) != 0) {
            c0072n2 = c0073o.f1197b;
        }
        c0073o.getClass();
        return new C0073o(c0072n, c0072n2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073o)) {
            return false;
        }
        C0073o c0073o = (C0073o) obj;
        return E4.k.a(this.f1196a, c0073o.f1196a) && E4.k.a(this.f1197b, c0073o.f1197b) && this.f1198c == c0073o.f1198c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1198c) + ((this.f1197b.hashCode() + (this.f1196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f1196a + ", end=" + this.f1197b + ", handlesCrossed=" + this.f1198c + ')';
    }
}
