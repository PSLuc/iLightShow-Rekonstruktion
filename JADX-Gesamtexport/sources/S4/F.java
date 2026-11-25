package S4;

import B.AbstractC0013g0;
import D.C0052b;
import O1.C0308a;
import P4.AbstractC0314a;
import P4.AbstractC0336x;
import P4.c0;
import P4.i0;
import S1.V;
import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0308a f5033a = new C0308a("NO_VALUE", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0308a f5034b = new C0308a("NONE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0308a f5035c = new C0308a("PENDING", 1);

    public static E a(int i, int i3) {
        int i6 = (i3 & 1) != 0 ? 0 : 1;
        int i7 = (i3 & 2) == 0 ? 16 : 0;
        if (i6 < 0) {
            throw new IllegalArgumentException(p012c.k.r(i6, "replay cannot be negative, but was ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(p012c.k.r(i7, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i6 <= 0 && i7 <= 0 && i != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(AbstractC0013g0.v(i)).toString());
        }
        int i8 = i7 + i6;
        if (i8 < 0) {
            i8 = Integer.MAX_VALUE;
        }
        return new E(i6, i8, i);
    }

    public static final P b(Object obj) {
        if (obj == null) {
            obj = T4.b.f5258b;
        }
        return new P(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(S s6, D4.f fVar, Throwable th, p122w4.c cVar) throws IllegalAccessException, InvocationTargetException {
        C0371h c0371h;
        if (cVar instanceof C0371h) {
            c0371h = (C0371h) cVar;
            int i = c0371h.f5080m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0371h.f5080m = i - Integer.MIN_VALUE;
            } else {
                c0371h = new C0371h(cVar);
            }
        } else {
            c0371h = new C0371h(cVar);
        }
        Object obj = c0371h.f5079l;
        Object obj2 = v4.a.f13292h;
        int i3 = c0371h.f5080m;
        try {
            if (i3 == 0) {
                V.O(obj);
                c0371h.f5078k = th;
                c0371h.f5080m = 1;
                if (fVar.c(s6, th, c0371h) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c0371h.f5078k;
                V.O(obj);
            }
            return p084p4.x.f10867a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                p081p0.c.D(th2, th);
            }
            throw th2;
        }
    }

    public static final void d(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0368e e(InterfaceC0368e interfaceC0368e, int i) {
        int i3;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(p012c.k.r(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            i3 = 2;
            i = 0;
        } else {
            i3 = 1;
        }
        boolean z5 = interfaceC0368e instanceof T4.o;
        p111u4.j jVar = p111u4.j.f12751h;
        return z5 ? ((T4.o) interfaceC0368e).b(jVar, i, i3) : new T4.i(interfaceC0368e, jVar, i, i3);
    }

    public static final InterfaceC0368e f(InterfaceC0368e interfaceC0368e) {
        if (interfaceC0368e instanceof N) {
            return interfaceC0368e;
        }
        if (!(interfaceC0368e instanceof C0367d)) {
            return new C0367d(interfaceC0368e);
        }
        ((C0367d) interfaceC0368e).getClass();
        return interfaceC0368e;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.m(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(S4.InterfaceC0369f r7, R4.n r8, boolean r9, p111u4.d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof S4.C0370g
            if (r0 == 0) goto L13
            r0 = r10
            S4.g r0 = (S4.C0370g) r0
            int r1 = r0.f5077p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5077p = r1
            goto L18
        L13:
            S4.g r0 = new S4.g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5076o
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f5077p
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f5075n
            R4.a r7 = r0.f5074m
            R4.n r8 = r0.f5073l
            S4.f r2 = r0.f5072k
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f5075n
            R4.a r7 = r0.f5074m
            R4.n r8 = r0.f5073l
            S4.f r2 = r0.f5072k
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            S1.V.O(r10)
            boolean r10 = r7 instanceof S4.S
            if (r10 != 0) goto Lab
            R4.a r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f5072k = r7     // Catch: java.lang.Throwable -> L35
            r0.f5073l = r8     // Catch: java.lang.Throwable -> L35
            r0.f5074m = r10     // Catch: java.lang.Throwable -> L35
            r0.f5075n = r9     // Catch: java.lang.Throwable -> L35
            r0.f5077p = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f5072k = r2     // Catch: java.lang.Throwable -> L35
            r0.f5073l = r8     // Catch: java.lang.Throwable -> L35
            r0.f5074m = r7     // Catch: java.lang.Throwable -> L35
            r0.f5075n = r9     // Catch: java.lang.Throwable -> L35
            r0.f5077p = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.m(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.c(r3)
        L8d:
            p4.x r7 = p084p4.x.f10867a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.c(r3)
        Laa:
            throw r10
        Lab:
            S4.S r7 = (S4.S) r7
            java.lang.Throwable r7 = r7.f5060h
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.F.g(S4.f, R4.n, boolean, u4.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(InterfaceC0368e interfaceC0368e, D4.e eVar, p122w4.c cVar) {
        t tVar;
        D4.e eVar2;
        E4.w wVar;
        AbortFlowException e6;
        F.F f6;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i = tVar.f5127o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.f5127o = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(cVar);
            }
        } else {
            tVar = new t(cVar);
        }
        Object obj = tVar.f5126n;
        Object obj2 = v4.a.f13292h;
        int i3 = tVar.f5127o;
        C0308a c0308a = T4.b.f5258b;
        if (i3 == 0) {
            V.O(obj);
            E4.w wVar2 = new E4.w();
            wVar2.f1074h = c0308a;
            F.F f7 = new F.F(eVar, wVar2);
            try {
                tVar.f5123k = eVar;
                tVar.f5124l = wVar2;
                tVar.f5125m = f7;
                tVar.f5127o = 1;
                if (interfaceC0368e.a(f7, tVar) == obj2) {
                    return obj2;
                }
                eVar2 = eVar;
                wVar = wVar2;
            } catch (AbortFlowException e7) {
                eVar2 = eVar;
                wVar = wVar2;
                e6 = e7;
                f6 = f7;
                if (e6.f9953h != f6) {
                    throw e6;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = tVar.f5125m;
            wVar = tVar.f5124l;
            eVar2 = tVar.f5123k;
            try {
                V.O(obj);
            } catch (AbortFlowException e8) {
                e6 = e8;
                if (e6.f9953h != f6) {
                    throw e6;
                }
            }
        }
        Object obj3 = wVar.f1074h;
        if (obj3 != c0308a) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(InterfaceC0368e interfaceC0368e, p122w4.c cVar) {
        C0381s c0381s;
        E4.w wVar;
        AbortFlowException e6;
        C0052b c0052b;
        if (cVar instanceof C0381s) {
            c0381s = (C0381s) cVar;
            int i = c0381s.f5122n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0381s.f5122n = i - Integer.MIN_VALUE;
            } else {
                c0381s = new C0381s(cVar);
            }
        } else {
            c0381s = new C0381s(cVar);
        }
        Object obj = c0381s.f5121m;
        Object obj2 = v4.a.f13292h;
        int i3 = c0381s.f5122n;
        C0308a c0308a = T4.b.f5258b;
        if (i3 == 0) {
            V.O(obj);
            E4.w wVar2 = new E4.w();
            wVar2.f1074h = c0308a;
            C0052b c0052b2 = new C0052b(1, wVar2);
            try {
                c0381s.f5119k = wVar2;
                c0381s.f5120l = c0052b2;
                c0381s.f5122n = 1;
                if (interfaceC0368e.a(c0052b2, c0381s) == obj2) {
                    return obj2;
                }
                wVar = wVar2;
            } catch (AbortFlowException e7) {
                wVar = wVar2;
                e6 = e7;
                c0052b = c0052b2;
                if (e6.f9953h != c0052b) {
                    throw e6;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0052b = c0381s.f5120l;
            wVar = c0381s.f5119k;
            try {
                V.O(obj);
            } catch (AbortFlowException e8) {
                e6 = e8;
                if (e6.f9953h != c0052b) {
                    throw e6;
                }
            }
        }
        Object obj3 = wVar.f1074h;
        if (obj3 != c0308a) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    public static final InterfaceC0368e j(B b6, p111u4.i iVar, int i, int i3) {
        return ((i == 0 || i == -3) && i3 == 1) ? b6 : new T4.i(b6, iVar, i, i3);
    }

    public static final z k(A a6, U4.d dVar, M m6, Float f6) {
        R4.f.f4845c.getClass();
        R4.e eVar = R4.e.f4843a;
        D.x xVar = new D.x(a6, 18, p111u4.j.f12751h);
        P pB = b(f6);
        int i = m6.equals(I.f5041a) ? 1 : 4;
        w wVar = new w(m6, (InterfaceC0368e) xVar.i, pB, f6, null);
        p111u4.i iVarG = AbstractC0336x.g(dVar.d(), (p111u4.i) xVar.f707j, true);
        W4.d dVar2 = P4.D.f4604a;
        if (iVarG != dVar2 && iVarG.J(p111u4.e.f12750h) == null) {
            iVarG = iVarG.o(dVar2);
        }
        if (i == 0) {
            throw null;
        }
        AbstractC0314a c0Var = i == 2 ? new c0(iVarG, wVar) : new i0(iVarG, true);
        c0Var.f0(i, c0Var, wVar);
        return new z(pB);
    }
}
