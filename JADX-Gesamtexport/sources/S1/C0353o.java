package S1;

/* JADX INFO: renamed from: S1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0353o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0353o f4958c = new C0353o(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4960b;

    public C0353o(int i, int i3) {
        this.f4959a = i;
        this.f4960b = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0353o.class) {
            return false;
        }
        C0353o c0353o = (C0353o) obj;
        return c0353o.f4959a == this.f4959a && c0353o.f4960b == this.f4960b;
    }

    public final int hashCode() {
        return this.f4960b + this.f4959a;
    }

    public final String toString() {
        return this == f4958c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f4959a), Integer.valueOf(this.f4960b));
    }
}
