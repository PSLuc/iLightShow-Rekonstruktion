package p124x0;

import E4.j;
import E4.k;
import F4.a;
import X.y;
import Z.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p089q4.m;

/* JADX INFO: loaded from: classes.dex */
public final class r implements List, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14057k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f14055h = new Object[16];
    public long[] i = new long[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14056j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14058l = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long c() {
        long jA = AbstractC1098f.a(Float.POSITIVE_INFINITY, false);
        int i = this.f14056j + 1;
        int iL = m.L(this);
        if (i <= iL) {
            while (true) {
                long j4 = this.i[i];
                if (AbstractC1098f.g(j4, jA) < 0) {
                    jA = j4;
                }
                if (Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && ((int) (4294967295L & jA)) != 0) {
                    return jA;
                }
                if (i != iL) {
                    i++;
                }
            }
        }
        return jA;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f14056j = -1;
        i();
        this.f14058l = true;
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

    public final void g(n nVar, float f6, boolean z5, D4.a aVar) {
        int i = this.f14056j;
        int i3 = i + 1;
        this.f14056j = i3;
        Object[] objArr = this.f14055h;
        if (i3 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f14055h = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.i, length);
            k.e("copyOf(this, newSize)", jArrCopyOf);
            this.i = jArrCopyOf;
        }
        Object[] objArr2 = this.f14055h;
        int i6 = this.f14056j;
        objArr2[i6] = nVar;
        this.i[i6] = AbstractC1098f.a(f6, z5);
        i();
        aVar.invoke();
        this.f14056j = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj = this.f14055h[i];
        k.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (n) obj;
    }

    public final void i() {
        int i = this.f14056j + 1;
        int iL = m.L(this);
        if (i <= iL) {
            while (true) {
                this.f14055h[i] = null;
                if (i == iL) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f14057k = this.f14056j + 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n nVar = (n) obj;
        int iL = m.L(this);
        if (iL >= 0) {
            int i = 0;
            while (!k.a(this.f14055h[i], nVar)) {
                if (i != iL) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14057k == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new y(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        n nVar = (n) obj;
        for (int iL = m.L(this); -1 < iL; iL--) {
            if (k.a(this.f14055h[iL], nVar)) {
                return iL;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0, 7);
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
        return this.f14057k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        return new C1109q(this, i, i3);
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
        return new y(this, i, 6);
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
