package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3056a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p083p3.b f3058c;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3057b = new p083p3.b("startMs", Collections.unmodifiableMap(new HashMap(map)));
        p099s3.a aVar2 = new p099s3.a(2);
        HashMap map2 = new HashMap();
        map2.put(p099s3.d.class, aVar2);
        f3058c = new p083p3.b("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        O2.g gVar = (O2.g) obj;
        p083p3.d dVar = (p083p3.d) obj2;
        dVar.a(f3057b, gVar.f4565a);
        dVar.a(f3058c, gVar.f4566b);
    }
}
