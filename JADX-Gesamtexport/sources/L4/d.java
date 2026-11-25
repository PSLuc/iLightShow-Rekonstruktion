package L4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3103b;

    public d(j jVar, int i) {
        this.f3102a = jVar;
        this.f3103b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // L4.e
    public final j a(int i) {
        int i3 = this.f3103b + i;
        return i3 < 0 ? new d(this, i) : new d(this.f3102a, i3);
    }

    @Override // L4.j
    public final Iterator iterator() {
        return new c(this);
    }
}
