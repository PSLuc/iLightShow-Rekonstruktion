package p123x;

import E4.k;
import S0.a;
import Z.e;
import java.util.List;
import p081p0.c;
import p089q4.v;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.InterfaceC1030m;
import p113v0.N;

/* JADX INFO: renamed from: x.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1090x implements F, Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1076i f13816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13817b;

    public C1090x(InterfaceC1076i interfaceC1076i, e eVar) {
        this.f13816a = interfaceC1076i;
        this.f13817b = eVar;
    }

    @Override // p113v0.F
    public final int a(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13816a.a());
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
                int iMin2 = Math.min(e6.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, e6.U(iMin2));
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
                iMax = Math.max(iMax, e7.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p123x.Q
    public final G b(N[] nArr, H h6, int[] iArr, int i, int i3) {
        return h6.u(i3, i, v.f11238h, new C1089w(nArr, this, i3, h6, iArr));
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        return AbstractC1070c.e(this, a.i(j4), a.j(j4), a.g(j4), a.h(j4), h6.H(this.f13816a.a()), h6, list, new N[list.size()], list.size());
    }

    @Override // p123x.Q
    public final long d(int i, int i3, int i6, boolean z5) {
        if (!z5) {
            return c.t(0, i6, i, i3);
        }
        int iMin = Math.min(i, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int iC = c.C(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return c.t(Math.min(iC, 0), i6 != Integer.MAX_VALUE ? Math.min(iC, i6) : Integer.MAX_VALUE, iMin, iMin2);
    }

    @Override // p113v0.F
    public final int e(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13816a.a());
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
                int iMin2 = Math.min(e6.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, e6.Y(iMin2));
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
                iMax = Math.max(iMax, e7.Y(iRound != Integer.MAX_VALUE ? Math.round(iRound * fD2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1090x)) {
            return false;
        }
        C1090x c1090x = (C1090x) obj;
        return k.a(this.f13816a, c1090x.f13816a) && this.f13817b.equals(c1090x.f13817b);
    }

    @Override // p123x.Q
    public final void f(int i, H h6, int[] iArr, int[] iArr2) {
        this.f13816a.c(i, h6, iArr, iArr2);
    }

    @Override // p113v0.F
    public final int g(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13816a.a());
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
            int iD = e6.d(i);
            if (fD == 0.0f) {
                i3 += iD;
            } else if (fD > 0.0f) {
                f6 += fD;
                iMax = Math.max(iMax, Math.round(iD / fD));
            }
        }
        return ((list.size() - 1) * iH) + Math.round(iMax * f6) + i3;
    }

    @Override // p123x.Q
    public final int h(N n6) {
        return n6.f13137h;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13817b.f5948a) + (this.f13816a.hashCode() * 31);
    }

    @Override // p113v0.F
    public final int i(InterfaceC1030m interfaceC1030m, List list, int i) {
        int iH = interfaceC1030m.H(this.f13816a.a());
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
            int iZ = e6.Z(i);
            if (fD == 0.0f) {
                i3 += iZ;
            } else if (fD > 0.0f) {
                f6 += fD;
                iMax = Math.max(iMax, Math.round(iZ / fD));
            }
        }
        return ((list.size() - 1) * iH) + Math.round(iMax * f6) + i3;
    }

    @Override // p123x.Q
    public final int j(N n6) {
        return n6.i;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f13816a + ", horizontalAlignment=" + this.f13817b + ')';
    }
}
