package p090r;

import B.N0;
import D.D;
import D.F;
import D4.c;
import E4.l;
import G1.t;
import H1.d;
import L.C0185v1;
import M0.n;
import N.C0221j0;
import N.V0;
import N.W0;
import P4.AbstractC0336x;
import P4.C0325l;
import P4.C0327n;
import R4.b;
import R4.h;
import S0.j;
import S0.o;
import X.s;
import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import p027e3.a;
import p035g0.B;
import p035g0.C0706g;
import p035g0.O;
import p045i1.A;
import p045i1.AbstractC0758t;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p058l0.I;
import p084p4.x;
import p089q4.k;
import p091r0.q;
import p092r1.L;
import p096s.AbstractC0909d;
import p096s.E;
import p096s.H;
import p096s.InterfaceC0932z;
import p096s.j0;
import p096s.k0;
import p096s.m0;
import p096s.n0;
import p096s.o0;
import p112v.C0981h;
import p112v.C1004t;
import p112v.C1011w0;
import p112v.C1017z0;
import p112v.M;
import p112v.N;
import p112v.T;
import p112v.W;
import p112v.b1;
import p112v.r;
import p117w.m;
import p123x.b0;
import p124x0.AbstractC1098f;
import p130y0.AbstractC1124c0;
import p130y0.C1139k;
import p130y0.C1146n0;
import p130y0.G0;
import p130y0.J;
import p130y0.K;
import p130y0.S;
import p130y0.a1;

/* JADX INFO: renamed from: r.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0870i extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11406h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11407j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0870i(Object obj, int i, Object obj2) {
        super(1);
        this.f11406h = i;
        this.i = obj;
        this.f11407j = obj2;
    }

    @Override // D4.c
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        x xVar;
        x xVar2;
        F f6;
        int i = 7;
        int i3 = 0;
        int i6 = 1;
        switch (this.f11406h) {
            case 0:
                k0 k0Var = (k0) obj;
                C0873l c0873l = (C0873l) this.i;
                Object objB = k0Var.b();
                p080p.x xVar3 = c0873l.f11416e;
                V0 v6 = (V0) xVar3.e(objB);
                long j4 = v6 != null ? ((j) v6.getValue()).f4896a : 0L;
                V0 v7 = (V0) xVar3.e(k0Var.c());
                long j6 = v7 != null ? ((j) v7.getValue()).f4896a : 0L;
                N n6 = (N) ((C0872k) this.f11407j).f11410b.getValue();
                if (n6 != null) {
                    InterfaceC0932z interfaceC0932z = (InterfaceC0932z) n6.f11386a.d(new j(j4), new j(j6));
                    if (interfaceC0932z != null) {
                        return interfaceC0932z;
                    }
                }
                return AbstractC0909d.j(7, null);
            case 1:
                Throwable th = (Throwable) obj;
                ((v) this.i).invoke(th);
                d dVar = (d) this.f11407j;
                ((b) dVar.f1758j).g(th, false);
                do {
                    Object objF = ((b) dVar.f1758j).f();
                    if (objF instanceof h) {
                        objF = null;
                    }
                    xVar = x.f10867a;
                    if (objF != null) {
                        L l6 = (L) objF;
                        Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                        C0325l c0325l = l6.f11607b;
                        c0325l.getClass();
                        c0325l.R(new C0327n(cancellationException, false));
                        xVar2 = xVar;
                    } else {
                        xVar2 = null;
                    }
                } while (xVar2 != null);
                return xVar;
            case 2:
                H h6 = (H) this.i;
                P.d dVar2 = h6.f11848a;
                E e6 = (E) this.f11407j;
                dVar2.c(e6);
                h6.f11849b.setValue(Boolean.TRUE);
                return new N0(h6, 5, e6);
            case 3:
                AbstractC0336x.o((U4.d) this.i, null, new n0((o0) this.f11407j, null), 1);
                return new t(1);
            case 4:
                o0 o0Var = (o0) this.i;
                s sVar = o0Var.f12064j;
                o0 o0Var2 = (o0) this.f11407j;
                sVar.add(o0Var2);
                return new N0(o0Var, 6, o0Var2);
            case 5:
                return new N0((o0) this.i, i, (j0) this.f11407j);
            case 6:
                o0 o0Var3 = (o0) this.i;
                s sVar2 = o0Var3.i;
                m0 m0Var = (m0) this.f11407j;
                sVar2.add(m0Var);
                return new N0(o0Var3, 8, m0Var);
            case 7:
                p124x0.F f7 = (p124x0.F) obj;
                f7.b();
                p044i0.d.t(f7, ((B) this.i).f9009a, (O) this.f11407j, 0.0f, null, 60);
                return x.f10867a;
            case 8:
                p124x0.F f8 = (p124x0.F) obj;
                f8.b();
                p044i0.d.t(f8, (C0706g) this.i, (O) this.f11407j, 0.0f, null, 60);
                return x.f10867a;
            case 9:
                ((m) this.i).b((p117w.l) this.f11407j);
                return x.f10867a;
            case 10:
                ((p091r0.h) this.i).f11493a.o((C0981h) this.f11407j);
                return x.f10867a;
            case 11:
                p097s0.c cVar = (p097s0.c) this.i;
                d0.i(cVar, (q) obj);
                W0 w6 = AbstractC1124c0.f14377q;
                M m6 = (M) this.f11407j;
                float fA = ((G0) AbstractC1098f.h(m6, w6)).a();
                long jE = AbstractC0599v0.e(fA, fA);
                if (o.b(jE) <= 0.0f || o.c(jE) <= 0.0f) {
                    a.y0("maximumVelocity should be a positive value. You specified=" + ((Object) o.g(jE)));
                    throw null;
                }
                float fB = o.b(jE);
                p097s0.b bVar = cVar.f12157a;
                float fB2 = bVar.b(fB);
                float fC = o.c(jE);
                p097s0.b bVar2 = cVar.f12158b;
                long jE2 = AbstractC0599v0.e(fB2, bVar2.b(fC));
                p097s0.a[] aVarArr = bVar.f12152b;
                k.j0(0, aVarArr.length, aVarArr);
                bVar.f12153c = 0;
                p097s0.a[] aVarArr2 = bVar2.f12152b;
                k.j0(0, aVarArr2.length, aVarArr2);
                bVar2.f12153c = 0;
                cVar.f12159c = 0L;
                b bVar3 = m6.f12859A;
                if (bVar3 != null) {
                    N n7 = p112v.O.f12871a;
                    bVar3.j(new C1004t(AbstractC0599v0.e(Float.isNaN(o.b(jE2)) ? 0.0f : o.b(jE2), Float.isNaN(o.c(jE2)) ? 0.0f : o.c(jE2))));
                }
                return x.f10867a;
            case 12:
                long j7 = ((r) obj).f13055a;
                T t6 = (T) this.f11407j;
                long jI = p030f0.c.i(t6.J ? -1.0f : 1.0f, j7);
                W w7 = t6.f12895F;
                N n8 = p112v.O.f12871a;
                ((C0185v1) this.i).f2941a.a(w7 == W.f12920h ? p030f0.c.e(jI) : p030f0.c.d(jI));
                return x.f10867a;
            case 13:
                long j8 = ((r) obj).f13055a;
                long jA = ((C1017z0) this.f11407j).f13107d == W.i ? p030f0.c.a(j8, 0.0f, 1) : p030f0.c.a(j8, 0.0f, 2);
                C1017z0 c1017z0 = ((C1011w0) this.i).f13086a;
                c1017z0.f13110g = 1;
                p101t.m0 m0Var2 = c1017z0.f13105b;
                if (m0Var2 == null || !(c1017z0.f13104a.d() || c1017z0.f13104a.a())) {
                    C1017z0.a(c1017z0, c1017z0.f13111h, jA, 1);
                } else {
                    m0Var2.d(jA, c1017z0.f13110g, c1017z0.f13112j);
                }
                return x.f10867a;
            case 14:
                ((Number) obj).longValue();
                b1 b1Var = (b1) this.i;
                float f9 = b1Var.f12961e;
                b1Var.f12961e = 0.0f;
                ((c) this.f11407j).invoke(Float.valueOf(f9));
                return x.f10867a;
            case 15:
                b0 b0Var = (b0) this.i;
                int i7 = b0Var.f13754s;
                View view = (View) this.f11407j;
                if (i7 == 0) {
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                    p123x.F f10 = b0Var.f13755t;
                    AbstractC0758t.u(view, f10);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(f10);
                    A.c(view, f10);
                }
                b0Var.f13754s++;
                return new N0(b0Var, 9, view);
            case 16:
                Context context = (Context) this.i;
                Context applicationContext = context.getApplicationContext();
                J j9 = (J) this.f11407j;
                applicationContext.registerComponentCallbacks(j9);
                return new N0(context, 10, j9);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                Context context2 = (Context) this.i;
                Context applicationContext2 = context2.getApplicationContext();
                K k3 = (K) this.f11407j;
                applicationContext2.registerComponentCallbacks(k3);
                return new N0(context2, 11, k3);
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return new C1146n0((D) this.i, new I(19, (p130y0.N) this.f11407j));
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                C1146n0 c1146n0 = (C1146n0) this.i;
                synchronized (c1146n0.f14433c) {
                    try {
                        c1146n0.f14435e = true;
                        P.d dVar3 = c1146n0.f14434d;
                        int i8 = dVar3.f4583j;
                        if (i8 > 0) {
                            Object[] objArr = dVar3.f4582h;
                            do {
                                n nVar = (n) ((WeakReference) objArr[i3]).get();
                                if (nVar != null && (f6 = nVar.f3437b) != null) {
                                    nVar.a(f6);
                                    nVar.f3437b = null;
                                }
                                i3++;
                            } while (i3 < i8);
                        }
                        c1146n0.f14434d.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ((p130y0.N) this.f11407j).i.f3456a.e();
                return x.f10867a;
            case 20:
                S s6 = (S) this.i;
                N.A a6 = (N.A) this.f11407j;
                synchronized (s6.f14293l) {
                    s6.f14295n.remove(a6);
                }
                return x.f10867a;
            case 21:
                ((Choreographer) ((C0221j0) this.i).i).removeFrameCallback((N.A) this.f11407j);
                return x.f10867a;
            default:
                C1139k c1139k = (C1139k) obj;
                p130y0.b1 b1Var2 = (p130y0.b1) this.i;
                if (!b1Var2.f14356j) {
                    C0460u c0460uF = c1139k.f14402a.f();
                    V.a aVar = (V.a) this.f11407j;
                    b1Var2.f14358l = aVar;
                    if (b1Var2.f14357k == null) {
                        b1Var2.f14357k = c0460uF;
                        c0460uF.a(b1Var2);
                    } else if (c0460uF.f7001c.compareTo(EnumC0454n.f6992j) >= 0) {
                        b1Var2.i.j(new V.a(-2000640158, new a1(b1Var2, aVar, i6), true));
                    }
                }
                return x.f10867a;
        }
    }
}
