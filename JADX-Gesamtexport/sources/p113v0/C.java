package p113v0;

import S0.k;
import p124x0.M;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class C extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13130c;

    public /* synthetic */ C(int i, Object obj) {
        this.f13129b = i;
        this.f13130c = obj;
    }

    @Override // p113v0.M
    public final k b() {
        switch (this.f13129b) {
            case 0:
                return ((M) this.f13130c).getLayoutDirection();
            default:
                return ((r) this.f13130c).getLayoutDirection();
        }
    }

    @Override // p113v0.M
    public final int c() {
        switch (this.f13129b) {
            case 0:
                return ((M) this.f13130c).f0();
            default:
                return ((r) this.f13130c).getRoot().f13829D.f13923r.f13137h;
        }
    }
}
