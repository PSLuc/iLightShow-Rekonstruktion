package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f3053a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p083p3.b f3055c;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3054b = new p083p3.b("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        p099s3.a aVar2 = new p099s3.a(2);
        HashMap map2 = new HashMap();
        map2.put(p099s3.d.class, aVar2);
        f3055c = new p083p3.b("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        O2.f fVar = (O2.f) obj;
        p083p3.d dVar = (p083p3.d) obj2;
        dVar.a(f3054b, fVar.f4563a);
        dVar.a(f3055c, fVar.f4564b);
    }
}
