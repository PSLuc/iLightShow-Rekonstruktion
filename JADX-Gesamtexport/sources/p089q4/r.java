package p089q4;

import D4.c;
import E4.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends q {
    public static void R(Collection collection, Iterable iterable) {
        k.f("<this>", collection);
        k.f("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void S(Iterable iterable, c cVar) {
        k.f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) cVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static Object T(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object U(List list) {
        k.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(m.L(list));
    }
}
