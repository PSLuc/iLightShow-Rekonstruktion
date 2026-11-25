package p115v2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractCollection implements Deque {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f13217h;
    public a i;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        return offerLast((a) obj);
    }

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        if (!offerFirst((a) obj)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        if (!offerLast((a) obj)) {
            throw new IllegalArgumentException();
        }
    }

    public final void c() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a aVar = this.f13217h;
        while (aVar != null) {
            l lVar = (l) aVar;
            l lVar2 = lVar.f13232j;
            lVar.i = null;
            lVar.f13232j = null;
            aVar = lVar2;
        }
        this.i = null;
        this.f13217h = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        return (obj instanceof a) && d((a) obj);
    }

    public final boolean d(a aVar) {
        return (((l) aVar).i == null && ((l) aVar).f13232j == null && aVar != this.f13217h) ? false : true;
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new b(this.i, 1);
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object element() {
        c();
        return this.f13217h;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean offerFirst(a aVar) {
        if (d(aVar)) {
            return false;
        }
        a aVar2 = this.f13217h;
        this.f13217h = aVar;
        if (aVar2 == null) {
            this.i = aVar;
            return true;
        }
        ((l) aVar2).i = (l) aVar;
        ((l) aVar).f13232j = (l) aVar2;
        return true;
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        c();
        return this.f13217h;
    }

    @Override // java.util.Deque
    public final Object getLast() {
        c();
        return this.i;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean offerLast(a aVar) {
        if (d(aVar)) {
            return false;
        }
        a aVar2 = this.i;
        this.i = aVar;
        if (aVar2 == null) {
            this.f13217h = aVar;
            return true;
        }
        ((l) aVar2).f13232j = (l) aVar;
        ((l) aVar).i = (l) aVar2;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f13217h == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new b(this.f13217h, 0);
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final a pollFirst() {
        if (isEmpty()) {
            return null;
        }
        a aVar = this.f13217h;
        l lVar = (l) aVar;
        l lVar2 = lVar.f13232j;
        lVar.f13232j = null;
        this.f13217h = lVar2;
        if (lVar2 == null) {
            this.i = null;
        } else {
            lVar2.i = null;
        }
        return aVar;
    }

    @Override // java.util.Deque, java.util.Queue
    public final boolean offer(Object obj) {
        return offerLast((a) obj);
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object peek() {
        return this.f13217h;
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return this.f13217h;
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return this.i;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        if (isEmpty()) {
            return null;
        }
        a aVar = this.i;
        l lVar = (l) aVar;
        l lVar2 = lVar.i;
        lVar.i = null;
        this.i = lVar2;
        if (lVar2 == null) {
            this.f13217h = null;
            return aVar;
        }
        lVar2.f13232j = null;
        return aVar;
    }

    @Override // java.util.Deque
    public final Object pop() {
        c();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        if (!offerFirst((a) obj)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!d(aVar)) {
            return false;
        }
        l lVar = (l) aVar;
        l lVar2 = lVar.i;
        l lVar3 = lVar.f13232j;
        if (lVar2 == null) {
            this.f13217h = lVar3;
        } else {
            lVar2.f13232j = lVar3;
            lVar.i = null;
        }
        if (lVar3 == null) {
            this.i = lVar2;
            return true;
        }
        lVar3.i = lVar2;
        lVar.f13232j = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        c();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        c();
        if (isEmpty()) {
            return null;
        }
        a aVar = this.i;
        l lVar = (l) aVar;
        l lVar2 = lVar.i;
        lVar.i = null;
        this.i = lVar2;
        if (lVar2 == null) {
            this.f13217h = null;
            return aVar;
        }
        lVar2.f13232j = null;
        return aVar;
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        int i = 0;
        for (Object obj = this.f13217h; obj != null; obj = ((l) obj).f13232j) {
            i++;
        }
        return i;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object remove() {
        c();
        return pollFirst();
    }
}
