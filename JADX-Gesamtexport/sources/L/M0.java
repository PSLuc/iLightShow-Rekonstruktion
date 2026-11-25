package L;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.d f2406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.d f2407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.d f2408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.d f2409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A.d f2410e;

    public M0() {
        A.d dVar = L0.f2396a;
        A.d dVar2 = L0.f2397b;
        A.d dVar3 = L0.f2398c;
        A.d dVar4 = L0.f2399d;
        A.d dVar5 = L0.f2400e;
        this.f2406a = dVar;
        this.f2407b = dVar2;
        this.f2408c = dVar3;
        this.f2409d = dVar4;
        this.f2410e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m6 = (M0) obj;
        return E4.k.a(this.f2406a, m6.f2406a) && E4.k.a(this.f2407b, m6.f2407b) && E4.k.a(this.f2408c, m6.f2408c) && E4.k.a(this.f2409d, m6.f2409d) && E4.k.a(this.f2410e, m6.f2410e);
    }

    public final int hashCode() {
        return this.f2410e.hashCode() + ((this.f2409d.hashCode() + ((this.f2408c.hashCode() + ((this.f2407b.hashCode() + (this.f2406a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f2406a + ", small=" + this.f2407b + ", medium=" + this.f2408c + ", large=" + this.f2409d + ", extraLarge=" + this.f2410e + ')';
    }
}
