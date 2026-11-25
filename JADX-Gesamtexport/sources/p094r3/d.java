package p094r3;

import java.util.Date;
import java.util.HashMap;
import p083p3.c;
import p083p3.e;
import p083p3.f;
import p088q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f11765g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11763e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f11766h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [r3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [r3.b] */
    static {
        final int i = 0;
        f11764f = new e() { // from class: r3.b
            @Override // p083p3.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((f) obj2).b((String) obj);
                        break;
                    default:
                        ((f) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i3 = 1;
        f11765g = new e() { // from class: r3.b
            @Override // p083p3.a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((f) obj2).b((String) obj);
                        break;
                    default:
                        ((f) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f11767a = map;
        HashMap map2 = new HashMap();
        this.f11768b = map2;
        this.f11769c = f11763e;
        this.f11770d = false;
        map2.put(String.class, f11764f);
        map.remove(String.class);
        map2.put(Boolean.class, f11765g);
        map.remove(Boolean.class);
        map2.put(Date.class, f11766h);
        map.remove(Date.class);
    }

    public final a a(Class cls, c cVar) {
        this.f11767a.put(cls, cVar);
        this.f11768b.remove(cls);
        return this;
    }
}
