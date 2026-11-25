package L2;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p091r0.d f3077a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        p094r3.a aVar = p099s3.f.f12207a;
        map.put(n.class, e.f3052a);
        map2.remove(n.class);
        map.put(O2.a.class, a.f3039a);
        map2.remove(O2.a.class);
        map.put(O2.g.class, g.f3056a);
        map2.remove(O2.g.class);
        map.put(O2.e.class, d.f3049a);
        map2.remove(O2.e.class);
        map.put(O2.d.class, c.f3046a);
        map2.remove(O2.d.class);
        map.put(O2.b.class, b.f3044a);
        map2.remove(O2.b.class);
        map.put(O2.f.class, f.f3053a);
        map2.remove(O2.f.class);
        f3077a = new p091r0.d(new HashMap(map), new HashMap(map2), aVar, 1);
    }
}
