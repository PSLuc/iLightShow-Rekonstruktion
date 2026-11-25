package p095r4;

import E4.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p089q4.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11802h;
    public final f i;

    public /* synthetic */ g(f fVar, int i) {
        this.f11802h = i;
        this.i = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f11802h) {
            case 0:
                k.f("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f11802h) {
            case 0:
                k.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                k.f("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // p089q4.g
    public final int c() {
        switch (this.f11802h) {
            case 0:
                break;
        }
        return this.i.f11797p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f11802h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f11802h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                k.f("element", entry);
                return this.i.f(entry);
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f11802h) {
            case 0:
                k.f("elements", collection);
                return this.i.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f11802h) {
            case 0:
                break;
        }
        return this.i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11802h) {
            case 0:
                f fVar = this.i;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.i;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f11802h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                k.f("element", entry);
                f fVar = this.i;
                fVar.getClass();
                fVar.b();
                int iH = fVar.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = fVar.i;
                k.c(objArr);
                if (!k.a(objArr[iH], entry.getValue())) {
                    return false;
                }
                fVar.l(iH);
                return true;
            default:
                f fVar2 = this.i;
                fVar2.b();
                int iH2 = fVar2.h(obj);
                if (iH2 < 0) {
                    return false;
                }
                fVar2.l(iH2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f11802h) {
            case 0:
                k.f("elements", collection);
                this.i.b();
                break;
            default:
                k.f("elements", collection);
                this.i.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f11802h) {
            case 0:
                k.f("elements", collection);
                this.i.b();
                break;
            default:
                k.f("elements", collection);
                this.i.b();
                break;
        }
        return super.retainAll(collection);
    }
}
