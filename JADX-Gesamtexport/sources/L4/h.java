package L4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p080p.A;
import p080p.y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3109h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3111k;

    public h(Object obj, Map map) {
        this.f3109h = 1;
        this.i = obj;
        this.f3111k = map;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [D4.a, E4.l] */
    public void a() {
        Object objInvoke;
        int i = this.f3110j;
        i iVar = (i) this.f3111k;
        if (i == -2) {
            objInvoke = ((E4.l) iVar.f3113b).invoke();
        } else {
            D4.c cVar = (D4.c) iVar.f3114c;
            Object obj = this.i;
            E4.k.c(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.i = objInvoke;
        this.f3110j = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3109h) {
            case 0:
                if (this.f3110j < 0) {
                    a();
                }
                return this.f3110j == 1;
            case 1:
                return this.f3110j < ((Map) this.f3111k).size();
            default:
                return ((k) this.i).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3109h) {
            case 0:
                if (this.f3110j < 0) {
                    a();
                }
                if (this.f3110j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.i;
                E4.k.d("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
                this.f3110j = -1;
                return obj;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.i;
                this.f3110j++;
                Object obj3 = ((Map) this.f3111k).get(obj2);
                if (obj3 != null) {
                    this.i = ((T.a) obj3).f5141b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            default:
                return ((k) this.i).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3109h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f3110j;
                if (i != -1) {
                    ((A) this.f3111k).k(i);
                    this.f3110j = -1;
                    return;
                }
                return;
        }
    }

    public h(i iVar) {
        this.f3109h = 0;
        this.f3111k = iVar;
        this.f3110j = -2;
    }

    public h(A a6) {
        this.f3109h = 2;
        this.f3111k = a6;
        this.f3110j = -1;
        this.i = p006b.a.w(new y(a6, this, null));
    }
}
