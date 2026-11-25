package p098s2;

import S1.EnumC0363z;
import T1.e;
import V1.h;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import p015c2.E;
import p015c2.o;
import p087q2.r;
import p093r2.b;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s f12191z;

    public q(q qVar, p109u2.q qVar2, h hVar) {
        super(qVar, hVar);
        this.f12191z = qVar2;
    }

    @Override // p093r2.b
    public final void g(r rVar, JsonNode jsonNode) {
        JsonNode jsonNodeN = jsonNode.n("properties");
        if (jsonNodeN != null) {
            Iterator itL = jsonNodeN.l();
            while (itL.hasNext()) {
                Map.Entry entry = (Map.Entry) itL.next();
                String strA = (String) entry.getKey();
                s sVar = this.f12191z;
                if (sVar != null) {
                    strA = sVar.a(strA);
                }
                rVar.w(strA, (JsonNode) entry.getValue());
            }
        }
    }

    @Override // p093r2.b
    public final o h(AbstractC0599v0 abstractC0599v0, Class cls, E e6) {
        p015c2.h hVar = this.f11736n;
        o oVarO0 = hVar != null ? e6.o0(e6.f0(hVar, cls), this) : e6.p0(cls, this);
        boolean zIsUnwrappingSerializer = oVarO0.isUnwrappingSerializer();
        s qVar = this.f12191z;
        if (zIsUnwrappingSerializer && (oVarO0 instanceof r)) {
            qVar = new p109u2.q(qVar, ((r) oVarO0).f12192q);
        }
        o oVarUnwrappingSerializer = oVarO0.unwrappingSerializer(qVar);
        this.f11743u = this.f11743u.G(cls, oVarUnwrappingSerializer);
        return oVarUnwrappingSerializer;
    }

    @Override // p093r2.b
    public final void k(o oVar) {
        if (oVar != null) {
            boolean zIsUnwrappingSerializer = oVar.isUnwrappingSerializer();
            s qVar = this.f12191z;
            if (zIsUnwrappingSerializer && (oVar instanceof r)) {
                qVar = new p109u2.q(qVar, ((r) oVar).f12192q);
            }
            oVar = oVar.unwrappingSerializer(qVar);
        }
        super.k(oVar);
    }

    @Override // p093r2.b
    public final b l(s sVar) {
        return new q(this, new p109u2.q(sVar, this.f12191z), new h(sVar.a(this.f11732j.f5505h)));
    }

    @Override // p093r2.b
    public final void n(Object obj, e eVar, E e6) {
        Method method = this.f11738p;
        Object objInvoke = method == null ? this.f11739q.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            return;
        }
        o oVarH = this.f11740r;
        if (oVarH == null) {
            Class<?> cls = objInvoke.getClass();
            AbstractC0599v0 abstractC0599v0 = this.f11743u;
            o oVarI = abstractC0599v0.I(cls);
            oVarH = oVarI == null ? h(abstractC0599v0, cls, e6) : oVarI;
        }
        Object obj2 = this.f11745w;
        if (obj2 != null) {
            if (EnumC0363z.f4984j == obj2) {
                if (oVarH.isEmpty(e6, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && i(eVar, e6, oVarH)) {
            return;
        }
        if (!oVarH.isUnwrappingSerializer()) {
            eVar.Q(this.f11732j);
        }
        p077o2.q qVar = this.f11742t;
        if (qVar == null) {
            oVarH.serialize(objInvoke, eVar, e6);
        } else {
            oVarH.serializeWithType(objInvoke, eVar, e6, qVar);
        }
    }

    public q(b bVar, s sVar) {
        super(bVar, bVar.f11732j);
        this.f12191z = sVar;
    }
}
