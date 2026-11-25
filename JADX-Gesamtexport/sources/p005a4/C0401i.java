package p005a4;

import R3.c;
import X3.a;
import X3.e;
import p043h4.f;

/* JADX INFO: renamed from: a4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0401i implements a, c, e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6251h;
    public u5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f6252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U3.c f6255m;

    public C0401i(c cVar, U3.c cVar2) {
        this.f6251h = cVar;
        this.f6255m = cVar2;
    }

    @Override // u5.b
    public final void b() {
        if (this.f6253k) {
            return;
        }
        this.f6253k = true;
        this.f6251h.b();
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
        this.f6252j.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        this.i.e(j4);
    }

    @Override // X3.a
    public final boolean g(Object obj) {
        if (this.f6253k) {
            return false;
        }
        int i = this.f6254l;
        c cVar = this.f6251h;
        if (i != 0) {
            cVar.c(null);
            return true;
        }
        try {
            boolean zTest = this.f6255m.test(obj);
            if (zTest) {
                cVar.c(obj);
            }
            return zTest;
        } catch (Throwable th) {
            p027e3.a.w0(th);
            this.i.cancel();
            onError(th);
            return true;
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.g(this.i, cVar)) {
            this.i = cVar;
            if (cVar instanceof e) {
                this.f6252j = (e) cVar;
            }
            this.f6251h.h(this);
        }
    }

    @Override // X3.d
    public final int i(int i) {
        e eVar = this.f6252j;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int i3 = eVar.i(i);
        if (i3 != 0) {
            this.f6254l = i3;
        }
        return i3;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f6252j.isEmpty();
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6253k) {
            G4.a.A(th);
        } else {
            this.f6253k = true;
            this.f6251h.onError(th);
        }
    }

    @Override // X3.h
    public final Object poll() {
        e eVar = this.f6252j;
        while (true) {
            Object objPoll = eVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f6255m.test(objPoll)) {
                return objPoll;
            }
            if (this.f6254l == 2) {
                eVar.e(1L);
            }
        }
    }
}
