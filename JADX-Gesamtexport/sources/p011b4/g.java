package p011b4;

import R3.d;
import R3.e;
import R3.l;
import V3.a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7113h;
    public final l i;

    public g(long j4, l lVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f7113h = j4;
        this.i = lVar;
    }

    @Override // R3.d
    public final void c(e eVar) {
        f fVar = new f(eVar);
        eVar.d(fVar);
        a.c(fVar, this.i.b(fVar, this.f7113h, TimeUnit.MILLISECONDS));
    }
}
