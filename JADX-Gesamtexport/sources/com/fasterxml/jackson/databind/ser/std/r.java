package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Q implements p093r2.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f7758j = new r(Number.class);
    public final boolean i;

    public r(Class cls) {
        super(cls, 2, (byte) 0);
        this.i = cls == BigInteger.class;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        if (this.i) {
            visitIntFormat(bVar, hVar, T1.h.f5209j);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(bVar, hVar, T1.h.f5212m);
        } else {
            bVar.getClass();
        }
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides == null || c0355qFindFormatOverrides.i.ordinal() != 8) {
            return this;
        }
        return handledType() == BigDecimal.class ? C0546q.f7756j : C0546q.f7757k;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        return createSchemaNode(this.i ? "integer" : "number", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            eVar.c0((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            eVar.d0((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            eVar.a0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            eVar.X(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            eVar.Y(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            eVar.Z(number.intValue());
        } else {
            eVar.b0(number.toString());
        }
    }
}
