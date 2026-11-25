package p096s;

import B.C0018j;
import C1.b;
import D4.c;
import E4.k;
import G4.a;
import N.AbstractC0204b;
import N.C0208d;
import N.C0213f0;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.C0245w;
import N.D;
import N.U;
import U4.d;
import X.s;
import p090r.C0870i;
import p090r.C0876o;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f12057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f12059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f12060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0213f0 f12061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0213f0 f12062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0217h0 f12063h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f12064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f12065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D f12066l;

    public o0(b bVar, o0 o0Var, String str) {
        this.f12056a = bVar;
        this.f12057b = o0Var;
        this.f12058c = str;
        Object objJ = bVar.j();
        U u6 = U.f3673m;
        this.f12059d = C0208d.K(objJ, u6);
        this.f12060e = C0208d.K(new l0(bVar.j(), bVar.j()), u6);
        int i = AbstractC0204b.f3683b;
        this.f12061f = new C0213f0(0L);
        this.f12062g = new C0213f0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f12063h = C0208d.K(bool, u6);
        this.i = new s();
        this.f12064j = new s();
        this.f12065k = C0208d.K(bool, u6);
        this.f12066l = C0208d.C(new C0876o(this, 1));
        bVar.n(this);
    }

    public final void a(Object obj, C0230o c0230o, int i) {
        c0230o.X(-1493585151);
        int i3 = (c0230o.f(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= c0230o.f(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else if (g()) {
            c0230o.V(1823992347);
            c0230o.p(false);
        } else {
            c0230o.V(1822507602);
            q(obj);
            if (k.a(obj, this.f12056a.j()) && this.f12062g.h() == Long.MIN_VALUE && !((Boolean) this.f12063h.getValue()).booleanValue()) {
                c0230o.V(1823982427);
                c0230o.p(false);
            } else {
                c0230o.V(1822738893);
                Object objK = c0230o.K();
                U u6 = C0222k.f3714a;
                if (objK == u6) {
                    C0245w c0245w = new C0245w(C0208d.y(c0230o));
                    c0230o.f0(c0245w);
                    objK = c0245w;
                }
                d dVar = ((C0245w) objK).f3838h;
                boolean zH = ((i3 & 112) == 32) | c0230o.h(dVar);
                Object objK2 = c0230o.K();
                if (zH || objK2 == u6) {
                    objK2 = new C0870i(dVar, 3, this);
                    c0230o.f0(objK2);
                }
                C0208d.d(dVar, this, (c) objK2, c0230o);
                c0230o.p(false);
            }
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 7, this, obj);
        }
    }

    public final long b() {
        s sVar = this.i;
        int size = sVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((m0) sVar.get(i)).f12043s.h());
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            jMax = Math.max(jMax, ((o0) sVar2.get(i3)).b());
        }
        return jMax;
    }

    public final void c() {
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) sVar.get(i);
            m0Var.f12037m = null;
            m0Var.f12036l = null;
            m0Var.f12040p = false;
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((o0) sVar2.get(i3)).c();
        }
    }

    public final boolean d() {
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            if (((m0) sVar.get(i)).f12036l != null) {
                return true;
            }
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((o0) sVar2.get(i3)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        o0 o0Var = this.f12057b;
        return o0Var != null ? o0Var.e() : this.f12061f.h();
    }

    public final k0 f() {
        return (k0) this.f12060e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f12065k.getValue()).booleanValue();
    }

    public final void h(long j4, boolean z5) {
        C0213f0 c0213f0 = this.f12062g;
        long jH = c0213f0.h();
        b bVar = this.f12056a;
        if (jH == Long.MIN_VALUE) {
            c0213f0.j(j4);
            ((C0217h0) bVar.f603h).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0217h0) bVar.f603h).getValue()).booleanValue()) {
            ((C0217h0) bVar.f603h).setValue(Boolean.TRUE);
        }
        this.f12063h.setValue(Boolean.FALSE);
        s sVar = this.i;
        int size = sVar.size();
        boolean z6 = true;
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) sVar.get(i);
            boolean zBooleanValue = ((Boolean) m0Var.f12038n.getValue()).booleanValue();
            C0217h0 c0217h0 = m0Var.f12038n;
            if (!zBooleanValue) {
                long jC = z5 ? m0Var.c().c() : j4;
                m0Var.f(m0Var.c().b(jC));
                m0Var.f12042r = m0Var.c().f(jC);
                if (m0Var.c().g(jC)) {
                    c0217h0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0217h0.getValue()).booleanValue()) {
                z6 = false;
            }
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o0 o0Var = (o0) sVar2.get(i3);
            Object value = o0Var.f12059d.getValue();
            b bVar2 = o0Var.f12056a;
            if (!k.a(value, bVar2.j())) {
                o0Var.h(j4, z5);
            }
            if (!k.a(o0Var.f12059d.getValue(), bVar2.j())) {
                z6 = false;
            }
        }
        if (z6) {
            i();
        }
    }

    public final void i() {
        this.f12062g.j(Long.MIN_VALUE);
        b bVar = this.f12056a;
        if (bVar instanceof K) {
            bVar.m(this.f12059d.getValue());
        }
        o(0L);
        ((C0217h0) bVar.f603h).setValue(Boolean.FALSE);
        s sVar = this.f12064j;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            ((o0) sVar.get(i)).i();
        }
    }

    public final void j(float f6) {
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) sVar.get(i);
            m0Var.getClass();
            if (f6 == -4.0f || f6 == -5.0f) {
                h0 h0Var = m0Var.f12037m;
                if (h0Var != null) {
                    m0Var.c().h(h0Var.f12004c);
                    m0Var.f12036l = null;
                    m0Var.f12037m = null;
                }
                Object obj = f6 == -4.0f ? m0Var.c().f12005d : m0Var.c().f12004c;
                m0Var.c().h(obj);
                m0Var.c().i(obj);
                m0Var.f(obj);
                m0Var.f12043s.j(m0Var.c().c());
            } else {
                m0Var.f12039o.j(f6);
            }
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((o0) sVar2.get(i3)).j(f6);
        }
    }

    public final void k() {
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            ((m0) sVar.get(i)).f12039o.j(-2.0f);
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((o0) sVar2.get(i3)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f12062g.j(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        b bVar = this.f12056a;
        ((C0217h0) bVar.f603h).setValue(bool);
        boolean zG = g();
        C0217h0 c0217h0 = this.f12059d;
        if (!zG || !k.a(bVar.j(), obj) || !k.a(c0217h0.getValue(), obj2)) {
            if (!k.a(bVar.j(), obj) && (bVar instanceof K)) {
                bVar.m(obj);
            }
            c0217h0.setValue(obj2);
            this.f12065k.setValue(Boolean.TRUE);
            this.f12060e.setValue(new l0(obj, obj2));
        }
        s sVar = this.f12064j;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            o0 o0Var = (o0) sVar.get(i);
            k.d("null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>", o0Var);
            if (o0Var.g()) {
                o0Var.l(o0Var.f12056a.j(), o0Var.f12059d.getValue());
            }
        }
        s sVar2 = this.i;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((m0) sVar2.get(i3)).d(0L);
        }
    }

    public final void m(long j4) {
        C0213f0 c0213f0 = this.f12062g;
        if (c0213f0.h() == Long.MIN_VALUE) {
            c0213f0.j(j4);
        }
        o(j4);
        this.f12063h.setValue(Boolean.FALSE);
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            ((m0) sVar.get(i)).d(j4);
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o0 o0Var = (o0) sVar2.get(i3);
            if (!k.a(o0Var.f12059d.getValue(), o0Var.f12056a.j())) {
                o0Var.m(j4);
            }
        }
    }

    public final void n(O o6) {
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) sVar.get(i);
            if (!k.a(m0Var.c().f12004c, m0Var.c().f12005d)) {
                m0Var.f12037m = m0Var.c();
                m0Var.f12036l = o6;
            }
            C0217h0 c0217h0 = m0Var.f12041q;
            m0Var.f12035k.setValue(new h0(m0Var.f12045u, m0Var.f12033h, c0217h0.getValue(), c0217h0.getValue(), m0Var.f12042r.c()));
            m0Var.f12043s.j(m0Var.c().c());
            m0Var.f12040p = true;
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((o0) sVar2.get(i3)).n(o6);
        }
    }

    public final void o(long j4) {
        if (this.f12057b == null) {
            this.f12061f.j(j4);
        }
    }

    public final void p() {
        h0 h0Var;
        s sVar = this.i;
        int size = sVar.size();
        for (int i = 0; i < size; i++) {
            m0 m0Var = (m0) sVar.get(i);
            O o6 = m0Var.f12036l;
            if (o6 != null && (h0Var = m0Var.f12037m) != null) {
                long jE = a.E(o6.f11872g * ((double) o6.f11869d));
                Object objB = h0Var.b(jE);
                if (m0Var.f12040p) {
                    m0Var.c().i(objB);
                }
                m0Var.c().h(objB);
                m0Var.f12043s.j(m0Var.c().c());
                if (m0Var.f12039o.h() == -2.0f || m0Var.f12040p) {
                    m0Var.f(objB);
                } else {
                    m0Var.d(m0Var.f12046v.e());
                }
                if (jE >= o6.f11872g) {
                    m0Var.f12036l = null;
                    m0Var.f12037m = null;
                } else {
                    o6.f11868c = false;
                }
            }
        }
        s sVar2 = this.f12064j;
        int size2 = sVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((o0) sVar2.get(i3)).p();
        }
    }

    public final void q(Object obj) {
        C0217h0 c0217h0 = this.f12059d;
        if (k.a(c0217h0.getValue(), obj)) {
            return;
        }
        this.f12060e.setValue(new l0(c0217h0.getValue(), obj));
        b bVar = this.f12056a;
        if (!k.a(bVar.j(), c0217h0.getValue())) {
            bVar.m(c0217h0.getValue());
        }
        c0217h0.setValue(obj);
        if (this.f12062g.h() == Long.MIN_VALUE) {
            this.f12063h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        s sVar = this.i;
        int size = sVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((m0) sVar.get(i)) + ", ";
        }
        return str;
    }
}
