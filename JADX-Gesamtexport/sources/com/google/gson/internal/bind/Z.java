package com.google.gson.internal.bind;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final p105t3.D f8053A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final p105t3.D f8054B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p105t3.D f8055a = new TypeAdapters$31(Class.class, new p105t3.k(new E(), 2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p105t3.D f8056b = new TypeAdapters$31(BitSet.class, new p105t3.k(new O(), 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f8057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p105t3.D f8058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p105t3.D f8059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p105t3.D f8060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p105t3.D f8061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p105t3.D f8062h;
    public static final p105t3.D i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p105t3.D f8063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0628v f8064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p105t3.D f8065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final A f8066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final B f8067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C f8068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p105t3.D f8069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p105t3.D f8070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p105t3.D f8071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p105t3.D f8072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p105t3.D f8073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p105t3.D f8074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p105t3.D f8075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p105t3.D f8076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p105t3.D f8077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p105t3.D f8078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final N f8079z;

    static {
        Q q6 = new Q();
        f8057c = new S();
        f8058d = new TypeAdapters$32(Boolean.TYPE, Boolean.class, q6);
        f8059e = new TypeAdapters$32(Byte.TYPE, Byte.class, new T());
        f8060f = new TypeAdapters$32(Short.TYPE, Short.class, new U());
        f8061g = new TypeAdapters$32(Integer.TYPE, Integer.class, new V());
        f8062h = new TypeAdapters$31(AtomicInteger.class, new p105t3.k(new W(), 2));
        i = new TypeAdapters$31(AtomicBoolean.class, new p105t3.k(new X(), 2));
        f8063j = new TypeAdapters$31(AtomicIntegerArray.class, new p105t3.k(new C0627u(), 2));
        f8064k = new C0628v();
        new C0629w();
        new C0630x();
        f8065l = new TypeAdapters$32(Character.TYPE, Character.class, new C0631y());
        C0632z c0632z = new C0632z();
        f8066m = new A();
        f8067n = new B();
        f8068o = new C();
        f8069p = new TypeAdapters$31(String.class, c0632z);
        f8070q = new TypeAdapters$31(StringBuilder.class, new D());
        f8071r = new TypeAdapters$31(StringBuffer.class, new F());
        f8072s = new TypeAdapters$31(URL.class, new G());
        f8073t = new TypeAdapters$31(URI.class, new H());
        f8074u = new TypeAdapters$34(InetAddress.class, new I());
        f8075v = new TypeAdapters$31(UUID.class, new J());
        f8076w = new TypeAdapters$31(Currency.class, new p105t3.k(new K(), 2));
        final L l6 = new L();
        f8077x = new p105t3.D() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // p105t3.D
            public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return l6;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + l6 + "]";
            }
        };
        f8078y = new TypeAdapters$31(Locale.class, new M());
        N n6 = new N();
        f8079z = n6;
        f8053A = new TypeAdapters$34(p105t3.r.class, n6);
        f8054B = new p105t3.D() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // p105t3.D
            public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
                Class rawType = aVar.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new C0626t(rawType);
            }
        };
    }

    public static p105t3.D a(Class cls, Class cls2, p105t3.C c6) {
        return new TypeAdapters$32(cls, cls2, c6);
    }

    public static p105t3.D b(Class cls, p105t3.C c6) {
        return new TypeAdapters$31(cls, c6);
    }

    public static p105t3.D c(final p132y3.a aVar, final p105t3.C c6) {
        return new p105t3.D() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // p105t3.D
            public final p105t3.C a(p105t3.m mVar, p132y3.a aVar2) {
                if (aVar2.equals(aVar)) {
                    return c6;
                }
                return null;
            }
        };
    }
}
