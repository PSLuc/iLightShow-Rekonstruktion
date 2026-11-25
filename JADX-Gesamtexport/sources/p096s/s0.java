package p096s;

import N.F;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f12115b;

    public /* synthetic */ s0(o0 o0Var, int i) {
        this.f12114a = i;
        this.f12115b = o0Var;
    }

    @Override // N.F
    public final void a() {
        switch (this.f12114a) {
            case 0:
                o0 o0Var = this.f12115b;
                o0Var.i();
                o0Var.f12056a.o();
                break;
            default:
                o0 o0Var2 = this.f12115b;
                o0Var2.i();
                o0Var2.f12056a.o();
                break;
        }
    }
}
