package p113v0;

import P.a;
import p124x0.D;

/* JADX INFO: loaded from: classes.dex */
public final class A implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f13113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13114b;

    public A(B b6, Object obj) {
        this.f13113a = b6;
        this.f13114b = obj;
    }

    @Override // p113v0.V
    public final void a() {
        B b6 = this.f13113a;
        b6.e();
        D d6 = (D) b6.f13122p.remove(this.f13114b);
        if (d6 != null) {
            if (b6.f13127u <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            D d7 = b6.f13115h;
            int iL = ((a) d7.o()).f4578h.l(d6);
            int i = ((a) d7.o()).f4578h.f4583j;
            int i3 = b6.f13127u;
            if (iL < i - i3) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            b6.f13126t++;
            b6.f13127u = i3 - 1;
            int i6 = (((a) d7.o()).f4578h.f4583j - b6.f13127u) - b6.f13126t;
            d7.f13844r = true;
            d7.G(iL, i6, 1);
            d7.f13844r = false;
            b6.d(i6);
        }
    }
}
