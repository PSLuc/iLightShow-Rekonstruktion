package G0;

import B.AbstractC0013g0;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: G0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0106b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1486d;

    public /* synthetic */ C0106b(int i, int i3, Object obj) {
        this("", i, i3, obj);
    }

    public final C0108d a(int i) {
        int i3 = this.f1485c;
        if (i3 != Integer.MIN_VALUE) {
            i = i3;
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C0108d(this.f1486d, this.f1484b, i, this.f1483a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0106b)) {
            return false;
        }
        C0106b c0106b = (C0106b) obj;
        return E4.k.a(this.f1483a, c0106b.f1483a) && this.f1484b == c0106b.f1484b && this.f1485c == c0106b.f1485c && E4.k.a(this.f1486d, c0106b.f1486d);
    }

    public final int hashCode() {
        Object obj = this.f1483a;
        return this.f1486d.hashCode() + AbstractC0916i.c(this.f1485c, AbstractC0916i.c(this.f1484b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f1483a);
        sb.append(", start=");
        sb.append(this.f1484b);
        sb.append(", end=");
        sb.append(this.f1485c);
        sb.append(", tag=");
        return AbstractC0013g0.m(sb, this.f1486d, ')');
    }

    public C0106b(String str, int i, int i3, Object obj) {
        this.f1483a = obj;
        this.f1484b = i;
        this.f1485c = i3;
        this.f1486d = str;
    }
}
