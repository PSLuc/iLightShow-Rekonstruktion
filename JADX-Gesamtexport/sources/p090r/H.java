package p090r;

import E4.k;
import G4.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f11376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f11377c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f11378a;

    static {
        a aVar = null;
        LinkedHashMap linkedHashMap = null;
        I i = null;
        O o6 = null;
        t tVar = null;
        f11376b = new H(new Q(i, o6, tVar, aVar, linkedHashMap, 63));
        f11377c = new H(new Q(i, o6, tVar, aVar, linkedHashMap, 47));
    }

    public H(Q q6) {
        this.f11378a = q6;
    }

    public final H a(H h6) {
        Q q6 = h6.f11378a;
        Q q7 = this.f11378a;
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
        boolean z5 = q6.f11393d || q7.f11393d;
        Map map = q7.f11394e;
        k.f("<this>", map);
        Map map2 = q6.f11394e;
        k.f("map", map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new H(new Q(i, o6, tVar, (a) null, z5, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof H) && k.a(((H) obj).f11378a, this.f11378a);
    }

    public final int hashCode() {
        return this.f11378a.hashCode();
    }

    public final String toString() {
        if (equals(f11376b)) {
            return "ExitTransition.None";
        }
        if (equals(f11377c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        Q q6 = this.f11378a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(q6.f11393d);
        return sb.toString();
    }
}
