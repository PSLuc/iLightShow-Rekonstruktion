package p084p4;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f10858h;

    public /* synthetic */ o(byte b6) {
        this.f10858h = b6;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return k.h(this.f10858h & 255, ((o) obj).f10858h & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f10858h == ((o) obj).f10858h;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f10858h);
    }

    public final String toString() {
        return String.valueOf(this.f10858h & 255);
    }
}
