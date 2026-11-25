package V2;

import I2.c;
import android.util.SparseArray;
import java.util.HashMap;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f5506a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f5507b;

    static {
        HashMap map = new HashMap();
        f5507b = map;
        map.put(c.f1854h, 0);
        map.put(c.i, 1);
        map.put(c.f1855j, 2);
        for (c cVar : map.keySet()) {
            f5506a.append(((Integer) f5507b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f5507b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i) {
        c cVar = (c) f5506a.get(i);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(k.r(i, "Unknown Priority for value "));
    }
}
