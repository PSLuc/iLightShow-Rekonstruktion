package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.R;
import com.nanjoran.outpost.outpost.Client;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class LightShowService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8300l = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M f8301h;
    public PowerManager.WakeLock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U4.d f8302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P4.i0 f8303k;

    public LightShowService() {
        W4.d dVar = P4.D.f4604a;
        P4.j0 j0VarB = AbstractC0336x.b();
        dVar.getClass();
        this.f8302j = AbstractC0336x.a(S1.h0.u(dVar, j0VarB));
    }

    public final Notification a() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setAction("com.nanjoran.lightshowservice.action.main");
        intent.setFlags(268468224);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        Y0.h hVar = new Y0.h(this, "ilightshow_foreground_service");
        hVar.f5800e = Y0.h.b(getString(R.string.foreground_notification_title));
        hVar.f5801f = Y0.h.b(getString(R.string.foreground_notification_text));
        String string = getString(R.string.foreground_notification_ticker);
        hVar.f5809o.tickerText = Y0.h.b(string);
        Notification notification = hVar.f5809o;
        notification.sound = null;
        notification.audioStreamType = -1;
        notification.audioAttributes = Y0.g.a(Y0.g.e(Y0.g.c(Y0.g.b(), 4), 5));
        hVar.f5809o.icon = 2131165311;
        hVar.f5802g = activity;
        hVar.c(2);
        Notification notificationA = hVar.a();
        E4.k.e("build(...)", notificationA);
        return notificationA;
    }

    public final void b() {
        PowerManager.WakeLock wakeLock;
        try {
            PowerManager.WakeLock wakeLock2 = this.i;
            if (wakeLock2 == null || !wakeLock2.isHeld() || (wakeLock = this.i) == null) {
                return;
            }
            wakeLock.release();
        } catch (Exception unused) {
        }
    }

    public final boolean c(Notification notification) {
        int i;
        try {
            Y0.q.a(new Y0.r(this).f5811a);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 34) {
                i = 0;
            } else {
                i = (M.f8305O.f8325l.b() && com.fasterxml.jackson.databind.deser.std.d0.j(this, "android.permission.RECORD_AUDIO") == 0) ? 1073741952 : 1073741824;
            }
            if (i3 < 34) {
                startForeground(101, notification);
                return true;
            }
            if (i3 >= 34) {
                Y0.u.a(this, 101, notification, i);
                return true;
            }
            Y0.t.a(this, 101, notification, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void d() {
        PowerManager.WakeLock wakeLock;
        if (!M.f8305O.r()) {
            b();
            return;
        }
        try {
            PowerManager.WakeLock wakeLock2 = this.i;
            if ((wakeLock2 == null || !wakeLock2.isHeld()) && (wakeLock = this.i) != null) {
                wakeLock.acquire();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        E4.k.f("intent", intent);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        K4.e[] eVarArr = defpackage.u.f12604a;
        defpackage.u.f12606c = new WeakReference(getApplicationContext());
        String string = getString(R.string.foreground_notification_channel_name);
        E4.k.e("getString(...)", string);
        String string2 = getString(R.string.foreground_notification_channel_description);
        E4.k.e("getString(...)", string2);
        NotificationChannel notificationChannel = new NotificationChannel("ilightshow_foreground_service", string, 3);
        notificationChannel.setDescription(string2);
        notificationChannel.setSound(null, null);
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        c(a());
        Object systemService = getSystemService("power");
        E4.k.d("null cannot be cast to non-null type android.os.PowerManager", systemService);
        this.i = ((PowerManager) systemService).newWakeLock(1, LightShowService.class.getCanonicalName());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        P4.i0 i0Var = this.f8303k;
        if (i0Var != null) {
            i0Var.c(null);
        }
        this.f8303k = null;
        b();
        AbstractC0336x.c(this.f8302j, null);
        C0.i.getClass();
        C0674i.f8406n = false;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i3) {
        if (E4.k.a(intent != null ? intent.getAction() : null, "com.nanjoran.lightshowservice.action.startforeground")) {
            if (!c(a())) {
                b();
                stopSelf(i3);
                return 2;
            }
            M m6 = M.f8305O;
            Context applicationContext = getApplicationContext();
            E4.k.e("getApplicationContext(...)", applicationContext);
            m6.q(applicationContext);
            this.f8301h = m6;
            H3.f.f1787d.a();
            C0 c6 = C0.i;
            P4.i0 i0Var = this.f8303k;
            if (i0Var == null || !i0Var.b()) {
                this.f8303k = AbstractC0336x.o(this.f8302j, null, new N(this, null), 3);
                return 2;
            }
            d();
            return 2;
        }
        if (E4.k.a(intent != null ? intent.getAction() : null, "com.nanjoran.lightshowservice.action.stop")) {
            M m7 = this.f8301h;
            E4.k.c(m7);
            m7.M(false);
            sendBroadcast(new Intent("com.nanjoran.lightshowservice.intent.quit"));
            b();
            Y0.s.a(this, 1);
            stopSelf();
            return 2;
        }
        if (E4.k.a(intent != null ? intent.getAction() : null, "com.nanjoran.lightshowservice.action.stopforeground")) {
            b();
            Y0.s.a(this, 1);
            stopSelf();
            return 2;
        }
        b();
        Y0.s.a(this, 1);
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        E4.k.f("rootIntent", intent);
        super.onTaskRemoved(intent);
        b();
        Y0.s.a(this, 1);
        C0674i c0674i = C0674i.f8401h;
        Context applicationContext = getApplicationContext();
        E4.k.e("getApplicationContext(...)", applicationContext);
        Context applicationContext2 = applicationContext.getApplicationContext();
        C0674i.f8402j = applicationContext2;
        if (applicationContext2 == null) {
            return;
        }
        C0674i.a();
        C0674i.f8407o = null;
        C0674i.f8411s = false;
        synchronized (C0674i.f8409q) {
            C0674i.f8410r = 0;
        }
        Intent intent2 = new Intent(applicationContext2, (Class<?>) LightShowService.class);
        intent2.setAction("com.nanjoran.lightshowservice.action.stopforeground");
        applicationContext2.stopService(intent2);
        C0674i.f8406n = false;
        M.f8305O.K();
        Client clientC = U.c();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        U.f8366a.execute(new I1.g(clientC, 6, countDownLatch));
        try {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
