package E0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p130y0.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterable, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f939h = new LinkedHashMap();
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f940j;

    public final boolean c(r rVar) {
        return this.f939h.containsKey(rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return E4.k.a(this.f939h, hVar.f939h) && this.i == hVar.i && this.f940j == hVar.f940j;
    }

    public final Object g(r rVar) {
        Object obj = this.f939h.get(rVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + rVar + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f940j) + p012c.k.m(this.i, this.f939h.hashCode() * 31, 31);
    }

    public final void i(r rVar, Object obj) {
        boolean z5 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f939h;
        if (!z5 || !linkedHashMap.containsKey(rVar)) {
            linkedHashMap.put(rVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(rVar);
        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", obj2);
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f902a;
        if (str == null) {
            str = aVar.f902a;
        }
        p084p4.e eVar = aVar2.f903b;
        if (eVar == null) {
            eVar = aVar.f903b;
        }
        linkedHashMap.put(rVar, new a(str, eVar));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f939h.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.i) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f940j) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f939h.entrySet()) {
            r rVar = (r) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(rVar.f998a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return H.y(this) + "{ " + ((Object) sb) + " }";
    }
}
