package O;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0227m0;
import N.C0230o;
import N.L;
import java.util.ArrayList;

/* JADX INFO: renamed from: O.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0305b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0230o f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0304a f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4352c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4356g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4360l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L f4353d = new L();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4354e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0227m0 f4357h = new C0227m0(1);
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4358j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4359k = -1;

    public C0305b(C0230o c0230o, C0304a c0304a) {
        this.f4350a = c0230o;
        this.f4351b = c0304a;
    }

    public final void a() {
        c();
        C0227m0 c0227m0 = this.f4357h;
        if (c0227m0.f3729h.isEmpty()) {
            this.f4356g++;
        } else {
            ArrayList arrayList = c0227m0.f3729h;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        Throwable th;
        int i;
        int i3 = this.f4356g;
        if (i3 > 0) {
            C0304a c0304a = this.f4351b;
            c0304a.getClass();
            A a6 = A.f4337c;
            D d6 = c0304a.f4349j;
            d6.M0(a6);
            p020d2.n.L(d6, 0, i3);
            int i6 = d6.f4347p;
            int i7 = a6.f4339a;
            th = null;
            int iF0 = D.F0(d6, i7);
            i = 1;
            int i8 = a6.f4340b;
            if (i6 != iF0 || d6.f4348q != D.F0(d6, i8)) {
                StringBuilder sb = new StringBuilder();
                int i9 = 0;
                for (int i10 = 0; i10 < i7; i10++) {
                    if (((1 << i10) & d6.f4347p) != 0) {
                        if (i9 > 0) {
                            sb.append(", ");
                        }
                        sb.append(a6.b(i10));
                        i9++;
                    }
                }
                String string = sb.toString();
                StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i8;
                    if (((1 << i11) & d6.f4348q) != 0) {
                        if (i9 > 0) {
                            sbN.append(", ");
                        }
                        sbN.append(a6.c(i11));
                        i12++;
                    }
                    i11++;
                    i8 = i13;
                }
                String string2 = sbN.toString();
                E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(a6);
                sb2.append(". Not all arguments were provided. Missing ");
                AbstractC0013g0.s(sb2, i9, " int arguments (", string, ") and ");
                AbstractC0013g0.u(sb2, i12, " object arguments (", string2, ").");
                throw null;
            }
            this.f4356g = 0;
        } else {
            th = null;
            i = 1;
        }
        C0227m0 c0227m0 = this.f4357h;
        if (c0227m0.f3729h.isEmpty()) {
            return;
        }
        C0304a c0304a2 = this.f4351b;
        ArrayList arrayList = c0227m0.f3729h;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i14] = arrayList.get(i14);
        }
        c0304a2.getClass();
        if (size != 0) {
            g gVar = g.f4366c;
            D d7 = c0304a2.f4349j;
            d7.M0(gVar);
            p020d2.n.M(d7, 0, objArr);
            int i15 = d7.f4347p;
            int i16 = gVar.f4339a;
            int iF1 = D.F0(d7, i16);
            int i17 = gVar.f4340b;
            if (i15 != iF1 || d7.f4348q != D.F0(d7, i17)) {
                StringBuilder sb3 = new StringBuilder();
                int i18 = 0;
                for (int i19 = 0; i19 < i16; i19++) {
                    if (((i << i19) & d7.f4347p) != 0) {
                        if (i18 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(gVar.b(i19));
                        i18++;
                    }
                }
                String string3 = sb3.toString();
                StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
                int i20 = 0;
                int i21 = 0;
                while (i20 < i17) {
                    int i22 = i17;
                    if (((i << i20) & d7.f4348q) != 0) {
                        if (i18 > 0) {
                            sbN2.append(", ");
                        }
                        sbN2.append(gVar.c(i20));
                        i21++;
                    }
                    i20++;
                    i17 = i22;
                }
                String string4 = sbN2.toString();
                E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(gVar);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0013g0.s(sb4, i18, " int arguments (", string3, ") and ");
                AbstractC0013g0.u(sb4, i21, " object arguments (", string4, ").");
                throw th;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.f4360l;
        if (i > 0) {
            int i3 = this.i;
            if (i3 >= 0) {
                b();
                C0304a c0304a = this.f4351b;
                c0304a.getClass();
                t tVar = t.f4383c;
                D d6 = c0304a.f4349j;
                d6.M0(tVar);
                p020d2.n.L(d6, 0, i3);
                p020d2.n.L(d6, 1, i);
                int i6 = d6.f4347p;
                int i7 = tVar.f4339a;
                int iF0 = D.F0(d6, i7);
                int i8 = tVar.f4340b;
                if (i6 != iF0 || d6.f4348q != D.F0(d6, i8)) {
                    StringBuilder sb = new StringBuilder();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < i7) {
                        int i11 = i7;
                        if ((d6.f4347p & (1 << i9)) != 0) {
                            if (i10 > 0) {
                                sb.append(", ");
                            }
                            sb.append(tVar.b(i9));
                            i10++;
                        }
                        i9++;
                        i7 = i11;
                    }
                    String string = sb.toString();
                    StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < i8) {
                        int i14 = i8;
                        if (((1 << i13) & d6.f4348q) != 0) {
                            if (i10 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(tVar.c(i13));
                            i12++;
                        }
                        i13++;
                        i8 = i14;
                    }
                    String string2 = sbN.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(tVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb2, i10, " int arguments (", string, ") and ");
                    AbstractC0013g0.u(sb2, i12, " object arguments (", string2, ").");
                    throw null;
                }
                this.i = -1;
            } else {
                int i15 = this.f4359k;
                int i16 = this.f4358j;
                b();
                C0304a c0304a2 = this.f4351b;
                c0304a2.getClass();
                q qVar = q.f4380c;
                D d7 = c0304a2.f4349j;
                d7.M0(qVar);
                p020d2.n.L(d7, 1, i15);
                p020d2.n.L(d7, 0, i16);
                p020d2.n.L(d7, 2, i);
                int i17 = d7.f4347p;
                int i18 = qVar.f4339a;
                int iF1 = D.F0(d7, i18);
                int i19 = qVar.f4340b;
                if (i17 != iF1 || d7.f4348q != D.F0(d7, i19)) {
                    StringBuilder sb3 = new StringBuilder();
                    int i20 = 0;
                    for (int i21 = 0; i21 < i18; i21++) {
                        if (((1 << i21) & d7.f4347p) != 0) {
                            if (i20 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(qVar.b(i21));
                            i20++;
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sbN2 = AbstractC0013g0.n(string3, "StringBuilder().apply(builderAction).toString()");
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i19) {
                        int i24 = i19;
                        if (((1 << i22) & d7.f4348q) != 0) {
                            if (i20 > 0) {
                                sbN2.append(", ");
                            }
                            sbN2.append(qVar.c(i22));
                            i23++;
                        }
                        i22++;
                        i19 = i24;
                    }
                    String string4 = sbN2.toString();
                    E4.k.e("StringBuilder().apply(builderAction).toString()", string4);
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(qVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0013g0.s(sb4, i20, " int arguments (", string3, ") and ");
                    AbstractC0013g0.u(sb4, i23, " object arguments (", string4, ").");
                    throw null;
                }
                this.f4358j = -1;
                this.f4359k = -1;
            }
            this.f4360l = 0;
        }
    }

    public final void d(boolean z5) {
        C0230o c0230o = this.f4350a;
        int i = z5 ? c0230o.f3738F.i : c0230o.f3738F.f3570g;
        int i3 = i - this.f4355f;
        if (!(i3 >= 0)) {
            C0208d.w("Tried to seek backward");
            throw null;
        }
        if (i3 > 0) {
            C0304a c0304a = this.f4351b;
            c0304a.getClass();
            C0307d c0307d = C0307d.f4363c;
            D d6 = c0304a.f4349j;
            d6.M0(c0307d);
            p020d2.n.L(d6, 0, i3);
            int i6 = d6.f4347p;
            int i7 = c0307d.f4339a;
            int iF0 = D.F0(d6, i7);
            int i8 = c0307d.f4340b;
            if (i6 == iF0 && d6.f4348q == D.F0(d6, i8)) {
                this.f4355f = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                if (((1 << i10) & d6.f4347p) != 0) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0307d.b(i10));
                    i9++;
                }
            }
            String string = sb.toString();
            StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                if (((1 << i12) & d6.f4348q) != 0) {
                    if (i9 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(c0307d.c(i12));
                    i11++;
                }
            }
            String string2 = sbN.toString();
            E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(c0307d);
            sb2.append(". Not all arguments were provided. Missing ");
            AbstractC0013g0.s(sb2, i9, " int arguments (", string, ") and ");
            AbstractC0013g0.u(sb2, i11, " object arguments (", string2, ").");
            throw null;
        }
    }

    public final void e(int i, int i3) {
        if (i3 > 0) {
            if (!(i >= 0)) {
                C0208d.w("Invalid remove index " + i);
                throw null;
            }
            if (this.i == i) {
                this.f4360l += i3;
                return;
            }
            c();
            this.i = i;
            this.f4360l = i3;
        }
    }
}
