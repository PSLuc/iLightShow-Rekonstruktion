package p092r1;

import D4.e;
import E4.u;
import G4.a;
import H1.d;
import N3.J0;
import P4.AbstractC0336x;
import P4.C0325l;
import P4.C0332t;
import P4.InterfaceC0335w;
import P4.T;
import P4.i0;
import R4.i;
import S1.V;
import S4.A;
import S4.InterfaceC0368e;
import java.util.List;
import p035g0.C0715p;
import p084p4.h;
import p084p4.m;
import p084p4.x;
import p089q4.l;
import p090r.C0870i;
import p090r.v;
import p103t1.f;
import p122w4.c;
import q5.n;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC0886g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f11595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0335w f11596c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f11600g;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f11602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f11603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f11604l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f11597d = new A(new C0896q(this, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X4.d f11598e = new X4.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0715p f11601h = new C0715p(20);

    public J(f fVar, List list, n nVar, InterfaceC0335w interfaceC0335w) {
        this.f11594a = fVar;
        this.f11595b = nVar;
        this.f11596c = interfaceC0335w;
        d dVar = new d();
        dVar.f1759k = this;
        dVar.i = new X4.d();
        C0325l c0325l = new C0325l(true);
        c0325l.O(null);
        dVar.f1757h = c0325l;
        dVar.f1758j = l.s0(list);
        this.i = dVar;
        this.f11602j = a.z(new C0891l(this, 1));
        this.f11603k = a.z(new C0891l(this, 0));
        v vVar = new v(2, this);
        G g6 = new G(this, null);
        d dVar2 = new d();
        dVar2.i = interfaceC0335w;
        dVar2.f1757h = g6;
        dVar2.f1758j = i.a(Integer.MAX_VALUE, 0, 6);
        dVar2.f1759k = new C0715p(19);
        T t6 = (T) interfaceC0335w.d().J(C0332t.i);
        if (t6 != null) {
            t6.Q(new C0870i(vVar, 1, dVar2));
        }
        this.f11604l = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(J j4, c cVar) {
        r rVar;
        X4.d dVar;
        j4.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.f11694o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.f11694o = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(j4, cVar);
            }
        } else {
            rVar = new r(j4, cVar);
        }
        Object obj = rVar.f11692m;
        v4.a aVar = v4.a.f13292h;
        int i3 = rVar.f11694o;
        if (i3 == 0) {
            V.O(obj);
            rVar.f11690k = j4;
            dVar = j4.f11598e;
            rVar.f11691l = dVar;
            rVar.f11694o = 1;
            if (dVar.c(rVar) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X4.d dVar2 = rVar.f11691l;
            J j6 = rVar.f11690k;
            V.O(obj);
            dVar = dVar2;
            j4 = j6;
        }
        try {
            int i6 = j4.f11599f - 1;
            j4.f11599f = i6;
            if (i6 == 0) {
                i0 i0Var = j4.f11600g;
                if (i0Var != null) {
                    i0Var.c(null);
                }
                j4.f11600g = null;
            }
            return x.f10867a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [D4.e, w4.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [D4.e, w4.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, r1.J] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [r1.J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(p092r1.J r9, p092r1.L r10, p122w4.c r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.J.c(r1.J, r1.L, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(J j4, c cVar) {
        C0899u c0899u;
        X4.d dVar;
        j4.getClass();
        if (cVar instanceof C0899u) {
            c0899u = (C0899u) cVar;
            int i = c0899u.f11707o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0899u.f11707o = i - Integer.MIN_VALUE;
            } else {
                c0899u = new C0899u(j4, cVar);
            }
        } else {
            c0899u = new C0899u(j4, cVar);
        }
        Object obj = c0899u.f11705m;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0899u.f11707o;
        if (i3 == 0) {
            V.O(obj);
            c0899u.f11703k = j4;
            dVar = j4.f11598e;
            c0899u.f11704l = dVar;
            c0899u.f11707o = 1;
            if (dVar.c(c0899u) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X4.d dVar2 = c0899u.f11704l;
            J j6 = c0899u.f11703k;
            V.O(obj);
            dVar = dVar2;
            j4 = j6;
        }
        try {
            int i6 = j4.f11599f + 1;
            j4.f11599f = i6;
            if (i6 == 1) {
                j4.f11600g = AbstractC0336x.o(j4.f11596c, null, new C0900v(j4, null), 3);
            }
            return x.f10867a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(J j4, boolean z5, p111u4.d dVar) {
        C0902x c0902x;
        J j6;
        U u6;
        J j7;
        h hVar;
        U u7;
        j4.getClass();
        if (dVar instanceof C0902x) {
            c0902x = (C0902x) dVar;
            int i = c0902x.f11720p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0902x.f11720p = i - Integer.MIN_VALUE;
            } else {
                c0902x = new C0902x(j4, dVar);
            }
        } else {
            c0902x = new C0902x(j4, dVar);
        }
        Object objC = c0902x.f11718n;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0902x.f11720p;
        if (i3 == 0) {
            V.O(objC);
            U uQ = j4.f11601h.q();
            if (uQ instanceof V) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            T tG = j4.g();
            c0902x.f11715k = j4;
            c0902x.f11716l = uQ;
            c0902x.f11717m = z5;
            c0902x.f11720p = 1;
            Integer numA = tG.a();
            if (numA != aVar) {
                j6 = j4;
                u6 = uQ;
                objC = numA;
            }
            return aVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                j7 = c0902x.f11715k;
                V.O(objC);
                hVar = (h) objC;
                u7 = (U) hVar.f10849h;
                if (((Boolean) hVar.i).booleanValue()) {
                    j7.f11601h.C(u7);
                }
                return u7;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c0902x.f11715k;
            V.O(objC);
            hVar = (h) objC;
            u7 = (U) hVar.f10849h;
            if (((Boolean) hVar.i).booleanValue()) {
                j7.f11601h.C(u7);
            }
            return u7;
        }
        z5 = c0902x.f11717m;
        u6 = c0902x.f11716l;
        j6 = c0902x.f11715k;
        V.O(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z6 = u6 instanceof C0881b;
        int i6 = z6 ? u6.f11632a : -1;
        if (z6 && iIntValue == i6) {
            return u6;
        }
        if (z5) {
            T tG2 = j6.g();
            y yVar = new y(j6, null);
            c0902x.f11715k = j6;
            c0902x.f11716l = null;
            c0902x.f11720p = 2;
            objC = tG2.b(yVar, c0902x);
            if (objC != aVar) {
                j7 = j6;
                hVar = (h) objC;
                u7 = (U) hVar.f10849h;
                if (((Boolean) hVar.i).booleanValue()) {
                    j7.f11601h.C(u7);
                }
                return u7;
            }
        } else {
            T tG3 = j6.g();
            z zVar = new z(j6, i6, null);
            c0902x.f11715k = j6;
            c0902x.f11716l = null;
            c0902x.f11720p = 3;
            objC = tG3.c(zVar, c0902x);
            if (objC != aVar) {
                j7 = j6;
                hVar = (h) objC;
                u7 = (U) hVar.f10849h;
                if (((Boolean) hVar.i).booleanValue()) {
                    j7.f11601h.C(u7);
                }
                return u7;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9 A[Catch: CorruptionException -> 0x00aa, TryCatch #0 {CorruptionException -> 0x00aa, blocks: (B:36:0x00a5, B:70:0x0142, B:41:0x00b3, B:67:0x0125, B:49:0x00d0, B:57:0x00e9, B:58:0x00ed, B:53:0x00d9, B:64:0x0113), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        if (r10 == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(p092r1.J r8, boolean r9, p122w4.c r10) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.J.f(r1.J, boolean, w4.c):java.lang.Object");
    }

    @Override // p092r1.InterfaceC0886g
    public final Object a(e eVar, c cVar) {
        X x6 = (X) cVar.e().J(W.f11634h);
        if (x6 != null) {
            x6.a(this);
        }
        return AbstractC0336x.v(new X(x6, this), new F(this, eVar, null), cVar);
    }

    public final T g() {
        return (T) this.f11603k.getValue();
    }

    @Override // p092r1.InterfaceC0886g
    public final InterfaceC0368e getData() {
        return this.f11597d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r2.n(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(p122w4.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p092r1.C0901w
            if (r0 == 0) goto L13
            r0 = r7
            r1.w r0 = (p092r1.C0901w) r0
            int r1 = r0.f11714o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11714o = r1
            goto L18
        L13:
            r1.w r0 = new r1.w
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f11712m
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f11714o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f11711l
            r1.J r0 = r0.f11710k
            S1.V.O(r7)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r7 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            r1.J r6 = r0.f11710k
            S1.V.O(r7)
            goto L50
        L3e:
            S1.V.O(r7)
            r1.T r7 = r6.g()
            r0.f11710k = r6
            r0.f11714o = r4
            java.lang.Integer r7 = r7.a()
            if (r7 != r1) goto L50
            goto L64
        L50:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            H1.d r2 = r6.i     // Catch: java.lang.Throwable -> L6d
            r0.f11710k = r6     // Catch: java.lang.Throwable -> L6d
            r0.f11711l = r7     // Catch: java.lang.Throwable -> L6d
            r0.f11714o = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r2.n(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            p4.x r6 = p084p4.x.f10867a
            return r6
        L68:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L6f
        L6d:
            r0 = move-exception
            goto L68
        L6f:
            g0.p r0 = r0.f11601h
            r1.M r1 = new r1.M
            r1.<init>(r7, r6)
            r0.C(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.J.h(w4.c):java.lang.Object");
    }

    public final Object i(c cVar) {
        return ((p103t1.i) this.f11602j.getValue()).a(new J0(3, null, 2), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z5, c cVar) {
        H h6;
        u uVar;
        if (cVar instanceof H) {
            h6 = (H) cVar;
            int i = h6.f11586n;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6.f11586n = i - Integer.MIN_VALUE;
            } else {
                h6 = new H(this, cVar);
            }
        } else {
            h6 = new H(this, cVar);
        }
        Object obj2 = h6.f11584l;
        v4.a aVar = v4.a.f13292h;
        int i3 = h6.f11586n;
        if (i3 == 0) {
            V.O(obj2);
            u uVar2 = new u();
            p103t1.i iVar = (p103t1.i) this.f11602j.getValue();
            I i6 = new I(uVar2, this, obj, z5, null);
            h6.f11583k = uVar2;
            h6.f11586n = 1;
            if (iVar.b(i6, h6) == aVar) {
                return aVar;
            }
            uVar = uVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = h6.f11583k;
            V.O(obj2);
        }
        return new Integer(uVar.f1072h);
    }
}
