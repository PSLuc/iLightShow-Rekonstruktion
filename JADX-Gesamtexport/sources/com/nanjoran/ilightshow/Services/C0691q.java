package com.nanjoran.ilightshow.Services;

import N3.C0303z0;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.outpost.outpost.Listener;
import com.nanjoran.outpost.outpost.Outpost;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691q implements Listener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static WeakReference f8464h;
    public static final C0691q i = new C0691q();

    public static String a(String str) {
        String lowerCase = M4.l.B0(str).toString().toLowerCase(Locale.ROOT);
        E4.k.e("toLowerCase(...)", lowerCase);
        return lowerCase;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static F0 b(String str) {
        E4.k.f("productId", str);
        switch (str.hashCode()) {
            case -1966301982:
                if (str.equals("starter_to_pro_2020")) {
                    return F0.OLD_PRO;
                }
                break;
            case -1010426034:
                if (str.equals("pro_2020")) {
                    return F0.OLD_PRO;
                }
                break;
            case 44922902:
                if (str.equals("advanced_pack")) {
                    return F0.MEMBERSHIP_V3;
                }
                break;
            case 999349193:
                if (str.equals("starter_pack")) {
                    return F0.STARTER_PACK;
                }
                break;
        }
        return F0.NONE;
    }

    public static F0 c() {
        Object next;
        p128x4.b bVar = F0.f8261o;
        bVar.getClass();
        E4.b bVar2 = new E4.b(7, bVar);
        if (bVar2.hasNext()) {
            next = bVar2.next();
            if (bVar2.hasNext()) {
                int i3 = ((F0) next).f8262h;
                do {
                    Object next2 = bVar2.next();
                    int i6 = ((F0) next2).f8262h;
                    if (i3 < i6) {
                        next = next2;
                        i3 = i6;
                    }
                } while (bVar2.hasNext());
            }
        } else {
            next = null;
        }
        F0 f6 = (F0) next;
        return f6 == null ? F0.NONE : f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [q4.u] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static List d(String str, List list) {
        ?? arrayList;
        UMPreset uMPresetCopy$default;
        E4.k.f("presets", list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(p089q4.n.P(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AppPreset appPreset = (AppPreset) it.next();
            String string = M4.l.B0(appPreset.getName()).toString();
            if (string.length() == 0) {
                string = "Preset";
            }
            int i3 = 2;
            String str2 = string;
            while (linkedHashSet.contains(a(str2))) {
                str2 = string + " (" + i3 + ")";
                i3++;
            }
            linkedHashSet.add(a(str2));
            String localId = appPreset.getLocalId();
            if (localId == null) {
                localId = UUID.randomUUID().toString();
                E4.k.e("toString(...)", localId);
            }
            String str3 = localId;
            String createdAt = appPreset.getCreatedAt();
            String str4 = createdAt == null ? str : createdAt;
            String updatedAt = appPreset.getUpdatedAt();
            String str5 = updatedAt == null ? str : updatedAt;
            String strA = a(str2);
            UMPreset effectsPreset = appPreset.getEffectsPreset();
            UMPreset uMPresetNormalizeEngineAndFxSize = (effectsPreset == null || (uMPresetCopy$default = UMPreset.copy$default(effectsPreset, null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null)) == null) ? null : uMPresetCopy$default.normalizeEngineAndFxSize();
            List<String> selectedLightsIds = appPreset.getSelectedLightsIds();
            if (selectedLightsIds != null) {
                arrayList = new ArrayList();
                for (Object obj : selectedLightsIds) {
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = p089q4.u.f11237h;
            }
            arrayList2.add(appPreset.copy((15622 & 1) != 0 ? appPreset.localId : str3, (15622 & 2) != 0 ? appPreset.cloudId : null, (15622 & 4) != 0 ? appPreset.revision : null, (15622 & 8) != 0 ? appPreset.createdAt : str4, (15622 & 16) != 0 ? appPreset.updatedAt : str5, (15622 & 32) != 0 ? appPreset.sortKey : strA, (15622 & 64) != 0 ? appPreset.name : str2, (15622 & 128) != 0 ? appPreset.effectsPreset : uMPresetNormalizeEngineAndFxSize, (15622 & HueLog.LogComponent.STREAMDTLS) != 0 ? appPreset.musicService : null, (15622 & HueLog.LogComponent.APPCORE) != 0 ? appPreset.selectedLightsIds : arrayList, (15622 & 1024) != 0 ? appPreset.backgroundMode : false, (15622 & 2048) != 0 ? appPreset.micEnabled : false, (15622 & 4096) != 0 ? appPreset.manualDelay : 0.0d, (15622 & 8192) != 0 ? appPreset.autoCalibration : null));
        }
        return p089q4.l.n0(arrayList2, new C0303z0(new C0303z0(new C0689p(0), 1), 2));
    }

    public static List e(List list) {
        String string = Instant.now().toString();
        E4.k.e("toString(...)", string);
        return d(string, list);
    }

    public static void f(String str, String str2) {
        Context context;
        WeakReference weakReference = f8464h;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Y0.h hVar = new Y0.h(context, "ilightshow_ch1");
        hVar.f5809o.icon = 2131165311;
        hVar.f5800e = Y0.h.b(str);
        hVar.f5801f = Y0.h.b(str2);
        hVar.f5803h = 0;
        hVar.f5802g = activity;
        hVar.c(16);
        Object systemService = context.getSystemService("notification");
        E4.k.d("null cannot be cast to non-null type android.app.NotificationManager", systemService);
        ((NotificationManager) systemService).notify(1, hVar.a());
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onActiveStreamsChanged(long j4) {
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onDeviceIDAssigned(String str) {
        ExecutorService executorService = U.f8366a;
        U.f8371f = str;
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onError(String str) {
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onFingerprintUpdated(String str) {
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onReportedCountryCodeUpdated(String str) {
    }

    @Override // com.nanjoran.outpost.outpost.Listener
    public void onStateChanged(String str) {
        ExecutorService executorService = U.f8366a;
        if (str == null) {
            str = Outpost.StateFailed;
        }
        U.f8370e = str;
        ExecutorService executorService2 = U.f8366a;
    }
}
