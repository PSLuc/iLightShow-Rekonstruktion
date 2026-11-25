package p005a4;

import u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6217h;
    public final long i;

    public Q(long j4, c cVar) {
        this.f6217h = cVar;
        this.i = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6217h.e(this.i);
    }
}
