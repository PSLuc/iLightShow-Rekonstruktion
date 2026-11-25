package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0530a {
    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(Boolean.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitArrayFormat(bVar, hVar, p059l2.a.f10370k);
    }

    @Override // p093r2.f
    public final p093r2.f c(p071n2.e eVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new z(this, interfaceC0472c, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final void f(Object obj, T1.e eVar, p015c2.E e6) {
        for (boolean z5 : (boolean[]) obj) {
            eVar.J(z5);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", createSchemaNode("boolean"));
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return ((boolean[]) obj).length == 0;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        boolean[] zArr = (boolean[]) obj;
        int i = 0;
        if (zArr.length == 1 && d(e6)) {
            int length = zArr.length;
            while (i < length) {
                eVar.J(zArr[i]);
                i++;
            }
            return;
        }
        eVar.n0(zArr);
        int length2 = zArr.length;
        while (i < length2) {
            eVar.J(zArr[i]);
            i++;
        }
        eVar.L();
    }
}
