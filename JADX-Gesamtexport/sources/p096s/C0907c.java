package p096s;

import E4.k;
import N.C0208d;
import N.C0217h0;
import N.U;
import p084p4.x;
import p111u4.d;
import p122w4.c;
import v4.a;

/* JADX INFO: renamed from: s.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0907c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f11951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0919l f11953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f11954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f11955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f11958h;
    public final AbstractC0924q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC0924q f11959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC0924q f11960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC0924q f11961l;

    public C0907c(Object obj, w0 w0Var, Object obj2) {
        this.f11951a = w0Var;
        this.f11952b = obj2;
        C0919l c0919l = new C0919l(w0Var, obj, null, 60);
        this.f11953c = c0919l;
        Boolean bool = Boolean.FALSE;
        U u6 = U.f3673m;
        this.f11954d = C0208d.K(bool, u6);
        this.f11955e = C0208d.K(obj, u6);
        this.f11958h = new N();
        new C0906b0(obj2);
        AbstractC0924q abstractC0924q = c0919l.f12026j;
        boolean z5 = abstractC0924q instanceof C0920m;
        AbstractC0924q abstractC0924q2 = z5 ? AbstractC0909d.f11968e : abstractC0924q instanceof C0921n ? AbstractC0909d.f11969f : abstractC0924q instanceof C0922o ? AbstractC0909d.f11970g : AbstractC0909d.f11971h;
        this.i = abstractC0924q2;
        AbstractC0924q abstractC0924q3 = z5 ? AbstractC0909d.f11964a : abstractC0924q instanceof C0921n ? AbstractC0909d.f11965b : abstractC0924q instanceof C0922o ? AbstractC0909d.f11966c : AbstractC0909d.f11967d;
        this.f11959j = abstractC0924q3;
        this.f11960k = abstractC0924q2;
        this.f11961l = abstractC0924q3;
    }

    public static Object a(C0907c c0907c, Object obj, InterfaceC0918k interfaceC0918k, c cVar) {
        Object objInvoke = c0907c.f11951a.f12137b.invoke(c0907c.f11953c.f12026j);
        Object objC = c0907c.c();
        w0 w0Var = c0907c.f11951a;
        return N.a(c0907c.f11958h, new C0903a(c0907c, objInvoke, new h0(interfaceC0918k, w0Var, objC, obj, (AbstractC0924q) w0Var.f12136a.invoke(objInvoke)), c0907c.f11953c.f12027k, null), cVar);
    }

    public final Object b(Object obj) {
        if (!k.a(this.f11960k, this.i) || !k.a(this.f11961l, this.f11959j)) {
            w0 w0Var = this.f11951a;
            AbstractC0924q abstractC0924q = (AbstractC0924q) w0Var.f12136a.invoke(obj);
            int iB = abstractC0924q.b();
            boolean z5 = false;
            for (int i = 0; i < iB; i++) {
                if (abstractC0924q.a(i) < this.f11960k.a(i) || abstractC0924q.a(i) > this.f11961l.a(i)) {
                    abstractC0924q.e(i, p081p0.c.N(abstractC0924q.a(i), this.f11960k.a(i), this.f11961l.a(i)));
                    z5 = true;
                }
            }
            if (z5) {
                return w0Var.f12137b.invoke(abstractC0924q);
            }
        }
        return obj;
    }

    public final Object c() {
        return this.f11953c.i.getValue();
    }

    public final Object d(Object obj, d dVar) {
        Object objA = N.a(this.f11958h, new C0905b(this, obj, null), dVar);
        return objA == a.f13292h ? objA : x.f10867a;
    }

    public /* synthetic */ C0907c(Object obj, w0 w0Var, Object obj2, int i) {
        this(obj, w0Var, (i & 4) != 0 ? null : obj2);
    }
}
