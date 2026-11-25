package p092r1;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class M extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f11610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Throwable th, int i) {
        super(i);
        k.f("readException", th);
        this.f11610b = th;
    }
}
