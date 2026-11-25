package X4;

import O1.C0308a;
import P4.AbstractC0336x;
import P4.C0319f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p015c2.AbstractC0473d;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5770g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner = e.f5771a;

    public final Object c(p122w4.c cVar) {
        boolean zD = d();
        x xVar = x.f10867a;
        if (!zD) {
            C0319f c0319fJ = AbstractC0336x.j(AbstractC0473d.F(cVar));
            try {
                a(new c(this, c0319fJ));
                Object objT = c0319fJ.t();
                v4.a aVar = v4.a.f13292h;
                if (objT != aVar) {
                    objT = xVar;
                }
                if (objT == aVar) {
                    return objT;
                }
            } catch (Throwable th) {
                c0319fJ.B();
                throw th;
            }
        }
        return xVar;
    }

    public final boolean d() {
        int i;
        char c6;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f5778f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i3 <= 0) {
                    c6 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    f5770g.set(this, null);
                    c6 = 0;
                    break;
                }
            }
        }
        if (c6 == 0) {
            return true;
        }
        if (c6 == 1) {
            return false;
        }
        if (c6 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f5778f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5770g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0308a c0308a = e.f5771a;
            if (obj2 != c0308a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0308a)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0336x.h(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f5778f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f5770g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
