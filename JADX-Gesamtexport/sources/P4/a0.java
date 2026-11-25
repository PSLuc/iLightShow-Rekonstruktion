package P4;

import O1.C0308a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends U4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f4637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f4638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f4639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f4640e;

    public a0(W w6, b0 b0Var, O o6) {
        this.f4639d = b0Var;
        this.f4640e = o6;
        this.f4637b = w6;
    }

    @Override // U4.b
    public final void b(Object obj, Object obj2) {
        U4.i iVar = (U4.i) obj;
        boolean z5 = obj2 == null;
        W w6 = this.f4637b;
        O o6 = z5 ? w6 : this.f4638c;
        if (o6 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.i.f5362h;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, o6)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z5) {
                d0 d0Var = this.f4638c;
                E4.k.c(d0Var);
                w6.i(d0Var);
            }
        }
    }

    @Override // U4.b
    public final C0308a c(Object obj) {
        if (this.f4639d.I() == this.f4640e) {
            return null;
        }
        return U4.a.f5345e;
    }
}
