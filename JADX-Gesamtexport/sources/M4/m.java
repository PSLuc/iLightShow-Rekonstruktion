package M4;

import S1.V;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p006b.a {
    public static String N(String str) {
        Comparable comparable;
        E4.k.f("<this>", str);
        List listM0 = l.m0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (!l.i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p089q4.n.P(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!V.F(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM0.size();
        int iL = p089q4.m.L(listM0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM0) {
            int i6 = i + 1;
            if (i < 0) {
                p089q4.m.O();
                throw null;
            }
            String str3 = (String) obj3;
            String strB0 = ((i == 0 || i == iL) && l.i0(str3)) ? null : l.b0(iIntValue, str3);
            if (strB0 != null) {
                arrayList3.add(strB0);
            }
            i = i6;
        }
        StringBuilder sb = new StringBuilder(length3);
        p089q4.l.d0(arrayList3, sb, null, RecurringDays.RECURRING_WEEKDAYS);
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }

    public static String O(String str) {
        E4.k.f("<this>", str);
        if (l.i0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM0 = l.m0(str);
        int length = str.length();
        listM0.size();
        int iL = p089q4.m.L(listM0);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM0.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                p089q4.l.d0(arrayList, sb, null, RecurringDays.RECURRING_WEEKDAYS);
                String string = sb.toString();
                E4.k.e("toString(...)", string);
                return string;
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                p089q4.m.O();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != iL) || !l.i0(str2)) {
                int length2 = str2.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!V.F(str2.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && s.V(i6, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i6);
                    E4.k.e("substring(...)", strSubstring);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i3;
        }
    }
}
