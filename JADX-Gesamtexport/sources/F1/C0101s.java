package F1;

import V0.C0382a;
import p124x0.d0;

/* JADX INFO: renamed from: F1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101s extends p012c.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0101s(int i, Object obj) {
        super(false);
        this.f1378d = i;
        this.f1379e = obj;
    }

    @Override // p012c.u
    public final void b() {
        switch (this.f1378d) {
            case 0:
                ((I) this.f1379e).l();
                return;
            case 1:
                ((C0382a) this.f1379e).invoke(this);
                return;
            default:
                ((d0) this.f1379e).b();
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0101s(C0382a c0382a) {
        super(true);
        this.f1378d = 1;
        this.f1379e = c0382a;
    }
}
