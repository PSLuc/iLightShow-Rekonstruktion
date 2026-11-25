package p046i2;

import J1.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f9501h;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9501h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        e eVar = this.f9501h;
        if (eVar == null) {
            throw new NoSuchElementException();
        }
        this.f9501h = (e) eVar.f1902f;
        return (AbstractC0771g) eVar.f1901e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
