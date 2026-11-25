package p087q2;

import T1.e;
import T1.k;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class t extends u {
    public static final t i = new t("");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11227h;

    public t(String str) {
        this.f11227h = str;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        String str = this.f11227h;
        if (str == null) {
            eVar.V();
        } else {
            eVar.s0(str);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof t)) {
            return ((t) obj).f11227h.equals(this.f11227h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11227h.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int i() {
        return V1.e.a(this.f11227h);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        return this.f11227h;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 9;
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_STRING;
    }
}
