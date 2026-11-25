package S;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, F4.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4871h;
    public final Object i;

    public /* synthetic */ j(int i, Object obj) {
        this.f4871h = i;
        this.i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4871h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f4871h) {
            case 1:
                E4.k.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4871h) {
            case 0:
                ((e) this.i).clear();
                break;
            default:
                ((p095r4.f) this.i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4871h) {
            case 0:
                return ((e) this.i).containsValue(obj);
            default:
                return ((p095r4.f) this.i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4871h) {
            case 1:
                return ((p095r4.f) this.i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4871h) {
            case 0:
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(2);
                }
                return new i((e) this.i, oVarArr);
            default:
                p095r4.f fVar = (p095r4.f) this.i;
                fVar.getClass();
                return new p095r4.c(fVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4871h) {
            case 1:
                p095r4.f fVar = (p095r4.f) this.i;
                fVar.b();
                int i = fVar.i(obj);
                if (i < 0) {
                    return false;
                }
                fVar.l(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4871h) {
            case 1:
                E4.k.f("elements", collection);
                ((p095r4.f) this.i).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4871h) {
            case 1:
                E4.k.f("elements", collection);
                ((p095r4.f) this.i).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4871h) {
            case 0:
                e eVar = (e) this.i;
                eVar.getClass();
                return eVar.f4864m;
            default:
                return ((p095r4.f) this.i).f11797p;
        }
    }
}
