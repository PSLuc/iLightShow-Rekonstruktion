package p124x0;

import E4.k;
import p058l0.I;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f13907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13908b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13914h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13922q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public H f13924s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13909c = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I f13923r = new I(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13925t = c.u(0, 0, 15);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final I f13926u = new I(14, this);

    public J(D d6) {
        this.f13907a = d6;
    }

    public final Y a() {
        return (Y) this.f13907a.f13828C.f3794d;
    }

    public final void b(int i) {
        int i3 = this.f13919n;
        this.f13919n = i;
        if ((i3 == 0) != (i == 0)) {
            D dR = this.f13907a.r();
            J j4 = dR != null ? dR.f13829D : null;
            if (j4 != null) {
                if (i == 0) {
                    j4.b(j4.f13919n - 1);
                } else {
                    j4.b(j4.f13919n + 1);
                }
            }
        }
    }

    public final void c(int i) {
        int i3 = this.f13922q;
        this.f13922q = i;
        if ((i3 == 0) != (i == 0)) {
            D dR = this.f13907a.r();
            J j4 = dR != null ? dR.f13829D : null;
            if (j4 != null) {
                if (i == 0) {
                    j4.c(j4.f13922q - 1);
                } else {
                    j4.c(j4.f13922q + 1);
                }
            }
        }
    }

    public final void d(boolean z5) {
        if (this.f13918m != z5) {
            this.f13918m = z5;
            if (z5 && !this.f13917l) {
                b(this.f13919n + 1);
            } else {
                if (z5 || this.f13917l) {
                    return;
                }
                b(this.f13919n - 1);
            }
        }
    }

    public final void e(boolean z5) {
        if (this.f13917l != z5) {
            this.f13917l = z5;
            if (z5 && !this.f13918m) {
                b(this.f13919n + 1);
            } else {
                if (z5 || this.f13918m) {
                    return;
                }
                b(this.f13919n - 1);
            }
        }
    }

    public final void f(boolean z5) {
        if (this.f13921p != z5) {
            this.f13921p = z5;
            if (z5 && !this.f13920o) {
                c(this.f13922q + 1);
            } else {
                if (z5 || this.f13920o) {
                    return;
                }
                c(this.f13922q - 1);
            }
        }
    }

    public final void g(boolean z5) {
        if (this.f13920o != z5) {
            this.f13920o = z5;
            if (z5 && !this.f13921p) {
                c(this.f13922q + 1);
            } else {
                if (z5 || this.f13921p) {
                    return;
                }
                c(this.f13922q - 1);
            }
        }
    }

    public final void h() {
        I i = this.f13923r;
        Object obj = i.f13904x;
        D d6 = this.f13907a;
        J j4 = i.f13892M;
        if ((obj != null || j4.a().i() != null) && i.f13903w) {
            i.f13903w = false;
            i.f13904x = j4.a().i();
            D dR = d6.r();
            if (dR != null) {
                D.Q(dR, false, 7);
            }
        }
        H h6 = this.f13924s;
        if (h6 != null) {
            Object obj2 = h6.f13867C;
            J j6 = h6.f13869E;
            if (obj2 == null) {
                N nK0 = j6.a().K0();
                k.c(nK0);
                if (nK0.f13939s.i() == null) {
                    return;
                }
            }
            if (h6.f13866B) {
                h6.f13866B = false;
                N nK1 = j6.a().K0();
                k.c(nK1);
                h6.f13867C = nK1.f13939s.i();
                if (AbstractC1098f.o(d6)) {
                    D dR2 = d6.r();
                    if (dR2 != null) {
                        D.Q(dR2, false, 7);
                        return;
                    }
                    return;
                }
                D dR3 = d6.r();
                if (dR3 != null) {
                    D.O(dR3, false, 7);
                }
            }
        }
    }
}
