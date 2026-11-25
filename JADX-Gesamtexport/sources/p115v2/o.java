package p115v2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import m5.m;
import p057l.RunnableC0811t;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractMap implements ConcurrentMap, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f13236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f13237w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f13238h;
    public final long[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f13239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f13240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f13241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReentrantLock f13242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentLinkedQueue f13243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLongArray f13244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLongArray f13245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReferenceArray f13246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReference f13247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient k f13248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient m f13249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient k f13250u;

    static {
        int iMin = Math.min(4, 1 << (32 - Integer.numberOfLeadingZeros(Runtime.getRuntime().availableProcessors() - 1)));
        f13236v = iMin;
        f13237w = iMin - 1;
    }

    public o(e eVar) {
        int i = eVar.f13220a;
        this.f13241l = new AtomicLong(Math.min(eVar.f13222c, 9223372034707292160L));
        this.f13238h = new ConcurrentHashMap(eVar.f13221b, 0.75f, i);
        this.f13242m = new ReentrantLock();
        this.f13240k = new AtomicLong();
        this.f13239j = new c();
        this.f13243n = new ConcurrentLinkedQueue();
        this.f13247r = new AtomicReference(i.f13223h);
        int i3 = f13236v;
        this.i = new long[i3];
        this.f13244o = new AtomicLongArray(i3);
        this.f13245p = new AtomicLongArray(i3);
        this.f13246q = new AtomicReferenceArray(i3 * 16);
    }

    public final void a(l lVar) {
        int id = ((int) Thread.currentThread().getId()) & f13237w;
        AtomicLongArray atomicLongArray = this.f13244o;
        long j4 = atomicLongArray.get(id);
        atomicLongArray.lazySet(id, 1 + j4);
        this.f13246q.lazySet((id * 16) + ((int) (15 & j4)), lVar);
        if (((i) this.f13247r.get()).a(j4 - this.f13245p.get(id) < 4)) {
            h();
        }
    }

    public final void b(Runnable runnable) {
        this.f13243n.add(runnable);
        this.f13247r.lazySet(i.i);
        h();
    }

    public final void c() {
        int i;
        Runnable runnable;
        int id = (int) Thread.currentThread().getId();
        int i3 = f13236v + id;
        while (true) {
            i = 0;
            if (id >= i3) {
                break;
            }
            int i6 = f13237w & id;
            long j4 = this.f13244o.get(i6);
            while (i < 8) {
                long[] jArr = this.i;
                int i7 = (i6 * 16) + ((int) (jArr[i6] & 15));
                AtomicReferenceArray atomicReferenceArray = this.f13246q;
                l lVar = (l) atomicReferenceArray.get(i7);
                if (lVar == null) {
                    break;
                }
                atomicReferenceArray.lazySet(i7, null);
                c cVar = this.f13239j;
                if (cVar.d(lVar) && lVar != cVar.i) {
                    l lVar2 = lVar.i;
                    l lVar3 = lVar.f13232j;
                    if (lVar2 == null) {
                        cVar.f13217h = lVar3;
                    } else {
                        lVar2.f13232j = lVar3;
                        lVar.i = null;
                    }
                    if (lVar3 == null) {
                        cVar.i = lVar2;
                    } else {
                        lVar3.i = lVar2;
                        lVar.f13232j = null;
                    }
                    a aVar = cVar.i;
                    cVar.i = lVar;
                    if (aVar == null) {
                        cVar.f13217h = lVar;
                    } else {
                        ((l) aVar).f13232j = lVar;
                        lVar.i = (l) aVar;
                    }
                }
                jArr[i6] = jArr[i6] + 1;
                i++;
            }
            this.f13245p.lazySet(i6, j4);
            id++;
        }
        while (i < 16 && (runnable = (Runnable) this.f13243n.poll()) != null) {
            runnable.run();
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ReentrantLock reentrantLock = this.f13242m;
        reentrantLock.lock();
        while (true) {
            try {
                l lVar = (l) this.f13239j.pollFirst();
                if (lVar == null) {
                    break;
                }
                this.f13238h.remove(lVar.f13231h, lVar);
                f(lVar);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        int i = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f13246q;
            if (i >= atomicReferenceArray.length()) {
                break;
            }
            atomicReferenceArray.lazySet(i, null);
            i++;
        }
        while (true) {
            Runnable runnable = (Runnable) this.f13243n.poll();
            if (runnable == null) {
                reentrantLock.unlock();
                return;
            }
            runnable.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f13238h.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        Iterator it = this.f13238h.values().iterator();
        while (it.hasNext()) {
            if (((l) it.next()).a().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        l lVar;
        while (this.f13240k.get() > this.f13241l.get() && (lVar = (l) this.f13239j.pollFirst()) != null) {
            this.f13238h.remove(lVar.f13231h, lVar);
            f(lVar);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.f13250u;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.f13250u = kVar2;
        return kVar2;
    }

    public final void f(l lVar) {
        m mVar;
        do {
            mVar = (m) lVar.get();
        } while (!lVar.compareAndSet(mVar, new m(0, mVar.f13234b)));
        AtomicLong atomicLong = this.f13240k;
        atomicLong.lazySet(atomicLong.get() - ((long) Math.abs(mVar.f13233a)));
    }

    public final Object g(Object obj, Object obj2, boolean z5) {
        obj.getClass();
        obj2.getClass();
        m mVar = new m(1, obj2);
        l lVar = new l(obj, mVar);
        while (true) {
            l lVar2 = (l) this.f13238h.putIfAbsent(lVar.f13231h, lVar);
            if (lVar2 == null) {
                b(new d(this, lVar, 0));
                return null;
            }
            if (z5) {
                a(lVar2);
                return lVar2.a();
            }
            while (true) {
                m mVar2 = (m) lVar2.get();
                if (!mVar2.a()) {
                    break;
                }
                if (lVar2.compareAndSet(mVar2, mVar)) {
                    int i = 1 - mVar2.f13233a;
                    if (i == 0) {
                        a(lVar2);
                    } else {
                        b(new RunnableC0811t(this, lVar2, i));
                    }
                    return mVar2.f13234b;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        l lVar = (l) this.f13238h.get(obj);
        if (lVar == null) {
            return null;
        }
        a(lVar);
        return lVar.a();
    }

    public final void h() {
        f fVar = i.f13223h;
        h hVar = i.f13224j;
        AtomicReference atomicReference = this.f13247r;
        ReentrantLock reentrantLock = this.f13242m;
        if (reentrantLock.tryLock()) {
            try {
                atomicReference.lazySet(hVar);
                c();
                while (!atomicReference.compareAndSet(hVar, fVar) && atomicReference.get() == hVar) {
                }
            } finally {
                while (!atomicReference.compareAndSet(hVar, fVar) && atomicReference.get() == hVar) {
                }
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f13238h.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f13248s;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f13248s = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return g(obj, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return g(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m mVar;
        l lVar = (l) this.f13238h.remove(obj);
        if (lVar == null) {
            return null;
        }
        do {
            mVar = (m) lVar.get();
            if (!mVar.a()) {
                break;
            }
        } while (!lVar.compareAndSet(mVar, new m(-mVar.f13233a, mVar.f13234b)));
        b(new d(this, lVar, 1));
        return lVar.a();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        m mVar;
        obj.getClass();
        obj2.getClass();
        m mVar2 = new m(1, obj2);
        l lVar = (l) this.f13238h.get(obj);
        if (lVar == null) {
            return null;
        }
        do {
            mVar = (m) lVar.get();
            if (!mVar.a()) {
                return null;
            }
        } while (!lVar.compareAndSet(mVar, mVar2));
        int i = 1 - mVar.f13233a;
        if (i == 0) {
            a(lVar);
        } else {
            b(new RunnableC0811t(this, lVar, i));
        }
        return mVar.f13234b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13238h.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        m mVar = this.f13249t;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(1, this);
        this.f13249t = mVar2;
        return mVar2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.f13238h;
        l lVar = (l) concurrentHashMap.get(obj);
        if (lVar != null && obj2 != null) {
            m mVar = (m) lVar.get();
            do {
                Object obj3 = mVar.f13234b;
                if (obj2 != obj3 && !obj3.equals(obj2)) {
                    return false;
                }
                if (mVar.a() ? lVar.compareAndSet(mVar, new m(-mVar.f13233a, mVar.f13234b)) : false) {
                    if (!concurrentHashMap.remove(obj, lVar)) {
                        break;
                    }
                    b(new d(this, lVar, 1));
                    return true;
                }
                mVar = (m) lVar.get();
            } while (mVar.a());
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        m mVar;
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        m mVar2 = new m(1, obj3);
        l lVar = (l) this.f13238h.get(obj);
        if (lVar != null) {
            do {
                mVar = (m) lVar.get();
                if (mVar.a()) {
                    Object obj4 = mVar.f13234b;
                    if (obj2 != obj4 && !obj4.equals(obj2)) {
                        return false;
                    }
                }
            } while (!lVar.compareAndSet(mVar, mVar2));
            int i = 1 - mVar.f13233a;
            if (i == 0) {
                a(lVar);
                return true;
            }
            b(new RunnableC0811t(this, lVar, i));
            return true;
        }
        return false;
    }
}
