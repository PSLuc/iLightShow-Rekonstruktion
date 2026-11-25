package p113v0;

import E4.j;
import F4.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Collection, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f13157h = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f13157h.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f13157h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13157h.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f13157h.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13157h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f13157h.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13157h.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f13157h.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f13157h.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13157h.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }
}
