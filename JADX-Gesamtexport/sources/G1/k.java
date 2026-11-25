package G1;

import F1.C0096m;
import N.F;
import java.util.Map;
import java.util.UUID;
import p090r.C0873l;

/* JADX INFO: loaded from: classes.dex */
public final class k implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1627d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.f1624a = i;
        this.f1625b = obj;
        this.f1626c = obj2;
        this.f1627d = obj3;
    }

    @Override // N.F
    public final void a() {
        switch (this.f1624a) {
            case 0:
                p pVar = (p) this.f1625b;
                C0096m c0096m = (C0096m) this.f1626c;
                pVar.b().b(c0096m);
                ((X.s) this.f1627d).remove(c0096m);
                break;
            case 1:
                W.g gVar = (W.g) this.f1626c;
                Map map = gVar.f5529a;
                W.f fVar = (W.f) this.f1625b;
                if (fVar.f5526b) {
                    Map mapD = fVar.f5527c.d();
                    boolean zIsEmpty = mapD.isEmpty();
                    UUID uuid = fVar.f5525a;
                    if (zIsEmpty) {
                        map.remove(uuid);
                    } else {
                        map.put(uuid, mapD);
                    }
                }
                gVar.f5530b.remove((UUID) this.f1627d);
                break;
            default:
                X.s sVar = (X.s) this.f1627d;
                Object obj = this.f1625b;
                sVar.remove(obj);
                ((C0873l) this.f1626c).f11416e.g(obj);
                break;
        }
    }

    public k(X.s sVar, Object obj, C0873l c0873l) {
        this.f1624a = 2;
        this.f1627d = sVar;
        this.f1625b = obj;
        this.f1626c = c0873l;
    }
}
