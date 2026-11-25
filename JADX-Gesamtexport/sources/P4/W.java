package P4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends U4.i implements E, O, D4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f4627k;

    @Override // P4.E
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        b0 b0VarP = p();
        while (true) {
            Object objI = b0VarP.I();
            if (objI instanceof W) {
                if (objI != this) {
                    return;
                }
                G g6 = AbstractC0336x.f4680j;
                do {
                    atomicReferenceFieldUpdater2 = b0.f4642h;
                    if (atomicReferenceFieldUpdater2.compareAndSet(b0VarP, objI, g6)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(b0VarP) == objI);
            } else {
                if (!(objI instanceof O) || ((O) objI).g() == null) {
                    return;
                }
                while (true) {
                    Object objM = m();
                    if (objM instanceof U4.o) {
                        U4.i iVar = ((U4.o) objM).f5374a;
                        return;
                    }
                    if (objM == this) {
                        return;
                    }
                    E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM);
                    U4.i iVar2 = (U4.i) objM;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = U4.i.f5363j;
                    U4.o oVar = (U4.o) atomicReferenceFieldUpdater3.get(iVar2);
                    if (oVar == null) {
                        oVar = new U4.o(iVar2);
                        atomicReferenceFieldUpdater3.lazySet(iVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = U4.i.f5362h;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objM, oVar)) {
                            iVar2.h();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objM);
                }
            }
        }
    }

    @Override // P4.O
    public final boolean b() {
        return true;
    }

    @Override // P4.O
    public final d0 g() {
        return null;
    }

    public T getParent() {
        return p();
    }

    public final b0 p() {
        b0 b0Var = this.f4627k;
        if (b0Var != null) {
            return b0Var;
        }
        E4.k.m("job");
        throw null;
    }

    public abstract void q(Throwable th);

    @Override // U4.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0336x.h(this) + "[job@" + AbstractC0336x.h(p()) + ']';
    }
}
