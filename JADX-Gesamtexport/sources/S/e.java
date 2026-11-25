package S;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractMap implements Q.c, Map, F4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f4860h;
    public U.b i = new U.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f4861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f4862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4864m;

    public e(c cVar) {
        this.f4860h = cVar;
        this.f4861j = cVar.f4857h;
        cVar.getClass();
        this.f4864m = cVar.i;
    }

    @Override // Q.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c d() {
        n nVar = this.f4861j;
        c cVar = this.f4860h;
        if (nVar != cVar.f4857h) {
            this.i = new U.b();
            cVar = new c(this.f4861j, this.f4864m);
        }
        this.f4860h = cVar;
        return cVar;
    }

    public final void b(int i) {
        this.f4864m = i;
        this.f4863l++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f4861j = n.f4874e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4861j.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f4861j.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f4862k = null;
        this.f4861j = this.f4861j.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f4862k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarD = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarD = eVar.d();
            }
        } else {
            cVarD = cVar;
        }
        if (cVarD == null) {
            super.putAll(map);
            return;
        }
        U.a aVar = new U.a();
        aVar.f5302a = 0;
        int i = this.f4864m;
        n nVar = this.f4861j;
        n nVar2 = cVarD.f4857h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", nVar2);
        this.f4861j = nVar.m(nVar2, 0, aVar, this);
        int i3 = (cVarD.i + i) - aVar.f5302a;
        if (i != i3) {
            b(i3);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f4864m;
        n nVarO = this.f4861j.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (nVarO == null) {
            nVarO = n.f4874e;
        }
        this.f4861j = nVarO;
        return i != this.f4864m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4864m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new j(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f4862k = null;
        n nVarN = this.f4861j.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (nVarN == null) {
            nVarN = n.f4874e;
        }
        this.f4861j = nVarN;
        return this.f4862k;
    }
}
