package S;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f4879h = n.f4874e.f4878d;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4880j;

    public final void a(int i, int i3, Object[] objArr) {
        this.f4879h = objArr;
        this.i = i;
        this.f4880j = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4880j < this.i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
