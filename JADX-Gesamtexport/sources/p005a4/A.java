package p005a4;

import G4.a;
import R3.c;
import S3.b;
import X3.e;
import X3.h;
import io.reactivex.exceptions.MissingBackpressureException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import p047i4.d;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AtomicInteger implements c, b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z[] f6164p = new z[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z[] f6165q = new z[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f6166h;
    public final int i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Serializable f6170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile h f6172o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f6169l = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f6167j = new AtomicReference(f6164p);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f6168k = new AtomicBoolean();

    public A(AtomicReference atomicReference, int i) {
        this.f6166h = atomicReference;
        this.i = i;
    }

    @Override // S3.b
    public final void a() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f6167j;
        Object obj = atomicReference2.get();
        Object obj2 = f6165q;
        if (obj == obj2 || ((z[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f6166h;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        f.a(this.f6169l);
    }

    @Override // u5.b
    public final void b() {
        if (this.f6170m == null) {
            this.f6170m = p047i4.f.f9592h;
            e();
        }
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6171n != 0 || this.f6172o.offer(obj)) {
            e();
        } else {
            onError(new MissingBackpressureException("Prefetch queue is full?!"));
        }
    }

    public final boolean d(Object obj, boolean z5) {
        int i = 0;
        if (obj != null) {
            p047i4.f fVar = p047i4.f.f9592h;
            z[] zVarArr = f6165q;
            AtomicReference atomicReference = this.f6167j;
            AtomicReference atomicReference2 = this.f6166h;
            if (obj != fVar) {
                d dVar = (d) obj;
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                z[] zVarArr2 = (z[]) atomicReference.getAndSet(zVarArr);
                int length = zVarArr2.length;
                Throwable th = dVar.f9590h;
                if (length == 0) {
                    a.A(th);
                    return true;
                }
                int length2 = zVarArr2.length;
                while (i < length2) {
                    zVarArr2[i].f6338h.onError(th);
                    i++;
                }
            } else if (z5) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                z[] zVarArr3 = (z[]) atomicReference.getAndSet(zVarArr);
                int length3 = zVarArr3.length;
                while (i < length3) {
                    zVarArr3[i].f6338h.b();
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final void e() {
        boolean z5;
        Object objPoll;
        z[] zVarArr;
        Object objPoll2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f6167j;
        boolean z6 = true;
        z[] zVarArr2 = (z[]) atomicReference.get();
        int iAddAndGet = 1;
        while (true) {
            Object obj = this.f6170m;
            h hVar = this.f6172o;
            boolean z7 = (hVar == null || hVar.isEmpty()) ? z6 : false;
            if (d(obj, z7)) {
                return;
            }
            if (z7) {
                z5 = z6;
            } else {
                int length = zVarArr2.length;
                int i = 0;
                long jMin = Long.MAX_VALUE;
                for (z zVar : zVarArr2) {
                    long j4 = zVar.get();
                    if (j4 != Long.MIN_VALUE) {
                        jMin = Math.min(jMin, j4 - zVar.f6339j);
                    } else {
                        i++;
                    }
                }
                long j6 = 1;
                if (length == i) {
                    Object obj2 = this.f6170m;
                    try {
                        objPoll = hVar.poll();
                    } catch (Throwable th) {
                        p027e3.a.w0(th);
                        ((u5.c) this.f6169l.get()).cancel();
                        d dVar = new d(th);
                        this.f6170m = dVar;
                        obj2 = dVar;
                        objPoll = null;
                    }
                    if (d(obj2, objPoll == null ? z6 : false)) {
                        return;
                    }
                    if (this.f6171n != z6) {
                        ((u5.c) this.f6169l.get()).e(1L);
                    }
                    z5 = z6;
                    zVarArr = zVarArr2;
                } else {
                    int i3 = 0;
                    while (true) {
                        long j7 = i3;
                        if (j7 < jMin) {
                            Object obj3 = this.f6170m;
                            try {
                                objPoll2 = hVar.poll();
                            } catch (Throwable th2) {
                                p027e3.a.w0(th2);
                                ((u5.c) this.f6169l.get()).cancel();
                                d dVar2 = new d(th2);
                                this.f6170m = dVar2;
                                obj3 = dVar2;
                                objPoll2 = null;
                            }
                            boolean z8 = objPoll2 == null ? z6 : false;
                            if (d(obj3, z8)) {
                                return;
                            }
                            if (z8) {
                                z7 = z8;
                            } else {
                                int length2 = zVarArr2.length;
                                int i6 = 0;
                                boolean z9 = false;
                                while (i6 < length2) {
                                    long j8 = j6;
                                    z zVar2 = zVarArr2[i6];
                                    long j9 = zVar2.get();
                                    if (j9 != Long.MIN_VALUE) {
                                        if (j9 != Long.MAX_VALUE) {
                                            zVar2.f6339j += j8;
                                        }
                                        zVar2.f6338h.c(objPoll2);
                                    } else {
                                        z9 = true;
                                    }
                                    i6++;
                                    zVarArr2 = zVarArr2;
                                    j6 = j8;
                                }
                                z[] zVarArr3 = zVarArr2;
                                long j10 = j6;
                                i3++;
                                z[] zVarArr4 = (z[]) atomicReference.get();
                                if (z9 || zVarArr4 != zVarArr3) {
                                    zVarArr2 = zVarArr4;
                                    z6 = true;
                                } else {
                                    zVarArr2 = zVarArr3;
                                    z7 = z8;
                                    j6 = j10;
                                    z6 = true;
                                }
                            }
                        }
                        zVarArr = zVarArr2;
                        if (i3 > 0) {
                            z5 = true;
                            if (this.f6171n != 1) {
                                ((u5.c) this.f6169l.get()).e(j7);
                            }
                        } else {
                            z5 = true;
                        }
                        if (jMin == 0 || z7) {
                        }
                        z6 = z5;
                    }
                }
                zVarArr2 = zVarArr;
                z6 = z5;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            zVarArr2 = (z[]) atomicReference.get();
            z6 = z5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(z zVar) {
        z[] zVarArr;
        while (true) {
            AtomicReference atomicReference = this.f6167j;
            z[] zVarArr2 = (z[]) atomicReference.get();
            int length = zVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (zVarArr2[i].equals(zVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                zVarArr = f6164p;
            } else {
                z[] zVarArr3 = new z[length - 1];
                System.arraycopy(zVarArr2, 0, zVarArr3, 0, i);
                System.arraycopy(zVarArr2, i + 1, zVarArr3, i, (length - i) - 1);
                zVarArr = zVarArr3;
            }
            while (!atomicReference.compareAndSet(zVarArr2, zVarArr)) {
                if (atomicReference.get() != zVarArr2) {
                }
            }
            return;
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.d(this.f6169l, cVar)) {
            if (cVar instanceof e) {
                e eVar = (e) cVar;
                int i = eVar.i(3);
                if (i == 1) {
                    this.f6171n = i;
                    this.f6172o = eVar;
                    this.f6170m = p047i4.f.f9592h;
                    e();
                    return;
                }
                if (i == 2) {
                    this.f6171n = i;
                    this.f6172o = eVar;
                    cVar.e(this.i);
                    return;
                }
            }
            this.f6172o = new p028e4.a(this.i);
            cVar.e(this.i);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6170m != null) {
            a.A(th);
        } else {
            this.f6170m = new d(th);
            e();
        }
    }
}
