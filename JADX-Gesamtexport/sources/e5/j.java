package e5;

import S1.V;
import kotlinx.serialization.json.JsonElement;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p122w4.h implements D4.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ p084p4.b f8767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K3.e f8768l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(K3.e eVar, p111u4.d dVar) {
        super(3, dVar);
        this.f8768l = eVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        j jVar = new j(this.f8768l, (p111u4.d) obj3);
        jVar.f8767k = (p084p4.b) obj;
        return jVar.o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f8766j;
        if (i == 0) {
            V.O(obj);
            p084p4.b bVar = this.f8767k;
            K3.e eVar = this.f8768l;
            o oVar = (o) eVar.f2139c;
            byte bQ = oVar.q();
            if (bQ == 1) {
                return eVar.j(true);
            }
            if (bQ == 0) {
                return eVar.j(false);
            }
            if (bQ != 6) {
                if (bQ == 8) {
                    return eVar.i();
                }
                o.m(oVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f8766j = 1;
            obj = K3.e.a(eVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return (JsonElement) obj;
    }
}
