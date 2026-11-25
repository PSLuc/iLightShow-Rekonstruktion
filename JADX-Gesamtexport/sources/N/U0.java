package N;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements Iterable, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E0 f3675h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0208d f3676j;

    public U0(E0 e6, int i, K k3, C0208d c0208d) {
        this.f3675h = e6;
        this.i = i;
        this.f3676j = c0208d;
        k3.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this.f3675h, this.i, null, this.f3676j);
    }
}
