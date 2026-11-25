package B2;

import p126x2.x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f489h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i) {
        super(0);
        this.f489h = i;
        this.i = bVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f489h) {
            case 0:
                return this.i.f492b.f493c.f();
            default:
                return ((x) this.i.f491a.getValue()).f14127h;
        }
    }
}
