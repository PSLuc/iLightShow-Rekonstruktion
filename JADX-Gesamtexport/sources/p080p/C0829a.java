package p080p;

import F4.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829a implements Iterator, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10721h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10724l;

    public C0829a(int i) {
        this.f10721h = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.f10721h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.i;
        switch (this.f10723k) {
            case 0:
                objF = ((C0833e) this.f10724l).f(i);
                break;
            case 1:
                objF = ((C0833e) this.f10724l).i(i);
                break;
            default:
                objF = ((C0834f) this.f10724l).i[i];
                break;
        }
        this.i++;
        this.f10722j = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10722j) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.i - 1;
        this.i = i;
        switch (this.f10723k) {
            case 0:
                ((C0833e) this.f10724l).g(i);
                break;
            case 1:
                ((C0833e) this.f10724l).g(i);
                break;
            default:
                ((C0834f) this.f10724l).c(i);
                break;
        }
        this.f10721h--;
        this.f10722j = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0829a(C0834f c0834f) {
        this(c0834f.f10734j);
        this.f10723k = 2;
        this.f10724l = c0834f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0829a(C0833e c0833e, int i) {
        this(c0833e.f10717j);
        this.f10723k = i;
        switch (i) {
            case 1:
                this.f10724l = c0833e;
                this(c0833e.f10717j);
                break;
            default:
                this.f10724l = c0833e;
                break;
        }
    }
}
