package t5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import m5.h;
import p012c.k;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f12603h = new LinkedHashSet();
    public int i;

    public final void c(d dVar) {
        LinkedHashSet linkedHashSet = this.f12603h;
        if (linkedHashSet.contains(dVar)) {
            throw new IllegalStateException("there already is a name of the given type");
        }
        linkedHashSet.add(dVar);
        int i = this.i + 3;
        this.i = i;
        this.i = i + dVar.f12601b.length;
    }

    public final void d(h hVar) {
        String str;
        int iE;
        h hVarD = hVar.d(hVar.e(16));
        while (hVarD.b()) {
            byte b6 = hVarD.f(1)[0];
            int i = 2;
            for (int i3 : AbstractC0916i.e(2)) {
                if (k.b(i3) == b6) {
                    i = i3;
                    break;
                }
            }
            if (AbstractC0916i.d(i) != 0) {
                if (i == 1) {
                    str = "HOST_NAME";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "UNDEFINED";
                }
                throw new IllegalArgumentException("ServerNames: unknown name_type!", new IllegalArgumentException(str));
            }
            if (hVarD.a() < 16 || hVarD.f10448a.available() < (iE = hVarD.e(16))) {
                throw new IllegalArgumentException("ServerNames: no hostname found!");
            }
            c(d.a(i, hVarD.f(iE)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        LinkedHashSet linkedHashSet = this.f12603h;
        int size = linkedHashSet.size();
        LinkedHashSet linkedHashSet2 = ((e) obj).f12603h;
        return size == linkedHashSet2.size() && linkedHashSet.containsAll(linkedHashSet2);
    }

    public final int hashCode() {
        Iterator it = this.f12603h.iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + ((d) it.next()).f12602c;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12603h.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerNames[");
        Iterator it = this.f12603h.iterator();
        while (it.hasNext()) {
            sb.append(new String(((d) it.next()).f12601b, d.f12599d));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
