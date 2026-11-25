package L;

import p096s.AbstractC0924q;
import p096s.C0907c;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0907c f2195h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(C0907c c0907c, float f6) {
        super(0);
        this.f2195h = c0907c;
        this.i = f6;
    }

    @Override // D4.a
    public final Object invoke() {
        AbstractC0924q abstractC0924q;
        Float fValueOf = Float.valueOf(this.i);
        C0907c c0907c = this.f2195h;
        Object obj = c0907c.f11957g;
        p096s.w0 w0Var = c0907c.f11951a;
        AbstractC0924q abstractC0924q2 = (AbstractC0924q) w0Var.f12136a.invoke(fValueOf);
        if (abstractC0924q2 == null) {
            abstractC0924q2 = c0907c.i;
        }
        if (obj == null || (abstractC0924q = (AbstractC0924q) w0Var.f12136a.invoke(obj)) == null) {
            abstractC0924q = c0907c.f11959j;
        }
        int iB = abstractC0924q2.b();
        for (int i = 0; i < iB; i++) {
            if (abstractC0924q2.a(i) > abstractC0924q.a(i)) {
                throw new IllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC0924q2 + " is greater than upper bound " + abstractC0924q + " on index " + i);
            }
        }
        c0907c.f11960k = abstractC0924q2;
        c0907c.f11961l = abstractC0924q;
        c0907c.f11957g = obj;
        c0907c.f11956f = fValueOf;
        if (!((Boolean) c0907c.f11954d.getValue()).booleanValue()) {
            Object objB = c0907c.b(c0907c.c());
            if (!E4.k.a(objB, c0907c.c())) {
                c0907c.f11953c.i.setValue(objB);
            }
        }
        return p084p4.x.f10867a;
    }
}
