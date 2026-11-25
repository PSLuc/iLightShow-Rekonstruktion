package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P0 f7899c = new P0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7901b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0 f7900a = new H0();

    public final S0 a(Class cls) {
        S0 s0U;
        Charset charset = D0.f7817a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f7901b;
        S0 s1 = (S0) concurrentHashMap.get(cls);
        if (s1 != null) {
            return s1;
        }
        H0 h1 = this.f7900a;
        h1.getClass();
        C0601w0 c0601w0 = T0.f7910a;
        if (!AbstractC0605y0.class.isAssignableFrom(cls)) {
            int i = AbstractC0578k0.f7955a;
        }
        R0 r0A = ((H0) h1.f7855a).a(cls);
        if ((r0A.f7908d & 2) == 2) {
            int i3 = AbstractC0578k0.f7955a;
            C0601w0 c0601w1 = T0.f7910a;
            C0601w0 c0601w2 = AbstractC0593s0.f7999a;
            s0U = new N0(c0601w1, r0A.f7905a);
        } else {
            int i6 = AbstractC0578k0.f7955a;
            int i7 = O0.f7898a;
            int i8 = F0.f7844a;
            C0601w0 c0601w3 = T0.f7910a;
            C0601w0 c0601w4 = r0A.a() + (-1) != 1 ? AbstractC0593s0.f7999a : null;
            int i9 = J0.f7863a;
            s0U = M0.u(r0A, c0601w3, c0601w4);
        }
        S0 s6 = (S0) concurrentHashMap.putIfAbsent(cls, s0U);
        return s6 != null ? s6 : s0U;
    }
}
