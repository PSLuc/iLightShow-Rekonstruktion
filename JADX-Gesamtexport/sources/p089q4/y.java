package p089q4;

import F4.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements Iterator, a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
