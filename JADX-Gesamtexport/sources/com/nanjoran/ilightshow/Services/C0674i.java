package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.InterfaceC0445e;
import androidx.lifecycle.InterfaceC0458s;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674i implements InterfaceC0445e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0674i f8401h = new C0674i();
    public static final U4.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Context f8402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f8403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f8404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f8405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f8406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Long f8407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static P4.i0 f8408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f8409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f8410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f8411s;

    static {
        P4.j0 j0VarB = AbstractC0336x.b();
        W4.d dVar = P4.D.f4604a;
        i = AbstractC0336x.a(S1.h0.u(j0VarB, U4.m.f5373a.f4704m));
        f8409q = new Object();
    }

    public static void a() {
        P4.i0 i0Var = f8408p;
        if (i0Var != null) {
            i0Var.c(null);
        }
        f8408p = null;
    }

    public static void d() {
        long jCurrentTimeMillis;
        Context context = f8402j;
        if (context != null && f8405m) {
            M m6 = M.f8305O;
            boolean z5 = ((Boolean) m6.f8316b.getValue()).booleanValue() && m6.i();
            boolean zF = m6.f();
            boolean zR = m6.r();
            if (f8404l) {
                f8407o = null;
                f8411s = false;
                a();
                U.b(context, false, null);
                if (z5) {
                    i(context);
                    return;
                }
                if (f8406n) {
                    Intent intent = new Intent(context, (Class<?>) LightShowService.class);
                    intent.setAction("com.nanjoran.lightshowservice.action.stopforeground");
                    try {
                        context.startService(intent);
                        return;
                    } catch (Exception unused) {
                        context.stopService(intent);
                        return;
                    } finally {
                        f8406n = false;
                    }
                }
                return;
            }
            if (!z5 || !zF) {
                h();
                return;
            }
            U.b(context, false, null);
            i(context);
            if (zR) {
                f8407o = null;
                f8411s = false;
                a();
                return;
            }
            if (f8407o == null) {
                f8407o = Long.valueOf(System.currentTimeMillis());
            }
            Long l6 = f8407o;
            if (l6 != null) {
                jCurrentTimeMillis = System.currentTimeMillis() - l6.longValue();
            } else {
                jCurrentTimeMillis = 0;
            }
            long j4 = 600000 - jCurrentTimeMillis;
            long j6 = j4 >= 0 ? j4 : 0L;
            P4.i0 i0Var = f8408p;
            if (i0Var != null) {
                i0Var.c(null);
            }
            f8408p = AbstractC0336x.o(i, null, new C0672h(j6, null), 3);
        }
    }

    public static void e() {
        AbstractC0336x.o(i, null, new C0666e(2, null), 3);
    }

    public static void f(Context context) {
        E4.k.f("context", context);
        f8402j = context.getApplicationContext();
        synchronized (f8409q) {
            f8410r++;
        }
        ExecutorService executorService = U.f8366a;
        Context applicationContext = context.getApplicationContext();
        E4.k.e("getApplicationContext(...)", applicationContext);
        U.b(applicationContext, false, null);
        AbstractC0336x.o(i, null, new C0668f(2, null), 3);
    }

    public static void g() {
        AbstractC0336x.o(i, null, new C0670g(2, null), 3);
    }

    public static void h() {
        int i3;
        Context context = f8402j;
        if (context == null) {
            return;
        }
        a();
        f8407o = null;
        synchronized (f8409q) {
            i3 = f8410r;
        }
        if (i3 > 0) {
            f8411s = true;
            return;
        }
        Intent intent = new Intent(context, (Class<?>) LightShowService.class);
        intent.setAction("com.nanjoran.lightshowservice.action.stopforeground");
        context.stopService(intent);
        f8406n = false;
        if (!f8404l) {
            M.f8305O.L();
        }
        f8411s = false;
        U.f8366a.execute(new I3.a(11, U.c()));
    }

    public static void i(Context context) {
        Intent intent = new Intent(context, (Class<?>) LightShowService.class);
        intent.setAction("com.nanjoran.lightshowservice.action.startforeground");
        if (f8406n) {
            if (f8404l) {
                try {
                    context.startService(intent);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        try {
            f8406n = true;
            Z0.b.b(context, intent);
        } catch (Exception unused2) {
            f8406n = false;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void k(InterfaceC0458s interfaceC0458s) {
        f8404l = true;
        f8405m = true;
        f8407o = null;
        f8411s = false;
        a();
        Context context = f8402j;
        if (context != null) {
            U.b(context, false, null);
        }
        M.f8305O.y();
        d();
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void o(InterfaceC0458s interfaceC0458s) {
        f8404l = false;
        d();
    }
}
