package p109u2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p015c2.B;
import p015c2.C0474e;
import p015c2.r;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f12703h;
    public final Enum[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f12704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Enum f12705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f12706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f12707m;

    public m(Class cls, Enum[] enumArr, HashMap map, Enum r6, boolean z5, boolean z6) {
        this.f12703h = cls;
        this.i = enumArr;
        this.f12704j = map;
        this.f12705k = r6;
        this.f12706l = z5;
        this.f12707m = z6;
    }

    public static Enum[] a(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static m c(C0474e c0474e, Class cls) {
        B bD = c0474e.d();
        boolean zK = c0474e.k(r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA = a(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrA.length][];
        bD.k(cls, enumArrA, strArr);
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                return new m(cls, enumArrA, map, bD.g(cls), zK, false);
            }
            Enum r6 = enumArrA[length];
            map.put(r6.toString(), r6);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map.containsKey(str)) {
                        map.put(str, r6);
                    }
                }
            }
        }
    }

    public final j b() {
        int i;
        HashMap map = this.f12704j;
        if (map.isEmpty()) {
            return j.f12700k;
        }
        int size = map.size();
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i3 = 32;
            while (i3 < size + (size >> 2)) {
                i3 += i3;
            }
            i = i3;
        }
        int i6 = i - 1;
        int i7 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i7 * 2];
        int i8 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                int iHashCode = str.hashCode() & i6;
                int i9 = iHashCode + iHashCode;
                if (objArrCopyOf[i9] != null) {
                    i9 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i9] != null) {
                        i9 = (i7 << 1) + i8;
                        i8 += 2;
                        if (i9 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i9] = str;
                objArrCopyOf[i9 + 1] = entry.getValue();
            }
        }
        return new j(i6, i8, objArrCopyOf);
    }
}
