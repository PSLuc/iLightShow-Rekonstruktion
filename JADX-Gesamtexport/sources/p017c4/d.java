package p017c4;

import R3.g;
import S3.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicReference implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7361h;

    public d(g gVar) {
        this.f7361h = gVar;
    }

    @Override // S3.b
    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((e) andSet).e(this);
    }
}
