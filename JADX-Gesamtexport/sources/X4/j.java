package X4;

import U4.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReferenceArray f5786l;

    public j(long j4, j jVar, int i) {
        super(j4, jVar, i);
        this.f5786l = new AtomicReferenceArray(i.f5785f);
    }

    @Override // U4.r
    public final int f() {
        return i.f5785f;
    }

    @Override // U4.r
    public final void g(int i, p111u4.i iVar) {
        this.f5786l.set(i, i.f5784e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f5377j + ", hashCode=" + hashCode() + ']';
    }
}
