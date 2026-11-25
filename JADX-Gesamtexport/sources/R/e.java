package R;

import E4.k;
import N.C0208d;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f4710h;
    public final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4712k;

    public e(Object[] objArr, Object[] objArr2, int i, int i3) {
        this.f4710h = objArr;
        this.i = objArr2;
        this.f4711j = i;
        this.f4712k = i3;
        if (c() > 32) {
            int length = objArr2.length;
            return;
        }
        C0208d.S("Trie-based persistent vector should have at least 33 elements, got " + c());
        throw null;
    }

    public static Object[] o(Object[] objArr, int i, int i3, Object obj, N2.c cVar) {
        Object[] objArrCopyOf;
        int iV = p006b.a.v(i3, i);
        if (i == 0) {
            if (iV == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                k.e("copyOf(this, newSize)", objArrCopyOf);
            }
            p089q4.k.e0(objArr, objArrCopyOf, iV + 1, iV, 31);
            cVar.f3892h = objArr[31];
            objArrCopyOf[iV] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf2);
        int i6 = i - 5;
        Object obj2 = objArr[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iV] = o((Object[]) obj2, i6, i3, obj, cVar);
        while (true) {
            iV++;
            if (iV >= 32 || objArrCopyOf2[iV] == null) {
                break;
            }
            Object obj3 = objArr[iV];
            k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
            objArrCopyOf2[iV] = o((Object[]) obj3, i6, 0, cVar.f3892h, cVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] q(Object[] objArr, int i, int i3, N2.c cVar) {
        Object[] objArrQ;
        int iV = p006b.a.v(i3, i);
        if (i == 5) {
            cVar.f3892h = objArr[iV];
            objArrQ = null;
        } else {
            Object obj = objArr[iV];
            k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrQ = q((Object[]) obj, i - 5, i3, cVar);
        }
        if (objArrQ == null && iV == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[iV] = objArrQ;
        return objArrCopyOf;
    }

    public static Object[] w(int i, int i3, Object obj, Object[] objArr) {
        int iV = p006b.a.v(i3, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        if (i == 0) {
            objArrCopyOf[iV] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf[iV] = w(i - 5, i3, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f4711j;
    }

    @Override // R.c
    public final c g(int i, Object obj) {
        int i3 = this.f4711j;
        p081p0.c.K(i, i3);
        if (i == i3) {
            return i(obj);
        }
        int iV = v();
        Object[] objArr = this.f4710h;
        if (i >= iV) {
            return p(i - iV, obj, objArr);
        }
        N2.c cVar = new N2.c(null);
        return p(0, cVar.f3892h, o(objArr, this.f4712k, i, obj, cVar));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        p081p0.c.J(i, c());
        if (v() <= i) {
            objArr = this.i;
        } else {
            Object[] objArr2 = this.f4710h;
            for (int i3 = this.f4712k; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[p006b.a.v(i, i3)];
                k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr3);
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // R.c
    public final c i(Object obj) {
        int iV = v();
        int i = this.f4711j;
        int i3 = i - iV;
        Object[] objArr = this.f4710h;
        Object[] objArr2 = this.i;
        if (i3 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return r(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[i3] = obj;
        return new e(objArr, objArrCopyOf, i + 1, this.f4712k);
    }

    @Override // R.c
    public final f k() {
        return new f(this, this.f4710h, this.i, this.f4712k);
    }

    @Override // R.c
    public final c l(b bVar) {
        f fVar = new f(this, this.f4710h, this.i, this.f4712k);
        fVar.E(bVar);
        return fVar.i();
    }

    @Override // p089q4.d, java.util.List
    public final ListIterator listIterator(int i) {
        p081p0.c.K(i, this.f4711j);
        return new g(this.f4710h, this.i, i, this.f4711j, (this.f4712k / 5) + 1);
    }

    @Override // R.c
    public final c m(int i) {
        p081p0.c.J(i, this.f4711j);
        int iV = v();
        Object[] objArr = this.f4710h;
        int i3 = this.f4712k;
        return i >= iV ? u(objArr, iV, i3, i - iV) : u(t(objArr, i3, i, new N2.c(this.i[0])), iV, i3, 0);
    }

    @Override // R.c
    public final c n(int i, Object obj) {
        int i3 = this.f4711j;
        p081p0.c.J(i, i3);
        int iV = v();
        Object[] objArr = this.f4710h;
        Object[] objArr2 = this.i;
        int i6 = this.f4712k;
        if (iV > i) {
            return new e(w(i6, i, obj, objArr), objArr2, i3, i6);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[i & 31] = obj;
        return new e(objArr, objArrCopyOf, i3, i6);
    }

    public final e p(int i, Object obj, Object[] objArr) {
        int iV = v();
        int i3 = this.f4711j;
        int i6 = i3 - iV;
        Object[] objArr2 = this.i;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        if (i6 < 32) {
            p089q4.k.e0(objArr2, objArrCopyOf, i + 1, i, i6);
            objArrCopyOf[i] = obj;
            return new e(objArr, objArrCopyOf, i3 + 1, this.f4712k);
        }
        Object obj2 = objArr2[31];
        p089q4.k.e0(objArr2, objArrCopyOf, i + 1, i, i6 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    public final e r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f4711j;
        int i3 = i >> 5;
        int i6 = this.f4712k;
        if (i3 <= (1 << i6)) {
            return new e(s(i6, objArr, objArr2), objArr3, i + 1, i6);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i7 = i6 + 5;
        return new e(s(i7, objArr4, objArr2), objArr3, i + 1, i7);
    }

    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iV = p006b.a.v(c() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            k.e("copyOf(this, newSize)", objArrCopyOf);
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iV] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iV] = s(i - 5, (Object[]) objArrCopyOf[iV], objArr2);
        return objArrCopyOf;
    }

    public final Object[] t(Object[] objArr, int i, int i3, N2.c cVar) {
        Object[] objArrCopyOf;
        int iV = p006b.a.v(i3, i);
        if (i == 0) {
            if (iV == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                k.e("copyOf(this, newSize)", objArrCopyOf);
            }
            p089q4.k.e0(objArr, objArrCopyOf, iV, iV + 1, 32);
            objArrCopyOf[31] = cVar.f3892h;
            cVar.f3892h = objArr[iV];
            return objArrCopyOf;
        }
        int iV2 = objArr[31] == null ? p006b.a.v(v() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        k.e("copyOf(this, newSize)", objArrCopyOf2);
        int i6 = i - 5;
        int i7 = iV + 1;
        if (i7 <= iV2) {
            while (true) {
                Object obj = objArrCopyOf2[iV2];
                k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArrCopyOf2[iV2] = t((Object[]) obj, i6, 0, cVar);
                if (iV2 == i7) {
                    break;
                }
                iV2--;
            }
        }
        Object obj2 = objArrCopyOf2[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iV] = t((Object[]) obj2, i6, i3, cVar);
        return objArrCopyOf2;
    }

    public final c u(Object[] objArr, int i, int i3, int i6) {
        int i7 = this.f4711j - i;
        if (i7 != 1) {
            Object[] objArr2 = this.i;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            int i8 = i7 - 1;
            if (i6 < i8) {
                p089q4.k.e0(objArr2, objArrCopyOf, i6, i6 + 1, i7);
            }
            objArrCopyOf[i8] = null;
            return new e(objArr, objArrCopyOf, (i + i7) - 1, i3);
        }
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                k.e("copyOf(this, newSize)", objArr);
            }
            return new i(objArr);
        }
        N2.c cVar = new N2.c(null);
        Object[] objArrQ = q(objArr, i3, i - 1, cVar);
        k.c(objArrQ);
        Object obj = cVar.f3892h;
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new e(objArrQ, objArr3, i, i3);
        }
        Object obj2 = objArrQ[0];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        return new e((Object[]) obj2, objArr3, i, i3 - 5);
    }

    public final int v() {
        return (this.f4711j - 1) & (-32);
    }
}
