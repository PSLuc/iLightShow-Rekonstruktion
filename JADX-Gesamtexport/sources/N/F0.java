package N;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements Iterable, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E0 f3587h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3588j;

    public F0(E0 e6, int i, int i3) {
        this.f3587h = e6;
        this.i = i;
        this.f3588j = i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int iQ;
        E0 e6 = this.f3587h;
        if (e6.f3583n != this.f3588j) {
            throw new ConcurrentModificationException();
        }
        HashMap map = e6.f3585p;
        C0206c c0206c = null;
        int i3 = this.i;
        if (map != null) {
            if (e6.f3582m) {
                C0208d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i3 >= 0 && i3 < (i = e6.i) && (iQ = C0208d.Q((arrayList = e6.f3584o), i3, i)) >= 0) {
                c0206c = (C0206c) arrayList.get(iQ);
            }
            if (c0206c != null) {
            }
        }
        return new J(e6, i3 + 1, e6.f3578h[(i3 * 5) + 3] + i3);
    }
}
