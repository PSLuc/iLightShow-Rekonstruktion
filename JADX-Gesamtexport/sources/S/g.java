package S;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p089q4.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4869h;
    public final e i;

    public /* synthetic */ g(int i, e eVar) {
        this.f4869h = i;
        this.i = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4869h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p089q4.g
    public final int c() {
        switch (this.f4869h) {
            case 0:
                e eVar = this.i;
                eVar.getClass();
                return eVar.f4864m;
            default:
                e eVar2 = this.i;
                eVar2.getClass();
                return eVar2.f4864m;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4869h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4869h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.i;
                Object obj2 = eVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4869h) {
            case 0:
                return new h(this.i);
            default:
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(1);
                }
                return new i(this.i, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4869h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.i.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.i;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
