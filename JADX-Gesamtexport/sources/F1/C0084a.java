package F1;

/* JADX INFO: renamed from: F1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084a extends B {
    @Override // F1.B
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0084a) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // F1.B
    public final int hashCode() {
        return super.hashCode() * 961;
    }
}
