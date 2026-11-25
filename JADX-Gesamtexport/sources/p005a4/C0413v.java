package p005a4;

import R3.k;
import X3.a;
import X3.e;
import X3.h;
import p043h4.f;
import u5.c;

/* JADX INFO: renamed from: a4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413v extends AbstractRunnableC0412u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f6332t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6333u;

    public C0413v(a aVar, k kVar, int i) {
        super(kVar, i);
        this.f6332t = aVar;
    }

    @Override // u5.b
    public final void h(c cVar) {
        if (f.g(this.f6324l, cVar)) {
            this.f6324l = cVar;
            if (cVar instanceof e) {
                e eVar = (e) cVar;
                int i = eVar.i(7);
                if (i == 1) {
                    this.f6329q = 1;
                    this.f6325m = eVar;
                    this.f6327o = true;
                    this.f6332t.h(this);
                    return;
                }
                if (i == 2) {
                    this.f6329q = 2;
                    this.f6325m = eVar;
                    this.f6332t.h(this);
                    cVar.e(this.i);
                    return;
                }
            }
            this.f6325m = new p028e4.a(this.i);
            this.f6332t.h(this);
            cVar.e(this.i);
        }
    }

    @Override // p005a4.AbstractRunnableC0412u
    public final void k() {
        a aVar = this.f6332t;
        h hVar = this.f6325m;
        long j4 = this.f6330r;
        long j6 = this.f6333u;
        int iAddAndGet = 1;
        while (true) {
            long j7 = this.f6323k.get();
            while (j4 != j7) {
                boolean z5 = this.f6327o;
                try {
                    Object objPoll = hVar.poll();
                    boolean z6 = objPoll == null;
                    if (j(z5, z6, aVar)) {
                        return;
                    }
                    if (z6) {
                        break;
                    }
                    if (aVar.g(objPoll)) {
                        j4++;
                    }
                    j6++;
                    if (j6 == this.f6322j) {
                        this.f6324l.e(j6);
                        j6 = 0;
                    }
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    this.f6324l.cancel();
                    hVar.clear();
                    aVar.onError(th);
                    this.f6321h.a();
                    return;
                }
            }
            if (j4 == j7 && j(this.f6327o, hVar.isEmpty(), aVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.f6330r = j4;
                this.f6333u = j6;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // p005a4.AbstractRunnableC0412u
    public final void l() {
        int iAddAndGet = 1;
        while (!this.f6326n) {
            boolean z5 = this.f6327o;
            this.f6332t.c(null);
            if (z5) {
                Throwable th = this.f6328p;
                if (th != null) {
                    this.f6332t.onError(th);
                } else {
                    this.f6332t.b();
                }
                this.f6321h.a();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // p005a4.AbstractRunnableC0412u
    public final void m() {
        a aVar = this.f6332t;
        h hVar = this.f6325m;
        long j4 = this.f6330r;
        int iAddAndGet = 1;
        while (true) {
            long j6 = this.f6323k.get();
            while (j4 != j6) {
                try {
                    Object objPoll = hVar.poll();
                    if (this.f6326n) {
                        return;
                    }
                    if (objPoll == null) {
                        aVar.b();
                        this.f6321h.a();
                        return;
                    } else if (aVar.g(objPoll)) {
                        j4++;
                    }
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    this.f6324l.cancel();
                    aVar.onError(th);
                    this.f6321h.a();
                    return;
                }
            }
            if (this.f6326n) {
                return;
            }
            if (hVar.isEmpty()) {
                aVar.b();
                this.f6321h.a();
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.f6330r = j4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // X3.h
    public final Object poll() {
        Object objPoll = this.f6325m.poll();
        if (objPoll != null && this.f6329q != 1) {
            long j4 = this.f6333u + 1;
            if (j4 == this.f6322j) {
                this.f6333u = 0L;
                this.f6324l.e(j4);
                return objPoll;
            }
            this.f6333u = j4;
        }
        return objPoll;
    }
}
