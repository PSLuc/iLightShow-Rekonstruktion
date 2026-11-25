package P;

import E4.j;
import E4.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements List, F4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4579h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4580j;

    public b(int i, int i3, List list) {
        this.f4579h = list;
        this.i = i;
        this.f4580j = i3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f4580j;
        this.f4580j = i + 1;
        this.f4579h.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f4579h.addAll(i + this.i, collection);
        this.f4580j = collection.size() + this.f4580j;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f4580j - 1;
        int i3 = this.i;
        if (i3 <= i) {
            while (true) {
                this.f4579h.remove(i);
                if (i == i3) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f4580j = i3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f4580j;
        for (int i3 = this.i; i3 < i; i3++) {
            if (k.a(this.f4579h.get(i3), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        G4.a.f(i, this);
        return this.f4579h.get(i + this.i);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f4580j;
        int i3 = this.i;
        for (int i6 = i3; i6 < i; i6++) {
            if (k.a(this.f4579h.get(i6), obj)) {
                return i6 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4580j == this.i;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f4580j - 1;
        int i3 = this.i;
        if (i3 > i) {
            return -1;
        }
        while (!k.a(this.f4579h.get(i), obj)) {
            if (i == i3) {
                return -1;
            }
            i--;
        }
        return i - i3;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f4580j;
        for (int i3 = this.i; i3 < i; i3++) {
            ?? r6 = this.f4579h;
            if (k.a(r6.get(i3), obj)) {
                r6.remove(i3);
                this.f4580j--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f4580j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f4580j;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f4580j;
        int i3 = i - 1;
        int i6 = this.i;
        if (i6 <= i3) {
            while (true) {
                ?? r6 = this.f4579h;
                if (!collection.contains(r6.get(i3))) {
                    r6.remove(i3);
                    this.f4580j--;
                }
                if (i3 == i6) {
                    break;
                }
                i3--;
            }
        }
        return i != this.f4580j;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        G4.a.f(i, this);
        return this.f4579h.set(i + this.i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4580j - this.i;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f4579h.add(i + this.i, obj);
        this.f4580j++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new c(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f4579h.addAll(this.f4580j, collection);
        this.f4580j = collection.size() + this.f4580j;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        G4.a.f(i, this);
        Object objRemove = this.f4579h.remove(i + this.i);
        this.f4580j--;
        return objRemove;
    }
}
