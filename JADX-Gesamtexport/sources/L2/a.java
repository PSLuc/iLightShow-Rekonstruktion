package L2;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p083p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3039a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p083p3.b f3040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p083p3.b f3041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p083p3.b f3042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p083p3.b f3043e;

    static {
        p099s3.a aVar = new p099s3.a(1);
        HashMap map = new HashMap();
        map.put(p099s3.d.class, aVar);
        f3040b = new p083p3.b("window", Collections.unmodifiableMap(new HashMap(map)));
        p099s3.a aVar2 = new p099s3.a(2);
        HashMap map2 = new HashMap();
        map2.put(p099s3.d.class, aVar2);
        f3041c = new p083p3.b("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        p099s3.a aVar3 = new p099s3.a(3);
        HashMap map3 = new HashMap();
        map3.put(p099s3.d.class, aVar3);
        f3042d = new p083p3.b("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        p099s3.a aVar4 = new p099s3.a(4);
        HashMap map4 = new HashMap();
        map4.put(p099s3.d.class, aVar4);
        f3043e = new p083p3.b("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        O2.a aVar = (O2.a) obj;
        p083p3.d dVar = (p083p3.d) obj2;
        dVar.d(f3040b, aVar.f4545a);
        dVar.d(f3041c, aVar.f4546b);
        dVar.d(f3042d, aVar.f4547c);
        dVar.d(f3043e, aVar.f4548d);
    }
}
