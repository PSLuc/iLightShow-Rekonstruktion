package p101t;

import E4.k;
import p035g0.C0701b;
import p035g0.C0704e;
import p035g0.C0706g;
import p044i0.b;

/* JADX INFO: renamed from: t.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0704e f12399a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0701b f12400b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f12401c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0706g f12402d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0949q)) {
            return false;
        }
        C0949q c0949q = (C0949q) obj;
        return k.a(this.f12399a, c0949q.f12399a) && k.a(this.f12400b, c0949q.f12400b) && k.a(this.f12401c, c0949q.f12401c) && k.a(this.f12402d, c0949q.f12402d);
    }

    public final int hashCode() {
        C0704e c0704e = this.f12399a;
        int iHashCode = (c0704e == null ? 0 : c0704e.hashCode()) * 31;
        C0701b c0701b = this.f12400b;
        int iHashCode2 = (iHashCode + (c0701b == null ? 0 : c0701b.hashCode())) * 31;
        b bVar = this.f12401c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C0706g c0706g = this.f12402d;
        return iHashCode3 + (c0706g != null ? c0706g.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f12399a + ", canvas=" + this.f12400b + ", canvasDrawScope=" + this.f12401c + ", borderPath=" + this.f12402d + ')';
    }
}
