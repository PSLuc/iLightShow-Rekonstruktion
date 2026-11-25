package L4;

import S1.V;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator, p111u4.d, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3115h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p111u4.d f3116j;

    public final RuntimeException a() {
        int i = this.f3115h;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3115h);
    }

    public final void b(Object obj, p122w4.h hVar) {
        this.i = obj;
        this.f3115h = 3;
        this.f3116j = hVar;
        v4.a aVar = v4.a.f13292h;
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return p111u4.j.f12751h;
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        V.O(obj);
        this.f3115h = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f3115h;
            if (i != 0) {
                break;
            }
            this.f3115h = 5;
            p111u4.d dVar = this.f3116j;
            E4.k.c(dVar);
            this.f3116j = null;
            dVar.g(x.f10867a);
        }
        if (i == 1) {
            E4.k.c(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3115h;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3115h = 1;
            E4.k.c(null);
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.f3115h = 0;
        Object obj = this.i;
        this.i = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
