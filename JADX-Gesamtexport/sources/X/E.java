package X;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class E implements ListIterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5652h = 0;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5653j;

    public E(M4.h hVar, int i) {
        this.f5653j = hVar;
        List list = (List) hVar.i;
        if (i >= 0 && i <= hVar.c()) {
            this.i = list.listIterator(hVar.c() - i);
            return;
        }
        StringBuilder sbV = p012c.k.v(i, "Position index ", " must be in range [");
        sbV.append(new J4.d(0, hVar.c(), 1));
        sbV.append("].");
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f5652h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5652h) {
            case 0:
                return ((E4.u) this.i).f1072h < ((F) this.f5653j).f5656k - 1;
            default:
                return ((ListIterator) this.i).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5652h) {
            case 0:
                return ((E4.u) this.i).f1072h >= 0;
            default:
                return ((ListIterator) this.i).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5652h) {
            case 0:
                E4.u uVar = (E4.u) this.i;
                int i = uVar.f1072h + 1;
                F f6 = (F) this.f5653j;
                t.a(i, f6.f5656k);
                uVar.f1072h = i;
                return f6.get(i);
            default:
                return ((ListIterator) this.i).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5652h) {
            case 0:
                return ((E4.u) this.i).f1072h + 1;
            default:
                return p089q4.m.L((M4.h) this.f5653j) - ((ListIterator) this.i).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5652h) {
            case 0:
                E4.u uVar = (E4.u) this.i;
                int i = uVar.f1072h;
                F f6 = (F) this.f5653j;
                t.a(i, f6.f5656k);
                uVar.f1072h = i - 1;
                return f6.get(i);
            default:
                return ((ListIterator) this.i).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5652h) {
            case 0:
                return ((E4.u) this.i).f1072h;
            default:
                return p089q4.m.L((M4.h) this.f5653j) - ((ListIterator) this.i).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5652h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5652h) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public E(E4.u uVar, F f6) {
        this.i = uVar;
        this.f5653j = f6;
    }
}
