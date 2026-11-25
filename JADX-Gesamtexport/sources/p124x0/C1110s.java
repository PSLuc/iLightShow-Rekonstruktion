package p124x0;

import E4.k;
import P.d;
import c5.C0495p;
import p113v0.C1029l;
import p113v0.F;
import p113v0.N;

/* JADX INFO: renamed from: x0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1110s extends N {
    @Override // p124x0.N
    public final void B0() {
        H h6 = this.f13939s.f13989s.f13829D.f13924s;
        k.c(h6);
        h6.t0();
    }

    @Override // p113v0.E
    public final int U(int i) {
        C0495p c0495pQ = this.f13939s.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.a((Y) d6.f13828C.f3794d, d6.k(), i);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        C0495p c0495pQ = this.f13939s.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.e((Y) d6.f13828C.f3794d, d6.k(), i);
    }

    @Override // p113v0.E
    public final int Z(int i) {
        C0495p c0495pQ = this.f13939s.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.i((Y) d6.f13828C.f3794d, d6.k(), i);
    }

    @Override // p113v0.E
    public final N c(long j4) {
        o0(j4);
        Y y2 = this.f13939s;
        d dVarU = y2.f13989s.u();
        int i = dVarU.f4583j;
        if (i > 0) {
            Object[] objArr = dVarU.f4582h;
            int i3 = 0;
            do {
                H h6 = ((D) objArr[i3]).f13829D.f13924s;
                k.c(h6);
                h6.f13873p = 3;
                i3++;
            } while (i3 < i);
        }
        D d6 = y2.f13989s;
        N.A0(this, d6.f13848v.c(this, d6.k(), j4));
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        C0495p c0495pQ = this.f13939s.f13989s.q();
        F fS = c0495pQ.s();
        D d6 = (D) c0495pQ.i;
        return fS.g((Y) d6.f13828C.f3794d, d6.k(), i);
    }

    @Override // p124x0.M
    public final int p0(C1029l c1029l) {
        H h6 = this.f13939s.f13989s.f13829D.f13924s;
        k.c(h6);
        boolean z5 = h6.f13874q;
        E e6 = h6.f13881x;
        if (!z5) {
            J j4 = h6.f13869E;
            if (j4.f13909c == 2) {
                e6.f13858f = true;
                if (e6.f13854b) {
                    j4.f13914h = true;
                    j4.i = true;
                }
            } else {
                e6.f13859g = true;
            }
        }
        C1110s c1110s = h6.l().f14061R;
        if (c1110s != null) {
            c1110s.f13935o = true;
        }
        h6.A();
        C1110s c1110s2 = h6.l().f14061R;
        if (c1110s2 != null) {
            c1110s2.f13935o = false;
        }
        Integer num = (Integer) e6.i.get(c1029l);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f13944x.put(c1029l, Integer.valueOf(iIntValue));
        return iIntValue;
    }
}
