package p080p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0832d implements Collection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0833e f10729h;

    public C0832d(C0833e c0833e) {
        this.f10729h = c0833e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f10729h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10729h.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10729h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0829a(this.f10729h, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0833e c0833e = this.f10729h;
        int iA = c0833e.a(obj);
        if (iA < 0) {
            return false;
        }
        c0833e.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0833e c0833e = this.f10729h;
        int i = c0833e.f10717j;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i) {
            if (collection.contains(c0833e.i(i3))) {
                c0833e.g(i3);
                i3--;
                i--;
                z5 = true;
            }
            i3++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0833e c0833e = this.f10729h;
        int i = c0833e.f10717j;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i) {
            if (!collection.contains(c0833e.i(i3))) {
                c0833e.g(i3);
                i3--;
                i--;
                z5 = true;
            }
            i3++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10729h.f10717j;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0833e c0833e = this.f10729h;
        int i = c0833e.f10717j;
        Object[] objArr = new Object[i];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c0833e.i(i3);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0833e c0833e = this.f10729h;
        int i = c0833e.f10717j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c0833e.i(i3);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
