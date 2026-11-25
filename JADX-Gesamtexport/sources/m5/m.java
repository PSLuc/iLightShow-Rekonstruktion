package m5;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractCollection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10460h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m(int i, Object obj) {
        this.f10460h = i;
        this.i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        switch (this.f10460h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f10460h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((p115v2.o) this.i).clear();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[ORIG_RETURN, RETURN] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object objA;
        switch (this.f10460h) {
            case 0:
                o oVar = (o) this.i;
                Iterator it = oVar.f10467b.values().iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    if (nVar.f10462b.equals(obj) && (objA = oVar.a(nVar, it)) != null) {
                        if (objA != null) {
                            return true;
                        }
                        return false;
                    }
                }
                objA = null;
                if (objA != null) {
                    return true;
                }
                return false;
            default:
                return ((p115v2.o) this.i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10460h) {
            case 0:
                o oVar = (o) this.i;
                return new l(oVar, oVar.f10467b.values().iterator());
            default:
                return new p115v2.j((p115v2.o) this.i, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f10460h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f10460h) {
            case 0:
                return ((o) this.i).f10467b.size();
            default:
                return ((p115v2.o) this.i).f13238h.size();
        }
    }
}
