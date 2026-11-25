package M4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3524h = -1;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J4.d f3526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f3528m;

    public b(c cVar) {
        this.f3528m = cVar;
        cVar.getClass();
        int iO = p081p0.c.O(0, 0, cVar.f3529a.length());
        this.i = iO;
        this.f3525j = iO;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [D4.e, E4.l] */
    public final void a() {
        p084p4.h hVar;
        int i = this.f3525j;
        if (i < 0) {
            this.f3524h = 0;
            this.f3526k = null;
            return;
        }
        c cVar = this.f3528m;
        int i3 = cVar.f3530b;
        String str = cVar.f3529a;
        if (i3 > 0) {
            int i6 = this.f3527l + 1;
            this.f3527l = i6;
            if (i6 >= i3) {
                this.f3526k = new J4.d(this.i, l.d0(str), 1);
                this.f3525j = -1;
            } else if (i > str.length() && (hVar = (p084p4.h) cVar.f3531c.d(str, Integer.valueOf(this.f3525j))) != null) {
                int iIntValue = ((Number) hVar.f10849h).intValue();
                int iIntValue2 = ((Number) hVar.i).intValue();
                this.f3526k = p081p0.c.D0(this.i, iIntValue);
                int i7 = iIntValue + iIntValue2;
                this.i = i7;
                this.f3525j = i7 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f3526k = new J4.d(this.i, l.d0(str), 1);
                this.f3525j = -1;
            }
        } else if (i > str.length()) {
            this.f3526k = new J4.d(this.i, l.d0(str), 1);
            this.f3525j = -1;
        } else {
            int iIntValue3 = ((Number) hVar.f10849h).intValue();
            int iIntValue4 = ((Number) hVar.i).intValue();
            this.f3526k = p081p0.c.D0(this.i, iIntValue3);
            int i8 = iIntValue3 + iIntValue4;
            this.i = i8;
            this.f3525j = i8 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f3524h = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3524h == -1) {
            a();
        }
        return this.f3524h == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3524h == -1) {
            a();
        }
        if (this.f3524h == 0) {
            throw new NoSuchElementException();
        }
        J4.d dVar = this.f3526k;
        E4.k.d("null cannot be cast to non-null type kotlin.ranges.IntRange", dVar);
        this.f3526k = null;
        this.f3524h = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
