package p089q4;

import E4.k;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends n {
    public static LinkedHashSet V(Set set, Object obj) {
        k.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.S(set.size()));
        boolean z5 = false;
        for (Object obj2 : set) {
            boolean z6 = true;
            if (!z5 && k.a(obj2, obj)) {
                z5 = true;
                z6 = false;
            }
            if (z6) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet W(Set set, Object obj) {
        k.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.S(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set X(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return w.f11239h;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            k.e("singleton(...)", setSingleton);
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.S(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
