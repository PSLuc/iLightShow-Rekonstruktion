package P;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p089q4.k;
import p089q4.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f4582h;
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4583j = 0;

    public d(Object[] objArr) {
        this.f4582h = objArr;
    }

    public final void a(int i, Object obj) {
        k(this.f4583j + 1);
        Object[] objArr = this.f4582h;
        int i3 = this.f4583j;
        if (i != i3) {
            k.e0(objArr, objArr, i + 1, i, i3);
        }
        objArr[i] = obj;
        this.f4583j++;
    }

    public final void c(Object obj) {
        k(this.f4583j + 1);
        Object[] objArr = this.f4582h;
        int i = this.f4583j;
        objArr[i] = obj;
        this.f4583j = i + 1;
    }

    public final void d(int i, d dVar) {
        if (dVar.m()) {
            return;
        }
        k(this.f4583j + dVar.f4583j);
        Object[] objArr = this.f4582h;
        int i3 = this.f4583j;
        if (i != i3) {
            k.e0(objArr, objArr, dVar.f4583j + i, i, i3);
        }
        k.e0(dVar.f4582h, objArr, i, 0, dVar.f4583j);
        this.f4583j += dVar.f4583j;
    }

    public final void f(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        k(list.size() + this.f4583j);
        Object[] objArr = this.f4582h;
        if (i != this.f4583j) {
            k.e0(objArr, objArr, list.size() + i, i, this.f4583j);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i + i3] = list.get(i3);
        }
        this.f4583j = list.size() + this.f4583j;
    }

    public final boolean g(int i, Collection collection) {
        int i3 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        k(collection.size() + this.f4583j);
        Object[] objArr = this.f4582h;
        if (i != this.f4583j) {
            k.e0(objArr, objArr, collection.size() + i, i, this.f4583j);
        }
        for (Object obj : collection) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                m.O();
                throw null;
            }
            objArr[i3 + i] = obj;
            i3 = i6;
        }
        this.f4583j = collection.size() + this.f4583j;
        return true;
    }

    public final List h() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.i = aVar2;
        return aVar2;
    }

    public final void i() {
        Object[] objArr = this.f4582h;
        int i = this.f4583j;
        while (true) {
            i--;
            if (-1 >= i) {
                this.f4583j = 0;
                return;
            }
            objArr[i] = null;
        }
    }

    public final boolean j(Object obj) {
        int i = this.f4583j - 1;
        if (i >= 0) {
            for (int i3 = 0; !E4.k.a(this.f4582h[i3], obj); i3++) {
                if (i3 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void k(int i) {
        Object[] objArr = this.f4582h;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            E4.k.e("copyOf(this, newSize)", objArrCopyOf);
            this.f4582h = objArrCopyOf;
        }
    }

    public final int l(Object obj) {
        int i = this.f4583j;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.f4582h;
        int i3 = 0;
        while (!E4.k.a(obj, objArr[i3])) {
            i3++;
            if (i3 >= i) {
                return -1;
            }
        }
        return i3;
    }

    public final boolean m() {
        return this.f4583j == 0;
    }

    public final boolean n() {
        return this.f4583j != 0;
    }

    public final boolean o(Object obj) {
        int iL = l(obj);
        if (iL < 0) {
            return false;
        }
        p(iL);
        return true;
    }

    public final Object p(int i) {
        Object[] objArr = this.f4582h;
        Object obj = objArr[i];
        int i3 = this.f4583j;
        if (i != i3 - 1) {
            k.e0(objArr, objArr, i, i + 1, i3);
        }
        int i6 = this.f4583j - 1;
        this.f4583j = i6;
        objArr[i6] = null;
        return obj;
    }

    public final void q(int i, int i3) {
        if (i3 > i) {
            int i6 = this.f4583j;
            if (i3 < i6) {
                Object[] objArr = this.f4582h;
                k.e0(objArr, objArr, i, i3, i6);
            }
            int i7 = this.f4583j;
            int i8 = i7 - (i3 - i);
            int i9 = i7 - 1;
            if (i8 <= i9) {
                int i10 = i8;
                while (true) {
                    this.f4582h[i10] = null;
                    if (i10 == i9) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f4583j = i8;
        }
    }

    public final void r(Comparator comparator) {
        Arrays.sort(this.f4582h, 0, this.f4583j, comparator);
    }
}
