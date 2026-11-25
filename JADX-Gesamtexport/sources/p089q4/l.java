package p089q4;

import B.AbstractC0013g0;
import B.C0005c0;
import D4.c;
import E4.k;
import H4.e;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p006b.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends r {
    public static final Object V(Iterable iterable, int i) {
        k.f("<this>", iterable);
        boolean z5 = iterable instanceof List;
        if (z5) {
            return ((List) iterable).get(i);
        }
        s sVar = new s(i);
        if (z5) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            sVar.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            sVar.invoke(Integer.valueOf(i));
            throw null;
        }
        int i3 = 0;
        for (Object obj : iterable) {
            int i6 = i3 + 1;
            if (i == i3) {
                return obj;
            }
            i3 = i6;
        }
        sVar.invoke(Integer.valueOf(i));
        throw null;
    }

    public static Object W(Iterable iterable) {
        k.f("<this>", iterable);
        if (iterable instanceof List) {
            return X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object X(List list) {
        k.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Y(Iterable iterable) {
        k.f("<this>", iterable);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object Z(List list) {
        k.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object a0(int i, List list) {
        k.f("<this>", list);
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int b0(Iterable iterable, Object obj) {
        k.f("<this>", iterable);
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                m.O();
                throw null;
            }
            if (k.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void c0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, c cVar) {
        k.f("<this>", iterable);
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            a.l(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void d0(List list, StringBuilder sb, C0005c0 c0005c0, int i) {
        if ((i & 64) != 0) {
            c0005c0 = null;
        }
        c0(list, sb, "\n", "", "", "...", c0005c0);
    }

    public static String e0(Iterable iterable, String str, String str2, String str3, c cVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            cVar = null;
        }
        k.f("<this>", iterable);
        k.f("prefix", str5);
        StringBuilder sb = new StringBuilder();
        c0(iterable, sb, str4, str5, str6, "...", cVar);
        String string = sb.toString();
        k.e("toString(...)", string);
        return string;
    }

    public static Object f0(List list) {
        k.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.L(list));
    }

    public static Object g0(Iterable iterable) {
        k.f("<this>", iterable);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object h0(List list) {
        k.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable i0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList j0(Collection collection, Iterable iterable) {
        k.f("<this>", collection);
        k.f("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r.R(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList k0(Collection collection, Object obj) {
        k.f("<this>", collection);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object l0(Collection collection) {
        H4.a aVar = e.f1802h;
        k.f("<this>", collection);
        if (collection.isEmpty()) {
            return null;
        }
        return V(collection, e.f1802h.c(collection.size()));
    }

    public static List m0(Iterable iterable) {
        k.f("<this>", iterable);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return s0(iterable);
        }
        List listV0 = v0(iterable);
        Collections.reverse(listV0);
        return listV0;
    }

    public static List n0(List list, Comparator comparator) {
        k.f("<this>", list);
        if (list.size() <= 1) {
            return s0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        k.f("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.a0(array);
    }

    public static List o0(int i, List list) {
        k.f("<this>", list);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Requested element count ", " is less than zero.").toString());
        }
        u uVar = u.f11237h;
        if (i == 0) {
            return uVar;
        }
        if (i >= list.size()) {
            return s0(list);
        }
        if (i == 1) {
            return d0.v(W(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : d0.v(arrayList.get(0));
        }
        return uVar;
    }

    public static boolean[] p0(List list) {
        k.f("<this>", list);
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void q0(Iterable iterable, AbstractCollection abstractCollection) {
        k.f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] r0(List list) {
        k.f("<this>", list);
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List s0(Iterable iterable) {
        k.f("<this>", iterable);
        boolean z5 = iterable instanceof Collection;
        u uVar = u.f11237h;
        if (!z5) {
            List listV0 = v0(iterable);
            ArrayList arrayList = (ArrayList) listV0;
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? listV0 : d0.v(arrayList.get(0));
            }
            return uVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            return u0(collection);
        }
        return d0.v(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] t0(List list) {
        k.f("<this>", list);
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList u0(Collection collection) {
        k.f("<this>", collection);
        return new ArrayList(collection);
    }

    public static final List v0(Iterable iterable) {
        k.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return u0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        q0(iterable, arrayList);
        return arrayList;
    }

    public static Set w0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set x0(Iterable iterable) {
        k.f("<this>", iterable);
        boolean z5 = iterable instanceof Collection;
        w wVar = w.f11239h;
        if (z5) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(z.S(collection.size()));
                    q0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                k.e("singleton(...)", setSingleton);
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            q0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                k.e("singleton(...)", setSingleton2);
                return setSingleton2;
            }
        }
        return wVar;
    }
}
