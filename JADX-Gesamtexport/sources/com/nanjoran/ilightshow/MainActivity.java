package com.nanjoran.ilightshow;

import A3.c;
import B.AbstractC0013g0;
import E4.k;
import E4.x;
import H3.d;
import I1.g;
import K4.e;
import M4.l;
import N.C0208d;
import O1.C0309b;
import O1.C0310c;
import P3.b;
import P4.AbstractC0336x;
import P4.D;
import S1.V;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.J;
import c5.C0479c;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.AppPreset;
import com.nanjoran.ilightshow.Services.B0;
import com.nanjoran.ilightshow.Services.C0;
import com.nanjoran.ilightshow.Services.C0680l;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.D0;
import com.nanjoran.ilightshow.Services.E0;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.P0;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.nanjoran.ilightshow.Services.S;
import com.nanjoran.ilightshow.Services.SharedAppPresetDocumentV1;
import com.nanjoran.ilightshow.Services.SharedAppPresetRecordV1;
import com.nanjoran.ilightshow.Services.r0;
import com.nanjoran.ilightshow.Services.z0;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import defpackage.f;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import p012c.F;
import p012c.G;
import p012c.n;
import p012c.o;
import p012c.q;
import p012c.s;
import p084p4.h;
import p089q4.m;
import p089q4.z;
import p120w2.a;
import p126x2.r;
import p126x2.u;
import p130y0.C1122b0;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f8229C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f8230B = new c();

    static {
        x.a(MainActivity.class).b();
    }

    public final void l(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null || !k.a(data.getScheme(), "lightshow") || !k.a(data.getHost(), "login")) {
            return;
        }
        String queryParameter = data.getQueryParameter(AccountsQueryParameters.CODE);
        String queryParameter2 = data.getQueryParameter(AccountsQueryParameters.ERROR);
        if (queryParameter != null) {
            C0 c6 = C0.i;
            if (((String) c6.f8242e.getValue()) == null) {
                a aVar = a.f13456b;
                List listM = m.M(new h("grant_type", "authorization_code"), new h(AccountsQueryParameters.CODE, queryParameter), new h("redirect_uri", C0.f8236l));
                String str = C0.f8234j;
                aVar.getClass();
                k.f("path", str);
                r rVar = aVar.f13457a;
                rVar.getClass();
                rVar.b(u.POST, str, listM).r(new AuthRequest.Deserializer(), new B0(0, c6));
            }
        } else if (queryParameter2 != null) {
            C0 c7 = C0.i;
            c7.getClass();
            new Handler(Looper.getMainLooper()).post(new g(c7, 8, queryParameter2));
        } else {
            data.toString();
        }
        if (getIntent() != intent) {
            Intent intent2 = getIntent();
            if (!k.a(intent2 != null ? intent2.getData() : null, intent.getData())) {
                return;
            }
        }
        setIntent(new Intent(intent).setData(null));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x044c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0446  */
    /* JADX WARN: Code duplicated, block: B:71:0x0466  */
    @Override // p012c.n, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        C0310c xVar;
        List listE;
        SharedPreferences sharedPreferences;
        String string;
        super.onCreate(bundle);
        e[] eVarArr = defpackage.u.f12604a;
        defpackage.u.f12606c = new WeakReference(getApplicationContext());
        WeakReference weakReference = f.f8806a;
        String str = new String(AbstractC0698y.e(b.f4601a), M4.a.f3520a);
        f.f8806a = new WeakReference(getApplicationContext());
        if (f.f8810e == null) {
            f.f8809d = "https://insights.nanjoran.com/api/events";
            f.f8813h = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhcHBfaWQiOiJjb20ubmFuam9yYW4uTGlnaHRTaG93aU9TIn0.hbV8_fprV_mVdlCGQWcMUlq7B_8J8Jjm8We9fkKqAQ4";
            f.i = str;
            f.f8808c.put("env", "Release");
            String string2 = Settings.Secure.getString(getContentResolver(), "android_id");
            k.e("getString(...)", string2);
            f.f8812g = string2;
            f.f8810e = AbstractC0336x.o(AbstractC0336x.a(D.f4606c), null, new defpackage.e(60000L, null), 3);
            f.c("app-launch", null, null, 30);
        }
        r0 r0Var = r0.f8470a;
        WeakReference weakReference2 = new WeakReference(this);
        r0Var.getClass();
        r0.f8476g = weakReference2;
        P0.f8357e.f8360c = getApplicationContext();
        File file = AbstractC0665d0.f8380a;
        Context applicationContext = getApplicationContext();
        k.e("getApplicationContext(...)", applicationContext);
        File file2 = new File(applicationContext.getFilesDir(), "palettes.json");
        AbstractC0665d0.f8380a = file2;
        if (!file2.exists()) {
            File file3 = AbstractC0665d0.f8380a;
            if (file3 == null) {
                k.m("storageFile");
                throw null;
            }
            file3.createNewFile();
        }
        m.M(180, 38, 201, 119, 169, 122, 89, 203, 133, 104, 171, 70, 28, 19, 238, 136, 67, 29, 33, 30, 127, 0, 48, 37, 94, 143, 205, 36, 6, 149, 115, 46, 24, 43, 245, 58, 162, 253, 63, 179, 195, 128, 245, 29, 195, 131, 48, 16, 220, 62, 147, 206, 43, 34, 39, 67, 87, 160, 102, 41, 81, 213, 30, 125);
        E0 e6 = E0.f8249o;
        Context applicationContext2 = getApplicationContext();
        k.e("getApplicationContext(...)", applicationContext2);
        e6.getClass();
        C0309b c0309b = new C0309b(applicationContext2);
        c0309b.f4457c = e6.f8255n;
        c0309b.f4455a = new W2.g(9);
        c0309b.f4458d = true;
        if (c0309b.f4457c == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (c0309b.f4455a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        c0309b.f4455a.getClass();
        if (c0309b.f4457c != null) {
            W2.g gVar = c0309b.f4455a;
            D0 d1 = c0309b.f4457c;
            xVar = c0309b.a() ? new O1.x(gVar, applicationContext2, d1, c0309b) : new C0310c(gVar, applicationContext2, d1, c0309b);
        } else {
            W2.g gVar2 = c0309b.f4455a;
            xVar = c0309b.a() ? new O1.x(gVar2, applicationContext2, c0309b) : new C0310c(gVar2, applicationContext2, c0309b);
        }
        e6.f8251j = xVar;
        xVar.d(e6);
        if (e6.i == null) {
            Timer timer = new Timer();
            e6.i = timer;
            timer.schedule(new H3.c(2, e6), 1L, 5000L);
        }
        e6.f();
        C0 c6 = C0.i;
        c6.f8238a = this;
        c6.b();
        PackageManager packageManager = getPackageManager();
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(getPackageName(), 0) : null;
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        int i = Build.VERSION.SDK_INT;
        Long lValueOf = packageInfo != null ? Long.valueOf(packageInfo.getLongVersionCode()) : null;
        String str3 = Build.MODEL;
        String str4 = Build.MANUFACTURER;
        try {
            Class.forName("android.net.http.HttpResponseCache").getMethod("install", File.class, Long.TYPE).invoke(null, new File(getCacheDir(), "http"), 83886080L);
        } catch (Exception unused) {
            P0 p6 = P0.f8357e;
        }
        p126x2.m mVar = r.f14095p;
        mVar.getClass();
        r rVar = (r) r.f14094o.n(p126x2.m.f14087a[0], mVar);
        StringBuilder sb = new StringBuilder("iLightShow ; Android ; ");
        sb.append(str2);
        sb.append(" ; ");
        sb.append(lValueOf);
        sb.append(" ; ");
        AbstractC0013g0.s(sb, i, " ; ", str4, " ; ");
        sb.append(str3);
        rVar.f14101f = z.T(new h("User-Agent", sb.toString()));
        S s6 = S.f8362c;
        Context applicationContext3 = getApplicationContext();
        Object systemService = applicationContext3 != null ? applicationContext3.getSystemService("wifi") : null;
        k.d("null cannot be cast to non-null type android.net.wifi.WifiManager", systemService);
        s6.f8363a = ((WifiManager) systemService).createMulticastLock("multicastLock");
        new L3.c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f8230B, intentFilter);
        z0 z0Var = z0.f8505f;
        z0Var.f8511e = this;
        I3.c.f1859f.a(z0Var);
        C0680l.f8421a.getClass();
        e[] eVarArr2 = C0680l.f8422b;
        String str5 = (String) C0680l.f8425e.a(eVarArr2[1]);
        String str6 = (String) C0680l.f8424d.a(eVarArr2[0]);
        d5.n nVar = C0680l.f8423c;
        k.f("documentString", str5);
        k.f("legacyString", str6);
        k.f("json", nVar);
        if (!l.i0(str5)) {
            try {
                SharedAppPresetDocumentV1 sharedAppPresetDocumentV1 = (SharedAppPresetDocumentV1) nVar.a(SharedAppPresetDocumentV1.Companion.serializer(), str5);
                if (k.a(sharedAppPresetDocumentV1.getSchema(), "app.ilightshow.app-presets") && sharedAppPresetDocumentV1.getSchemaVersion() == 1) {
                    List<SharedAppPresetRecordV1> presets = sharedAppPresetDocumentV1.getPresets();
                    ArrayList arrayList = new ArrayList(p089q4.n.P(presets, 10));
                    Iterator<T> it = presets.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SharedAppPresetRecordV1) it.next()).toAppPreset());
                    }
                    listE = C0691q.e(arrayList);
                } else if (l.i0(str6)) {
                    listE = p089q4.u.f11237h;
                } else {
                    try {
                        listE = C0691q.e((List) nVar.a(new C0479c(AppPreset.Companion.serializer(), 0), str6));
                    } catch (Throwable th) {
                        V.v(th);
                        listE = p089q4.u.f11237h;
                    }
                }
            } catch (Throwable th2) {
                V.v(th2);
            }
        } else if (l.i0(str6)) {
            listE = C0691q.e((List) nVar.a(new C0479c(AppPreset.Companion.serializer(), 0), str6));
        } else {
            listE = p089q4.u.f11237h;
        }
        C0680l.f8426f = C0208d.U(listE);
        C0680l.b();
        Objects.toString(C0680l.f8426f);
        H3.f fVar = H3.f.f1787d;
        Context applicationContext4 = getApplicationContext();
        fVar.f1788a = applicationContext4;
        if (applicationContext4 != null && (sharedPreferences = applicationContext4.getSharedPreferences("prefFile", 0)) != null && (string = sharedPreferences.getString("savedMusicService", null)) != null) {
            fVar.d(MusicServiceType.valueOf(string));
        }
        M m6 = M.f8305O;
        Context applicationContext5 = getApplicationContext();
        k.e("getApplicationContext(...)", applicationContext5);
        if (m6.q(applicationContext5)) {
            d dVarA = fVar.a();
            if (dVarA != null) {
                dVarA.f1779a = getApplicationContext();
            }
            m6.M(true);
            J3.e eVar = m6.f8317c;
            k.c(eVar);
            eVar.d(true);
        }
        l(getIntent());
        C0691q.f8464h = new WeakReference(this);
        NotificationChannel notificationChannel = new NotificationChannel("ilightshow_ch1", "iLightShow", 3);
        Object systemService2 = getSystemService("notification");
        k.d("null cannot be cast to non-null type android.app.NotificationManager", systemService2);
        ((NotificationManager) systemService2).createNotificationChannel(notificationChannel);
        int i3 = o.f7174a;
        F f6 = F.i;
        G g6 = new G(0, 0, f6);
        G g7 = new G(o.f7174a, o.f7175b, f6);
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        Resources resources = decorView.getResources();
        k.e("view.resources", resources);
        boolean zBooleanValue = ((Boolean) f6.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        k.e("view.resources", resources2);
        boolean zBooleanValue2 = ((Boolean) f6.invoke(resources2)).booleanValue();
        q sVar = Build.VERSION.SDK_INT >= 30 ? new s() : new p012c.r();
        Window window = getWindow();
        k.e("window", window);
        sVar.a(g6, g7, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        k.e("window", window2);
        sVar.b(window2);
        V.a aVar = A3.b.f25a;
        ViewGroup.LayoutParams layoutParams = p018d.d.f8554a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        C1122b0 c1122b0 = childAt instanceof C1122b0 ? (C1122b0) childAt : null;
        if (c1122b0 != null) {
            c1122b0.setParentCompositionContext(null);
            c1122b0.setContent(aVar);
            return;
        }
        C1122b0 c1122b1 = new C1122b0(this);
        c1122b1.setParentCompositionContext(null);
        c1122b1.setContent(aVar);
        View decorView2 = getWindow().getDecorView();
        if (J.f(decorView2) == null) {
            J.i(decorView2, this);
        }
        if (J.g(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (p020d2.n.r(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c1122b1, p018d.d.f8554a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f8230B);
        finishAffinity();
        finishAndRemoveTask();
        if (!M.f8305O.i()) {
            C0.i.getClass();
            SpotifyAppRemote.disconnect(null);
        }
        finishAffinity();
        finishAndRemoveTask();
    }

    @Override // p012c.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        k.f("intent", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        l(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        M.f8305O.f8329p = getApplicationContext();
        l(getIntent());
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
