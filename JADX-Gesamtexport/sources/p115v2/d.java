package p115v2;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13218h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f13219j;

    public /* synthetic */ d(o oVar, l lVar, int i) {
        this.f13218h = i;
        this.f13219j = oVar;
        this.i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13218h) {
            case 0:
                o oVar = this.f13219j;
                AtomicLong atomicLong = oVar.f13240k;
                atomicLong.lazySet(atomicLong.get() + ((long) 1));
                l lVar = this.i;
                if (((m) lVar.get()).a()) {
                    oVar.f13239j.offerLast(lVar);
                    oVar.e();
                }
                break;
            default:
                o oVar2 = this.f13219j;
                l lVar2 = this.i;
                c cVar = oVar2.f13239j;
                if (cVar.d(lVar2)) {
                    l lVar3 = lVar2.i;
                    l lVar4 = lVar2.f13232j;
                    if (lVar3 == null) {
                        cVar.f13217h = lVar4;
                    } else {
                        lVar3.f13232j = lVar4;
                        lVar2.i = null;
                    }
                    if (lVar4 == null) {
                        cVar.i = lVar3;
                    } else {
                        lVar4.i = lVar3;
                        lVar2.f13232j = null;
                    }
                }
                oVar2.f(lVar2);
                break;
        }
    }
}
