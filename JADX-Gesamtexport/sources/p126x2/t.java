package p126x2;

import E4.k;
import F4.e;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p084p4.h;
import p089q4.l;
import p089q4.n;
import p089q4.u;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Map, e {
    public static final Map i = z.T(new h(new s("Set-Cookie"), Boolean.FALSE));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f14110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f14111k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f14112h = new HashMap();

    static {
        s sVar = new s("Age");
        Boolean bool = Boolean.TRUE;
        f14110j = z.U(new h(sVar, bool), new h(new s("Content-Encoding"), bool), new h(new s("Content-Length"), bool), new h(new s("Content-Location"), bool), new h(new s("Content-Type"), bool), new h(new s("Expect"), bool), new h(new s("Expires"), bool), new h(new s("Location"), bool), new h(new s("User-Agent"), bool));
        f14111k = z.T(new h(new s("Cookie"), "; "));
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Collection put(String str, Collection collection) {
        k.f("key", str);
        k.f("value", collection);
        return (Collection) this.f14112h.put(new s(str), collection);
    }

    public final void b(D4.e eVar, D4.e eVar2) {
        for (Map.Entry entry : entrySet()) {
            String str = (String) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            s sVar = new s(str);
            Object objValueOf = i.get(sVar);
            if (objValueOf == null) {
                objValueOf = Boolean.valueOf(!AbstractC0599v0.E(sVar));
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            if (zBooleanValue) {
                eVar.d(str, AbstractC0599v0.i(sVar, collection));
            } else if (!zBooleanValue) {
                boolean zE = AbstractC0599v0.E(sVar);
                if (zE) {
                    Object obj = (String) l.g0(collection);
                    if (obj != null) {
                        eVar.d(str, obj);
                    }
                } else if (!zE) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eVar2.d(str, (String) it.next());
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14112h.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        k.f("key", str);
        return this.f14112h.containsKey(new s(str));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) obj;
        k.f("value", collection);
        return this.f14112h.containsValue(collection);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        HashMap map = this.f14112h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.S(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((s) entry.getKey()).f14109b, entry.getValue());
        }
        return z.Y(linkedHashMap).entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        k.f("key", str);
        s sVar = new s(str);
        Collection collection = (Collection) this.f14112h.get(sVar);
        u uVar = u.f11237h;
        if (collection == null) {
            collection = uVar;
        }
        boolean zE = AbstractC0599v0.E(sVar);
        if (zE) {
            Object objG0 = l.g0(collection);
            return objG0 != null ? d0.v(objG0) : uVar;
        }
        if (zE) {
            throw new NoWhenBranchMatchedException();
        }
        return collection;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14112h.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set setKeySet = this.f14112h.keySet();
        k.e("contents.keys", setKeySet);
        Set set = setKeySet;
        ArrayList arrayList = new ArrayList(n.P(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).f14109b);
        }
        return l.w0(new HashSet(arrayList));
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k.f("from", map);
        for (Map.Entry entry : AbstractC0599v0.w(map).entrySet()) {
            put((String) entry.getKey(), (Collection) entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        k.f("key", str);
        return (Collection) this.f14112h.remove(new s(str));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14112h.size();
    }

    public final String toString() {
        String string = this.f14112h.toString();
        k.e("contents.toString()", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collectionValues = this.f14112h.values();
        k.e("contents.values", collectionValues);
        return collectionValues;
    }
}
