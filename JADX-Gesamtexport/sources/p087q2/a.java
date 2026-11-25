package p087q2;

import T1.e;
import T1.k;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final ArrayList i;

    public a(m mVar) {
        super(mVar);
        this.i = new ArrayList();
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        eVar.n0(this);
        for (int i = 0; i < size; i++) {
            ((JsonNode) arrayList.get(i)).c(eVar, e6);
        }
        eVar.L();
    }

    @Override // p015c2.l, p015c2.m
    public final void d(e eVar, E e6, p071n2.e eVar2) {
        p003a2.a aVarE = eVar2.e(eVar, eVar2.d(k.START_ARRAY, this));
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b) ((JsonNode) obj)).c(eVar, e6);
        }
        eVar2.f(eVar, aVarE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            return this.i.equals(((a) obj).i);
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
        return this.i.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode m(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.i;
        if (i < arrayList.size()) {
            return (JsonNode) arrayList.get(i);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode n(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 1;
    }

    public final void q(JsonNode jsonNode) {
        this.i.add(jsonNode);
    }

    public final void r(JsonNode jsonNode) {
        if (jsonNode == null) {
            p();
            jsonNode = p.f11225h;
        }
        q(jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int size() {
        return this.i.size();
    }
}
