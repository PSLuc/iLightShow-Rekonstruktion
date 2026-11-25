package U4;

import P4.AbstractC0336x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5362h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5363j = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final i h() {
        i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
            i iVar2 = (i) atomicReferenceFieldUpdater2.get(this);
            iVar = iVar2;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f5362h;
                    obj = atomicReferenceFieldUpdater.get(iVar);
                    if (obj == this) {
                        if (iVar2 != iVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar2, iVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != iVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (o()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof n) {
                        ((n) obj).a(iVar);
                        break;
                    }
                    if (!(obj instanceof o)) {
                        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", obj);
                        iVar3 = iVar;
                        iVar = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar = (i) atomicReferenceFieldUpdater2.get(iVar);
                    }
                }
                i iVar4 = ((o) obj).f5374a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar) {
                        break;
                    }
                }
                iVar = iVar3;
            }
        }
        return iVar;
    }

    public final void i(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (m() != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (o()) {
                        iVar.h();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final Object m() {
        while (true) {
            Object obj = f5362h.get(this);
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final i n() {
        i iVar;
        Object objM = m();
        o oVar = objM instanceof o ? (o) objM : null;
        if (oVar != null && (iVar = oVar.f5374a) != null) {
            return iVar;
        }
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM);
        return (i) objM;
    }

    public boolean o() {
        return m() instanceof o;
    }

    public String toString() {
        return new h(this, AbstractC0336x.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0336x.h(this);
    }
}
