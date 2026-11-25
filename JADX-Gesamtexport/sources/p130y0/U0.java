package p130y0;

import D4.e;
import E4.k;
import E4.w;
import N.C0208d;
import N.C0242u0;
import N.C0246w0;
import N.C0248x0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import P4.T;
import P4.i0;
import S1.V;
import S4.N;
import android.view.View;
import androidx.lifecycle.InterfaceC0458s;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f14309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f14310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0458s f14311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V0 f14312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ View f14313r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(w wVar, C0248x0 c0248x0, InterfaceC0458s interfaceC0458s, V0 v6, View view, d dVar) {
        super(2, dVar);
        this.f14309n = wVar;
        this.f14310o = c0248x0;
        this.f14311p = interfaceC0458s;
        this.f14312q = v6;
        this.f14313r = view;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        U0 u0 = new U0(this.f14309n, this.f14310o, this.f14311p, this.f14312q, this.f14313r, dVar);
        u0.f14308m = obj;
        return u0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((U0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        T t6;
        i0 i0VarO;
        a aVar = a.f13292h;
        int i = this.f14307l;
        InterfaceC0458s interfaceC0458s = this.f14311p;
        x xVar = x.f10867a;
        V0 v6 = this.f14312q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t6 = (T) this.f14308m;
            try {
                V.O(obj);
                if (t6 != null) {
                    t6.c(null);
                }
                interfaceC0458s.f().f(v6);
                return xVar;
            } catch (Throwable th) {
                th = th;
                if (t6 != null) {
                    t6.c(null);
                }
                interfaceC0458s.f().f(v6);
                throw th;
            }
        }
        V.O(obj);
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f14308m;
        try {
            C1152q0 c1152q0 = (C1152q0) this.f14309n.f1074h;
            if (c1152q0 != null) {
                N nA = X0.a(this.f14313r.getContext().getApplicationContext());
                try {
                    c1152q0.f14450h.j(((Number) nA.getValue()).floatValue());
                    i0VarO = AbstractC0336x.o(interfaceC0335w, null, new T0(nA, c1152q0, null), 3);
                } catch (Throwable th2) {
                    th = th2;
                    t6 = null;
                    if (t6 != null) {
                        t6.c(null);
                    }
                    interfaceC0458s.f().f(v6);
                    throw th;
                }
            } else {
                i0VarO = null;
            }
            try {
                C0248x0 c0248x0 = this.f14310o;
                this.f14308m = i0VarO;
                this.f14307l = 1;
                C0246w0 c0246w0 = new C0246w0(c0248x0, null);
                p111u4.i iVar = this.i;
                k.c(iVar);
                Object objV = AbstractC0336x.v(c0248x0.f3854a, new C0242u0(c0248x0, c0246w0, C0208d.F(iVar), null), this);
                if (objV != aVar) {
                    objV = xVar;
                }
                if (objV != aVar) {
                    objV = xVar;
                }
                if (objV == aVar) {
                    return aVar;
                }
                t6 = i0VarO;
                if (t6 != null) {
                    t6.c(null);
                }
                interfaceC0458s.f().f(v6);
                return xVar;
            } catch (Throwable th3) {
                i0 i0Var = i0VarO;
                th = th3;
                t6 = i0Var;
                if (t6 != null) {
                    t6.c(null);
                }
                interfaceC0458s.f().f(v6);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
