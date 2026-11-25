package p096s;

import D4.c;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements InterfaceC0915h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f12002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f12003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC0924q f12006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC0924q f12007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0924q f12008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12009h;
    public AbstractC0924q i;

    public h0(InterfaceC0918k interfaceC0918k, w0 w0Var, Object obj, Object obj2, AbstractC0924q abstractC0924q) {
        this.f12002a = interfaceC0918k.a(w0Var);
        this.f12003b = w0Var;
        this.f12004c = obj2;
        this.f12005d = obj;
        this.f12006e = (AbstractC0924q) w0Var.f12136a.invoke(obj);
        c cVar = w0Var.f12136a;
        this.f12007f = (AbstractC0924q) cVar.invoke(obj2);
        this.f12008g = abstractC0924q != null ? AbstractC0909d.f(abstractC0924q) : ((AbstractC0924q) cVar.invoke(obj)).c();
        this.f12009h = -1L;
    }

    @Override // p096s.InterfaceC0915h
    public final boolean a() {
        return this.f12002a.a();
    }

    @Override // p096s.InterfaceC0915h
    public final Object b(long j4) {
        if (g(j4)) {
            return this.f12004c;
        }
        AbstractC0924q abstractC0924qF = this.f12002a.f(j4, this.f12006e, this.f12007f, this.f12008g);
        int iB = abstractC0924qF.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(abstractC0924qF.a(i))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + abstractC0924qF + ". Animation: " + this + ", playTimeNanos: " + j4);
            }
        }
        return this.f12003b.f12137b.invoke(abstractC0924qF);
    }

    @Override // p096s.InterfaceC0915h
    public final long c() {
        if (this.f12009h < 0) {
            this.f12009h = this.f12002a.b(this.f12006e, this.f12007f, this.f12008g);
        }
        return this.f12009h;
    }

    @Override // p096s.InterfaceC0915h
    public final w0 d() {
        return this.f12003b;
    }

    @Override // p096s.InterfaceC0915h
    public final Object e() {
        return this.f12004c;
    }

    @Override // p096s.InterfaceC0915h
    public final AbstractC0924q f(long j4) {
        if (!g(j4)) {
            return this.f12002a.k(j4, this.f12006e, this.f12007f, this.f12008g);
        }
        AbstractC0924q abstractC0924q = this.i;
        if (abstractC0924q != null) {
            return abstractC0924q;
        }
        AbstractC0924q abstractC0924qM = this.f12002a.m(this.f12006e, this.f12007f, this.f12008g);
        this.i = abstractC0924qM;
        return abstractC0924qM;
    }

    public final void h(Object obj) {
        if (k.a(obj, this.f12005d)) {
            return;
        }
        this.f12005d = obj;
        this.f12006e = (AbstractC0924q) this.f12003b.f12136a.invoke(obj);
        this.i = null;
        this.f12009h = -1L;
    }

    public final void i(Object obj) {
        if (k.a(this.f12004c, obj)) {
            return;
        }
        this.f12004c = obj;
        this.f12007f = (AbstractC0924q) this.f12003b.f12136a.invoke(obj);
        this.i = null;
        this.f12009h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f12005d + " -> " + this.f12004c + ",initial velocity: " + this.f12008g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f12002a;
    }
}
