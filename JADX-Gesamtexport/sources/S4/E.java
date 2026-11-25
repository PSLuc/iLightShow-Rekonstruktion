package S4;

import O1.C0308a;
import P4.C0319f;
import java.util.Arrays;
import p015c2.AbstractC0473d;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public class E extends T4.a implements x, InterfaceC0368e, T4.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object[] f5028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5032s;

    public E(int i, int i3, int i6) {
        this.f5025l = i;
        this.f5026m = i3;
        this.f5027n = i6;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x007a, B:34:0x0082, B:38:0x0095, B:41:0x009c, B:42:0x00a0, B:43:0x00a1, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x007a, B:34:0x0082, B:38:0x0095, B:41:0x009c, B:42:0x00a0, B:43:0x00a1, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [S4.f] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [T4.a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [S4.E] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [S4.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [T4.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [S4.G] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [S4.G] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0093
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void j(S4.E r8, S4.InterfaceC0369f r9, p111u4.d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof S4.D
            if (r0 == 0) goto L13
            r0 = r10
            S4.D r0 = (S4.D) r0
            int r1 = r0.f5024q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5024q = r1
            goto L18
        L13:
            S4.D r0 = new S4.D
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5022o
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f5024q
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            P4.T r8 = r0.f5021n
            S4.G r9 = r0.f5020m
            S4.f r2 = r0.f5019l
            S4.E r5 = r0.f5018k
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb5
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            P4.T r8 = r0.f5021n
            S4.G r9 = r0.f5020m
            S4.f r2 = r0.f5019l
            S4.E r5 = r0.f5018k
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            S4.G r9 = r0.f5020m
            S4.f r8 = r0.f5019l
            S4.E r2 = r0.f5018k
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb5
        L5e:
            S1.V.O(r10)
            T4.c r10 = r8.c()
            S4.G r10 = (S4.G) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            u4.i r2 = r0.i     // Catch: java.lang.Throwable -> Lb2
            E4.k.c(r2)     // Catch: java.lang.Throwable -> Lb2
            P4.t r5 = P4.C0332t.i     // Catch: java.lang.Throwable -> Lb2
            u4.g r2 = r2.J(r5)     // Catch: java.lang.Throwable -> Lb2
            P4.T r2 = (P4.T) r2     // Catch: java.lang.Throwable -> Lb2
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            O1.a r6 = S4.F.f5033a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f5018k = r5     // Catch: java.lang.Throwable -> L38
            r0.f5019l = r2     // Catch: java.lang.Throwable -> L38
            r0.f5020m = r9     // Catch: java.lang.Throwable -> L38
            r0.f5021n = r8     // Catch: java.lang.Throwable -> L38
            r0.f5024q = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.h(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            goto Lb1
        L93:
            if (r8 == 0) goto La1
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.G()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La1:
            r0.f5018k = r5     // Catch: java.lang.Throwable -> L38
            r0.f5019l = r2     // Catch: java.lang.Throwable -> L38
            r0.f5020m = r9     // Catch: java.lang.Throwable -> L38
            r0.f5021n = r8     // Catch: java.lang.Throwable -> L38
            r0.f5024q = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.m(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb1:
            return
        Lb2:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb5:
            r5.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.E.j(S4.E, S4.f, u4.d):void");
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        j(this, interfaceC0369f, dVar);
        return v4.a.f13292h;
    }

    @Override // T4.o
    public final InterfaceC0368e b(p111u4.i iVar, int i, int i3) {
        return F.j(this, iVar, i, i3);
    }

    @Override // T4.a
    public final T4.c d() {
        G g6 = new G();
        g6.f5036a = -1L;
        return g6;
    }

    @Override // T4.a
    public final T4.c[] e() {
        return new G[2];
    }

    public final Object h(G g6, D d6) {
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(d6));
        c0319f.u();
        synchronized (this) {
            if (s(g6) < 0) {
                g6.f5037b = c0319f;
            } else {
                c0319f.g(p084p4.x.f10867a);
            }
        }
        Object objT = c0319f.t();
        return objT == v4.a.f13292h ? objT : p084p4.x.f10867a;
    }

    public final void i() {
        if (this.f5026m != 0 || this.f5032s > 1) {
            Object[] objArr = this.f5028o;
            E4.k.c(objArr);
            while (this.f5032s > 0) {
                long jO = o();
                int i = this.f5031r;
                int i3 = this.f5032s;
                if (objArr[((int) ((jO + ((long) (i + i3))) - 1)) & (objArr.length - 1)] != F.f5033a) {
                    return;
                }
                this.f5032s = i3 - 1;
                F.d(objArr, o() + ((long) (this.f5031r + this.f5032s)), null);
            }
        }
    }

    public final void k() {
        T4.c[] cVarArr;
        Object[] objArr = this.f5028o;
        E4.k.c(objArr);
        F.d(objArr, o(), null);
        this.f5031r--;
        long jO = o() + 1;
        if (this.f5029p < jO) {
            this.f5029p = jO;
        }
        if (this.f5030q < jO) {
            if (this.i != 0 && (cVarArr = this.f5254h) != null) {
                for (T4.c cVar : cVarArr) {
                    if (cVar != null) {
                        G g6 = (G) cVar;
                        long j4 = g6.f5036a;
                        if (j4 >= 0 && j4 < jO) {
                            g6.f5036a = jO;
                        }
                    }
                }
            }
            this.f5030q = jO;
        }
    }

    public final void l(Object obj) {
        int i = this.f5031r + this.f5032s;
        Object[] objArrP = this.f5028o;
        if (objArrP == null) {
            objArrP = p(0, 2, null);
        } else if (i >= objArrP.length) {
            objArrP = p(i, objArrP.length * 2, objArrP);
        }
        F.d(objArrP, o() + ((long) i), obj);
    }

    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        E e6;
        Throwable th;
        p111u4.d[] dVarArrN;
        C c6;
        if (q(obj)) {
            return p084p4.x.f10867a;
        }
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(dVar));
        c0319f.u();
        p111u4.d[] dVarArrN2 = T4.b.f5257a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        c0319f.g(p084p4.x.f10867a);
                        dVarArrN = n(dVarArrN2);
                        c6 = null;
                        e6 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        e6 = this;
                        throw th;
                    }
                } else {
                    try {
                        e6 = this;
                        try {
                            C c7 = new C(e6, o() + ((long) (this.f5031r + this.f5032s)), obj, c0319f);
                            e6.l(c7);
                            e6.f5032s++;
                            if (e6.f5026m == 0) {
                                dVarArrN2 = e6.n(dVarArrN2);
                            }
                            dVarArrN = dVarArrN2;
                            c6 = c7;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        e6 = this;
                        th = th4;
                        throw th;
                    }
                }
                if (c6 != null) {
                    c0319f.w(new P4.F(0, c6));
                }
                for (p111u4.d dVar2 : dVarArrN) {
                    if (dVar2 != null) {
                        dVar2.g(p084p4.x.f10867a);
                    }
                }
                Object objT = c0319f.t();
                v4.a aVar = v4.a.f13292h;
                if (objT != aVar) {
                    objT = p084p4.x.f10867a;
                }
                return objT == aVar ? objT : p084p4.x.f10867a;
            } catch (Throwable th5) {
                th = th5;
                e6 = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [u4.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p111u4.d[] n(p111u4.d[] dVarArr) {
        T4.c[] cVarArr;
        G g6;
        C0319f c0319f;
        int length = dVarArr.length;
        if (this.i != 0 && (cVarArr = this.f5254h) != null) {
            int length2 = cVarArr.length;
            int i = 0;
            dVarArr = dVarArr;
            while (i < length2) {
                T4.c cVar = cVarArr[i];
                if (cVar != null && (c0319f = (g6 = (G) cVar).f5037b) != null && s(g6) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        E4.k.e("copyOf(this, newSize)", objArrCopyOf);
                        dVarArr = objArrCopyOf;
                    }
                    ((p111u4.d[]) dVarArr)[length] = c0319f;
                    g6.f5037b = null;
                    length++;
                }
                i++;
                dVarArr = dVarArr;
            }
        }
        return (p111u4.d[]) dVarArr;
    }

    public final long o() {
        return Math.min(this.f5030q, this.f5029p);
    }

    public final Object[] p(int i, int i3, Object[] objArr) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i3];
        this.f5028o = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i6 = 0; i6 < i; i6++) {
                long j4 = ((long) i6) + jO;
                F.d(objArr2, j4, objArr[((int) j4) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z5;
        p111u4.d[] dVarArrN = T4.b.f5257a;
        synchronized (this) {
            if (r(obj)) {
                dVarArrN = n(dVarArrN);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (p111u4.d dVar : dVarArrN) {
            if (dVar != null) {
                dVar.g(p084p4.x.f10867a);
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    public final boolean r(Object obj) {
        int i;
        long jO;
        long j4;
        int i3 = this.i;
        int i6 = this.f5025l;
        if (i3 != 0) {
            int i7 = this.f5031r;
            int i8 = this.f5026m;
            if (i7 < i8 || this.f5030q > this.f5029p) {
                l(obj);
                i = this.f5031r + 1;
                this.f5031r = i;
                if (i > i8) {
                    k();
                }
                jO = o() + ((long) this.f5031r);
                j4 = this.f5029p;
                if (((int) (jO - j4)) > i6) {
                    u(1 + j4, this.f5030q, o() + ((long) this.f5031r), o() + ((long) this.f5031r) + ((long) this.f5032s));
                }
            } else {
                int iD = AbstractC0916i.d(this.f5027n);
                if (iD == 0) {
                    return false;
                }
                if (iD != 2) {
                    l(obj);
                    i = this.f5031r + 1;
                    this.f5031r = i;
                    if (i > i8) {
                        k();
                    }
                    jO = o() + ((long) this.f5031r);
                    j4 = this.f5029p;
                    if (((int) (jO - j4)) > i6) {
                        u(1 + j4, this.f5030q, o() + ((long) this.f5031r), o() + ((long) this.f5031r) + ((long) this.f5032s));
                    }
                }
            }
        } else if (i6 != 0) {
            l(obj);
            int i9 = this.f5031r + 1;
            this.f5031r = i9;
            if (i9 > i6) {
                k();
            }
            this.f5030q = o() + ((long) this.f5031r);
            return true;
        }
        return true;
    }

    public final long s(G g6) {
        long j4 = g6.f5036a;
        if (j4 >= o() + ((long) this.f5031r) && (this.f5026m > 0 || j4 > o() || this.f5032s == 0)) {
            return -1L;
        }
        return j4;
    }

    public final Object t(G g6) {
        Object obj;
        p111u4.d[] dVarArrV = T4.b.f5257a;
        synchronized (this) {
            try {
                long jS = s(g6);
                if (jS < 0) {
                    obj = F.f5033a;
                } else {
                    long j4 = g6.f5036a;
                    Object[] objArr = this.f5028o;
                    E4.k.c(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof C) {
                        obj2 = ((C) obj2).f5016j;
                    }
                    g6.f5036a = jS + 1;
                    Object obj3 = obj2;
                    dVarArrV = v(j4);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p111u4.d dVar : dVarArrV) {
            if (dVar != null) {
                dVar.g(p084p4.x.f10867a);
            }
        }
        return obj;
    }

    public final void u(long j4, long j6, long j7, long j8) {
        long jMin = Math.min(j6, j4);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f5028o;
            E4.k.c(objArr);
            F.d(objArr, jO, null);
        }
        this.f5029p = j4;
        this.f5030q = j6;
        this.f5031r = (int) (j7 - jMin);
        this.f5032s = (int) (j8 - j7);
    }

    public final p111u4.d[] v(long j4) {
        long j6;
        long j7;
        long j8;
        p111u4.d[] dVarArr;
        T4.c[] cVarArr;
        long j9 = this.f5030q;
        p111u4.d[] dVarArr2 = T4.b.f5257a;
        if (j4 <= j9) {
            long jO = o();
            long j10 = ((long) this.f5031r) + jO;
            int i = this.f5026m;
            if (i == 0 && this.f5032s > 0) {
                j10++;
            }
            int i3 = 0;
            if (this.i != 0 && (cVarArr = this.f5254h) != null) {
                for (T4.c cVar : cVarArr) {
                    if (cVar != null) {
                        long j11 = ((G) cVar).f5036a;
                        if (j11 >= 0 && j11 < j10) {
                            j10 = j11;
                        }
                    }
                }
            }
            if (j10 > this.f5030q) {
                long jO2 = o() + ((long) this.f5031r);
                int iMin = this.i > 0 ? Math.min(this.f5032s, i - ((int) (jO2 - j10))) : this.f5032s;
                long j12 = ((long) this.f5032s) + jO2;
                C0308a c0308a = F.f5033a;
                if (iMin > 0) {
                    p111u4.d[] dVarArr3 = new p111u4.d[iMin];
                    j8 = 1;
                    Object[] objArr = this.f5028o;
                    E4.k.c(objArr);
                    long j13 = jO2;
                    while (true) {
                        if (jO2 >= j12) {
                            j6 = jO;
                            j7 = j10;
                            break;
                        }
                        j6 = jO;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != c0308a) {
                            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter", obj);
                            C c6 = (C) obj;
                            int i6 = i3 + 1;
                            j7 = j10;
                            dVarArr3[i3] = c6.f5017k;
                            F.d(objArr, jO2, c0308a);
                            F.d(objArr, j13, c6.f5016j);
                            j13++;
                            if (i6 >= iMin) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            j7 = j10;
                        }
                        jO2++;
                        jO = j6;
                        j10 = j7;
                    }
                    jO2 = j13;
                    dVarArr = dVarArr3;
                } else {
                    j6 = jO;
                    j7 = j10;
                    j8 = 1;
                    dVarArr = dVarArr2;
                }
                int i7 = (int) (jO2 - j6);
                long j14 = this.i == 0 ? jO2 : j7;
                long jMax = Math.max(this.f5029p, jO2 - ((long) Math.min(this.f5025l, i7)));
                if (i == 0 && jMax < j12) {
                    Object[] objArr2 = this.f5028o;
                    E4.k.c(objArr2);
                    if (E4.k.a(objArr2[((int) jMax) & (objArr2.length - 1)], c0308a)) {
                        jO2 += j8;
                        jMax += j8;
                    }
                }
                u(jMax, j14, jO2, j12);
                i();
                return dVarArr.length == 0 ? dVarArr : n(dVarArr);
            }
        }
        return dVarArr2;
    }
}
