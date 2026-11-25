package p046i2;

import S1.A;
import S1.C0355q;
import java.io.Serializable;
import java.util.List;
import p015c2.B;
import p015c2.InterfaceC0472c;
import p015c2.z;
import p026e2.n;
import p026e2.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements InterfaceC0472c, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f9578h;
    public transient List i;

    public w(z zVar) {
        this.f9578h = zVar == null ? z.f7339q : zVar;
    }

    @Override // p015c2.InterfaceC0472c
    public final C0355q b(n nVar, Class cls) {
        C0355q c0355qF = nVar.f(cls);
        B bD = nVar.d();
        AbstractC0771g abstractC0771gE = e();
        C0355q c0355qN = abstractC0771gE != null ? bD.n(abstractC0771gE) : null;
        if (c0355qF == null) {
            return c0355qN == null ? InterfaceC0472c.f7241f : c0355qN;
        }
        return c0355qN == null ? c0355qF : c0355qF.e(c0355qN);
    }

    @Override // p015c2.InterfaceC0472c
    public z c() {
        return this.f9578h;
    }

    public final boolean d() {
        Boolean bool = this.f9578h.f7340h;
        return bool != null && bool.booleanValue();
    }

    @Override // p015c2.InterfaceC0472c
    public final A f(n nVar, Class cls) {
        B bD = nVar.d();
        AbstractC0771g abstractC0771gE = e();
        if (abstractC0771gE == null) {
            o oVar = (o) nVar;
            oVar.e(cls);
            oVar.f8724n.getClass();
            return A.f4905l;
        }
        o oVar2 = (o) nVar;
        oVar2.e(abstractC0771gE.g());
        oVar2.e(cls);
        oVar2.f8724n.getClass();
        return A.f4905l.a(bD.J(abstractC0771gE));
    }

    public w(w wVar) {
        this.f9578h = wVar.f9578h;
    }
}
