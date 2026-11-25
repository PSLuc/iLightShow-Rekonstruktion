package N;

import B.C0005c0;
import P4.C0319f;
import android.view.Choreographer;
import java.util.ArrayList;
import p015c2.AbstractC0473d;
import p090r.C0870i;

/* JADX INFO: renamed from: N.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0221j0 implements V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3712h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f3713j;

    public C0221j0(Choreographer choreographer, p130y0.S s6) {
        this.f3712h = 1;
        this.i = choreographer;
        this.f3713j = s6;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @Override // N.V
    public final Object C(D4.c cVar, p111u4.d dVar) {
        C0219i0 c0219i0;
        boolean z5;
        Object objT;
        int i = 21;
        p130y0.S s6 = null;
        switch (this.f3712h) {
            case 0:
                if (dVar instanceof C0219i0) {
                    c0219i0 = (C0219i0) dVar;
                    int i3 = c0219i0.f3711o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0219i0.f3711o = i3 - Integer.MIN_VALUE;
                    } else {
                        c0219i0 = new C0219i0(this, dVar);
                    }
                } else {
                    c0219i0 = new C0219i0(this, dVar);
                }
                Object obj = c0219i0.f3709m;
                v4.a aVar = v4.a.f13292h;
                int i6 = c0219i0.f3711o;
                if (i6 == 0) {
                    S1.V.O(obj);
                    P p6 = (P) this.f3713j;
                    c0219i0.f3707k = this;
                    c0219i0.f3708l = cVar;
                    c0219i0.f3711o = 1;
                    synchronized (p6.f3648c) {
                        z5 = p6.f3646a;
                    }
                    if (z5) {
                        objT = p084p4.x.f10867a;
                    } else {
                        C0319f c0319f = new C0319f(1, AbstractC0473d.F(c0219i0));
                        c0319f.u();
                        synchronized (p6.f3648c) {
                            ((ArrayList) p6.f3647b).add(c0319f);
                        }
                        c0319f.w(new C0005c0(p6, i, c0319f));
                        objT = c0319f.t();
                        if (objT != aVar) {
                            objT = p084p4.x.f10867a;
                        }
                    }
                    if (objT != aVar) {
                    }
                    return aVar;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj);
                    return obj;
                }
                cVar = c0219i0.f3708l;
                this = c0219i0.f3707k;
                S1.V.O(obj);
                V v6 = (V) this.i;
                c0219i0.f3707k = null;
                c0219i0.f3708l = null;
                c0219i0.f3711o = 2;
                Object objC = v6.C(cVar, c0219i0);
                if (objC != aVar) {
                    return objC;
                }
                return aVar;
            default:
                p130y0.S s7 = (p130y0.S) this.f3713j;
                if (s7 == null) {
                    p111u4.g gVarJ = dVar.e().J(p111u4.e.f12750h);
                    if (gVarJ instanceof p130y0.S) {
                        s6 = (p130y0.S) gVarJ;
                    }
                } else {
                    s6 = s7;
                }
                C0319f c0319f2 = new C0319f(1, AbstractC0473d.F(dVar));
                c0319f2.u();
                A a6 = new A(c0319f2, this, cVar);
                if (s6 == null || !E4.k.a(s6.f14291j, (Choreographer) this.i)) {
                    ((Choreographer) this.i).postFrameCallback(a6);
                    c0319f2.w(new C0870i(this, i, a6));
                } else {
                    synchronized (s6.f14293l) {
                        s6.f14295n.add(a6);
                        if (!s6.f14298q) {
                            s6.f14298q = true;
                            s6.f14291j.postFrameCallback(s6.f14299r);
                        }
                        break;
                    }
                    c0319f2.w(new C0870i(s6, 20, a6));
                }
                Object objT2 = c0319f2.t();
                v4.a aVar2 = v4.a.f13292h;
                return objT2;
        }
    }

    @Override // p111u4.i
    public final p111u4.i D(p111u4.h hVar) {
        switch (this.f3712h) {
            case 0:
                break;
        }
        return S1.h0.t(this, hVar);
    }

    @Override // p111u4.i
    public final p111u4.g J(p111u4.h hVar) {
        switch (this.f3712h) {
            case 0:
                break;
        }
        return S1.h0.m(this, hVar);
    }

    @Override // p111u4.i
    public final Object T(Object obj, D4.e eVar) {
        switch (this.f3712h) {
            case 0:
                break;
        }
        return eVar.d(obj, this);
    }

    @Override // p111u4.i
    public final p111u4.i o(p111u4.i iVar) {
        switch (this.f3712h) {
            case 0:
                break;
        }
        return S1.h0.u(this, iVar);
    }

    public C0221j0(V v6) {
        this.f3712h = 0;
        this.i = v6;
        this.f3713j = new P(0);
    }
}
