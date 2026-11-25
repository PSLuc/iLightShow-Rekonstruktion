package p005a4;

import S3.b;
import U3.a;
import java.util.concurrent.atomic.AtomicReference;
import p017c4.h;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AtomicReference implements Runnable, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6180h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f6182k;

    public /* synthetic */ E(int i, Object obj) {
        this.f6180h = i;
        this.f6182k = obj;
    }

    @Override // U3.a
    public final void e(Object obj) {
        switch (this.f6180h) {
            case 0:
                V3.a.c(this, (b) obj);
                break;
            default:
                V3.a.c(this, (b) obj);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6180h) {
            case 0:
                ((G) this.f6182k).j(this);
                break;
            default:
                ((h) this.f6182k).K(this);
                break;
        }
    }
}
