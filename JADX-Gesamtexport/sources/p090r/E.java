package p090r;

import D4.c;
import E4.l;
import p096s.k0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11361h;
    public final /* synthetic */ F i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f6, int i) {
        super(1);
        this.f11361h = i;
        this.i = f6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        O o6;
        switch (this.f11361h) {
            case 0:
                k0 k0Var = (k0) obj;
                x xVar = x.f11448h;
                x xVar2 = x.i;
                boolean zA = k0Var.a(xVar, xVar2);
                Object obj2 = null;
                F f6 = this.i;
                if (zA) {
                    t tVar = f6.f11372y.f11375a.f11392c;
                    if (tVar != null) {
                        obj2 = tVar.f11435c;
                    }
                } else if (k0Var.a(xVar2, x.f11449j)) {
                    t tVar2 = f6.f11373z.f11378a.f11392c;
                    if (tVar2 != null) {
                        obj2 = tVar2.f11435c;
                    }
                } else {
                    obj2 = B.f11354d;
                }
                return obj2 == null ? B.f11354d : obj2;
            default:
                k0 k0Var2 = (k0) obj;
                x xVar3 = x.f11448h;
                x xVar4 = x.i;
                boolean zA2 = k0Var2.a(xVar3, xVar4);
                F f7 = this.i;
                if (zA2) {
                    O o7 = f7.f11372y.f11375a.f11391b;
                    return o7 != null ? o7.f11388b : B.f11353c;
                }
                if (k0Var2.a(xVar4, x.f11449j) && (o6 = f7.f11373z.f11378a.f11391b) != null) {
                    return o6.f11388b;
                }
                return B.f11353c;
        }
    }
}
