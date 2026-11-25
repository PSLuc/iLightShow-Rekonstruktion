package P;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ListIterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4581h;
    public int i;

    public c(int i, List list) {
        this.f4581h = list;
        this.i = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f4581h.add(this.i, obj);
        this.i++;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.f4581h.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.i > 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.i;
        this.i = i + 1;
        return this.f4581h.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.i - 1;
        this.i = i;
        return this.f4581h.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.i - 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.i - 1;
        this.i = i;
        this.f4581h.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f4581h.set(this.i, obj);
    }
}
