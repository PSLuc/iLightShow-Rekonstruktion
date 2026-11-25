package R;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4706h;
    public int i;

    public a(int i, int i3) {
        this.f4706h = i;
        this.i = i3;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4706h < this.i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4706h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4706h;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4706h - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
