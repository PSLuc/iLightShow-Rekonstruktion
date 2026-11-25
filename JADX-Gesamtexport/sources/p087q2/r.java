package p087q2;

import T1.e;
import T1.k;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p003a2.a;
import p015c2.C;
import p015c2.D;
import p015c2.E;
import p015c2.l;
import p026e2.j;
import p026e2.m;

/* JADX INFO: loaded from: classes.dex */
public final class r extends f {
    public final LinkedHashMap i;

    public r(m mVar) {
        super(mVar);
        this.i = new LinkedHashMap();
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        if (e6 != null) {
            D d6 = D.WRITE_EMPTY_JSON_ARRAYS;
            C c6 = e6.f7226j;
            boolean zP = c6.p(d6);
            boolean z5 = !zP;
            m mVar = m.WRITE_NULL_PROPERTIES;
            j jVar = c6.f8725o;
            jVar.getClass();
            mVar.getClass();
            boolean zC = mVar.c(jVar.f8703h);
            boolean z6 = !zC;
            if (!zP || !zC) {
                eVar.p0(this);
                v(eVar, e6, z5, z6);
                eVar.M();
                return;
            }
        }
        eVar.p0(this);
        for (Map.Entry entry : this.i.entrySet()) {
            JsonNode jsonNode = (JsonNode) entry.getValue();
            eVar.T((String) entry.getKey());
            jsonNode.c(eVar, e6);
        }
        eVar.M();
    }

    @Override // p015c2.l, p015c2.m
    public final void d(e eVar, E e6, p071n2.e eVar2) {
        boolean z5;
        boolean z6;
        if (e6 != null) {
            D d6 = D.WRITE_EMPTY_JSON_ARRAYS;
            C c6 = e6.f7226j;
            z5 = !c6.p(d6);
            m mVar = m.WRITE_NULL_PROPERTIES;
            j jVar = c6.f8725o;
            jVar.getClass();
            mVar.getClass();
            z6 = !mVar.c(jVar.f8703h);
        } else {
            z5 = false;
            z6 = false;
        }
        a aVarE = eVar2.e(eVar, eVar2.d(k.START_OBJECT, this));
        if (z5 || z6) {
            v(eVar, e6, z5, z6);
        } else {
            for (Map.Entry entry : this.i.entrySet()) {
                JsonNode jsonNode = (JsonNode) entry.getValue();
                eVar.T((String) entry.getKey());
                jsonNode.c(eVar, e6);
            }
        }
        eVar2.f(eVar, aVarE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof r)) {
            return this.i.equals(((r) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // p015c2.l
    public final boolean isEmpty() {
        return this.i.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Iterator k() {
        return this.i.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final Iterator l() {
        return this.i.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode m(int i) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode n(String str) {
        return (JsonNode) this.i.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 7;
    }

    public final void q(String str, String str2) {
        l lVarA;
        if (str2 == null) {
            p();
            lVarA = p.f11225h;
        } else {
            this.f11215h.getClass();
            lVarA = m.a(str2);
        }
        this.i.put(str, lVarA);
    }

    public final void r(String str, boolean z5) {
        this.f11215h.getClass();
        this.i.put(str, z5 ? e.i : e.f11213j);
    }

    public final void s(String str) {
        LinkedHashMap linkedHashMap = this.i;
        p();
        linkedHashMap.put(str, p.f11225h);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int size() {
        throw null;
    }

    public final void t(String str, JsonNode jsonNode) {
        this.f11215h.getClass();
        this.i.put(str, new s(jsonNode));
    }

    public final JsonNode u(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            p();
            jsonNode = p.f11225h;
        }
        return (JsonNode) this.i.put(str, jsonNode);
    }

    public final void v(e eVar, E e6, boolean z5, boolean z6) {
        for (Map.Entry entry : this.i.entrySet()) {
            b bVar = (b) entry.getValue();
            if (z5) {
                bVar.getClass();
                if (!(bVar instanceof a) || !bVar.isEmpty()) {
                }
            }
            if (!z6 || bVar.o() != 5) {
                eVar.T((String) entry.getKey());
                bVar.c(eVar, e6);
            }
        }
    }

    public final void w(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            p();
            jsonNode = p.f11225h;
        }
        this.i.put(str, jsonNode);
    }
}
