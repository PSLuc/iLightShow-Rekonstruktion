package p084p4;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f10865h;

    public /* synthetic */ v(short s6) {
        this.f10865h = s6;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return k.h(this.f10865h & 65535, ((v) obj).f10865h & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f10865h == ((v) obj).f10865h;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f10865h);
    }

    public final String toString() {
        return String.valueOf(this.f10865h & 65535);
    }
}
