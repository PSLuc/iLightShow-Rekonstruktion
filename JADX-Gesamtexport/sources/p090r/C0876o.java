package p090r;

import D4.a;
import E4.l;
import p096s.o0;

/* JADX INFO: renamed from: r.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876o extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11426h;
    public final /* synthetic */ o0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0876o(o0 o0Var, int i) {
        super(0);
        this.f11426h = i;
        this.i = o0Var;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f11426h) {
            case 0:
                o0 o0Var = this.i;
                Object objJ = o0Var.f12056a.j();
                x xVar = x.f11449j;
                return Boolean.valueOf(objJ == xVar && o0Var.f12059d.getValue() == xVar);
            default:
                return Long.valueOf(this.i.b());
        }
    }
}
