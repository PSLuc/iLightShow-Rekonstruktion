package P4;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: P4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0316c extends AbstractC0314a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Thread f4643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L f4644l;

    public C0316c(p111u4.i iVar, Thread thread, L l6) {
        super(iVar, true);
        this.f4643k = thread;
        this.f4644l = l6;
    }

    @Override // P4.b0
    public final void p(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f4643k;
        if (E4.k.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
