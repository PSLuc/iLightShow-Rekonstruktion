package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0547s extends Q implements p093r2.g {
    public final T1.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7760k;

    public AbstractC0547s(Class cls, T1.h hVar, String str) {
        super(cls, 2, (byte) 0);
        this.i = hVar;
        this.f7759j = str;
        this.f7760k = hVar == T1.h.f5208h || hVar == T1.h.i || hVar == T1.h.f5209j;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        boolean z5 = this.f7760k;
        T1.h hVar2 = this.i;
        if (z5) {
            visitIntFormat(bVar, hVar, hVar2);
        } else {
            visitFloatFormat(bVar, hVar, hVar2);
        }
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides == null || c0355qFindFormatOverrides.i.ordinal() != 8) {
            return this;
        }
        if (handledType() != BigDecimal.class) {
            return C0546q.f7757k;
        }
        r rVar = r.f7758j;
        return C0546q.f7756j;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        return createSchemaNode(this.f7759j, true);
    }
}
