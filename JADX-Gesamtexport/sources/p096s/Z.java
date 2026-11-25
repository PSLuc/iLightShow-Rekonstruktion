package p096s;

import C1.b;
import E4.k;
import F1.C0096m;
import G4.a;
import N.C0208d;
import N.C0209d0;
import N.C0217h0;
import N.U;
import P4.C0319f;
import S1.V;
import X4.d;
import java.util.concurrent.CancellationException;
import p015c2.AbstractC0473d;
import p058l0.I;
import p080p.v;
import p080p.w;
import p081p0.c;
import p084p4.x;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0920m f11915y = new C0920m(0.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0920m f11916z = new C0920m(1.0f);
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0217h0 f11917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f11918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o0 f11919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I f11921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0209d0 f11922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0319f f11923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f11924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final N f11925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f11927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public O f11928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final P f11929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f11930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P f11931x;

    public Z(C0096m c0096m) {
        super(3);
        U u6 = U.f3673m;
        this.i = C0208d.K(c0096m, u6);
        this.f11917j = C0208d.K(c0096m, u6);
        this.f11918k = c0096m;
        this.f11921n = new I(5, this);
        this.f11922o = C0208d.I(0.0f);
        this.f11924q = new d();
        this.f11925r = new N();
        this.f11926s = Long.MIN_VALUE;
        this.f11927t = new w();
        this.f11929v = new P(this, 1);
        this.f11931x = new P(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public static final void p(Z z5) {
        o0 o0Var = z5.f11919l;
        if (o0Var == null) {
            return;
        }
        O o6 = z5.f11928u;
        if (o6 == null) {
            if (z5.f11920m > 0) {
                C0209d0 c0209d0 = z5.f11922o;
                if (c0209d0.h() == 1.0f || k.a(z5.f11917j.getValue(), z5.i.getValue())) {
                    o6 = null;
                } else {
                    O o7 = new O();
                    o7.f11869d = c0209d0.h();
                    long j4 = z5.f11920m;
                    o7.f11872g = j4;
                    o7.f11873h = a.E((1.0d - ((double) c0209d0.h())) * j4);
                    o7.f11870e.e(0, c0209d0.h());
                    o6 = o7;
                }
            } else {
                o6 = null;
            }
        }
        if (o6 != null) {
            o6.f11872g = z5.f11920m;
            z5.f11927t.a(o6);
            o0Var.n(o6);
        }
        z5.f11928u = null;
    }

    public static final void q(Z z5, O o6, long j4) {
        z5.getClass();
        long j6 = o6.f11866a + j4;
        o6.f11866a = j6;
        long j7 = o6.f11873h;
        if (j6 >= j7) {
            o6.f11869d = 1.0f;
            return;
        }
        A0 a6 = o6.f11867b;
        if (a6 == null) {
            float fA = o6.f11870e.a(0);
            float f6 = j6 / j7;
            w0 w0Var = x0.f12138a;
            o6.f11869d = (1.0f * f6) + ((1 - f6) * fA);
            return;
        }
        C0920m c0920m = f11916z;
        C0920m c0920m2 = o6.f11871f;
        if (c0920m2 == null) {
            c0920m2 = f11915y;
        }
        o6.f11869d = c.N(((C0920m) a6.f(j6, o6.f11870e, c0920m, c0920m2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r(Z z5, p122w4.c cVar) {
        T t6;
        z5.getClass();
        if (cVar instanceof T) {
            t6 = (T) cVar;
            int i = t6.f11889n;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6.f11889n = i - Integer.MIN_VALUE;
            } else {
                t6 = new T(z5, cVar);
            }
        } else {
            t6 = new T(z5, cVar);
        }
        Object obj = t6.f11887l;
        v4.a aVar = v4.a.f13292h;
        int i3 = t6.f11889n;
        x xVar = x.f10867a;
        if (i3 == 0) {
            V.O(obj);
            if (z5.f11927t.f10795b == 0 && z5.f11928u == null) {
                return xVar;
            }
            i iVar = t6.i;
            k.c(iVar);
            if (AbstractC0909d.h(iVar) == 0.0f) {
                z5.v();
                z5.f11926s = Long.MIN_VALUE;
                return xVar;
            }
            if (z5.f11926s == Long.MIN_VALUE) {
                t6.f11886k = z5;
                t6.f11889n = 1;
                k.c(iVar);
                if (C0208d.F(iVar).C(z5.f11929v, t6) != aVar) {
                }
            }
            return aVar;
        }
        if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z5 = t6.f11886k;
        V.O(obj);
        do {
            if (z5.f11927t.f10795b == 0 && z5.f11928u == null) {
                z5.f11926s = Long.MIN_VALUE;
                return xVar;
            }
            t6.f11886k = z5;
            t6.f11889n = 2;
        } while (z5.u(t6) != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object s(Z z5, p122w4.c cVar) {
        X x6;
        Object value;
        Z z6;
        Object obj;
        z5.getClass();
        if (cVar instanceof X) {
            x6 = (X) cVar;
            int i = x6.f11909o;
            if ((i & Integer.MIN_VALUE) != 0) {
                x6.f11909o = i - Integer.MIN_VALUE;
            } else {
                x6 = new X(z5, cVar);
            }
        } else {
            x6 = new X(z5, cVar);
        }
        Object obj2 = x6.f11907m;
        v4.a aVar = v4.a.f13292h;
        int i3 = x6.f11909o;
        if (i3 == 0) {
            V.O(obj2);
            value = z5.i.getValue();
            x6.f11905k = z5;
            x6.f11906l = value;
            x6.f11909o = 1;
            if (z5.f11924q.c(x6) != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            Object obj3 = x6.f11906l;
            Z z7 = x6.f11905k;
            V.O(obj2);
            value = obj3;
            z5 = z7;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = x6.f11906l;
            z6 = x6.f11905k;
            V.O(obj2);
        }
        if (k.a(obj2, obj)) {
            return x.f10867a;
        }
        z6.f11926s = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        x6.f11905k = z5;
        x6.f11906l = value;
        x6.f11909o = 2;
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(x6));
        c0319f.u();
        z5.f11923p = c0319f;
        z5.f11924q.e(null);
        Object objT = c0319f.t();
        if (objT != aVar) {
            z6 = z5;
            obj = value;
            obj2 = objT;
            if (k.a(obj2, obj)) {
                return x.f10867a;
            }
            z6.f11926s = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0092, please report this as an issue */
    public static final Object t(Z z5, p122w4.c cVar) {
        Y y2;
        Z z6;
        Object obj;
        Z z7;
        z5.getClass();
        if (cVar instanceof Y) {
            y2 = (Y) cVar;
            int i = y2.f11914o;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2.f11914o = i - Integer.MIN_VALUE;
            } else {
                y2 = new Y(z5, cVar);
            }
        } else {
            y2 = new Y(z5, cVar);
        }
        Object objT = y2.f11912m;
        v4.a aVar = v4.a.f13292h;
        int i3 = y2.f11914o;
        if (i3 == 0) {
            V.O(objT);
            Object value = z5.i.getValue();
            y2.f11910k = z5;
            y2.f11911l = value;
            y2.f11914o = 1;
            if (z5.f11924q.c(y2) != aVar) {
                z6 = z5;
                obj = value;
            }
            return aVar;
        }
        if (i3 == 1) {
            obj = y2.f11911l;
            z6 = y2.f11910k;
            V.O(objT);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = y2.f11911l;
            z7 = y2.f11910k;
            V.O(objT);
        }
        if (!k.a(objT, obj)) {
            z7.f11926s = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + objT + " instead of " + obj);
        }
        return x.f10867a;
        boolean zA = k.a(obj, z6.f11918k);
        d dVar = z6.f11924q;
        if (!zA) {
            y2.f11910k = z6;
            y2.f11911l = obj;
            y2.f11914o = 2;
            C0319f c0319f = new C0319f(1, AbstractC0473d.F(y2));
            c0319f.u();
            z6.f11923p = c0319f;
            dVar.e(null);
            objT = c0319f.t();
            if (objT != aVar) {
                z7 = z6;
                if (!k.a(objT, obj)) {
                    z7.f11926s = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + objT + " instead of " + obj);
                }
            }
            return aVar;
        }
        dVar.e(null);
        return x.f10867a;
    }

    @Override // C1.b
    public final Object j() {
        return this.f11917j.getValue();
    }

    @Override // C1.b
    public final Object k() {
        return this.i.getValue();
    }

    @Override // C1.b
    public final void m(Object obj) {
        this.f11917j.setValue(obj);
    }

    @Override // C1.b
    public final void n(o0 o0Var) {
        o0 o0Var2 = this.f11919l;
        if (o0Var2 == null || k.a(o0Var, o0Var2)) {
            this.f11919l = o0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f11919l + ", new instance: " + o0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d A[Catch: all -> 0x009b, LOOP:1: B:12:0x0037->B:23:0x007d, LOOP_END, TryCatch #0 {all -> 0x009b, blocks: (B:4:0x0010, B:6:0x0018, B:24:0x0082, B:29:0x008d, B:34:0x009d, B:31:0x0092, B:9:0x002b, B:12:0x0037, B:14:0x004c, B:16:0x0058, B:18:0x0062, B:20:0x0072, B:23:0x007d, B:35:0x00a1), top: B:40:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082 A[EDGE_INSN: B:47:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0037->B:23:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p4.f] */
    @Override // C1.b
    public final void o() {
        int i;
        this.f11919l = null;
        X.x xVar = (X.x) u0.f12124a.getValue();
        synchronized (xVar.f5746f) {
            try {
                P.d dVar = xVar.f5746f;
                int i3 = dVar.f4583j;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    X.w wVar = (X.w) dVar.f4582h[i6];
                    v vVar = (v) wVar.f5735f.g(this);
                    if (vVar == null) {
                        i = i6;
                    } else {
                        Object[] objArr = vVar.f10789b;
                        int[] iArr = vVar.f10790c;
                        long[] jArr = vVar.f10788a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j4 = jArr[i8];
                                i = i6;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i8 != length) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        i6 = i;
                                    }
                                } else {
                                    int i9 = 8;
                                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        if ((j4 & 255) < 128) {
                                            int i12 = (i8 << 3) + i11;
                                            Object obj = objArr[i12];
                                            int i13 = iArr[i12];
                                            wVar.d(this, obj);
                                        }
                                        j4 >>= i9;
                                        i11++;
                                        i9 = i9;
                                    }
                                    if (i10 != i9) {
                                        break;
                                    }
                                    if (i8 != length) {
                                        break;
                                    }
                                    i8++;
                                    i6 = i;
                                }
                            }
                        } else {
                            i = i6;
                        }
                    }
                    if (!(wVar.f5735f.f10800e != 0)) {
                        i7++;
                    } else if (i7 > 0) {
                        Object[] objArr2 = dVar.f4582h;
                        objArr2[i - i7] = objArr2[i];
                    }
                    i6 = i + 1;
                }
                int i14 = i3 - i7;
                p089q4.k.j0(i14, i3, dVar.f4582h);
                dVar.f4583j = i14;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object u(p122w4.c cVar) {
        float fH = AbstractC0909d.h(cVar.e());
        x xVar = x.f10867a;
        if (fH <= 0.0f) {
            v();
            return xVar;
        }
        this.f11930w = fH;
        Object objC = C0208d.F(cVar.e()).C(this.f11931x, cVar);
        return objC == v4.a.f13292h ? objC : xVar;
    }

    public final void v() {
        o0 o0Var = this.f11919l;
        if (o0Var != null) {
            o0Var.c();
        }
        w wVar = this.f11927t;
        p089q4.k.j0(0, wVar.f10795b, wVar.f10794a);
        wVar.f10795b = 0;
        if (this.f11928u != null) {
            this.f11928u = null;
            y(1.0f);
            x();
        }
    }

    public final Object w(float f6, Object obj, p122w4.i iVar) {
        if (0.0f > f6 || f6 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f6);
        }
        o0 o0Var = this.f11919l;
        x xVar = x.f10867a;
        if (o0Var != null) {
            Object objA = N.a(this.f11925r, new W(obj, this.i.getValue(), this, o0Var, f6, null), iVar);
            if (objA == v4.a.f13292h) {
                return objA;
            }
        }
        return xVar;
    }

    public final void x() {
        o0 o0Var = this.f11919l;
        if (o0Var == null) {
            return;
        }
        o0Var.m(a.E(((double) this.f11922o.h()) * ((Number) o0Var.f12066l.getValue()).longValue()));
    }

    public final void y(float f6) {
        this.f11922o.j(f6);
    }
}
