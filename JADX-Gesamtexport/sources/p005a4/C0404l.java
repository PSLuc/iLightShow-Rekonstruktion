package p005a4;

import R3.c;
import U3.b;
import X3.g;
import X3.h;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p043h4.f;
import p047i4.a;

/* JADX INFO: renamed from: a4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0404l extends AtomicInteger implements c, u5.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0403k[] f6265x = new C0403k[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0403k[] f6266y = new C0403k[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6267h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile g f6270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f6271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f6272n = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f6274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicLong f6275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u5.c f6276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6281w;

    public C0404l(c cVar, b bVar, int i, int i3) {
        AtomicReference atomicReference = new AtomicReference();
        this.f6274p = atomicReference;
        this.f6275q = new AtomicLong();
        this.f6267h = cVar;
        this.i = bVar;
        this.f6268j = i;
        this.f6269k = i3;
        this.f6281w = Math.max(1, i >> 1);
        atomicReference.lazySet(f6265x);
    }

    public final boolean a() {
        if (this.f6273o) {
            g gVar = this.f6270l;
            if (gVar != null) {
                gVar.clear();
                return true;
            }
        } else {
            if (this.f6272n.get() == null) {
                return false;
            }
            g gVar2 = this.f6270l;
            if (gVar2 != null) {
                gVar2.clear();
            }
            Throwable thB = this.f6272n.b();
            if (thB != p047i4.c.f9589a) {
                this.f6267h.onError(thB);
            }
        }
        return true;
    }

    @Override // u5.b
    public final void b() {
        if (this.f6271m) {
            return;
        }
        this.f6271m = true;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6271m) {
            return;
        }
        try {
            Object objApply = this.i.apply(obj);
            W3.b.a("The mapper returned a null Publisher", objApply);
            u5.a aVar = (u5.a) objApply;
            if (aVar instanceof Callable) {
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall == null) {
                        if (this.f6268j == Integer.MAX_VALUE || this.f6273o) {
                            return;
                        }
                        int i = this.f6280v + 1;
                        this.f6280v = i;
                        int i3 = this.f6281w;
                        if (i == i3) {
                            this.f6280v = 0;
                            this.f6276r.e(i3);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j4 = this.f6275q.get();
                        g gVarI = this.f6270l;
                        if (j4 == 0 || !(gVarI == null || gVarI.isEmpty())) {
                            if (gVarI == null) {
                                gVarI = i();
                            }
                            if (!gVarI.offer(objCall)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f6267h.c(objCall);
                            if (j4 != Long.MAX_VALUE) {
                                this.f6275q.decrementAndGet();
                            }
                            if (this.f6268j != Integer.MAX_VALUE && !this.f6273o) {
                                int i6 = this.f6280v + 1;
                                this.f6280v = i6;
                                int i7 = this.f6281w;
                                if (i6 == i7) {
                                    this.f6280v = 0;
                                    this.f6276r.e(i7);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!i().offer(objCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    f();
                    return;
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    this.f6272n.a(th);
                    d();
                    return;
                }
            }
            long j6 = this.f6277s;
            this.f6277s = 1 + j6;
            C0403k c0403k = new C0403k(this, j6);
            while (true) {
                AtomicReference atomicReference = this.f6274p;
                C0403k[] c0403kArr = (C0403k[]) atomicReference.get();
                if (c0403kArr == f6266y) {
                    f.a(c0403k);
                    return;
                }
                int length = c0403kArr.length;
                C0403k[] c0403kArr2 = new C0403k[length + 1];
                System.arraycopy(c0403kArr, 0, c0403kArr2, 0, length);
                c0403kArr2[length] = c0403k;
                do {
                    if (atomicReference.compareAndSet(c0403kArr, c0403kArr2)) {
                        aVar.a(c0403k);
                        return;
                    }
                } while (atomicReference.get() == c0403kArr);
            }
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            this.f6276r.cancel();
            onError(th2);
        }
    }

    @Override // u5.c
    public final void cancel() {
        g gVar;
        C0403k[] c0403kArr;
        if (this.f6273o) {
            return;
        }
        this.f6273o = true;
        this.f6276r.cancel();
        AtomicReference atomicReference = this.f6274p;
        C0403k[] c0403kArr2 = (C0403k[]) atomicReference.get();
        C0403k[] c0403kArr3 = f6266y;
        if (c0403kArr2 != c0403kArr3 && (c0403kArr = (C0403k[]) atomicReference.getAndSet(c0403kArr3)) != c0403kArr3) {
            for (C0403k c0403k : c0403kArr) {
                c0403k.getClass();
                f.a(c0403k);
            }
            Throwable thB = this.f6272n.b();
            if (thB != null && thB != p047i4.c.f9589a) {
                G4.a.A(thB);
            }
        }
        if (getAndIncrement() != 0 || (gVar = this.f6270l) == null) {
            return;
        }
        gVar.clear();
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            p027e3.a.O(this.f6275q, j4);
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:115:0x017d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x017b A[EDGE_INSN: B:153:0x017b->B:114:0x017b BREAK  A[LOOP:3: B:65:0x00d9->B:118:0x0182], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:91:0x0136 BREAK  A[LOOP:5: B:77:0x00f9->B:85:0x010f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f A[LOOP:5: B:77:0x00f9->B:85:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0145  */
    /* JADX WARN: Code duplicated, block: B:97:0x014f  */
    public final void f() {
        boolean z5;
        long j4;
        long j6;
        boolean z6;
        long j7;
        int i;
        boolean z7;
        int i3;
        C0403k c0403k;
        Object objPoll;
        h hVar;
        boolean z8;
        Object obj;
        c cVar = this.f6267h;
        int iAddAndGet = 1;
        while (!a()) {
            g gVar = this.f6270l;
            long jAddAndGet = this.f6275q.get();
            boolean z9 = jAddAndGet == Long.MAX_VALUE;
            long j8 = 0;
            if (gVar != null) {
                j4 = 0;
                do {
                    long j9 = 0;
                    obj = null;
                    while (true) {
                        if (jAddAndGet == 0) {
                            z5 = true;
                            break;
                        }
                        z5 = true;
                        Object objPoll2 = gVar.poll();
                        if (a()) {
                            return;
                        }
                        if (objPoll2 == null) {
                            obj = objPoll2;
                            break;
                        }
                        cVar.c(objPoll2);
                        j4++;
                        j9++;
                        jAddAndGet--;
                        obj = objPoll2;
                    }
                    if (j9 != 0) {
                        jAddAndGet = z9 ? Long.MAX_VALUE : this.f6275q.addAndGet(-j9);
                    }
                    if (jAddAndGet == 0) {
                        break;
                    }
                } while (obj != null);
            } else {
                z5 = true;
                j4 = 0;
            }
            boolean z10 = this.f6271m;
            g gVar2 = this.f6270l;
            C0403k[] c0403kArr = (C0403k[]) this.f6274p.get();
            int length = c0403kArr.length;
            if (z10 && ((gVar2 == null || gVar2.isEmpty()) && length == 0)) {
                Throwable thB = this.f6272n.b();
                if (thB != p047i4.c.f9589a) {
                    if (thB == null) {
                        cVar.b();
                        return;
                    } else {
                        cVar.onError(thB);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j10 = this.f6278t;
                int i6 = this.f6279u;
                if (length > i6) {
                    j7 = 1;
                    if (c0403kArr[i6].f6258h != j10) {
                    }
                    i = i6;
                    z7 = false;
                    i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            c0403kArr = c0403kArr;
                            j6 = j8;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        c0403k = c0403kArr[i];
                        objPoll = null;
                        while (!a()) {
                            hVar = c0403k.f6262m;
                            if (hVar == null) {
                                c0403kArr = c0403kArr;
                                j6 = j8;
                            } else {
                                j6 = j8;
                                while (jAddAndGet != j6) {
                                    try {
                                        objPoll = hVar.poll();
                                        if (objPoll == null) {
                                            break;
                                        }
                                        cVar.c(objPoll);
                                        if (a()) {
                                            return;
                                        }
                                        jAddAndGet -= j7;
                                        j8 += j7;
                                    } catch (Throwable th) {
                                        p027e3.a.w0(th);
                                        f.a(c0403k);
                                        this.f6272n.a(th);
                                        this.f6276r.cancel();
                                        if (a()) {
                                            return;
                                        }
                                        j(c0403k);
                                        i3++;
                                        c0403kArr = c0403kArr;
                                        z7 = z5;
                                    }
                                }
                                if (j8 != j6) {
                                    if (z9) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.f6275q.addAndGet(-j8);
                                    }
                                    c0403k.d(j8);
                                } else {
                                    c0403kArr = c0403kArr;
                                }
                                if (jAddAndGet == j6 && objPoll != null) {
                                    c0403kArr = c0403kArr;
                                    j8 = j6;
                                }
                            }
                            z8 = c0403k.f6261l;
                            h hVar2 = c0403k.f6262m;
                            if (z8 && (hVar2 == null || hVar2.isEmpty())) {
                                j(c0403k);
                                if (a()) {
                                    return;
                                }
                                j4 += j7;
                                z7 = z5;
                            }
                            if (jAddAndGet == j6) {
                                break;
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                            i3++;
                            c0403kArr = c0403kArr;
                            j8 = j6;
                        }
                        return;
                    }
                    z6 = z7;
                    this.f6279u = i;
                    this.f6278t = c0403kArr[i].f6258h;
                } else {
                    j7 = 1;
                }
                if (length <= i6) {
                    i6 = 0;
                }
                for (int i7 = 0; i7 < length && c0403kArr[i6].f6258h != j10; i7++) {
                    i6++;
                    if (i6 == length) {
                        i6 = 0;
                    }
                }
                this.f6279u = i6;
                this.f6278t = c0403kArr[i6].f6258h;
                i = i6;
                z7 = false;
                i3 = 0;
                while (true) {
                    if (i3 < length) {
                        c0403kArr = c0403kArr;
                        j6 = j8;
                        break;
                    }
                    if (a()) {
                        return;
                    }
                    c0403k = c0403kArr[i];
                    objPoll = null;
                    while (!a()) {
                        hVar = c0403k.f6262m;
                        if (hVar == null) {
                            c0403kArr = c0403kArr;
                            j6 = j8;
                        } else {
                            j6 = j8;
                            while (jAddAndGet != j6) {
                                objPoll = hVar.poll();
                                if (objPoll == null) {
                                    break;
                                    break;
                                }
                                cVar.c(objPoll);
                                if (a()) {
                                    return;
                                }
                                jAddAndGet -= j7;
                                j8 += j7;
                            }
                            if (j8 != j6) {
                                if (z9) {
                                    jAddAndGet = this.f6275q.addAndGet(-j8);
                                } else {
                                    jAddAndGet = Long.MAX_VALUE;
                                }
                                c0403k.d(j8);
                            } else {
                                c0403kArr = c0403kArr;
                            }
                            if (jAddAndGet == j6) {
                            }
                        }
                        z8 = c0403k.f6261l;
                        h hVar3 = c0403k.f6262m;
                        if (z8) {
                            j(c0403k);
                            if (a()) {
                                return;
                            }
                            j4 += j7;
                            z7 = z5;
                        }
                        if (jAddAndGet == j6) {
                            break;
                            break;
                        }
                        i++;
                        if (i == length) {
                            i = 0;
                        }
                        i3++;
                        c0403kArr = c0403kArr;
                        j8 = j6;
                    }
                    return;
                }
                z6 = z7;
                this.f6279u = i;
                this.f6278t = c0403kArr[i].f6258h;
            } else {
                j6 = 0;
                z6 = false;
            }
            long j11 = j4;
            if (j11 != j6 && !this.f6273o) {
                this.f6276r.e(j11);
            }
            if (!z6 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                return;
            }
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.g(this.f6276r, cVar)) {
            this.f6276r = cVar;
            this.f6267h.h(this);
            if (this.f6273o) {
                return;
            }
            int i = this.f6268j;
            if (i == Integer.MAX_VALUE) {
                cVar.e(Long.MAX_VALUE);
            } else {
                cVar.e(i);
            }
        }
    }

    public final g i() {
        g bVar = this.f6270l;
        if (bVar == null) {
            bVar = this.f6268j == Integer.MAX_VALUE ? new p028e4.b(this.f6269k) : new p028e4.a(this.f6268j);
            this.f6270l = bVar;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(C0403k c0403k) {
        C0403k[] c0403kArr;
        while (true) {
            AtomicReference atomicReference = this.f6274p;
            C0403k[] c0403kArr2 = (C0403k[]) atomicReference.get();
            int length = c0403kArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c0403kArr2[i] == c0403k) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0403kArr = f6265x;
            } else {
                C0403k[] c0403kArr3 = new C0403k[length - 1];
                System.arraycopy(c0403kArr2, 0, c0403kArr3, 0, i);
                System.arraycopy(c0403kArr2, i + 1, c0403kArr3, i, (length - i) - 1);
                c0403kArr = c0403kArr3;
            }
            while (!atomicReference.compareAndSet(c0403kArr2, c0403kArr)) {
                if (atomicReference.get() != c0403kArr2) {
                }
            }
            return;
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6271m) {
            G4.a.A(th);
        } else if (!this.f6272n.a(th)) {
            G4.a.A(th);
        } else {
            this.f6271m = true;
            d();
        }
    }
}
