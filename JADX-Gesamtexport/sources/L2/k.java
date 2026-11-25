package L2;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p079o4.a f3069h;
    public N2.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p079o4.a f3070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M2.e f3071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p079o4.a f3072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p079o4.a f3073m;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((S2.h) ((S2.d) this.f3072l.get())).close();
    }
}
