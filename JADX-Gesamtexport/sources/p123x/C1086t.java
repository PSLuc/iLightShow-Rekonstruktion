package p123x;

import E4.k;
import E4.u;
import S0.a;
import S1.V;
import Z.c;
import java.util.List;
import p089q4.v;
import p113v0.E;
import p113v0.F;
import p113v0.G;
import p113v0.H;
import p113v0.N;

/* JADX INFO: renamed from: x.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1086t implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13808b;

    public C1086t(c cVar, boolean z5) {
        this.f13807a = cVar;
        this.f13808b = z5;
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        int iJ;
        int i;
        N nC;
        boolean zIsEmpty = list.isEmpty();
        v vVar = v.f11238h;
        if (zIsEmpty) {
            return h6.u(a.j(j4), a.i(j4), vVar, C1082o.f13787j);
        }
        long jA = this.f13808b ? j4 : a.a(j4, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            E e6 = (E) list.get(0);
            Object objI = e6.i();
            C1080m c1080m = objI instanceof C1080m ? (C1080m) objI : null;
            if (c1080m != null ? c1080m.f13785v : false) {
                iJ = a.j(j4);
                i = a.i(j4);
                int iJ2 = a.j(j4);
                int i3 = a.i(j4);
                if (!(iJ2 >= 0 && i3 >= 0)) {
                    V.N("width(" + iJ2 + ") and height(" + i3 + ") must be >= 0");
                    throw null;
                }
                nC = e6.c(p081p0.c.W(iJ2, iJ2, i3, i3));
            } else {
                nC = e6.c(jA);
                iJ = Math.max(a.j(j4), nC.f13137h);
                i = Math.max(a.i(j4), nC.i);
            }
            int i6 = i;
            int i7 = iJ;
            return h6.u(i7, i6, vVar, new r(nC, e6, h6, i7, i6, this));
        }
        N[] nArr = new N[list.size()];
        u uVar = new u();
        uVar.f1072h = a.j(j4);
        u uVar2 = new u();
        uVar2.f1072h = a.i(j4);
        int size = list.size();
        boolean z5 = false;
        for (int i8 = 0; i8 < size; i8++) {
            E e7 = (E) list.get(i8);
            Object objI2 = e7.i();
            C1080m c1080m2 = objI2 instanceof C1080m ? (C1080m) objI2 : null;
            if (c1080m2 != null ? c1080m2.f13785v : false) {
                z5 = true;
            } else {
                N nC2 = e7.c(jA);
                nArr[i8] = nC2;
                uVar.f1072h = Math.max(uVar.f1072h, nC2.f13137h);
                uVar2.f1072h = Math.max(uVar2.f1072h, nC2.i);
            }
        }
        if (z5) {
            int i9 = uVar.f1072h;
            int i10 = i9 != Integer.MAX_VALUE ? i9 : 0;
            int i11 = uVar2.f1072h;
            long jT = p081p0.c.t(i10, i9, i11 != Integer.MAX_VALUE ? i11 : 0, i11);
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                E e8 = (E) list.get(i12);
                Object objI3 = e8.i();
                C1080m c1080m3 = objI3 instanceof C1080m ? (C1080m) objI3 : null;
                if (c1080m3 != null ? c1080m3.f13785v : false) {
                    nArr[i12] = e8.c(jT);
                }
            }
        }
        return h6.u(uVar.f1072h, uVar2.f1072h, vVar, new C1085s(nArr, list, h6, uVar, uVar2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1086t)) {
            return false;
        }
        C1086t c1086t = (C1086t) obj;
        return k.a(this.f13807a, c1086t.f13807a) && this.f13808b == c1086t.f13808b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13808b) + (this.f13807a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f13807a + ", propagateMinConstraints=" + this.f13808b + ')';
    }
}
