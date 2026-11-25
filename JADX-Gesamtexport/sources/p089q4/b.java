package p089q4;

import B.AbstractC0013g0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends E4.b implements ListIterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f11228k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(7, dVar);
        this.f11228k = dVar;
        int iC = dVar.c();
        if (i < 0 || i > iC) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, iC, ", size: "));
        }
        this.i = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.i - 1;
        this.i = i;
        return this.f11228k.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
