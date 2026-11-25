package com.nanjoran.ilightshow.Services;

import P4.C0319f;
import android.content.Context;
import com.nanjoran.outpost.outpost.Client;
import com.nanjoran.outpost.outpost.Outpost;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f8366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f8367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f8368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Client f8369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f8370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f8371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f8372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ArrayList f8373h;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        E4.k.e("newSingleThreadExecutor(...)", executorServiceNewSingleThreadExecutor);
        f8366a = executorServiceNewSingleThreadExecutor;
        f8367b = new Object();
        f8370e = Outpost.StateIdle;
        f8373h = new ArrayList();
    }

    public static Object a(Context context, p122w4.c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (f8369d != null) {
            return Boolean.TRUE;
        }
        C0319f c0319f = new C0319f(1, AbstractC0473d.F(cVar));
        c0319f.u();
        c0319f.w(new T(0, c0319f));
        E4.k.c(applicationContext);
        b(applicationContext, true, c0319f);
        Object objT = c0319f.t();
        v4.a aVar = v4.a.f13292h;
        return objT;
    }

    public static void b(Context context, boolean z5, C0319f c0319f) {
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        E4.u uVar = new E4.u();
        synchronized (f8367b) {
            if (f8369d != null) {
                if (c0319f != null) {
                    c0319f.g(Boolean.TRUE);
                }
                return;
            }
            if (z5 && c0319f != null) {
                f8373h.add(c0319f);
            }
            if (f8368c) {
                z6 = false;
            } else {
                z6 = true;
                f8368c = true;
                int i = f8372g + 1;
                f8372g = i;
                uVar.f1072h = i;
            }
            if (z6) {
                f8366a.execute(new I1.g(applicationContext, uVar));
            }
        }
    }

    public static Client c() {
        Client client;
        synchronized (f8367b) {
            f8372g++;
            client = f8369d;
            f8369d = null;
            f8368c = false;
            f8370e = Outpost.StateIdle;
            f8371f = null;
        }
        return client;
    }
}
