package p105t3;

import p116v3.l;

/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f12592h = new l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof t) && ((t) obj).f12592h.equals(this.f12592h);
        }
        return true;
    }

    public final int hashCode() {
        return this.f12592h.hashCode();
    }
}
