package p084p4;

import D4.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10852j = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "i");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile a f10853h;
    public volatile Object i;

    @Override // p084p4.f
    public final Object getValue() {
        Object obj = this.i;
        u uVar = u.f10864a;
        if (obj != uVar) {
            return obj;
        }
        a aVar = this.f10853h;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10852j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                }
            }
            this.f10853h = null;
            return objInvoke;
        }
        return this.i;
    }

    public final String toString() {
        return this.i != u.f10864a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
