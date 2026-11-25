package p024e0;

import E4.k;
import java.util.Arrays;
import java.util.Comparator;
import p124x0.AbstractC1098f;
import p124x0.D;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f8677a = new t();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i = 0;
        if (d.t(rVar) && d.t(rVar2)) {
            D dS = AbstractC1098f.s(rVar);
            D dS2 = AbstractC1098f.s(rVar2);
            if (!k.a(dS, dS2)) {
                Object[] objArrCopyOf = new D[16];
                int i3 = 0;
                while (dS != null) {
                    int i6 = i3 + 1;
                    if (objArrCopyOf.length < i6) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i6, objArrCopyOf.length * 2));
                        k.e("copyOf(this, newSize)", objArrCopyOf);
                    }
                    if (i3 != 0) {
                        p089q4.k.e0(objArrCopyOf, objArrCopyOf, 0 + 1, 0, i3);
                    }
                    objArrCopyOf[0] = dS;
                    i3++;
                    dS = dS.r();
                }
                Object[] objArrCopyOf2 = new D[16];
                int i7 = 0;
                while (dS2 != null) {
                    int i8 = i7 + 1;
                    if (objArrCopyOf2.length < i8) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i8, objArrCopyOf2.length * 2));
                        k.e("copyOf(this, newSize)", objArrCopyOf2);
                    }
                    if (i7 != 0) {
                        p089q4.k.e0(objArrCopyOf2, objArrCopyOf2, 0 + 1, 0, i7);
                    }
                    objArrCopyOf2[0] = dS2;
                    i7++;
                    dS2 = dS2.r();
                }
                int iMin = Math.min(i3 - 1, i7 - 1);
                if (iMin >= 0) {
                    while (k.a(objArrCopyOf[i], objArrCopyOf2[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return k.h(((D) objArrCopyOf[i]).s(), ((D) objArrCopyOf2[i]).s());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.t(rVar)) {
                return -1;
            }
            if (d.t(rVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
