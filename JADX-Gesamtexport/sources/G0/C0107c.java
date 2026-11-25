package G0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: G0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0107c implements Appendable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StringBuilder f1487h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1489k;

    public C0107c() {
        this.f1487h = new StringBuilder(16);
        this.i = new ArrayList();
        this.f1488j = new ArrayList();
        this.f1489k = new ArrayList();
        new ArrayList();
    }

    public final void a(C c6, int i, int i3) {
        this.i.add(new C0106b(i, i3, c6));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0110f) {
            b((C0110f) charSequence);
            return this;
        }
        this.f1487h.append(charSequence);
        return this;
    }

    public final void b(C0110f c0110f) {
        StringBuilder sb = this.f1487h;
        int length = sb.length();
        sb.append(c0110f.f1494h);
        List list = c0110f.i;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0108d c0108d = (C0108d) list.get(i);
                a((C) c0108d.f1490a, c0108d.f1491b + length, c0108d.f1492c + length);
            }
        }
        List list2 = c0110f.f1495j;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0108d c0108d2 = (C0108d) list2.get(i3);
                this.f1488j.add(new C0106b(c0108d2.f1491b + length, c0108d2.f1492c + length, (t) c0108d2.f1490a));
            }
        }
        List list3 = c0110f.f1496k;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                C0108d c0108d3 = (C0108d) list3.get(i6);
                this.f1489k.add(new C0106b(c0108d3.f1493d, c0108d3.f1491b + length, c0108d3.f1492c + length, c0108d3.f1490a));
            }
        }
    }

    public final C0110f c() {
        StringBuilder sb = this.f1487h;
        String string = sb.toString();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C0106b) arrayList.get(i)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f1488j;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList4.add(((C0106b) arrayList3.get(i3)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f1489k;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            arrayList6.add(((C0106b) arrayList5.get(i6)).a(sb.length()));
        }
        return new C0110f(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i3) {
        ?? arrayList;
        ?? arrayList2;
        boolean z5 = charSequence instanceof C0110f;
        StringBuilder sb = this.f1487h;
        if (z5) {
            C0110f c0110f = (C0110f) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0110f.f1494h, i, i3);
            List listB = AbstractC0111g.b(c0110f, i, i3);
            if (listB != null) {
                int size = listB.size();
                for (int i6 = 0; i6 < size; i6++) {
                    C0108d c0108d = (C0108d) listB.get(i6);
                    a((C) c0108d.f1490a, c0108d.f1491b + length, c0108d.f1492c + length);
                }
            }
            ?? r6 = 0;
            r6 = 0;
            String str = c0110f.f1494h;
            if (i == i3 || (arrayList = c0110f.f1495j) == 0) {
                arrayList = 0;
            } else if (i != 0 || i3 < str.length()) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj = arrayList.get(i7);
                    C0108d c0108d2 = (C0108d) obj;
                    if (AbstractC0111g.c(i, i3, c0108d2.f1491b, c0108d2.f1492c)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    C0108d c0108d3 = (C0108d) arrayList3.get(i8);
                    arrayList.add(new C0108d(p081p0.c.O(c0108d3.f1491b, i, i3) - i, p081p0.c.O(c0108d3.f1492c, i, i3) - i, c0108d3.f1490a));
                }
            }
            if (arrayList != 0) {
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    C0108d c0108d4 = (C0108d) arrayList.get(i9);
                    this.f1488j.add(new C0106b(c0108d4.f1491b + length, c0108d4.f1492c + length, (t) c0108d4.f1490a));
                }
            }
            if (i != i3 && (arrayList2 = c0110f.f1496k) != 0) {
                if (i != 0 || i3 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size5 = arrayList2.size();
                    for (int i10 = 0; i10 < size5; i10++) {
                        Object obj2 = arrayList2.get(i10);
                        C0108d c0108d5 = (C0108d) obj2;
                        if (AbstractC0111g.c(i, i3, c0108d5.f1491b, c0108d5.f1492c)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4.size());
                    int size6 = arrayList4.size();
                    for (int i11 = 0; i11 < size6; i11++) {
                        C0108d c0108d6 = (C0108d) arrayList4.get(i11);
                        arrayList2.add(new C0108d(c0108d6.f1493d, p081p0.c.O(c0108d6.f1491b, i, i3) - i, p081p0.c.O(c0108d6.f1492c, i, i3) - i, c0108d6.f1490a));
                    }
                }
                r6 = arrayList2;
            }
            if (r6 != 0) {
                int size7 = r6.size();
                for (int i12 = 0; i12 < size7; i12++) {
                    C0108d c0108d7 = (C0108d) r6.get(i12);
                    this.f1489k.add(new C0106b(c0108d7.f1493d, c0108d7.f1491b + length, c0108d7.f1492c + length, c0108d7.f1490a));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i3);
        return this;
    }

    public C0107c(C0110f c0110f) {
        this();
        b(c0110f);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) {
        this.f1487h.append(c6);
        return this;
    }
}
