package L4;

import p124x0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i) {
        super(i);
        this.f3117h = 0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f3117h) {
            case 0:
                E4.k.f("it", obj);
                return Integer.valueOf(H4.e.f1802h.c(2147418112) + 65536);
            case 1:
                p013c0.d dVar = (p013c0.d) obj;
                if (!dVar.f5958h.f5969t) {
                    return o0.i;
                }
                dVar.f7192u = null;
                return o0.f14050h;
            default:
                ((p091r0.k) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj) {
        super(1);
        this.f3117h = i;
    }
}
