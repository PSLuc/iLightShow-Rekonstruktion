package p005a4;

/* JADX INFO: renamed from: a4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0397e extends AbstractC0394b {
    @Override // R3.b
    public final void c(Object obj) {
        long j4;
        if (this.i.b()) {
            return;
        }
        this.f6239h.c(obj);
        do {
            j4 = get();
            if (j4 == 0) {
                return;
            }
        } while (!compareAndSet(j4, j4 - 1));
    }
}
