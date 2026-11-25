package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends F {
    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(Float.TYPE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitArrayFormat(bVar, hVar, p059l2.a.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new B(this, interfaceC0472c, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final void f(Object obj, T1.e eVar, p015c2.E e6) {
        for (float f6 : (float[]) obj) {
            eVar.Y(f6);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", createSchemaNode("number"));
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return ((float[]) obj).length == 0;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        float[] fArr = (float[]) obj;
        int i = 0;
        if (fArr.length == 1 && d(e6)) {
            int length = fArr.length;
            while (i < length) {
                eVar.Y(fArr[i]);
                i++;
            }
            return;
        }
        eVar.n0(fArr);
        int length2 = fArr.length;
        while (i < length2) {
            eVar.Y(fArr[i]);
            i++;
        }
        eVar.L();
    }
}
