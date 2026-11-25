package p101t;

import D4.a;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12409h;
    public final /* synthetic */ s0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i) {
        super(0);
        this.f12409h = i;
        this.i = s0Var;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12409h) {
            case 0:
                return Boolean.valueOf(this.i.f12417a.h() > 0);
            default:
                s0 s0Var = this.i;
                return Boolean.valueOf(s0Var.f12417a.h() < s0Var.f12420d.h());
        }
    }
}
