package S;

import java.util.Iterator;
import p089q4.AbstractC0861a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0861a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f4873h;

    public m(c cVar) {
        this.f4873h = cVar;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        c cVar = this.f4873h;
        cVar.getClass();
        return cVar.i;
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4873h.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c cVar = this.f4873h;
        o[] oVarArr = new o[8];
        for (int i = 0; i < 8; i++) {
            oVarArr[i] = new p(2);
        }
        return new l(cVar.f4857h, oVarArr);
    }
}
