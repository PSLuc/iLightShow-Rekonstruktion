package F;

import p096s.C0919l;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1086h;
    public final /* synthetic */ C0919l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(C0919l c0919l, int i) {
        super(0);
        this.f1086h = i;
        this.i = c0919l;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f1086h) {
            case 0:
                return new p030f0.c(((p030f0.c) this.i.i.getValue()).f8837a);
            case 1:
                this.i.f12029m = false;
                return p084p4.x.f10867a;
            default:
                this.i.f12029m = false;
                return p084p4.x.f10867a;
        }
    }
}
