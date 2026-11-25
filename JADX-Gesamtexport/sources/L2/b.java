package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3044a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3045b;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3045b = new p083p3.b("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        ((p083p3.d) obj2).d(f3045b, ((O2.b) obj).f4549a);
    }
}
