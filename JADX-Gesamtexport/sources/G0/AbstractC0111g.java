package G0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: G0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0110f f1497a = new C0110f("", null, 6);

    public static final ArrayList a(int i, int i3, List list) {
        if (i > i3) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            C0108d c0108d = (C0108d) obj;
            if (c(i, i3, c0108d.f1491b, c0108d.f1492c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C0108d c0108d2 = (C0108d) arrayList.get(i7);
            arrayList2.add(new C0108d(c0108d2.f1493d, Math.max(i, c0108d2.f1491b) - i, Math.min(i3, c0108d2.f1492c) - i, c0108d2.f1490a));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(C0110f c0110f, int i, int i3) {
        List list;
        if (i == i3 || (list = c0110f.i) == null) {
            return null;
        }
        if (i == 0 && i3 >= c0110f.f1494h.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            C0108d c0108d = (C0108d) obj;
            if (c(i, i3, c0108d.f1491b, c0108d.f1492c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C0108d c0108d2 = (C0108d) arrayList.get(i7);
            arrayList2.add(new C0108d(p081p0.c.O(c0108d2.f1491b, i, i3) - i, p081p0.c.O(c0108d2.f1492c, i, i3) - i, c0108d2.f1490a));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:23:0x002c  */
    /* JADX WARN: Code duplicated, block: B:24:0x002e  */
    public static final boolean c(int i, int i3, int i6, int i7) {
        boolean z5;
        boolean z6;
        if (Math.max(i, i6) >= Math.min(i3, i7)) {
            if (i > i6 || i7 > i3) {
                if (i6 <= i && i3 <= i7) {
                    if (i7 == i3) {
                        if (i == i3) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i6 == i7) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5 == z6) {
                        }
                    }
                }
                return false;
            }
            if (i3 == i7) {
                if ((i6 == i7) != (i == i3)) {
                    if (i6 <= i) {
                        if (i7 == i3) {
                            if (i == i3) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i6 == i7) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5 == z6) {
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
