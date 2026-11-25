package p096s;

import D4.c;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12118h;
    public final /* synthetic */ o0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(o0 o0Var, int i) {
        super(1);
        this.f12118h = i;
        this.i = o0Var;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f12118h) {
            case 0:
                return new s0(this.i, 0);
            default:
                return new s0(this.i, 1);
        }
    }
}
