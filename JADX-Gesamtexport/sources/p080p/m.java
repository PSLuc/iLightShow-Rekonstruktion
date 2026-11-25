package p080p;

import E4.k;
import java.util.ConcurrentModificationException;
import p085q.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10743a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f10744b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10745c = new Object();

    public static final void a(F f6) {
        int i = f6.f10720k;
        int[] iArr = f6.i;
        Object[] objArr = f6.f10719j;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f10745c) {
                if (i6 != i3) {
                    iArr[i3] = iArr[i6];
                    objArr[i3] = obj;
                    objArr[i6] = null;
                }
                i3++;
            }
        }
        f6.f10718h = false;
        f6.f10720k = i3;
    }

    public static final void b(C0834f c0834f, int i) {
        k.f("<this>", c0834f);
        c0834f.f10733h = new int[i];
        c0834f.i = new Object[i];
    }

    public static final int c(C0834f c0834f, Object obj, int i) {
        k.f("<this>", c0834f);
        int i3 = c0834f.f10734j;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = a.a(c0834f.f10734j, i, c0834f.f10733h);
            if (iA < 0 || k.a(obj, c0834f.i[iA])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i3 && c0834f.f10733h[i6] == i) {
                if (k.a(obj, c0834f.i[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && c0834f.f10733h[i7] == i; i7--) {
                if (k.a(obj, c0834f.i[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
