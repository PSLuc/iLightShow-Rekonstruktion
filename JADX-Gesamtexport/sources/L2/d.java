package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3049a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p083p3.b f3051c;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3050b = new p083p3.b("logSource", Collections.unmodifiableMap(new HashMap(map)));
        p099s3.a aVar2 = new p099s3.a(2);
        HashMap map2 = new HashMap();
        map2.put(p099s3.d.class, aVar2);
        f3051c = new p083p3.b("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        O2.e eVar = (O2.e) obj;
        p083p3.d dVar = (p083p3.d) obj2;
        dVar.d(f3050b, eVar.f4561a);
        dVar.d(f3051c, eVar.f4562b);
    }
}
