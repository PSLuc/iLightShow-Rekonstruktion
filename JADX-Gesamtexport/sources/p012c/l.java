package p012c;

import B.C0025m0;
import E4.k;
import S1.h0;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC0457q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import p020d2.n;
import p029f.a;
import p029f.d;
import p029f.e;
import p029f.f;
import p029f.i;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7146a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7147b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7148c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7149d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f7150e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f7151f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f7152g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f7153h;

    public l(n nVar) {
        this.f7153h = nVar;
    }

    public final boolean a(int i, int i3, Intent intent) {
        String str = (String) this.f7146a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f7150e.get(str);
        if ((dVar != null ? dVar.f8819a : null) != null) {
            ArrayList arrayList = this.f7149d;
            if (arrayList.contains(str)) {
                dVar.f8819a.a(dVar.f8820b.F(i3, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f7151f.remove(str);
        this.f7152g.putParcelable(str, new a(i3, intent));
        return true;
    }

    public final void b(int i, n nVar, Object obj) {
        Bundle bundleExtra;
        int i3;
        n nVar2 = this.f7153h;
        C0025m0 c0025m0Z = nVar.z(nVar2, obj);
        if (c0025m0Z != null) {
            new Handler(Looper.getMainLooper()).post(new I1.a(i, 2, this, c0025m0Z));
            return;
        }
        Intent intentM = nVar.m(nVar2, obj);
        if (intentM.getExtras() != null) {
            Bundle extras = intentM.getExtras();
            k.c(extras);
            if (extras.getClassLoader() == null) {
                intentM.setExtrasClassLoader(nVar2.getClassLoader());
            }
        }
        if (intentM.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentM.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentM.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentM.getAction())) {
            String[] stringArrayExtra = intentM.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                if (TextUtils.isEmpty(stringArrayExtra[i6])) {
                    throw new IllegalArgumentException(k.u(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i6], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i6));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i7 = 0;
                for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                    if (!hashSet.contains(Integer.valueOf(i8))) {
                        strArr[i7] = stringArrayExtra[i8];
                        i7++;
                    }
                }
            }
            Y0.a.b(nVar2, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentM.getAction())) {
            nVar2.startActivityForResult(intentM, i, bundle);
            return;
        }
        i iVar = (i) intentM.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            k.c(iVar);
            i3 = i;
            try {
                nVar2.startIntentSenderForResult(iVar.f8828h, i3, iVar.i, iVar.f8829j, iVar.f8830k, 0, bundle);
            } catch (IntentSender.SendIntentException e6) {
                e = e6;
                new Handler(Looper.getMainLooper()).post(new I1.a(i3, 3, this, e));
            }
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            i3 = i;
        }
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.f7147b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new L4.a(new L4.i(f.f8823h, new L4.n(1)))) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f7146a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void d(String str) {
        Integer num;
        k.f("key", str);
        if (!this.f7149d.contains(str) && (num = (Integer) this.f7147b.remove(str)) != null) {
            this.f7146a.remove(num);
        }
        this.f7150e.remove(str);
        LinkedHashMap linkedHashMap = this.f7151f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f7152g;
        if (bundle.containsKey(str)) {
            Objects.toString((a) h0.q(str, bundle));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f7148c;
        e eVar = (e) linkedHashMap2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.f8822b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                eVar.f8821a.f((InterfaceC0457q) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
