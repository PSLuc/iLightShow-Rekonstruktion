package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends F {
    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(Long.TYPE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitArrayFormat(bVar, hVar, p059l2.a.i);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new D(this, interfaceC0472c, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final void f(Object obj, T1.e eVar, p015c2.E e6) {
        for (long j4 : (long[]) obj) {
            eVar.a0(j4);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", createSchemaNode("number", true));
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return ((long[]) obj).length == 0;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        long[] jArr = (long[]) obj;
        int i = 0;
        if (jArr.length == 1 && d(e6)) {
            int length = jArr.length;
            while (i < length) {
                eVar.a0(jArr[i]);
                i++;
            }
            return;
        }
        int length2 = jArr.length;
        eVar.getClass();
        T1.e.c(jArr.length, length2);
        eVar.n0(jArr);
        while (i < length2) {
            eVar.a0(jArr[i]);
            i++;
        }
        eVar.L();
    }
}
