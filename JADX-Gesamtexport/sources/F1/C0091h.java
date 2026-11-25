package F1;

/* JADX INFO: renamed from: F1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f1344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1347d;

    public C0091h(S s6, boolean z5, boolean z6) {
        if (!s6.f1326a && z5) {
            throw new IllegalArgumentException(s6.b().concat(" does not allow nullable values").toString());
        }
        this.f1344a = s6;
        this.f1345b = z5;
        this.f1346c = z6;
        this.f1347d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0091h.class.equals(obj.getClass())) {
            return false;
        }
        C0091h c0091h = (C0091h) obj;
        return this.f1345b == c0091h.f1345b && this.f1346c == c0091h.f1346c && this.f1344a.equals(c0091h.f1344a);
    }

    public final int hashCode() {
        return ((((this.f1344a.hashCode() * 31) + (this.f1345b ? 1 : 0)) * 31) + (this.f1346c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0091h.class.getSimpleName());
        sb.append(" Type: " + this.f1344a);
        sb.append(" Nullable: " + this.f1345b);
        if (this.f1346c) {
            sb.append(" DefaultValue: null");
        }
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}
