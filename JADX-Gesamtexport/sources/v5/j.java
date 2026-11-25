package v5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f13324a;

    public j(L3.c cVar) {
        g[] gVarArr = {cVar};
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.S(1));
        linkedHashSet.add(gVarArr[0]);
        this.f13324a = linkedHashSet;
    }

    @Override // v5.g
    public final void a(k kVar, n nVar, Object obj, Object obj2) {
        E4.k.f("light", kVar);
        E4.k.f("property", nVar);
        Iterator it = this.f13324a.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(kVar, nVar, obj, obj2);
        }
    }
}
