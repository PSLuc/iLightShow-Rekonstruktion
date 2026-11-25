package p005a4;

import X3.a;
import X3.e;
import p043h4.f;
import u5.c;

/* JADX INFO: renamed from: a4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0400h implements a, e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f6246h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f6247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U3.c f6250m;

    public C0400h(a aVar, U3.c cVar) {
        this.f6246h = aVar;
        this.f6250m = cVar;
    }

    @Override // u5.b
    public final void b() {
        if (this.f6248k) {
            return;
        }
        this.f6248k = true;
        this.f6246h.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (g(obj)) {
            return;
        }
        this.i.e(1L);
    }

    @Override // u5.c
    public final void cancel() {
        this.i.cancel();
    }

    @Override // X3.h
    public final void clear() {
        this.f6247j.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        this.i.e(j4);
    }

    @Override // X3.a
    public final boolean g(Object obj) {
        if (this.f6248k) {
            return false;
        }
        int i = this.f6249l;
        a aVar = this.f6246h;
        if (i != 0) {
            return aVar.g(null);
        }
        try {
            return this.f6250m.test(obj) && aVar.g(obj);
        } catch (Throwable th) {
            p027e3.a.w0(th);
            this.i.cancel();
            onError(th);
            return true;
        }
    }

    @Override // u5.b
    public final void h(c cVar) {
        if (f.g(this.i, cVar)) {
            this.i = cVar;
            if (cVar instanceof e) {
                this.f6247j = (e) cVar;
            }
            this.f6246h.h(this);
        }
    }

    @Override // X3.d
    public final int i(int i) {
        e eVar = this.f6247j;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int i3 = eVar.i(i);
        if (i3 != 0) {
            this.f6249l = i3;
        }
        return i3;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f6247j.isEmpty();
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6248k) {
            G4.a.A(th);
        } else {
            this.f6248k = true;
            this.f6246h.onError(th);
        }
    }

    @Override // X3.h
    public final Object poll() {
        e eVar = this.f6247j;
        while (true) {
            Object objPoll = eVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f6250m.test(objPoll)) {
                return objPoll;
            }
            if (this.f6249l == 2) {
                eVar.e(1L);
            }
        }
    }
}
