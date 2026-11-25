package p067m4;

import R3.g;
import S3.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicBoolean implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10421h;
    public final b i;

    public a(g gVar, b bVar) {
        this.f10421h = gVar;
        this.i = bVar;
    }

    @Override // S3.b
    public final void a() {
        if (compareAndSet(false, true)) {
            this.i.J(this);
        }
    }
}
