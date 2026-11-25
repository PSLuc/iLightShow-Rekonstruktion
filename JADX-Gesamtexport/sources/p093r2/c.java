package p093r2;

import K.y;
import T1.e;
import com.fasterxml.jackson.databind.ser.std.AbstractC0532c;
import java.io.IOException;
import java.util.Set;
import p015c2.E;
import p015c2.o;
import p098s2.b;
import p098s2.r;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0532c {
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c f() {
        return (this.f7715n == null && this.f7712k == null && this.f7713l == null) ? new b(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c j(Set set, Set set2) {
        return new c(this, set, set2);
    }

    @Override // p015c2.o
    /* JADX INFO: renamed from: k */
    public final AbstractC0532c withFilterId(Object obj) {
        return new c(this, this.f7715n, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c l(y yVar) {
        return new c(this, yVar, this.f7713l);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c m(b[] bVarArr, b[] bVarArr2) {
        return new c(this, bVarArr, bVarArr2);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, e eVar, E e6) throws IOException {
        if (this.f7715n != null) {
            eVar.C(obj);
            d(obj, eVar, e6, true);
            return;
        }
        eVar.p0(obj);
        if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
        eVar.M();
    }

    public final String toString() {
        return "BeanSerializer for ".concat(handledType().getName());
    }

    @Override // p015c2.o
    public final o unwrappingSerializer(s sVar) {
        return new r(this, sVar);
    }
}
