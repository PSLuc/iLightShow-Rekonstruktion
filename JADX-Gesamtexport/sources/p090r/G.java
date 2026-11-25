package p090r;

import E4.k;
import G4.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f11374b = new G(new Q((I) null, (O) null, (t) null, (a) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f11375a;

    public G(Q q6) {
        this.f11375a = q6;
    }

    public final G a(G g6) {
        a aVar = null;
        Q q6 = g6.f11375a;
        Q q7 = this.f11375a;
        I i = q6.f11390a;
        if (i == null) {
            i = q7.f11390a;
        }
        O o6 = q6.f11391b;
        if (o6 == null) {
            o6 = q7.f11391b;
        }
        t tVar = q6.f11392c;
        if (tVar == null) {
            tVar = q7.f11392c;
        }
        Map map = q7.f11394e;
        k.f("<this>", map);
        Map map2 = q6.f11394e;
        k.f("map", map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new G(new Q(i, o6, tVar, aVar, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && k.a(((G) obj).f11375a, this.f11375a);
    }

    public final int hashCode() {
        return this.f11375a.hashCode();
    }

    public final String toString() {
        if (equals(f11374b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        Q q6 = this.f11375a;
        I i = q6.f11390a;
        sb.append(i != null ? i.toString() : null);
        sb.append(",\nSlide - ");
        O o6 = q6.f11391b;
        sb.append(o6 != null ? o6.toString() : null);
        sb.append(",\nShrink - ");
        t tVar = q6.f11392c;
        sb.append(tVar != null ? tVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
