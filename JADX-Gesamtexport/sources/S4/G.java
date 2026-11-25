package S4;

import P4.C0319f;

/* JADX INFO: loaded from: classes.dex */
public final class G extends T4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0319f f5037b;

    @Override // T4.c
    public final boolean a(T4.a aVar) {
        E e6 = (E) aVar;
        if (this.f5036a >= 0) {
            return false;
        }
        long j4 = e6.f5029p;
        if (j4 < e6.f5030q) {
            e6.f5030q = j4;
        }
        this.f5036a = j4;
        return true;
    }

    @Override // T4.c
    public final p111u4.d[] b(T4.a aVar) {
        long j4 = this.f5036a;
        this.f5036a = -1L;
        this.f5037b = null;
        return ((E) aVar).v(j4);
    }
}
