package G0;

import B.AbstractC0013g0;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: G0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0108d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1493d;

    public C0108d(String str, int i, int i3, Object obj) {
        this.f1490a = obj;
        this.f1491b = i;
        this.f1492c = i3;
        this.f1493d = str;
        if (i > i3) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0108d)) {
            return false;
        }
        C0108d c0108d = (C0108d) obj;
        return E4.k.a(this.f1490a, c0108d.f1490a) && this.f1491b == c0108d.f1491b && this.f1492c == c0108d.f1492c && E4.k.a(this.f1493d, c0108d.f1493d);
    }

    public final int hashCode() {
        Object obj = this.f1490a;
        return this.f1493d.hashCode() + AbstractC0916i.c(this.f1492c, AbstractC0916i.c(this.f1491b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f1490a);
        sb.append(", start=");
        sb.append(this.f1491b);
        sb.append(", end=");
        sb.append(this.f1492c);
        sb.append(", tag=");
        return AbstractC0013g0.m(sb, this.f1493d, ')');
    }

    public C0108d(int i, int i3, Object obj) {
        this("", i, i3, obj);
    }
}
