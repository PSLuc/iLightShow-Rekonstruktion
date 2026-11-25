package com.nanjoran.ilightshow;

import K4.e;
import android.app.Application;
import androidx.lifecycle.B;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import com.nanjoran.ilightshow.Services.C0674i;
import defpackage.u;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ILightShowApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        e[] eVarArr = u.f12604a;
        u.f12606c = new WeakReference(getApplicationContext());
        C0674i c0674i = C0674i.f8401h;
        C0674i.f8402j = getApplicationContext();
        if (C0674i.f8403k) {
            return;
        }
        C0674i.f8403k = true;
        C0460u c0460u = B.f6939o.f6944m;
        boolean z5 = c0460u.f7001c.compareTo(EnumC0454n.f6993k) >= 0;
        C0674i.f8404l = z5;
        C0674i.f8405m = z5;
        c0460u.a(c0674i);
        if (C0674i.f8405m) {
            C0674i.d();
        }
    }
}
