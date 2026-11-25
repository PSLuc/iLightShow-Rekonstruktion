package L4;

import java.util.Iterator;
import p089q4.x;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3100h = 0;
    public final Iterator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3101j;

    public c(Iterator it) {
        E4.k.f("iterator", it);
        this.i = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f3100h) {
            case 0:
                break;
            default:
                return this.i.hasNext();
        }
        while (true) {
            int i = this.f3101j;
            it = this.i;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f3101j--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f3100h) {
            case 0:
                break;
            default:
                int i = this.f3101j;
                this.f3101j = i + 1;
                if (i >= 0) {
                    return new x(i, this.i.next());
                }
                p089q4.m.O();
                throw null;
        }
        while (true) {
            int i3 = this.f3101j;
            it = this.i;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f3101j--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3100h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(d dVar) {
        this.i = dVar.f3102a.iterator();
        this.f3101j = dVar.f3103b;
    }
}
