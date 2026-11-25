package R;

import E4.k;
import N.C0208d;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p089q4.f implements Collection, F4.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f4713h;
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f4714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public U.b f4716l = new U.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f4717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f4718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4719o;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i) {
        this.f4713h = cVar;
        this.i = objArr;
        this.f4714j = objArr2;
        this.f4715k = i;
        this.f4717m = objArr;
        this.f4718n = objArr2;
        this.f4719o = cVar.c();
    }

    public static void j(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, Object[] objArr, Object[] objArr2) {
        int iV = p006b.a.v(c() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iV] = objArr2;
            return objArrQ;
        }
        objArrQ[iV] = A(i - 5, (Object[]) objArrQ[iV], objArr2);
        return objArrQ;
    }

    public final int B(D4.c cVar, Object[] objArr, int i, int i3, N2.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        if (o(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar2.f3892h;
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i3 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i3 = 0;
                }
                objArrS[i3] = obj2;
                i3++;
            }
        }
        cVar2.f3892h = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i3;
    }

    public final int C(D4.c cVar, Object[] objArr, int i, N2.c cVar2) {
        Object[] objArrQ = objArr;
        int i3 = i;
        boolean z5 = false;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z5) {
                    objArrQ = q(objArr);
                    z5 = true;
                    i3 = i6;
                }
            } else if (z5) {
                objArrQ[i3] = obj;
                i3++;
            }
        }
        cVar2.f3892h = objArrQ;
        return i3;
    }

    public final int D(D4.c cVar, int i, N2.c cVar2) {
        int iC = C(cVar, this.f4718n, i, cVar2);
        if (iC == i) {
            return i;
        }
        Object obj = cVar2.f3892h;
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i, (Object) null);
        this.f4718n = objArr;
        this.f4719o -= i - iC;
        return iC;
    }

    public final boolean E(D4.c cVar) {
        Object[] objArrX;
        int i;
        D4.c cVar2 = cVar;
        int iK = K();
        Object[] objArrU = null;
        N2.c cVar3 = new N2.c(null);
        boolean z5 = false;
        if (this.f4717m != null) {
            a aVarP = p(0);
            int iC = 32;
            while (iC == 32 && aVarP.hasNext()) {
                iC = C(cVar2, (Object[]) aVarP.next(), 32, cVar3);
            }
            if (iC == 32) {
                int iD = D(cVar2, iK, cVar3);
                if (iD == 0) {
                    w(this.f4719o, this.f4715k, this.f4717m);
                }
                if (iD != iK) {
                }
            } else {
                int i3 = (aVarP.f4706h - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iB = iC;
                while (aVarP.hasNext()) {
                    iB = B(cVar2, (Object[]) aVarP.next(), 32, iB, cVar3, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iB2 = B(cVar, this.f4718n, iK, iB, cVar3, arrayList2, arrayList);
                Object obj = cVar3.f3892h;
                k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iB2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrX = this.f4717m;
                    k.c(objArrX);
                } else {
                    objArrX = x(this.f4717m, i3, this.f4715k, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0208d.S("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f4715k = 0;
                } else {
                    int i6 = size - 1;
                    while (true) {
                        i = this.f4715k;
                        if ((i6 >> i) != 0) {
                            break;
                        }
                        this.f4715k = i - 5;
                        Object[] objArr2 = objArrX[0];
                        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr2);
                        objArrX = objArr2;
                    }
                    objArrU = u(i6, i, objArrX);
                }
                this.f4717m = objArrU;
                this.f4718n = objArr;
                this.f4719o = size + iB2;
            }
            z5 = true;
        } else if (D(cVar2, iK, cVar3) != iK) {
            z5 = true;
        }
        if (z5) {
            ((AbstractList) this).modCount++;
        }
        return z5;
    }

    public final Object[] F(Object[] objArr, int i, int i3, N2.c cVar) {
        int iV = p006b.a.v(i3, i);
        if (i == 0) {
            Object obj = objArr[iV];
            Object[] objArrQ = q(objArr);
            p089q4.k.e0(objArr, objArrQ, iV, iV + 1, 32);
            objArrQ[31] = cVar.f3892h;
            cVar.f3892h = obj;
            return objArrQ;
        }
        int iV2 = objArr[31] == null ? p006b.a.v(H() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i6 = i - 5;
        int i7 = iV + 1;
        if (i7 <= iV2) {
            while (true) {
                Object obj2 = objArrQ2[iV2];
                k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                objArrQ2[iV2] = F((Object[]) obj2, i6, 0, cVar);
                if (iV2 == i7) {
                    break;
                }
                iV2--;
            }
        }
        Object obj3 = objArrQ2[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrQ2[iV] = F((Object[]) obj3, i6, i3, cVar);
        return objArrQ2;
    }

    public final Object G(Object[] objArr, int i, int i3, int i6) {
        int i7 = this.f4719o - i;
        if (i7 == 1) {
            Object obj = this.f4718n[0];
            w(i, i3, objArr);
            return obj;
        }
        Object[] objArr2 = this.f4718n;
        Object obj2 = objArr2[i6];
        Object[] objArrQ = q(objArr2);
        p089q4.k.e0(objArr2, objArrQ, i6, i6 + 1, i7);
        objArrQ[i7 - 1] = null;
        this.f4717m = objArr;
        this.f4718n = objArrQ;
        this.f4719o = (i + i7) - 1;
        this.f4715k = i3;
        return obj2;
    }

    public final int H() {
        int i = this.f4719o;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i, int i3, Object obj, N2.c cVar) {
        int iV = p006b.a.v(i3, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iV];
            k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
            objArrQ[iV] = I((Object[]) obj2, i - 5, i3, obj, cVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        cVar.f3892h = objArrQ[iV];
        objArrQ[iV] = obj;
        return objArrQ;
    }

    public final void J(Collection collection, int i, Object[] objArr, int i3, Object[][] objArr2, int i6, Object[] objArr3) {
        Object[] objArrS;
        if (i6 < 1) {
            C0208d.S("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i7 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i8 = (i3 - i7) + size;
        if (i8 < 32) {
            p089q4.k.e0(objArrQ, objArr3, size + 1, i7, i3);
        } else {
            int i9 = i8 - 31;
            if (i6 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i6--;
                objArr2[i6] = objArrS;
            }
            int i10 = i3 - i9;
            p089q4.k.e0(objArrQ, objArr3, 0, i10, i3);
            p089q4.k.e0(objArrQ, objArrS, size + 1, i7, i10);
            objArr3 = objArrS;
        }
        Iterator it = collection.iterator();
        j(objArrQ, i7, it);
        for (int i11 = 1; i11 < i6; i11++) {
            Object[] objArrS2 = s();
            j(objArrS2, 0, it);
            objArr2[i11] = objArrS2;
        }
        j(objArr3, 0, it);
    }

    public final int K() {
        int i = this.f4719o;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        p081p0.c.K(i, c());
        if (i == c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            n(i - iH, obj, this.f4717m);
            return;
        }
        N2.c cVar = new N2.c(null);
        Object[] objArr = this.f4717m;
        k.c(objArr);
        n(0, cVar.f3892h, m(objArr, this.f4715k, i, obj, cVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        p081p0.c.K(i, this.f4719o);
        if (i == this.f4719o) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i3 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f4719o - i3)) - 1) / 32;
        if (size == 0) {
            int i6 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f4718n;
            Object[] objArrQ = q(objArr);
            p089q4.k.e0(objArr, objArrQ, size2 + 1, i6, K());
            j(objArrQ, i6, collection.iterator());
            this.f4718n = objArrQ;
            this.f4719o = collection.size() + this.f4719o;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iK = K();
        int size3 = collection.size() + this.f4719o;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= H()) {
            objArrS = s();
            collection2 = collection;
            J(collection2, i, this.f4718n, iK, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            if (size3 > iK) {
                int i7 = size3 - iK;
                Object[] objArrR = r(this.f4718n, i7);
                l(collection2, i, i7, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                Object[] objArr3 = this.f4718n;
                objArrS = s();
                int i8 = iK - size3;
                p089q4.k.e0(objArr3, objArrS, 0, i8, iK);
                int i9 = 32 - i8;
                Object[] objArrR2 = r(this.f4718n, i9);
                int i10 = size - 1;
                objArr2[i10] = objArrR2;
                l(collection2, i, i9, objArr2, i10, objArrR2);
                collection2 = collection2;
            }
        }
        this.f4717m = y(this.f4717m, i3, objArr2);
        this.f4718n = objArrS;
        this.f4719o = collection2.size() + this.f4719o;
        return true;
    }

    @Override // p089q4.f
    public final int c() {
        return this.f4719o;
    }

    @Override // p089q4.f
    public final Object g(int i) {
        p081p0.c.J(i, c());
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            return G(this.f4717m, iH, this.f4715k, i - iH);
        }
        N2.c cVar = new N2.c(this.f4718n[0]);
        Object[] objArr = this.f4717m;
        k.c(objArr);
        G(F(objArr, this.f4715k, i, cVar), iH, this.f4715k, 0);
        return cVar.f3892h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        p081p0.c.J(i, c());
        if (H() <= i) {
            objArr = this.f4718n;
        } else {
            Object[] objArr2 = this.f4717m;
            k.c(objArr2);
            for (int i3 = this.f4715k; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[p006b.a.v(i, i3)];
                k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr3);
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final c i() {
        c eVar;
        Object[] objArr = this.f4717m;
        if (objArr == this.i && this.f4718n == this.f4714j) {
            eVar = this.f4713h;
        } else {
            this.f4716l = new U.b();
            this.i = objArr;
            Object[] objArr2 = this.f4718n;
            this.f4714j = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f4719o, this.f4715k);
            } else if (objArr2.length == 0) {
                eVar = i.i;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f4719o);
                k.e("copyOf(this, newSize)", objArrCopyOf);
                eVar = new i(objArrCopyOf);
            }
        }
        this.f4713h = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int k() {
        return ((AbstractList) this).modCount;
    }

    public final void l(Collection collection, int i, int i3, Object[][] objArr, int i6, Object[] objArr2) {
        if (this.f4717m == null) {
            throw new IllegalStateException("root is null");
        }
        int i7 = i >> 5;
        a aVarP = p(H() >> 5);
        int i8 = i6;
        Object[] objArrR = objArr2;
        while (aVarP.f4706h - 1 != i7) {
            Object[] objArr3 = (Object[]) aVarP.previous();
            p089q4.k.e0(objArr3, objArrR, 0, 32 - i3, 32);
            objArrR = r(objArr3, i3);
            i8--;
            objArr[i8] = objArrR;
        }
        Object[] objArr4 = (Object[]) aVarP.previous();
        int iH = i6 - (((H() >> 5) - 1) - i7);
        if (iH < i6) {
            objArr2 = objArr[iH];
            k.c(objArr2);
        }
        J(collection, i, objArr4, 32, objArr, iH, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        p081p0.c.K(i, this.f4719o);
        return new h(this, i);
    }

    public final Object[] m(Object[] objArr, int i, int i3, Object obj, N2.c cVar) {
        Object obj2;
        int iV = p006b.a.v(i3, i);
        if (i == 0) {
            cVar.f3892h = objArr[31];
            Object[] objArrQ = q(objArr);
            p089q4.k.e0(objArr, objArrQ, iV + 1, iV, 31);
            objArrQ[iV] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i6 = i - 5;
        Object obj3 = objArrQ2[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrQ2[iV] = m((Object[]) obj3, i6, i3, obj, cVar);
        while (true) {
            iV++;
            if (iV >= 32 || (obj2 = objArrQ2[iV]) == null) {
                break;
            }
            objArrQ2[iV] = m((Object[]) obj2, i6, 0, cVar.f3892h, cVar);
        }
        return objArrQ2;
    }

    public final void n(int i, Object obj, Object[] objArr) {
        int iK = K();
        Object[] objArrQ = q(this.f4718n);
        if (iK < 32) {
            p089q4.k.e0(this.f4718n, objArrQ, i + 1, i, iK);
            objArrQ[i] = obj;
            this.f4717m = objArr;
            this.f4718n = objArrQ;
            this.f4719o++;
            return;
        }
        Object[] objArr2 = this.f4718n;
        Object obj2 = objArr2[31];
        p089q4.k.e0(objArr2, objArrQ, i + 1, i, 31);
        objArrQ[i] = obj;
        z(objArr, objArrQ, t(obj2));
    }

    public final boolean o(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f4716l;
    }

    public final a p(int i) {
        Object[] objArr = this.f4717m;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iH = H() >> 5;
        p081p0.c.K(i, iH);
        int i3 = this.f4715k;
        return i3 == 0 ? new d(i, objArr) : new j(objArr, i, iH, i3 / 5);
    }

    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        p089q4.k.g0(objArr, objArrS, 0, length, 6);
        return objArrS;
    }

    public final Object[] r(Object[] objArr, int i) {
        if (o(objArr)) {
            p089q4.k.e0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrS = s();
        p089q4.k.e0(objArr, objArrS, i, 0, 32 - i);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return E(new b(1, collection));
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f4716l;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        p081p0.c.J(i, c());
        if (H() > i) {
            N2.c cVar = new N2.c(null);
            Object[] objArr = this.f4717m;
            k.c(objArr);
            this.f4717m = I(objArr, this.f4715k, i, obj, cVar);
            return cVar.f3892h;
        }
        Object[] objArrQ = q(this.f4718n);
        if (objArrQ != this.f4718n) {
            ((AbstractList) this).modCount++;
        }
        int i3 = i & 31;
        Object obj2 = objArrQ[i3];
        objArrQ[i3] = obj;
        this.f4718n = objArrQ;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f4716l;
        return objArr;
    }

    public final Object[] u(int i, int i3, Object[] objArr) {
        if (!(i3 >= 0)) {
            C0208d.S("shift should be positive");
            throw null;
        }
        if (i3 == 0) {
            return objArr;
        }
        int iV = p006b.a.v(i, i3);
        Object obj = objArr[iV];
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object objU = u(i, i3 - 5, (Object[]) obj);
        if (iV < 31) {
            int i6 = iV + 1;
            if (objArr[i6] != null) {
                if (o(objArr)) {
                    Arrays.fill(objArr, i6, 32, (Object) null);
                }
                Object[] objArrS = s();
                p089q4.k.e0(objArr, objArrS, 0, 0, i6);
                objArr = objArrS;
            }
        }
        if (objU == objArr[iV]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iV] = objU;
        return objArrQ;
    }

    public final Object[] v(Object[] objArr, int i, int i3, N2.c cVar) {
        Object[] objArrV;
        int iV = p006b.a.v(i3 - 1, i);
        if (i == 5) {
            cVar.f3892h = objArr[iV];
            objArrV = null;
        } else {
            Object obj = objArr[iV];
            k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrV = v((Object[]) obj, i - 5, i3, cVar);
        }
        if (objArrV == null && iV == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iV] = objArrV;
        return objArrQ;
    }

    public final void w(int i, int i3, Object[] objArr) {
        if (i3 == 0) {
            this.f4717m = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f4718n = objArr;
            this.f4719o = i;
            this.f4715k = i3;
            return;
        }
        N2.c cVar = new N2.c(null);
        k.c(objArr);
        Object[] objArrV = v(objArr, i3, i, cVar);
        k.c(objArrV);
        Object obj = cVar.f3892h;
        k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        this.f4718n = (Object[]) obj;
        this.f4719o = i;
        if (objArrV[1] == null) {
            this.f4717m = (Object[]) objArrV[0];
            this.f4715k = i3 - 5;
        } else {
            this.f4717m = objArrV;
            this.f4715k = i3;
        }
    }

    public final Object[] x(Object[] objArr, int i, int i3, Iterator it) {
        if (!it.hasNext()) {
            C0208d.S("invalid buffersIterator");
            throw null;
        }
        if (!(i3 >= 0)) {
            C0208d.S("negative shift");
            throw null;
        }
        if (i3 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iV = p006b.a.v(i, i3);
        int i6 = i3 - 5;
        objArrQ[iV] = x((Object[]) objArrQ[iV], i, i6, it);
        while (true) {
            iV++;
            if (iV >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iV] = x((Object[]) objArrQ[iV], 0, i6, it);
        }
        return objArrQ;
    }

    public final Object[] y(Object[] objArr, int i, Object[][] objArr2) {
        E4.b bVarJ = k.j(objArr2);
        int i3 = i >> 5;
        int i6 = this.f4715k;
        Object[] objArrX = i3 < (1 << i6) ? x(objArr, i, i6, bVarJ) : q(objArr);
        while (bVarJ.hasNext()) {
            this.f4715k += 5;
            objArrX = t(objArrX);
            int i7 = this.f4715k;
            x(objArrX, 1 << i7, i7, bVarJ);
        }
        return objArrX;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f4719o;
        int i3 = i >> 5;
        int i6 = this.f4715k;
        if (i3 > (1 << i6)) {
            this.f4717m = A(this.f4715k + 5, t(objArr), objArr2);
            this.f4718n = objArr3;
            this.f4715k += 5;
            this.f4719o++;
            return;
        }
        if (objArr == null) {
            this.f4717m = objArr2;
            this.f4718n = objArr3;
            this.f4719o = i + 1;
        } else {
            this.f4717m = A(i6, objArr, objArr2);
            this.f4718n = objArr3;
            this.f4719o++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iK = K();
        if (iK < 32) {
            Object[] objArrQ = q(this.f4718n);
            objArrQ[iK] = obj;
            this.f4718n = objArrQ;
            this.f4719o = c() + 1;
        } else {
            z(this.f4717m, this.f4718n, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        Iterator it = collection.iterator();
        if (32 - iK >= collection.size()) {
            Object[] objArrQ = q(this.f4718n);
            j(objArrQ, iK, it);
            this.f4718n = objArrQ;
            this.f4719o = collection.size() + this.f4719o;
            return true;
        }
        int size = ((collection.size() + iK) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.f4718n);
        j(objArrQ2, iK, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            j(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.f4717m = y(this.f4717m, H(), objArr);
        Object[] objArrS2 = s();
        j(objArrS2, 0, it);
        this.f4718n = objArrS2;
        this.f4719o = collection.size() + this.f4719o;
        return true;
    }
}
