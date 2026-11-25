package defpackage;

import E4.k;
import M4.l;
import M4.s;
import P4.i0;
import S1.V;
import S1.h0;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.nanjoran.ilightshow.Services.Analytics.AppContext;
import com.nanjoran.ilightshow.Services.Analytics.SimpleAnalyticsEvent;
import d5.n;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import p006b.a;
import p089q4.v;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f8806a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f8809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static i0 f8810e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final UUID f8814j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f8807b = V.f(new d(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f8808c = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8811f = "events.ndjson";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f8812g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f8813h = "";
    public static String i = "";

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        k.e("randomUUID(...)", uuidRandomUUID);
        f8814j = uuidRandomUUID;
    }

    public static p084p4.n a(String str) {
        Integer numX;
        Integer numX2;
        Integer numX3;
        int iIntValue = 0;
        List listS0 = l.s0(str, new String[]{"."}, false, 0);
        String str2 = (String) p089q4.l.a0(0, listS0);
        Integer numValueOf = Integer.valueOf((str2 == null || (numX3 = s.X(str2)) == null) ? 0 : numX3.intValue());
        String str3 = (String) p089q4.l.a0(1, listS0);
        Integer numValueOf2 = Integer.valueOf((str3 == null || (numX2 = s.X(str3)) == null) ? 0 : numX2.intValue());
        String str4 = (String) p089q4.l.a0(2, listS0);
        if (str4 != null && (numX = s.X(str4)) != null) {
            iIntValue = numX.intValue();
        }
        return new p084p4.n(numValueOf, numValueOf2, Integer.valueOf(iIntValue));
    }

    public static File b() {
        Context context;
        File filesDir;
        WeakReference weakReference = f8806a;
        if (weakReference == null || (context = (Context) weakReference.get()) == null || (filesDir = context.getFilesDir()) == null) {
            return null;
        }
        return new File(filesDir, f8811f);
    }

    public static void c(String str, String str2, Map map, int i3) {
        Context context;
        String str3 = (i3 & 2) != 0 ? null : str2;
        int i6 = i3 & 8;
        v vVar = v.f11238h;
        Map map2 = i6 != 0 ? vVar : map;
        WeakReference weakReference = f8806a;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            throw new IllegalStateException("Context is not initialized");
        }
        String str4 = Build.VERSION.RELEASE;
        k.e("RELEASE", str4);
        p084p4.n nVarA = a(str4);
        int iIntValue = ((Number) nVarA.f10856h).intValue();
        int iIntValue2 = ((Number) nVarA.i).intValue();
        int iIntValue3 = ((Number) nVarA.f10857j).intValue();
        String str5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        if (str5 == null) {
            str5 = "0.0.0";
        }
        String str6 = str5;
        p084p4.n nVarA2 = a(str6);
        int iIntValue4 = ((Number) nVarA2.f10856h).intValue();
        int iIntValue5 = ((Number) nVarA2.i).intValue();
        int iIntValue6 = ((Number) nVarA2.f10857j).intValue();
        String str7 = f8812g;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        k.e("getString(...)", string);
        String string2 = f8814j.toString();
        k.e("toString(...)", string2);
        String string3 = Locale.getDefault().toString();
        k.e("toString(...)", string3);
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "Unknown";
        }
        String str8 = country;
        String id = TimeZone.getDefault().getID();
        k.e("getID(...)", id);
        LinkedHashMap linkedHashMap = f8808c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        SimpleAnalyticsEvent simpleAnalyticsEvent = new SimpleAnalyticsEvent(new AppContext(str7, string, string2, "Android", str4, iIntValue, iIntValue2, iIntValue3, string3, str6, iIntValue4, iIntValue5, iIntValue6, "29859116", str8, id, p089q4.l.x0(arrayList)), System.currentTimeMillis() / ((long) 1000), str, null, str3, map2, vVar);
        File fileB = b();
        if (fileB == null) {
            return;
        }
        n nVar = f8807b;
        nVar.getClass();
        String strConcat = nVar.b(SimpleAnalyticsEvent.Companion.serializer(), simpleAnalyticsEvent).concat("\n");
        if (!fileB.exists()) {
            a.G(fileB, strConcat);
            return;
        }
        Charset charset = M4.a.f3520a;
        k.f("text", strConcat);
        k.f("charset", charset);
        FileOutputStream fileOutputStream = new FileOutputStream(fileB, true);
        try {
            a.H(fileOutputStream, strConcat, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
