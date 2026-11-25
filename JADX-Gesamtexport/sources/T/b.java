package T;

import Q.e;
import S.c;
import java.util.Iterator;
import p089q4.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f5142k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5143h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f5144j;

    static {
        U.b bVar = U.b.f5303a;
        f5142k = new b(bVar, bVar, c.f4856j);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f5143h = obj;
        this.i = obj2;
        this.f5144j = cVar;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        c cVar = this.f5144j;
        cVar.getClass();
        return cVar.i;
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5144j.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new L4.h(this.f5143h, this.f5144j);
    }
}
