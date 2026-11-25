package p017c4;

import R3.g;
import S3.b;
import V3.a;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.E;
import p034f4.x;
import p047i4.c;
import p061l4.f;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f7373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E f7375m;

    public h(f fVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        x xVar = f.f10388d;
        this.f7373k = fVar;
        this.f7374l = 1;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.d0
    public final void E(g gVar) {
        E e6;
        boolean z5;
        e eVar;
        synchronized (this) {
            try {
                e6 = this.f7375m;
                if (e6 == null) {
                    e6 = new E(1, this);
                    this.f7375m = e6;
                }
                long j4 = e6.i + 1;
                e6.i = j4;
                if (e6.f6181j || j4 != this.f7374l) {
                    z5 = false;
                } else {
                    e6.f6181j = true;
                    z5 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7373k.e(new g(gVar, this, e6));
        if (z5) {
            f fVar = this.f7373k;
            loop0: while (true) {
                AtomicReference atomicReference = fVar.f7368l;
                eVar = (e) atomicReference.get();
                if (eVar != null && eVar.i.get() != e.f7363m) {
                    break;
                }
                e eVar2 = new e(atomicReference);
                do {
                    if (atomicReference.compareAndSet(eVar, eVar2)) {
                        eVar = eVar2;
                        break loop0;
                    }
                } while (atomicReference.get() == eVar);
            }
            AtomicBoolean atomicBoolean = eVar.f7365j;
            boolean z6 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
            try {
                a.c(e6, eVar);
                if (z6) {
                    fVar.f7367k.e(eVar);
                }
            } catch (Throwable th2) {
                p027e3.a.w0(th2);
                throw c.a(th2);
            }
        }
    }

    public final void J(E e6) {
        synchronized (this) {
            try {
                if (this.f7375m != null) {
                    this.f7375m = null;
                    e6.getClass();
                    Object obj = this.f7373k;
                    if (obj instanceof b) {
                        ((b) obj).a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(E e6) {
        synchronized (this) {
            try {
                if (e6.i == 0 && e6 == this.f7375m) {
                    this.f7375m = null;
                    a.b(e6);
                    Object obj = this.f7373k;
                    if (obj instanceof b) {
                        ((b) obj).a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
