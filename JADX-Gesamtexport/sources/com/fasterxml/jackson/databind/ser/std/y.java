package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Objects;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends P implements p093r2.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f7770h;

    public y(Class cls) {
        super(0, cls);
        this.f7770h = null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarY0;
        Object objD;
        if (interfaceC0472c != null) {
            p015c2.B bD = e6.f7226j.d();
            AbstractC0771g abstractC0771gE = interfaceC0472c.e();
            if (abstractC0771gE == null || (objD = bD.d(abstractC0771gE)) == null) {
                oVarY0 = null;
            } else {
                oVarY0 = e6.y0(abstractC0771gE, objD);
            }
        } else {
            oVarY0 = null;
        }
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        Boolean boolB = c0355qFindFormatOverrides != null ? c0355qFindFormatOverrides.b(EnumC0352n.f4955j) : null;
        p015c2.o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY0);
        if (oVarFindContextualConvertingSerializer == null) {
            oVarFindContextualConvertingSerializer = e6.i0(String.class, interfaceC0472c);
        }
        if (isDefaultSerializer(oVarFindContextualConvertingSerializer)) {
            return Objects.equals(boolB, this.f7770h) ? this : c(interfaceC0472c, boolB);
        }
        return new C0537h(e6.k(String.class), true, null, oVarFindContextualConvertingSerializer);
    }

    public abstract p015c2.o c(InterfaceC0472c interfaceC0472c, Boolean bool);

    public abstract p087q2.r d();

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", d());
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        Collection collection = (Collection) obj;
        return collection == null || collection.isEmpty();
    }

    public y(y yVar, Boolean bool) {
        super(yVar);
        this.f7770h = bool;
    }
}
