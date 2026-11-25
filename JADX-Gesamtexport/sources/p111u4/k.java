package p111u4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p084p4.j;
import p122w4.d;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d, d {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f12752h;
    private volatile Object result;

    public k(d dVar, a aVar) {
        this.f12752h = dVar;
        this.result = aVar;
    }

    @Override // p122w4.d
    public final d a() {
        d dVar = this.f12752h;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final Object b() throws Throwable {
        Object obj = this.result;
        a aVar = a.i;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            a aVar2 = a.f13292h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return a.f13292h;
        }
        if (obj == a.f13293j) {
            return a.f13292h;
        }
        if (obj instanceof j) {
            throw ((j) obj).f10850h;
        }
        return obj;
    }

    @Override // p111u4.d
    public final i e() {
        return this.f12752h.e();
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        while (true) {
            Object obj2 = this.result;
            a aVar = a.i;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            a aVar2 = a.f13292h;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
            a aVar3 = a.f13293j;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f12752h.g(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f12752h;
    }
}
