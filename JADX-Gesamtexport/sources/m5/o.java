package m5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p5.C0854t;
import p5.C0855u;
import p5.W;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f10466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f10468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f10469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f10470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f10471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f10472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f10473h;

    public o(int i, long j4) {
        int iMin = Math.min(i, 16);
        this.f10471f = true;
        this.f10472g = true;
        this.f10473h = new LinkedList();
        if (iMin > i) {
            throw new IllegalArgumentException("initial capacity must be <= max capacity");
        }
        this.f10468c = i;
        this.f10467b = new ConcurrentHashMap(iMin);
        this.f10470e = TimeUnit.SECONDS.toNanos(j4);
        n nVar = new n();
        this.f10469d = nVar;
        nVar.f10465e = nVar;
        nVar.f10464d = nVar;
    }

    public final Object a(n nVar, Iterator it) {
        if (this.f10471f && this.f10470e > 0) {
            long j4 = this.f10470e;
            nVar.getClass();
            if (System.nanoTime() - nVar.f10463c >= j4) {
                if (it != null) {
                    it.remove();
                } else {
                    this.f10467b.remove(nVar.f10461a);
                }
                nVar.a();
                d(nVar.f10462b);
                return null;
            }
        }
        if (this.f10472g) {
            n nVar2 = this.f10469d;
            nVar.a();
            nVar.f10463c = System.nanoTime();
            nVar.f10464d = nVar2;
            n nVar3 = nVar2.f10465e;
            nVar.f10465e = nVar3;
            nVar3.f10464d = nVar;
            nVar.f10464d.f10465e = nVar;
        }
        return nVar.f10462b;
    }

    public final void b(C0855u c0855u, C0854t c0854t) {
        n nVar = new n(c0855u, c0854t);
        this.f10467b.put(c0855u, nVar);
        n nVar2 = this.f10469d;
        nVar.f10464d = nVar2;
        n nVar3 = nVar2.f10465e;
        nVar.f10465e = nVar3;
        nVar3.f10464d = nVar;
        nVar.f10464d.f10465e = nVar;
    }

    public final Object c(Object obj) {
        n nVar;
        if (obj == null || (nVar = (n) this.f10467b.get(obj)) == null) {
            return null;
        }
        return a(nVar, null);
    }

    public final void d(C0854t c0854t) {
        for (W w6 : this.f10473h) {
            w6.getClass();
            O1.n nVar = new O1.n(20, (Object) w6, (Object) c0854t, false);
            if (c0854t.e()) {
                c0854t.f11147f.execute(nVar);
            } else {
                nVar.run();
            }
        }
    }

    public final boolean e(C0855u c0855u, C0854t c0854t) {
        n nVar = (n) this.f10467b.get(c0855u);
        if (nVar != null) {
            nVar.a();
            b(c0855u, c0854t);
            return true;
        }
        if (this.f10467b.size() < this.f10468c) {
            b(c0855u, c0854t);
            return true;
        }
        n nVar2 = this.f10469d.f10464d;
        long j4 = this.f10470e;
        nVar2.getClass();
        if (System.nanoTime() - nVar2.f10463c < j4) {
            return false;
        }
        nVar2.a();
        this.f10467b.remove(nVar2.f10461a);
        b(c0855u, c0854t);
        d(nVar2.f10462b);
        return true;
    }
}
