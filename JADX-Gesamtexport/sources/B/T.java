package B;

import D.C0057g;

/* JADX INFO: loaded from: classes.dex */
public final class T extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.f234h = i;
        this.i = obj;
        this.f235j = obj2;
        this.f236k = obj3;
        this.f237l = obj4;
    }

    @Override // D4.a
    public final Object invoke() {
        S4.x xVarI;
        switch (this.f234h) {
            case 0:
                if (!((C0036s0) this.i).b()) {
                    ((p024e0.n) this.f235j).a(p024e0.h.f8652l);
                }
                int i = ((M0.m) this.f236k).f3433c;
                if (i != 7 && i != 8 && (xVarI = ((C0057g) this.f237l).i()) != null) {
                    ((S4.E) xVarI).q(p084p4.x.f10867a);
                }
                return Boolean.TRUE;
            case 1:
                ((V0.v) this.i).g((D4.a) this.f235j, (V0.s) this.f236k, (S0.k) this.f237l);
                return p084p4.x.f10867a;
            default:
                p096s.E e6 = (p096s.E) this.f235j;
                Number number = e6.f11833h;
                Number number2 = (Number) this.i;
                boolean zEquals = number2.equals(number);
                Number number3 = (Number) this.f236k;
                if (!zEquals || !number3.equals(e6.i)) {
                    e6.f11833h = number2;
                    e6.i = number3;
                    e6.f11836l = new p096s.h0((p096s.D) this.f237l, e6.f11834j, number2, number3, null);
                    e6.f11840p.f11849b.setValue(Boolean.TRUE);
                    e6.f11837m = false;
                    e6.f11838n = true;
                }
                return p084p4.x.f10867a;
        }
    }
}
