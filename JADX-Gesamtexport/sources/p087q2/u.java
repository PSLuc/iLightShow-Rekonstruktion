package p087q2;

import T1.e;
import T1.k;
import com.fasterxml.jackson.databind.JsonNode;
import p003a2.a;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends b {
    @Override // p015c2.l, p015c2.m
    public void d(e eVar, E e6, p071n2.e eVar2) {
        a aVarE = eVar2.e(eVar, eVar2.d(p(), this));
        c(eVar, e6);
        eVar2.f(eVar, aVarE);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode m(int i) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode n(String str) {
        return null;
    }

    public abstract k p();
}
