package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3046a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p083p3.b f3048c;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3047b = new p083p3.b("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        p099s3.a aVar2 = new p099s3.a(3);
        HashMap map2 = new HashMap();
        map2.put(p099s3.d.class, aVar2);
        f3048c = new p083p3.b("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        O2.d dVar = (O2.d) obj;
        p083p3.d dVar2 = (p083p3.d) obj2;
        dVar2.a(f3047b, dVar.f4558a);
        dVar2.d(f3048c, dVar.f4559b);
    }
}
