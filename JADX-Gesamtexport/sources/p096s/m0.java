package p096s;

import E4.k;
import N.AbstractC0204b;
import N.C0208d;
import N.C0209d0;
import N.C0213f0;
import N.C0217h0;
import N.U;
import N.V0;
import X.s;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements V0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f12033h;
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0217h0 f12034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f12035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public O f12036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f12037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0217h0 f12038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0209d0 f12039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0217h0 f12041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC0924q f12042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0213f0 f12043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0906b0 f12045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0 f12046v;

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public m0(o0 o0Var, Object obj, AbstractC0924q abstractC0924q, w0 w0Var) {
        this.f12046v = o0Var;
        this.f12033h = w0Var;
        U u6 = U.f3673m;
        C0217h0 c0217h0K = C0208d.K(obj, u6);
        this.i = c0217h0K;
        Object objInvoke = null;
        C0217h0 c0217h0K2 = C0208d.K(AbstractC0909d.j(7, null), u6);
        this.f12034j = c0217h0K2;
        this.f12035k = C0208d.K(new h0((InterfaceC0932z) c0217h0K2.getValue(), w0Var, obj, c0217h0K.getValue(), abstractC0924q), u6);
        this.f12038n = C0208d.K(Boolean.TRUE, u6);
        this.f12039o = C0208d.I(-1.0f);
        this.f12041q = C0208d.K(obj, u6);
        this.f12042r = abstractC0924q;
        long jC = c().c();
        int i = AbstractC0204b.f3683b;
        this.f12043s = new C0213f0(jC);
        Float f6 = (Float) E0.f11841a.get(w0Var);
        if (f6 != null) {
            float fFloatValue = f6.floatValue();
            AbstractC0924q abstractC0924q2 = (AbstractC0924q) w0Var.f12136a.invoke(obj);
            int iB = abstractC0924q2.b();
            for (int i3 = 0; i3 < iB; i3++) {
                abstractC0924q2.e(i3, fFloatValue);
            }
            objInvoke = this.f12033h.f12137b.invoke(abstractC0924q2);
        }
        this.f12045u = AbstractC0909d.j(3, objInvoke);
    }

    public final h0 c() {
        return (h0) this.f12035k.getValue();
    }

    public final void d(long j4) {
        if (this.f12039o.h() == -1.0f) {
            this.f12044t = true;
            if (k.a(c().f12004c, c().f12005d)) {
                f(c().f12004c);
            } else {
                f(c().b(j4));
                this.f12042r = c().f(j4);
            }
        }
    }

    public final void f(Object obj) {
        this.f12041q.setValue(obj);
    }

    public final void g(Object obj, boolean z5) {
        h0 h0Var = this.f12037m;
        Object obj2 = h0Var != null ? h0Var.f12004c : null;
        C0217h0 c0217h0 = this.i;
        boolean zA = k.a(obj2, c0217h0.getValue());
        C0213f0 c0213f0 = this.f12043s;
        C0217h0 c0217h1 = this.f12035k;
        if (zA) {
            c0217h1.setValue(new h0(this.f12045u, this.f12033h, obj, obj, this.f12042r.c()));
            this.f12040p = true;
            c0213f0.j(c().c());
            return;
        }
        C0217h0 c0217h2 = this.f12034j;
        InterfaceC0932z interfaceC0932z = (!z5 || this.f12044t || (((InterfaceC0932z) c0217h2.getValue()) instanceof C0906b0)) ? (InterfaceC0932z) c0217h2.getValue() : this.f12045u;
        o0 o0Var = this.f12046v;
        c0217h1.setValue(new h0(o0Var.e() <= 0 ? interfaceC0932z : new C0908c0(interfaceC0932z, o0Var.e()), this.f12033h, obj, c0217h0.getValue(), this.f12042r));
        c0213f0.j(c().c());
        this.f12040p = false;
        Boolean bool = Boolean.TRUE;
        C0217h0 c0217h3 = o0Var.f12063h;
        c0217h3.setValue(bool);
        if (o0Var.g()) {
            s sVar = o0Var.i;
            int size = sVar.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                m0 m0Var = (m0) sVar.get(i);
                jMax = Math.max(jMax, m0Var.f12043s.h());
                m0Var.d(0L);
            }
            c0217h3.setValue(Boolean.FALSE);
        }
    }

    @Override // N.V0
    public final Object getValue() {
        return this.f12041q.getValue();
    }

    public final void h(Object obj, Object obj2, InterfaceC0932z interfaceC0932z) {
        this.i.setValue(obj2);
        this.f12034j.setValue(interfaceC0932z);
        if (k.a(c().f12005d, obj) && k.a(c().f12004c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final void i(Object obj, InterfaceC0932z interfaceC0932z) {
        if (this.f12040p) {
            h0 h0Var = this.f12037m;
            if (k.a(obj, h0Var != null ? h0Var.f12004c : null)) {
                return;
            }
        }
        C0217h0 c0217h0 = this.i;
        boolean zA = k.a(c0217h0.getValue(), obj);
        C0209d0 c0209d0 = this.f12039o;
        if (zA && c0209d0.h() == -1.0f) {
            return;
        }
        c0217h0.setValue(obj);
        this.f12034j.setValue(interfaceC0932z);
        Object value = c0209d0.h() == -3.0f ? obj : this.f12041q.getValue();
        C0217h0 c0217h1 = this.f12038n;
        g(value, !((Boolean) c0217h1.getValue()).booleanValue());
        c0217h1.setValue(Boolean.valueOf(c0209d0.h() == -3.0f));
        if (c0209d0.h() >= 0.0f) {
            f(c().b((long) (c0209d0.h() * c().c())));
        } else if (c0209d0.h() == -3.0f) {
            f(obj);
        }
        this.f12040p = false;
        c0209d0.j(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f12041q.getValue() + ", target: " + this.i.getValue() + ", spec: " + ((InterfaceC0932z) this.f12034j.getValue());
    }
}
