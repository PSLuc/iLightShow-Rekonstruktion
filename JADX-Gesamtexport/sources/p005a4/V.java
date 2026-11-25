package p005a4;

import R3.a;
import R3.c;
import R3.l;
import S3.b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class V extends a {
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6226j;

    public V(long j4, l lVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f6226j = j4;
        this.i = lVar;
    }

    @Override // R3.a
    public final void f(c cVar) {
        U u6 = new U(cVar);
        cVar.h(u6);
        b bVarB = this.i.b(u6, this.f6226j, TimeUnit.SECONDS);
        while (!u6.compareAndSet(null, bVarB)) {
            if (u6.get() != null) {
                if (u6.get() == V3.a.f5508h) {
                    bVarB.a();
                    return;
                }
                return;
            }
        }
    }
}
