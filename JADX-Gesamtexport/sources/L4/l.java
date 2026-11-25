package L4;

import B.C0043w;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends m {
    public static j N(Iterator it) {
        E4.k.f("<this>", it);
        return new a(new B4.b(2, it));
    }

    public static Object O(B4.b bVar) {
        g gVar = new g(bVar);
        if (gVar.hasNext()) {
            return gVar.next();
        }
        return null;
    }

    public static j P(Object obj, D4.c cVar) {
        E4.k.f("nextFunction", cVar);
        return obj == null ? f.f3104a : new i(new C0043w(18, obj), cVar);
    }

    public static B4.b Q(j jVar, D4.c cVar) {
        return new B4.b(1, new i(jVar, cVar, 2));
    }

    public static List R(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return u.f11237h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return d0.v(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
