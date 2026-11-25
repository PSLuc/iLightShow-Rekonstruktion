package p009b2;

import T1.m;
import V1.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements m, g, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f7068o = new h(" ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f7069h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f7070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient int f7072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f7073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7074n;

    public f() {
        this.f7069h = e.f7067h;
        this.i = d.f7064k;
        this.f7071k = true;
        this.f7070j = f7068o;
        this.f7073m = m.f5238d;
        this.f7074n = " : ";
    }

    @Override // T1.m
    public final void a(Y1.f fVar) {
        h hVar = this.f7070j;
        if (hVar != null) {
            fVar.h0(hVar);
        }
    }

    @Override // T1.m
    public final void b(Y1.f fVar, int i) {
        e eVar = this.f7069h;
        eVar.getClass();
        if (i > 0) {
            eVar.c(fVar, this.f7072l);
        } else {
            fVar.M0(' ');
        }
        fVar.M0(']');
    }

    @Override // T1.m
    public final void c(Y1.f fVar) {
        this.i.c(fVar, this.f7072l);
    }

    @Override // T1.m
    public final void e(Y1.f fVar) {
        this.f7073m.getClass();
        fVar.M0(',');
        this.f7069h.c(fVar, this.f7072l);
    }

    @Override // T1.m
    public final void f(Y1.f fVar) {
        this.f7069h.c(fVar, this.f7072l);
    }

    @Override // T1.m
    public final void g(Y1.f fVar) {
        if (this.f7071k) {
            fVar.i0(this.f7074n);
        } else {
            this.f7073m.getClass();
            fVar.M0(':');
        }
    }

    @Override // T1.m
    public final void h(Y1.f fVar, int i) {
        d dVar = this.i;
        dVar.getClass();
        int i3 = this.f7072l - 1;
        this.f7072l = i3;
        if (i > 0) {
            dVar.c(fVar, i3);
        } else {
            fVar.M0(' ');
        }
        fVar.M0('}');
    }

    @Override // T1.m
    public final void i(Y1.f fVar) {
        this.f7073m.getClass();
        fVar.M0(',');
        this.i.c(fVar, this.f7072l);
    }

    @Override // T1.m
    public final void j(Y1.f fVar) {
        fVar.M0('{');
        this.i.getClass();
        this.f7072l++;
    }

    @Override // T1.m
    public final void k(Y1.f fVar) {
        this.f7069h.getClass();
        fVar.M0('[');
    }

    public f(f fVar) {
        h hVar = fVar.f7070j;
        this.f7069h = e.f7067h;
        this.i = d.f7064k;
        this.f7071k = true;
        this.f7069h = fVar.f7069h;
        this.i = fVar.i;
        this.f7071k = fVar.f7071k;
        this.f7072l = fVar.f7072l;
        this.f7073m = fVar.f7073m;
        this.f7074n = fVar.f7074n;
        this.f7070j = hVar;
    }
}
