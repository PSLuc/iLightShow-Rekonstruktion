package X;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ListIterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5749h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5752l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(p124x0.r rVar, int i, int i3) {
        this(rVar, (i3 & 1) != 0 ? 0 : i, 0, rVar.f14057k);
        this.f5749h = 3;
    }

    public void a() {
        if (((AbstractList) ((p095r4.a) this.f5752l).f11780l).modCount != this.f5751k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f5749h) {
            case 0:
                c();
                int i = this.i + 1;
                s sVar = (s) this.f5752l;
                sVar.add(i, obj);
                this.f5750j = -1;
                this.i++;
                this.f5751k = sVar.k();
                return;
            case 1:
                a();
                int i3 = this.i;
                this.i = i3 + 1;
                p095r4.a aVar = (p095r4.a) this.f5752l;
                aVar.add(i3, obj);
                this.f5750j = -1;
                this.f5751k = ((AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i6 = this.i;
                this.i = i6 + 1;
                p095r4.b bVar = (p095r4.b) this.f5752l;
                bVar.add(i6, obj);
                this.f5750j = -1;
                this.f5751k = ((AbstractList) bVar).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((p095r4.b) this.f5752l)).modCount != this.f5751k) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((s) this.f5752l).k() != this.f5751k) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5749h) {
            case 0:
                return this.i < ((s) this.f5752l).size() - 1;
            case 1:
                return this.i < ((p095r4.a) this.f5752l).f11778j;
            case 2:
                return this.i < ((p095r4.b) this.f5752l).i;
            default:
                return this.i < this.f5751k;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5749h) {
            case 0:
                return this.i >= 0;
            case 1:
                return this.i > 0;
            case 2:
                return this.i > 0;
            default:
                return this.i > this.f5750j;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5749h) {
            case 0:
                c();
                int i = this.i + 1;
                this.f5750j = i;
                s sVar = (s) this.f5752l;
                t.a(i, sVar.size());
                Object obj = sVar.get(i);
                this.i = i;
                return obj;
            case 1:
                a();
                int i3 = this.i;
                p095r4.a aVar = (p095r4.a) this.f5752l;
                if (i3 >= aVar.f11778j) {
                    throw new NoSuchElementException();
                }
                this.i = i3 + 1;
                this.f5750j = i3;
                return aVar.f11777h[aVar.i + i3];
            case 2:
                b();
                int i6 = this.i;
                p095r4.b bVar = (p095r4.b) this.f5752l;
                if (i6 >= bVar.i) {
                    throw new NoSuchElementException();
                }
                this.i = i6 + 1;
                this.f5750j = i6;
                return bVar.f11782h[i6];
            default:
                Object[] objArr = ((p124x0.r) this.f5752l).f14055h;
                int i7 = this.i;
                this.i = i7 + 1;
                Object obj2 = objArr[i7];
                E4.k.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj2);
                return (Z.n) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5749h) {
            case 0:
                return this.i + 1;
            case 1:
                return this.i;
            case 2:
                return this.i;
            default:
                return this.i - this.f5750j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5749h) {
            case 0:
                c();
                int i = this.i;
                s sVar = (s) this.f5752l;
                t.a(i, sVar.size());
                int i3 = this.i;
                this.f5750j = i3;
                Object obj = sVar.get(i3);
                this.i--;
                return obj;
            case 1:
                a();
                int i6 = this.i;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.i = i7;
                this.f5750j = i7;
                p095r4.a aVar = (p095r4.a) this.f5752l;
                return aVar.f11777h[aVar.i + i7];
            case 2:
                b();
                int i8 = this.i;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.i = i9;
                this.f5750j = i9;
                return ((p095r4.b) this.f5752l).f11782h[i9];
            default:
                Object[] objArr = ((p124x0.r) this.f5752l).f14055h;
                int i10 = this.i - 1;
                this.i = i10;
                Object obj2 = objArr[i10];
                E4.k.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj2);
                return (Z.n) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5749h) {
            case 0:
                return this.i;
            case 1:
                return this.i - 1;
            case 2:
                return this.i - 1;
            default:
                return (this.i - this.f5750j) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5749h) {
            case 0:
                c();
                int i = this.i;
                s sVar = (s) this.f5752l;
                sVar.remove(i);
                this.i--;
                this.f5750j = -1;
                this.f5751k = sVar.k();
                return;
            case 1:
                a();
                int i3 = this.f5750j;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                p095r4.a aVar = (p095r4.a) this.f5752l;
                aVar.g(i3);
                this.i = this.f5750j;
                this.f5750j = -1;
                this.f5751k = ((AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i6 = this.f5750j;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                p095r4.b bVar = (p095r4.b) this.f5752l;
                bVar.g(i6);
                this.i = this.f5750j;
                this.f5750j = -1;
                this.f5751k = ((AbstractList) bVar).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5749h) {
            case 0:
                c();
                int i = this.f5750j;
                if (i < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                s sVar = (s) this.f5752l;
                sVar.set(i, obj);
                this.f5751k = sVar.k();
                return;
            case 1:
                a();
                int i3 = this.f5750j;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p095r4.a) this.f5752l).set(i3, obj);
                return;
            case 2:
                b();
                int i6 = this.f5750j;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p095r4.b) this.f5752l).set(i6, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(p124x0.r rVar, int i, int i3, int i6) {
        this.f5749h = 3;
        this.f5752l = rVar;
        this.i = i;
        this.f5750j = i3;
        this.f5751k = i6;
    }

    public y(p095r4.b bVar, int i) {
        this.f5749h = 2;
        this.f5752l = bVar;
        this.i = i;
        this.f5750j = -1;
        this.f5751k = ((AbstractList) bVar).modCount;
    }

    public y(s sVar, int i) {
        this.f5749h = 0;
        this.f5752l = sVar;
        this.i = i - 1;
        this.f5750j = -1;
        this.f5751k = sVar.k();
    }

    public y(p095r4.a aVar, int i) {
        this.f5749h = 1;
        this.f5752l = aVar;
        this.i = i;
        this.f5750j = -1;
        this.f5751k = ((AbstractList) aVar).modCount;
    }
}
