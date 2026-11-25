package p042h3;

import S1.h0;
import com.google.android.gms.internal.play_billing.D;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D implements ListIterator {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f9295k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i) {
        super(1);
        int size = eVar.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(h0.H(i, "index", size));
        }
        this.i = size;
        this.f9294j = i;
        this.f9295k = eVar;
    }

    public final Object a(int i) {
        return this.f9295k.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9294j < this.i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9294j > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f9294j;
        this.f9294j = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9294j;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f9294j - 1;
        this.f9294j = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9294j - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
