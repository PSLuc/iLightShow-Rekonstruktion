package L4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Iterator f3119h;
    public final /* synthetic */ i i;

    public p(i iVar) {
        this.i = iVar;
        this.f3119h = ((j) iVar.f3113b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3119h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((D4.c) this.i.f3114c).invoke(this.f3119h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
