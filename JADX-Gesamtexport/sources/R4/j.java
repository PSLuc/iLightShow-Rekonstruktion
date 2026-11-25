package R4;

import O1.C0308a;
import P4.p0;
import U4.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f4848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReferenceArray f4849m;

    public j(long j4, j jVar, b bVar, int i) {
        super(j4, jVar, i);
        this.f4848l = bVar;
        this.f4849m = new AtomicReferenceArray(d.f4826b * 2);
    }

    @Override // U4.r
    public final int f() {
        return d.f4826b;
    }

    @Override // U4.r
    public final void g(int i, p111u4.i iVar) {
        b bVar;
        int i3 = d.f4826b;
        boolean z5 = i >= i3;
        if (z5) {
            i -= i3;
        }
        this.f4849m.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z6 = objK instanceof p0;
            bVar = this.f4848l;
            if (z6 || (objK instanceof p)) {
                if (j(objK, i, z5 ? d.f4833j : d.f4834k)) {
                    m(i, null);
                    l(i, !z5);
                    if (z5) {
                        E4.k.c(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == d.f4833j || objK == d.f4834k) {
                    break;
                }
                if (objK != d.f4831g && objK != d.f4830f) {
                    if (objK == d.i || objK == d.f4828d || objK == d.f4835l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i, null);
        if (z5) {
            E4.k.c(bVar);
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4849m;
        int i3 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f4849m.get((i * 2) + 1);
    }

    public final void l(int i, boolean z5) {
        if (z5) {
            b bVar = this.f4848l;
            E4.k.c(bVar);
            bVar.E((this.f5377j * ((long) d.f4826b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f4849m.lazySet(i * 2, obj);
    }

    public final void n(int i, C0308a c0308a) {
        this.f4849m.set((i * 2) + 1, c0308a);
    }
}
