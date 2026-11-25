package S;

import N.C0208d;
import N.U;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f4874e = new n(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U.b f4877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f4878d;

    public n(int i, int i3, Object[] objArr, U.b bVar) {
        this.f4875a = i;
        this.f4876b = i3;
        this.f4877c = bVar;
        this.f4878d = objArr;
    }

    public static n j(int i, Object obj, Object obj2, int i3, Object obj3, Object obj4, int i6, U.b bVar) {
        if (i6 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iA = p020d2.n.A(i, i6);
        int iA2 = p020d2.n.A(i3, i6);
        if (iA != iA2) {
            return new n((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new n(0, 1 << iA, new Object[]{j(i, obj, obj2, i3, obj3, obj4, i6 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i3, int i6, Object obj, Object obj2, int i7, U.b bVar) {
        Object obj3 = this.f4878d[i];
        n nVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i6, obj, obj2, i7 + 5, bVar);
        int iT = t(i3);
        int i8 = iT + 1;
        Object[] objArr = this.f4878d;
        Object[] objArr2 = new Object[objArr.length - 1];
        p089q4.k.g0(objArr, objArr2, 0, i, 6);
        p089q4.k.e0(objArr, objArr2, i, i + 2, i8);
        objArr2[iT - 1] = nVarJ;
        p089q4.k.e0(objArr, objArr2, iT, i8, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f4876b == 0) {
            return this.f4878d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f4875a);
        int length = this.f4878d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, this.f4878d.length), 2);
        int i = bVarC0.f1941h;
        int i3 = bVarC0.i;
        int i6 = bVarC0.f1942j;
        if ((i6 > 0 && i <= i3) || (i6 < 0 && i3 <= i)) {
            while (!E4.k.a(obj, this.f4878d[i])) {
                if (i != i3) {
                    i += i6;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i3, Object obj) {
        int iA = 1 << p020d2.n.A(i, i3);
        if (h(iA)) {
            return E4.k.a(obj, this.f4878d[f(iA)]);
        }
        if (!i(iA)) {
            return false;
        }
        n nVarS = s(t(iA));
        return i3 == 30 ? nVarS.c(obj) : nVarS.d(i, i3 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f4876b != nVar.f4876b || this.f4875a != nVar.f4875a) {
            return false;
        }
        int length = this.f4878d.length;
        for (int i = 0; i < length; i++) {
            if (this.f4878d[i] != nVar.f4878d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.f4875a & (i - 1)) * 2;
    }

    public final Object g(int i, int i3, Object obj) {
        int iA = 1 << p020d2.n.A(i, i3);
        if (h(iA)) {
            int iF = f(iA);
            if (E4.k.a(obj, this.f4878d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iA)) {
            return null;
        }
        n nVarS = s(t(iA));
        if (i3 != 30) {
            return nVarS.g(i, i3 + 5, obj);
        }
        J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVarS.f4878d.length), 2);
        int i6 = bVarC0.f1941h;
        int i7 = bVarC0.i;
        int i8 = bVarC0.f1942j;
        if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
            return null;
        }
        while (!E4.k.a(obj, nVarS.f4878d[i6])) {
            if (i6 == i7) {
                return null;
            }
            i6 += i8;
        }
        return nVarS.x(i6);
    }

    public final boolean h(int i) {
        return (this.f4875a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.f4876b & i) != 0;
    }

    public final n k(int i, e eVar) {
        eVar.b(eVar.f4864m - 1);
        eVar.f4862k = x(i);
        Object[] objArr = this.f4878d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4877c != eVar.i) {
            return new n(0, 0, p020d2.n.j(objArr, i), eVar.i);
        }
        this.f4878d = p020d2.n.j(objArr, i);
        return this;
    }

    public final n l(int i, Object obj, Object obj2, int i3, e eVar) {
        e eVar2;
        n nVarL;
        int iA = 1 << p020d2.n.A(i, i3);
        boolean zH = h(iA);
        U.b bVar = this.f4877c;
        if (zH) {
            int iF = f(iA);
            if (!E4.k.a(obj, this.f4878d[iF])) {
                eVar.b(eVar.f4864m + 1);
                U.b bVar2 = eVar.i;
                if (bVar != bVar2) {
                    return new n(this.f4875a ^ iA, this.f4876b | iA, a(iF, iA, i, obj, obj2, i3, bVar2), bVar2);
                }
                this.f4878d = a(iF, iA, i, obj, obj2, i3, bVar2);
                this.f4875a ^= iA;
                this.f4876b |= iA;
                return this;
            }
            eVar.f4862k = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.i) {
                this.f4878d[iF + 1] = obj2;
                return this;
            }
            eVar.f4863l++;
            Object[] objArr = this.f4878d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            E4.k.e("copyOf(this, size)", objArrCopyOf);
            objArrCopyOf[iF + 1] = obj2;
            return new n(this.f4875a, this.f4876b, objArrCopyOf, eVar.i);
        }
        if (!i(iA)) {
            eVar.b(eVar.f4864m + 1);
            U.b bVar3 = eVar.i;
            int iF2 = f(iA);
            if (bVar != bVar3) {
                return new n(this.f4875a | iA, this.f4876b, p020d2.n.i(this.f4878d, iF2, obj, obj2), bVar3);
            }
            this.f4878d = p020d2.n.i(this.f4878d, iF2, obj, obj2);
            this.f4875a |= iA;
            return this;
        }
        int iT = t(iA);
        n nVarS = s(iT);
        if (i3 == 30) {
            J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVarS.f4878d.length), 2);
            int i6 = bVarC0.f1941h;
            int i7 = bVarC0.i;
            int i8 = bVarC0.f1942j;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!E4.k.a(obj, nVarS.f4878d[i6])) {
                        if (i6 == i7) {
                            eVar.b(eVar.f4864m + 1);
                            nVarL = new n(0, 0, p020d2.n.i(nVarS.f4878d, 0, obj, obj2), eVar.i);
                            break;
                        }
                        i6 += i8;
                    } else {
                        eVar.f4862k = nVarS.x(i6);
                        if (nVarS.f4877c != eVar.i) {
                            eVar.f4863l++;
                            Object[] objArr2 = nVarS.f4878d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            E4.k.e("copyOf(this, size)", objArrCopyOf2);
                            objArrCopyOf2[i6 + 1] = obj2;
                            nVarL = new n(0, 0, objArrCopyOf2, eVar.i);
                            break;
                        }
                        nVarS.f4878d[i6 + 1] = obj2;
                        nVarL = nVarS;
                        break;
                    }
                }
            } else {
                eVar.b(eVar.f4864m + 1);
                nVarL = new n(0, 0, p020d2.n.i(nVarS.f4878d, 0, obj, obj2), eVar.i);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            nVarL = nVarS.l(i, obj, obj2, i3 + 5, eVar2);
        }
        return nVarS == nVarL ? this : r(iT, nVarL, eVar2.i);
    }

    public final n m(n nVar, int i, U.a aVar, e eVar) {
        n nVar2;
        int i3;
        n nVarJ;
        if (this == nVar) {
            aVar.f5302a += b();
            return this;
        }
        int i6 = 1;
        int i7 = 0;
        if (i > 30) {
            U.b bVar = eVar.i;
            int i8 = nVar.f4876b;
            Object[] objArr = this.f4878d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + nVar.f4878d.length);
            E4.k.e("copyOf(this, newSize)", objArrCopyOf);
            int length = this.f4878d.length;
            J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVar.f4878d.length), 2);
            int i9 = bVarC0.f1941h;
            int i10 = bVarC0.i;
            int i11 = bVarC0.f1942j;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (c(nVar.f4878d[i9])) {
                        aVar.f5302a++;
                    } else {
                        Object[] objArr2 = nVar.f4878d;
                        objArrCopyOf[length] = objArr2[i9];
                        objArrCopyOf[length + 1] = objArr2[i9 + 1];
                        length += 2;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.f4878d.length) {
                if (length == nVar.f4878d.length) {
                    return nVar;
                }
                if (length == objArrCopyOf.length) {
                    return new n(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                E4.k.e("copyOf(this, newSize)", objArrCopyOf2);
                return new n(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i12 = this.f4876b | nVar.f4876b;
            int i13 = this.f4875a;
            int i14 = nVar.f4875a;
            int i15 = (i13 ^ i14) & (~i12);
            int i16 = i13 & i14;
            int i17 = i15;
            while (i16 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i16);
                if (E4.k.a(this.f4878d[f(iLowestOneBit)], nVar.f4878d[nVar.f(iLowestOneBit)])) {
                    i17 |= iLowestOneBit;
                } else {
                    i12 |= iLowestOneBit;
                }
                i16 ^= iLowestOneBit;
            }
            if (!((i12 & i17) == 0)) {
                C0208d.T("Check failed.");
                throw null;
            }
            if (E4.k.a(this.f4877c, eVar.i) && this.f4875a == i17 && this.f4876b == i12) {
                nVar2 = this;
            } else {
                nVar2 = new n(i17, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i17) * 2)], null);
            }
            int i18 = i12;
            int i19 = 0;
            while (i18 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr3 = nVar2.f4878d;
                int length2 = (objArr3.length - i6) - i19;
                if (i(iLowestOneBit2)) {
                    nVarJ = s(t(iLowestOneBit2));
                    if (nVar.i(iLowestOneBit2)) {
                        nVarJ = nVarJ.m(nVar.s(nVar.t(iLowestOneBit2)), i + 5, aVar, eVar);
                    } else if (nVar.h(iLowestOneBit2)) {
                        int iF = nVar.f(iLowestOneBit2);
                        Object obj = nVar.f4878d[iF];
                        Object objX = nVar.x(iF);
                        i3 = i6;
                        int i20 = eVar.f4864m;
                        int iHashCode = obj != null ? obj.hashCode() : i7;
                        objArr3 = objArr3;
                        iLowestOneBit2 = iLowestOneBit2;
                        nVarJ = nVarJ.l(iHashCode, obj, objX, i + 5, eVar);
                        if (eVar.f4864m == i20) {
                            aVar.f5302a++;
                        }
                    }
                    i3 = i6;
                } else {
                    iLowestOneBit2 = iLowestOneBit2;
                    objArr3 = objArr3;
                    i3 = i6;
                    if (nVar.i(iLowestOneBit2)) {
                        n nVarS = nVar.s(nVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f4878d[iF2];
                            int i21 = i + 5;
                            if (nVarS.d(obj2 != null ? obj2.hashCode() : 0, i21, obj2)) {
                                aVar.f5302a++;
                                nVarJ = nVarS;
                            } else {
                                nVarJ = nVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i21, eVar);
                            }
                        } else {
                            nVarJ = nVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f4878d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = nVar.f(iLowestOneBit2);
                        Object obj4 = nVar.f4878d[iF4];
                        nVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(iF4), i + 5, eVar.i);
                    }
                }
                objArr3[length2] = nVarJ;
                i19++;
                i18 ^= iLowestOneBit2;
                i6 = i3;
                i7 = 0;
            }
            int i22 = 0;
            while (i17 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i17);
                int i23 = i22 * 2;
                if (nVar.h(iLowestOneBit3)) {
                    int iF5 = nVar.f(iLowestOneBit3);
                    Object[] objArr4 = nVar2.f4878d;
                    objArr4[i23] = nVar.f4878d[iF5];
                    objArr4[i23 + 1] = nVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f5302a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr5 = nVar2.f4878d;
                    objArr5[i23] = this.f4878d[iF6];
                    objArr5[i23 + 1] = x(iF6);
                }
                i22++;
                i17 ^= iLowestOneBit3;
            }
            if (!e(nVar2)) {
                return nVar.e(nVar2) ? nVar : nVar2;
            }
        }
        return this;
    }

    public final n n(int i, Object obj, int i3, e eVar) {
        n nVarN;
        int iA = 1 << p020d2.n.A(i, i3);
        if (h(iA)) {
            int iF = f(iA);
            if (E4.k.a(obj, this.f4878d[iF])) {
                return p(iF, iA, eVar);
            }
        } else if (i(iA)) {
            int iT = t(iA);
            n nVarS = s(iT);
            if (i3 == 30) {
                J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVarS.f4878d.length), 2);
                int i6 = bVarC0.f1941h;
                int i7 = bVarC0.i;
                int i8 = bVarC0.f1942j;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!E4.k.a(obj, nVarS.f4878d[i6])) {
                            if (i6 == i7) {
                                nVarN = nVarS;
                                break;
                            }
                            i6 += i8;
                        } else {
                            nVarN = nVarS.k(i6, eVar);
                            break;
                        }
                    }
                } else {
                    nVarN = nVarS;
                    break;
                }
            } else {
                nVarN = nVarS.n(i, obj, i3 + 5, eVar);
            }
            return q(nVarS, nVarN, iT, iA, eVar.i);
        }
        return this;
    }

    public final n o(int i, Object obj, Object obj2, int i3, e eVar) {
        e eVar2;
        n nVarO;
        int iA = 1 << p020d2.n.A(i, i3);
        if (h(iA)) {
            int iF = f(iA);
            return (E4.k.a(obj, this.f4878d[iF]) && E4.k.a(obj2, x(iF))) ? p(iF, iA, eVar) : this;
        }
        if (!i(iA)) {
            return this;
        }
        int iT = t(iA);
        n nVarS = s(iT);
        if (i3 == 30) {
            J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVarS.f4878d.length), 2);
            int i6 = bVarC0.f1941h;
            int i7 = bVarC0.i;
            int i8 = bVarC0.f1942j;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!E4.k.a(obj, nVarS.f4878d[i6]) || !E4.k.a(obj2, nVarS.x(i6))) {
                        if (i6 == i7) {
                            nVarO = nVarS;
                            break;
                        }
                        i6 += i8;
                    } else {
                        nVarO = nVarS.k(i6, eVar);
                        break;
                    }
                }
            } else {
                nVarO = nVarS;
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            nVarO = nVarS.o(i, obj, obj2, i3 + 5, eVar2);
        }
        return q(nVarS, nVarO, iT, iA, eVar2.i);
    }

    public final n p(int i, int i3, e eVar) {
        eVar.b(eVar.f4864m - 1);
        eVar.f4862k = x(i);
        Object[] objArr = this.f4878d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4877c != eVar.i) {
            return new n(i3 ^ this.f4875a, this.f4876b, p020d2.n.j(objArr, i), eVar.i);
        }
        this.f4878d = p020d2.n.j(objArr, i);
        this.f4875a ^= i3;
        return this;
    }

    public final n q(n nVar, n nVar2, int i, int i3, U.b bVar) {
        U.b bVar2 = this.f4877c;
        if (nVar2 != null) {
            return (bVar2 == bVar || nVar != nVar2) ? r(i, nVar2, bVar) : this;
        }
        Object[] objArr = this.f4878d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new n(this.f4875a, this.f4876b ^ i3, p020d2.n.k(objArr, i), bVar);
        }
        this.f4878d = p020d2.n.k(objArr, i);
        this.f4876b ^= i3;
        return this;
    }

    public final n r(int i, n nVar, U.b bVar) {
        Object[] objArr = this.f4878d;
        if (objArr.length == 1 && nVar.f4878d.length == 2 && nVar.f4876b == 0) {
            nVar.f4875a = this.f4876b;
            return nVar;
        }
        if (this.f4877c == bVar) {
            objArr[i] = nVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        E4.k.e("copyOf(this, size)", objArrCopyOf);
        objArrCopyOf[i] = nVar;
        return new n(this.f4875a, this.f4876b, objArrCopyOf, bVar);
    }

    public final n s(int i) {
        Object obj = this.f4878d[i];
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>", obj);
        return (n) obj;
    }

    public final int t(int i) {
        return (this.f4878d.length - 1) - Integer.bitCount(this.f4876b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        r13.f2139c = w(r11, r4, (S.n) r13.f2139c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final K3.e u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S.n.u(int, int, java.lang.Object, java.lang.Object):K3.e");
    }

    public final n v(int i, U u6, int i3) {
        n nVarV;
        int iA = 1 << p020d2.n.A(i, i3);
        if (h(iA)) {
            int iF = f(iA);
            if (!E4.k.a(u6, this.f4878d[iF])) {
                return this;
            }
            Object[] objArr = this.f4878d;
            if (objArr.length != 2) {
                return new n(this.f4875a ^ iA, this.f4876b, p020d2.n.j(objArr, iF), null);
            }
        } else {
            if (!i(iA)) {
                return this;
            }
            int iT = t(iA);
            n nVarS = s(iT);
            if (i3 == 30) {
                J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, nVarS.f4878d.length), 2);
                int i6 = bVarC0.f1941h;
                int i7 = bVarC0.i;
                int i8 = bVarC0.f1942j;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!E4.k.a(u6, nVarS.f4878d[i6])) {
                            if (i6 == i7) {
                                nVarV = nVarS;
                                break;
                            }
                            i6 += i8;
                        } else {
                            Object[] objArr2 = nVarS.f4878d;
                            if (objArr2.length != 2) {
                                nVarV = new n(0, 0, p020d2.n.j(objArr2, i6), null);
                                break;
                            }
                            nVarV = null;
                            break;
                        }
                    }
                } else {
                    nVarV = nVarS;
                    break;
                }
            } else {
                nVarV = nVarS.v(i, u6, i3 + 5);
            }
            if (nVarV != null) {
                return nVarS != nVarV ? w(iT, iA, nVarV) : this;
            }
            Object[] objArr3 = this.f4878d;
            if (objArr3.length != 1) {
                return new n(this.f4875a, this.f4876b ^ iA, p020d2.n.k(objArr3, iT), null);
            }
        }
        return null;
    }

    public final n w(int i, int i3, n nVar) {
        Object[] objArr = nVar.f4878d;
        if (objArr.length != 2 || nVar.f4876b != 0) {
            Object[] objArr2 = this.f4878d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            E4.k.e("copyOf(this, newSize)", objArrCopyOf);
            objArrCopyOf[i] = nVar;
            return new n(this.f4875a, this.f4876b, objArrCopyOf, null);
        }
        if (this.f4878d.length == 1) {
            nVar.f4875a = this.f4876b;
            return nVar;
        }
        int iF = f(i3);
        Object[] objArr3 = this.f4878d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        E4.k.e("copyOf(this, newSize)", objArrCopyOf2);
        p089q4.k.e0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        p089q4.k.e0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new n(this.f4875a ^ i3, this.f4876b ^ i3, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.f4878d[i + 1];
    }
}
