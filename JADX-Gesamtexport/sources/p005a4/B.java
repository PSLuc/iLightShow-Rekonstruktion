package p005a4;

import R3.a;
import R3.c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class B extends a {
    public final C0402j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f6173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f6175l;

    public B(y yVar, C0402j c0402j, AtomicReference atomicReference, int i) {
        this.f6175l = yVar;
        this.i = c0402j;
        this.f6173j = atomicReference;
        this.f6174k = i;
    }

    @Override // R3.a
    public final void f(c cVar) {
        this.f6175l.a(cVar);
    }
}
