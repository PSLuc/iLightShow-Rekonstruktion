package S;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements F4.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f4854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f4855k;

    public b(h hVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f4854j = hVar;
        this.f4855k = obj2;
    }

    @Override // S.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f4855k;
    }

    @Override // S.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f4855k;
        this.f4855k = obj;
        f fVar = (f) this.f4854j.i;
        e eVar = fVar.f4865k;
        Object obj3 = this.f4853h;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z5 = fVar.f4859j;
        if (!z5) {
            eVar.put(obj3, obj);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            o oVar = fVar.f4858h[fVar.i];
            Object obj4 = oVar.f4879h[oVar.f4880j];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f4861j, obj4, 0);
        }
        fVar.f4868n = eVar.f4863l;
        return obj2;
    }
}
