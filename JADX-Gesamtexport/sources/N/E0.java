package N;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements Iterable, F4.a {
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3583n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f3585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p080p.q f3586q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f3578h = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f3579j = new Object[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f3584o = new ArrayList();

    public final int c(C0206c c0206c) {
        if (this.f3582m) {
            C0208d.w("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0206c.a()) {
            return c0206c.f3685a;
        }
        C0208d.S("Anchor refers to a group that was removed");
        throw null;
    }

    public final void g() {
        this.f3585p = new HashMap();
    }

    public final D0 i() {
        if (this.f3582m) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f3581l++;
        return new D0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this, 0, this.i);
    }

    public final G0 j() {
        if (this.f3582m) {
            C0208d.w("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.f3581l > 0) {
            C0208d.w("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f3582m = true;
        this.f3583n++;
        return new G0(this);
    }
}
