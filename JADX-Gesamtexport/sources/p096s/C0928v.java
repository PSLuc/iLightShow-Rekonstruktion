package p096s;

import E4.k;
import H1.d;
import p035g0.C0715p;
import p081p0.c;
import p090r.AbstractC0863b;
import p090r.J;
import p090r.K;
import p090r.L;

/* JADX INFO: renamed from: s.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928v implements InterfaceC0915h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f12126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0924q f12128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0924q f12129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0924q f12130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12132h;

    public C0928v(C0715p c0715p, w0 w0Var, Object obj, AbstractC0924q abstractC0924q) {
        d dVar = new d((C0715p) c0715p.i);
        this.f12125a = dVar;
        this.f12126b = w0Var;
        this.f12127c = obj;
        AbstractC0924q abstractC0924q2 = (AbstractC0924q) w0Var.f12136a.invoke(obj);
        this.f12128d = abstractC0924q2;
        this.f12129e = AbstractC0909d.f(abstractC0924q);
        if (((AbstractC0924q) dVar.f1759k) == null) {
            dVar.f1759k = abstractC0924q2.c();
        }
        AbstractC0924q abstractC0924q3 = (AbstractC0924q) dVar.f1759k;
        if (abstractC0924q3 == null) {
            k.m("targetVector");
            throw null;
        }
        int iB = abstractC0924q3.b();
        int i = 0;
        while (i < iB) {
            AbstractC0924q abstractC0924q4 = (AbstractC0924q) dVar.f1759k;
            if (abstractC0924q4 == null) {
                k.m("targetVector");
                throw null;
            }
            float fA = abstractC0924q2.a(i);
            float fA2 = abstractC0924q.a(i);
            K k3 = (K) ((C0715p) dVar.i).i;
            double dB = k3.b(fA2);
            double d6 = L.f11385a;
            float f6 = k3.f11383a * k3.f11384b;
            int i3 = i;
            abstractC0924q4.e(i3, (Math.signum(fA2) * ((float) (Math.exp((d6 / (d6 - 1.0d)) * dB) * ((double) f6)))) + fA);
            i = i3 + 1;
        }
        AbstractC0924q abstractC0924q5 = (AbstractC0924q) dVar.f1759k;
        if (abstractC0924q5 == null) {
            k.m("targetVector");
            throw null;
        }
        this.f12131g = w0Var.f12137b.invoke(abstractC0924q5);
        d dVar2 = this.f12125a;
        AbstractC0924q abstractC0924q6 = this.f12128d;
        if (((AbstractC0924q) dVar2.f1758j) == null) {
            dVar2.f1758j = abstractC0924q6.c();
        }
        AbstractC0924q abstractC0924q7 = (AbstractC0924q) dVar2.f1758j;
        if (abstractC0924q7 == null) {
            k.m("velocityVector");
            throw null;
        }
        int iB2 = abstractC0924q7.b();
        long jMax = 0;
        for (int i6 = 0; i6 < iB2; i6++) {
            abstractC0924q6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((K) ((C0715p) dVar2.i).i).b(abstractC0924q.a(i6)) / (((double) L.f11385a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f12132h = jMax;
        AbstractC0924q abstractC0924qF = AbstractC0909d.f(this.f12125a.i(jMax, this.f12128d, abstractC0924q));
        this.f12130f = abstractC0924qF;
        int iB3 = abstractC0924qF.b();
        for (int i7 = 0; i7 < iB3; i7++) {
            AbstractC0924q abstractC0924q8 = this.f12130f;
            float fA3 = abstractC0924q8.a(i7);
            this.f12125a.getClass();
            this.f12125a.getClass();
            abstractC0924q8.e(i7, c.N(fA3, -0.0f, 0.0f));
        }
    }

    @Override // p096s.InterfaceC0915h
    public final boolean a() {
        return false;
    }

    @Override // p096s.InterfaceC0915h
    public final Object b(long j4) {
        if (g(j4)) {
            return this.f12131g;
        }
        D4.c cVar = this.f12126b.f12137b;
        d dVar = this.f12125a;
        AbstractC0924q abstractC0924q = (AbstractC0924q) dVar.f1757h;
        AbstractC0924q abstractC0924q2 = this.f12128d;
        if (abstractC0924q == null) {
            dVar.f1757h = abstractC0924q2.c();
        }
        AbstractC0924q abstractC0924q3 = (AbstractC0924q) dVar.f1757h;
        String str = "valueVector";
        if (abstractC0924q3 == null) {
            k.m("valueVector");
            throw null;
        }
        int iB = abstractC0924q3.b();
        int i = 0;
        while (i < iB) {
            AbstractC0924q abstractC0924q4 = (AbstractC0924q) dVar.f1757h;
            if (abstractC0924q4 == null) {
                k.m(str);
                throw null;
            }
            float fA = abstractC0924q2.a(i);
            long j6 = j4 / 1000000;
            J jA = ((K) ((C0715p) dVar.i).i).a(this.f12129e.a(i));
            String str2 = str;
            long j7 = jA.f11382c;
            abstractC0924q4.e(i, (Math.signum(jA.f11380a) * jA.f11381b * AbstractC0863b.a(j7 > 0 ? j6 / j7 : 1.0f).f11395a) + fA);
            i++;
            str = str2;
        }
        String str3 = str;
        AbstractC0924q abstractC0924q5 = (AbstractC0924q) dVar.f1757h;
        if (abstractC0924q5 != null) {
            return cVar.invoke(abstractC0924q5);
        }
        k.m(str3);
        throw null;
    }

    @Override // p096s.InterfaceC0915h
    public final long c() {
        return this.f12132h;
    }

    @Override // p096s.InterfaceC0915h
    public final w0 d() {
        return this.f12126b;
    }

    @Override // p096s.InterfaceC0915h
    public final Object e() {
        return this.f12131g;
    }

    @Override // p096s.InterfaceC0915h
    public final AbstractC0924q f(long j4) {
        if (g(j4)) {
            return this.f12130f;
        }
        return this.f12125a.i(j4, this.f12128d, this.f12129e);
    }
}
