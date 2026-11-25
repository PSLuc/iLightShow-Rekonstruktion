package p124x0;

import E4.j;
import E4.k;
import F4.a;
import X.y;
import Z.n;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: x0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1109q implements List, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14053h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f14054j;

    public C1109q(r rVar, int i, int i3) {
        this.f14054j = rVar;
        this.f14053h = i;
        this.i = i3;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof n) && indexOf((n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((n) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj = this.f14054j.f14055h[i + this.f14053h];
        k.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n nVar = (n) obj;
        int i = this.f14053h;
        int i3 = this.i;
        if (i <= i3) {
            int i6 = i;
            while (!k.a(this.f14054j.f14055h[i6], nVar)) {
                if (i6 != i3) {
                    i6++;
                }
            }
            return i6 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f14053h;
        return new y(this.f14054j, i, i, this.i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n nVar = (n) obj;
        int i = this.i;
        int i3 = this.f14053h;
        if (i3 <= i) {
            while (!k.a(this.f14054j.f14055h[i], nVar)) {
                if (i != i3) {
                    i--;
                }
            }
            return i - i3;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.f14053h;
        return new y(this.f14054j, i, i, this.i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.i - this.f14053h;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        int i6 = this.f14053h;
        return new C1109q(this.f14054j, i + i6, i6 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i3 = this.f14053h;
        int i6 = this.i;
        return new y(this.f14054j, i + i3, i3, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }
}
