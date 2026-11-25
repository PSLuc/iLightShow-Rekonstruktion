package p109u2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: u2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965d implements Iterator, Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f12685h;
    public int i = 0;

    public C0965d(Object[] objArr) {
        this.f12685h = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.f12685h.length;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        Object[] objArr = this.f12685h;
        if (i >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.i = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
