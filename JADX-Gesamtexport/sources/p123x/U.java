package p123x;

import B.C0017i0;
import E4.k;
import S0.a;
import Z.f;
import java.util.List;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1030m;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class U implements F, Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1073f f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13718b;

    public U(InterfaceC1073f interfaceC1073f, f fVar) {
        this.f13717a = interfaceC1073f;
        this.f13718b = fVar;
    }

    @Override // p113v0.F
    public final int a(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13717a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            E e6 = (E) list.get(i6);
            float fD = AbstractC1070c.d(AbstractC1070c.c(e6));
            int iU = e6.U(i);
            if (fD == 0.0f) {
                i3 += iU;
            } else if (fD > 0.0f) {
                f6 += fD;
                iMax = Math.max(iMax, Math.round(iU / fD));
            }
        }
        return ((list.size() - 1) * iH) + Math.round(iMax * f6) + i3;
    }

    @Override // p123x.Q
    public final G b(N[] nArr, H h6, int[] iArr, int i, int i3) {
        return h6.u(i, i3, v.f11238h, new C0017i0(nArr, this, i3, iArr));
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        return AbstractC1070c.e(this, a.j(j4), a.i(j4), a.h(j4), a.g(j4), h6.H(this.f13717a.a()), h6, list, new N[list.size()], list.size());
    }

    @Override // p123x.Q
    public final long d(int i, int i3, int i6, boolean z5) {
        if (!z5) {
            return c.t(i, i3, 0, i6);
        }
        int iMin = Math.min(i, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int iC = c.C(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return c.t(iMin, iMin2, Math.min(iC, 0), i6 != Integer.MAX_VALUE ? Math.min(iC, i6) : Integer.MAX_VALUE);
    }

    @Override // p113v0.F
    public final int e(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13717a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            E e6 = (E) list.get(i6);
            float fD = AbstractC1070c.d(AbstractC1070c.c(e6));
            int iY = e6.Y(i);
            if (fD == 0.0f) {
                i3 += iY;
            } else if (fD > 0.0f) {
                f6 += fD;
                iMax = Math.max(iMax, Math.round(iY / fD));
            }
        }
        return ((list.size() - 1) * iH) + Math.round(iMax * f6) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return k.a(this.f13717a, u6.f13717a) && k.a(this.f13718b, u6.f13718b);
    }

    @Override // p123x.Q
    public final void f(int i, H h6, int[] iArr, int[] iArr2) {
        this.f13717a.b(h6, i, iArr, h6.getLayoutDirection(), iArr2);
    }

    @Override // p113v0.F
    public final int g(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13717a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iH, i);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            E e6 = (E) list.get(i3);
            float fD = AbstractC1070c.d(AbstractC1070c.c(e6));
            if (fD == 0.0f) {
                int iMin2 = Math.min(e6.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, e6.d(iMin2));
            } else if (fD > 0.0f) {
                f6 += fD;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f6);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            E e7 = (E) list.get(i6);
            float fD2 = AbstractC1070c.d(AbstractC1070c.c(e7));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, e7.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p123x.Q
    public final int h(N n6) {
        return n6.i;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13718b.f5949a) + (this.f13717a.hashCode() * 31);
    }

    @Override // p113v0.F
    public final int i(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13717a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iH, i);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            E e6 = (E) list.get(i3);
            float fD = AbstractC1070c.d(AbstractC1070c.c(e6));
            if (fD == 0.0f) {
                int iMin2 = Math.min(e6.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, e6.Z(iMin2));
            } else if (fD > 0.0f) {
                f6 += fD;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f6);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            E e7 = (E) list.get(i6);
            float fD2 = AbstractC1070c.d(AbstractC1070c.c(e7));
            if (fD2 > 0.0f) {
                iMax = Math.max(iMax, e7.Z(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p123x.Q
    public final int j(N n6) {
        return n6.f13137h;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f13717a + ", verticalAlignment=" + this.f13718b + ')';
    }
}
