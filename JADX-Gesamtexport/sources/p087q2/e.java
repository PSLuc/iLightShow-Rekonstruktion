package p087q2;

import T1.k;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u {
    public static final e i = new e(true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f11213j = new e(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11214h;

    public e(boolean z5) {
        this.f11214h = z5;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(T1.e eVar, E e6) {
        eVar.J(this.f11214h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            return this.f11214h == ((e) obj).f11214h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11214h ? 3 : 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int i() {
        return this.f11214h ? 1 : 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        return this.f11214h ? "true" : "false";
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 3;
    }

    @Override // p087q2.u
    public final k p() {
        return this.f11214h ? k.VALUE_TRUE : k.VALUE_FALSE;
    }
}
