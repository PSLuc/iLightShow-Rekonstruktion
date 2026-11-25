package W;

import B.C0031p0;
import B.C0043w;
import S1.V;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p020d2.n;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.l f5534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5536c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map map, D4.c cVar) {
        this.f5534a = (E4.l) cVar;
        this.f5535b = map != null ? z.Y(map) : new LinkedHashMap();
        this.f5536c = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D4.c, E4.l] */
    @Override // W.i
    public final boolean a(Object obj) {
        return ((Boolean) this.f5534a.invoke(obj)).booleanValue();
    }

    @Override // W.i
    public final Object b(String str) {
        LinkedHashMap linkedHashMap = this.f5535b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // W.i
    public final C0031p0 c(String str, C0043w c0043w) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!V.F(str.charAt(i))) {
                LinkedHashMap linkedHashMap = this.f5536c;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(c0043w);
                return new C0031p0(this, str, c0043w, 18);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    public final Map d() {
        LinkedHashMap linkedHashMapY = z.Y(this.f5535b);
        for (Map.Entry entry : this.f5536c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((D4.a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException(n.q(objInvoke).toString());
                    }
                    linkedHashMapY.put(str, p089q4.m.J(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((D4.a) list.get(i)).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException(n.q(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapY.put(str, arrayList);
            }
        }
        return linkedHashMapY;
    }
}
