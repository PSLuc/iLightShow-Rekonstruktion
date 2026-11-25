package p112v;

import D4.c;
import E4.k;
import E4.l;
import R4.b;
import S1.V;
import p084p4.x;
import p091r0.A;
import p091r0.i;
import p091r0.j;
import p091r0.u;
import p117w.m;
import p124x0.AbstractC1105m;
import p124x0.InterfaceC1103k;
import p124x0.k0;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends AbstractC1105m implements k0, InterfaceC1103k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b f12859A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p117w.b f12860B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12861C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public A f12862D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public W f12863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f12864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f12866z;

    /* JADX WARN: Multi-variable type inference failed */
    public M(c cVar, boolean z5, m mVar, W w6) {
        this.f12863w = w6;
        this.f12864x = (l) cVar;
        this.f12865y = z5;
        this.f12866z = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B0(M m6, p122w4.c cVar) {
        H h6;
        m6.getClass();
        if (cVar instanceof H) {
            h6 = (H) cVar;
            int i = h6.f12818n;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6.f12818n = i - Integer.MIN_VALUE;
            } else {
                h6 = new H(m6, cVar);
            }
        } else {
            h6 = new H(m6, cVar);
        }
        Object obj = h6.f12816l;
        a aVar = a.f13292h;
        int i3 = h6.f12818n;
        if (i3 == 0) {
            V.O(obj);
            p117w.b bVar = m6.f12860B;
            if (bVar != null) {
                m mVar = m6.f12866z;
                if (mVar != null) {
                    p117w.a aVar2 = new p117w.a(bVar);
                    h6.f12815k = m6;
                    h6.f12818n = 1;
                    if (mVar.a(aVar2, h6) == aVar) {
                        return aVar;
                    }
                }
            }
            m6.H0(0L);
            return x.f10867a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m6 = h6.f12815k;
        V.O(obj);
        m6.f12860B = null;
        m6.H0(0L);
        return x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object C0(M m6, C1002s c1002s, p122w4.c cVar) {
        I i;
        m mVar;
        p117w.b bVar;
        M m7;
        p117w.b bVar2;
        m6.getClass();
        if (cVar instanceof I) {
            i = (I) cVar;
            int i3 = i.f12830p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i.f12830p = i3 - Integer.MIN_VALUE;
            } else {
                i = new I(m6, cVar);
            }
        } else {
            i = new I(m6, cVar);
        }
        Object obj = i.f12828n;
        a aVar = a.f13292h;
        int i6 = i.f12830p;
        if (i6 == 0) {
            V.O(obj);
            p117w.b bVar3 = m6.f12860B;
            if (bVar3 != null && (mVar = m6.f12866z) != null) {
                p117w.a aVar2 = new p117w.a(bVar3);
                i.f12825k = m6;
                i.f12826l = c1002s;
                i.f12830p = 1;
                if (mVar.a(aVar2, i) != aVar) {
                }
                return aVar;
            }
            m6.f12860B = bVar;
            m6.G0(c1002s.f13062a);
            return x.f10867a;
        }
        if (i6 == 1) {
            c1002s = i.f12826l;
            m6 = i.f12825k;
            V.O(obj);
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = i.f12827m;
            c1002s = i.f12826l;
            m7 = i.f12825k;
            V.O(obj);
        }
        bVar = bVar2;
        m6 = m7;
        m6.f12860B = bVar;
        m6.G0(c1002s.f13062a);
        return x.f10867a;
        bVar = new p117w.b();
        m mVar2 = m6.f12866z;
        if (mVar2 != null) {
            i.f12825k = m6;
            i.f12826l = c1002s;
            i.f12827m = bVar;
            i.f12830p = 2;
            if (mVar2.a(bVar, i) != aVar) {
                m7 = m6;
                bVar2 = bVar;
                bVar = bVar2;
                m6 = m7;
            }
            return aVar;
        }
        m6.f12860B = bVar;
        m6.G0(c1002s.f13062a);
        return x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object D0(M m6, C1004t c1004t, p122w4.c cVar) {
        J j4;
        m6.getClass();
        if (cVar instanceof J) {
            j4 = (J) cVar;
            int i = j4.f12841o;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4.f12841o = i - Integer.MIN_VALUE;
            } else {
                j4 = new J(m6, cVar);
            }
        } else {
            j4 = new J(m6, cVar);
        }
        Object obj = j4.f12839m;
        a aVar = a.f13292h;
        int i3 = j4.f12841o;
        if (i3 == 0) {
            V.O(obj);
            p117w.b bVar = m6.f12860B;
            if (bVar != null) {
                m mVar = m6.f12866z;
                if (mVar != null) {
                    p117w.c cVar2 = new p117w.c(bVar);
                    j4.f12837k = m6;
                    j4.f12838l = c1004t;
                    j4.f12841o = 1;
                    if (mVar.a(cVar2, j4) == aVar) {
                        return aVar;
                    }
                }
            }
            m6.H0(c1004t.f13063a);
            return x.f10867a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1004t = j4.f12838l;
        m6 = j4.f12837k;
        V.O(obj);
        m6.f12860B = null;
        m6.H0(c1004t.f13063a);
        return x.f10867a;
    }

    public final void E0() {
        p117w.b bVar = this.f12860B;
        if (bVar != null) {
            m mVar = this.f12866z;
            if (mVar != null) {
                mVar.b(new p117w.a(bVar));
            }
            this.f12860B = null;
        }
    }

    public abstract Object F0(K k3, L l6);

    public abstract void G0(long j4);

    public abstract void H0(long j4);

    public abstract boolean I0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(c cVar, boolean z5, m mVar, W w6, boolean z6) {
        A a6;
        this.f12864x = (l) cVar;
        boolean z7 = true;
        if (this.f12865y != z5) {
            this.f12865y = z5;
            if (!z5) {
                E0();
                A a7 = this.f12862D;
                if (a7 != null) {
                    z0(a7);
                }
                this.f12862D = null;
            }
            z6 = true;
        }
        if (!k.a(this.f12866z, mVar)) {
            E0();
            this.f12866z = mVar;
        }
        if (this.f12863w != w6) {
            this.f12863w = w6;
        } else {
            z7 = z6;
        }
        if (!z7 || (a6 = this.f12862D) == null) {
            return;
        }
        a6.A0();
    }

    @Override // p124x0.k0
    public final void X() {
        A a6 = this.f12862D;
        if (a6 != null) {
            a6.X();
        }
    }

    @Override // p124x0.k0
    public void f0(i iVar, j jVar, long j4) {
        if (this.f12865y && this.f12862D == null) {
            G g6 = new G(this, null);
            i iVar2 = u.f11534a;
            A a6 = new A(null, null, null, g6);
            y0(a6);
            this.f12862D = a6;
        }
        A a7 = this.f12862D;
        if (a7 != null) {
            a7.f0(iVar, jVar, j4);
        }
    }

    @Override // Z.n
    public final void s0() {
        this.f12861C = false;
        E0();
    }
}
