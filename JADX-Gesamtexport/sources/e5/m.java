package e5;

import O1.B;
import S1.h0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p081p0.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f8783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d5.c f8784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f8785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m[] f8786h;
    public final Z2.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d5.i f8787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f8789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f8790m;

    public m(B b6, d5.c cVar, q qVar, m[] mVarArr) {
        E4.k.f("composer", b6);
        E4.k.f("json", cVar);
        this.f8783e = b6;
        this.f8784f = cVar;
        this.f8785g = qVar;
        this.f8786h = mVarArr;
        this.i = cVar.f8596b;
        this.f8787j = cVar.f8595a;
        int iOrdinal = qVar.ordinal();
        if (mVarArr != null) {
            m mVar = mVarArr[iOrdinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[iOrdinal] = this;
        }
    }

    @Override // p081p0.c, b5.d
    public final b5.b a(a5.g gVar) {
        m mVar;
        E4.k.f("descriptor", gVar);
        d5.c cVar = this.f8784f;
        q qVarJ = h.j(gVar, cVar);
        char c6 = qVarJ.f8805h;
        B b6 = this.f8783e;
        b6.d(c6);
        b6.f4438a = true;
        String str = this.f8789l;
        if (str != null) {
            String strB = this.f8790m;
            if (strB == null) {
                strB = gVar.b();
            }
            b6.a();
            q(str);
            b6.d(':');
            q(strB);
            this.f8789l = null;
            this.f8790m = null;
        }
        if (this.f8785g == qVarJ) {
            return this;
        }
        m[] mVarArr = this.f8786h;
        return (mVarArr == null || (mVar = mVarArr[qVarJ.ordinal()]) == null) ? new m(b6, cVar, qVarJ, mVarArr) : mVar;
    }

    @Override // p081p0.c
    public final void a0(a5.g gVar, int i) {
        E4.k.f("descriptor", gVar);
        int iOrdinal = this.f8785g.ordinal();
        boolean z5 = true;
        B b6 = this.f8783e;
        if (iOrdinal == 1) {
            if (!b6.f4438a) {
                b6.d(',');
            }
            b6.a();
            return;
        }
        if (iOrdinal == 2) {
            if (b6.f4438a) {
                this.f8788k = true;
                b6.a();
                return;
            }
            if (i % 2 == 0) {
                b6.d(',');
                b6.a();
            } else {
                b6.d(':');
                b6.j();
                z5 = false;
            }
            this.f8788k = z5;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.f8788k = true;
            }
            if (i == 1) {
                b6.d(',');
                b6.j();
                this.f8788k = false;
                return;
            }
            return;
        }
        if (!b6.f4438a) {
            b6.d(',');
        }
        b6.a();
        d5.c cVar = this.f8784f;
        E4.k.f("json", cVar);
        h.i(gVar, cVar);
        q(gVar.f(i));
        b6.d(':');
        b6.j();
    }

    @Override // p081p0.c, b5.b
    public final void b(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        q qVar = this.f8785g;
        B b6 = this.f8783e;
        b6.getClass();
        b6.f4438a = false;
        b6.d(qVar.i);
    }

    @Override // b5.d
    public final Z2.f c() {
        return this.i;
    }

    @Override // p081p0.c, b5.d
    public final void d(a5.g gVar, int i) {
        E4.k.f("enumDescriptor", gVar);
        q(gVar.f(i));
    }

    @Override // b5.d
    public final void e() {
        this.f8783e.g("null");
    }

    @Override // p081p0.c, b5.d
    public final void f(double d6) {
        boolean z5 = this.f8788k;
        B b6 = this.f8783e;
        if (z5) {
            q(String.valueOf(d6));
        } else {
            ((K3.e) b6.f4439b).m(String.valueOf(d6));
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6)) {
            throw h.a(Double.valueOf(d6), ((K3.e) b6.f4439b).toString());
        }
    }

    @Override // p081p0.c, b5.d
    public final void g(short s6) {
        if (this.f8788k) {
            q(String.valueOf((int) s6));
        } else {
            this.f8783e.h(s6);
        }
    }

    @Override // p081p0.c, b5.d
    public final void h(byte b6) {
        if (this.f8788k) {
            q(String.valueOf((int) b6));
        } else {
            this.f8783e.c(b6);
        }
    }

    @Override // p081p0.c, b5.d
    public final void i(boolean z5) {
        if (this.f8788k) {
            q(String.valueOf(z5));
        } else {
            ((K3.e) this.f8783e.f4439b).m(String.valueOf(z5));
        }
    }

    @Override // p081p0.c, b5.d
    public final void j(int i) {
        if (this.f8788k) {
            q(String.valueOf(i));
        } else {
            this.f8783e.e(i);
        }
    }

    @Override // p081p0.c, b5.d
    public final b5.d k(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        boolean zA = n.a(gVar);
        q qVar = this.f8785g;
        d5.c cVar = this.f8784f;
        B dVar = this.f8783e;
        if (zA) {
            if (!(dVar instanceof e)) {
                dVar = new e((K3.e) dVar.f4439b, this.f8788k);
            }
            return new m(dVar, cVar, qVar, null);
        }
        if (gVar.g() && gVar.equals(d5.k.f8618a)) {
            if (!(dVar instanceof d)) {
                dVar = new d((K3.e) dVar.f4439b, this.f8788k);
            }
            return new m(dVar, cVar, qVar, null);
        }
        if (this.f8789l != null) {
            this.f8790m = gVar.b();
        }
        return this;
    }

    @Override // p081p0.c, b5.d
    public final void l(float f6) {
        boolean z5 = this.f8788k;
        B b6 = this.f8783e;
        if (z5) {
            q(String.valueOf(f6));
        } else {
            ((K3.e) b6.f4439b).m(String.valueOf(f6));
        }
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            throw h.a(Float.valueOf(f6), ((K3.e) b6.f4439b).toString());
        }
    }

    @Override // p081p0.c, b5.d
    public final void m(long j4) {
        if (this.f8788k) {
            q(String.valueOf(j4));
        } else {
            this.f8783e.f(j4);
        }
    }

    @Override // p081p0.c, b5.b
    public final void n(a5.g gVar, int i, Y4.a aVar, Object obj) {
        E4.k.f("descriptor", gVar);
        E4.k.f("serializer", aVar);
        if (obj != null || this.f8787j.f8613c) {
            super.n(gVar, i, aVar, obj);
        }
    }

    @Override // p081p0.c, b5.d
    public final void o(char c6) {
        q(String.valueOf(c6));
    }

    @Override // p081p0.c, b5.b
    public final boolean p(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        return this.f8787j.f8611a;
    }

    @Override // p081p0.c, b5.d
    public final void q(String str) {
        E4.k.f("value", str);
        this.f8783e.i(str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // p081p0.c, b5.d
    public final void r(Y4.a aVar, Object obj) {
        String strE;
        E4.k.f("serializer", aVar);
        d5.c cVar = this.f8784f;
        d5.i iVar = cVar.f8595a;
        boolean z5 = aVar instanceof Y4.c;
        if (!z5) {
            int iOrdinal = iVar.f8617g.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    h0 h0VarC = aVar.getDescriptor().c();
                    if (E4.k.a(h0VarC, a5.j.f6374j) || E4.k.a(h0VarC, a5.j.f6377m)) {
                        strE = h.e(aVar.getDescriptor(), cVar);
                    }
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            strE = null;
        } else if (iVar.f8617g != d5.a.f8592h) {
            strE = h.e(aVar.getDescriptor(), cVar);
        } else {
            strE = null;
        }
        if (!z5) {
            if (strE != null) {
                String strB = aVar.getDescriptor().b();
                this.f8789l = strE;
                this.f8790m = strB;
            }
            aVar.serialize(this, obj);
            return;
        }
        Y4.c cVar2 = (Y4.c) aVar;
        if (obj != null) {
            h0.l(cVar2, this, obj);
            throw null;
        }
        throw new IllegalArgumentException(("Value for serializer " + cVar2.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
    }
}
