package p089q4;

import E4.k;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.List;
import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends d0 {
    public static ArrayList J(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static int K(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        k.f("<this>", arrayList);
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i3 = size - 1;
        while (i <= i3) {
            int i6 = (i + i3) >>> 1;
            int iR = a.R((Comparable) arrayList.get(i6), comparable);
            if (iR < 0) {
                i = i6 + 1;
            } else {
                if (iR <= 0) {
                    return i6;
                }
                i3 = i6 - 1;
            }
        }
        return -(i + 1);
    }

    public static int L(List list) {
        k.f("<this>", list);
        return list.size() - 1;
    }

    public static List M(Object... objArr) {
        k.f("elements", objArr);
        return objArr.length > 0 ? k.a0(objArr) : u.f11237h;
    }

    public static ArrayList N(Object... objArr) {
        k.f("elements", objArr);
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static void O() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
