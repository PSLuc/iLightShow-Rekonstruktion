package androidx.lifecycle;

import B.AbstractC0013g0;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f6949f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J1.d f6954e;

    public G(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6950a = linkedHashMap;
        this.f6951b = new LinkedHashMap();
        this.f6952c = new LinkedHashMap();
        this.f6953d = new LinkedHashMap();
        this.f6954e = new F(0, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(G g6) {
        E4.k.f("this$0", g6);
        for (Map.Entry entry : p089q4.z.X(g6.f6951b).entrySet()) {
            g6.b((String) entry.getKey(), ((J1.d) entry.getValue()).a());
        }
        LinkedHashMap linkedHashMap = g6.f6950a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return p006b.a.o(new p084p4.h("keys", arrayList), new p084p4.h("values", arrayList2));
    }

    public final void b(String str, Object obj) {
        E4.k.f("key", str);
        if (obj != null) {
            Class[] clsArr = f6949f;
            int i = 0;
            while (true) {
                if (i >= 29) {
                    throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
                }
                Class cls = clsArr[i];
                E4.k.c(cls);
                if (cls.isInstance(obj)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        Object obj2 = this.f6952c.get(str);
        x xVar = obj2 instanceof x ? (x) obj2 : null;
        if (xVar != null) {
            xVar.getClass();
            ((p062m.a) p062m.a.R().f10401d).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0013g0.i("Cannot invoke ", "setValue", " on a background thread"));
            }
            xVar.f7015e++;
            xVar.f7013c = obj;
            if (xVar.f7016f) {
                xVar.f7017g = true;
            } else {
                xVar.f7016f = true;
                do {
                    xVar.f7017g = false;
                    p068n.f fVar = xVar.f7012b;
                    fVar.getClass();
                    p068n.d dVar = new p068n.d(fVar);
                    fVar.f10507j.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext()) {
                        xVar.a((AbstractC0462w) ((Map.Entry) dVar.next()).getValue());
                        if (xVar.f7017g) {
                            break;
                        }
                    }
                } while (xVar.f7017g);
                xVar.f7016f = false;
            }
        } else {
            this.f6950a.put(str, obj);
        }
        S4.y yVar = (S4.y) this.f6953d.get(str);
        if (yVar == null) {
            return;
        }
        ((S4.P) yVar).h(obj);
    }

    public G() {
        this.f6950a = new LinkedHashMap();
        this.f6951b = new LinkedHashMap();
        this.f6952c = new LinkedHashMap();
        this.f6953d = new LinkedHashMap();
        this.f6954e = new F(0, this);
    }
}
