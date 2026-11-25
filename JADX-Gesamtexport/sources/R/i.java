package R;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {
    public static final i i = new i(new Object[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f4726h;

    public i(Object[] objArr) {
        this.f4726h = objArr;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f4726h.length;
    }

    @Override // R.c
    public final c g(int i3, Object obj) {
        Object[] objArr = this.f4726h;
        p081p0.c.K(i3, objArr.length);
        if (i3 == objArr.length) {
            return i(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            k.g0(objArr, objArr2, 0, i3, 6);
            k.e0(objArr, objArr2, i3 + 1, i3, objArr.length);
            objArr2[i3] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        E4.k.e("copyOf(this, size)", objArrCopyOf);
        k.e0(objArr, objArrCopyOf, i3 + 1, i3, objArr.length - 1);
        objArrCopyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        p081p0.c.J(i3, c());
        return this.f4726h[i3];
    }

    @Override // R.c
    public final c i(Object obj) {
        Object[] objArr = this.f4726h;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        E4.k.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // p089q4.d, java.util.List
    public final int indexOf(Object obj) {
        return k.n0(this.f4726h, obj);
    }

    @Override // R.c
    public final c j(Collection collection) {
        Object[] objArr = this.f4726h;
        if (collection.size() + objArr.length > 32) {
            f fVarK = k();
            fVarK.addAll(collection);
            return fVarK.i();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        E4.k.e("copyOf(this, newSize)", objArrCopyOf);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // R.c
    public final f k() {
        return new f(this, null, this.f4726h, 0);
    }

    @Override // R.c
    public final c l(b bVar) {
        Object[] objArr = this.f4726h;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z5 = false;
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z5) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    E4.k.e("copyOf(this, size)", objArrCopyOf);
                    z5 = true;
                    length = i3;
                }
            } else if (z5) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? i : new i(k.i0(0, length, objArrCopyOf));
    }

    @Override // p089q4.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f4726h;
        E4.k.f("<this>", objArr);
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i3 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i3 >= 0) {
                        length = i3;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length2 = i6;
                }
            }
        }
        return -1;
    }

    @Override // p089q4.d, java.util.List
    public final ListIterator listIterator(int i3) {
        Object[] objArr = this.f4726h;
        p081p0.c.K(i3, objArr.length);
        return new d(i3, objArr.length, objArr);
    }

    @Override // R.c
    public final c m(int i3) {
        Object[] objArr = this.f4726h;
        p081p0.c.J(i3, objArr.length);
        if (objArr.length == 1) {
            return i;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        E4.k.e("copyOf(this, newSize)", objArrCopyOf);
        k.e0(objArr, objArrCopyOf, i3, i3 + 1, objArr.length);
        return new i(objArrCopyOf);
    }

    @Override // R.c
    public final c n(int i3, Object obj) {
        Object[] objArr = this.f4726h;
        p081p0.c.J(i3, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        E4.k.e("copyOf(this, size)", objArrCopyOf);
        objArrCopyOf[i3] = obj;
        return new i(objArrCopyOf);
    }
}
