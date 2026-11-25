package G0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: G0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110f implements CharSequence {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1494h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f1495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f1496k;

    static {
        D.x xVar = B.f1409a;
    }

    public C0110f(String str, List list, List list2, List list3) {
        this.f1494h = str;
        this.i = list;
        this.f1495j = list2;
        this.f1496k = list3;
        if (list2 != null) {
            List listN0 = p089q4.l.n0(list2, new C0109e());
            int size = listN0.size();
            int i = -1;
            int i3 = 0;
            while (i3 < size) {
                C0108d c0108d = (C0108d) listN0.get(i3);
                if (c0108d.f1491b < i) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f1494h.length();
                int i6 = c0108d.f1492c;
                if (i6 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0108d.f1491b + ", " + i6 + ") is out of boundary").toString());
                }
                i3++;
                i = i6;
            }
        }
    }

    public final List a(int i) {
        List list = this.f1496k;
        if (list == null) {
            return p089q4.u.f11237h;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            C0108d c0108d = (C0108d) obj;
            if ((c0108d.f1490a instanceof AbstractC0116l) && AbstractC0111g.c(0, i, c0108d.f1491b, c0108d.f1492c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b() {
        List list = this.i;
        return list == null ? p089q4.u.f11237h : list;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0110f subSequence(int i, int i3) {
        if (i > i3) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i3 + ')').toString());
        }
        String str = this.f1494h;
        if (i == 0 && i3 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i3);
        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return new C0110f(strSubstring, AbstractC0111g.a(i, i3, this.i), AbstractC0111g.a(i, i3, this.f1495j), AbstractC0111g.a(i, i3, this.f1496k));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1494h.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0110f)) {
            return false;
        }
        C0110f c0110f = (C0110f) obj;
        return E4.k.a(this.f1494h, c0110f.f1494h) && E4.k.a(this.i, c0110f.i) && E4.k.a(this.f1495j, c0110f.f1495j) && E4.k.a(this.f1496k, c0110f.f1496k);
    }

    public final int hashCode() {
        int iHashCode = this.f1494h.hashCode() * 31;
        List list = this.i;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f1495j;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f1496k;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1494h.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1494h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0110f(String str, ArrayList arrayList, int i) {
        List list = (i & 2) != 0 ? p089q4.u.f11237h : arrayList;
        this(str, list.isEmpty() ? null : list, null, null);
    }
}
