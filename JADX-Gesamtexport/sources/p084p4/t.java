package p084p4;

import E4.b;
import E4.j;
import E4.k;
import F4.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Collection, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f10863h;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        long j4 = ((s) obj).f10862h;
        long[] jArr = this.f10863h;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j4 == jArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        k.f("elements", collection);
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof s) {
                    long j4 = ((s) obj).f10862h;
                    long[] jArr = this.f10863h;
                    int length = jArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (j4 == jArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return k.a(this.f10863h, ((t) obj).f10863h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f10863h);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10863h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(5, this.f10863h);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10863h.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f10863h) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        return j.b(this, objArr);
    }
}
