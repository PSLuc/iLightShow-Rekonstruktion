package F1;

import B.AbstractC0013g0;
import android.net.Uri;
import android.os.Bundle;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0087d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1307q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(boolean z5, int i) {
        super(z5);
        this.f1307q = i;
    }

    public static float[] i(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] j(String str) {
        return new int[]{((Number) S.f1312b.c(str)).intValue()};
    }

    public static long[] k(String str) {
        return new long[]{((Number) S.f1315e.c(str)).longValue()};
    }

    public static boolean[] l(String str) {
        return new boolean[]{((Boolean) S.f1320k.c(str)).booleanValue()};
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        switch (this.f1307q) {
            case 0:
                return (boolean[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (zArr != null) {
                    return p089q4.k.u0(zArr);
                }
                return null;
            case 2:
                return (float[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (fArr != null) {
                    return p089q4.k.q0(fArr);
                }
                return null;
            case 4:
                return (int[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (iArr != null) {
                    return p089q4.k.r0(iArr);
                }
                return null;
            case 6:
                return (long[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (jArr != null) {
                    return p089q4.k.s0(jArr);
                }
                return null;
            case 8:
                return (String[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return p089q4.k.t0(strArr);
                }
                return null;
        }
    }

    @Override // F1.S
    public final String b() {
        switch (this.f1307q) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // F1.S
    public final Object c(String str) {
        switch (this.f1307q) {
            case 0:
                return l(str);
            case 1:
                return d0.v(S.f1320k.c(str));
            case 2:
                return i(str);
            case 3:
                return d0.v(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return j(str);
            case 5:
                return d0.v(S.f1312b.c(str));
            case 6:
                return k(str);
            case 7:
                return d0.v(S.f1315e.c(str));
            case 8:
                return new String[]{str};
            default:
                return d0.v(str);
        }
    }

    @Override // F1.S
    public final Object d(String str, Object obj) {
        switch (this.f1307q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return l(str);
                }
                boolean[] zArrL = l(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrL, 0, zArrCopyOf, length, 1);
                E4.k.c(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                N n6 = S.f1320k;
                return list != null ? p089q4.l.j0(list, d0.v(n6.c(str))) : d0.v(n6.c(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return i(str);
                }
                float[] fArrI = i(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrI, 0, fArrCopyOf, length2, 1);
                E4.k.c(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? p089q4.l.j0(list2, d0.v(Float.valueOf(Float.parseFloat(str)))) : d0.v(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return j(str);
                }
                int[] iArrJ = j(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrJ, 0, iArrCopyOf, length3, 1);
                E4.k.c(iArrCopyOf);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                N n7 = S.f1312b;
                return list3 != null ? p089q4.l.j0(list3, d0.v(n7.c(str))) : d0.v(n7.c(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return k(str);
                }
                long[] jArrK = k(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrK, 0, jArrCopyOf, length4, 1);
                E4.k.c(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                N n8 = S.f1315e;
                return list4 != null ? p089q4.l.j0(list4, d0.v(n8.c(str))) : d0.v(n8.c(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
                E4.k.c(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? p089q4.l.j0(list5, d0.v(str)) : d0.v(str);
        }
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        float[] fArr;
        switch (this.f1307q) {
            case 0:
                E4.k.f("key", str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                E4.k.f("key", str);
                bundle.putBooleanArray(str, list != null ? p089q4.l.p0(list) : null);
                break;
            case 2:
                E4.k.f("key", str);
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                E4.k.f("key", str);
                if (list2 != null) {
                    E4.k.f("<this>", list2);
                    fArr = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        fArr[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                } else {
                    fArr = null;
                }
                bundle.putFloatArray(str, fArr);
                break;
            case 4:
                E4.k.f("key", str);
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                E4.k.f("key", str);
                bundle.putIntArray(str, list3 != null ? p089q4.l.r0(list3) : null);
                break;
            case 6:
                E4.k.f("key", str);
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                E4.k.f("key", str);
                bundle.putLongArray(str, list4 != null ? p089q4.l.t0(list4) : null);
                break;
            case 8:
                E4.k.f("key", str);
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                E4.k.f("key", str);
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }

    @Override // F1.AbstractC0087d
    public final Object g() {
        switch (this.f1307q) {
            case 0:
                return new boolean[0];
            case 1:
                return p089q4.u.f11237h;
            case 2:
                return new float[0];
            case 3:
                return p089q4.u.f11237h;
            case 4:
                return new int[0];
            case 5:
                return p089q4.u.f11237h;
            case 6:
                return new long[0];
            case 7:
                return p089q4.u.f11237h;
            case 8:
                return new String[0];
            default:
                return p089q4.u.f11237h;
        }
    }

    @Override // F1.AbstractC0087d
    public final List h(Object obj) {
        switch (this.f1307q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return p089q4.u.f11237h;
                }
                List listU0 = p089q4.k.u0(zArr);
                ArrayList arrayList = new ArrayList(p089q4.n.P(listU0, 10));
                Iterator it = listU0.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                }
                return arrayList;
            case 1:
                List list = (List) obj;
                if (list == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList2 = new ArrayList(p089q4.n.P(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                }
                return arrayList2;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return p089q4.u.f11237h;
                }
                List listQ0 = p089q4.k.q0(fArr);
                ArrayList arrayList3 = new ArrayList(p089q4.n.P(listQ0, 10));
                Iterator it3 = listQ0.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(String.valueOf(((Number) it3.next()).floatValue()));
                }
                return arrayList3;
            case 3:
                List list2 = (List) obj;
                if (list2 == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList4 = new ArrayList(p089q4.n.P(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(String.valueOf(((Number) it4.next()).floatValue()));
                }
                return arrayList4;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return p089q4.u.f11237h;
                }
                List listR0 = p089q4.k.r0(iArr);
                ArrayList arrayList5 = new ArrayList(p089q4.n.P(listR0, 10));
                Iterator it5 = listR0.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                }
                return arrayList5;
            case 5:
                List list3 = (List) obj;
                if (list3 == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList6 = new ArrayList(p089q4.n.P(list3, 10));
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(String.valueOf(((Number) it6.next()).intValue()));
                }
                return arrayList6;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return p089q4.u.f11237h;
                }
                List listS0 = p089q4.k.s0(jArr);
                ArrayList arrayList7 = new ArrayList(p089q4.n.P(listS0, 10));
                Iterator it7 = listS0.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(String.valueOf(((Number) it7.next()).longValue()));
                }
                return arrayList7;
            case 7:
                List list4 = (List) obj;
                if (list4 == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList8 = new ArrayList(p089q4.n.P(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(String.valueOf(((Number) it8.next()).longValue()));
                }
                return arrayList8;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList9 = new ArrayList(strArr.length);
                for (String str : strArr) {
                    arrayList9.add(Uri.encode(str));
                }
                return arrayList9;
            default:
                List list5 = (List) obj;
                if (list5 == null) {
                    return p089q4.u.f11237h;
                }
                ArrayList arrayList10 = new ArrayList(p089q4.n.P(list5, 10));
                Iterator it9 = list5.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(Uri.encode((String) it9.next()));
                }
                return arrayList10;
        }
    }
}
