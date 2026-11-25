package c5;

import B.AbstractC0013g0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0475a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f7389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.a f7390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f7392d;

    public E(Y4.a aVar, Y4.a aVar2, byte b6) {
        this.f7389a = aVar;
        this.f7390b = aVar2;
    }

    @Override // c5.AbstractC0475a
    public final Object a() {
        switch (this.f7391c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // c5.AbstractC0475a
    public final int b(Object obj) {
        switch (this.f7391c) {
            case 0:
                HashMap map = (HashMap) obj;
                E4.k.f("<this>", map);
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                E4.k.f("<this>", linkedHashMap);
                return linkedHashMap.size() * 2;
        }
    }

    @Override // c5.AbstractC0475a
    public final Iterator c(Object obj) {
        switch (this.f7391c) {
            case 0:
                Map map = (Map) obj;
                E4.k.f("<this>", map);
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                E4.k.f("<this>", map2);
                return map2.entrySet().iterator();
        }
    }

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        switch (this.f7391c) {
            case 0:
                Map map = (Map) obj;
                E4.k.f("<this>", map);
                return map.size();
            default:
                Map map2 = (Map) obj;
                E4.k.f("<this>", map2);
                return map2.size();
        }
    }

    @Override // c5.AbstractC0475a
    public final void f(b5.a aVar, int i, Object obj) {
        Map map = (Map) obj;
        E4.k.f("builder", map);
        Object objB = aVar.B(getDescriptor(), i, this.f7389a, null);
        int iK = aVar.k(getDescriptor());
        if (iK != i + 1) {
            throw new IllegalArgumentException(AbstractC0013g0.g("Value must follow key in a map, index for key: ", i, iK, ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objB);
        Y4.a aVar2 = this.f7390b;
        map.put(objB, (!zContainsKey || (aVar2.getDescriptor().c() instanceof a5.f)) ? aVar.B(getDescriptor(), iK, aVar2, null) : aVar.B(getDescriptor(), iK, aVar2, p089q4.z.R(objB, map)));
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        switch (this.f7391c) {
            case 0:
                E4.k.f("<this>", null);
                return new HashMap((Map) null);
            default:
                E4.k.f("<this>", null);
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        switch (this.f7391c) {
            case 0:
                break;
        }
        return this.f7392d;
    }

    @Override // c5.AbstractC0475a
    public final Object h(Object obj) {
        switch (this.f7391c) {
            case 0:
                HashMap map = (HashMap) obj;
                E4.k.f("<this>", map);
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                E4.k.f("<this>", linkedHashMap);
                return linkedHashMap;
        }
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        d(obj);
        a5.g descriptor = getDescriptor();
        E4.k.f("descriptor", descriptor);
        b5.b bVarA = ((p081p0.c) dVar).a(descriptor);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i + 1;
            p081p0.c cVar = (p081p0.c) bVarA;
            cVar.f0(getDescriptor(), i, this.f7389a, key);
            i += 2;
            cVar.f0(getDescriptor(), i3, this.f7390b, value);
        }
        bVarA.b(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(Y4.a aVar, Y4.a aVar2, int i) {
        this(aVar, aVar2, (byte) 0);
        this.f7391c = i;
        switch (i) {
            case 1:
                E4.k.f("kSerializer", aVar);
                E4.k.f("vSerializer", aVar2);
                this(aVar, aVar2, (byte) 0);
                a5.g descriptor = aVar.getDescriptor();
                a5.g descriptor2 = aVar2.getDescriptor();
                E4.k.f("keyDesc", descriptor);
                E4.k.f("valueDesc", descriptor2);
                this.f7392d = new D("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                E4.k.f("kSerializer", aVar);
                E4.k.f("vSerializer", aVar2);
                a5.g descriptor3 = aVar.getDescriptor();
                a5.g descriptor4 = aVar2.getDescriptor();
                E4.k.f("keyDesc", descriptor3);
                E4.k.f("valueDesc", descriptor4);
                this.f7392d = new D("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }
}
