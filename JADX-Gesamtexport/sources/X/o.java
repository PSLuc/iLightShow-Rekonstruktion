package X;

import B.C0031p0;
import F.C0068j;
import N.C0210e;
import N.Z0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0031p0 f5708a = new C0031p0(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5709b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m f5710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f5711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f5712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0068j f5713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object f5714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f5715h;
    public static final AtomicReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC0391h f5716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0210e f5717k;

    static {
        m mVar = m.f5702l;
        f5710c = mVar;
        f5711d = 2;
        k kVar = new k();
        kVar.f5692b = new int[16];
        kVar.f5693c = new int[16];
        int[] iArr = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i6 = i3 + 1;
            iArr[i3] = i6;
            i3 = i6;
        }
        kVar.f5694d = iArr;
        f5712e = kVar;
        C0068j c0068j = new C0068j(3);
        c0068j.f1183c = new int[16];
        c0068j.f1184d = new Z0[16];
        f5713f = c0068j;
        p089q4.u uVar = p089q4.u.f11237h;
        f5714g = uVar;
        f5715h = uVar;
        int i7 = f5711d;
        f5711d = i7 + 1;
        C0386c c0386c = new C0386c(i7, mVar);
        f5710c = f5710c.k(c0386c.f5686b);
        AtomicReference atomicReference = new AtomicReference(c0386c);
        i = atomicReference;
        f5716j = (AbstractC0391h) atomicReference.get();
        f5717k = new C0210e(0);
    }

    public static final void a() {
        f(n.i);
    }

    public static final D4.c b(D4.c cVar, D4.c cVar2) {
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new C0385b(cVar, cVar2, 2);
    }

    public static final HashMap c(C0387d c0387d, C0387d c0387d2, m mVar) {
        long[] jArr;
        int i3;
        m mVar2;
        long[] jArr2;
        int i6;
        p080p.A aW = c0387d2.w();
        int iD = c0387d.d();
        if (aW != null) {
            m mVarJ = c0387d2.e().k(c0387d2.d()).j(c0387d2.f5675j);
            Object[] objArr = aW.f10709b;
            long[] jArr3 = aW.f10708a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i7];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((255 & j4) < 128) {
                                B b6 = (B) objArr[(i7 << 3) + i10];
                                D dC = b6.c();
                                i6 = i8;
                                D dS = s(dC, iD, mVar);
                                if (dS == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    D dS2 = s(dC, iD, mVarJ);
                                    if (dS2 != null && !dS.equals(dS2)) {
                                        D dS3 = s(dC, c0387d2.d(), c0387d2.e());
                                        if (dS3 == null) {
                                            r();
                                            throw null;
                                        }
                                        D dG = b6.g(dS2, dS, dS3);
                                        if (dG == null) {
                                            return null;
                                        }
                                        if (map == null) {
                                            map = new HashMap();
                                        }
                                        map.put(dS, dG);
                                        map = map;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                i6 = i8;
                            }
                            j4 >>= i6;
                            i10++;
                            i8 = i6;
                            jArr3 = jArr2;
                            iD = iD;
                            mVarJ = mVarJ;
                        }
                        jArr = jArr3;
                        i3 = iD;
                        mVar2 = mVarJ;
                        if (i9 != i8) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = iD;
                        mVar2 = mVarJ;
                    }
                    if (i7 == length) {
                        return map;
                    }
                    i7++;
                    jArr3 = jArr;
                    iD = i3;
                    mVarJ = mVar2;
                }
            }
        }
        return null;
    }

    public static final void d(AbstractC0391h abstractC0391h) {
        int i3;
        if (f5710c.i(abstractC0391h.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(abstractC0391h.d());
        sb.append(", disposed=");
        sb.append(abstractC0391h.f5687c);
        sb.append(", applied=");
        C0387d c0387d = abstractC0391h instanceof C0387d ? (C0387d) abstractC0391h : null;
        sb.append(c0387d != null ? Boolean.valueOf(c0387d.f5678m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f5709b) {
            k kVar = f5712e;
            i3 = kVar.f5691a > 0 ? kVar.f5692b[0] : -1;
        }
        sb.append(i3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final m e(m mVar, int i3, int i6) {
        while (i3 < i6) {
            mVar = mVar.k(i3);
            i3++;
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[LOOP:1: B:30:0x0069->B:43:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[EDGE_INSN: B:58:0x00a6->B:44:0x00a6 BREAK  A[LOOP:1: B:30:0x0069->B:43:0x00a3], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(D4.c cVar) {
        Object obj;
        p080p.A a6;
        Object objV;
        AbstractC0391h abstractC0391h = f5716j;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot", abstractC0391h);
        synchronized (f5709b) {
            try {
                obj = i.get();
                a6 = ((C0386c) obj).f5674h;
                if (a6 != null) {
                    f5717k.addAndGet(1);
                }
                objV = v((AbstractC0391h) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a6 != null) {
            try {
                ?? r6 = f5714g;
                int size = r6.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((D4.e) r6.get(i3)).d(new P.f(a6), obj);
                }
                f5717k.addAndGet(-1);
            } catch (Throwable th2) {
                f5717k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f5709b) {
            g();
            if (a6 != null) {
                Object[] objArr = a6.f10709b;
                long[] jArr = a6.f10708a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j4 = jArr[i6];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i6 != length) {
                                break;
                                break;
                            }
                            i6++;
                        } else {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j4) < 128) {
                                    q((B) objArr[(i6 << 3) + i8]);
                                }
                                j4 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                            if (i6 != length) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void g() {
        C0068j c0068j = f5713f;
        int i3 = c0068j.f1182b;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            Z0 z5 = ((Z0[]) c0068j.f1184d)[i6];
            Object obj = z5 != null ? z5.get() : null;
            if (obj != null && p((B) obj)) {
                if (i7 != i6) {
                    ((Z0[]) c0068j.f1184d)[i7] = z5;
                    int[] iArr = (int[]) c0068j.f1183c;
                    iArr[i7] = iArr[i6];
                }
                i7++;
            }
            i6++;
        }
        for (int i8 = i7; i8 < i3; i8++) {
            ((Z0[]) c0068j.f1184d)[i8] = null;
            ((int[]) c0068j.f1183c)[i8] = 0;
        }
        if (i7 != i3) {
            c0068j.f1182b = i7;
        }
    }

    public static final AbstractC0391h h(AbstractC0391h abstractC0391h, D4.c cVar, boolean z5) {
        boolean z6 = abstractC0391h instanceof C0387d;
        if (z6 || abstractC0391h == null) {
            return new G(z6 ? (C0387d) abstractC0391h : null, cVar, null, false, z5);
        }
        return new H(abstractC0391h, cVar, z5);
    }

    public static final D i(D d6) {
        D dS;
        AbstractC0391h abstractC0391hK = k();
        D dS2 = s(d6, abstractC0391hK.d(), abstractC0391hK.e());
        if (dS2 != null) {
            return dS2;
        }
        synchronized (f5709b) {
            AbstractC0391h abstractC0391hK2 = k();
            dS = s(d6, abstractC0391hK2.d(), abstractC0391hK2.e());
        }
        if (dS != null) {
            return dS;
        }
        r();
        throw null;
    }

    public static final D j(D d6, AbstractC0391h abstractC0391h) {
        D dS = s(d6, abstractC0391h.d(), abstractC0391h.e());
        if (dS != null) {
            return dS;
        }
        r();
        throw null;
    }

    public static final AbstractC0391h k() {
        AbstractC0391h abstractC0391h = (AbstractC0391h) f5708a.get();
        return abstractC0391h == null ? (AbstractC0391h) i.get() : abstractC0391h;
    }

    public static final D4.c l(D4.c cVar, D4.c cVar2, boolean z5) {
        if (!z5) {
            cVar2 = null;
        }
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new C0385b(cVar, cVar2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053 A[EDGE_INSN: B:31:0x0053->B:33:0x0058 BREAK  A[LOOP:0: B:6:0x0015->B:32:0x0055]] */
    /* JADX WARN: Code duplicated, block: B:41:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.D m(X.D r12, X.B r13) {
        /*
            X.D r0 = r13.c()
            int r1 = X.o.f5711d
            X.k r2 = X.o.f5712e
            int r3 = r2.f5691a
            r4 = 0
            if (r3 <= 0) goto L11
            int[] r1 = r2.f5692b
            r1 = r1[r4]
        L11:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L15:
            if (r0 == 0) goto L58
            int r6 = r0.f5650a
            if (r6 != 0) goto L1c
            goto L51
        L1c:
            if (r6 == 0) goto L55
            if (r6 > r1) goto L55
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L36
            if (r6 >= r11) goto L36
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L34
        L32:
            r6 = r2
            goto L45
        L34:
            r6 = r4
            goto L45
        L36:
            if (r6 < r11) goto L34
            r11 = 128(0x80, float:1.8E-43)
            if (r6 >= r11) goto L34
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L34
            goto L32
        L45:
            if (r6 != 0) goto L55
            if (r5 != 0) goto L4b
            r5 = r0
            goto L55
        L4b:
            int r1 = r0.f5650a
            int r2 = r5.f5650a
            if (r1 >= r2) goto L53
        L51:
            r3 = r0
            goto L58
        L53:
            r3 = r5
            goto L58
        L55:
            X.D r0 = r0.f5651b
            goto L15
        L58:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L60
            r3.f5650a = r0
            return r3
        L60:
            X.D r12 = r12.b()
            r12.f5650a = r0
            X.D r0 = r13.c()
            r12.f5651b = r0
            r13.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.o.m(X.D, X.B):X.D");
    }

    public static final void n(AbstractC0391h abstractC0391h, B b6) {
        abstractC0391h.s(abstractC0391h.h() + 1);
        D4.c cVarI = abstractC0391h.i();
        if (cVarI != null) {
            cVarI.invoke(b6);
        }
    }

    public static final D o(D d6, C c6, AbstractC0391h abstractC0391h, D d7) {
        D dM;
        if (abstractC0391h.g()) {
            abstractC0391h.n(c6);
        }
        int iD = abstractC0391h.d();
        if (d7.f5650a == iD) {
            return d7;
        }
        synchronized (f5709b) {
            dM = m(d6, c6);
        }
        dM.f5650a = iD;
        if (d7.f5650a != 1) {
            abstractC0391h.n(c6);
        }
        return dM;
    }

    public static final boolean p(B b6) {
        D d6;
        int i3 = f5711d;
        k kVar = f5712e;
        if (kVar.f5691a > 0) {
            i3 = kVar.f5692b[0];
        }
        D d7 = null;
        D dC = null;
        int i6 = 0;
        for (D dC2 = b6.c(); dC2 != null; dC2 = dC2.f5651b) {
            int i7 = dC2.f5650a;
            if (i7 != 0) {
                if (i7 >= i3) {
                    i6++;
                } else if (d7 == null) {
                    i6++;
                    d7 = dC2;
                } else {
                    if (i7 < d7.f5650a) {
                        d6 = d7;
                        d7 = dC2;
                    } else {
                        d6 = dC2;
                    }
                    if (dC == null) {
                        dC = b6.c();
                        D d8 = dC;
                        while (true) {
                            if (dC == null) {
                                dC = d8;
                                break;
                            }
                            int i8 = dC.f5650a;
                            if (i8 >= i3) {
                                break;
                            }
                            if (d8.f5650a < i8) {
                                d8 = dC;
                            }
                            dC = dC.f5651b;
                        }
                    }
                    d7.f5650a = 0;
                    d7.a(dC);
                    d7 = d6;
                }
            }
        }
        return i6 > 1;
    }

    public static final void q(B b6) {
        if (p(b6)) {
            C0068j c0068j = f5713f;
            int i3 = c0068j.f1182b;
            int iIdentityHashCode = System.identityHashCode(b6);
            int i6 = -1;
            if (i3 > 0) {
                int i7 = c0068j.f1182b - 1;
                int i8 = 0;
                while (true) {
                    if (i8 > i7) {
                        i6 = -(i8 + 1);
                        break;
                    }
                    int i9 = (i8 + i7) >>> 1;
                    int i10 = ((int[]) c0068j.f1183c)[i9];
                    if (i10 < iIdentityHashCode) {
                        i8 = i9 + 1;
                    } else if (i10 > iIdentityHashCode) {
                        i7 = i9 - 1;
                    } else {
                        Z0 z5 = ((Z0[]) c0068j.f1184d)[i9];
                        if (b6 == (z5 != null ? z5.get() : null)) {
                            i6 = i9;
                            break;
                        }
                        int i11 = i9 - 1;
                        while (true) {
                            if (-1 >= i11 || ((int[]) c0068j.f1183c)[i11] != iIdentityHashCode) {
                                i9++;
                                int i12 = c0068j.f1182b;
                                while (true) {
                                    if (i9 >= i12) {
                                        i6 = -(c0068j.f1182b + 1);
                                        break;
                                    }
                                    if (((int[]) c0068j.f1183c)[i9] != iIdentityHashCode) {
                                        i6 = -(i9 + 1);
                                        break;
                                    }
                                    Z0 z6 = ((Z0[]) c0068j.f1184d)[i9];
                                    if ((z6 != null ? z6.get() : null) == b6) {
                                        i6 = i9;
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                Z0 z7 = ((Z0[]) c0068j.f1184d)[i11];
                                if ((z7 != null ? z7.get() : null) == b6) {
                                    i6 = i11;
                                    break;
                                }
                                i11--;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    return;
                }
            }
            int i13 = -(i6 + 1);
            Z0[] z0Arr = (Z0[]) c0068j.f1184d;
            int length = z0Arr.length;
            if (i3 == length) {
                int i14 = length * 2;
                Z0[] z0Arr2 = new Z0[i14];
                int[] iArr = new int[i14];
                int i15 = i13 + 1;
                p089q4.k.e0(z0Arr, z0Arr2, i15, i13, i3);
                p089q4.k.g0((Z0[]) c0068j.f1184d, z0Arr2, 0, i13, 6);
                p089q4.k.c0(i15, i13, i3, (int[]) c0068j.f1183c, iArr);
                p089q4.k.f0(0, i13, 6, (int[]) c0068j.f1183c, iArr);
                c0068j.f1184d = z0Arr2;
                c0068j.f1183c = iArr;
            } else {
                int i16 = i13 + 1;
                p089q4.k.e0(z0Arr, z0Arr, i16, i13, i3);
                int[] iArr2 = (int[]) c0068j.f1183c;
                p089q4.k.c0(i16, i13, i3, iArr2, iArr2);
            }
            ((Z0[]) c0068j.f1184d)[i13] = new Z0(b6);
            ((int[]) c0068j.f1183c)[i13] = iIdentityHashCode;
            c0068j.f1182b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final D s(D d6, int i3, m mVar) {
        D d7 = null;
        while (d6 != null) {
            int i6 = d6.f5650a;
            if (i6 != 0 && i6 <= i3 && !mVar.i(i6) && (d7 == null || d7.f5650a < d6.f5650a)) {
                d7 = d6;
            }
            d6 = d6.f5651b;
        }
        if (d7 != null) {
            return d7;
        }
        return null;
    }

    public static final D t(D d6, B b6) {
        D dS;
        AbstractC0391h abstractC0391hK = k();
        D4.c cVarF = abstractC0391hK.f();
        if (cVarF != null) {
            cVarF.invoke(b6);
        }
        D dS2 = s(d6, abstractC0391hK.d(), abstractC0391hK.e());
        if (dS2 != null) {
            return dS2;
        }
        synchronized (f5709b) {
            AbstractC0391h abstractC0391hK2 = k();
            D dC = b6.c();
            E4.k.d("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9", dC);
            dS = s(dC, abstractC0391hK2.d(), abstractC0391hK2.e());
            if (dS == null) {
                r();
                throw null;
            }
        }
        return dS;
    }

    public static final void u(int i3) {
        int i6;
        k kVar = f5712e;
        int i7 = kVar.f5694d[i3];
        kVar.b(i7, kVar.f5691a - 1);
        kVar.f5691a--;
        int[] iArr = kVar.f5692b;
        int i8 = iArr[i7];
        int i9 = i7;
        while (i9 > 0) {
            int i10 = ((i9 + 1) >> 1) - 1;
            if (iArr[i10] <= i8) {
                break;
            }
            kVar.b(i10, i9);
            i9 = i10;
        }
        int[] iArr2 = kVar.f5692b;
        int i11 = kVar.f5691a >> 1;
        while (i7 < i11) {
            int i12 = (i7 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < kVar.f5691a && (i6 = iArr2[i12]) < iArr2[i13]) {
                if (i6 >= iArr2[i7]) {
                    break;
                }
                kVar.b(i12, i7);
                i7 = i12;
            } else {
                if (iArr2[i13] >= iArr2[i7]) {
                    break;
                }
                kVar.b(i13, i7);
                i7 = i13;
            }
        }
        kVar.f5694d[i3] = kVar.f5695e;
        kVar.f5695e = i3;
    }

    public static final Object v(AbstractC0391h abstractC0391h, D4.c cVar) {
        Object objInvoke = cVar.invoke(f5710c.g(abstractC0391h.d()));
        synchronized (f5709b) {
            int i3 = f5711d;
            f5711d = i3 + 1;
            m mVarG = f5710c.g(abstractC0391h.d());
            f5710c = mVarG;
            i.set(new C0386c(i3, mVarG));
            abstractC0391h.c();
            f5710c = f5710c.k(i3);
        }
        return objInvoke;
    }

    public static final D w(D d6, B b6, AbstractC0391h abstractC0391h) {
        D dS;
        if (abstractC0391h.g()) {
            abstractC0391h.n(b6);
        }
        int iD = abstractC0391h.d();
        D dS2 = s(d6, iD, abstractC0391h.e());
        if (dS2 == null) {
            r();
            throw null;
        }
        if (dS2.f5650a == abstractC0391h.d()) {
            return dS2;
        }
        synchronized (f5709b) {
            dS = s(b6.c(), iD, abstractC0391h.e());
            if (dS == null) {
                r();
                throw null;
            }
            if (dS.f5650a != iD) {
                D dM = m(dS, b6);
                dM.a(dS);
                dM.f5650a = abstractC0391h.d();
                dS = dM;
            }
        }
        if (dS2.f5650a != 1) {
            abstractC0391h.n(b6);
        }
        return dS;
    }
}
