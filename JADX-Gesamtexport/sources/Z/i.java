package Z;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f5953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5954b;

    public i(o oVar, o oVar2) {
        this.f5953a = oVar;
        this.f5954b = oVar2;
    }

    @Override // Z.o
    public final Object a(Object obj, D4.e eVar) {
        return this.f5954b.a(this.f5953a.a(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return E4.k.a(this.f5953a, iVar.f5953a) && E4.k.a(this.f5954b, iVar.f5954b);
    }

    @Override // Z.o
    public final boolean f(D4.c cVar) {
        return this.f5953a.f(cVar) && this.f5954b.f(cVar);
    }

    public final int hashCode() {
        return (this.f5954b.hashCode() * 31) + this.f5953a.hashCode();
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("["), (String) a("", h.f5952h), ']');
    }
}
