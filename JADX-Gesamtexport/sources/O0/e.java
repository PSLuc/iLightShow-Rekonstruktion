package O0;

import p035g0.AbstractC0712m;
import p035g0.K;
import p084p4.x;
import p124x0.J;
import p124x0.N;

/* JADX INFO: loaded from: classes.dex */
public final class e extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4403h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4404j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, long j4, Object obj) {
        super(0);
        this.f4403h = i;
        this.f4404j = obj;
        this.i = j4;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f4403h) {
            case 0:
                return ((K) ((AbstractC0712m) this.f4404j)).b(this.i);
            default:
                N nK0 = ((J) this.f4404j).a().K0();
                E4.k.c(nK0);
                nK0.c(this.i);
                return x.f10867a;
        }
    }
}
