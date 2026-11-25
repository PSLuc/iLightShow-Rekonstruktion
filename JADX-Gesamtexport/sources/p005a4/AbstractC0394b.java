package p005a4;

import R3.b;
import V3.a;
import java.util.concurrent.atomic.AtomicLong;
import p043h4.f;
import u5.c;

/* JADX INFO: renamed from: a4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0394b extends AtomicLong implements b, c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3.c f6239h;
    public final S3.c i = new S3.c();

    public AbstractC0394b(R3.c cVar) {
        this.f6239h = cVar;
    }

    public final void a() {
        S3.c cVar = this.i;
        if (cVar.b()) {
            return;
        }
        try {
            this.f6239h.b();
        } finally {
            a.b(cVar);
        }
    }

    public final boolean b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        S3.c cVar = this.i;
        if (cVar.b()) {
            return false;
        }
        try {
            this.f6239h.onError(th);
            return true;
        } finally {
            a.b(cVar);
        }
    }

    @Override // u5.c
    public final void cancel() {
        S3.c cVar = this.i;
        cVar.getClass();
        a.b(cVar);
        g();
    }

    public final void d(Throwable th) {
        if (h(th)) {
            return;
        }
        G4.a.A(th);
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            p027e3.a.O(this, j4);
            f();
        }
    }

    public void f() {
    }

    public void g() {
    }

    public boolean h(Throwable th) {
        return b(th);
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }
}
