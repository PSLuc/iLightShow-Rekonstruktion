package N;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3618h = 0;
    public final E0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3621l;

    public J(E0 e6, int i, int i3) {
        this.i = e6;
        this.f3619j = i3;
        this.f3620k = i;
        this.f3621l = e6.f3583n;
        if (e6.f3582m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3618h) {
            case 0:
                return this.f3620k < this.f3619j;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3618h) {
            case 0:
                E0 e6 = this.i;
                int i = e6.f3583n;
                int i3 = this.f3621l;
                if (i != i3) {
                    throw new ConcurrentModificationException();
                }
                int i6 = this.f3620k;
                this.f3620k = C0208d.j(e6.f3578h, i6) + i6;
                return new F0(e6, i6, i3);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3618h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public J(E0 e6, int i, K k3, C0208d c0208d) {
        this.i = e6;
        this.f3619j = i;
        this.f3620k = e6.f3583n;
    }
}
