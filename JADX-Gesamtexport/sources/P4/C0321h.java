package P4;

import O1.C0308a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: P4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0321h extends U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0319f f4654l;

    public C0321h(C0319f c0319f) {
        this.f4654l = c0319f;
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        q((Throwable) obj);
        return p084p4.x.f10867a;
    }

    @Override // P4.W
    public final void q(Throwable th) throws IllegalAccessException, InvocationTargetException {
        b0 b0VarP = p();
        C0319f c0319f = this.f4654l;
        Throwable thS = c0319f.s(b0VarP);
        if (c0319f.y()) {
            p111u4.d dVar = c0319f.f4650k;
            E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", dVar);
            U4.f fVar = (U4.f) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U4.f.f5351o;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                C0308a c0308a = U4.a.f5344d;
                if (E4.k.a(obj, c0308a)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, c0308a, thS)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != c0308a) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(fVar) == obj);
                }
            }
        }
        c0319f.i(thS);
        if (c0319f.y()) {
            return;
        }
        c0319f.p();
    }
}
