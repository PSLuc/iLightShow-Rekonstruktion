package p116v3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f13265h;
    public k i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f13267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13268l;

    public i(l lVar, int i) {
        this.f13268l = i;
        this.f13267k = lVar;
        this.f13265h = lVar.f13283m.f13272k;
        this.f13266j = lVar.f13282l;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f13265h;
        l lVar = this.f13267k;
        if (kVar == lVar.f13283m) {
            throw new NoSuchElementException();
        }
        if (lVar.f13282l != this.f13266j) {
            throw new ConcurrentModificationException();
        }
        this.f13265h = kVar.f13272k;
        this.i = kVar;
        return kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13265h != this.f13267k.f13283m;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f13268l) {
            case 1:
                return b().f13274m;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        k kVar = this.i;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        l lVar = this.f13267k;
        lVar.c(kVar, true);
        this.i = null;
        this.f13266j = lVar.f13282l;
    }
}
