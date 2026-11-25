package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O f8176c = new O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8178b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f8177a = new C();

    public final S a(Class cls) {
        S s6;
        Class cls2;
        Charset charset = AbstractC0652u.f8224a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f8178b;
        S s7 = (S) concurrentHashMap.get(cls);
        if (s7 != null) {
            return s7;
        }
        C c6 = this.f8177a;
        c6.getClass();
        Class cls3 = T.f8185a;
        if (!r.class.isAssignableFrom(cls) && (cls2 = T.f8185a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        Q qA = c6.f8153a.a(cls);
        if ((qA.f8184d & 2) == 2) {
            boolean zIsAssignableFrom = r.class.isAssignableFrom(cls);
            r rVar = qA.f8181a;
            if (zIsAssignableFrom) {
                s6 = new J(T.f8187c, AbstractC0645m.f8219a, rVar);
            } else {
                U u6 = T.f8186b;
                C0644l c0644l = AbstractC0645m.f8220b;
                if (c0644l == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                s6 = new J(u6, c0644l, rVar);
            }
        } else if (r.class.isAssignableFrom(cls)) {
            s6 = AbstractC0916i.d(qA.a()) != 1 ? I.s(qA, L.f8175b, AbstractC0657z.f8228b, T.f8187c, AbstractC0645m.f8219a, F.f8156b) : I.s(qA, L.f8175b, AbstractC0657z.f8228b, T.f8187c, null, F.f8156b);
        } else if (AbstractC0916i.d(qA.a()) != 1) {
            K k3 = L.f8174a;
            C0655x c0655x = AbstractC0657z.f8227a;
            U u7 = T.f8186b;
            C0644l c0644l2 = AbstractC0645m.f8220b;
            if (c0644l2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            s6 = I.s(qA, k3, c0655x, u7, c0644l2, F.f8155a);
        } else {
            s6 = I.s(qA, L.f8174a, AbstractC0657z.f8227a, T.f8186b, null, F.f8155a);
        }
        S s8 = (S) concurrentHashMap.putIfAbsent(cls, s6);
        return s8 != null ? s8 : s6;
    }
}
