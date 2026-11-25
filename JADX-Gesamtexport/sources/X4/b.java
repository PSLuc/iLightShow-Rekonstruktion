package X4;

import E4.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5767h;
    public final /* synthetic */ d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f5768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i) {
        super(1);
        this.f5767h = i;
        this.i = dVar;
        this.f5768j = cVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f5767h) {
            case 0:
                this.f5768j.getClass();
                this.i.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f5770g;
                this.f5768j.getClass();
                d dVar = this.i;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return x.f10867a;
    }
}
