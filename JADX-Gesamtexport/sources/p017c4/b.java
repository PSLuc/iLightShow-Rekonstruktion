package p017c4;

import R3.g;
import R3.l;
import V3.a;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.concurrent.TimeUnit;
import p034f4.w;
import p034f4.x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l f7349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7351m;

    public b(long j4, long j6, l lVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f7350l = j4;
        this.f7351m = j6;
        this.f7349k = lVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.d0
    public final void E(g gVar) {
        a aVar = new a(gVar);
        gVar.d(aVar);
        l lVar = this.f7349k;
        if (!(lVar instanceof x)) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a.d(aVar, lVar.c(aVar, this.f7350l, this.f7351m));
            return;
        }
        ((x) lVar).getClass();
        w wVar = new w();
        a.d(aVar, wVar);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        wVar.d(aVar, this.f7350l, this.f7351m);
    }
}
