package p087q2;

import T1.e;
import T1.k;
import p015c2.E;
import p015c2.m;

/* JADX INFO: loaded from: classes.dex */
public final class s extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11226h;

    public s(Object obj) {
        this.f11226h = obj;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        Object obj = this.f11226h;
        if (obj == null) {
            e6.g0(eVar);
        } else if (obj instanceof m) {
            ((m) obj).c(eVar, e6);
        } else {
            e6.getClass();
            e6.n0(obj.getClass()).serialize(obj, eVar, e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        Object obj2 = ((s) obj).f11226h;
        Object obj3 = this.f11226h;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        return this.f11226h.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int i() {
        Object obj = this.f11226h;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        Object obj = this.f11226h;
        return obj == null ? "null" : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 8;
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_EMBEDDED_OBJECT;
    }
}
