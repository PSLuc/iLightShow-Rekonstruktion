package H1;

import B.AbstractC0013g0;
import E4.k;
import F1.AbstractC0087d;
import android.os.Bundle;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p089q4.n;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0087d {
    public static double[] i(String str) {
        return new double[]{Double.valueOf(Double.parseDouble(str)).doubleValue()};
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        return (double[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
    }

    @Override // F1.S
    public final String b() {
        return "double[]";
    }

    @Override // F1.S
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return i(str);
    }

    @Override // F1.S
    public final Object d(String str, Object obj) {
        double[] dArr = (double[]) obj;
        double[] dArrI = i(str);
        if (dArr == null) {
            return dArrI;
        }
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        System.arraycopy(dArrI, 0, dArrCopyOf, length, 1);
        k.c(dArrCopyOf);
        return dArrCopyOf;
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        k.f("key", str);
        bundle.putDoubleArray(str, (double[]) obj);
    }

    @Override // F1.AbstractC0087d
    public final Object g() {
        return new double[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, q4.u] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    @Override // F1.AbstractC0087d
    public final List h(Object obj) {
        double[] dArr = (double[]) obj;
        ?? V4 = u.f11237h;
        if (dArr == null) {
            return V4;
        }
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                V4 = new ArrayList(dArr.length);
                for (double d6 : dArr) {
                    V4.add(Double.valueOf(d6));
                }
            } else {
                V4 = d0.v(Double.valueOf(dArr[0]));
            }
        }
        ArrayList arrayList = new ArrayList(n.P(V4, 10));
        Iterator it = V4.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }
}
