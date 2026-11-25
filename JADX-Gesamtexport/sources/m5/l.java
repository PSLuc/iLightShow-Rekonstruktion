package m5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10457h;
    public n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Iterator f10458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f10459k;

    public l(o oVar, Iterator it) {
        this.f10459k = oVar;
        this.f10458j = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f10457h) {
            this.i = null;
            while (true) {
                Iterator it = this.f10458j;
                if (!it.hasNext()) {
                    break;
                }
                n nVar = (n) it.next();
                if (this.f10459k.a(nVar, it) != null) {
                    this.i = nVar;
                    break;
                }
            }
            this.f10457h = true;
        }
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        this.f10457h = false;
        n nVar = this.i;
        if (nVar != null) {
            return nVar.f10462b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
