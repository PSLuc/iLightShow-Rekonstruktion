package p114v1;

import E4.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p084p4.h;
import p089q4.l;
import p089q4.n;
import p089q4.z;
import p103t1.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13205b;

    public b(LinkedHashMap linkedHashMap, boolean z5) {
        this.f13204a = linkedHashMap;
        this.f13205b = new a(z5);
    }

    public final Map a() {
        h hVar;
        Set<Map.Entry> setEntrySet = this.f13204a.entrySet();
        int iS = z.S(n.P(setEntrySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                k.e("copyOf(this, size)", bArrCopyOf);
                hVar = new h(key, bArrCopyOf);
            } else {
                hVar = new h(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(hVar.f10849h, hVar.i);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.e("unmodifiableMap(map)", mapUnmodifiableMap);
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f13205b.f12444a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        k.f("key", eVar);
        Object obj = this.f13204a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        k.e("copyOf(this, size)", bArrCopyOf);
        return bArrCopyOf;
    }

    public final void d(e eVar, Object obj) {
        k.f("key", eVar);
        b();
        LinkedHashMap linkedHashMap = this.f13204a;
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(l.x0((Set) obj));
            k.e("unmodifiableSet(set.toSet())", setUnmodifiableSet);
            linkedHashMap.put(eVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            k.e("copyOf(this, size)", bArrCopyOf);
            linkedHashMap.put(eVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f13204a;
            LinkedHashMap linkedHashMap2 = this.f13204a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f13204a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = k.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f13204a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return l.e0(this.f13204a.entrySet(), ",\n", "{\n", "\n}", a.f13203h, 24);
    }

    public /* synthetic */ b(boolean z5) {
        this(new LinkedHashMap(), z5);
    }
}
