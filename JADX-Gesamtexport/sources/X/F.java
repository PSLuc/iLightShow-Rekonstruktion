package X;

import N.C0208d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class F implements List, F4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f5654h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5656k;

    public F(s sVar, int i, int i3) {
        this.f5654h = sVar;
        this.i = i;
        this.f5655j = sVar.k();
        this.f5656k = i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i = this.i + this.f5656k;
        s sVar = this.f5654h;
        sVar.add(i, obj);
        this.f5656k++;
        this.f5655j = sVar.k();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f5656k, collection);
    }

    public final void c() {
        if (this.f5654h.k() != this.f5655j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        R.c cVar;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        if (this.f5656k > 0) {
            c();
            s sVar = this.f5654h;
            int i3 = this.i;
            int i6 = this.f5656k + i3;
            do {
                Object obj = t.f5723a;
                synchronized (obj) {
                    r rVar = sVar.f5722h;
                    E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                    r rVar2 = (r) o.i(rVar);
                    i = rVar2.f5720d;
                    cVar = rVar2.f5719c;
                }
                E4.k.c(cVar);
                R.f fVarK = cVar.k();
                fVarK.subList(i3, i6).clear();
                R.c cVarI = fVarK.i();
                if (E4.k.a(cVarI, cVar)) {
                    break;
                }
                r rVar3 = sVar.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
                synchronized (o.f5709b) {
                    abstractC0391hK = o.k();
                    r rVar4 = (r) o.w(rVar3, sVar, abstractC0391hK);
                    synchronized (obj) {
                        int i7 = rVar4.f5720d;
                        if (i7 == i) {
                            rVar4.f5719c = cVarI;
                            rVar4.f5720d = i7 + 1;
                            z5 = true;
                            rVar4.f5721e++;
                        } else {
                            z5 = false;
                        }
                    }
                }
                o.n(abstractC0391hK, sVar);
            } while (!z5);
            this.f5656k = 0;
            this.f5655j = this.f5654h.k();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        t.a(i, this.f5656k);
        return this.f5654h.get(this.i + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.f5656k;
        int i3 = this.i;
        Iterator it = p081p0.c.D0(i3, i + i3).iterator();
        while (it.hasNext()) {
            int iA = ((p089q4.y) it).a();
            if (E4.k.a(obj, this.f5654h.get(iA))) {
                return iA - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5656k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.f5656k;
        int i3 = this.i;
        for (int i6 = (i + i3) - 1; i6 >= i3; i6--) {
            if (E4.k.a(obj, this.f5654h.get(i6))) {
                return i6 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z5 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z5) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        R.c cVar;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        c();
        s sVar = this.f5654h;
        int i3 = this.i;
        int i6 = this.f5656k + i3;
        int size = sVar.size();
        do {
            Object obj = t.f5723a;
            synchronized (obj) {
                r rVar = sVar.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.f fVarK = cVar.k();
            fVarK.subList(i3, i6).retainAll(collection);
            R.c cVarI = fVarK.i();
            if (E4.k.a(cVarI, cVar)) {
                break;
            }
            r rVar3 = sVar.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, sVar, abstractC0391hK);
                synchronized (obj) {
                    int i7 = rVar4.f5720d;
                    if (i7 == i) {
                        rVar4.f5719c = cVarI;
                        rVar4.f5720d = i7 + 1;
                        rVar4.f5721e++;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, sVar);
        } while (!z5);
        int size2 = size - sVar.size();
        if (size2 > 0) {
            this.f5655j = this.f5654h.k();
            this.f5656k -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        t.a(i, this.f5656k);
        c();
        int i3 = i + this.i;
        s sVar = this.f5654h;
        Object obj2 = sVar.set(i3, obj);
        this.f5655j = sVar.k();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5656k;
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        if (!(i >= 0 && i <= i3 && i3 <= this.f5656k)) {
            C0208d.S("fromIndex or toIndex are out of bounds");
            throw null;
        }
        c();
        int i6 = this.i;
        return new F(this.f5654h, i + i6, i3 + i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return E4.j.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        E4.u uVar = new E4.u();
        uVar.f1072h = i - 1;
        return new E(uVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return E4.j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        int i3 = i + this.i;
        s sVar = this.f5654h;
        boolean zAddAll = sVar.addAll(i3, collection);
        if (zAddAll) {
            this.f5656k = collection.size() + this.f5656k;
            this.f5655j = sVar.k();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        int i3 = this.i + i;
        s sVar = this.f5654h;
        Object objRemove = sVar.remove(i3);
        this.f5656k--;
        this.f5655j = sVar.k();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        int i3 = this.i + i;
        s sVar = this.f5654h;
        sVar.add(i3, obj);
        this.f5656k++;
        this.f5655j = sVar.k();
    }
}
