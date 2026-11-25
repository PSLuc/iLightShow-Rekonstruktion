package p098s2;

import K.y;
import T1.e;
import com.fasterxml.jackson.databind.ser.std.AbstractC0532c;
import java.io.IOException;
import java.util.Set;
import p015c2.D;
import p015c2.E;
import p015c2.o;
import p093r2.b;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0532c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f12192q;

    public r(r rVar, y yVar, Object obj) {
        super(rVar, yVar, obj);
        this.f12192q = rVar.f12192q;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c f() {
        return this;
    }

    @Override // p015c2.o
    public final boolean isUnwrappingSerializer() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c j(Set set, Set set2) {
        return new r(this, set, set2);
    }

    @Override // p015c2.o
    /* JADX INFO: renamed from: k */
    public final AbstractC0532c withFilterId(Object obj) {
        return new r(this, this.f7715n, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c l(y yVar) {
        return new r(this, yVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c
    public final AbstractC0532c m(b[] bVarArr, b[] bVarArr2) {
        return new r(this, bVarArr, bVarArr2);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, e eVar, E e6) throws IOException {
        eVar.C(obj);
        if (this.f7715n != null) {
            d(obj, eVar, e6, false);
        } else if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0532c, p015c2.o
    public final void serializeWithType(Object obj, e eVar, E e6, p071n2.e eVar2) throws IOException {
        if (e6.f7226j.p(D.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            e6.P("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`", handledType());
            throw null;
        }
        eVar.C(obj);
        if (this.f7715n != null) {
            c(obj, eVar, e6, eVar2);
        } else if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for ".concat(handledType().getName());
    }

    @Override // p015c2.o
    public final o unwrappingSerializer(s sVar) {
        return new r(this, sVar);
    }

    public r(r rVar, Set set, Set set2) {
        super(rVar, set, set2);
        this.f12192q = rVar.f12192q;
    }

    public r(r rVar, b[] bVarArr, b[] bVarArr2) {
        super(rVar, bVarArr, bVarArr2);
        this.f12192q = rVar.f12192q;
    }

    public r(r rVar, y yVar) {
        super(rVar, yVar, rVar.f7713l);
        this.f12192q = rVar.f12192q;
    }

    public r(AbstractC0532c abstractC0532c, s sVar) {
        super(abstractC0532c, AbstractC0532c.g(abstractC0532c.i, sVar), AbstractC0532c.g(abstractC0532c.f7711j, sVar));
        this.f12192q = sVar;
    }
}
