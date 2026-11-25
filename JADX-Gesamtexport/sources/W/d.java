package W;

import B.W0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p089q4.z;
import p112v.W;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E4.l implements D4.e {
    public static final d i = new d(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f5521j = new d(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i6) {
        super(i3);
        this.f5522h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        i iVar;
        switch (this.f5522h) {
            case 0:
                g gVar = (g) obj2;
                LinkedHashMap linkedHashMapY = z.Y(gVar.f5529a);
                for (f fVar : gVar.f5530b.values()) {
                    if (fVar.f5526b) {
                        Map mapD = fVar.f5527c.d();
                        boolean zIsEmpty = mapD.isEmpty();
                        UUID uuid = fVar.f5525a;
                        if (zIsEmpty) {
                            linkedHashMapY.remove(uuid);
                        } else {
                            linkedHashMapY.put(uuid, mapD);
                        }
                    }
                }
                if (linkedHashMapY.isEmpty()) {
                    return null;
                }
                return linkedHashMapY;
            case 1:
                return obj2;
            default:
                b bVar = (b) obj;
                W0 w6 = (W0) obj2;
                List listM = p089q4.m.M(Float.valueOf(w6.f252a.h()), Boolean.valueOf(((W) w6.f256e.getValue()) == W.f12920h));
                int size = listM.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = listM.get(i3);
                    if (obj3 != null && (iVar = bVar.i) != null && !iVar.a(obj3)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (listM.isEmpty()) {
                    return null;
                }
                return new ArrayList(listM);
        }
    }
}
