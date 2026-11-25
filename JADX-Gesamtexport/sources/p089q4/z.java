package p089q4;

import E4.k;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p084p4.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends AbstractC0599v0 {
    public static Object R(Object obj, Map map) {
        k.f("<this>", map);
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int S(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map T(h hVar) {
        k.f("pair", hVar);
        Map mapSingletonMap = Collections.singletonMap(hVar.f10849h, hVar.i);
        k.e("singletonMap(...)", mapSingletonMap);
        return mapSingletonMap;
    }

    public static Map U(h... hVarArr) {
        if (hVarArr.length <= 0) {
            return v.f11238h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(hVarArr.length));
        V(linkedHashMap, hVarArr);
        return linkedHashMap;
    }

    public static final void V(HashMap map, h[] hVarArr) {
        for (h hVar : hVarArr) {
            map.put(hVar.f10849h, hVar.i);
        }
    }

    public static Map W(ArrayList arrayList) {
        v vVar = v.f11238h;
        int size = arrayList.size();
        if (size == 0) {
            return vVar;
        }
        if (size == 1) {
            return T((h) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            h hVar = (h) obj;
            linkedHashMap.put(hVar.f10849h, hVar.i);
        }
        return linkedHashMap;
    }

    public static Map X(Map map) {
        k.f("<this>", map);
        int size = map.size();
        if (size == 0) {
            return v.f11238h;
        }
        if (size != 1) {
            return Y(map);
        }
        k.f("<this>", map);
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        k.e("with(...)", mapSingletonMap);
        return mapSingletonMap;
    }

    public static LinkedHashMap Y(Map map) {
        k.f("<this>", map);
        return new LinkedHashMap(map);
    }
}
