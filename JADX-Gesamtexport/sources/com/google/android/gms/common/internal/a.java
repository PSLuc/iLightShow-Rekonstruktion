package com.google.android.gms.common.internal;

import B.C0025m0;
import B.C0031p0;
import L2.o;
import O1.B;
import O1.E;
import W2.c;
import W2.e;
import X2.d;
import Y2.h;
import Z2.l;
import Z2.m;
import Z2.n;
import Z2.p;
import Z2.q;
import Z2.r;
import Z2.s;
import Z2.t;
import Z2.u;
import Z2.v;
import Z2.y;
import Z2.z;
import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements X2.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c[] f7781x = new c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f7782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f7783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f7785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f7786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f7788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f7789h;
    public E i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IInterface f7790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f7791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f7792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0025m0 f7794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0025m0 f7795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f7797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile String f7798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W2.a f7799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile u f7801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicInteger f7802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f7803w;

    public a(Context context, Looper looper, int i, C0031p0 c0031p0, X2.c cVar, d dVar) {
        synchronized (y.f6072g) {
            try {
                if (y.f6073h == null) {
                    y.f6073h = new y(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y yVar = y.f6073h;
        Object obj = W2.d.f5578b;
        n.b(cVar);
        n.b(dVar);
        C0025m0 c0025m0 = new C0025m0(16, cVar);
        C0025m0 c0025m1 = new C0025m0(17, dVar);
        String str = (String) c0031p0.f394j;
        this.f7782a = null;
        this.f7787f = new Object();
        this.f7788g = new Object();
        this.f7791k = new ArrayList();
        this.f7793m = 1;
        this.f7799s = null;
        this.f7800t = false;
        this.f7801u = null;
        this.f7802v = new AtomicInteger(0);
        n.c("Context must not be null", context);
        this.f7784c = context;
        n.c("Looper must not be null", looper);
        n.c("Supervisor must not be null", yVar);
        this.f7785d = yVar;
        this.f7786e = new p(this, looper);
        this.f7796p = i;
        this.f7794n = c0025m0;
        this.f7795o = c0025m1;
        this.f7797q = str;
        Set set = (Set) c0031p0.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f7803w = set;
    }

    @Override // X2.a
    public final Set a() {
        return j() ? this.f7803w : Collections.EMPTY_SET;
    }

    @Override // X2.a
    public final void b(E e6) {
        this.i = e6;
        s(2, null);
    }

    @Override // X2.a
    public final void c(String str) {
        this.f7782a = str;
        disconnect();
    }

    @Override // X2.a
    public final void d(C0025m0 c0025m0) {
        ((h) c0025m0.i).f5901k.f5886m.post(new o(4, c0025m0));
    }

    @Override // X2.a
    public final void disconnect() {
        this.f7802v.incrementAndGet();
        ArrayList arrayList = this.f7791k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    l lVar = (l) arrayList.get(i);
                    synchronized (lVar) {
                        lVar.f6039a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f7788g) {
            this.f7789h = null;
        }
        s(1, null);
    }

    @Override // X2.a
    public final c[] f() {
        u uVar = this.f7801u;
        if (uVar == null) {
            return null;
        }
        return uVar.i;
    }

    @Override // X2.a
    public final void g() {
        if (!isConnected() || this.f7783b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // X2.a
    public final String h() {
        return this.f7782a;
    }

    @Override // X2.a
    public final void i(Z2.d dVar, Set set) {
        Bundle bundleN = n();
        String str = Build.VERSION.SDK_INT < 31 ? this.f7798r : this.f7798r;
        int i = this.f7796p;
        int i3 = e.f5580a;
        Scope[] scopeArr = Z2.c.f6004v;
        Bundle bundle = new Bundle();
        c[] cVarArr = Z2.c.f6005w;
        Z2.c cVar = new Z2.c(6, i, i3, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        cVar.f6008k = this.f7784c.getPackageName();
        cVar.f6011n = bundleN;
        if (set != null) {
            cVar.f6010m = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            cVar.f6012o = new Account("<<default account>>", "com.google");
            if (dVar != null) {
                cVar.f6009l = ((z) dVar).f6080a;
            }
        }
        cVar.f6013p = f7781x;
        cVar.f6014q = m();
        try {
            try {
                synchronized (this.f7788g) {
                    try {
                        m mVar = this.f7789h;
                        if (mVar != null) {
                            mVar.a(new q(this, this.f7802v.get()), cVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (DeadObjectException unused) {
                int i6 = this.f7802v.get();
                p pVar = this.f7786e;
                pVar.sendMessage(pVar.obtainMessage(6, i6, 3));
            } catch (SecurityException e6) {
                throw e6;
            }
        } catch (RemoteException | RuntimeException unused2) {
            int i7 = this.f7802v.get();
            s sVar = new s(this, 8, null, null);
            p pVar2 = this.f7786e;
            pVar2.sendMessage(pVar2.obtainMessage(1, i7, -1, sVar));
        }
    }

    @Override // X2.a
    public final boolean isConnected() {
        boolean z5;
        synchronized (this.f7787f) {
            z5 = this.f7793m == 4;
        }
        return z5;
    }

    @Override // X2.a
    public final boolean isConnecting() {
        boolean z5;
        synchronized (this.f7787f) {
            int i = this.f7793m;
            z5 = true;
            if (i != 2 && i != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // X2.a
    public boolean j() {
        return false;
    }

    public abstract IInterface l(IBinder iBinder);

    public abstract c[] m();

    public abstract Bundle n();

    public abstract String o();

    public abstract String p();

    public abstract boolean q();

    public final /* synthetic */ boolean r(int i, int i3, IInterface iInterface) {
        synchronized (this.f7787f) {
            try {
                if (this.f7793m != i) {
                    return false;
                }
                s(i3, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(int i, IInterface iInterface) {
        B b6;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f7787f) {
            try {
                this.f7793m = i;
                this.f7790j = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    r rVar = this.f7792l;
                    if (rVar != null) {
                        y yVar = this.f7785d;
                        String str = (String) this.f7783b.f4439b;
                        n.b(str);
                        this.f7783b.getClass();
                        if (this.f7797q == null) {
                            this.f7784c.getClass();
                        }
                        yVar.b(str, rVar, this.f7783b.f4438a);
                        this.f7792l = null;
                    }
                } else if (i == 2 || i == 3) {
                    r rVar2 = this.f7792l;
                    if (rVar2 != null && (b6 = this.f7783b) != null) {
                        new StringBuilder(String.valueOf((String) b6.f4439b).length() + 70 + "com.google.android.gms".length());
                        y yVar2 = this.f7785d;
                        String str2 = (String) this.f7783b.f4439b;
                        n.b(str2);
                        this.f7783b.getClass();
                        if (this.f7797q == null) {
                            this.f7784c.getClass();
                        }
                        yVar2.b(str2, rVar2, this.f7783b.f4438a);
                        this.f7802v.incrementAndGet();
                    }
                    r rVar3 = new r(this, this.f7802v.get());
                    this.f7792l = rVar3;
                    String strP = p();
                    boolean zQ = q();
                    this.f7783b = new B(strP, zQ);
                    if (zQ && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f7783b.f4439b)));
                    }
                    y yVar3 = this.f7785d;
                    String str3 = (String) this.f7783b.f4439b;
                    n.b(str3);
                    this.f7783b.getClass();
                    String name = this.f7797q;
                    if (name == null) {
                        name = this.f7784c.getClass().getName();
                    }
                    W2.a aVarA = yVar3.a(new v(str3, this.f7783b.f4438a), rVar3, name);
                    if (!(aVarA.i == 0)) {
                        new StringBuilder(String.valueOf((String) this.f7783b.f4439b).length() + 34 + "com.google.android.gms".length());
                        int i3 = aVarA.i;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (aVarA.f5570j != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", aVarA.f5570j);
                        }
                        int i6 = this.f7802v.get();
                        t tVar = new t(this, i3, bundle);
                        p pVar = this.f7786e;
                        pVar.sendMessage(pVar.obtainMessage(7, i6, -1, tVar));
                    }
                } else if (i == 4) {
                    n.b(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
