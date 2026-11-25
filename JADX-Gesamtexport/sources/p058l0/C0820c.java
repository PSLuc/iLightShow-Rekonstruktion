package p058l0;

import A2.e;
import B.C0031p0;
import D4.c;
import E4.l;
import java.util.ArrayList;
import java.util.List;
import p035g0.A;
import p035g0.AbstractC0712m;
import p035g0.C0706g;
import p035g0.C0715p;
import p035g0.H;
import p035g0.O;
import p035g0.r;
import p044i0.d;
import p089q4.u;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820c extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f10245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10246c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10247d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10248e = r.f9085l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f10249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0706g f10251h;
    public l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f10252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10261s;

    public C0820c() {
        int i = G.f10217a;
        this.f10249f = u.f11237h;
        this.f10250g = true;
        this.f10252j = new e(26, this);
        this.f10253k = "";
        this.f10257o = 1.0f;
        this.f10258p = 1.0f;
        this.f10261s = true;
    }

    @Override // p058l0.C
    public final void a(d dVar) {
        if (this.f10261s) {
            float[] fArrA = this.f10245b;
            if (fArrA == null) {
                fArrA = A.a();
                this.f10245b = fArrA;
            } else {
                A.d(fArrA);
            }
            A.h(fArrA, this.f10259q + this.f10255m, this.f10260r + this.f10256n);
            A.e(fArrA, this.f10254l);
            A.f(fArrA, this.f10257o, this.f10258p);
            A.h(fArrA, -this.f10255m, -this.f10256n);
            this.f10261s = false;
        }
        if (this.f10250g) {
            if (!this.f10249f.isEmpty()) {
                C0706g c0706gH = this.f10251h;
                if (c0706gH == null) {
                    c0706gH = H.h();
                    this.f10251h = c0706gH;
                }
                AbstractC0819b.d(this.f10249f, c0706gH);
            }
            this.f10250g = false;
        }
        C0031p0 c0031p0B = dVar.B();
        long jL = c0031p0B.l();
        c0031p0B.f().l();
        try {
            C0715p c0715p = (C0715p) c0031p0B.i;
            float[] fArr = this.f10245b;
            C0031p0 c0031p0 = (C0031p0) c0715p.i;
            if (fArr != null) {
                c0031p0.f().q(fArr);
            }
            C0706g c0706g = this.f10251h;
            if (!this.f10249f.isEmpty() && c0706g != null) {
                c0031p0.f().c(c0706g);
            }
            ArrayList arrayList = this.f10246c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C) arrayList.get(i)).a(dVar);
            }
        } finally {
            c0031p0B.f().i();
            c0031p0B.x(jL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D4.c, E4.l] */
    @Override // p058l0.C
    public final c b() {
        return this.i;
    }

    @Override // p058l0.C
    public final void d(e eVar) {
        this.i = eVar;
    }

    public final void e(int i, C c6) {
        ArrayList arrayList = this.f10246c;
        if (i < arrayList.size()) {
            arrayList.set(i, c6);
        } else {
            arrayList.add(c6);
        }
        g(c6);
        c6.d(this.f10252j);
        c();
    }

    public final void f(long j4) {
        if (this.f10247d && j4 != 16) {
            long j6 = this.f10248e;
            if (j6 == 16) {
                this.f10248e = j4;
                return;
            }
            int i = G.f10217a;
            if (r.h(j6) == r.h(j4) && r.g(j6) == r.g(j4) && r.e(j6) == r.e(j4)) {
                return;
            }
            this.f10247d = false;
            this.f10248e = r.f9085l;
        }
    }

    public final void g(C c6) {
        if (!(c6 instanceof C0825h)) {
            if (c6 instanceof C0820c) {
                C0820c c0820c = (C0820c) c6;
                if (c0820c.f10247d && this.f10247d) {
                    f(c0820c.f10248e);
                    return;
                } else {
                    this.f10247d = false;
                    this.f10248e = r.f9085l;
                    return;
                }
            }
            return;
        }
        C0825h c0825h = (C0825h) c6;
        AbstractC0712m abstractC0712m = c0825h.f10294b;
        if (this.f10247d && abstractC0712m != null) {
            if (abstractC0712m instanceof O) {
                f(((O) abstractC0712m).f9050a);
            } else {
                this.f10247d = false;
                this.f10248e = r.f9085l;
            }
        }
        AbstractC0712m abstractC0712m2 = c0825h.f10299g;
        if (this.f10247d && abstractC0712m2 != null) {
            if (abstractC0712m2 instanceof O) {
                f(((O) abstractC0712m2).f9050a);
            } else {
                this.f10247d = false;
                this.f10248e = r.f9085l;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f10253k);
        ArrayList arrayList = this.f10246c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C c6 = (C) arrayList.get(i);
            sb.append("\t");
            sb.append(c6.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
