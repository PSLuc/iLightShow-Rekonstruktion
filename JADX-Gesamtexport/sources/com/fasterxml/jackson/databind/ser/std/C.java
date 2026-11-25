package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0530a {
    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(Integer.TYPE);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitArrayFormat(bVar, hVar, p059l2.a.f10369j);
    }

    @Override // p093r2.f
    public final p093r2.f c(p071n2.e eVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new C(this, interfaceC0472c, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final void f(Object obj, T1.e eVar, p015c2.E e6) {
        for (int i : (int[]) obj) {
            eVar.Z(i);
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
        return ((int[]) obj).length == 0;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        int[] iArr = (int[]) obj;
        int i = 0;
        if (iArr.length == 1 && d(e6)) {
            int length = iArr.length;
            while (i < length) {
                eVar.Z(iArr[i]);
                i++;
            }
            return;
        }
        int length2 = iArr.length;
        eVar.getClass();
        T1.e.c(iArr.length, length2);
        eVar.n0(iArr);
        while (i < length2) {
            eVar.Z(iArr[i]);
            i++;
        }
        eVar.L();
    }
}
