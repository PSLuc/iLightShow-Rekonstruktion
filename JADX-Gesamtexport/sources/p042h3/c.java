package p042h3;

import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient e f9296j;

    public c(e eVar) {
        this.f9296j = eVar;
    }

    @Override // p042h3.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f9296j.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f9296j;
        h0.E(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // p042h3.e, java.util.List
    public final int indexOf(Object obj) {
        e eVar = this.f9296j;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p042h3.e
    public final e j() {
        return this.f9296j;
    }

    @Override // p042h3.e, java.util.List
    /* JADX INFO: renamed from: k */
    public final e subList(int i, int i3) {
        e eVar = this.f9296j;
        h0.G(i, i3, eVar.size());
        return eVar.subList(eVar.size() - i3, eVar.size() - i).j();
    }

    @Override // p042h3.e, java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f9296j;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9296j.size();
    }
}
