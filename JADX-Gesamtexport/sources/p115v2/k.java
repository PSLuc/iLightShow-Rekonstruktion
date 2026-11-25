package p115v2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractSet {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13229h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f13230j;

    public /* synthetic */ k(o oVar, int i) {
        this.f13229h = i;
        this.f13230j = oVar;
        this.i = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f13229h) {
            case 0:
                throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13229h) {
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
        switch (this.f13229h) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    l lVar = (l) this.i.f13238h.get(entry.getKey());
                    if (lVar != null && lVar.a().equals(entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f13230j.f13238h.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13229h) {
            case 0:
                return new j(this.f13230j, 0);
            default:
                return new j(this.f13230j, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f13229h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.i.remove(entry.getKey(), entry.getValue());
            default:
                return this.i.remove(obj) != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f13229h) {
            case 0:
                break;
        }
        return this.i.f13238h.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        switch (this.f13229h) {
            case 1:
                return this.i.f13238h.keySet().toArray();
            default:
                return super.toArray();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        switch (this.f13229h) {
            case 1:
                return this.i.f13238h.keySet().toArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }
}
