package p105t3;

import F.L;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C0608a;
import com.google.gson.internal.bind.C0611d;
import com.google.gson.internal.bind.C0613f;
import com.google.gson.internal.bind.C0617j;
import com.google.gson.internal.bind.C0618k;
import com.google.gson.internal.bind.C0619l;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.N;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.Z;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p110u3.b;
import p116v3.d;
import p116v3.h;
import p132y3.a;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f12567h = i.f12560d;
    public static final C0958a i = h.f12559h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f12568j = B.f12557h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f12569k = B.i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f12572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f12576g;

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        Excluder excluder = Excluder.f8026k;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(excluder, i, map, true, f12567h, true, 1, list, f12568j, f12569k, list);
    }

    public static void a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(d6 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Reader reader, Type type) {
        return c(reader, a.get(type));
    }

    public final Object c(Reader reader, a aVar) {
        p138z3.a aVar2 = new p138z3.a(reader);
        aVar2.i0(2);
        Object objF = f(aVar2, aVar);
        if (objF != null) {
            try {
                if (aVar2.f0() != 10) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e6) {
                throw new JsonSyntaxException(e6);
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        }
        return objF;
    }

    public final Object d(String str, Class cls) {
        return d.m(cls).cast(str == null ? null : c(new StringReader(str), a.get(cls)));
    }

    public final Object e(r rVar, Class cls) {
        Object objF;
        a aVar = a.get(cls);
        if (rVar == null) {
            objF = null;
        } else {
            C0613f c0613f = new C0613f(C0613f.f8088A);
            c0613f.f8090w = new Object[32];
            c0613f.f8091x = 0;
            c0613f.f8092y = new String[32];
            c0613f.f8093z = new int[32];
            c0613f.v0(rVar);
            objF = f(c0613f, aVar);
        }
        return d.m(cls).cast(objF);
    }

    public final Object f(p138z3.a aVar, a aVar2) {
        int i3 = aVar.f14644v;
        boolean z5 = true;
        if (i3 == 2) {
            aVar.f14644v = 1;
        }
        try {
            try {
                try {
                    aVar.f0();
                    z5 = false;
                    Object objA = g(aVar2).a(aVar);
                    aVar.i0(i3);
                    return objA;
                } catch (IOException e6) {
                    throw new JsonSyntaxException(e6);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
                }
            } catch (EOFException e8) {
                if (!z5) {
                    throw new JsonSyntaxException(e8);
                }
                aVar.i0(i3);
                return null;
            } catch (IllegalStateException e9) {
                throw new JsonSyntaxException(e9);
            }
        } catch (Throwable th) {
            aVar.i0(i3);
            throw th;
        }
    }

    public final C g(a aVar) {
        boolean z5;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f12571b;
        C c6 = (C) concurrentHashMap.get(aVar);
        if (c6 != null) {
            return c6;
        }
        ThreadLocal threadLocal = this.f12570a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            C c7 = (C) map.get(aVar);
            if (c7 != null) {
                return c7;
            }
            z5 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f12574e.iterator();
            C cA = null;
            while (it.hasNext()) {
                cA = ((D) it.next()).a(this, aVar);
                if (cA != null) {
                    if (lVar.f12566a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f12566a = cA;
                    map.put(aVar, cA);
                    break;
                }
            }
            if (z5) {
                threadLocal.remove();
            }
            if (cA != null) {
                if (z5) {
                    concurrentHashMap.putAll(map);
                }
                return cA;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z5) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public final C h(D d6, a aVar) {
        Objects.requireNonNull(d6, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.f12573d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        if (d6 == JsonAdapterAnnotationTypeAdapterFactory.f8030j) {
            d6 = jsonAdapterAnnotationTypeAdapterFactory;
        } else {
            Class rawType = aVar.getRawType();
            ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.i;
            D d7 = (D) concurrentHashMap.get(rawType);
            if (d7 == null) {
                b bVar = (b) rawType.getAnnotation(b.class);
                if (bVar != null) {
                    Class clsValue = bVar.value();
                    if (D.class.isAssignableFrom(clsValue)) {
                        D d8 = (D) jsonAdapterAnnotationTypeAdapterFactory.f8032h.f(a.get(clsValue)).l();
                        D d9 = (D) concurrentHashMap.putIfAbsent(rawType, d8);
                        if (d9 != null) {
                            d8 = d9;
                        }
                        if (d8 == d6) {
                            d6 = jsonAdapterAnnotationTypeAdapterFactory;
                        }
                    }
                }
            } else if (d7 == d6) {
                d6 = jsonAdapterAnnotationTypeAdapterFactory;
            }
        }
        boolean z5 = false;
        for (D d10 : this.f12574e) {
            if (z5) {
                C cA = d10.a(this, aVar);
                if (cA != null) {
                    return cA;
                }
            } else if (d10 == d6) {
                z5 = true;
            }
        }
        if (!z5) {
            return g(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public final c i(Writer writer) {
        c cVar = new c(writer);
        cVar.L(this.f12576g);
        cVar.f14655p = this.f12575f;
        cVar.M(2);
        cVar.f14657r = false;
        return cVar;
    }

    public final String j(Object obj) {
        return obj == null ? l(s.f12591h) : k(obj, obj.getClass());
    }

    public final String k(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            m(obj, type, i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new JsonIOException(e6);
        }
    }

    public final String l(r rVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            n(rVar, i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new JsonIOException(e6);
        }
    }

    public final void m(Object obj, Type type, c cVar) {
        C cG = g(a.get(type));
        int i3 = cVar.f14654o;
        if (i3 == 2) {
            cVar.f14654o = 1;
        }
        boolean z5 = cVar.f14655p;
        boolean z6 = cVar.f14657r;
        cVar.f14655p = this.f12575f;
        cVar.f14657r = false;
        try {
            try {
                cG.b(cVar, obj);
                cVar.M(i3);
                cVar.f14655p = z5;
                cVar.f14657r = z6;
            } catch (IOException e6) {
                throw new JsonIOException(e6);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e7.getMessage(), e7);
            }
        } catch (Throwable th) {
            cVar.M(i3);
            cVar.f14655p = z5;
            cVar.f14657r = z6;
            throw th;
        }
    }

    public final void n(r rVar, c cVar) {
        int i3 = cVar.f14654o;
        boolean z5 = cVar.f14655p;
        boolean z6 = cVar.f14657r;
        cVar.f14655p = this.f12575f;
        cVar.f14657r = false;
        if (i3 == 2) {
            cVar.f14654o = 1;
        }
        try {
            try {
                try {
                    Z.f8079z.getClass();
                    N.d(rVar, cVar);
                    cVar.M(i3);
                    cVar.f14655p = z5;
                    cVar.f14657r = z6;
                } catch (AssertionError e6) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
                }
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            }
        } catch (Throwable th) {
            cVar.M(i3);
            cVar.f14655p = z5;
            cVar.f14657r = z6;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f12574e + ",instanceCreators:" + this.f12572c + "}";
    }

    public m(Excluder excluder, h hVar, Map map, boolean z5, i iVar, boolean z6, int i3, List list, B b6, B b7, List list2) {
        C jVar;
        D dC;
        this.f12570a = new ThreadLocal();
        this.f12571b = new ConcurrentHashMap();
        L l6 = new L(map, z6, list2);
        this.f12572c = l6;
        this.f12575f = z5;
        this.f12576g = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Z.f8053A);
        arrayList.add(C0618k.c(b6));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(Z.f8069p);
        arrayList.add(Z.f8061g);
        arrayList.add(Z.f8058d);
        arrayList.add(Z.f8059e);
        arrayList.add(Z.f8060f);
        if (i3 == 1) {
            jVar = Z.f8064k;
        } else {
            jVar = new j();
        }
        arrayList.add(Z.a(Long.TYPE, Long.class, jVar));
        arrayList.add(Z.a(Double.TYPE, Double.class, new C0619l(1)));
        arrayList.add(Z.a(Float.TYPE, Float.class, new C0619l(2)));
        if (b7 == B.i) {
            dC = C0617j.f8103b;
        } else {
            dC = C0617j.c(b7);
        }
        arrayList.add(dC);
        arrayList.add(Z.f8062h);
        arrayList.add(Z.i);
        arrayList.add(Z.b(AtomicLong.class, new k(new k(jVar, 0), 2)));
        arrayList.add(Z.b(AtomicLongArray.class, new k(new k(jVar, 1), 2)));
        arrayList.add(Z.f8063j);
        arrayList.add(Z.f8065l);
        arrayList.add(Z.f8070q);
        arrayList.add(Z.f8071r);
        arrayList.add(Z.b(BigDecimal.class, Z.f8066m));
        arrayList.add(Z.b(BigInteger.class, Z.f8067n));
        arrayList.add(Z.b(h.class, Z.f8068o));
        arrayList.add(Z.f8072s);
        arrayList.add(Z.f8073t);
        arrayList.add(Z.f8075v);
        arrayList.add(Z.f8076w);
        arrayList.add(Z.f8078y);
        arrayList.add(Z.f8074u);
        arrayList.add(Z.f8056b);
        arrayList.add(C0611d.f8085c);
        arrayList.add(Z.f8077x);
        if (com.google.gson.internal.sql.c.f8145a) {
            arrayList.add(com.google.gson.internal.sql.c.f8149e);
            arrayList.add(com.google.gson.internal.sql.c.f8148d);
            arrayList.add(com.google.gson.internal.sql.c.f8150f);
        }
        arrayList.add(C0608a.f8080c);
        arrayList.add(Z.f8055a);
        arrayList.add(new CollectionTypeAdapterFactory(l6));
        arrayList.add(new MapTypeAdapterFactory(l6));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(l6);
        this.f12573d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(Z.f8054B);
        arrayList.add(new ReflectiveTypeAdapterFactory(l6, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.f12574e = Collections.unmodifiableList(arrayList);
    }
}
