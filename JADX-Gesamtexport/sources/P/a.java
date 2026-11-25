package P;

import E4.j;
import E4.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements List, F4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f4578h;

    public a(d dVar) {
        this.f4578h = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f4578h.c(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f4578h;
        return dVar.g(dVar.f4583j, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f4578h.i();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4578h.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f4578h;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.j(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        G4.a.f(i, this);
        return this.f4578h.f4582h[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f4578h.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4578h.m();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f4578h;
        int i = dVar.f4583j;
        if (i <= 0) {
            return -1;
        }
        int i3 = i - 1;
        Object[] objArr = dVar.f4582h;
        while (!k.a(obj, objArr[i3])) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4578h.o(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f4578h;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = dVar.f4583j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.o(it.next());
        }
        return i != dVar.f4583j;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f4578h;
        int i = dVar.f4583j;
        for (int i3 = i - 1; -1 < i3; i3--) {
            if (!collection.contains(dVar.f4582h[i3])) {
                dVar.p(i3);
            }
        }
        return i != dVar.f4583j;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        G4.a.f(i, this);
        Object[] objArr = this.f4578h.f4582h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4578h.f4583j;
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        G4.a.g(i, i3, this);
        return new b(i, i3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f4578h.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new c(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        G4.a.f(i, this);
        return this.f4578h.p(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f4578h.g(i, collection);
    }
}
