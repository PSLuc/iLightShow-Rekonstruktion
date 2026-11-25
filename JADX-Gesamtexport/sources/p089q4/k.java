package p089q4;

import J4.d;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends AbstractC0473d {
    public static List a0(Object[] objArr) {
        E4.k.f("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        E4.k.e("asList(...)", listAsList);
        return listAsList;
    }

    public static void b0(int i, int i3, int i6, byte[] bArr, byte[] bArr2) {
        E4.k.f("<this>", bArr);
        E4.k.f("destination", bArr2);
        System.arraycopy(bArr, i3, bArr2, i, i6 - i3);
    }

    public static void c0(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        E4.k.f("<this>", iArr);
        E4.k.f("destination", iArr2);
        System.arraycopy(iArr, i3, iArr2, i, i6 - i3);
    }

    public static void d0(char[] cArr, char[] cArr2, int i, int i3, int i6) {
        E4.k.f("<this>", cArr);
        E4.k.f("destination", cArr2);
        System.arraycopy(cArr, i3, cArr2, i, i6 - i3);
    }

    public static void e0(Object[] objArr, Object[] objArr2, int i, int i3, int i6) {
        E4.k.f("<this>", objArr);
        E4.k.f("destination", objArr2);
        System.arraycopy(objArr, i3, objArr2, i, i6 - i3);
    }

    public static /* synthetic */ void f0(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i3 = iArr.length;
        }
        c0(i, 0, i3, iArr, iArr2);
    }

    public static /* synthetic */ void g0(Object[] objArr, Object[] objArr2, int i, int i3, int i6) {
        if ((i6 & 4) != 0) {
            i = 0;
        }
        e0(objArr, objArr2, 0, i, i3);
    }

    public static byte[] h0(byte[] bArr, int i, int i3) {
        E4.k.f("<this>", bArr);
        AbstractC0473d.n(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i3);
        E4.k.e("copyOfRange(...)", bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public static Object[] i0(int i, int i3, Object[] objArr) {
        E4.k.f("<this>", objArr);
        AbstractC0473d.n(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i3);
        E4.k.e("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    public static void j0(int i, int i3, Object[] objArr) {
        E4.k.f("<this>", objArr);
        Arrays.fill(objArr, i, i3, (Object) null);
    }

    public static void k0(long[] jArr) {
        int length = jArr.length;
        E4.k.f("<this>", jArr);
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList m0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int n0(Object[] objArr, Object obj) {
        E4.k.f("<this>", objArr);
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] o0(byte[] bArr, List list) {
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, list.size() + length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = ((Number) it.next()).byteValue();
            length++;
        }
        E4.k.c(bArrCopyOf);
        return bArrCopyOf;
    }

    public static byte[] p0(byte[] bArr, d dVar) {
        E4.k.f("<this>", bArr);
        E4.k.f("indices", dVar);
        if (dVar.isEmpty()) {
            return new byte[0];
        }
        return h0(bArr, dVar.f1941h, dVar.i + 1);
    }

    public static List q0(float[] fArr) {
        E4.k.f("<this>", fArr);
        int length = fArr.length;
        if (length == 0) {
            return u.f11237h;
        }
        if (length == 1) {
            return d0.v(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f6 : fArr) {
            arrayList.add(Float.valueOf(f6));
        }
        return arrayList;
    }

    public static List r0(int[] iArr) {
        E4.k.f("<this>", iArr);
        int length = iArr.length;
        if (length == 0) {
            return u.f11237h;
        }
        if (length == 1) {
            return d0.v(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List s0(long[] jArr) {
        E4.k.f("<this>", jArr);
        int length = jArr.length;
        if (length == 0) {
            return u.f11237h;
        }
        if (length == 1) {
            return d0.v(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static List t0(Object[] objArr) {
        E4.k.f("<this>", objArr);
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new i(objArr, false)) : d0.v(objArr[0]);
        }
        return u.f11237h;
    }

    public static List u0(boolean[] zArr) {
        E4.k.f("<this>", zArr);
        int length = zArr.length;
        if (length == 0) {
            return u.f11237h;
        }
        if (length == 1) {
            return d0.v(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z5 : zArr) {
            arrayList.add(Boolean.valueOf(z5));
        }
        return arrayList;
    }
}
