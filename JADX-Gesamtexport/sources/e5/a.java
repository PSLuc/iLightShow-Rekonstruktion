package e5;

import M4.s;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8755a;

    static {
        Object objV;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            E4.k.e("getProperty(...)", property);
            objV = s.X(property);
        } catch (Throwable th) {
            objV = V.v(th);
        }
        if (objV instanceof p084p4.j) {
            objV = null;
        }
        Integer num = (Integer) objV;
        f8755a = num != null ? num.intValue() : 2097152;
    }
}
