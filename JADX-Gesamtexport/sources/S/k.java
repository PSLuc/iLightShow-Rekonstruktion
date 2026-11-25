package S;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p089q4.h implements Q.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4872h;
    public final c i;

    public /* synthetic */ k(c cVar, int i) {
        this.f4872h = i;
        this.i = cVar;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        switch (this.f4872h) {
            case 0:
                c cVar = this.i;
                cVar.getClass();
                return cVar.i;
            default:
                c cVar2 = this.i;
                cVar2.getClass();
                return cVar2.i;
        }
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f4872h) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.i;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4872h) {
            case 0:
                c cVar = this.i;
                o[] oVarArr = new o[8];
                for (int i = 0; i < 8; i++) {
                    oVarArr[i] = new p(0);
                }
                return new l(cVar.f4857h, oVarArr);
            default:
                c cVar2 = this.i;
                o[] oVarArr2 = new o[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    oVarArr2[i3] = new p(1);
                }
                return new l(cVar2.f4857h, oVarArr2);
        }
    }
}
