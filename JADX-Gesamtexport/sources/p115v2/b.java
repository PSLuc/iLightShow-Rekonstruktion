package p115v2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f13216h;
    public final /* synthetic */ int i;

    public b(a aVar, int i) {
        this.i = i;
        this.f13216h = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13216h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        l lVar;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a aVar = this.f13216h;
        switch (this.i) {
            case 0:
                lVar = ((l) this.f13216h).f13232j;
                break;
            default:
                lVar = ((l) this.f13216h).i;
                break;
        }
        this.f13216h = lVar;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
