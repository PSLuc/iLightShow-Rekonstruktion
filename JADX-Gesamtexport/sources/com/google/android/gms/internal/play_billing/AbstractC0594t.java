package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0594t extends AbstractC0589q implements List, RandomAccess {
    public static final r i = new r(C0600w.f8010l, 0);

    public static C0600w m(Object[] objArr, int i3) {
        return i3 == 0 ? C0600w.f8010l : new C0600w(objArr, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0594t n(List list) {
        if (!(list instanceof AbstractC0589q)) {
            Object[] array = list.toArray();
            int length = array.length;
            AbstractC0599v0.P(array, length);
            return m(array, length);
        }
        AbstractC0594t abstractC0594tI = ((AbstractC0589q) list).i();
        if (!abstractC0594tI.j()) {
            return abstractC0594tI;
        }
        Object[] array2 = abstractC0594tI.toArray(AbstractC0589q.f7983h);
        return m(array2, array2.length);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public int c(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (Objects.equals(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                r rVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (rVarListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(rVarListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode = (iHashCode * 31) + get(i3).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final AbstractC0594t i() {
        return this;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l */
    public AbstractC0594t subList(int i3, int i6) {
        S1.h0.F(i3, i6, size());
        int i7 = i6 - i3;
        if (i7 == size()) {
            return this;
        }
        return i7 == 0 ? C0600w.f8010l : new C0592s(this, i3, i7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final r listIterator(int i3) {
        S1.h0.D(i3, size());
        return isEmpty() ? i : new r(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }
}
