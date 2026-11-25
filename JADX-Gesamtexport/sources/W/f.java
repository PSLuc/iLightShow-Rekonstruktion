package W;

import N.W0;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f5525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5526b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f5527c;

    public f(g gVar, UUID uuid) {
        this.f5525a = uuid;
        Map map = (Map) gVar.f5529a.get(uuid);
        A2.e eVar = new A2.e(21, gVar);
        W0 w6 = k.f5537a;
        this.f5527c = new j(map, eVar);
    }
}
