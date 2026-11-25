package E1;

import B.AbstractC0013g0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1002a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1003b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1004c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f1005d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC0013g0.r(autoCloseable);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
