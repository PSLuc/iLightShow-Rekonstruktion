package p096s;

import B.T;
import D4.c;
import D4.e;
import E4.k;
import E4.w;
import F.D;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.U;
import N.W;
import S1.V;
import Z.b;
import Z.p;
import java.util.concurrent.CancellationException;
import p084p4.x;
import p090r.C0870i;
import p111u4.i;
import p130y0.C1144m0;
import v4.a;

/* JADX INFO: renamed from: s.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0920m f11964a = new C0920m(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0921n f11965b = new C0921n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0922o f11966c = new C0922o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0923p f11967d = new C0923p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0920m f11968e = new C0920m(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0921n f11969f = new C0921n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0922o f11970g = new C0922o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0923p f11971h = new C0923p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0907c a(float f6) {
        return new C0907c(Float.valueOf(f6), x0.f12138a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(C0919l c0919l, InterfaceC0915h interfaceC0915h, long j4, c cVar, p122w4.c cVar2) {
        C0912e0 c0912e0;
        w wVar;
        C0919l c0919l2;
        w wVar2;
        C0919l c0919l3;
        Object objC;
        c cVar3;
        C0917j c0917j;
        C0917j c0917j2;
        Object objC2;
        InterfaceC0915h interfaceC0915h2 = interfaceC0915h;
        if (cVar2 instanceof C0912e0) {
            c0912e0 = (C0912e0) cVar2;
            int i = c0912e0.f11983p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0912e0.f11983p = i - Integer.MIN_VALUE;
            } else {
                c0912e0 = new C0912e0(cVar2);
            }
        } else {
            c0912e0 = new C0912e0(cVar2);
        }
        C0912e0 c0912e1 = c0912e0;
        Object obj = c0912e1.f11982o;
        a aVar = a.f13292h;
        int i3 = c0912e1.f11983p;
        C1144m0 c1144m0 = C1144m0.f14429h;
        if (i3 == 0) {
            V.O(obj);
            Object objB = interfaceC0915h2.b(0L);
            AbstractC0924q abstractC0924qF = interfaceC0915h2.f(0L);
            wVar = new w();
            i iVar = c0912e1.i;
            if (j4 == Long.MIN_VALUE) {
                try {
                    k.c(iVar);
                    try {
                        c0919l2 = c0919l;
                        try {
                            f0 f0Var = new f0(wVar, objB, interfaceC0915h2, abstractC0924qF, c0919l2, h(iVar), cVar);
                            wVar2 = wVar;
                            try {
                                c0912e1.f11978k = c0919l2;
                                c0912e1.f11979l = interfaceC0915h2;
                                c0912e1.f11980m = cVar;
                                c0912e1.f11981n = wVar2;
                                c0912e1.f11983p = 1;
                                if (!interfaceC0915h2.a()) {
                                    objC = C0208d.F(c0912e1.e()).C(new W(f0Var, 7), c0912e1);
                                } else {
                                    if (c0912e1.e().J(c1144m0) != null) {
                                        throw new ClassCastException();
                                    }
                                    objC = C0208d.F(c0912e1.e()).C(f0Var, c0912e1);
                                }
                                if (objC != aVar) {
                                    c0919l3 = c0919l2;
                                    cVar3 = cVar;
                                    wVar = wVar2;
                                }
                                return aVar;
                            } catch (CancellationException e6) {
                                e = e6;
                                c0919l3 = c0919l2;
                                wVar = wVar2;
                                c0917j = (C0917j) wVar.f1074h;
                                if (c0917j != null) {
                                    c0917j.i.setValue(Boolean.FALSE);
                                }
                                c0917j2 = (C0917j) wVar.f1074h;
                                if (c0917j2 != null) {
                                    c0919l3.f12029m = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e7) {
                            e = e7;
                            c0919l3 = c0919l2;
                            c0917j = (C0917j) wVar.f1074h;
                            if (c0917j != null) {
                                c0917j.i.setValue(Boolean.FALSE);
                            }
                            c0917j2 = (C0917j) wVar.f1074h;
                            if (c0917j2 != null && c0917j2.f12020g == c0919l3.f12027k) {
                                c0919l3.f12029m = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e8) {
                        e = e8;
                        c0919l2 = c0919l;
                    }
                } catch (CancellationException e9) {
                    e = e9;
                    c0919l2 = c0919l;
                    wVar2 = wVar;
                }
            } else {
                wVar2 = wVar;
                try {
                    C0917j c0917j3 = new C0917j(objB, interfaceC0915h2.d(), abstractC0924qF, j4, interfaceC0915h2.e(), j4, new D(c0919l, 2));
                    k.c(iVar);
                    g(c0917j3, j4, h(iVar), interfaceC0915h2, c0919l, cVar);
                    wVar2.f1074h = c0917j3;
                    c0919l3 = c0919l;
                    interfaceC0915h2 = interfaceC0915h;
                    cVar3 = cVar;
                    wVar = wVar2;
                } catch (CancellationException e10) {
                    e = e10;
                    c0919l3 = c0919l;
                    wVar = wVar2;
                    c0917j = (C0917j) wVar.f1074h;
                    if (c0917j != null) {
                        c0917j.i.setValue(Boolean.FALSE);
                    }
                    c0917j2 = (C0917j) wVar.f1074h;
                    if (c0917j2 != null) {
                        c0919l3.f12029m = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = c0912e1.f11981n;
            cVar3 = c0912e1.f11980m;
            interfaceC0915h2 = c0912e1.f11979l;
            c0919l3 = c0912e1.f11978k;
            try {
                V.O(obj);
            } catch (CancellationException e11) {
                e = e11;
                c0917j = (C0917j) wVar.f1074h;
                if (c0917j != null) {
                    c0917j.i.setValue(Boolean.FALSE);
                }
                c0917j2 = (C0917j) wVar.f1074h;
                if (c0917j2 != null) {
                    c0919l3.f12029m = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = wVar.f1074h;
            k.c(obj2);
            if (!((Boolean) ((C0917j) obj2).i.getValue()).booleanValue()) {
                return x.f10867a;
            }
            i iVar2 = c0912e1.i;
            k.c(iVar2);
            w wVar3 = wVar;
            c cVar4 = cVar3;
            InterfaceC0915h interfaceC0915h3 = interfaceC0915h2;
            C0919l c0919l4 = c0919l3;
            try {
                g0 g0Var = new g0(wVar3, h(iVar2), interfaceC0915h3, c0919l4, cVar4);
                wVar = wVar3;
                interfaceC0915h2 = interfaceC0915h3;
                c0919l3 = c0919l4;
                cVar3 = cVar4;
                c0912e1.f11978k = c0919l3;
                c0912e1.f11979l = interfaceC0915h2;
                c0912e1.f11980m = cVar3;
                c0912e1.f11981n = wVar;
                c0912e1.f11983p = 2;
                if (!interfaceC0915h2.a()) {
                    objC2 = C0208d.F(c0912e1.e()).C(new W(g0Var, 7), c0912e1);
                } else {
                    if (c0912e1.e().J(c1144m0) != null) {
                        throw new ClassCastException();
                    }
                    objC2 = C0208d.F(c0912e1.e()).C(g0Var, c0912e1);
                }
            } catch (CancellationException e12) {
                e = e12;
                wVar = wVar3;
                c0919l3 = c0919l4;
                c0917j = (C0917j) wVar.f1074h;
                if (c0917j != null) {
                    c0917j.i.setValue(Boolean.FALSE);
                }
                c0917j2 = (C0917j) wVar.f1074h;
                if (c0917j2 != null) {
                    c0919l3.f12029m = false;
                }
                throw e;
            }
        } while (objC2 != aVar);
        return aVar;
    }

    public static Object c(float f6, float f7, v0 v0Var, e eVar, p122w4.i iVar, int i) {
        InterfaceC0918k interfaceC0918kJ = v0Var;
        if ((i & 8) != 0) {
            interfaceC0918kJ = j(7, null);
        }
        w0 w0Var = x0.f12138a;
        Float f8 = new Float(f6);
        Float f9 = new Float(f7);
        C0920m c0920m = new C0920m(new Float(0.0f).floatValue());
        Object objB = b(new C0919l(w0Var, f8, c0920m, 56), new h0(interfaceC0918kJ, w0Var, f8, f9, c0920m), Long.MIN_VALUE, new W(eVar), iVar);
        a aVar = a.f13292h;
        x xVar = x.f10867a;
        if (objB != aVar) {
            objB = xVar;
        }
        return objB == aVar ? objB : xVar;
    }

    public static final E d(H h6, float f6, D d6, C0230o c0230o) {
        return e(h6, Float.valueOf(0.0f), Float.valueOf(f6), x0.f12138a, d6, c0230o, 33208, 0);
    }

    public static final E e(H h6, Number number, Number number2, w0 w0Var, D d6, C0230o c0230o, int i, int i3) {
        Object objK = c0230o.K();
        U u6 = C0222k.f3714a;
        if (objK == u6) {
            E e6 = new E(h6, number, number2, w0Var, d6);
            c0230o.f0(e6);
            objK = e6;
        }
        E e7 = (E) objK;
        boolean z5 = (((57344 & i) ^ 24576) > 16384 && c0230o.h(d6)) || (i & 24576) == 16384;
        Object objK2 = c0230o.K();
        if (z5 || objK2 == u6) {
            T t6 = new T(number, e7, number2, d6, 2);
            c0230o.f0(t6);
            objK2 = t6;
        }
        C0208d.g((D4.a) objK2, c0230o);
        boolean zH = c0230o.h(h6);
        Object objK3 = c0230o.K();
        if (zH || objK3 == u6) {
            objK3 = new C0870i(h6, 2, e7);
            c0230o.f0(objK3);
        }
        C0208d.c(e7, (c) objK3, c0230o);
        return e7;
    }

    public static final AbstractC0924q f(AbstractC0924q abstractC0924q) {
        AbstractC0924q abstractC0924qC = abstractC0924q.c();
        int iB = abstractC0924qC.b();
        for (int i = 0; i < iB; i++) {
            abstractC0924qC.e(i, abstractC0924q.a(i));
        }
        return abstractC0924qC;
    }

    public static final void g(C0917j c0917j, long j4, float f6, InterfaceC0915h interfaceC0915h, C0919l c0919l, c cVar) {
        long jC = f6 == 0.0f ? interfaceC0915h.c() : (long) ((j4 - c0917j.f12016c) / f6);
        c0917j.f12020g = j4;
        c0917j.f12018e.setValue(interfaceC0915h.b(jC));
        c0917j.f12019f = interfaceC0915h.f(jC);
        if (interfaceC0915h.g(jC)) {
            c0917j.f12021h = c0917j.f12020g;
            c0917j.i.setValue(Boolean.FALSE);
        }
        l(c0917j, c0919l);
        cVar.invoke(c0917j);
    }

    public static final float h(i iVar) {
        p pVar = (p) iVar.J(b.f5946v);
        float fL = pVar != null ? pVar.L() : 1.0f;
        if (fL >= 0.0f) {
            return fL;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static D i(InterfaceC0929w interfaceC0929w) {
        return new D(interfaceC0929w, 0);
    }

    public static C0906b0 j(int i, Object obj) {
        float f6 = (i & 2) != 0 ? 1500.0f : 400.0f;
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C0906b0(1.0f, f6, obj);
    }

    public static v0 k(int i, int i3, InterfaceC0930x interfaceC0930x) {
        int i6 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            interfaceC0930x = AbstractC0931y.f12146a;
        }
        return new v0(i, i6, interfaceC0930x);
    }

    public static final void l(C0917j c0917j, C0919l c0919l) {
        c0919l.i.setValue(c0917j.f12018e.getValue());
        AbstractC0924q abstractC0924q = c0919l.f12026j;
        AbstractC0924q abstractC0924q2 = c0917j.f12019f;
        int iB = abstractC0924q.b();
        for (int i = 0; i < iB; i++) {
            abstractC0924q.e(i, abstractC0924q2.a(i));
        }
        c0919l.f12028l = c0917j.f12021h;
        c0919l.f12027k = c0917j.f12020g;
        c0919l.f12029m = ((Boolean) c0917j.i.getValue()).booleanValue();
    }
}
