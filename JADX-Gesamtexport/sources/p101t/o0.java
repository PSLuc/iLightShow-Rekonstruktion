package p101t;

import D4.a;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12388h;
    public final /* synthetic */ p0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i) {
        super(0);
        this.f12388h = i;
        this.i = p0Var;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f12388h) {
            case 0:
                return Float.valueOf(this.i.f12397u.f12417a.h());
            default:
                return Float.valueOf(this.i.f12397u.f12420d.h());
        }
    }
}
