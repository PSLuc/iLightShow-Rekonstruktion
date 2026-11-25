package p005a4;

import R3.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p027e3.a;
import p028e4.b;

/* JADX INFO: renamed from: a4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0395c extends AbstractC0394b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6240j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Throwable f6241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f6242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicInteger f6243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f6244n;

    public C0395c(c cVar, int i) {
        super(cVar);
        this.f6244n = new b(i);
        this.f6243m = new AtomicInteger();
    }

    @Override // R3.b
    public final void c(Object obj) {
        switch (this.f6240j) {
            case 0:
                if (!this.f6242l && !this.i.b()) {
                    ((b) this.f6244n).offer(obj);
                    i();
                    break;
                }
                break;
            default:
                if (!this.f6242l && !this.i.b()) {
                    ((AtomicReference) this.f6244n).set(obj);
                    i();
                    break;
                }
                break;
        }
    }

    @Override // p005a4.AbstractC0394b
    public final void f() {
        switch (this.f6240j) {
            case 0:
                i();
                break;
            default:
                i();
                break;
        }
    }

    @Override // p005a4.AbstractC0394b
    public final void g() {
        switch (this.f6240j) {
            case 0:
                if (this.f6243m.getAndIncrement() == 0) {
                    ((b) this.f6244n).clear();
                }
                break;
            default:
                if (this.f6243m.getAndIncrement() == 0) {
                    ((AtomicReference) this.f6244n).lazySet(null);
                }
                break;
        }
    }

    @Override // p005a4.AbstractC0394b
    public final boolean h(Throwable th) {
        switch (this.f6240j) {
            case 0:
                if (this.f6242l || this.i.b()) {
                    return false;
                }
                this.f6241k = th;
                this.f6242l = true;
                i();
                return true;
            default:
                if (this.f6242l || this.i.b()) {
                    return false;
                }
                this.f6241k = th;
                this.f6242l = true;
                i();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ea A[SYNTHETIC] */
    public final void i() {
        boolean z5;
        Throwable th;
        switch (this.f6240j) {
            case 0:
                if (this.f6243m.getAndIncrement() == 0) {
                    c cVar = this.f6239h;
                    b bVar = (b) this.f6244n;
                    int iAddAndGet = 1;
                    do {
                        long j4 = get();
                        for (long j6 = 0; j6 != j4; j6++) {
                            if (this.i.b()) {
                                bVar.clear();
                            } else {
                                boolean z6 = this.f6242l;
                                Object objPoll = bVar.poll();
                                boolean z7 = objPoll == null;
                                if (z6 && z7) {
                                    Throwable th2 = this.f6241k;
                                    if (th2 != null) {
                                        b(th2);
                                    } else {
                                        a();
                                    }
                                } else if (z7) {
                                    if (j6 == j4) {
                                        if (this.i.b()) {
                                            bVar.clear();
                                        } else {
                                            z5 = this.f6242l;
                                            boolean zIsEmpty = bVar.isEmpty();
                                            if (z5 && zIsEmpty) {
                                                th = this.f6241k;
                                                if (th != null) {
                                                    b(th);
                                                } else {
                                                    a();
                                                }
                                            }
                                        }
                                    }
                                    if (j6 != 0) {
                                        a.q0(this, j6);
                                    }
                                    iAddAndGet = this.f6243m.addAndGet(-iAddAndGet);
                                } else {
                                    cVar.c(objPoll);
                                }
                            }
                            break;
                        }
                        if (j6 == j4) {
                            if (this.i.b()) {
                                bVar.clear();
                            } else {
                                z5 = this.f6242l;
                                boolean zIsEmpty2 = bVar.isEmpty();
                                if (z5) {
                                    th = this.f6241k;
                                    if (th != null) {
                                        b(th);
                                    } else {
                                        a();
                                    }
                                }
                            }
                        }
                        if (j6 != 0) {
                            a.q0(this, j6);
                        }
                        iAddAndGet = this.f6243m.addAndGet(-iAddAndGet);
                        break;
                    } while (iAddAndGet != 0);
                }
                break;
            default:
                if (this.f6243m.getAndIncrement() == 0) {
                    c cVar2 = this.f6239h;
                    AtomicReference atomicReference = (AtomicReference) this.f6244n;
                    int iAddAndGet2 = 1;
                    do {
                        long j7 = get();
                        long j8 = 0;
                        while (true) {
                            if (j8 != j7) {
                                if (this.i.b()) {
                                    atomicReference.lazySet(null);
                                    break;
                                } else {
                                    boolean z8 = this.f6242l;
                                    Object andSet = atomicReference.getAndSet(null);
                                    boolean z9 = andSet == null;
                                    if (z8 && z9) {
                                        Throwable th3 = this.f6241k;
                                        if (th3 != null) {
                                            b(th3);
                                        } else {
                                            a();
                                        }
                                        break;
                                    } else if (!z9) {
                                        cVar2.c(andSet);
                                        j8++;
                                    }
                                }
                            }
                        }
                        if (j8 == j7) {
                            if (this.i.b()) {
                                atomicReference.lazySet(null);
                            } else {
                                boolean z10 = this.f6242l;
                                boolean z11 = atomicReference.get() == null;
                                if (z10 && z11) {
                                    Throwable th4 = this.f6241k;
                                    if (th4 != null) {
                                        b(th4);
                                    } else {
                                        a();
                                    }
                                }
                            }
                        }
                        if (j8 != 0) {
                            a.q0(this, j8);
                        }
                        iAddAndGet2 = this.f6243m.addAndGet(-iAddAndGet2);
                        break;
                    } while (iAddAndGet2 != 0);
                }
                break;
        }
    }

    public C0395c(c cVar) {
        super(cVar);
        this.f6244n = new AtomicReference();
        this.f6243m = new AtomicInteger();
    }
}
