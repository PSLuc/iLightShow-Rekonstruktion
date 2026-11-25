package p037g2;

import B.AbstractC0013g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p015c2.h;
import p109u2.l;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f9146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9147b;

    public m(int i, h hVar) {
        this.f9146a = hVar;
        this.f9147b = i;
    }

    public static void a(int i) {
        if (i != 1) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i, "Can not deserialize Singleton container from ", " entries"));
        }
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        switch (this.f9147b) {
            case 1:
                Set set = (Set) obj;
                a(set.size());
                return Collections.singleton(set.iterator().next());
            case 2:
                List list = (List) obj;
                a(list.size());
                return Collections.singletonList(list.get(0));
            case 3:
                Map map = (Map) obj;
                a(map.size());
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                return Collections.singletonMap(entry.getKey(), entry.getValue());
            case 4:
                return Collections.unmodifiableSet((Set) obj);
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return Collections.unmodifiableMap((Map) obj);
            case 7:
                return Collections.synchronizedSet((Set) obj);
            case 8:
                return Collections.synchronizedCollection((Collection) obj);
            case 9:
                return Collections.synchronizedList((List) obj);
            case 10:
                return Collections.synchronizedMap((Map) obj);
            default:
                return obj;
        }
    }
}
