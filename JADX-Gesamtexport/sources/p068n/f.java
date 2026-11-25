package p068n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f10506h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakHashMap f10507j = new WeakHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10508k = 0;

    public c c(Object obj) {
        c cVar = this.f10506h;
        while (cVar != null && !cVar.f10501h.equals(obj)) {
            cVar = cVar.f10502j;
        }
        return cVar;
    }

    public Object d(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f10508k--;
        WeakHashMap weakHashMap = this.f10507j;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f10503k;
        if (cVar != null) {
            cVar.f10502j = cVarC.f10502j;
        } else {
            this.f10506h = cVarC.f10502j;
        }
        c cVar2 = cVarC.f10502j;
        if (cVar2 != null) {
            cVar2.f10503k = cVar;
        } else {
            this.i = cVar;
        }
        cVarC.f10502j = null;
        cVarC.f10503k = null;
        return cVarC.i;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f10508k != fVar.f10508k) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f10506h, this.i, 0);
        this.f10507j.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
