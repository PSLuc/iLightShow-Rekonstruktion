package p101t;

import P4.AbstractC0336x;
import S1.V;
import Z.n;
import p084p4.x;
import p117w.i;
import p117w.j;
import p117w.m;
import p122w4.c;
import p124x0.k0;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class U extends n implements k0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f12274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f12275v;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y0(U u6, c cVar) {
        P p6;
        i iVar;
        u6.getClass();
        if (cVar instanceof P) {
            p6 = (P) cVar;
            int i = p6.f12265o;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6.f12265o = i - Integer.MIN_VALUE;
            } else {
                p6 = new P(u6, cVar);
            }
        } else {
            p6 = new P(u6, cVar);
        }
        Object obj = p6.f12263m;
        a aVar = a.f13292h;
        int i3 = p6.f12265o;
        if (i3 == 0) {
            V.O(obj);
            if (u6.f12275v == null) {
                iVar = new i();
                m mVar = u6.f12274u;
                p6.f12261k = u6;
                p6.f12262l = iVar;
                p6.f12265o = 1;
                if (mVar.a(iVar, p6) == aVar) {
                    return aVar;
                }
            }
            return x.f10867a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i iVar2 = p6.f12262l;
        U u7 = p6.f12261k;
        V.O(obj);
        iVar = iVar2;
        u6 = u7;
        u6.f12275v = iVar;
        return x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object z0(U u6, c cVar) {
        Q q6;
        u6.getClass();
        if (cVar instanceof Q) {
            q6 = (Q) cVar;
            int i = q6.f12269n;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6.f12269n = i - Integer.MIN_VALUE;
            } else {
                q6 = new Q(u6, cVar);
            }
        } else {
            q6 = new Q(u6, cVar);
        }
        Object obj = q6.f12267l;
        a aVar = a.f13292h;
        int i3 = q6.f12269n;
        if (i3 == 0) {
            V.O(obj);
            i iVar = u6.f12275v;
            if (iVar != null) {
                j jVar = new j(iVar);
                m mVar = u6.f12274u;
                q6.f12266k = u6;
                q6.f12269n = 1;
                if (mVar.a(jVar, q6) == aVar) {
                    return aVar;
                }
            }
            return x.f10867a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u6 = q6.f12266k;
        V.O(obj);
        u6.f12275v = null;
        return x.f10867a;
    }

    public final void A0() {
        i iVar = this.f12275v;
        if (iVar != null) {
            this.f12274u.b(new j(iVar));
            this.f12275v = null;
        }
    }

    @Override // p124x0.k0
    public final void X() {
        A0();
    }

    @Override // p124x0.k0
    public final void f0(p091r0.i iVar, p091r0.j jVar, long j4) {
        if (jVar == p091r0.j.i) {
            int i = iVar.f11496c;
            if (i == 4) {
                AbstractC0336x.o(n0(), null, new S(this, null), 3);
            } else if (i == 5) {
                AbstractC0336x.o(n0(), null, new T(this, null), 3);
            }
        }
    }

    @Override // Z.n
    public final void s0() {
        A0();
    }
}
