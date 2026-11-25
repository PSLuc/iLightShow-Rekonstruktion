package p012c;

import E4.k;
import E4.z;
import J1.e;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0468f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f7139a;

    public /* synthetic */ C0468f(n nVar) {
        this.f7139a = nVar;
    }

    public final void a(n nVar) {
        n nVar2 = this.f7139a;
        k.f("this$0", nVar2);
        k.f("it", nVar);
        Bundle bundleB = ((e) nVar2.f7158k.f1107d).b("android:support:activity-result");
        if (bundleB != null) {
            l lVar = nVar2.f7163p;
            lVar.getClass();
            ArrayList<Integer> integerArrayList = bundleB.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleB.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleB.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                lVar.f7149d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleB.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = lVar.f7152g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = lVar.f7147b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = lVar.f7146a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        z.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                k.e("rcs[i]", num2);
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                k.e("keys[i]", str2);
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
