package p058l0;

import E4.k;
import F4.a;
import S.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends H implements Iterable, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10208h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f10209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f10210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f10211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f10213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f10214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f10215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f10216q;

    public F(String str, float f6, float f7, float f8, float f9, float f10, float f11, float f12, List list, ArrayList arrayList) {
        this.f10208h = str;
        this.i = f6;
        this.f10209j = f7;
        this.f10210k = f8;
        this.f10211l = f9;
        this.f10212m = f10;
        this.f10213n = f11;
        this.f10214o = f12;
        this.f10215p = list;
        this.f10216q = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return k.a(this.f10208h, f6.f10208h) && this.i == f6.i && this.f10209j == f6.f10209j && this.f10210k == f6.f10210k && this.f10211l == f6.f10211l && this.f10212m == f6.f10212m && this.f10213n == f6.f10213n && this.f10214o == f6.f10214o && k.a(this.f10215p, f6.f10215p) && k.a(this.f10216q, f6.f10216q);
    }

    public final int hashCode() {
        return this.f10216q.hashCode() + ((this.f10215p.hashCode() + p012c.k.i(this.f10214o, p012c.k.i(this.f10213n, p012c.k.i(this.f10212m, p012c.k.i(this.f10211l, p012c.k.i(this.f10210k, p012c.k.i(this.f10209j, p012c.k.i(this.i, this.f10208h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }
}
