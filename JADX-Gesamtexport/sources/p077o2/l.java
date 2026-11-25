package p077o2;

import O1.E;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p015c2.B;
import p015c2.h;
import p026e2.n;
import p046i2.AbstractC0771g;
import p046i2.C0766b;
import p071n2.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0599v0 implements Serializable {
    public static void R(C0766b c0766b, c cVar, n nVar, B b6, HashMap map) {
        String strX;
        if (!cVar.a() && (strX = b6.X(c0766b)) != null) {
            cVar = new c(strX, cVar.f10538h);
        }
        c cVar2 = new c(null, cVar.f10538h);
        if (map.containsKey(cVar2)) {
            if (!cVar.a() || ((c) map.get(cVar2)).a()) {
                return;
            }
            map.put(cVar2, cVar);
            return;
        }
        map.put(cVar2, cVar);
        List listW = b6.W(c0766b);
        if (listW != null) {
            ArrayList arrayList = (ArrayList) listW;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar3 = (c) obj;
                R(E.i(nVar, cVar3.f10538h), cVar3, nVar, b6, map);
            }
        }
    }

    public static void S(C0766b c0766b, c cVar, n nVar, HashSet hashSet, LinkedHashMap linkedHashMap) {
        List listW;
        String strX;
        B bD = nVar.d();
        if (!cVar.a() && (strX = bD.X(c0766b)) != null) {
            cVar = new c(strX, cVar.f10538h);
        }
        if (cVar.a()) {
            linkedHashMap.put(cVar.f10539j, cVar);
        }
        if (!hashSet.add(cVar.f10538h) || (listW = bD.W(c0766b)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) listW;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar2 = (c) obj;
            S(E.i(nVar, cVar2.f10538h), cVar2, nVar, hashSet, linkedHashMap);
        }
    }

    public static ArrayList T(Class cls, HashSet hashSet, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            hashSet.remove(((c) it.next()).f10538h);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new c(null, cls2));
            }
        }
        return arrayList;
    }

    public final ArrayList U(n nVar, AbstractC0771g abstractC0771g, h hVar) {
        Class clsG;
        List listW;
        B bD = nVar.d();
        if (hVar != null) {
            clsG = hVar.f7281k;
        } else {
            if (abstractC0771g == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            clsG = abstractC0771g.g();
        }
        HashMap map = new HashMap();
        if (abstractC0771g != null && (listW = bD.W(abstractC0771g)) != null) {
            ArrayList arrayList = (ArrayList) listW;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar = (c) obj;
                R(E.i(nVar, cVar.f10538h), cVar, nVar, bD, map);
            }
        }
        R(E.i(nVar, clsG), new c(null, clsG), nVar, bD, map);
        return new ArrayList(map.values());
    }

    public final ArrayList V(n nVar, C0766b c0766b) {
        Class cls = c0766b.f9525j;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        S(c0766b, new c(null, cls), nVar, hashSet, linkedHashMap);
        return T(cls, hashSet, linkedHashMap);
    }

    public final ArrayList W(n nVar, AbstractC0771g abstractC0771g, h hVar) {
        List listW;
        B bD = nVar.d();
        Class cls = hVar.f7281k;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        S(E.i(nVar, cls), new c(null, cls), nVar, hashSet, linkedHashMap);
        if (abstractC0771g != null && (listW = bD.W(abstractC0771g)) != null) {
            ArrayList arrayList = (ArrayList) listW;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar = (c) obj;
                S(E.i(nVar, cVar.f10538h), cVar, nVar, hashSet, linkedHashMap);
            }
        }
        return T(cls, hashSet, linkedHashMap);
    }
}
