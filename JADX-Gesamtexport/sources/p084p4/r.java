package p084p4;

import E4.b;
import E4.j;
import E4.k;
import F4.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Collection, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10861h;

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

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        int i = ((q) obj).f10860h;
        int[] iArr = this.f10861h;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (i == iArr[i3]) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
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
                if (obj instanceof q) {
                    int i = ((q) obj).f10860h;
                    int[] iArr = this.f10861h;
                    int length = iArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (i == iArr[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return k.a(this.f10861h, ((r) obj).f10861h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f10861h);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10861h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(4, this.f10861h);
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
        return this.f10861h.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f10861h) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        return j.b(this, objArr);
    }
}
