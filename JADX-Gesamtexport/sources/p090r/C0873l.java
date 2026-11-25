package p090r;

import G4.a;
import N.C0208d;
import N.C0217h0;
import N.U;
import N.W;
import S0.j;
import S0.k;
import Z.g;
import java.util.LinkedHashMap;
import p080p.C;
import p080p.x;
import p096s.i0;
import p096s.k0;
import p096s.o0;
import p096s.v0;
import p096s.w0;

/* JADX INFO: renamed from: r.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873l implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f11412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f11413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f11414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f11415d = C0208d.K(new j(0), U.f3673m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f11416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f11417f;

    public C0873l(o0 o0Var, g gVar, k kVar) {
        this.f11412a = o0Var;
        this.f11413b = gVar;
        this.f11414c = kVar;
        long[] jArr = C.f10714a;
        this.f11416e = new x();
    }

    public static final long d(C0873l c0873l) {
        i0 i0Var = c0873l.f11417f;
        return i0Var != null ? ((j) i0Var.getValue()).f4896a : ((j) c0873l.f11415d.getValue()).f4896a;
    }

    public static G e(C0873l c0873l, int i, v0 v0Var) {
        int i3 = 1;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        c0873l.getClass();
        if (i != 0) {
            k kVar = k.f4897h;
            if (i != 4 || c0873l.f11414c != kVar) {
                k kVar2 = k.i;
                if (i != 5 || c0873l.f11414c != kVar2) {
                    if (i == 1 || ((i == 4 && c0873l.f11414c == kVar2) || (i == 5 && c0873l.f11414c == kVar))) {
                        C0871j c0871j = new C0871j(c0873l, i8);
                        w0 w0Var = B.f11351a;
                        return new G(new Q((I) null, new O(new W(c0871j, 2), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                    }
                    if (i == 2) {
                        C0871j c0871j2 = new C0871j(c0873l, i7);
                        w0 w0Var2 = B.f11351a;
                        return new G(new Q((I) null, new O(new W(c0871j2, 3), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                    }
                    if (i != 3) {
                        return G.f11374b;
                    }
                    C0871j c0871j3 = new C0871j(c0873l, i6);
                    w0 w0Var3 = B.f11351a;
                    return new G(new Q((I) null, new O(new W(c0871j3, 3), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                }
            }
        }
        C0871j c0871j4 = new C0871j(c0873l, i3);
        w0 w0Var4 = B.f11351a;
        return new G(new Q((I) null, new O(new W(c0871j4, 2), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
    }

    public static H f(C0873l c0873l, int i, v0 v0Var) {
        int i3 = 5;
        c0873l.getClass();
        if (i != 0) {
            k kVar = k.f4897h;
            if (i != 4 || c0873l.f11414c != kVar) {
                k kVar2 = k.i;
                if (i != 5 || c0873l.f11414c != kVar2) {
                    if (i == 1 || ((i == 4 && c0873l.f11414c == kVar2) || (i == 5 && c0873l.f11414c == kVar))) {
                        C0871j c0871j = new C0871j(c0873l, 6);
                        w0 w0Var = B.f11351a;
                        return new H(new Q((I) null, new O(new W(c0871j, 4), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                    }
                    if (i == 2) {
                        C0871j c0871j2 = new C0871j(c0873l, 7);
                        w0 w0Var2 = B.f11351a;
                        return new H(new Q((I) null, new O(new W(c0871j2, 5), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                    }
                    if (i != 3) {
                        return H.f11376b;
                    }
                    C0871j c0871j3 = new C0871j(c0873l, 8);
                    w0 w0Var3 = B.f11351a;
                    return new H(new Q((I) null, new O(new W(c0871j3, 5), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
                }
            }
        }
        C0871j c0871j4 = new C0871j(c0873l, i3);
        w0 w0Var4 = B.f11351a;
        return new H(new Q((I) null, new O(new W(c0871j4, 4), v0Var), (t) null, (a) null, (LinkedHashMap) null, 61));
    }

    @Override // p096s.k0
    public final Object b() {
        return this.f11412a.f().b();
    }

    @Override // p096s.k0
    public final Object c() {
        return this.f11412a.f().c();
    }
}
