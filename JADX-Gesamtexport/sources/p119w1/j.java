package p119w1;

import H1.d;
import java.util.concurrent.ThreadPoolExecutor;
import p131y1.f;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f13427b;

    public j(f fVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f13426a = fVar;
        this.f13427b = threadPoolExecutor;
    }

    @Override // p131y1.f
    public final void b(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f13427b;
        try {
            this.f13426a.b(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p131y1.f
    public final void c(d dVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f13427b;
        try {
            this.f13426a.c(dVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
