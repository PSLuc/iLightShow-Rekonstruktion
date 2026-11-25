package L3;

import E4.k;
import J3.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends K3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K3.b f3093a = K3.b.i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p110u3.a(serialize = false)
    private D3.c f3094b;

    public final void a(D3.c cVar) {
        this.f3094b = cVar;
        this.f3093a = cVar == null ? K3.b.i : K3.b.f2129j;
        K3.c cVar2 = this.delegate;
        if (cVar2 != null) {
            ((e) cVar2).b();
        }
    }

    @Override // K3.a
    public final ArrayList getLights() {
        D3.c cVar;
        ArrayList arrayList = new ArrayList();
        if ((getState() == K3.b.f2128h || getState() == K3.b.f2129j) && (cVar = this.f3094b) != null) {
            k.c(cVar);
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // K3.a
    public final K3.b getState() {
        D3.c cVar = this.f3094b;
        if (cVar != null) {
            v5.k kVar = cVar.f766l;
            k.c(kVar);
            ((Boolean) kVar.f13339s.h(kVar, v5.k.f13326E[0])).booleanValue();
        }
        if (cVar != null && cVar.f801c != null && cVar.f800b != null) {
            v5.k kVar2 = cVar.f766l;
            k.c(kVar2);
            if (((Boolean) kVar2.f13339s.h(kVar2, v5.k.f13326E[0])).booleanValue()) {
                return K3.b.f2128h;
            }
        }
        return this.f3093a;
    }
}
