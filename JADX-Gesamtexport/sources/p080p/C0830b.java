package p080p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0830b implements Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0833e f10725h;

    public C0830b(C0833e c0833e) {
        this.f10725h = c0833e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f10725h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10725h.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f10725h.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C0833e c0833e = this.f10725h;
        try {
            return c0833e.f10717j == set.size() && c0833e.j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0833e c0833e = this.f10725h;
        int iHashCode = 0;
        for (int i = c0833e.f10717j - 1; i >= 0; i--) {
            Object objF = c0833e.f(i);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10725h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0829a(this.f10725h, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0833e c0833e = this.f10725h;
        int iC = c0833e.c(obj);
        if (iC < 0) {
            return false;
        }
        c0833e.g(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f10725h.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0833e c0833e = this.f10725h;
        int i = c0833e.f10717j;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (!collection.contains(c0833e.f(i3))) {
                c0833e.g(i3);
            }
        }
        return i != c0833e.f10717j;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10725h.f10717j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0833e c0833e = this.f10725h;
        int i = c0833e.f10717j;
        Object[] objArr = new Object[i];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c0833e.f(i3);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0833e c0833e = this.f10725h;
        int i = c0833e.f10717j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c0833e.f(i3);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
