package S4;

import P4.C0319f;

/* JADX INFO: loaded from: classes.dex */
public final class C implements P4.E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E f5015h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f5016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0319f f5017k;

    public C(E e6, long j4, Object obj, C0319f c0319f) {
        this.f5015h = e6;
        this.i = j4;
        this.f5016j = obj;
        this.f5017k = c0319f;
    }

    @Override // P4.E
    public final void a() {
        E e6 = this.f5015h;
        synchronized (e6) {
            if (this.i < e6.o()) {
                return;
            }
            Object[] objArr = e6.f5028o;
            E4.k.c(objArr);
            long j4 = this.i;
            if (objArr[((int) j4) & (objArr.length - 1)] != this) {
                return;
            }
            F.d(objArr, j4, F.f5033a);
            e6.i();
        }
    }
}
