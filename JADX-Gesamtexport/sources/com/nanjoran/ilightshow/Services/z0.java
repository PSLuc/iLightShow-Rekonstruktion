package com.nanjoran.ilightshow.Services;

import B.C0031p0;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends Observable implements I3.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z0 f8505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MediaType f8506g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f8507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f8508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F3.a f8509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f8511e;

    static {
        z0 z0Var = new z0();
        z0Var.f8507a = new OkHttpClient();
        z0Var.f8508b = new ArrayList();
        f8505f = z0Var;
        f8506g = MediaType.Companion.parse("application/json; charset=utf-8");
    }

    @Override // I3.d
    public final void ssdpDidDiscover(I3.e eVar) {
        boolean zA = false;
        C0031p0 c0031p0 = null;
        for (Map.Entry entry : eVar.f1866b.entrySet()) {
            if (E4.k.a(entry.getKey(), "ST")) {
                zA = E4.k.a(entry.getValue(), "urn:schemas-upnp-org:device:ZonePlayer:1");
                c0031p0 = new C0031p0(3, false);
                c0031p0.i = eVar.f1865a;
            }
        }
        if (!zA || c0031p0 == null) {
            return;
        }
        Activity activity = this.f8511e;
        E4.k.c(activity);
        activity.runOnUiThread(new I1.g(this, 7, c0031p0));
    }
}
