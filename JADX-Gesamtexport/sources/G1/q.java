package G1;

import F1.C0096m;
import F1.C0098o;
import F1.I;
import F1.U;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f1639h = new q(2);

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Bundle bundle;
        I i = (I) obj2;
        i.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : p089q4.z.X(i.f1290v.f1330a).entrySet()) {
            ((U) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        p089q4.j jVar = i.f1276g;
        if (!jVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[jVar.f11234j];
            Iterator<E> it = jVar.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                parcelableArr[i3] = new C0098o((C0096m) it.next());
                i3++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = i.f1281m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i6 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i6] = iIntValue;
                arrayList2.add(str);
                i6++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = i.f1282n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                p089q4.j jVar2 = (p089q4.j) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[jVar2.f11234j];
                int i7 = 0;
                for (Object obj3 : jVar2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        p089q4.m.O();
                        throw null;
                    }
                    parcelableArr2[i7] = (C0098o) obj3;
                    i7 = i8;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (i.f1275f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", i.f1275f);
        }
        return bundle;
    }
}
