package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class E extends F {
    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(Short.TYPE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitArrayFormat(bVar, hVar, p059l2.a.f10369j);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new E(this, interfaceC0472c, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final void f(Object obj, T1.e eVar, p015c2.E e6) {
        for (short s6 : (short[]) obj) {
            eVar.Z(s6);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", createSchemaNode("integer"));
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return ((short[]) obj).length == 0;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        short[] sArr = (short[]) obj;
        int i = 0;
        if (sArr.length == 1 && d(e6)) {
            int length = sArr.length;
            while (i < length) {
                eVar.Z(sArr[i]);
                i++;
            }
            return;
        }
        eVar.n0(sArr);
        int length2 = sArr.length;
        while (i < length2) {
            eVar.Z(sArr[i]);
            i++;
        }
        eVar.L();
    }
}
