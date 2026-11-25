package E4;

import c5.C0502x;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p080p.F;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1053h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1054j;

    public /* synthetic */ b(int i, Object obj) {
        this.f1053h = i;
        this.f1054j = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1053h) {
            case 0:
                return this.i < ((Object[]) this.f1054j).length;
            case 1:
                return this.i > 0;
            case 2:
                return this.i < ((F) this.f1054j).f();
            case 3:
                return this.i < ((byte[]) this.f1054j).length;
            case 4:
                return this.i < ((int[]) this.f1054j).length;
            case 5:
                return this.i < ((long[]) this.f1054j).length;
            case 6:
                return this.i < ((short[]) this.f1054j).length;
            default:
                return this.i < ((p089q4.d) this.f1054j).c();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1053h) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f1054j;
                    int i = this.i;
                    this.i = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.i--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            case 1:
                C0502x c0502x = (C0502x) this.f1054j;
                int i3 = this.i;
                this.i = i3 - 1;
                return c0502x.f7437e[c0502x.f7435c - i3];
            case 2:
                int i6 = this.i;
                this.i = i6 + 1;
                return ((F) this.f1054j).g(i6);
            case 3:
                int i7 = this.i;
                byte[] bArr = (byte[]) this.f1054j;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.i));
                }
                this.i = i7 + 1;
                return new p084p4.o(bArr[i7]);
            case 4:
                int i8 = this.i;
                int[] iArr = (int[]) this.f1054j;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.i));
                }
                this.i = i8 + 1;
                return new p084p4.q(iArr[i8]);
            case 5:
                int i9 = this.i;
                long[] jArr = (long[]) this.f1054j;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.i));
                }
                this.i = i9 + 1;
                return new p084p4.s(jArr[i9]);
            case 6:
                int i10 = this.i;
                short[] sArr = (short[]) this.f1054j;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.i));
                }
                this.i = i10 + 1;
                return new p084p4.v(sArr[i10]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.i;
                this.i = i11 + 1;
                return ((p089q4.d) this.f1054j).get(i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1053h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] objArr) {
        this.f1053h = 0;
        k.f("array", objArr);
        this.f1054j = objArr;
    }

    public b(C0502x c0502x) {
        this.f1053h = 1;
        this.f1054j = c0502x;
        this.i = c0502x.f7435c;
    }
}
