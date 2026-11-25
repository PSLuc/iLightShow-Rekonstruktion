package p005a4;

import R3.a;
import R3.c;
import S3.b;
import W2.g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p034f4.x;
import p043h4.d;
import p061l4.f;

/* JADX INFO: loaded from: classes.dex */
public final class G extends a {
    public final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f6187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6188l;

    public G(B b6) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        x xVar = f.f10388d;
        this.f6187k = b6;
        this.f6186j = 1;
    }

    @Override // R3.a
    public final void f(c cVar) {
        E e6;
        boolean z5;
        A a6;
        switch (this.i) {
            case 0:
                synchronized (this) {
                    try {
                        e6 = (E) this.f6188l;
                        if (e6 == null) {
                            e6 = new E(0, this);
                            this.f6188l = e6;
                        }
                        long j4 = e6.i + 1;
                        e6.i = j4;
                        if (e6.f6181j || j4 != this.f6186j) {
                            z5 = false;
                        } else {
                            e6.f6181j = true;
                            z5 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                ((B) this.f6187k).e(new F(cVar, this, e6));
                if (z5) {
                    B b6 = (B) this.f6187k;
                    while (true) {
                        AtomicReference atomicReference = b6.f6173j;
                        a6 = (A) atomicReference.get();
                        if (a6 == null || a6.f6167j.get() == A.f6165q) {
                            A a7 = new A(atomicReference, b6.f6174k);
                            while (true) {
                                if (atomicReference.compareAndSet(a6, a7)) {
                                    a6 = a7;
                                } else if (atomicReference.get() != a6) {
                                }
                            }
                        }
                    }
                    AtomicBoolean atomicBoolean = a6.f6168k;
                    boolean z6 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
                    try {
                        V3.a.c(e6, a6);
                        if (z6) {
                            b6.i.e(a6);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        p027e3.a.w0(th2);
                        throw p047i4.c.a(th2);
                    }
                }
                return;
            default:
                u5.a[] aVarArr = (u5.a[]) this.f6187k;
                int length = aVarArr.length;
                if (length == 0) {
                    cVar.h(d.f9305h);
                    cVar.b();
                    return;
                }
                W w6 = new W(cVar, (g) this.f6188l, length, this.f6186j);
                cVar.h(w6);
                X[] xArr = w6.i;
                for (int i = 0; i < length && !w6.f6231m && w6.f6230l.get() == null; i++) {
                    aVarArr[i].a(xArr[i]);
                }
                return;
        }
    }

    public void i(E e6) {
        synchronized (this) {
            try {
                if (((E) this.f6188l) != null) {
                    this.f6188l = null;
                    e6.getClass();
                    u5.a aVar = (B) this.f6187k;
                    if (aVar instanceof b) {
                        ((b) aVar).a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(E e6) {
        synchronized (this) {
            try {
                if (e6.i == 0 && e6 == ((E) this.f6188l)) {
                    this.f6188l = null;
                    V3.a.b(e6);
                    u5.a aVar = (B) this.f6187k;
                    if (aVar instanceof b) {
                        ((b) aVar).a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public G(u5.a[] aVarArr, g gVar, int i) {
        this.f6187k = aVarArr;
        this.f6188l = gVar;
        this.f6186j = i;
    }
}
