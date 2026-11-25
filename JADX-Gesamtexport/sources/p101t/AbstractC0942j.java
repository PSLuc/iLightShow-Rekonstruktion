package p101t;

import D4.a;
import E0.e;
import E0.g;
import E0.h;
import E4.k;
import P4.AbstractC0336x;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p024e0.c;
import p024e0.q;
import p058l0.I;
import p081p0.d;
import p091r0.A;
import p091r0.u;
import p117w.i;
import p117w.j;
import p117w.m;
import p117w.n;
import p117w.o;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.InterfaceC1104l;
import p124x0.k0;
import p124x0.m0;
import p124x0.p0;

/* JADX INFO: renamed from: t.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0942j extends AbstractC1105m implements k0, d, c, m0, p0 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final j0 f12347N = new j0(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12348A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f12349B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final K f12351D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public A f12352E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C f12353F;
    public o G;
    public i H;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public m f12354K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12355L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final j0 f12356M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m f12357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D f12358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f12360z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final G f12350C = new G();
    public final LinkedHashMap I = new LinkedHashMap();
    public long J = 0;

    public AbstractC0942j(m mVar, D d6, boolean z5, String str, e eVar, a aVar) {
        this.f12357w = mVar;
        this.f12358x = d6;
        this.f12359y = str;
        this.f12360z = eVar;
        this.f12348A = z5;
        this.f12349B = aVar;
        this.f12351D = new K(mVar);
        m mVar2 = this.f12357w;
        this.f12354K = mVar2;
        this.f12355L = mVar2 == null && this.f12358x != null;
        this.f12356M = f12347N;
    }

    public void B0(h hVar) {
    }

    public abstract Object C0(A a6, C0941i c0941i);

    public final void D0() {
        m mVar = this.f12357w;
        LinkedHashMap linkedHashMap = this.I;
        if (mVar != null) {
            o oVar = this.G;
            if (oVar != null) {
                mVar.b(new n(oVar));
            }
            i iVar = this.H;
            if (iVar != null) {
                mVar.b(new j(iVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                mVar.b(new n((o) it.next()));
            }
        }
        this.G = null;
        this.H = null;
        linkedHashMap.clear();
    }

    public final void E0() {
        if (this.f12353F == null && this.f12358x != null) {
            if (this.f12357w == null) {
                this.f12357w = new m();
            }
            this.f12351D.B0(this.f12357w);
            m mVar = this.f12357w;
            k.c(mVar);
            C c6 = new C(mVar);
            y0(c6);
            this.f12353F = c6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    public final void F0(m mVar, D d6, boolean z5, String str, e eVar, a aVar) {
        boolean z6;
        boolean z7;
        InterfaceC1104l interfaceC1104l;
        boolean z8 = false;
        if (k.a(this.f12354K, mVar)) {
            z6 = false;
        } else {
            D0();
            this.f12354K = mVar;
            this.f12357w = mVar;
            z6 = true;
        }
        if (!k.a(this.f12358x, d6)) {
            this.f12358x = d6;
            z6 = true;
        }
        boolean z9 = this.f12348A;
        K k3 = this.f12351D;
        if (z9 != z5) {
            InterfaceC1104l interfaceC1104l2 = this.f12350C;
            if (z5) {
                y0(interfaceC1104l2);
                y0(k3);
            } else {
                z0(interfaceC1104l2);
                z0(k3);
                D0();
            }
            AbstractC1098f.n(this);
            this.f12348A = z5;
        }
        if (!k.a(this.f12359y, str)) {
            this.f12359y = str;
            AbstractC1098f.n(this);
        }
        if (!k.a(this.f12360z, eVar)) {
            this.f12360z = eVar;
            AbstractC1098f.n(this);
        }
        this.f12349B = aVar;
        boolean z10 = this.f12355L;
        m mVar2 = this.f12354K;
        if (z10 != (mVar2 == null && this.f12358x != null)) {
            if (mVar2 == null && this.f12358x != null) {
                z8 = true;
            }
            this.f12355L = z8;
            z7 = (z8 || this.f12353F != null) ? z6 : true;
        }
        if (z7 && ((interfaceC1104l = this.f12353F) != null || !this.f12355L)) {
            if (interfaceC1104l != null) {
                z0(interfaceC1104l);
            }
            this.f12353F = null;
            E0();
        }
        k3.B0(this.f12357w);
    }

    @Override // p024e0.c
    public final void J(q qVar) {
        if (qVar.a()) {
            E0();
        }
        if (this.f12348A) {
            this.f12351D.J(qVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    @Override // p081p0.d
    public final boolean K(KeyEvent keyEvent) {
        int iK0;
        o oVar;
        int iK1;
        E0();
        boolean z5 = this.f12348A;
        LinkedHashMap linkedHashMap = this.I;
        if (z5) {
            int i = AbstractC0955x.f12440b;
            if (p081p0.c.o0(keyEvent) == 2 && ((iK1 = (int) (p081p0.c.k0(keyEvent) >> 32)) == 23 || iK1 == 66 || iK1 == 160)) {
                if (!linkedHashMap.containsKey(new p081p0.a(p020d2.n.b(keyEvent.getKeyCode())))) {
                    o oVar2 = new o(this.J);
                    linkedHashMap.put(new p081p0.a(p020d2.n.b(keyEvent.getKeyCode())), oVar2);
                    if (this.f12357w != null) {
                        AbstractC0336x.o(n0(), null, new C0937e(this, oVar2, null), 3);
                    }
                    return true;
                }
            } else if (this.f12348A) {
                int i3 = AbstractC0955x.f12440b;
                if (p081p0.c.o0(keyEvent) == 1) {
                    iK0 = (int) (p081p0.c.k0(keyEvent) >> 32);
                    if (iK0 == 23 && iK0 != 66 && iK0 != 160) {
                        return false;
                    }
                    oVar = (o) linkedHashMap.remove(new p081p0.a(p020d2.n.b(keyEvent.getKeyCode())));
                    if (oVar != null && this.f12357w != null) {
                        AbstractC0336x.o(n0(), null, new C0938f(this, oVar, null), 3);
                    }
                    this.f12349B.invoke();
                    return true;
                }
            }
        } else if (this.f12348A) {
            int i6 = AbstractC0955x.f12440b;
            if (p081p0.c.o0(keyEvent) == 1) {
                iK0 = (int) (p081p0.c.k0(keyEvent) >> 32);
                if (iK0 == 23) {
                }
                oVar = (o) linkedHashMap.remove(new p081p0.a(p020d2.n.b(keyEvent.getKeyCode())));
                if (oVar != null) {
                    AbstractC0336x.o(n0(), null, new C0938f(this, oVar, null), 3);
                }
                this.f12349B.invoke();
                return true;
            }
        }
        return false;
    }

    @Override // p124x0.k0
    public final void X() {
        i iVar;
        m mVar = this.f12357w;
        if (mVar != null && (iVar = this.H) != null) {
            mVar.b(new j(iVar));
        }
        this.H = null;
        A a6 = this.f12352E;
        if (a6 != null) {
            a6.X();
        }
    }

    @Override // p124x0.m0
    public final boolean Z() {
        return true;
    }

    @Override // p124x0.k0
    public final void f0(p091r0.i iVar, p091r0.j jVar, long j4) {
        long j6 = ((j4 >> 33) << 32) | (((j4 << 32) >> 33) & 4294967295L);
        this.J = p081p0.c.y((int) (j6 >> 32), (int) (j6 & 4294967295L));
        E0();
        if (this.f12348A && jVar == p091r0.j.i) {
            int i = iVar.f11496c;
            if (i == 4) {
                AbstractC0336x.o(n0(), null, new C0939g(this, null), 3);
            } else if (i == 5) {
                AbstractC0336x.o(n0(), null, new C0940h(this, null), 3);
            }
        }
        if (this.f12352E == null) {
            C0941i c0941i = new C0941i(this, null);
            p091r0.i iVar2 = u.f11534a;
            A a6 = new A(null, null, null, c0941i);
            y0(a6);
            this.f12352E = a6;
        }
        A a7 = this.f12352E;
        if (a7 != null) {
            a7.f0(iVar, jVar, j4);
        }
    }

    @Override // p124x0.m0
    public final void g0(h hVar) {
        e eVar = this.f12360z;
        if (eVar != null) {
            E0.q.g(hVar, eVar.f911a);
        }
        String str = this.f12359y;
        I i = new I(6, this);
        K4.e[] eVarArr = E0.q.f997a;
        hVar.i(g.f915b, new E0.a(str, i));
        if (this.f12348A) {
            this.f12351D.g0(hVar);
        } else {
            E0.q.c(hVar);
        }
        B0(hVar);
    }

    @Override // p081p0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // p124x0.p0
    public final Object o() {
        return this.f12356M;
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    @Override // Z.n
    public final void r0() {
        if (!this.f12355L) {
            E0();
        }
        if (this.f12348A) {
            y0(this.f12350C);
            y0(this.f12351D);
        }
    }

    @Override // Z.n
    public final void s0() {
        D0();
        if (this.f12354K == null) {
            this.f12357w = null;
        }
        C c6 = this.f12353F;
        if (c6 != null) {
            z0(c6);
        }
        this.f12353F = null;
    }
}
