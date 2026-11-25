package p080p;

import E4.j;
import E4.k;
import F4.a;
import F4.f;
import L4.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z implements f, Set, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A f10814h;
    public final /* synthetic */ A i;

    public z(A a6) {
        this.i = a6;
        this.f10814h = a6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.i.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        k.f("elements", collection);
        A a6 = this.i;
        int i = a6.f10711d;
        for (Object obj : collection) {
            a6.f10709b[a6.d(obj)] = obj;
        }
        return i != a6.f10711d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.i.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10814h.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        k.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f10814h.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10814h.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.i);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.i.j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iHashCode;
        int iNumberOfTrailingZeros;
        k.f("elements", collection);
        A a6 = this.i;
        int i = a6.f10711d;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                a6.getClass();
                iHashCode = next.hashCode();
            } else {
                iHashCode = 0;
            }
            int i7 = iHashCode * (-862048943);
            int i8 = i7 ^ (i7 << 16);
            int i9 = i8 & 127;
            int i10 = a6.f10710c;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = a6.f10708a;
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                long j4 = ((jArr[i12 + i3] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
                long j6 = (((long) i9) * 72340172838076673L) ^ j4;
                long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (j7 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i11) & i10;
                    int i14 = i3;
                    if (k.a(a6.f10709b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j7 &= j7 - 1;
                    i3 = i14;
                }
                int i15 = i3;
                if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i6 += 8;
                i11 = (i11 + i6) & i10;
                i3 = i15;
            }
            if (iNumberOfTrailingZeros >= 0) {
                a6.k(iNumberOfTrailingZeros);
            }
        }
        return i != a6.f10711d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        k.f("elements", collection);
        A a6 = this.i;
        long[] jArr = a6.f10708a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z5 = false;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i << 3) + i6;
                        if (!collection.contains(a6.f10709b[i7])) {
                            a6.k(i7);
                            z5 = true;
                        }
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return z5;
                }
            }
            if (i == length) {
                return z5;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10814h.f10711d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        return j.b(this, objArr);
    }
}
