package L4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3096h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Iterator f3097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final defpackage.d f3098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f3099l;

    public b(Iterator it, defpackage.d dVar) {
        E4.k.f("source", it);
        this.f3097j = it;
        this.f3098k = dVar;
        this.f3099l = new HashSet();
    }

    public final boolean a() {
        this.f3096h = 3;
        while (true) {
            Iterator it = this.f3097j;
            if (!it.hasNext()) {
                this.f3096h = 2;
                break;
            }
            Object next = it.next();
            if (this.f3099l.add(this.f3098k.invoke(next))) {
                this.i = next;
                this.f3096h = 1;
                break;
            }
        }
        return this.f3096h == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3096h;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3096h;
        if (i == 1) {
            this.f3096h = 0;
            return this.i;
        }
        if (i == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f3096h = 0;
        return this.i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
