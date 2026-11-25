package n5;

import p5.C0854t;
import p5.i0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10573h;
    public final /* synthetic */ i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0854t f10574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f10575k;

    public /* synthetic */ b(g gVar, i0 i0Var, C0854t c0854t, int i) {
        this.f10573h = i;
        this.f10575k = gVar;
        this.i = i0Var;
        this.f10574j = c0854t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10573h) {
            case 0:
                g gVar = this.f10575k;
                if (gVar.f10607u.get()) {
                    gVar.l(this.i, this.f10574j);
                }
                break;
            default:
                this.f10575k.l(this.i, this.f10574j);
                break;
        }
    }
}
