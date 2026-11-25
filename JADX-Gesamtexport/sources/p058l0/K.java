package p058l0;

import E4.k;
import java.util.List;
import p035g0.AbstractC0712m;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class K extends H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10225h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0712m f10227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f10228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC0712m f10229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f10230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f10231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f10234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f10235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f10236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f10237u;

    public K(String str, List list, int i, AbstractC0712m abstractC0712m, float f6, AbstractC0712m abstractC0712m2, float f7, float f8, int i3, int i6, float f9, float f10, float f11, float f12) {
        this.f10225h = str;
        this.i = list;
        this.f10226j = i;
        this.f10227k = abstractC0712m;
        this.f10228l = f6;
        this.f10229m = abstractC0712m2;
        this.f10230n = f7;
        this.f10231o = f8;
        this.f10232p = i3;
        this.f10233q = i6;
        this.f10234r = f9;
        this.f10235s = f10;
        this.f10236t = f11;
        this.f10237u = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k3 = (K) obj;
        return this.f10225h.equals(k3.f10225h) && k.a(this.f10227k, k3.f10227k) && this.f10228l == k3.f10228l && k.a(this.f10229m, k3.f10229m) && this.f10230n == k3.f10230n && this.f10231o == k3.f10231o && this.f10232p == k3.f10232p && this.f10233q == k3.f10233q && this.f10234r == k3.f10234r && this.f10235s == k3.f10235s && this.f10236t == k3.f10236t && this.f10237u == k3.f10237u && this.f10226j == k3.f10226j && k.a(this.i, k3.i);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + (this.f10225h.hashCode() * 31)) * 31;
        AbstractC0712m abstractC0712m = this.f10227k;
        int i = p012c.k.i(this.f10228l, (iHashCode + (abstractC0712m != null ? abstractC0712m.hashCode() : 0)) * 31, 31);
        AbstractC0712m abstractC0712m2 = this.f10229m;
        return Integer.hashCode(this.f10226j) + p012c.k.i(this.f10237u, p012c.k.i(this.f10236t, p012c.k.i(this.f10235s, p012c.k.i(this.f10234r, AbstractC0916i.c(this.f10233q, AbstractC0916i.c(this.f10232p, p012c.k.i(this.f10231o, p012c.k.i(this.f10230n, (i + (abstractC0712m2 != null ? abstractC0712m2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
