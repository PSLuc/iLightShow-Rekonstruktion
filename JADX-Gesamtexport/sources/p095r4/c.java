package p095r4;

import E4.k;
import F4.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e implements Iterator, a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11784l;

    public c(f fVar, int i) {
        this.f11784l = i;
        k.f("map", fVar);
        this.f11788k = fVar;
        this.i = -1;
        this.f11787j = fVar.f11796o;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11784l) {
            case 0:
                b();
                int i = this.f11786h;
                f fVar = (f) this.f11788k;
                if (i >= fVar.f11794m) {
                    throw new NoSuchElementException();
                }
                this.f11786h = i + 1;
                this.i = i;
                d dVar = new d(fVar, i);
                c();
                return dVar;
            case 1:
                b();
                int i3 = this.f11786h;
                f fVar2 = (f) this.f11788k;
                if (i3 >= fVar2.f11794m) {
                    throw new NoSuchElementException();
                }
                this.f11786h = i3 + 1;
                this.i = i3;
                Object obj = fVar2.f11790h[i3];
                c();
                return obj;
            default:
                b();
                int i6 = this.f11786h;
                f fVar3 = (f) this.f11788k;
                if (i6 >= fVar3.f11794m) {
                    throw new NoSuchElementException();
                }
                this.f11786h = i6 + 1;
                this.i = i6;
                Object[] objArr = fVar3.i;
                k.c(objArr);
                Object obj2 = objArr[this.i];
                c();
                return obj2;
        }
    }
}
