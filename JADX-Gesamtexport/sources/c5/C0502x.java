package c5;

/* JADX INFO: renamed from: c5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502x extends C0480c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a5.i f7506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p084p4.m f7507m;

    public C0502x(String str, int i) {
        super(str, null, i);
        this.f7506l = a5.i.f6373k;
        this.f7507m = G4.a.z(new J3.c(i, 1, str, this));
    }

    @Override // c5.C0480c0, a5.g
    public final S1.h0 c() {
        return this.f7506l;
    }

    @Override // c5.C0480c0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a5.g)) {
            return false;
        }
        a5.g gVar = (a5.g) obj;
        if (gVar.c() != a5.i.f6373k) {
            return false;
        }
        return this.f7433a.equals(gVar.b()) && E4.k.a(AbstractC0476a0.b(this), AbstractC0476a0.b(gVar));
    }

    @Override // c5.C0480c0
    public final int hashCode() {
        int iHashCode = this.f7433a.hashCode();
        E4.b bVar = new E4.b(this);
        int iHashCode2 = 1;
        while (bVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) bVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // c5.C0480c0, a5.g
    public final a5.g k(int i) {
        return ((a5.g[]) this.f7507m.getValue())[i];
    }

    @Override // c5.C0480c0
    public final String toString() {
        return p089q4.l.e0(new L4.o(1, this), ", ", this.f7433a.concat("("), ")", null, 56);
    }
}
