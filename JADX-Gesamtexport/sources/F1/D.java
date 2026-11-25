package F1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1256h = -1;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f1257j;

    public D(E e6) {
        this.f1257j = e6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1256h + 1 < this.f1257j.f1259q.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.i = true;
        p080p.F f6 = this.f1257j.f1259q;
        int i = this.f1256h + 1;
        this.f1256h = i;
        return (B) f6.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        E e6 = this.f1257j;
        int i = this.f1256h;
        p080p.F f6 = e6.f1259q;
        ((B) f6.g(i)).i = null;
        int i3 = this.f1256h;
        Object[] objArr = f6.f10719j;
        Object obj = objArr[i3];
        Object obj2 = p080p.m.f10745c;
        if (obj != obj2) {
            objArr[i3] = obj2;
            f6.f10718h = true;
        }
        this.f1256h = i3 - 1;
        this.i = false;
    }
}
