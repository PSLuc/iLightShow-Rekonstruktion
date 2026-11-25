package J2;

import K2.e;
import K2.f;
import K2.h;
import K2.i;
import K2.j;
import K2.l;
import K2.m;
import K2.o;
import K2.p;
import K2.r;
import K2.s;
import K2.t;
import K2.u;
import K2.v;
import K2.w;
import M2.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0715p f1915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f1916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f1918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U2.a f1919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U2.a f1920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1921g;

    public d(Context context, U2.a aVar, U2.a aVar2) {
        p094r3.d dVar = new p094r3.d();
        K2.c cVar = K2.c.f2065a;
        dVar.a(p.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f2078a;
        dVar.a(t.class, fVar);
        dVar.a(m.class, fVar);
        K2.d dVar2 = K2.d.f2067a;
        dVar.a(r.class, dVar2);
        dVar.a(j.class, dVar2);
        K2.b bVar = K2.b.f2053a;
        dVar.a(K2.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f2070a;
        dVar.a(s.class, eVar);
        dVar.a(l.class, eVar);
        K2.g gVar = K2.g.f2086a;
        dVar.a(w.class, gVar);
        dVar.a(o.class, gVar);
        dVar.f11770d = true;
        this.f1915a = new C0715p(21, dVar);
        this.f1917c = context;
        this.f1916b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1918d = b(a.f1906c);
        this.f1919e = aVar2;
        this.f1920f = aVar;
        this.f1921g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException("Invalid url: " + str, e6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    public final L2.h a(L2.h hVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f1916b.getActiveNetworkInfo();
        A0.b bVarC = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) bVarC.f13f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        bVarC.A("model", Build.MODEL);
        bVarC.A("hardware", Build.HARDWARE);
        bVarC.A(ClipAttribute.Sensor.Configuration.Device, Build.DEVICE);
        bVarC.A("product", Build.PRODUCT);
        bVarC.A("os-uild", Build.ID);
        bVarC.A("manufacturer", Build.MANUFACTURER);
        bVarC.A("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) bVarC.f13f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i3 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = v.f2126h;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) bVarC.f13f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = u.f2125h;
                subtype = 100;
            } else if (((u) u.f2125h.get(subtype)) == null) {
            }
            map = (HashMap) bVarC.f13f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            bVarC.A("country", Locale.getDefault().getCountry());
            bVarC.A("locale", Locale.getDefault().getLanguage());
            Context context = this.f1917c;
            bVarC.A("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
            }
            bVarC.A("application_build", Integer.toString(i3));
            return bVarC.D();
        }
        SparseArray sparseArray3 = u.f2125h;
        subtype = 0;
        map = (HashMap) bVarC.f13f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        bVarC.A("country", Locale.getDefault().getCountry());
        bVarC.A("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f1917c;
        bVarC.A("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        bVarC.A("application_build", Integer.toString(i3));
        return bVarC.D();
    }
}
