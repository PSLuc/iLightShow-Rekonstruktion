package R;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends p089q4.d implements List, Collection, F4.a {
    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c g(int i, Object obj);

    public abstract c i(Object obj);

    @Override // p089q4.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public c j(Collection collection) {
        f fVarK = k();
        fVarK.addAll(collection);
        return fVarK.i();
    }

    public abstract f k();

    public abstract c l(b bVar);

    @Override // p089q4.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c m(int i);

    public abstract c n(int i, Object obj);

    @Override // p089q4.d, java.util.List
    public final List subList(int i, int i3) {
        return new Q.a(this, i, i3);
    }
}
